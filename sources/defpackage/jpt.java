package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jpt implements Animator.AnimatorListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ WatchWhileLayout b;

    public jpt(WatchWhileLayout watchWhileLayout, boolean z) {
        this.a = z;
        this.b = watchWhileLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        boolean z = this.a;
        View view = this.b.at;
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.b.at.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            return;
        }
        this.b.at.setVisibility(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
