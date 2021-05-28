package com.mune0903.data.api.service

import com.mune0903.data.api.response.ItemResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface ItemService {

    @GET("v1/items")
    suspend fun getItems(@Header("Authorization") header: String): Response<ItemResponse>
}