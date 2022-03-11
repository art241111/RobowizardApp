import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version "1.4.0"
}

group = "ru.geraimovAV"
version = "1.0"

kotlin {
    jvm("desktop")
//    android()

    js(IR) {
        browser()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation(kotlin("stdlib"))

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
                implementation("io.ktor:ktor-client-core:1.6.7")
                implementation("io.ktor:ktor-client-json:1.6.7")
                implementation("io.ktor:ktor-client-serialization:1.6.7")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val jsMain by getting {
            dependencies {
                val kotlinVersion = "1.5.31"
                val serializationVersion = "1.3.0"
                val ktorVersion = "1.6.7"
                val logbackVersion = "1.2.3"
                val reactVersion = "17.0.2-pre.265-kotlin-1.5.31"
                val kmongoVersion = "4.3.0"

                implementation("io.ktor:ktor-client-js:$ktorVersion")
            }
        }
    }
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}