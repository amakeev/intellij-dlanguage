package net.masterthought.dlanguage.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import net.masterthought.dlanguage.psi.DlangIdentifier;
import net.masterthought.dlanguage.psi.DLanguageIdentifierChain;
import net.masterthought.dlanguage.psi.DlangVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.masterthought.dlanguage.psi.DlangTypes.OP_DOT;


public class DLanguageIdentifierChainImpl extends ASTWrapperPsiElement implements DLanguageIdentifierChain {
    public DLanguageIdentifierChainImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DlangVisitor visitor) {
        visitor.visitIdentifierChain(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DlangVisitor) accept((DlangVisitor) visitor);
        else super.accept(visitor);
    }

    @NotNull
    public List<DlangIdentifier> getIdentifiers() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, DlangIdentifier.class);
    }

    @NotNull
    public List<PsiElement> getOP_DOTs() {
        return findChildrenByType(OP_DOT);
    }

}