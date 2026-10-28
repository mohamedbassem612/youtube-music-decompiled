package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xcu extends AnimatorListenerAdapter {
    final /* synthetic */ VerticalShimmerLoadingFrameLayout a;

    public xcu(VerticalShimmerLoadingFrameLayout verticalShimmerLoadingFrameLayout) {
        this.a = verticalShimmerLoadingFrameLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d(false);
    }
}
