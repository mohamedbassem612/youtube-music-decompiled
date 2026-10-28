package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aezk extends AnimatorListenerAdapter {
    final /* synthetic */ aezn a;

    public aezk(aezn aeznVar) {
        this.a = aeznVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        aezn aeznVar = this.a;
        aeznVar.a();
        dta dtaVar = aeznVar.h;
        if (dtaVar != null) {
            dtaVar.b(aeznVar.j);
        }
    }
}
