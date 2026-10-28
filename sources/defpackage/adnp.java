package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnp extends AnimatorListenerAdapter {
    final /* synthetic */ adnj a;
    final /* synthetic */ adnn b;

    public adnp(adnn adnnVar, adnj adnjVar) {
        this.a = adnjVar;
        this.b = adnnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        adnn adnnVar = this.b;
        adnnVar.d.setListener(null);
        adnnVar.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.d;
    }
}
