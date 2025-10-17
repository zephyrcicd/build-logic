
import site.addzero.gradle.configureJUnitPlatform
import site.addzero.gradle.configureKotlinTestDependencies

plugins {
    kotlin("jvm")
}

// 配置Kotlin测试依赖和JUnit平台
configureKotlinTestDependencies()
configureJUnitPlatform()
