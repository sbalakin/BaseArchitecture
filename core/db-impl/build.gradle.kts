plugins {
    id("com.android.library")
    id("kotlin-android")
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

    implementation(Libs.dagger2)
    kapt(Libs.dagger2_process)

    implementation(Libs.retrofit)
    implementation(Libs.retrofit_gson)

    implementation(project(":core:db-api"))
}