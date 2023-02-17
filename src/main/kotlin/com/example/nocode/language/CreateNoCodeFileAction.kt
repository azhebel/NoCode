package com.example.nocode.language

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class CreateNoCodeFileAction : CreateFileFromTemplateAction("No Code File",
    "Creates a No Code file",
    NoCodeFileType.INSTANCE.icon), DumbAware {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder
            .setTitle("New No Code File")
            .addKind("Empty No Code File", NoCodeFileType.INSTANCE.icon, "empty")
    }

    override fun getActionName(directory: PsiDirectory?, newName: String, templateName: String?) = "Create Empty No Code File"
}