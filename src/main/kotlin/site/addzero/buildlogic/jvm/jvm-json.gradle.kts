import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.the

plugins {
    kotlin("plugin.serialization")
    kotlin("jvm")
}
val libs = the<LibrariesForLibs>()

dependencies {
    implementation(libs.kotlinx.serialization.json)
}
