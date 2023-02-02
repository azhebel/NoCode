package com.example.nocode.project

import com.example.nocode.language.NoCodeIcons
import com.intellij.ide.util.projectWizard.WebProjectTemplate
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class NoCodeProjectGenerator : WebProjectTemplate<Any>() {
    override fun getDescription() = "No Code project with no code"
    override fun getName() = "No Code Project"
    override fun getLogo() = NoCodeIcons.FILE

    override fun generateProject(project: Project, baseDir: VirtualFile, settings: Any, module: Module) {
        return
    }
}