package site.addzero.buildlogic.intellij

import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.changelog.markdownToHTML


plugins {
    id("org.jetbrains.intellij.platform.base")
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
