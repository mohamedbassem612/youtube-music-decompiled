package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jke extends AnimatorListenerAdapter {
    final /* synthetic */ jkf a;

    public jke(jkf jkfVar) {
        this.a = jkfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setScaleY(1.0f);
    }
}
