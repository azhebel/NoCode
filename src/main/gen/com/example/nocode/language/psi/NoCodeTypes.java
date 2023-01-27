// This is a generated file. Not intended for manual editing.
package com.example.nocode.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.example.nocode.language.psi.impl.*;

public interface NoCodeTypes {

  IElementType PROPERTY = new NoCodeElementType("PROPERTY");

  IElementType ITEM_ = new NoCodeTokenType("item_");
  IElementType KEY = new NoCodeTokenType("KEY");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new NoCodePropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
