package com.mune0903.feature.search.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.mune0903.data.search.R
import com.mune0903.data.search.databinding.FragmentSearchBinding
import com.mune0903.feature.search.viewmodel.SearchViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding

    private val viewModel: SearchViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_search, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = "SearchFragment"

        viewModel.itemListLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is SearchViewModel.ItemUiState.Success -> {
                    it.itemList.forEach { item ->
                        Log.i(SearchFragment::class.java.simpleName, item.humanizeName)
                    }
                }
                is SearchViewModel.ItemUiState.Error -> {
                    Log.i(SearchFragment::class.java.simpleName, "Error")
                }
            }
        }
    }
}