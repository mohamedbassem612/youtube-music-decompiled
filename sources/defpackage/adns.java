package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adns extends AnimatorListenerAdapter {
    final /* synthetic */ adni a;
    final /* synthetic */ adnm b;

    public adns(adnm adnmVar, adni adniVar) {
        this.a = adniVar;
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
        Runnable runnable = this.a.c;
    }
}
