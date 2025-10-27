package site.addzero.buildlogic.jb

import org.jetbrains.changelog.markdownToHTML
import org.jetbrains.intellij.platform.gradle.tasks.RunIdeTask


plugins {
    id("org.jetbrains.intellij.platform")
//    id("org.jetbrains.changelog")
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
    implementation("com.jetbrains.intellij.platform:core:+")
}

