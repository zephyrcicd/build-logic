package site.addzero.buildlogic.intellij

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


    }

}









