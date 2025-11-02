package site.addzero.buildlogic.intellij

import org.gradle.kotlin.dsl.dependencies


plugins {
    id("org.jetbrains.intellij.platform.base")
    id("org.jetbrains.intellij.platform.migration")
    id("site.addzero.buildlogic.jvm.kotlin-convention")
//    id("site.addzero.buildlogic.intellij.intellij-repo")


}
repositories {
    mavenCentral()
    intellijPlatform {
        releases()
        marketplace()
        defaultRepositories()
    }
}


dependencies {
    intellijPlatform {
        local("/Applications/IntelliJ IDEA.app")
//        intellijIdeaUltimate("2025.2.3")
        bundledPlugins(
            "com.intellij.java", "org.jetbrains.kotlin"
        )

    }
}
