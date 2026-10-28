package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ggb {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public int d;
    private final ValueAnimator e;

    protected ggb() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = valueAnimatorOfFloat;
        this.a = new int[4];
        this.b = new int[4];
        this.c = new int[4];
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.6f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new gga(this, 0));
    }

    public final void a(int i, long j) {
        int iAlpha = Color.alpha(this.d);
        int[] iArr = this.a;
        iArr[0] = iAlpha;
        iArr[1] = Color.red(this.d);
        iArr[2] = Color.green(this.d);
        iArr[3] = Color.blue(this.d);
        int iAlpha2 = Color.alpha(i);
        int[] iArr2 = this.b;
        iArr2[0] = iAlpha2;
        iArr2[1] = Color.red(i);
        iArr2[2] = Color.green(i);
        iArr2[3] = Color.blue(i);
        this.d = i;
        ValueAnimator valueAnimator = this.e;
        valueAnimator.setDuration(j);
        valueAnimator.start();
    }

    public abstract void b(int i);
}
