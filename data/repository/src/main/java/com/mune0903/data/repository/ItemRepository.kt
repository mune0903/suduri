package com.mune0903.data.repository

import com.mune0903.core.model.Item

interface ItemRepository {

    suspend fun fetchItemList(): Result<List<Item>>
}