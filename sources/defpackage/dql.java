package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dql extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public dql(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.j;
        int iAbs = swipeRefreshLayout.g - Math.abs(swipeRefreshLayout.f);
        int i = swipeRefreshLayout.e;
        swipeRefreshLayout.m((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout.d.getTop());
        swipeRefreshLayout.h.c(1.0f - f);
    }
}
