package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class me extends AnimatorListenerAdapter {
    final /* synthetic */ mf a;
    private boolean b = false;

    public me(mf mfVar) {
        this.a = mfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        mf mfVar = this.a;
        if (((Float) mfVar.p.getAnimatedValue()).floatValue() == 0.0f) {
            mfVar.q = 0;
            mfVar.i(0);
        } else {
            mfVar.q = 2;
            mfVar.h();
        }
    }
}
