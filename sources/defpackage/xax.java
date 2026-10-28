package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xax extends AnimatorListenerAdapter {
    final /* synthetic */ AnimatorSet a;
    final /* synthetic */ xay b;

    public xax(xay xayVar, AnimatorSet animatorSet) {
        this.a = animatorSet;
        this.b = xayVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.o = this.a;
    }
}
