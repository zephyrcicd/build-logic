package site.addzero.buildlogic.intellij



plugins {
    id("site.addzero.buildlogic.intellij.intellij-platform-core")

}

dependencies {
    intellijPlatform {
        intellijIdeaUltimate("2025.2.3")
        bundledPlugins(
            "com.intellij.java", "org.jetbrains.kotlin"
        )

    }

}



