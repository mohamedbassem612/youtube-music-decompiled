package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class frb extends AnimatorListenerAdapter {
    final /* synthetic */ frc a;
    final /* synthetic */ float b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    public frb(frc frcVar, float f, boolean z, int i) {
        this.a = frcVar;
        this.b = f;
        this.c = z;
        this.d = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.c;
        frc frcVar = this.a;
        if (z) {
            frcVar.setScrollX(this.d);
        } else {
            frcVar.setScrollX(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.pause();
        animator.getClass();
        this.a.postDelayed(new dxk(animator, 7), (long) (this.b * 1000.0f));
    }
}
