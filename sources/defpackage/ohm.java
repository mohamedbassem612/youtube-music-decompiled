package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ohm extends Drawable implements Animatable {
    public final int a;
    public final AnimatorSet b;
    private final int d;
    private final int f;
    private final Paint h;
    private final ObjectAnimator i;
    private final ObjectAnimator j;
    private final float k;
    private final float l;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private final Rect s;
    private final int g = 2;
    private final int e = -1;
    private float m = 1.0f;
    public boolean c = isVisible();

    public ohm(int i, int i2, float f) {
        this.a = i;
        this.f = i2;
        this.d = Math.round(f * 255.0f);
        Paint paint = new Paint();
        this.h = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.1f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(733L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.8268492f);
        objectAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.33473143f, 0.12481982f, 0.78584397f, 1.0f));
        objectAnimatorOfFloat2.setDuration(650L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.8268492f, 0.1f);
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.225732f, 0.0f, 0.35f, 1.05f));
        objectAnimatorOfFloat3.setDuration(617L);
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "rect1TranslationX", -522.6f, 199.6f);
        objectAnimatorOfFloat4.setInterpolator(new PathInterpolator(0.34f, 0.0f, 0.78f, 1.0f));
        objectAnimatorOfFloat4.setStartDelay(400L);
        objectAnimatorOfFloat4.setDuration(1600L);
        animatorSet.play(objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.1f, 0.55f);
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.20502818f, 0.057050835f, 0.5f, 0.5f));
        objectAnimatorOfFloat5.setDuration(352L);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.55f, 0.90995026f);
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.15f, 0.2f, 0.6483738f, 1.0043154f));
        objectAnimatorOfFloat6.setDuration(532L);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.90995026f, 0.1f);
        objectAnimatorOfFloat7.setInterpolator(new PathInterpolator(0.25775883f, -0.003163357f, 0.21176192f, 1.3817896f));
        objectAnimatorOfFloat7.setDuration(1116L);
        animatorSet.playSequentially(objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this, "rect2TranslationX", -208.0f, 132.0f);
        objectAnimatorOfFloat8.setInterpolator(new PathInterpolator(0.26f, 0.0f, 0.75f, 0.68f));
        objectAnimatorOfFloat8.setDuration(964L);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this, "rect2TranslationX", 132.0f, 422.6f);
        objectAnimatorOfFloat9.setInterpolator(new PathInterpolator(0.4f, 0.6270349f, 0.6f, 0.9020258f));
        objectAnimatorOfFloat9.setDuration(1036L);
        animatorSet.playSequentially(objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        animatorSet.addListener(new ohk());
        ohn.a();
        ogr.b(animatorSet, null);
        this.b = animatorSet;
        this.k = 1.0f;
        this.l = 1.0f;
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this, "growScale", 1.0f);
        Interpolator interpolator = ogx.a;
        objectAnimatorOfFloat10.setInterpolator(interpolator);
        objectAnimatorOfFloat10.setDuration(500L);
        this.i = objectAnimatorOfFloat10;
        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(this, "growScale", 0.0f);
        objectAnimatorOfFloat11.setInterpolator(interpolator);
        objectAnimatorOfFloat11.setDuration(500L);
        objectAnimatorOfFloat11.addListener(new ohl(this));
        this.j = objectAnimatorOfFloat11;
        this.s = new Rect();
        a();
    }

    public final void a() {
        this.i.cancel();
        this.j.cancel();
        this.b.cancel();
        this.n = 0.1f;
        this.o = -522.6f;
        this.p = 0.1f;
        this.q = -197.6f;
        this.r = this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        Rect rect = this.s;
        if (canvas.getClipBounds(rect)) {
            canvas.save();
            float fHeight = rect.height();
            float f = this.a;
            if (fHeight > f) {
                canvas.translate(0.0f, (fHeight - f) / 2.0f);
            }
            canvas.scale(rect.width() / 360.0f, f / 4.0f);
            canvas.translate(180.0f, 2.0f);
            canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
            if (this.r < 1.0f) {
                if (this.g == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (this.r - 1.0f) * 4.0f * 0.5f);
                canvas.scale(1.0f, this.r);
            }
            int i = this.e;
            Paint paint = this.h;
            if (i != -1) {
                paint.setColor(0);
                paint.setAlpha((int) (this.m * this.d));
            } else {
                paint.setColor(this.f);
                paint.setAlpha((int) (this.m * this.d));
            }
            Paint paint2 = this.h;
            canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, paint2);
            paint2.setColor(this.f);
            paint2.setAlpha((int) (this.m * 255.0f));
            canvas.save();
            canvas.translate(this.o, 0.0f);
            canvas.scale(this.n, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, paint2);
            canvas.restore();
            canvas.save();
            canvas.translate(this.q, 0.0f);
            canvas.scale(this.p, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, paint2);
            canvas.restore();
            canvas.restore();
        }
    }

    public float getGrowScale() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getRect1ScaleX() {
        return this.n;
    }

    public float getRect1TranslationX() {
        return this.o;
    }

    public float getRect2ScaleX() {
        return this.p;
    }

    public float getRect2TranslationX() {
        return this.q;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return isVisible();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.m = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.r = f;
        invalidateSelf();
    }

    public void setRect1ScaleX(float f) {
        this.n = f;
        invalidateSelf();
    }

    public void setRect1TranslationX(float f) {
        this.o = f;
        invalidateSelf();
    }

    public void setRect2ScaleX(float f) {
        this.p = f;
        invalidateSelf();
    }

    public void setRect2TranslationX(float f) {
        this.q = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.c;
        if (!z3 && !z2) {
            return false;
        }
        this.c = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                a();
            }
            this.j.cancel();
            ObjectAnimator objectAnimator = this.i;
            objectAnimator.setFloatValues(this.k);
            objectAnimator.start();
            AnimatorSet animatorSet = this.b;
            if (!animatorSet.isStarted()) {
                animatorSet.start();
            }
        } else if (z3) {
            this.i.cancel();
            ObjectAnimator objectAnimator2 = this.j;
            objectAnimator2.setFloatValues(this.l);
            objectAnimator2.start();
        }
        return z3;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        setVisible(true, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        setVisible(false, false);
    }
}
