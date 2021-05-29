package com.mune0903.data.api.service

import com.mune0903.data.api.response.ItemResponse
import retrofit2.Response
import retrofit2.http.GET

interface ItemService {

    @GET("v1/items")
    suspend fun getItems(): Response<ItemResponse>
}