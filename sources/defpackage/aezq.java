package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aezq extends aezu {
    public static final /* synthetic */ int h = 0;
    private static final bld q = new aezp();
    public final aezw a;
    public final aezv b;
    public float c;
    public ValueAnimator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public TimeInterpolator g;
    private final blf r;
    private boolean s;
    private final ValueAnimator t;

    public aezq(Context context, aezc aezcVar, aezw aezwVar) {
        super(context, aezcVar);
        this.s = false;
        this.a = aezwVar;
        aezv aezvVar = new aezv();
        this.b = aezvVar;
        aezvVar.h = true;
        blf blfVar = new blf(this, q);
        this.r = blfVar;
        blg blgVar = new blg();
        blgVar.c(1.0f);
        blgVar.e(50.0f);
        blfVar.p = blgVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.t = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new vmg((Drawable) this, (Object) aezcVar, 5));
        if (aezcVar.c(true) && aezcVar.m != 0) {
            valueAnimator.start();
        }
        i(1.0f);
    }

    public final float a(int i) {
        aezc aezcVar = this.j;
        float f = i;
        return (f < aezcVar.o * 10000.0f || f > aezcVar.p * 10000.0f) ? 0.0f : 1.0f;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.e = f;
        invalidateSelf();
    }

    public final void d(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.o)) {
            canvas.save();
            aezw aezwVar = this.a;
            aezwVar.h(canvas, getBounds(), f(), k(), j());
            aezv aezvVar = this.b;
            aezvVar.f = g();
            Paint paint = this.m;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            aezc aezcVar = this.j;
            aezvVar.c = aezcVar.e[0];
            int iB = aezcVar.i;
            if (iB > 0) {
                if (!(aezwVar instanceof aezz)) {
                    iB = (int) ((iB * ast.b(b(), 0.0f, 0.01f)) / 0.01f);
                }
                aezwVar.f(canvas, paint, b(), 1.0f, aezcVar.f, this.n, iB);
            } else {
                aezwVar.f(canvas, paint, 0.0f, 1.0f, aezcVar.f, this.n, 0);
            }
            aezwVar.e(canvas, paint, aezvVar, this.n);
            aezwVar.d(canvas, paint, aezcVar.e[0], this.n);
            canvas.restore();
        }
    }

    @Override // defpackage.aezu
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        float fA = aext.a(this.i.getContentResolver());
        if (fA == 0.0f) {
            this.s = true;
        } else {
            this.s = false;
            this.r.p.e(50.0f / fA);
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.aezu, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.r.k();
        d(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float f = i;
        float fA = a(i);
        if (this.s) {
            this.r.k();
            d(f / 10000.0f);
            c(fA);
            return true;
        }
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0) {
            boolean z = this.a instanceof aezz;
            blf blfVar = this.r;
            if (z) {
                blfVar.g(10000.0f / iWidth);
            } else {
                blfVar.g((float) (10000.0d / (((double) Math.min(iHeight, iWidth)) * 3.141592653589793d)));
            }
        }
        blf blfVar2 = this.r;
        blfVar2.h(b() * 10000.0f);
        blfVar2.i(f);
        return true;
    }
}
