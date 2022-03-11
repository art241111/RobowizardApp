import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
}

group = "ru.geraimovAV"
version = "1.0"

repositories {
    jcenter()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(project(":common:data"))

    implementation("io.ktor:ktor-server-netty:1.6.7")
    implementation("io.ktor:ktor-html-builder:1.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.2")

    implementation("io.ktor:ktor-serialization:1.6.7")
    implementation("io.ktor:ktor-server-core:1.6.7")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("org.litote.kmongo:kmongo-coroutine-serialization:4.3.0")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("ServerKt")
}
