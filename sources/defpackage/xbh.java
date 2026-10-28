package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xbh extends AnimatorListenerAdapter {
    final /* synthetic */ xbi a;

    public xbh(xbi xbiVar) {
        this.a = xbiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.g.setVisibility(0);
    }
}
