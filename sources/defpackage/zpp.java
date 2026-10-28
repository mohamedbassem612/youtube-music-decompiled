package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zpp extends AnimatorListenerAdapter {
    final /* synthetic */ zpr a;

    public zpp(zpr zprVar) {
        this.a = zprVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zpr zprVar = this.a;
        zprVar.h();
        zprVar.g();
        zprVar.d.setVisibility(0);
    }
}
