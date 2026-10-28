package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lo extends AnimatorListenerAdapter {
    final /* synthetic */ oh a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ lu d;

    public lo(lu luVar, oh ohVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = luVar;
        this.a = ohVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        lu luVar = this.d;
        oh ohVar = this.a;
        luVar.k(ohVar);
        luVar.f.remove(ohVar);
        luVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
