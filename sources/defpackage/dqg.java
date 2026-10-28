package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqg extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new bnn();
    private static final int[] g = {-16777216};
    public final dqf a;
    public Resources b;
    float c;
    boolean d;
    private float h;
    private Animator i;

    public dqg(Context context) {
        context.getClass();
        this.b = context.getResources();
        dqf dqfVar = new dqf();
        this.a = dqfVar;
        dqfVar.d(g);
        dqfVar.f(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new gge(this, dqfVar, 1));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(e);
        valueAnimatorOfFloat.addListener(new dqe(this, dqfVar));
        this.i = valueAnimatorOfFloat;
    }

    public static final void e(float f2, dqf dqfVar) {
        if (f2 <= 0.75f) {
            dqfVar.t = dqfVar.a();
            return;
        }
        int iA = dqfVar.a();
        int[] iArr = dqfVar.i;
        dqfVar.h();
        int i = iArr[0];
        int i2 = iA >> 24;
        int i3 = iA >> 16;
        int i4 = iA >> 8;
        int i5 = iA & 255;
        float f3 = (f2 - 0.75f) / 0.25f;
        int i6 = i4 & 255;
        int i7 = i3 & 255;
        int i8 = i7 + ((int) ((((i >> 16) & 255) - i7) * f3));
        int i9 = i2 & 255;
        dqfVar.t = ((i9 + ((int) (f3 * (((i >> 24) & 255) - i9)))) << 24) | (i8 << 16) | ((i6 + ((int) ((((i >> 8) & 255) - i6) * f3))) << 8) | (i5 + ((int) (((i & 255) - i5) * f3)));
    }

    public final void a(float f2, dqf dqfVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.d) {
            e(f2, dqfVar);
            double dFloor = Math.floor(dqfVar.l / 0.8f) + 1.0d;
            float f3 = dqfVar.j;
            float f4 = dqfVar.k;
            dqfVar.e = f3 + ((((-0.01f) + f4) - f3) * f2);
            dqfVar.f = f4;
            float f5 = dqfVar.l;
            dqfVar.g = f5 + ((((float) dFloor) - f5) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f6 = dqfVar.l;
            if (f2 < 0.5f) {
                interpolation = dqfVar.j;
                interpolation2 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = dqfVar.j + 0.79f;
                interpolation = f7 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f7;
            }
            float f8 = f6 + (0.20999998f * f2);
            float f9 = f2 + this.c;
            dqfVar.e = interpolation;
            dqfVar.f = interpolation2;
            dqfVar.g = f8;
            this.h = f9 * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.e(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        dqf dqfVar = this.a;
        if (f2 != dqfVar.o) {
            dqfVar.o = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        dqf dqfVar = this.a;
        dqfVar.e = 0.0f;
        dqfVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        dqf dqfVar = this.a;
        float f2 = dqfVar.p;
        float fMin = (dqfVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dqfVar.q * dqfVar.o) / 2.0f, dqfVar.h / 2.0f);
        }
        RectF rectF = dqfVar.a;
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f3 = dqfVar.e;
        float f4 = dqfVar.g;
        float f5 = f3 + f4;
        float f6 = dqfVar.f + f4;
        Paint paint = dqfVar.b;
        paint.setColor(dqfVar.t);
        paint.setAlpha(dqfVar.s);
        float f7 = dqfVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dqfVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        float f9 = f5 * 360.0f;
        float f10 = (f6 * 360.0f) - f9;
        canvas.drawArc(rectF, f9, f10, false, paint);
        if (dqfVar.m) {
            Path path = dqfVar.n;
            if (path == null) {
                dqfVar.n = new Path();
                dqfVar.n.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f11 = (dqfVar.q * dqfVar.o) / 2.0f;
            dqfVar.n.moveTo(0.0f, 0.0f);
            dqfVar.n.lineTo(dqfVar.q * dqfVar.o, 0.0f);
            Path path2 = dqfVar.n;
            float f12 = dqfVar.q;
            float f13 = dqfVar.o;
            path2.lineTo((f12 * f13) / 2.0f, dqfVar.r * f13);
            dqfVar.n.offset((fMin2 + rectF.centerX()) - f11, rectF.centerY() + (dqfVar.h / 2.0f));
            dqfVar.n.close();
            Paint paint2 = dqfVar.c;
            paint2.setColor(dqfVar.t);
            paint2.setAlpha(dqfVar.s);
            canvas.save();
            canvas.rotate(f9 + f10, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dqfVar.n, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.i.cancel();
        dqf dqfVar = this.a;
        dqfVar.g();
        if (dqfVar.f != dqfVar.e) {
            this.d = true;
            this.i.setDuration(666L);
            this.i.start();
        } else {
            dqfVar.i();
            dqfVar.b();
            this.i.setDuration(1332L);
            this.i.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        dqf dqfVar = this.a;
        dqfVar.e(false);
        dqfVar.i();
        dqfVar.b();
        invalidateSelf();
    }
}
