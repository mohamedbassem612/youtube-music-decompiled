package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ohg extends Drawable {
    private static final LinearInterpolator c = new LinearInterpolator();
    public final int a;
    public boolean b;
    private final ValueAnimator d;
    private final ValueAnimator e;
    private float f;
    private final int i;
    private final Paint j;
    private final int k;
    private final ogy m;
    private final ohb n;
    private float o;
    private final RectF g = new RectF();
    private final Rect h = new Rect();
    private int p = 255;
    private final float l = -1.0f;

    public ohg(int i, int i2, int i3) {
        this.a = i;
        this.k = i2;
        this.i = i3;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alphaFraction", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(750L);
        LinearInterpolator linearInterpolator = c;
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        this.d = objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, 0.0f);
        objectAnimatorOfFloat2.addListener(new ohf(this));
        objectAnimatorOfFloat2.setDuration(750L);
        objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
        this.e = objectAnimatorOfFloat2;
        Paint paint = new Paint();
        this.j = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.b = false;
        this.o = getLevel() / 10000;
        ogy ogyVar = new ogy();
        this.m = ogyVar;
        ogyVar.c(((double) getLevel()) / 10000.0d);
        ogyVar.b(this.o);
        ogyVar.l = true;
        ogyVar.e(new ohe(this));
        this.n = new ohb(ogyVar);
        setVisible(false, false);
    }

    public final void a() {
        this.m.c(((double) getLevel()) / 10000.0d);
        ohb ohbVar = this.n;
        if (ohbVar.e) {
            if (ohbVar.f) {
                ohbVar.f = false;
                ogw.c().b(ohbVar.g);
            }
            ohbVar.e = false;
        }
    }

    public final void b() {
        a();
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2.isStarted()) {
            valueAnimator2.cancel();
        }
    }

    public final void c(float f) {
        this.o = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        if (this.l == -1.0f) {
            bounds = getBounds();
        } else {
            Rect bounds2 = getBounds();
            int iCenterX = bounds2.centerX();
            int iCenterY = bounds2.centerY();
            Rect rect = this.h;
            rect.left = iCenterX - (getIntrinsicWidth() / 2);
            rect.right = iCenterX + (getIntrinsicWidth() / 2);
            rect.top = iCenterY - (getIntrinsicHeight() / 2);
            rect.bottom = iCenterY + (getIntrinsicHeight() / 2);
            bounds = rect;
        }
        int i = this.a;
        float f = this.f;
        float f2 = i * f;
        float f3 = this.p * f;
        int i2 = this.k;
        Paint paint = this.j;
        paint.setStrokeWidth(f2);
        RectF rectF = this.g;
        rectF.set(bounds);
        float f4 = (i2 + i) - (f2 / 2.0f);
        rectF.inset(f4, f4);
        float fWidth = rectF.width() / 2.0f;
        float f5 = this.o * 360.0f;
        paint.setColor(this.i);
        int i3 = (int) f3;
        paint.setAlpha((int) (i3 * 0.2f));
        canvas.drawOval(rectF, paint);
        paint.setAlpha(i3);
        float fMax = Math.max(f5, (float) ((((double) (fWidth - f2)) * 3.141592653589793d) / ((double) (f2 * 180.0f))));
        if (fMax >= 5.0f) {
            canvas.drawArc(rectF, -90.0f, fMax, false, paint);
        }
    }

    public final void e() {
        this.b = true;
        if (super.setVisible(true, false)) {
            this.d.end();
            a();
        }
    }

    public float getAlphaFraction() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.l;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.l;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        this.m.b(((double) i) / 10000.0d);
        ohb ohbVar = this.n;
        if (!ohbVar.e) {
            ohbVar.e = true;
            ohbVar.d = -1L;
            ohbVar.a();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.p) {
            this.p = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.f = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.b;
        if (!z3 && !z2) {
            return false;
        }
        this.b = z;
        if (z) {
            super.setVisible(true, z2);
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator.isRunning()) {
                this.d.setCurrentPlayTime(750 - valueAnimator.getCurrentPlayTime());
                valueAnimator.cancel();
            }
            if (z2) {
                b();
                this.d.start();
            } else {
                this.d.start();
            }
        } else if (z3) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2.isRunning()) {
                this.e.setCurrentPlayTime(750 - valueAnimator2.getCurrentPlayTime());
                valueAnimator2.cancel();
            }
            this.e.start();
        } else {
            b();
        }
        return z3;
    }
}
