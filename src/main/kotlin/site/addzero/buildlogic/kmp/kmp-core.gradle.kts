@file:OptIn(ExperimentalWasmDsl::class)

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.internal.platform.wasm.WasmPlatforms.wasmJs

val libs = the<LibrariesForLibs>()
plugins {
    id("org.jetbrains.kotlin.multiplatform")
}
kotlin {
    mingwX64()
//    linuxX64()
    jvm()

    wasmJs {
        nodejs()
    }
//    iosX64()
//    macosArm64()
    //todo 暂时不开发ios应用
//    iosArm64()


    //模拟器
//    iosSimulatorArm64()
//    macosX64()
//    watchosArm32()
//    watchosArm64()
//    watchosSimulatorArm64()
//    watchosX64()
//    tvosArm64()
//    tvosSimulatorArm64()
//    tvosX64()
//    mingwX64()
//    linuxX64()
//    linuxArm64()
}

