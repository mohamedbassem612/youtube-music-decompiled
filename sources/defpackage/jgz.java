package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jgz extends AnimatorListenerAdapter {
    final /* synthetic */ oh a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ jhg d;

    public jgz(jhg jhgVar, oh ohVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = ohVar;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = jhgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        jhg jhgVar = this.d;
        oh ohVar = this.a;
        jhgVar.k(ohVar);
        jhgVar.f.remove(ohVar);
        jhgVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
