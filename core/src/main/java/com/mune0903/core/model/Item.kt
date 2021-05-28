package com.mune0903.core.model

import kotlinx.serialization.*

@Serializable
data class Item(
    val angles: List<Int>,
    val availablePrintPlaces: List<String>,
    val defaultPrintPlace: String,
    val displayOrder: Int,
    val essentialAngles: List<String>,
    val extraAngles: List<String>,
    val humanizeName: String,
    val iconUrls: IconUrls,
    val id: Int,
    val imageDescriptions: List<String>,
    val isMultiPrintable: Boolean,
    val name: String,
    val printPlaceDisplayNames: PrintPlaceDisplayNames,
    val printPlaceForExtraAngles: PrintPlaceForExtraAngles,
    val productImageUrlTemplates: ProductImageUrlTemplates,
    val variants: List<Variant>
) {
    @Serializable
    data class IconUrls(
        val png: String
    )

    @Serializable
    data class PrintPlaceDisplayNames(
        val back: String,
        val front: String
    )

    @Serializable
    data class PrintPlaceForExtraAngles(
        @SerialName("t-shirt")
        val tShirt: TShirt
    ) {

        @Serializable
        data class TShirt(
            @SerialName("front-wearing-ladies")
            val frontWearingLadies: String,
            @SerialName("front-wearing-mens")
            val frontWearingMens: String
        )
    }

    @Serializable
    data class ProductImageUrlTemplates(
        val front: String
    )

    @Serializable
    data class Variant(
        val color: Color,
        val enabled: Boolean,
        val exemplary: Boolean,
        val id: Int,
        val isDarkColor: Boolean,
        val isLightColor: Boolean,
        val price: Int,
        val priceWithTax: Int,
        val printPlaces: List<PrintPlace>,
        val size: Size
    ) {

        @Serializable
        data class Color(
            val displayName: String,
            val id: Int,
            val name: String,
            val rgb: String
        )

        @Serializable
        data class PrintPlace(
            val id: Int,
            val itemVariantId: Int,
            val place: String,
            val price: Int
        )

        @Serializable
        data class Size(
            val displayName: String,
            val id: Int,
            val name: String
        )
    }
}