// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;

public interface DLanguageForeachStatement extends PsiElement {

  @NotNull
  DLanguageForeach getForeach();

  @NotNull
  DLanguageForeachAggregate getForeachAggregate();

  @NotNull
  DLanguageForeachTypeList getForeachTypeList();

  @NotNull
  DLanguageStatement getStatement();

  @NotNull
  PsiElement getOpParLeft();

  @NotNull
  PsiElement getOpParRight();

  @NotNull
  PsiElement getOpScolon();

  boolean processDeclarations(PsiScopeProcessor processor, ResolveState state, PsiElement lastParent, PsiElement place);

}
