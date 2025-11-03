package site.addzero.buildlogic.intellij

import io.spring.gradle.dependencymanagement.org.eclipse.sisu.launch.SisuExtensions.local
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.intellij.platform.gradle.extensions.intellijPlatform


plugins {
    id("org.jetbrains.intellij.platform.base")
//    id("org.jetbrains.intellij.platform.migration")
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
//        local("/Applications/IntelliJ IDEA.app")
        intellijIdeaUltimate("2025.2.3")
        bundledPlugins(
            "com.intellij.java", "org.jetbrains.kotlin"
        )

    }
}
