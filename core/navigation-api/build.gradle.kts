plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    kotlin("android")
    kotlin("kapt")
}

setupModule()

dependencies {

    implementation(Libs.kotlin_stdlib)
    implementation(Libs.androidx_core_ktx)
    implementation(Libs.androidx_appcompat)
    implementation(Libs.androidx_startup)
    implementation(Libs.google_material)

    implementation(Libs.navigation_ui_ktx)
    implementation(Libs.navigation_fragment_ktx)
}