package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ixq extends AnimatorListenerAdapter {
    final /* synthetic */ ixr a;

    public ixq(ixr ixrVar) {
        this.a = ixrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ixr ixrVar = this.a;
        ixrVar.c = false;
        ixrVar.a();
    }
}
