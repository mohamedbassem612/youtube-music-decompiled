package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aewy extends AnimatorListenerAdapter {
    final /* synthetic */ aexo a;
    private boolean b;

    public aewy(aexo aexoVar) {
        this.a = aexoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
        this.a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aexo aexoVar = this.a;
        aexoVar.f();
        if (this.b) {
            return;
        }
        aexoVar.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.g(animator);
        this.b = false;
    }
}
