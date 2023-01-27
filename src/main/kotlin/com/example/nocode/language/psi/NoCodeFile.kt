package com.example.nocode.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.example.nocode.language.NoCodeFileType
import com.example.nocode.language.NoCodeLanguage


class NoCodeFile(viewProvider: FileViewProvider) :
    PsiFileBase(viewProvider, NoCodeLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return NoCodeFileType.INSTANCE
    }

    override fun toString(): String {
        return "NoCode File"
    }
}