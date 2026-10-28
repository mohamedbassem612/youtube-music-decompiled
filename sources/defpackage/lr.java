package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lr extends AnimatorListenerAdapter {
    final /* synthetic */ lt a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ lu d;

    public lr(lu luVar, lt ltVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = luVar;
        this.a = ltVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        lu luVar = this.d;
        lt ltVar = this.a;
        luVar.k(ltVar.a);
        luVar.g.remove(ltVar.a);
        luVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        oh ohVar = this.a.a;
    }
}
