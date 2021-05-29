package com.mune0903.data.repository

import com.mune0903.core.model.Item
import com.mune0903.data.api.service.ItemService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ItemRepositoryImpl @Inject constructor(
    private val service: ItemService
) : ItemRepository {

    override suspend fun fetchItemList(): Result<List<Item>> = withContext(Dispatchers.IO) {
        val response = service.getItems()
        val body = response.body()
        if (response.isSuccessful && body != null) {
            Result.success(body.itemList)
        } else {
            Result.failure(Throwable())
        }
    }
}