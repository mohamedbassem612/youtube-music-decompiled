package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeze extends AnimatorListenerAdapter {
    final /* synthetic */ aezi a;

    public aeze(aezi aeziVar) {
        this.a = aeziVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        aezi aeziVar = this.a;
        aeziVar.f = (aeziVar.f + 4) % aeziVar.e.e.length;
    }
}
