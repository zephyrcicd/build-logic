import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.the

plugins {
    kotlin("jvm")
}
val libs = the<LibrariesForLibs>()
kotlin {
    dependencies {
        implementation(libs.ksp.symbol.processing.api)
    }
}
