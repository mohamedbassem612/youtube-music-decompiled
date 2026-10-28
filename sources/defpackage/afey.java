package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afey extends AnimatorListenerAdapter {
    final /* synthetic */ affa a;

    public afey(affa affaVar) {
        this.a = affaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        affa affaVar = this.a;
        View view = affaVar.b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int height = view.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(affaVar.a);
        duration.addListener(new afez(affaVar, layoutParams, height));
        duration.addUpdateListener(new vmg(affaVar, layoutParams, 6));
        duration.start();
    }
}
