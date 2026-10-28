package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aezj extends AnimatorListenerAdapter {
    final /* synthetic */ aezn a;

    public aezj(aezn aeznVar) {
        this.a = aeznVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        aezn aeznVar = this.a;
        int i = aeznVar.e;
        int length = aezn.a.length;
        aeznVar.e = (i + 4) % aeznVar.d.e.length;
    }
}
