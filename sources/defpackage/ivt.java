package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ivt extends AnimatorListenerAdapter {
    final /* synthetic */ ivu a;

    public ivt(ivu ivuVar) {
        this.a = ivuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ivu ivuVar = this.a;
        ivuVar.d = false;
        tuk.l(ivuVar.c(), false);
        tuk.l(ivuVar.c, false);
    }
}
