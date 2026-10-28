package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexj extends AnimatorListenerAdapter {
    final /* synthetic */ aexn a;

    public aexj(aexn aexnVar) {
        this.a = aexnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aexn aexnVar = this.a;
        aexnVar.A = 0;
        aexnVar.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        aexn aexnVar = this.a;
        aexnVar.B.g(0, false);
        aexnVar.A = 2;
        aexnVar.v = animator;
    }
}
