package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afae extends AnimatorListenerAdapter {
    final /* synthetic */ afag a;

    public afae(afag afagVar) {
        this.a = afagVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        afag afagVar = this.a;
        afagVar.a();
        dta dtaVar = afagVar.h;
        if (dtaVar != null) {
            dtaVar.b(afagVar.j);
        }
    }
}
