package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import java.util.List;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oum implements PaintUnit {
    private static final Paint k;
    private static final RectF l;
    private static final RectF m;
    private static Path n;
    private static float[] o;
    private static float[] p;
    private static final float[] q;
    public float a;
    public oun c;
    public int d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    private float r = 0.0f;
    public boolean b = false;

    static {
        Paint paint = new Paint();
        if (Build.VERSION.SDK_INT < 29) {
            paint.setStyle(Paint.Style.STROKE);
        }
        paint.setColor(0);
        paint.setAntiAlias(true);
        k = paint;
        l = new RectF();
        m = new RectF();
        q = new float[8];
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ List C(mew mewVar) {
        return null;
    }

    public final void a(float f) {
        this.e = f;
        this.r = f / 2.0f;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        if ((Memory.peekByte(FlagServices.b().c + 91) == 0 || (this.e > 0.0f && (this.d & (-16777216)) != 0 && this.f < this.h && this.g < this.i)) && this.e > 0.0f) {
            Paint paint = k;
            paint.setColor(this.d);
            oun ounVar = this.c;
            int i = 0;
            boolean z2 = (ounVar != null && ounVar.e()) || this.a > 0.0f;
            boolean z3 = ounVar != null && ounVar.f();
            RectF rectF = l;
            rectF.set(this.f, this.g, this.h, this.i);
            if (z3) {
                Path path = n;
                if (path == null) {
                    n = new Path();
                } else {
                    path.reset();
                }
                Path path2 = n;
                ounVar.c(rectF, path2, Path.Direction.CW);
                float f4 = this.e;
                Path.Direction direction = Path.Direction.CCW;
                if (ounVar.f()) {
                    float[] fArr = oun.a;
                    ounVar.d(rectF.width(), rectF.height(), fArr);
                    float f5 = fArr[0] + fArr[2];
                    float fMin = f5 > rectF.width() ? Math.min(1.0f, rectF.width() / f5) : 1.0f;
                    float f6 = fArr[6] + fArr[4];
                    if (f6 > rectF.width()) {
                        fMin = Math.min(fMin, rectF.width() / f6);
                    }
                    float f7 = fArr[1] + fArr[7];
                    if (f7 > rectF.height()) {
                        fMin = Math.min(fMin, rectF.height() / f7);
                    }
                    float f8 = fArr[3] + fArr[5];
                    if (f8 > rectF.height()) {
                        fMin = Math.min(fMin, rectF.height() / f8);
                    }
                    if (fMin < 1.0f) {
                        for (int i2 = 0; i2 < 8; i2++) {
                            fArr[i2] = fArr[i2] * fMin;
                        }
                    }
                    z = true;
                    float[] fArr2 = {ounVar.a(fArr[0], f4, ounVar.m), ounVar.a(fArr[1], f4, ounVar.m), ounVar.a(fArr[2], f4, ounVar.n), ounVar.a(fArr[3], f4, ounVar.n), ounVar.a(fArr[4], f4, ounVar.o), ounVar.a(fArr[5], f4, ounVar.o), ounVar.a(fArr[6], f4, ounVar.p), ounVar.a(fArr[7], f4, ounVar.p)};
                    RectF rectF2 = new RectF(rectF.left + f4, rectF.top + f4, rectF.right - f4, rectF.bottom - f4);
                    Path.Direction direction2 = Path.Direction.CCW;
                    float f9 = rectF2.left;
                    if (direction == direction2) {
                        float f10 = f9 + fArr2[0];
                        float f11 = rectF2.top;
                        float f12 = fArr2[1];
                        ounVar.b(path2, f10, f11 + f12, fArr2[0], f12, ounVar.m, 3.1415927f, true, direction);
                        float f13 = rectF2.left + fArr2[6];
                        float f14 = rectF2.bottom;
                        float f15 = fArr2[7];
                        ounVar.b(path2, f13, f14 - f15, fArr2[6], f15, ounVar.p, 1.5707964f, false, direction);
                        float f16 = rectF2.right - fArr2[4];
                        float f17 = rectF2.bottom;
                        float f18 = fArr2[5];
                        ounVar.b(path2, f16, f17 - f18, fArr2[4], f18, ounVar.o, 0.0f, false, direction);
                        float f19 = rectF2.right - fArr2[2];
                        float f20 = rectF2.top;
                        float f21 = fArr2[3];
                        ounVar.b(path2, f19, f20 + f21, fArr2[2], f21, ounVar.n, 4.712389f, false, direction);
                    } else {
                        float f22 = f9 + fArr2[0];
                        float f23 = rectF2.top;
                        float f24 = fArr2[1];
                        ounVar.b(path2, f22, f23 + f24, fArr2[0], f24, ounVar.m, 3.1415927f, true, direction);
                        float f25 = rectF2.right - fArr2[2];
                        float f26 = rectF2.top;
                        float f27 = fArr2[3];
                        ounVar.b(path2, f25, f26 + f27, fArr2[2], f27, ounVar.n, 4.712389f, false, direction);
                        float f28 = rectF2.right - fArr2[4];
                        float f29 = rectF2.bottom;
                        float f30 = fArr2[5];
                        ounVar.b(path2, f28, f29 - f30, fArr2[4], f30, ounVar.o, 0.0f, false, direction);
                        float f31 = rectF2.left + fArr2[6];
                        float f32 = rectF2.bottom;
                        float f33 = fArr2[7];
                        ounVar.b(path2, f31, f32 - f33, fArr2[6], f33, ounVar.p, 1.5707964f, false, direction);
                    }
                    path2.close();
                } else {
                    z = true;
                    float[] fArr3 = oun.a;
                    ounVar.d(rectF.width(), rectF.height(), fArr3);
                    float[] fArr4 = new float[8];
                    for (int i3 = 8; i < i3; i3 = 8) {
                        fArr4[i] = Math.max(0.0f, fArr3[i] - f4);
                        i++;
                    }
                    path2.addRoundRect(new RectF(rectF.left + f4, rectF.top + f4, rectF.right - f4, rectF.bottom - f4), fArr4, Path.Direction.CW);
                }
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(z);
                canvas.drawPath(path2, paint);
                return;
            }
            if (Build.VERSION.SDK_INT < 29) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.e);
                if (!z2) {
                    float f34 = this.f;
                    float f35 = this.r;
                    canvas.drawRect(f34 + f35, this.g + f35, this.h - f35, this.i - f35, paint);
                    return;
                }
                if (ounVar == null) {
                    boolean z4 = this.b;
                    float f36 = this.a;
                    if (z4) {
                        f = (this.h - this.f) * f36;
                        f36 *= this.i - this.g;
                    } else {
                        f = f36;
                    }
                    float f37 = this.f;
                    float f38 = this.r;
                    canvas.drawRoundRect(f37 + f38, this.g + f38, this.h - f38, this.i - f38, f - f38, f36 - f38, paint);
                    return;
                }
                float[] fArr5 = o;
                if (fArr5 == null) {
                    fArr5 = new float[8];
                    o = fArr5;
                }
                float[] fArr6 = fArr5;
                this.c.d(this.h - this.f, this.i - this.g, fArr6);
                if (fArr6 == null) {
                    float f39 = this.f;
                    float f40 = this.r;
                    canvas.drawRect(f39 + f40, this.g + f40, this.h - f40, this.i - f40, paint);
                    return;
                }
                for (int i4 = 0; i4 < 8; i4++) {
                    fArr6[i4] = Math.max(0.0f, fArr6[i4] - this.r);
                }
                if (Memory.peekByte(FlagServices.b().c + 91) == 0) {
                    Path path3 = new Path();
                    float f41 = this.f;
                    float f42 = this.r;
                    path3.addRoundRect(f41 + f42, this.g + f42, this.h - f42, this.i - f42, fArr6, Path.Direction.CW);
                    canvas.drawPath(path3, paint);
                    return;
                }
                float f43 = fArr6[0];
                float f44 = fArr6[1];
                if (fArr6[2] == f43 && fArr6[4] == f43 && fArr6[6] == f43 && fArr6[3] == f44 && fArr6[5] == f44 && fArr6[7] == f44) {
                    float f45 = this.f;
                    float f46 = this.r;
                    canvas.drawRoundRect(f45 + f46, this.g + f46, this.h - f46, this.i - f46, f43, f44, paint);
                    return;
                }
                Path path4 = n;
                if (path4 == null) {
                    n = new Path();
                } else {
                    path4.reset();
                }
                Path path5 = n;
                float f47 = this.f;
                float f48 = this.r;
                path5.addRoundRect(f47 + f48, this.g + f48, this.h - f48, this.i - f48, fArr6, Path.Direction.CW);
                canvas.drawPath(path5, paint);
                return;
            }
            rectF.set(this.f, this.g, this.h, this.i);
            RectF rectF3 = m;
            float f49 = this.f;
            float f50 = this.e;
            rectF3.set(f49 + f50, this.g + f50, this.h - f50, this.i - f50);
            if (this.j) {
                if (!z2) {
                    canvas.drawDoubleRoundRect(rectF, 0.0f, 0.0f, rectF3, 0.0f, 0.0f, paint);
                    return;
                }
                if (ounVar == null) {
                    boolean z5 = this.b;
                    float f51 = this.a;
                    if (z5) {
                        f3 = (this.h - this.f) * f51;
                        f51 *= this.i - this.g;
                    } else {
                        f3 = f51;
                    }
                    float f52 = this.e;
                    canvas.drawDoubleRoundRect(rectF, 0.0f, 0.0f, rectF3, f3 - f52, f51 - f52, paint);
                    return;
                }
                float[] fArr7 = o;
                if (fArr7 == null) {
                    fArr7 = new float[8];
                    o = fArr7;
                }
                ounVar.d(this.h - this.f, this.i - this.g, fArr7);
                float[] fArr8 = p;
                if (fArr8 == null) {
                    fArr8 = new float[8];
                    p = fArr8;
                }
                int i5 = 0;
                for (int i6 = 8; i5 < i6; i6 = 8) {
                    fArr8[i5] = Math.max(0.0f, fArr7[i5] - this.e);
                    i5++;
                }
                if (Memory.peekByte(FlagServices.b().c + 91) == 0) {
                    canvas.drawDoubleRoundRect(rectF, 0.0f, 0.0f, rectF3, 0.0f, 0.0f, paint);
                    return;
                }
                float f53 = fArr8[0];
                float f54 = fArr8[1];
                if (fArr8[2] == f53 && fArr8[4] == f53 && fArr8[6] == f53 && fArr8[3] == f54 && fArr8[5] == f54 && fArr8[7] == f54) {
                    canvas.drawDoubleRoundRect(rectF, 0.0f, 0.0f, rectF3, f53, f54, paint);
                    return;
                } else {
                    canvas.drawDoubleRoundRect(rectF, q, rectF3, fArr8, paint);
                    return;
                }
            }
            if (!z2) {
                canvas.drawDoubleRoundRect(rectF, 0.0f, 0.0f, rectF3, 0.0f, 0.0f, paint);
                return;
            }
            if (ounVar == null) {
                boolean z6 = this.b;
                float f55 = this.a;
                if (z6) {
                    f2 = (this.h - this.f) * f55;
                    f55 *= this.i - this.g;
                } else {
                    f2 = f55;
                }
                float f56 = this.e;
                canvas.drawDoubleRoundRect(rectF, f2, f55, rectF3, f2 - f56, f55 - f56, paint);
                return;
            }
            float[] fArr9 = o;
            if (fArr9 == null) {
                fArr9 = new float[8];
                o = fArr9;
            }
            float[] fArr10 = fArr9;
            ounVar.d(this.h - this.f, this.i - this.g, fArr10);
            float[] fArr11 = p;
            if (fArr11 == null) {
                fArr11 = new float[8];
                p = fArr11;
            }
            float[] fArr12 = fArr11;
            int i7 = 0;
            for (int i8 = 8; i7 < i8; i8 = 8) {
                fArr12[i7] = Math.max(0.0f, fArr10[i7] - this.e);
                i7++;
            }
            if (Memory.peekByte(FlagServices.b().c + 91) != 0) {
                float f57 = fArr10[0];
                float f58 = fArr10[1];
                if (fArr10[2] == f57 && fArr10[4] == f57 && fArr10[6] == f57 && fArr10[3] == f58 && fArr10[5] == f58 && fArr10[7] == f58) {
                    float f59 = fArr12[0];
                    float f60 = fArr12[1];
                    if (fArr12[2] == f59 && fArr12[4] == f59 && fArr12[6] == f59 && fArr12[3] == f60 && fArr12[5] == f60 && fArr12[7] == f60) {
                        canvas.drawDoubleRoundRect(rectF, f57, f58, rectF3, f59, f60, paint);
                        return;
                    }
                }
            }
            canvas.drawDoubleRoundRect(rectF, fArr10, rectF3, fArr12, paint);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean ic() {
        return true;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ atoc m() {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean o(float f) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final int p() {
        return -1;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final Rect q() {
        return new Rect(this.f, this.g, this.h, this.i);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ PaintUnitOwner r() {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void t(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean x(long j, long j2, View view) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean y(MotionEvent motionEvent, View view) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ mew z(float f, float f2, int i) {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ void A() {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void B(mew mewVar) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void e(boolean z) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void f(PaintUnitOwner paintUnitOwner) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void w(int i) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void v(agfr agfrVar, ovd ovdVar) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void u(int[] iArr, float f, float f2) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i, int i2, int i3, int i4) {
    }
}
