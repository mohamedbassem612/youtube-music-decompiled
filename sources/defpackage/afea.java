package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afea extends AnimatorListenerAdapter {
    final /* synthetic */ afeb a;

    public afea(afeb afebVar) {
        this.a = afebVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        afeb afebVar = this.a;
        afebVar.x();
        afebVar.d.start();
    }
}
