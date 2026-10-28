package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afaa extends AnimatorListenerAdapter {
    final /* synthetic */ afac a;

    public afaa(afac afacVar) {
        this.a = afacVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        afac afacVar = this.a;
        afacVar.c = (afacVar.c + 1) % afacVar.b.e.length;
        afacVar.d = true;
    }
}
