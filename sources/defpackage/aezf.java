package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aezf extends AnimatorListenerAdapter {
    final /* synthetic */ aezi a;

    public aezf(aezi aeziVar) {
        this.a = aeziVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        aezi aeziVar = this.a;
        aeziVar.a();
        dta dtaVar = aeziVar.i;
        if (dtaVar != null) {
            dtaVar.b(aeziVar.j);
        }
    }
}
