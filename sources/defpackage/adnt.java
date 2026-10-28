package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnt extends AnimatorListenerAdapter {
    final /* synthetic */ adnh a;
    final /* synthetic */ adnm b;

    public adnt(adnm adnmVar, adnh adnhVar) {
        this.a = adnhVar;
        this.b = adnmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        adnm adnmVar = this.b;
        adnmVar.a.setListener(null);
        adnmVar.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.d;
    }
}
