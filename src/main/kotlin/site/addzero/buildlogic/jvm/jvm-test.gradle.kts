import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.the

plugins {
    kotlin("jvm")
}
val libs = the<LibrariesForLibs>()

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(libs.junit)
}
