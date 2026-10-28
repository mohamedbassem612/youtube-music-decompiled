package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeux extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ HideBottomViewOnScrollBehavior b;

    public aeux(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view) {
        this.a = view;
        this.b = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.b;
        hideBottomViewOnScrollBehavior.e = null;
        if (hideBottomViewOnScrollBehavior.d == 1) {
            View view = this.a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
