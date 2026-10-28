package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afad extends AnimatorListenerAdapter {
    final /* synthetic */ afag a;

    public afad(afag afagVar) {
        this.a = afagVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        afag afagVar = this.a;
        afagVar.e = (afagVar.e + 1) % afagVar.d.e.length;
        afagVar.f = true;
    }
}
