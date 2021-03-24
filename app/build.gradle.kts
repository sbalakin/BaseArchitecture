import java.nio.file.Files
import java.nio.file.FileSystems
import java.util.stream.Collectors

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(Apps.compileSdkVersion)
    buildToolsVersion(Apps.buildToolsVersion)

    defaultConfig {
        applicationId = "ru.winelab"
        minSdkVersion(Apps.minSdkVersion)
        targetSdkVersion(Apps.targetSdkVersion)
        versionCode = Apps.versionCode
        versionName = Apps.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {

    implementation(Libs.kotlin_stdlib)
    implementation(Libs.androidx_core_ktx)
    implementation(Libs.fragment_ktx)
    implementation(Libs.androidx_appcompat)
    implementation(Libs.androidx_startup)
    implementation(Libs.constraint_layout)
    implementation(Libs.google_material)

    implementation(Libs.navigation_fragment_ktx)
    implementation(Libs.navigation_ui_ktx)

    implementation(Libs.dagger2)
    kapt(Libs.dagger2_process)

    implementation(Libs.glide)

    implementation(project(":core:db-impl"))
    implementation(project(":core:db-api"))
    implementation(project(":core:network-api"))
    implementation(project(":core:network-impl"))
    implementation(project(":core:navigation-api"))
    implementation(project(":core:navigation-impl"))
    implementation(project(":feature:catalog-impl"))
    implementation(project(":feature:catalog-api"))

}
