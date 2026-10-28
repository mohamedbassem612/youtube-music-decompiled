package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import com.google.android.libraries.multiplatform.elements.paintunit.ShaderUniformReader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ouz implements ovb {
    private static Paint a;
    private static float[] b;
    private static Path c;
    private static RectF d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private float j;
    private boolean k;
    private oun l;
    private float m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private int[] r;
    private float[] s;
    private LinearGradient t;
    private RuntimeShader u;

    public ouz(ShaderUniformReader shaderUniformReader) {
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
        int[] iArr = this.r;
        float[] fArr = this.s;
        if (iArr == null || fArr == null || iArr.length < 2) {
            return;
        }
        int i = this.g;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.h;
        int i5 = this.f;
        int i6 = i4 - i5;
        float f = this.m;
        float f2 = this.n;
        float f3 = this.o;
        float f4 = this.p;
        if (this.i && !this.q) {
            f = 1.0f - f;
            f3 = 1.0f - f3;
        }
        float f5 = i2;
        float f6 = i3;
        float f7 = i5;
        float f8 = i6;
        this.t = new LinearGradient((f * f6) + f5, f7 + (f2 * f8), f5 + (f3 * f6), f7 + (f4 * f8), iArr, fArr, Shader.TileMode.CLAMP);
    }

    private final void j() {
        int i = this.g;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.h;
        int i5 = this.f;
        int i6 = i4 - i5;
        if (i3 <= 0 || i6 <= 0) {
            return;
        }
        float f = this.m;
        float f2 = this.n;
        float f3 = this.o;
        float f4 = this.p;
        if (this.i && !this.q) {
            f = 1.0f - f;
            f3 = 1.0f - f3;
        }
        float f5 = i2;
        float f6 = i5;
        float f7 = i6;
        float f8 = f2 * f7;
        float f9 = f4 * f7;
        RuntimeShader runtimeShader = this.u;
        if (runtimeShader == null) {
            runtimeShader = new RuntimeShader("uniform vec2 u_start;\nuniform vec2 u_end;\nuniform int u_color_count;\nuniform vec4 u_colors[4];\nuniform float u_positions[4];\nhalf4 main(vec2 fragCoord) {\n  if (u_color_count <= 0) return half4(0.0);\n  if (u_color_count == 1) return u_colors[0];\n  vec2 dir = u_end - u_start;\n  float len2 = dot(dir, dir);\n  if (len2 <= 0.0) {\n    return u_colors[0];\n  }\n  float t = dot(fragCoord - u_start, dir) / len2;\n  if (t <= u_positions[0]) {\n    return u_colors[0];\n  }\n  float last_pos = u_positions[1];\n  vec4 last_color = u_colors[1];\n  if (u_color_count == 3) {\n    last_pos = u_positions[2];\n    last_color = u_colors[2];\n  } else if (u_color_count >= 4) {\n    last_pos = u_positions[3];\n    last_color = u_colors[3];\n  }\n  if (t >= last_pos) {\n    return last_color;\n  }\n  if (u_color_count >= 2 && t < u_positions[1]) {\n    float p0 = u_positions[0];\n    float p1 = u_positions[1];\n    float local_t = (p1 - p0 > 1e-5) ? (t - p0) / (p1 - p0) : 0.0;\n    return mix(u_colors[0], u_colors[1], local_t);\n  }\n  if (u_color_count >= 3 && t < u_positions[2]) {\n    float p0 = u_positions[1];\n    float p1 = u_positions[2];\n    float local_t = (p1 - p0 > 1e-5) ? (t - p0) / (p1 - p0) : 0.0;\n    return mix(u_colors[1], u_colors[2], local_t);\n  }\n  if (u_color_count >= 4 && t < u_positions[3]) {\n    float p0 = u_positions[2];\n    float p1 = u_positions[3];\n    float local_t = (p1 - p0 > 1e-5) ? (t - p0) / (p1 - p0) : 0.0;\n    return mix(u_colors[2], u_colors[3], local_t);\n  }\n  return last_color;\n}\n");
            this.u = runtimeShader;
        }
        int[] iArr = this.r;
        float[] fArr = this.s;
        if (iArr == null || fArr == null) {
            return;
        }
        float f10 = i3;
        runtimeShader.setFloatUniform("u_start", f5 + (f * f10), f6 + f8);
        this.u.setFloatUniform("u_end", (f3 * f10) + f5, f9 + f6);
        RuntimeShader runtimeShader2 = this.u;
        int length = iArr.length;
        runtimeShader2.setIntUniform("u_color_count", length);
        float[] fArr2 = new float[16];
        int iMin = Math.min(4, length);
        for (int i7 = 0; i7 < iMin; i7++) {
            int i8 = iArr[i7];
            int i9 = i7 << 2;
            float f11 = ((i8 >> 24) & 255) / 255.0f;
            fArr2[i9] = (((i8 >> 16) & 255) / 255.0f) * f11;
            fArr2[i9 + 1] = (((i8 >> 8) & 255) / 255.0f) * f11;
            fArr2[i9 + 2] = ((i8 & 255) / 255.0f) * f11;
            fArr2[i9 + 3] = f11;
        }
        this.u.setFloatUniform("u_colors", fArr2);
        float[] fArr3 = new float[4];
        for (int i10 = 0; i10 < iMin; i10++) {
            fArr3[i10] = fArr[i10];
        }
        this.u.setFloatUniform("u_positions", fArr3);
    }

    @Override // defpackage.ovb
    public final Shader a(boolean z, boolean z2) {
        int[] iArr = this.r;
        if (iArr == null || iArr.length < 2) {
            return null;
        }
        if (z || Build.VERSION.SDK_INT < 33 || !z2) {
            if (this.t == null) {
                i();
            }
            return this.t;
        }
        if (this.u == null) {
            j();
        }
        return this.u;
    }

    @Override // defpackage.ovb
    public final void b(Canvas canvas) {
        int[] iArr = this.r;
        if (iArr == null || iArr.length < 2) {
            return;
        }
        g();
        if (Build.VERSION.SDK_INT < 33 || !canvas.isHardwareAccelerated()) {
            if (this.t == null) {
                i();
            }
            LinearGradient linearGradient = this.t;
            if (linearGradient == null) {
                return;
            } else {
                a.setShader(linearGradient);
            }
        } else {
            if (this.u == null) {
                j();
            }
            RuntimeShader runtimeShader = this.u;
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
        int[] iArr = this.r;
        if (iArr == null || iArr.length < 2) {
            return;
        }
        if (this.t == null) {
            i();
        }
        if (this.t != null) {
            g();
            a.setShader(this.t);
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
            this.t = null;
            this.u = null;
        }
    }

    public final void f(ShaderUniformReader shaderUniformReader) {
        this.m = shaderUniformReader.a(0);
        this.n = shaderUniformReader.a(1);
        this.o = shaderUniformReader.a(2);
        this.p = shaderUniformReader.a(3);
        float fA = shaderUniformReader.a(4);
        float fA2 = shaderUniformReader.a(5);
        float fA3 = shaderUniformReader.a(6);
        float fA4 = shaderUniformReader.a(7);
        int iMin = Math.min(4, Math.max(0, shaderUniformReader.c(0)));
        this.q = shaderUniformReader.c(1) != 0;
        int iC = shaderUniformReader.c(2);
        int iC2 = shaderUniformReader.c(3);
        int iC3 = shaderUniformReader.c(4);
        int iC4 = shaderUniformReader.c(5);
        int[] iArr = new int[iMin];
        this.r = iArr;
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
        this.s = fArr;
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
        this.t = null;
        this.u = null;
    }

    public ouz() {
    }

    @Override // defpackage.ovb
    public final void h() {
    }
}
