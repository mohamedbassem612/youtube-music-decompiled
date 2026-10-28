package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hdg extends AnimatorListenerAdapter {
    final /* synthetic */ acne a;

    public hdg(acne acneVar) {
        this.a = acneVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        hdj hdjVar = (hdj) this.a.a;
        AnimatorSet animatorSet = hdjVar.y;
        if (animatorSet != null) {
            animatorSet.setStartDelay(0L);
            hdjVar.y.start();
        }
    }
}
