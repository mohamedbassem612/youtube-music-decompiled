package app.rive;

import app.rive.semantics.SemanticTreeModel;
import defpackage.atqp;
import defpackage.awmh;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;
import defpackage.awzd;
import defpackage.axat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveKt$RiveSemanticsEffects$3$1 extends awpk implements awqk {
    final /* synthetic */ SemanticTreeModel $semanticTree;
    final /* synthetic */ boolean $semanticsEnabled;
    final /* synthetic */ RiveTextureView $textureView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$RiveSemanticsEffects$3$1(RiveTextureView riveTextureView, boolean z, SemanticTreeModel semanticTreeModel, awoq awoqVar) {
        super(2, awoqVar);
        this.$textureView = riveTextureView;
        this.$semanticsEnabled = z;
        this.$semanticTree = semanticTreeModel;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveKt$RiveSemanticsEffects$3$1(this.$textureView, this.$semanticsEnabled, this.$semanticTree, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveKt$RiveSemanticsEffects$3$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            final RiveTextureView riveTextureView = this.$textureView;
            if (riveTextureView == null || !this.$semanticsEnabled) {
                return awmy.a;
            }
            axat versionFlow = this.$semanticTree.getVersionFlow();
            awzd awzdVar = new awzd() { // from class: app.rive.RiveKt$RiveSemanticsEffects$3$1.1
                @Override // defpackage.awzd
                public /* bridge */ /* synthetic */ Object emit(Object obj2, awoq awoqVar) {
                    return emit(((Number) obj2).intValue(), awoqVar);
                }

                public final Object emit(int i2, awoq awoqVar) {
                    riveTextureView.synchronizeSemantics();
                    return awmy.a;
                }
            };
            this.label = 1;
            if (versionFlow.collect(awzdVar, this) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        throw new awmh();
    }
}
