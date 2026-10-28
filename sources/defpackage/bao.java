package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bao extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ ci b;

    public bao(ci ciVar, View view) {
        this.b = ciVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ci ciVar = this.b;
        ciVar.n(1.0f);
        baq.d(this.a, ciVar);
    }
}
