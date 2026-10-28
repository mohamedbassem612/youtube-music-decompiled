package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vme extends AnimatorListenerAdapter {
    final /* synthetic */ vmo a;
    final /* synthetic */ aepb b;

    public vme(aepb aepbVar, vmo vmoVar) {
        this.a = vmoVar;
        this.b = aepbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vmi vmiVar = (vmi) this.b.b;
        vmiVar.b = false;
        vmiVar.a = this.a;
    }
}
