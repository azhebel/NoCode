package com.example.nocode.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.example.nocode.language.psi.NoCodeTypes;
import com.intellij.psi.TokenType;

%%

%class NoCodeLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CHAR=\.
CODE=\.+

%state WAITING_VALUE

%%

[^]                                                         { return TokenType.BAD_CHARACTER; }