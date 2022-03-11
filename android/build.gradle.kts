plugins {
    id("org.jetbrains.compose") version "1.0.1-rc2"
    id("com.android.application")
    kotlin("android")
}

group = "ru.geraimovAV"
version = "1.0"

repositories {
    google()
    jcenter()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(project(":common:ui"))
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "ru.geraimovAV.android"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}