package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnr extends AnimatorListenerAdapter {
    final /* synthetic */ adnb a;
    final /* synthetic */ adnl b;

    public adnr(adnl adnlVar, adnb adnbVar) {
        this.a = adnbVar;
        this.b = adnlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        adnl adnlVar = this.b;
        adnlVar.b.setListener(null);
        adnlVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.c;
    }
}
