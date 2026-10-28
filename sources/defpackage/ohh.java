package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ohh extends AnimatorListenerAdapter {
    final /* synthetic */ ohj a;

    public ohh(ohj ohjVar) {
        this.a = ohjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AnimatorSet animatorSet = this.a.a;
        if (animatorSet.isStarted()) {
            return;
        }
        animatorSet.start();
    }
}
