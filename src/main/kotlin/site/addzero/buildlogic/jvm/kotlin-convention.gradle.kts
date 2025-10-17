package site.addzero.buildlogic.jvm

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.the

import site.addzero.gradle.configureKotlinCompatibility
import site.addzero.gradle.configureKotlinToolchain

plugins {
    kotlin("jvm")
    id("site.addzero.buildlogic.jvm.java-convention")
}
val the = the<LibrariesForLibs>()
val javaVersion = the.versions.jdk.get()
configureKotlinCompatibility()
configureKotlinToolchain(javaVersion)
