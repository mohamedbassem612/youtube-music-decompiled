package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeme extends AnimatorListenerAdapter {
    final /* synthetic */ aemf a;

    public aeme(aemf aemfVar) {
        this.a = aemfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.u.a(aeml.c);
    }
}
