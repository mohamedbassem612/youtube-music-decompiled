package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmh extends AnimatorListenerAdapter {
    final /* synthetic */ yvh a;
    final /* synthetic */ aepb b;

    public vmh(aepb aepbVar, yvh yvhVar) {
        this.a = yvhVar;
        this.b = aepbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.m(this.a, 1.0d);
    }
}
