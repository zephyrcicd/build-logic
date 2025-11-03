import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.the

plugins {
    id("kmp-json")

}
val libs = the<LibrariesForLibs>()
kotlin {

    sourceSets {
        commonMain.dependencies {
            implementation("site.addzero:tool-json:${libs.versions.addzero.lib.get()}")
        }
    }

}
