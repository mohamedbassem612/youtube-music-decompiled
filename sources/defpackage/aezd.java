package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aezd extends aezw {
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m;
    private boolean n;
    private float o;
    private final RectF p;
    private final Pair q;

    public aezd(aezo aezoVar) {
        super(aezoVar);
        this.p = new RectF();
        this.q = new Pair(new ovo((short[]) null), new ovo((short[]) null));
    }

    private final int j() {
        aezo aezoVar = (aezo) this.a;
        return aezoVar.r + (aezoVar.s << 1);
    }

    private final void k(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        Canvas canvas2;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < 0.0f) {
            f7 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f8 = f7 + f6;
            if (f8 > 1.0f) {
                k(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                k(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f9 = (-0.99f) + f6;
        if (f9 >= 0.0f) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f6 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float f11 = this.o;
        float f12 = 1.0f - f11;
        float f13 = (1.0f - f6) * 0.0f;
        float f14 = f6 * f11;
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = (((f13 + f14) * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        float f15 = ((1.0f - f7) * f12) + f7;
        if (degrees3 > 0.0f) {
            aezo aezoVar = (aezo) this.a;
            boolean z2 = false;
            if (aezoVar.c(this.n) && z && f3 > 0.0f) {
                z2 = true;
            }
            float f16 = (f15 * 360.0f) + degrees2;
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f);
            float f17 = this.g;
            float f18 = f17 + f17;
            float f19 = degrees + degrees;
            if (degrees3 < f19) {
                float f20 = degrees3 / f19;
                float f21 = f16 + (degrees * f20);
                ovo ovoVar = new ovo((short[]) null);
                if (z2) {
                    PathMeasure pathMeasure = this.d;
                    float length = ((f21 / 360.0f) * pathMeasure.getLength()) / 2.0f;
                    float f22 = this.h * f3;
                    float f23 = this.i;
                    if (f23 != this.m || f22 != this.k) {
                        this.k = f22;
                        this.m = f23;
                        g();
                    }
                    pathMeasure.getPosTan(length, (float[]) ovoVar.c, (float[]) ovoVar.b);
                } else {
                    ovoVar.r(f21 + 90.0f);
                    ovoVar.o(-this.i);
                }
                paint.setStyle(Paint.Style.FILL);
                l(canvas, paint, ovoVar, f18, this.f, f20);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(aezoVar.f() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f24 = f16 + degrees;
            float f25 = degrees3 - f19;
            Pair pair = this.q;
            ((ovo) pair.first).q();
            ((ovo) pair.second).q();
            if (z2) {
                PathMeasure pathMeasure2 = this.d;
                Path path = this.c;
                float f26 = f24 / 360.0f;
                float f27 = f25 / 360.0f;
                float f28 = this.h * f3;
                int i4 = this.n ? aezoVar.j : aezoVar.k;
                float f29 = this.i;
                if (f29 != this.m || f28 != this.k || i4 != this.l) {
                    this.k = f28;
                    this.l = i4;
                    this.m = f29;
                    g();
                }
                path.rewind();
                float fB = ast.b(f27, 0.0f, 1.0f);
                if (aezoVar.c(this.n)) {
                    float f30 = f4 / ((float) ((((double) this.i) * 6.283185307179586d) / ((double) this.j)));
                    f26 += f30;
                    f5 = -(f30 * 360.0f);
                } else {
                    f5 = 0.0f;
                }
                float f31 = f26 % 1.0f;
                float length2 = (pathMeasure2.getLength() * f31) / 2.0f;
                float length3 = ((f31 + fB) * pathMeasure2.getLength()) / 2.0f;
                pathMeasure2.getSegment(length2, length3, path, true);
                ovo ovoVar2 = (ovo) pair.first;
                ovoVar2.q();
                pathMeasure2.getPosTan(length2, (float[]) ovoVar2.c, (float[]) ovoVar2.b);
                ovo ovoVar3 = (ovo) pair.second;
                ovoVar3.q();
                pathMeasure2.getPosTan(length3, (float[]) ovoVar3.c, (float[]) ovoVar3.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setRotate(f5);
                ovoVar2.r(f5);
                ovoVar3.r(f5);
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                ((ovo) pair.first).r(f24 + 90.0f);
                ((ovo) pair.first).o(-this.i);
                ((ovo) pair.second).r(f24 + f25 + 90.0f);
                ((ovo) pair.second).o(-this.i);
                RectF rectF = this.p;
                float f32 = this.i;
                float f33 = -f32;
                rectF.set(f33, f33, f32, f32);
                canvas.drawArc(rectF, f24, f25, false, paint);
                canvas2 = canvas;
            }
            if (aezoVar.f() || this.g <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            l(canvas2, paint, (ovo) pair.first, f18, this.f, 1.0f);
            l(canvas, paint, (ovo) pair.second, f18, this.f, 1.0f);
        }
    }

    private final void l(Canvas canvas, Paint paint, ovo ovoVar, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.f);
        float f4 = (this.g * fMin) / this.f;
        float f5 = -f;
        float f6 = f / 2.0f;
        float fMin2 = Math.min(f6, f4);
        RectF rectF = new RectF(f5 / 2.0f, (-fMin) / 2.0f, f6, fMin / 2.0f);
        canvas.save();
        float[] fArr = (float[]) ovoVar.c;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i((float[]) ovoVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // defpackage.aezw
    public final int a() {
        return j();
    }

    @Override // defpackage.aezw
    public final int b() {
        return j();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    @Override // defpackage.aezw
    public final void c(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float f2;
        float fWidth = rect.width();
        float fJ = j();
        float fHeight = rect.height();
        float fJ2 = j();
        aezo aezoVar = (aezo) this.a;
        int i = aezoVar.r;
        float f3 = (i / 2.0f) + aezoVar.s;
        float f4 = fWidth / fJ;
        float f5 = fHeight / fJ2;
        canvas.translate((f3 * f4) + rect.left, (f3 * f5) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(f4, f5);
        if (aezoVar.t != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f6 = -f3;
        canvas.clipRect(f6, f6, f3, f3);
        int i2 = aezoVar.a;
        float f7 = i2;
        this.f = f7 * f;
        this.g = Math.min(i2 / 2, aezoVar.a()) * f;
        this.h = aezoVar.l * f;
        float f8 = (i - i2) / 2.0f;
        this.i = f8;
        boolean z3 = true;
        if (z) {
            f2 = ((1.0f - f) * f7) / 2.0f;
            if ((z || aezoVar.g != 2) && !(z2 && aezoVar.h == 1)) {
                if (!z && aezoVar.g == 1) {
                    z3 = z2;
                } else if (z2 && aezoVar.h == 2) {
                }
                this.i = f8 - f2;
                z2 = z3;
            } else {
                this.i = f8 + f2;
            }
            if (z2 || aezoVar.h != 3) {
                f = 1.0f;
            }
        } else if (z2) {
            z2 = true;
            f2 = ((1.0f - f) * f7) / 2.0f;
            if (z) {
                if (!z) {
                    if (z2) {
                        this.i = f8 - f2;
                        z2 = z3;
                    }
                } else if (z2) {
                    this.i = f8 - f2;
                    z2 = z3;
                }
            } else if (!z) {
                if (z2) {
                    this.i = f8 - f2;
                    z2 = z3;
                }
            } else if (z2) {
                this.i = f8 - f2;
                z2 = z3;
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
    public final void e(Canvas canvas, Paint paint, aezv aezvVar, int i) {
        int iH = afba.H(aezvVar.c, i);
        canvas.save();
        canvas.rotate(aezvVar.g);
        this.n = aezvVar.h;
        float f = aezvVar.a;
        float f2 = aezvVar.b;
        int i2 = aezvVar.d;
        k(canvas, paint, f, f2, iH, i2, i2, aezvVar.e, aezvVar.f, true);
        canvas.restore();
    }

    @Override // defpackage.aezw
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iH = afba.H(i, i2);
        this.n = false;
        k(canvas, paint, f, f2, iH, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.aezw
    public final void g() {
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        for (int i = 0; i < 2; i++) {
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        aezo aezoVar = (aezo) this.a;
        if (aezoVar.c(this.n)) {
            PathMeasure pathMeasure = this.d;
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            int iMax = Math.max(3, (int) ((length / (this.n ? aezoVar.j : aezoVar.k)) / 2.0f)) << 1;
            this.j = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < iMax; i2++) {
                ovo ovoVar = new ovo((short[]) null);
                float f3 = i2;
                pathMeasure.getPosTan(this.j * f3, (float[]) ovoVar.c, (float[]) ovoVar.b);
                ovo ovoVar2 = new ovo((short[]) null);
                float f4 = this.j;
                pathMeasure.getPosTan((f3 * f4) + (f4 / 2.0f), (float[]) ovoVar2.c, (float[]) ovoVar2.b);
                arrayList.add(ovoVar);
                ovoVar2.o(f2 + f2);
                arrayList.add(ovoVar2);
            }
            arrayList.add((ovo) arrayList.get(0));
            ovo ovoVar3 = (ovo) arrayList.get(0);
            float[] fArr = (float[]) ovoVar3.c;
            path.moveTo(fArr[0], fArr[1]);
            int i3 = 1;
            while (i3 < arrayList.size()) {
                ovo ovoVar4 = (ovo) arrayList.get(i3);
                float f5 = this.j / 2.0f;
                ovo ovoVar5 = new ovo(ovoVar3);
                ovo ovoVar6 = new ovo(ovoVar4);
                float f6 = f5 * 0.48f;
                ovoVar5.p(f6);
                ovoVar6.p(-f6);
                float[] fArr2 = (float[]) ovoVar5.c;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                float[] fArr3 = (float[]) ovoVar6.c;
                float f9 = fArr3[0];
                float f10 = fArr3[1];
                float[] fArr4 = (float[]) ovoVar4.c;
                path.cubicTo(f7, f8, f9, f10, fArr4[0], fArr4[1]);
                i3++;
                ovoVar3 = ovoVar4;
            }
        }
        this.d.setPath(path, false);
    }

    @Override // defpackage.aezw
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
    }
}
