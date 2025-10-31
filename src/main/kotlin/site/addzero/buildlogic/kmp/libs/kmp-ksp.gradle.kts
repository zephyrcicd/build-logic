import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.the

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}
val libs = the<LibrariesForLibs>()


kotlin {
    jvm()
    sourceSets {
        commonMain.dependencies {
            implementation(libs.ksp.symbol.processing.api)
        }
    }
}


