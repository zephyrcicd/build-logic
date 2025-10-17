import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.`java-library`
import org.gradle.kotlin.dsl.the
import site.addzero.gradle.*

plugins {
    `java-library`
}

val the = the<LibrariesForLibs>()
val javaVersion = the.versions.jdk.get()
configureWithSourcesJar()
configUtf8()
configureJavaCompatibility(javaVersion)
configJavaToolChain(javaVersion)
configJunitPlatform()
