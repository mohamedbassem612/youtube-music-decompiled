package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexr extends AnimatorListenerAdapter {
    final /* synthetic */ FocusRingDrawable a;

    public aexr(FocusRingDrawable focusRingDrawable) {
        this.a = focusRingDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        FocusRingDrawable focusRingDrawable = this.a;
        focusRingDrawable.b = 1.0f;
        focusRingDrawable.invalidateSelf();
    }
}
