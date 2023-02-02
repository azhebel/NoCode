package com.example.nocode.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class NoCodeFileType : LanguageFileType(NoCodeLanguage.INSTANCE) {
    override fun getName() = "No Code File"
    override fun getDescription() = "No Code file"
    override fun getDefaultExtension() = "nocode"
    override fun getIcon() = NoCodeIcons.FILE

    companion object {
        val INSTANCE: NoCodeFileType = NoCodeFileType()
    }
}