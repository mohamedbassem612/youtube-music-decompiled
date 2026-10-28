package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afds extends AnimatorListenerAdapter {
    final /* synthetic */ afdt a;

    public afds(afdt afdtVar) {
        this.a = afdtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f.o(false);
    }
}
