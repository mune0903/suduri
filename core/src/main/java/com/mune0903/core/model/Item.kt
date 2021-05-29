package com.mune0903.core.model

import kotlinx.serialization.*

@Serializable
data class Item(
    val angles: List<String>,
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
        val front: String,
        val left: String,
        @SerialName("left-foot") val leftFoot: String,
        @SerialName("left-sleeve") val leftSleeve: String,
        val outside: String,
        val right: String,
        @SerialName("right-foot") val rightFoot: String,
        @SerialName("right-sleeve") val rightSleeve: String
    )

    @Serializable
    data class PrintPlaceForExtraAngles(
        val anorak: Anorak,
        @SerialName("big-long-sleeve-t-shirt") val bigLongSleeveTShirt: BigLongSleeveTShirt,
        val koozie: Koozie,
        @SerialName("long-sleeve-t-shirt") val longSleeveTShirt: LongSleeveTShirt,
        @SerialName("organic-cotton-t-shirt") val organicCottonTShirt: OrganicCottonTShirt,
        @SerialName("t-shirt") val tShirt: TShirt,
        @SerialName("wash-t-shirt") val washTShirt: WashTShirt
    ) {

        @Serializable
        data class Anorak(
            @SerialName("back-wearing") val backWearing: String,
            @SerialName("front-wearing") val frontWearing: String
        )


        @Serializable
        data class BigLongSleeveTShirt(
            @SerialName("back-wearing-ladies") val backWearingLadies: String,
            @SerialName("back-wearing-mens") val backWearingMens: String,
            @SerialName("front-wearing-ladies") val frontWearingLadies: String,
            @SerialName("front-wearing-mens") val frontWearingMens: String
        )

        @Serializable
        data class Koozie(
            @SerialName("front-holding") val frontHolding: String
        )

        @Serializable
        data class LongSleeveTShirt(
            @SerialName("back-wearing") val backWearing: String,
            @SerialName("front-wearing") val frontWearing: String
        )

        @Serializable
        data class OrganicCottonTShirt(
            @SerialName("back-wearing") val backWearing: String,
            @SerialName("front-wearing") val frontWearing: String
        )

        @Serializable
        data class TShirt(
            @SerialName("front-wearing-ladies") val frontWearingLadies: String,
            @SerialName("front-wearing-mens") val frontWearingMens: String
        )

        @Serializable
        data class WashTShirt(
            @SerialName("back-wearing") val backWearing: String,
            @SerialName("front-wearing") val frontWearing: String
        )
    }

    @Serializable
    data class ProductImageUrlTemplates(
        val adjuster: String? = null,
        val back: String? = null,
        @SerialName("back-collar") val backCollar: String? = null,
        @SerialName("back-horizontal-folded") val backHorizontalFolded: String? = null,
        @SerialName("back-pocket") val backPocket: String? = null,
        @SerialName("back-vertical-folded") val backVerticalFolded: String? = null,
        @SerialName("back-wearing") val backWearing: String? = null,
        @SerialName("back-wearing-ladies") val backWearingLadies: String? = null,
        @SerialName("back-wearing-mens") val backWearingMens: String? = null,
        val bare: String? = null,
        val bonus: String? = null,
        val bottom: String? = null,
        @SerialName("bottom-printed") val bottomPrinted: String? = null,
        val bottom1: String? = null,
        val bottom2: String? = null,
        val buckle: String? = null,
        @SerialName("camera-hole") val cameraHole: String? = null,
        val capacity: String? = null,
        val capacity1: String? = null,
        val capacity2: String? = null,
        val car: String? = null,
        val cloth: String? = null,
        val collar: String? = null,
        val color: String? = null,
        val comfortable: String? = null,
        val corner: String? = null,
        val dots: String? = null,
        val drawer: String? = null,
        val edge: String? = null,
        val expanded: String? = null,
        val fabric: String? = null,
        val finish: String? = null,
        val flat: String? = null,
        val flexible: String? = null,
        val flipped: String? = null,
        val floor: String? = null,
        val fold1: String? = null,
        val fold2: String? = null,
        val folded: String? = null,
        val front: String? = null,
        @SerialName("front-collar") val frontCollar: String? = null,
        @SerialName("front-holding") val frontHolding: String? = null,
        @SerialName("front-horizontal-folded") val frontHorizontalFolded: String? = null,
        @SerialName("front-upside-down") val frontUpsideDown: String? = null,
        @SerialName("front-vertical-folded") val frontVerticalFolded: String? = null,
        @SerialName("front-wearing") val frontWearing: String? = null,
        @SerialName("front-wearing-ladies") val frontWearingLadies: String? = null,
        @SerialName("front-wearing-mens") val frontWearingMens: String? = null,
        @SerialName("full-body-ladies") val fullBodyLadies: String? = null,
        @SerialName("full-body-mens") val fullBodyMens: String? = null,
        val hand: String? = null,
        val hangers: String? = null,
        val heel: String? = null,
        val helmet: String? = null,
        val hold: String? = null,
        val holder: String? = null,
        val holding: String? = null,
        val hood: String? = null,
        val horizontal: String? = null,
        val inner: String? = null,
        val inside: String? = null,
        val insole: String? = null,
        val keyring: String? = null,
        val left: String? = null,
        @SerialName("left-sleeve") val leftSleeve: String? = null,
        val lining: String? = null,
        val magnet: String? = null,
        val mailbox: String? = null,
        @SerialName("main-pocket") val mainPocket: String? = null,
        val measure: String? = null,
        @SerialName("natural-sizes") val naturalSizes: String? = null,
        val neck: String? = null,
        @SerialName("neck-back") val neckBack: String? = null,
        val note: String? = null,
        @SerialName("opening-flap") val openingFlap: String? = null,
        val orgabits: String? = null,
        val outside: String? = null,
        val overview: String? = null,
        val packed: String? = null,
        val parts: String? = null,
        val pile: String? = null,
        val pin: String? = null,
        val pocket: String? = null,
        val pockets: String? = null,
        val print: String? = null,
        @SerialName("print-surface") val printSurface: String? = null,
        val printing: String? = null,
        @SerialName("put-plastic-bottles") val putPlasticBottles: String? = null,
        val right: String? = null,
        @SerialName("right-sleeve") val rightSleeve: String? = null,
        val rim: String? = null,
        @SerialName("room-horizontal") val roomHorizontal: String? = null,
        @SerialName("room-vertical") val roomVertical: String? = null,
        @SerialName("scratch-resistant") val scratchResistant: String? = null,
        val seal: String? = null,
        val sewing: String? = null,
        val shoulder: String? = null,
        val side: String? = null,
        val silhouette: String? = null,
        val size: String? = null,
        val size1: String? = null,
        val size2: String? = null,
        val sizes: String? = null,
        val sleeve: String? = null,
        val snap: String? = null,
        val softness: String? = null,
        val sole: String? = null,
        val stand: String? = null,
        val storage: String? = null,
        val strap: String? = null,
        val string: String? = null,
        val tag: String? = null,
        val texture: String? = null,
        val thermo: String? = null,
        val thermos: String? = null,
        val thickness: String? = null,
        val thread: String? = null,
        val toe: String? = null,
        val top: String? = null,
        val touch: String? = null,
        val transparent: String? = null,
        val upper: String? = null,
        val vertical: String? = null,
        val wall: String? = null,
        val wearing: String? = null,
        @SerialName("wearing-all-sizes-ladies") val wearingAllSizesLadies: String? = null,
        @SerialName("wearing-all-sizes-mens") val wearingAllSizesMens: String? = null,
        @SerialName("wearing-back") val wearingBack: String? = null,
        @SerialName("wearing-front") val wearingFront: String? = null,
        @SerialName("wearing-l") val wearingL: String? = null,
        @SerialName("wearing-ladies") val wearingLadies: String? = null,
        @SerialName("wearing-m") val wearingM: String? = null,
        @SerialName("wearing-mens") val wearingMens: String? = null,
        @SerialName("wearing-s") val wearingS: String? = null,
        @SerialName("wearing-side") val wearingSide: String? = null,
        @SerialName("wearing-waist") val wearingWaist: String? = null,
        val white: String? = null,
        val zipper: String? = null
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