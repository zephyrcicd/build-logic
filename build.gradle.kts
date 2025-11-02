plugins {
    `kotlin-dsl`
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
    gradlePluginPortal()
}

gradlePlugin {
    plugins {
        register(rootDir.name) {
            id = rootDir.name
            implementationClass = "site.addzero.gradle.BuildLogicPlugin"
        }
    }
}


dependencies {
    gradleApi()
    compileOnly(files(libs.javaClass.superclass.protectionDomain.codeSource.location))


    ////////////jvm/////////////////////
//    implementation(libs.addzero.gradle.tool)
    implementation(libs.com.diffplug.spotless.com.diffplug.spotless.gradle.plugin)

    implementation(libs.gradlePlugin.dokka)
    implementation(libs.gradlePlugin.kotlin)
    implementation(libs.org.graalvm.buildtools.native.gradle.plugin)

    ////////////////spring//////////////
    implementation(libs.gradlePlugin.dependencyManagement)
    implementation(libs.gradlePlugin.springBoot)
    implementation(libs.gradlePlugin.kotlinSpring)

    /////////////////intellij///////////////
    implementation("org.jetbrains.intellij.platform:org.jetbrains.intellij.platform.gradle.plugin:2.10.3")
    implementation("org.jetbrains.changelog:org.jetbrains.changelog.gradle.plugin:2.4.0")
    implementation("org.jetbrains.intellij.platform.migration:org.jetbrains.intellij.platform.migration.gradle.plugin:2.10.3")
    implementation("org.jetbrains.intellij.platform.settings:org.jetbrains.intellij.platform.settings.gradle.plugin:2.10.3")
    implementation("org.jetbrains.intellij.platform.base:org.jetbrains.intellij.platform.base.gradle.plugin:2.10.3")
    implementation("org.jetbrains.intellij.platform.module:org.jetbrains.intellij.platform.module.gradle.plugin:2.10.3")
    /////////////////kmp///////////////
    implementation(libs.gradlePlugin.jetbrainsCompose)
    implementation(libs.gradlePlugin.composeCompiler)
    implementation(libs.gradlePlugin.kotlinSerialization)

    implementation(libs.gradlePlugin.buildkonfig)
    implementation(libs.gradlePlugin.buildkonfig.cp)

    implementation(libs.gradlePlugin.ktorfit)
    implementation(libs.gradlePlugin.android)


    ///////////////ksp///////////
    implementation(libs.gradlePlugin.ksp)


}
