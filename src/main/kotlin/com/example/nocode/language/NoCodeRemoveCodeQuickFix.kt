package com.example.nocode.language

import com.intellij.codeInsight.intention.impl.BaseIntentionAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiFile
import com.intellij.util.IncorrectOperationException


class NoCodeRemoveCodeQuickFix : BaseIntentionAction() {
    override fun getText() = "Remove this nonsense"
    override fun getFamilyName() = "No code"
    override fun isAvailable(project: Project, editor: Editor, file: PsiFile) = true

    @Throws(IncorrectOperationException::class)
    override fun invoke(project: Project, editor: Editor, file: PsiFile) {
        PsiDocumentManager.getInstance(project).getDocument(file)?.setText("")

    }
}