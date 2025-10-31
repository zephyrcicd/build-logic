@file:OptIn(ExperimentalWasmDsl::class)

import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()



plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    sourceSets {
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}
