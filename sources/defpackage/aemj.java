package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aemj extends AnimatorListenerAdapter {
    final /* synthetic */ aemn a;

    public aemj(aemn aemnVar) {
        this.a = aemnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.u.a(aeml.d);
    }
}
