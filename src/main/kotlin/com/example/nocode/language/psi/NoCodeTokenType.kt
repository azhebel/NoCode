package com.example.nocode.language.psi

import com.intellij.psi.tree.IElementType
import com.example.nocode.language.NoCodeLanguage
import org.jetbrains.annotations.NonNls


class NoCodeTokenType(debugName: @NonNls String) :
    IElementType(debugName, NoCodeLanguage.INSTANCE) {
    override fun toString(): String {
        return "NoCodeTokenType." + super.toString()
    }
}