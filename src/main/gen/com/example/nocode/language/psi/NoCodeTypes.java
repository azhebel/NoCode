// This is a generated file. Not intended for manual editing.
package com.example.nocode.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.example.nocode.language.psi.impl.*;

public interface NoCodeTypes {

  IElementType CODE = new NoCodeElementType("CODE");

  IElementType CHAR = new NoCodeTokenType("CHAR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CODE) {
        return new NoCodeCodeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
