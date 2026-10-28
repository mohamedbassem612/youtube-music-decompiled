package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dqk extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ SwipeRefreshLayout c;

    public dqk(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.b;
        int i2 = this.a;
        this.c.h.setAlpha((int) (i2 + ((i - i2) * f)));
    }
}
