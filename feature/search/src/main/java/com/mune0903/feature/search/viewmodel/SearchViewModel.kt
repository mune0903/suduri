package com.mune0903.feature.search.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mune0903.core.model.Item
import com.mune0903.data.repository.ItemRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: ItemRepository
) : ViewModel() {

    private val _itemListLiveData = MutableLiveData<ItemUiState>()
    val itemListLiveData: LiveData<ItemUiState> = _itemListLiveData

    init {
        fetchItemList()
    }

    fun fetchItemList() {
        viewModelScope.launch {
            repository.fetchItemList()
                .onSuccess {
                    _itemListLiveData.value = ItemUiState.Success(
                        itemList = it
                    )
                }
                .onFailure {
                    _itemListLiveData.value = ItemUiState.Error(
                        exception = it
                    )
                }
        }
    }

    sealed class ItemUiState {
        data class Success(val itemList: List<Item>): ItemUiState()
        data class Error(val exception: Throwable): ItemUiState()
    }
}