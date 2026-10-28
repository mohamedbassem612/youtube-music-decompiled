package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dqe implements Animator.AnimatorListener {
    final /* synthetic */ dqf a;
    final /* synthetic */ dqg b;

    public dqe(dqg dqgVar, dqf dqfVar) {
        this.b = dqgVar;
        this.a = dqfVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        dqf dqfVar = this.a;
        dqg dqgVar = this.b;
        dqgVar.a(1.0f, dqfVar, true);
        dqfVar.g();
        dqfVar.h();
        dqfVar.i();
        if (!dqgVar.d) {
            dqgVar.c += 1.0f;
            return;
        }
        dqgVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        dqfVar.e(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
