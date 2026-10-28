package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqh implements Animation.AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;

    public dqh(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        dqn dqnVar;
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (!swipeRefreshLayout.b) {
            swipeRefreshLayout.b();
            return;
        }
        swipeRefreshLayout.h.setAlpha(255);
        swipeRefreshLayout.h.start();
        if (swipeRefreshLayout.i && (dqnVar = swipeRefreshLayout.a) != null) {
            dqnVar.a();
        }
        swipeRefreshLayout.c = swipeRefreshLayout.d.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
