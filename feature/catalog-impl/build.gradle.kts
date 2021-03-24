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
    implementation(Libs.constraint_layout)

    implementation(Libs.navigation_fragment_ktx)
    implementation(Libs.navigation_ui_ktx)

    implementation(Libs.dagger2)
    kapt(Libs.dagger2_process)

    implementation(Libs.retrofit)
    implementation(Libs.retrofit_gson)
    implementation(Libs.retrofit_interceptor)

    implementation(Libs.coroutines)

    kapt(Libs.room_compiler)
    implementation(Libs.room_ktx)
    implementation(Libs.room_runtime)

    implementation(project(":feature:catalog-api"))
    implementation(project(":core:navigation-api"))
    implementation(project(":core:network-api"))
    implementation(project(":core:db-api"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}