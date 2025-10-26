package site.addzero.buildlogic.jb

import org.jetbrains.changelog.markdownToHTML
import org.jetbrains.intellij.platform.gradle.tasks.RunIdeTask

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
//        testFramework(TestFrameworkType.Platform)
        bundledPlugins(
            "com.intellij.java", "org.jetbrains.kotlin"
//            , "org.intellij.groovy"  // Correct Groovy plugin ID
        )

    }

    // 引用拆分后的模块
//    implementation(project(":modules:autoddl-starter"))
//    implementation(project(":modules:intention-actions"))
//    implementation(project(":modules:code-actions"))
//    implementation(project(":modules:utilities"))
//    implementation(project(":modules:ai-assistant"))
//    implementation(project(":modules:core-utils"))
//    implementation(project(":modules:settings"))
//    implementation(project(":modules:tool-windows"))
//    implementation(project(":modules:main-module"))

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
