package site.addzero.buildlogic.intellij

import gradle.kotlin.dsl.accessors._8b2ea920df6905304aae6ddf4444876f.intellijPlatform
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.repositories
import org.jetbrains.changelog.markdownToHTML


plugins {
    id("org.jetbrains.intellij.platform")
    id("site.addzero.buildlogic.jvm.kotlin-convention")


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
        intellijIdeaUltimate("2025.2.3")
        bundledPlugins(
            "com.intellij.java", "org.jetbrains.kotlin"
        )

    }
}









