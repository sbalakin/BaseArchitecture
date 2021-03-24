import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.project
import org.jetbrains.kotlin.gradle.internal.AndroidExtensionsExtension
import org.jetbrains.kotlin.gradle.internal.CacheImplementation

fun Project.setupModule() {
    extensions.findByType<AndroidExtensionsExtension>()?.apply {
        isExperimental = true
    }

    extensions.configure<LibraryExtension> {
        setupConfig(name)
    }
}

fun DependencyHandlerScope.setupFeatureDependencies() {
    "implementation"(Libs.androidx_startup)
    "implementation"(Libs.fragment_ktx)
    "implementation"(Libs.androidx_core_ktx)
    "implementation"(Libs.androidx_appcompat)
    "implementation"(Libs.google_material)
    "implementation"(Libs.navigation_fragment_ktx)
    "implementation"(Libs.navigation_ui_ktx)
    "implementation"(Libs.constraint_layout)

    "implementation"(project(":core:di"))
    "implementation"(project(":core:view"))
    "implementation"(project(":core:common"))
}

private fun LibraryExtension.setupConfig(moduleName: String) {
    compileSdkVersion(Apps.compileSdkVersion)
    buildToolsVersion(Apps.buildToolsVersion)

    defaultConfig {
        minSdkVersion(Apps.minSdkVersion)
        targetSdkVersion(Apps.targetSdkVersion)
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        manifestPlaceholders["moduleName"] = moduleName
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        this.viewBinding = true
    }
}