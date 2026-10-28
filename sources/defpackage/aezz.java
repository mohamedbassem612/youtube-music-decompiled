package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aezz extends aezw {
    final Pair f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private int m;
    private boolean n;
    private float o;

    public aezz(afah afahVar) {
        super(afahVar);
        this.g = 300.0f;
        this.f = new Pair(new ovo((short[]) null), new ovo((short[]) null));
    }

    private final void j(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Canvas canvas2;
        Pair pair;
        float f7 = 1.0f - this.o;
        float fB = ast.b(f, 0.0f, 1.0f);
        float f8 = ((1.0f - fB) * f7) + fB;
        float f9 = this.g;
        float f10 = f8 * f9;
        float fB2 = ast.b(f2, 0.0f, 1.0f);
        float f11 = ((1.0f - fB2) * f7) + fB2;
        float f12 = this.i;
        float f13 = this.j;
        float fB3 = (f9 * f11) - ((int) ((i3 * (1.0f - ast.b(f11, 0.99f, 1.0f))) / 0.01f));
        int iB = (int) (f10 + ((int) ((i2 * ast.b(f8, 0.0f, 0.01f)) / 0.01f)));
        int i4 = (int) fB3;
        if (f12 != f13) {
            float fMax = Math.max(f12, f13);
            float f14 = this.g;
            float f15 = fMax / f14;
            float f16 = this.i;
            float f17 = this.j;
            float fB4 = ast.b(iB / f14, 0.0f, f15) / f15;
            float fB5 = ast.b((f14 - i4) / f14, 0.0f, f15) / f15;
            float f18 = ((1.0f - fB5) * f16) + (fB5 * f17);
            f5 = ((1.0f - fB4) * f16) + (fB4 * f17);
            f6 = f18;
        } else {
            f5 = f12;
            f6 = f5;
        }
        float f19 = -this.g;
        afah afahVar = (afah) this.a;
        boolean z2 = afahVar.c(this.n) && z && f3 > 0.0f;
        if (iB <= i4) {
            float f20 = f19 / 2.0f;
            float f21 = iB + f5;
            float f22 = i4 - f6;
            float f23 = f5 + f5;
            boolean z3 = z2;
            float f24 = f6 + f6;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.h);
            Pair pair2 = this.f;
            ((ovo) pair2.first).q();
            ((ovo) pair2.second).q();
            ((ovo) pair2.first).t(f21 + f20);
            ((ovo) pair2.second).t(f20 + f22);
            if (iB == 0 && f22 + f6 < f21 + f5) {
                k(canvas, paint, (ovo) pair2.first, f23, this.h, f5, (ovo) pair2.second, f24, this.h, f6, true);
                return;
            }
            if (f21 - f5 > f22 - f6) {
                k(canvas, paint, (ovo) pair2.second, f24, this.h, f6, (ovo) pair2.first, f23, this.h, f5, false);
                return;
            }
            float f25 = f6;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(afahVar.f() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z3) {
                PathMeasure pathMeasure = this.d;
                Path path = this.c;
                float f26 = this.g;
                float f27 = f21 / f26;
                float f28 = f22 / f26;
                int i5 = this.n ? afahVar.j : afahVar.k;
                if (i5 != this.m) {
                    this.m = i5;
                    g();
                }
                path.rewind();
                float f29 = (-this.g) / 2.0f;
                boolean zC = afahVar.c(this.n);
                if (zC) {
                    float f30 = this.g;
                    float f31 = this.l;
                    float f32 = f30 / f31;
                    float f33 = f4 / f32;
                    f29 -= f31 * f4;
                    float f34 = f32 / (f32 + 1.0f);
                    f28 = (f28 + f33) * f34;
                    f27 = (f27 + f33) * f34;
                }
                float length = f27 * pathMeasure.getLength();
                float length2 = f28 * pathMeasure.getLength();
                pathMeasure.getSegment(length, length2, path, true);
                ovo ovoVar = (ovo) pair2.first;
                ovoVar.q();
                pathMeasure.getPosTan(length, (float[]) ovoVar.c, (float[]) ovoVar.b);
                ovo ovoVar2 = (ovo) pair2.second;
                ovoVar2.q();
                pathMeasure.getPosTan(length2, (float[]) ovoVar2.c, (float[]) ovoVar2.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f29, 0.0f);
                ovoVar.t(f29);
                ovoVar2.t(f29);
                if (zC) {
                    float f35 = this.k * f3;
                    matrix.postScale(1.0f, f35);
                    ovoVar.s(f35);
                    ovoVar2.s(f35);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                canvas.drawLine(((float[]) ((ovo) pair2.first).c)[0], ((float[]) ((ovo) pair2.first).c)[1], ((float[]) ((ovo) pair2.second).c)[0], ((float[]) ((ovo) pair2.second).c)[1], paint);
                canvas2 = canvas;
                f23 = f23;
            }
            if (afahVar.f()) {
                return;
            }
            if (f21 <= 0.0f || f5 <= 0.0f) {
                pair = pair2;
            } else {
                pair = pair2;
                k(canvas2, paint, (ovo) pair2.first, f23, this.h, f5, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f22 >= this.g || f25 <= 0.0f) {
                return;
            }
            k(canvas, paint, (ovo) pair.second, f24, this.h, f25, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    private final void k(Canvas canvas, Paint paint, ovo ovoVar, float f, float f2, float f3, ovo ovoVar2, float f4, float f5, float f6, boolean z) {
        char c;
        float f7;
        float f8;
        float fMin = Math.min(f2, this.h);
        float f9 = -fMin;
        float f10 = fMin / 2.0f;
        float f11 = (-f) / 2.0f;
        float f12 = f9 / 2.0f;
        float f13 = f / 2.0f;
        RectF rectF = new RectF(f11, f12, f13, f10);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (ovoVar2 != null) {
            float fMin2 = Math.min(f5, this.h);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.h);
            RectF rectF2 = new RectF();
            if (z) {
                c = 1;
                float f14 = (((float[]) ovoVar2.c)[0] - fMin3) - (((float[]) ovoVar.c)[0] - f3);
                if (f14 > 0.0f) {
                    ovoVar2.t((-f14) / 2.0f);
                    f8 = f4 + f14;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f12, f13, f10);
            } else {
                c = 1;
                float f15 = (((float[]) ovoVar2.c)[0] + fMin3) - (((float[]) ovoVar.c)[0] + f3);
                if (f15 < 0.0f) {
                    ovoVar2.t((-f15) / 2.0f);
                    f7 = f4 - f15;
                } else {
                    f7 = f4;
                }
                rectF2.set(f11, f12, 0.0f, f10);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-fMin2) / 2.0f, f8 / 2.0f, fMin2 / 2.0f);
            float[] fArr = (float[]) ovoVar2.c;
            canvas.translate(fArr[0], fArr[c]);
            canvas.rotate(i((float[]) ovoVar2.b));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i((float[]) ovoVar2.b));
            float[] fArr2 = (float[]) ovoVar2.c;
            canvas.translate(-fArr2[0], -fArr2[c]);
            float[] fArr3 = (float[]) ovoVar.c;
            canvas.translate(fArr3[0], fArr3[c]);
            canvas.rotate(i((float[]) ovoVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = (float[]) ovoVar.c;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i((float[]) ovoVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    @Override // defpackage.aezw
    public final int a() {
        afah afahVar = (afah) this.a;
        return afahVar.a + (afahVar.l << 1);
    }

    @Override // defpackage.aezw
    public final int b() {
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
    @Override // defpackage.aezw
    public final void c(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.g != rect.width()) {
            this.g = rect.width();
            g();
        }
        float fA = a();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - fA) / 2.0f));
        afah afahVar = (afah) this.a;
        if (afahVar.s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.g / 2.0f;
        float f3 = fA / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        int i = afahVar.a;
        float f4 = i;
        this.h = f4 * f;
        this.i = Math.min(i / 2, afahVar.a()) * f;
        this.k = afahVar.l * f;
        this.j = Math.min(f4 / 2.0f, afahVar.g()) * f;
        if (z) {
            if ((z && afahVar.g == 2) || (z2 && afahVar.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || afahVar.h != 3) {
                canvas.translate(0.0f, (f4 * (1.0f - f)) / 2.0f);
            }
            if (z2 || afahVar.h != 3) {
                f = 1.0f;
            }
        } else if (z2) {
            z2 = true;
            if (z) {
                canvas.scale(1.0f, -1.0f);
            } else {
                canvas.scale(1.0f, -1.0f);
            }
            if (z) {
                canvas.translate(0.0f, (f4 * (1.0f - f)) / 2.0f);
            } else {
                canvas.translate(0.0f, (f4 * (1.0f - f)) / 2.0f);
            }
            if (z2) {
                f = 1.0f;
            } else {
                f = 1.0f;
            }
        } else {
            f = 1.0f;
        }
        this.o = f;
    }

    @Override // defpackage.aezw
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
        int iH = afba.H(i, i2);
        this.n = false;
        afah afahVar = (afah) this.a;
        int i3 = afahVar.t;
        int iMin = Math.min(i3, afahVar.a);
        if (iMin <= 0 || iH == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iH);
        Integer num = afahVar.u;
        float f = iMin;
        k(canvas, paint, new ovo(new float[]{(this.g / 2.0f) - (num != null ? num.floatValue() + (i3 / 2.0f) : this.h / 2.0f), 0.0f}, new float[]{1.0f, 0.0f}), f, f, (this.i * f) / this.h, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // defpackage.aezw
    public final void e(Canvas canvas, Paint paint, aezv aezvVar, int i) {
        int iH = afba.H(aezvVar.c, i);
        this.n = aezvVar.h;
        float f = aezvVar.a;
        float f2 = aezvVar.b;
        int i2 = aezvVar.d;
        j(canvas, paint, f, f2, iH, i2, i2, aezvVar.e, aezvVar.f, true);
    }

    @Override // defpackage.aezw
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iH = afba.H(i, i2);
        this.n = false;
        j(canvas, paint, f, f2, iH, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.aezw
    public final void g() {
        Path path = this.b;
        path.rewind();
        afah afahVar = (afah) this.a;
        if (afahVar.c(this.n)) {
            int i = this.n ? afahVar.j : afahVar.k;
            float f = this.g;
            int i2 = (int) (f / i);
            this.l = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 << 1;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i4 + 2;
                path.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, 0.0f, f3, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.l / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.g, 0.0f);
        }
        this.d.setPath(path, false);
    }
}
