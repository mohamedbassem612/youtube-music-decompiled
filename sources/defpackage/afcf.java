package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afcf extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ afcr b;

    public afcf(afcr afcrVar, int i) {
        this.a = i;
        this.b = afcrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.f(this.a);
    }
}
