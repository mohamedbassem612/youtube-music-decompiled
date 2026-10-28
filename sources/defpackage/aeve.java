package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeve extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ HideViewOnScrollBehavior b;

    public aeve(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view) {
        this.a = view;
        this.b = hideViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.b;
        hideViewOnScrollBehavior.e = null;
        if (hideViewOnScrollBehavior.d == 1) {
            View view = this.a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
