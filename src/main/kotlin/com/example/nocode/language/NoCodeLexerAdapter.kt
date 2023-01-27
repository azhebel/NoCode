package com.example.nocode.language

import com.intellij.lexer.FlexAdapter


class NoCodeLexerAdapter : FlexAdapter(NoCodeLexer(null))