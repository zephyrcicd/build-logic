@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    id("kmp")
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
