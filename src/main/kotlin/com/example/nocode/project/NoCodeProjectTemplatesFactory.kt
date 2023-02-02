package com.example.nocode.project

import com.example.nocode.language.NoCodeIcons
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.platform.ProjectTemplate
import com.intellij.platform.ProjectTemplatesFactory
import javax.swing.Icon

class NoCodeProjectTemplatesFactory : ProjectTemplatesFactory() {
    override fun getGroups() =
        arrayOf("No Code")

    override fun createTemplates(group: String?, context: WizardContext) =
        arrayOf(NoCodeProjectGenerator())

    override fun getGroupIcon(group: String?) = NoCodeIcons.FILE
}