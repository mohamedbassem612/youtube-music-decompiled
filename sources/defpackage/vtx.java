package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vtx extends AnimatorListenerAdapter {
    final /* synthetic */ awku a;
    final /* synthetic */ tut b;

    public vtx(awku awkuVar, tut tutVar) {
        this.a = awkuVar;
        this.b = tutVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.kn();
        this.b.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.kn();
        this.b.a();
    }
}
