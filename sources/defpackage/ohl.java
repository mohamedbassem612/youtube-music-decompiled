package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ohl extends ogp {
    final /* synthetic */ ohm a;

    public ohl(ohm ohmVar) {
        this.a = ohmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        ohm ohmVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(ohmVar.c, false);
        ohmVar.b.cancel();
        ohmVar.a();
    }
}
