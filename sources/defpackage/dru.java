package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dru extends AnimatorListenerAdapter {
    final /* synthetic */ afv a;
    final /* synthetic */ dsa b;

    public dru(dsa dsaVar, afv afvVar) {
        this.b = dsaVar;
        this.a = afvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.j.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.j.add(animator);
    }
}
