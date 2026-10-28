package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jkd extends AnimatorListenerAdapter {
    final /* synthetic */ jkf a;

    public jkd(jkf jkfVar) {
        this.a = jkfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jkf jkfVar = this.a;
        jkfVar.setScaleX(1.0f);
        jkfVar.a();
    }
}
