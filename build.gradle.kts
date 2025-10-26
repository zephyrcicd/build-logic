plugins {
    `kotlin-dsl`
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    gradleApi()
    compileOnly(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    compileOnly(libs.gradlePlugin.jetbrainsCompose)
    compileOnly(libs.gradlePlugin.kotlinSerialization)
    implementation(libs.gradlePlugin.dokka)
    implementation(libs.gradlePlugin.kotlin)
    implementation(libs.org.graalvm.buildtools.native.gradle.plugin)
    implementation(libs.gradlePlugin.dependencyManagement)
    implementation(libs.gradlePlugin.springBoot)
    implementation(libs.gradlePlugin.kotlinSpring)

     implementation("org.jetbrains.intellij.platform:org.jetbrains.intellij.platform.gradle.plugin:2.10.2")
     implementation("org.jetbrains.changelog:org.jetbrains.changelog.gradle.plugin:2.4.0")
}
