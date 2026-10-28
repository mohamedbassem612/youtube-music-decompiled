package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xdf implements Animator.AnimatorListener {
    final /* synthetic */ xdg a;
    final /* synthetic */ xdh b;
    final /* synthetic */ avpr c;

    public xdf(xdh xdhVar, xdg xdgVar, avpr avprVar) {
        this.a = xdgVar;
        this.c = avprVar;
        this.b = xdhVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        onAnimationEnd(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xdh xdhVar = this.b;
        xdg xdgVar = this.a;
        xdhVar.f(xdgVar.a, false, xdgVar.h);
        this.c.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
