@file:OptIn(ExperimentalWasmDsl::class)
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
plugins {
    id("org.jetbrains.kotlin.multiplatform")
}
kotlin{

    sourceSets {
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }

}
