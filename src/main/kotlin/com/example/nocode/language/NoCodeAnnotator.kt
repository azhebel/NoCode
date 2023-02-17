package com.example.nocode.language

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement


class NoCodeAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        holder.newAnnotation(HighlightSeverity.INFORMATION, "Is this code?")
            .range(element.textRange)
            .withFix(NoCodeRemoveCodeQuickFix())
            .tooltip("Code is not allowed")
            .create()
    }
}