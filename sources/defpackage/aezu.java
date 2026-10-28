package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aezu extends Drawable implements Animatable {
    private static final Property a = new aezt(Float.class);
    private ValueAnimator b;
    private ValueAnimator c;
    private float e;
    final Context i;
    final aezc j;
    public List k;
    public boolean l;
    public int n;
    private final float d = -1.0f;
    final Paint m = new Paint();
    final Rect o = new Rect();
    final aext p = new aext();

    public aezu(Context context, aezc aezcVar) {
        this.i = context;
        this.j = aezcVar;
        setAlpha(255);
    }

    private final void a(ValueAnimator... valueAnimatorArr) {
        boolean z = this.l;
        this.l = true;
        valueAnimatorArr[0].end();
        this.l = z;
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.b == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<aezu, Float>) a, 0.0f, 1.0f);
            this.b = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.b.setInterpolator(aetz.b);
            ValueAnimator valueAnimator3 = this.b;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.b = valueAnimator3;
            valueAnimator3.addListener(new aezr(this));
        }
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<aezu, Float>) a, 1.0f, 0.0f);
            this.c = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.c.setInterpolator(aetz.b);
            ValueAnimator valueAnimator4 = this.c;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.c = valueAnimator4;
            valueAnimator4.addListener(new aezs(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.b;
            valueAnimator2 = this.c;
        } else {
            valueAnimator = this.c;
            valueAnimator2 = this.b;
        }
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                boolean z4 = this.l;
                this.l = true;
                valueAnimator2.cancel();
                this.l = z4;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                a(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z5 = !z || super.setVisible(true, false);
        aezc aezcVar = this.j;
        if (!(z ? aezcVar.e() : aezcVar.d())) {
            a(valueAnimator);
        } else if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z5;
    }

    final float f() {
        aezc aezcVar = this.j;
        if (aezcVar.e() || aezcVar.d()) {
            return this.e;
        }
        return 1.0f;
    }

    final float g() {
        int i;
        float f = this.d;
        if (f > 0.0f) {
            return f;
        }
        aezc aezcVar = this.j;
        boolean z = this instanceof aezq;
        if (aezcVar.c(z) && (i = aezcVar.m) != 0) {
            float fA = aext.a(this.i.getContentResolver());
            if (fA > 0.0f) {
                int i2 = (int) ((((z ? aezcVar.j : aezcVar.k) * 1000.0f) / i) * fA);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i2)) / i2;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(dta dtaVar) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (this.k.contains(dtaVar)) {
            return;
        }
        this.k.add(dtaVar);
    }

    final void i(float f) {
        if (this.e != f) {
            this.e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return k() || j();
    }

    public final boolean j() {
        ValueAnimator valueAnimator = this.c;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean k() {
        ValueAnimator valueAnimator = this.b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean l(boolean z, boolean z2, boolean z3) {
        float fA = aext.a(this.i.getContentResolver());
        boolean z4 = false;
        if (z3 && fA > 0.0f) {
            z4 = true;
        }
        return e(z, z2, z4);
    }

    public final void n(dta dtaVar) {
        List list = this.k;
        if (list == null || !list.contains(dtaVar)) {
            return;
        }
        this.k.remove(dtaVar);
        if (this.k.isEmpty()) {
            this.k = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return l(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
