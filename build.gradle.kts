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
    implementation("org.jetbrains.intellij.platform:org.jetbrains.intellij.platform.gradle.plugin:2.10.2")
    implementation("org.jetbrains.changelog:org.jetbrains.changelog.gradle.plugin:2.4.0")


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
