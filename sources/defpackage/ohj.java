package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ohj extends Drawable implements Animatable {
    private static final LinearInterpolator h = new LinearInterpolator();
    public final AnimatorSet a;
    public final ValueAnimator b;
    public float c;
    public float d;
    public int e;
    public final int[] f;
    private final ValueAnimator k;
    private final ValueAnimator l;
    private final ValueAnimator m;
    private final ValueAnimator n;
    private final ValueAnimator o;
    private final ArrayList p;
    private float q;
    private float r;
    private float s;
    private final Paint t;
    private int u;
    private final int v;
    private final int w;
    private long y;
    private long z;
    private final RectF i = new RectF();
    private final Rect j = new Rect();
    private final float x = -1.0f;
    public boolean g = false;

    public ohj(int i, int i2, int[] iArr) {
        this.v = i;
        this.w = i2;
        this.f = iArr;
        ArrayList arrayList = new ArrayList();
        this.p = arrayList;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "detentFraction", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1332L);
        LinearInterpolator linearInterpolator = h;
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        this.k = objectAnimatorOfFloat;
        arrayList.add(objectAnimatorOfFloat);
        int i3 = iArr[0];
        d();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "currentColor", i3, iArr[0]);
        objectAnimatorOfInt.setEvaluator(aeua.a);
        objectAnimatorOfInt.setStartDelay(999L);
        objectAnimatorOfInt.setDuration(333L);
        objectAnimatorOfInt.setInterpolator(linearInterpolator);
        this.e = iArr[0];
        this.b = objectAnimatorOfInt;
        arrayList.add(objectAnimatorOfInt);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "headFraction", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(666L);
        Interpolator interpolator = ogx.a;
        objectAnimatorOfFloat2.setInterpolator(interpolator);
        this.l = objectAnimatorOfFloat2;
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "tailFraction", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setStartDelay(666L);
        objectAnimatorOfFloat3.setDuration(666L);
        objectAnimatorOfFloat3.setInterpolator(interpolator);
        this.m = objectAnimatorOfFloat3;
        arrayList.add(objectAnimatorOfFloat3);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "alphaFraction", 0.0f, 1.0f);
        objectAnimatorOfFloat4.addListener(new ohh(this));
        objectAnimatorOfFloat4.setDuration(750L);
        objectAnimatorOfFloat4.setInterpolator(linearInterpolator);
        this.n = objectAnimatorOfFloat4;
        arrayList.add(objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, 0.0f);
        objectAnimatorOfFloat5.addListener(new ohi(this));
        objectAnimatorOfFloat5.setDuration(750L);
        objectAnimatorOfFloat5.setInterpolator(linearInterpolator);
        this.o = objectAnimatorOfFloat5;
        arrayList.add(objectAnimatorOfFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfInt);
        ohn.a();
        ogr.b(animatorSet, new mga(this, 20));
        this.a = animatorSet;
        Paint paint = new Paint();
        this.t = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.u = 255;
        setVisible(false, false);
        a();
    }

    public final void a() {
        super.setVisible(this.g, false);
        AnimatorSet animatorSet = this.a;
        if (animatorSet.isStarted()) {
            animatorSet.cancel();
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator.isStarted()) {
                animator.cancel();
            }
        }
        b();
        this.r = 0.0f;
        this.d = 0.0f;
        this.q = 0.0f;
        this.c = 0.0f;
        int[] iArr = this.f;
        int i2 = iArr[0];
        this.e = i2;
        ValueAnimator valueAnimator = this.b;
        d();
        valueAnimator.setIntValues(i2, iArr[0]);
        this.s = 0.0f;
        invalidateSelf();
    }

    public final void b() {
        this.b.setStartDelay(999L);
        this.m.setStartDelay(666L);
    }

    public final void d() {
        int length = this.f.length;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (getBounds().isEmpty()) {
            return;
        }
        if (isVisible() || this.o.isRunning()) {
            if (this.x == -1.0f) {
                bounds = getBounds();
            } else {
                Rect bounds2 = getBounds();
                int iCenterX = bounds2.centerX();
                int iCenterY = bounds2.centerY();
                Rect rect = this.j;
                rect.left = iCenterX - (getIntrinsicWidth() / 2);
                rect.right = iCenterX + (getIntrinsicWidth() / 2);
                rect.top = iCenterY - (getIntrinsicHeight() / 2);
                rect.bottom = iCenterY + (getIntrinsicHeight() / 2);
                bounds = rect;
            }
            int i = this.v;
            float f = this.s;
            float f2 = i * f;
            float f3 = this.u * f;
            int i2 = this.w;
            Paint paint = this.t;
            paint.setColor(this.e);
            paint.setAlpha((int) f3);
            paint.setStrokeWidth(f2);
            RectF rectF = this.i;
            rectF.set(bounds);
            float f4 = (i2 + i) - (f2 / 2.0f);
            rectF.inset(f4, f4);
            float fWidth = rectF.width() / 2.0f;
            float f5 = this.d * 290.0f;
            canvas.drawArc(rectF, (f5 + (this.c + (this.q * 286.0f))) - 90.0f, Math.max(Math.abs((this.r * 290.0f) - f5), (float) ((((double) (fWidth - f2)) * 3.141592653589793d) / ((double) (f2 * 180.0f)))), false, paint);
        }
    }

    public float getAlphaFraction() {
        return this.s;
    }

    public int getCurrentColor() {
        return this.e;
    }

    public float getDetentFraction() {
        return this.q;
    }

    public float getHeadFraction() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.x;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.x;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getTailFraction() {
        return this.d;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.a.isRunning() || this.n.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.u) {
            this.u = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.s = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.t.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCurrentColor(int i) {
        this.e = i;
        invalidateSelf();
    }

    public void setDetentFraction(float f) {
        this.q = f;
        invalidateSelf();
    }

    public void setHeadFraction(float f) {
        this.r = f;
        invalidateSelf();
    }

    public void setTailFraction(float f) {
        this.d = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.g;
        if (!z3 && !z2) {
            return false;
        }
        this.g = z;
        if (z) {
            super.setVisible(true, z2);
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator.isRunning()) {
                this.n.setCurrentPlayTime(750 - valueAnimator.getCurrentPlayTime());
                valueAnimator.cancel();
            }
            if (z2) {
                a();
                ValueAnimator valueAnimator2 = this.n;
                valueAnimator2.setStartDelay(0L);
                valueAnimator2.start();
                this.y = 0L;
            } else {
                long jMax = Math.max(0L, this.y - (SystemClock.elapsedRealtime() - this.z));
                this.y = jMax;
                ValueAnimator valueAnimator3 = this.n;
                valueAnimator3.setStartDelay(jMax);
                valueAnimator3.start();
            }
            this.z = SystemClock.elapsedRealtime();
        } else if (z3) {
            ValueAnimator valueAnimator4 = this.n;
            if (valueAnimator4.isRunning()) {
                this.o.setCurrentPlayTime(750 - valueAnimator4.getCurrentPlayTime());
                valueAnimator4.cancel();
            }
            this.o.start();
        } else {
            a();
        }
        return z3;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        setVisible(true, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        setVisible(false, true);
    }
}
