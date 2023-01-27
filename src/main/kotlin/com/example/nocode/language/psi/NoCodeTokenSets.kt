package com.example.nocode.language.psi

import com.intellij.psi.tree.TokenSet


interface NoCodeTokenSets {
    companion object {
        val IDENTIFIERS = TokenSet.create(NoCodeTypes.KEY)
        val COMMENTS = TokenSet.create(NoCodeTypes.COMMENT)
    }
}