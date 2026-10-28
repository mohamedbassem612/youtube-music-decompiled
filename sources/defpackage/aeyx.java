package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeyx extends AnimatorListenerAdapter {
    final /* synthetic */ aeys a;

    public aeyx(aeys aeysVar) {
        this.a = aeysVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aeys aeysVar = this.a;
        aeysVar.b.setTranslationY(0.0f);
        aeysVar.b(0.0f);
    }
}
