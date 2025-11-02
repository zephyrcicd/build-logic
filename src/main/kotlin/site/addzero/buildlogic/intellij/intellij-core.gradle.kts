package site.addzero.buildlogic.intellij

import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.repositories
import org.jetbrains.changelog.markdownToHTML


plugins {
    id("org.jetbrains.intellij.platform")
    id("org.jetbrains.changelog")
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

fun String.md2html(): String {
    val file = File(projectDir, this)
    if (!file.exists()) {
        file.parentFile.mkdirs()
        file.createNewFile()
    }
    val run = file.readText().run {
        markdownToHTML(this)
    }
    return run
}






intellijPlatform {
    pluginConfiguration {
        vendor {
            name = "zjarlin"
            email = "zjarlin@outlook.com"
        }
        description = "README.md".md2html()
        changeNotes = "CHANGELOG.md".md2html()
    }
}


