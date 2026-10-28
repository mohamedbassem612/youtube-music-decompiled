package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afch extends AnimatorListenerAdapter {
    final /* synthetic */ afcr a;

    public afch(afcr afcrVar) {
        this.a = afcrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        afcr afcrVar = this.a;
        int i = afcrVar.f;
        afcs afcsVar = afcrVar.l;
        int i2 = afcrVar.d;
        afcsVar.a(i - i2, i2);
    }
}
