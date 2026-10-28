package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibc extends ibd {
    public final int a;
    public final int b;
    public final int c;
    public final long d = 2500;
    public final Runnable e = new gky(this, 19, null);
    public final /* synthetic */ ibe f;

    public ibc(ibe ibeVar, int i, int i2, int i3) {
        this.f = ibeVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void a() {
        ibe ibeVar = this.f;
        ibeVar.removeCallbacks(this.e);
        if (b() == 1.0f) {
            f();
        } else {
            d();
            ibeVar.postInvalidate();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f.invalidate();
    }
}
