package site.addzero.buildlogic.intellij

import org.jetbrains.changelog.markdownToHTML
import org.jetbrains.intellij.platform.gradle.tasks.RunIdeTask


plugins {
    id("site.addzero.buildlogic.intellij.intellij-core")
    id("org.jetbrains.changelog")

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


tasks {
    patchPluginXml {
        sinceBuild.set("242")
        untilBuild.set("262.*")
    }
    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}





tasks.named<RunIdeTask>("runIde") {
    jvmArgumentProviders += CommandLineArgumentProvider {
        listOf("-Didea.kotlin.plugin.use.k2=true")
    }
}
