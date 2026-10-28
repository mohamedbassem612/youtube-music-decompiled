package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import j$.time.Duration;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ggf {
    public final ValueAnimator a;
    public int[] b = new int[0];
    public int[] c = new int[0];
    public int[] d = new int[0];
    public float[] e = new float[0];
    private final GradientDrawable f;

    protected ggf() {
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(aedd.a);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f = gradientDrawable;
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        valueAnimatorOfFloat.addUpdateListener(new gge(this, argbEvaluator, 0));
    }

    public final void a(int[] iArr, Duration duration) {
        b(iArr, new float[0], duration);
    }

    public final void b(int[] iArr, float[] fArr, Duration duration) {
        if (Arrays.equals(this.c, iArr) && Arrays.equals(this.e, fArr)) {
            return;
        }
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        this.b = this.d;
        this.c = Arrays.copyOf(iArr, iArr.length);
        this.e = Arrays.copyOf(fArr, fArr.length);
        valueAnimator.setDuration(duration.toMillis());
        valueAnimator.start();
    }

    public final void c() {
        int[] iArr = this.d;
        float[] fArr = this.e;
        int length = iArr.length;
        if (length >= 2) {
            if (fArr.length != length || Build.VERSION.SDK_INT < 29) {
                this.f.setColors(iArr);
            } else {
                this.f.setColors(iArr, fArr);
            }
            d(this.f);
        }
    }

    public abstract void d(GradientDrawable gradientDrawable);
}
