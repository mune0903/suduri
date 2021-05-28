package dependencies

@Suppress("unused")
object Dep {
    object Versions {
        val kotlin = "1.5.0"
        val okHttp = "4.7.2"
        val timber = "4.7.1"
        val retrofit = "2.9.0"
        val groupie = "2.3.0"
        val lifecycle = "2.2.0"
        val recyclerView = "28.0.0"
        val glide = "4.11.0"
        val navigation = "2.3.5"
        val epoxy = "3.11.0"
        val koin = "2.1.5"
        val coroutine = "1.3.7"
        val appcompat = "1.3.0"
        val material = "1.3.0"
        val constraintlayout = "2.0.4"
        val hilt = "2.35.1"
    }

    object AndroidX {
        val viewModel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycle}}"
        val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        val ktx = "androidx.core:core-ktx:${Versions.kotlin}"
        val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        val material = "com.google.android.material:material:${Versions.material}"
        val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
        val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        val navigationKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    }

    object Kotlin {
        val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
        val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        val serialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
        val runtime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0"
    }

    object DaggerHilt {
        val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        val compiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        val plugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    }

    object OkHttp {
        val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    }

    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val groupie = "com.xwray:groupie:${Versions.groupie}"
    val groupieKotlin = "com.xwray:groupie-kotlin-android-extensions:${Versions.groupie}"
    val groupieDatabinding = "com.xwray:groupie-databinding:${Versions.groupie}"
    val recyclerView = "com.android.support:recyclerview-v7:${Versions.recyclerView}"
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glideAnnotation = "com.github.bumptech.glide:compiler:${Versions.glide}"
    val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    val navigationGradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    val epoxy = "com.airbnb.android:epoxy:${Versions.epoxy}"
    val epoxyDataBinding = "com.airbnb.android:epoxy-databinding:${Versions.epoxy}"
    val epoxyProcessor = "com.airbnb.android:epoxy-processor:${Versions.epoxy}"
    val koinAndroid = "org.koin:koin-android:${Versions.koin}"
    val koinAndroidScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"
}