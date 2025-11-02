package site.addzero.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
abstract class BuildLogicPlugin : Plugin<Project> {

    override fun apply(project: Project) = Unit
}
