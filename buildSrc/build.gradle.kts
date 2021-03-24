plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle:4.1.2")
    implementation("org.junit.platform:junit-platform-gradle-plugin:1.0.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
    implementation(gradleApi())
    implementation(localGroovy())
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
