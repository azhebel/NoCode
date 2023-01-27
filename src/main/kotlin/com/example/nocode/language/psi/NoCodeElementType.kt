package com.example.nocode.language.psi

import com.example.nocode.language.NoCodeLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls


class NoCodeElementType(debugName: @NonNls String) :
    IElementType(debugName, NoCodeLanguage.INSTANCE) {

}