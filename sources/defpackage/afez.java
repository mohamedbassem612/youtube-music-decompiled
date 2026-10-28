package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afez extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup.LayoutParams a;
    final /* synthetic */ int b;
    final /* synthetic */ affa c;

    public afez(affa affaVar, ViewGroup.LayoutParams layoutParams, int i) {
        this.a = layoutParams;
        this.b = i;
        this.c = affaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.c.b;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        ViewGroup.LayoutParams layoutParams = this.a;
        layoutParams.height = this.b;
        view.setLayoutParams(layoutParams);
    }
}
