package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abkm extends AnimatorListenerAdapter {
    final /* synthetic */ abkn a;

    public abkm(abkn abknVar) {
        this.a = abknVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.e.isAttachedToWindow();
    }
}
