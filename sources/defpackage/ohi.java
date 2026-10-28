package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ohi extends ogp {
    final /* synthetic */ ohj a;

    public ohi(ohj ohjVar) {
        this.a = ohjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        ohj ohjVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(ohjVar.g, false);
        ohjVar.a();
    }
}
