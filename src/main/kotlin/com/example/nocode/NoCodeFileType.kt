package com.example.nocode

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class NoCodeFileType : LanguageFileType(NoCodeLanguage.INSTANCE) {
    override fun getName(): String {
        return "No Code File"
    }

    override fun getDescription(): String {
        return "No Code file"
    }

    override fun getDefaultExtension(): String {
        return "nocode"
    }

    override fun getIcon(): Icon? {
        return NoCodeIcons.FILE
    }

    companion object {
        val INSTANCE: NoCodeFileType = NoCodeFileType()
    }
}