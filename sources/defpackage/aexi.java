package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexi extends AnimatorListenerAdapter {
    final /* synthetic */ aexn a;
    private boolean b;

    public aexi(aexn aexnVar) {
        this.a = aexnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aexn aexnVar = this.a;
        aexnVar.A = 0;
        aexnVar.v = null;
        if (this.b) {
            return;
        }
        aexnVar.B.g(4, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        aexn aexnVar = this.a;
        aexnVar.B.g(0, false);
        aexnVar.A = 1;
        aexnVar.v = animator;
        this.b = false;
    }
}
