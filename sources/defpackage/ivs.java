package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ivs extends AnimatorListenerAdapter {
    final /* synthetic */ ivu a;

    public ivs(ivu ivuVar) {
        this.a = ivuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ivu ivuVar = this.a;
        ivuVar.d = true;
        tuk.l(ivuVar.c, true);
        tuk.l(ivuVar.c(), true);
    }
}
