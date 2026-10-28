package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ohf extends ogp {
    final /* synthetic */ ohg a;

    public ohf(ohg ohgVar) {
        this.a = ohgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        ohg ohgVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(ohgVar.b, false);
        ohgVar.b();
    }
}
