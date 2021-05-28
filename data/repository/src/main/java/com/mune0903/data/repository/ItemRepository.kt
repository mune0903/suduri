package com.mune0903.data.repository

interface ItemRepository {

    suspend fun fetchItemList()
}