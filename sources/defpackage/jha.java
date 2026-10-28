package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jha extends AnimatorListenerAdapter {
    final /* synthetic */ oh a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ jhg d;

    public jha(jhg jhgVar, oh ohVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = ohVar;
        this.b = view;
        this.c = viewPropertyAnimator;
        this.d = jhgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        jhg jhgVar = this.d;
        oh ohVar = this.a;
        jhgVar.k(ohVar);
        jhgVar.d.remove(ohVar);
        jhgVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
