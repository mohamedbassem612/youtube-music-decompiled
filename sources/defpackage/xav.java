package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xav extends AnimatorListenerAdapter {
    final /* synthetic */ xay a;

    public xav(xay xayVar) {
        this.a = xayVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.m.setVisibility(8);
    }
}
