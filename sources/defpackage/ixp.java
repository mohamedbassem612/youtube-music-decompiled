package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ixp extends AnimatorListenerAdapter {
    final /* synthetic */ ixr a;

    public ixp(ixr ixrVar) {
        this.a = ixrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.setVisibility(0);
    }
}
