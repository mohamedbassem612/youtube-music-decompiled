package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afdr extends AnimatorListenerAdapter {
    final /* synthetic */ afdt a;

    public afdr(afdt afdtVar) {
        this.a = afdtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.o(true);
    }
}
