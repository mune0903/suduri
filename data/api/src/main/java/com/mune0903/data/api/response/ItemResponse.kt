package com.mune0903.data.api.response

import com.mune0903.core.model.Item
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ItemResponse(
    @SerialName("items") val itemList: List<Item>
)
