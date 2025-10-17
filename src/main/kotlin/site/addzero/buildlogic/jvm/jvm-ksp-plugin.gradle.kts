import site.addzero.gradle.constant.Disposable.KSP_BUILD_DIR_JVM

plugins {
    id("com.google.devtools.ksp")
    kotlin("jvm")
}

kotlin {
    sourceSets {
        main {
            kotlin.srcDir(KSP_BUILD_DIR_JVM)
        }
    }

}
