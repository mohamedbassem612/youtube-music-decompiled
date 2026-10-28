package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import com.google.android.libraries.multiplatform.elements.paintunit.ShaderUniformReader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ova implements ovb {
    private static Paint a;
    private static float[] b;
    private static Path c;
    private static RectF d;
    private float A;
    private float B;
    private float C;
    private RadialGradient D;
    private RuntimeShader E;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private float j;
    private boolean k;
    private oun l;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean w;
    private int[] x;
    private float[] y;
    private float z;
    private float m = 0.5f;
    private float n = 0.0f;
    private float o = 0.5f;
    private float p = 0.0f;
    private int u = 0;
    private int v = 0;

    public ova(ShaderUniformReader shaderUniformReader) {
        f(shaderUniformReader);
    }

    static final void g() {
        if (a == null) {
            Paint paint = new Paint();
            a = paint;
            paint.setStyle(Paint.Style.FILL);
            a.setAntiAlias(true);
        }
    }

    private final void i() {
        int[] iArr = this.x;
        float[] fArr = this.y;
        if (iArr == null || fArr == null || iArr.length < 2 || !k()) {
            return;
        }
        float fMax = Math.max(0.001f, this.B);
        float fMax2 = Math.max(0.001f, this.C);
        RadialGradient radialGradient = new RadialGradient(this.z, this.A, fMax, iArr, fArr, Shader.TileMode.CLAMP);
        if (Math.abs(fMax - fMax2) > 1.0E-4f) {
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, fMax2 / fMax, this.z, this.A);
            radialGradient.setLocalMatrix(matrix);
        }
        this.D = radialGradient;
    }

    private final void j() {
        if (k()) {
            RuntimeShader runtimeShader = this.E;
            if (runtimeShader == null) {
                runtimeShader = new RuntimeShader("uniform vec2 u_center;\nuniform vec2 u_radius;\nuniform int u_color_count;\nuniform vec4 u_colors[4];\nuniform float u_positions[4];\nhalf4 main(vec2 fragCoord) {\n  if (u_color_count <= 0) {\n    return half4(0.0);\n  }\n  if (u_color_count == 1) {\n    return u_colors[0];\n  }\n  if (u_radius.x <= 0.0 || u_radius.y <= 0.0) {\n    return u_colors[0];\n  }\n  vec2 diff = (fragCoord - u_center) / u_radius;\n  float t = length(diff);\n  if (t <= u_positions[0]) {\n    return u_colors[0];\n  }\n  float last_pos = u_positions[1];\n  vec4 last_color = u_colors[1];\n  if (u_color_count == 3) {\n    last_pos = u_positions[2];\n    last_color = u_colors[2];\n  } else if (u_color_count >= 4) {\n    last_pos = u_positions[3];\n    last_color = u_colors[3];\n  }\n  if (t >= last_pos) {\n    return last_color;\n  }\n  if (u_color_count >= 2 && t < u_positions[1]) {\n    float p0 = u_positions[0];\n    float p1 = u_positions[1];\n    float local_t = (p1 - p0 > 1e-5) ? (t - p0) / (p1 - p0) : 0.0;\n    return mix(u_colors[0], u_colors[1], local_t);\n  }\n  if (u_color_count >= 3 && t < u_positions[2]) {\n    float p0 = u_positions[1];\n    float p1 = u_positions[2];\n    float local_t = (p1 - p0 > 1e-5) ? (t - p0) / (p1 - p0) : 0.0;\n    return mix(u_colors[1], u_colors[2], local_t);\n  }\n  if (u_color_count >= 4 && t < u_positions[3]) {\n    float p0 = u_positions[2];\n    float p1 = u_positions[3];\n    float local_t = (p1 - p0 > 1e-5) ? (t - p0) / (p1 - p0) : 0.0;\n    return mix(u_colors[2], u_colors[3], local_t);\n  }\n  return last_color;\n}\n");
                this.E = runtimeShader;
            }
            int[] iArr = this.x;
            float[] fArr = this.y;
            if (iArr == null || fArr == null) {
                return;
            }
            runtimeShader.setFloatUniform("u_center", this.z, this.A);
            this.E.setFloatUniform("u_radius", this.B, this.C);
            RuntimeShader runtimeShader2 = this.E;
            int length = iArr.length;
            runtimeShader2.setIntUniform("u_color_count", length);
            float[] fArr2 = new float[16];
            int iMin = Math.min(4, length);
            for (int i = 0; i < iMin; i++) {
                int i2 = iArr[i];
                int i3 = i << 2;
                float f = ((i2 >> 24) & 255) / 255.0f;
                fArr2[i3] = (((i2 >> 16) & 255) / 255.0f) * f;
                fArr2[i3 + 1] = (((i2 >> 8) & 255) / 255.0f) * f;
                fArr2[i3 + 2] = ((i2 & 255) / 255.0f) * f;
                fArr2[i3 + 3] = f;
            }
            this.E.setFloatUniform("u_colors", fArr2);
            float[] fArr3 = new float[4];
            for (int i4 = 0; i4 < iMin; i4++) {
                fArr3[i4] = fArr[i4];
            }
            this.E.setFloatUniform("u_positions", fArr3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180  */
    /* JADX WARN: Code duplicated, block: B:69:0x0189  */
    private final boolean k() {
        float f;
        float f2;
        float f3;
        float f4;
        float fAbs;
        float fAbs2;
        float fAbs3;
        float fAbs4;
        float f5;
        float fMin;
        float fMin2;
        float fMin3;
        float fMin4;
        double dSqrt;
        float fMin5;
        float f6;
        float f7;
        float f8;
        float f9;
        double dSqrt2;
        int i = this.g;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.h;
        int i5 = this.f;
        int i6 = i4 - i5;
        if (i3 <= 0 || i6 <= 0) {
            return false;
        }
        float f10 = this.m;
        float f11 = this.n;
        if (this.i && !this.w) {
            f10 = 1.0f - f10;
            f11 = -f11;
        }
        float f12 = i2;
        float f13 = i3;
        float f14 = (f10 * f13) + f12 + f11;
        this.z = f14;
        float f15 = i5;
        float f16 = i6;
        float f17 = (this.o * f16) + f15 + this.p;
        this.A = f17;
        int i7 = this.v;
        if (i7 == 0) {
            float f18 = this.r;
            if (f18 > 0.0f || this.q > 0.0f || this.t > 0.0f || this.s > 0.0f) {
                fMin = (this.q * f13) + f18;
                fMin2 = (this.s * f16) + this.t;
                if (this.u == 1) {
                    fMin = Math.max(fMin, fMin2);
                    fMin2 = fMin;
                }
                f5 = 1.0E-5f;
            } else {
                f = f17 - f15;
                f2 = f14 - f12;
                if (i7 == 0) {
                    i7 = 4;
                }
                f3 = f13 - f2;
                f4 = f16 - f;
                fAbs = Math.abs(f2);
                fAbs2 = Math.abs(f3);
                fAbs3 = Math.abs(f);
                fAbs4 = Math.abs(f4);
                f5 = 1.0E-5f;
                if (this.u == 1) {
                    if (i7 != 1) {
                        fMin5 = Math.min(Math.min(fAbs, fAbs2), Math.min(fAbs3, fAbs4));
                    } else if (i7 != 2) {
                        float f19 = f4 * f4;
                        float f20 = f2 * f2;
                        float f21 = f3 * f3;
                        float f22 = f * f;
                        f6 = f20 + f19;
                        f7 = f20 + f22;
                        f8 = f19 + f21;
                        f9 = f21 + f22;
                        if (i7 != 3) {
                            dSqrt2 = Math.sqrt(Math.max(Math.max(f7, f9), Math.max(f6, f8)));
                        } else {
                            dSqrt2 = Math.sqrt(Math.min(Math.min(f7, f9), Math.min(f6, f8)));
                        }
                        fMin5 = (float) dSqrt2;
                    } else {
                        fMin5 = Math.max(Math.max(fAbs, fAbs2), Math.max(fAbs3, fAbs4));
                    }
                    fMin = fMin5;
                    fMin2 = fMin;
                } else if (i7 != 1) {
                    fMin = Math.min(fAbs, fAbs2);
                    fMin2 = Math.min(fAbs3, fAbs4);
                } else if (i7 != 2) {
                    fMin = Math.max(fAbs, fAbs2);
                    fMin2 = Math.max(fAbs3, fAbs4);
                } else if (i7 != 3) {
                    fMin3 = Math.max(fAbs, fAbs2);
                    fMin4 = Math.max(fAbs3, fAbs4);
                    if (fMin3 > 1.0E-5f || fMin4 <= 1.0E-5f) {
                        fMin = Math.max(fMin3, 1.0f);
                        fMin2 = Math.max(fMin4, 1.0f);
                    } else {
                        float f23 = -f;
                        float f24 = -f2;
                        float[] fArr = {f24, f3, f24, f3};
                        float[] fArr2 = {f23, f23, f4, f4};
                        float f25 = 0.0f;
                        for (int i8 = 0; i8 < 4; i8++) {
                            float f26 = fArr[i8] / fMin3;
                            float f27 = fArr2[i8] / fMin4;
                            float f28 = (f26 * f26) + (f27 * f27);
                            if (f28 > f25) {
                                f25 = f28;
                            }
                        }
                        dSqrt = Math.sqrt(f25);
                        float f29 = (float) dSqrt;
                        fMin = fMin3 * f29;
                        fMin2 = f29 * fMin4;
                    }
                } else {
                    fMin3 = Math.min(fAbs, fAbs2);
                    fMin4 = Math.min(fAbs3, fAbs4);
                    if (fMin3 > 1.0E-5f || fMin4 <= 1.0E-5f) {
                        fMin = Math.max(fMin3, 1.0f);
                        fMin2 = Math.max(fMin4, 1.0f);
                    } else {
                        float f30 = -f;
                        float f31 = -f2;
                        float[] fArr3 = {f31, f3, f31, f3};
                        float[] fArr4 = {f30, f30, f4, f4};
                        float f32 = Float.MAX_VALUE;
                        for (int i9 = 0; i9 < 4; i9++) {
                            float f33 = fArr3[i9] / fMin3;
                            float f34 = fArr4[i9] / fMin4;
                            float f35 = (f33 * f33) + (f34 * f34);
                            if (f35 < f32) {
                                f32 = f35;
                            }
                        }
                        dSqrt = Math.sqrt(f32);
                        float f210 = (float) dSqrt;
                        fMin = fMin3 * f210;
                        fMin2 = f210 * fMin4;
                    }
                }
            }
        } else {
            f = f17 - f15;
            f2 = f14 - f12;
            if (i7 == 0) {
                i7 = 4;
            }
            f3 = f13 - f2;
            f4 = f16 - f;
            fAbs = Math.abs(f2);
            fAbs2 = Math.abs(f3);
            fAbs3 = Math.abs(f);
            fAbs4 = Math.abs(f4);
            f5 = 1.0E-5f;
            if (this.u == 1) {
                if (i7 != 1) {
                    fMin5 = Math.min(Math.min(fAbs, fAbs2), Math.min(fAbs3, fAbs4));
                } else if (i7 != 2) {
                    float f110 = f4 * f4;
                    float f211 = f2 * f2;
                    float f212 = f3 * f3;
                    float f213 = f * f;
                    f6 = f211 + f110;
                    f7 = f211 + f213;
                    f8 = f110 + f212;
                    f9 = f212 + f213;
                    if (i7 != 3) {
                        dSqrt2 = Math.sqrt(Math.max(Math.max(f7, f9), Math.max(f6, f8)));
                    } else {
                        dSqrt2 = Math.sqrt(Math.min(Math.min(f7, f9), Math.min(f6, f8)));
                    }
                    fMin5 = (float) dSqrt2;
                } else {
                    fMin5 = Math.max(Math.max(fAbs, fAbs2), Math.max(fAbs3, fAbs4));
                }
                fMin = fMin5;
                fMin2 = fMin;
            } else if (i7 != 1) {
                fMin = Math.min(fAbs, fAbs2);
                fMin2 = Math.min(fAbs3, fAbs4);
            } else if (i7 != 2) {
                fMin = Math.max(fAbs, fAbs2);
                fMin2 = Math.max(fAbs3, fAbs4);
            } else if (i7 != 3) {
                fMin3 = Math.max(fAbs, fAbs2);
                fMin4 = Math.max(fAbs3, fAbs4);
                if (fMin3 > 1.0E-5f) {
                }
                fMin = Math.max(fMin3, 1.0f);
                fMin2 = Math.max(fMin4, 1.0f);
            } else {
                fMin3 = Math.min(fAbs, fAbs2);
                fMin4 = Math.min(fAbs3, fAbs4);
                if (fMin3 > 1.0E-5f) {
                }
                fMin = Math.max(fMin3, 1.0f);
                fMin2 = Math.max(fMin4, 1.0f);
            }
        }
        if (fMin <= f5) {
            fMin = f5;
        }
        float f36 = fMin2 <= f5 ? f5 : fMin2;
        this.B = fMin;
        this.C = f36;
        return true;
    }

    @Override // defpackage.ovb
    public final Shader a(boolean z, boolean z2) {
        int[] iArr = this.x;
        if (iArr == null || iArr.length < 2) {
            return null;
        }
        if (z || Build.VERSION.SDK_INT < 33 || !z2) {
            if (this.D == null) {
                i();
            }
            return this.D;
        }
        if (this.E == null) {
            j();
        }
        return this.E;
    }

    @Override // defpackage.ovb
    public final void b(Canvas canvas) {
        int[] iArr = this.x;
        if (iArr == null || iArr.length < 2) {
            return;
        }
        g();
        if (Build.VERSION.SDK_INT < 33 || !canvas.isHardwareAccelerated()) {
            if (this.D == null) {
                i();
            }
            RadialGradient radialGradient = this.D;
            if (radialGradient == null) {
                return;
            } else {
                a.setShader(radialGradient);
            }
        } else {
            if (this.E == null) {
                j();
            }
            RuntimeShader runtimeShader = this.E;
            if (runtimeShader == null) {
                return;
            } else {
                a.setShader(runtimeShader);
            }
        }
        d(canvas, a);
    }

    @Override // defpackage.ovb
    public final void c(Canvas canvas) {
        int[] iArr = this.x;
        if (iArr == null || iArr.length < 2) {
            return;
        }
        if (this.D == null) {
            i();
        }
        if (this.D != null) {
            g();
            a.setShader(this.D);
            d(canvas, a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    @Override // defpackage.ovb
    public final void d(Canvas canvas, Paint paint) {
        oun ounVar = this.l;
        boolean z = false;
        if (ounVar != null && ounVar.f()) {
            z = true;
        }
        if (ounVar == null) {
            if (this.j <= 0.0f) {
                canvas.drawRect(this.e, this.f, this.g, this.h, paint);
                return;
            }
        } else {
            if (z) {
                Path path = c;
                if (path == null) {
                    path = new Path();
                    c = path;
                }
                path.reset();
                float f = this.e;
                float f2 = this.f;
                float f3 = this.g;
                float f4 = this.h;
                RectF rectF = d;
                if (rectF == null) {
                    rectF = new RectF();
                    d = rectF;
                }
                rectF.set(f, f2, f3, f4);
                ounVar.c(d, path, Path.Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            if (!ounVar.e()) {
                if (this.j <= 0.0f) {
                    canvas.drawRect(this.e, this.f, this.g, this.h, paint);
                    return;
                }
            }
        }
        if (ounVar == null) {
            if (!this.k) {
                float f5 = this.e;
                float f6 = this.f;
                float f7 = this.g;
                float f8 = this.h;
                float f9 = this.j;
                canvas.drawRoundRect(f5, f6, f7, f8, f9, f9, paint);
                return;
            }
            float f10 = this.j;
            int i = this.g;
            int i2 = this.e;
            int i3 = this.h;
            int i4 = this.f;
            canvas.drawRoundRect(i2, i4, i, i3, (i - i2) * f10, f10 * (i3 - i4), paint);
            return;
        }
        float[] fArr = b;
        if (fArr == null) {
            fArr = new float[8];
            b = fArr;
        }
        float[] fArr2 = fArr;
        ounVar.d(this.g - this.e, this.h - this.f, fArr2);
        if (fArr2 == null) {
            canvas.drawRect(this.e, this.f, this.g, this.h, paint);
            return;
        }
        Path path2 = c;
        if (path2 == null) {
            path2 = new Path();
            c = path2;
        }
        Path path3 = path2;
        path3.reset();
        path3.addRoundRect(this.e, this.f, this.g, this.h, fArr2, Path.Direction.CW);
        canvas.drawPath(path3, paint);
    }

    @Override // defpackage.ovb
    public final void e(int i, int i2, int i3, int i4, boolean z, float f, boolean z2, oun ounVar) {
        boolean z3 = (this.e == i && this.f == i2 && this.g == i3 && this.h == i4) ? false : true;
        boolean z4 = this.i;
        boolean z5 = (this.j == f && this.k == z2 && this.l == ounVar) ? false : true;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = z;
        this.j = f;
        this.k = z2;
        this.l = ounVar;
        if (z3 || z4 != z || z5) {
            this.D = null;
            this.E = null;
        }
    }

    public final void f(ShaderUniformReader shaderUniformReader) {
        this.m = shaderUniformReader.a(0);
        this.n = shaderUniformReader.a(1);
        this.o = shaderUniformReader.a(2);
        this.p = shaderUniformReader.a(3);
        this.q = shaderUniformReader.a(4);
        this.r = shaderUniformReader.a(5);
        this.s = shaderUniformReader.a(6);
        this.t = shaderUniformReader.a(7);
        float fA = shaderUniformReader.a(8);
        float fA2 = shaderUniformReader.a(9);
        float fA3 = shaderUniformReader.a(10);
        float fA4 = shaderUniformReader.a(11);
        int iMin = Math.min(4, Math.max(0, shaderUniformReader.c(0)));
        this.w = shaderUniformReader.c(1) != 0;
        this.u = shaderUniformReader.c(2);
        this.v = shaderUniformReader.c(3);
        int iC = shaderUniformReader.c(4);
        int iC2 = shaderUniformReader.c(5);
        int iC3 = shaderUniformReader.c(6);
        int iC4 = shaderUniformReader.c(7);
        int[] iArr = new int[iMin];
        this.x = iArr;
        if (iMin > 0) {
            iArr[0] = iC;
        }
        if (iMin >= 2) {
            iArr[1] = iC2;
        }
        if (iMin >= 3) {
            iArr[2] = iC3;
        }
        if (iMin >= 4) {
            iArr[3] = iC4;
        }
        float[] fArr = new float[iMin];
        this.y = fArr;
        if (iMin > 0) {
            fArr[0] = fA;
        }
        if (iMin >= 2) {
            fArr[1] = fA2;
        }
        if (iMin >= 3) {
            fArr[2] = fA3;
        }
        if (iMin >= 4) {
            fArr[3] = fA4;
        }
        this.D = null;
        this.E = null;
    }

    @Override // defpackage.ovb
    public final void h() {
    }

    public ova() {
    }
}
