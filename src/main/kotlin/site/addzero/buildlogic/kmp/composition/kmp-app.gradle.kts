@file:OptIn(ExperimentalWasmDsl::class)

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.internal.platform.wasm.WasmPlatforms.wasmJs

val libs = the<LibrariesForLibs>()
plugins {
    id("kmp-compose-common")
    id("kmp-desktop")
    id("kmp-ios-app")
    id("kmp-wasm")
    id("kmp-android-app")
    id("kmp-test")
//    alias(libs.plugins.composeHotReload)
//    id("org.jetbrains.compose.hot-reload")
}
kotlin {

       wasmJs {
        outputModuleName.set("composeApp")
        binaries.executable()
    }

}
