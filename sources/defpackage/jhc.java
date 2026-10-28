package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jhc extends AnimatorListenerAdapter {
    final /* synthetic */ oh a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ jhg d;

    public jhc(jhg jhgVar, oh ohVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = ohVar;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = jhgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        oh ohVar = this.a;
        if (ohVar != null) {
            jhg jhgVar = this.d;
            jhgVar.k(ohVar);
            jhgVar.g.remove(ohVar);
        }
        this.d.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
