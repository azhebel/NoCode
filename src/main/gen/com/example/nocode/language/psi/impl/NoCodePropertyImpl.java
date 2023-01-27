// This is a generated file. Not intended for manual editing.
package com.example.nocode.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.example.nocode.language.psi.NoCodeTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.example.nocode.language.psi.*;

public class NoCodePropertyImpl extends ASTWrapperPsiElement implements NoCodeProperty {

  public NoCodePropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NoCodeVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NoCodeVisitor) accept((NoCodeVisitor)visitor);
    else super.accept(visitor);
  }

}
