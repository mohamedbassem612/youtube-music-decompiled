package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dtl {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final dtj d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final afv l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public dtl(dtl dtlVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        afv afvVar = new afv();
        this.l = afvVar;
        this.d = new dtj(dtlVar.d, afvVar);
        this.m = new Path(dtlVar.m);
        this.n = new Path(dtlVar.n);
        this.e = dtlVar.e;
        this.f = dtlVar.f;
        this.g = dtlVar.g;
        this.h = dtlVar.h;
        int i = dtlVar.q;
        this.q = 0;
        this.i = dtlVar.i;
        this.j = dtlVar.j;
        String str = dtlVar.j;
        if (str != null) {
            afvVar.put(str, this);
        }
        this.k = dtlVar.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(dtj dtjVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        Matrix matrix2 = dtjVar.a;
        matrix2.set(matrix);
        matrix2.preConcat(dtjVar.j);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = dtjVar.b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            dtp dtpVar = (dtp) arrayList.get(i4);
            if (dtpVar instanceof dtj) {
                a((dtj) dtpVar, matrix2, canvas, i, i2);
            } else {
                if (dtpVar instanceof dtk) {
                    dtk dtkVar = (dtk) dtpVar;
                    float f2 = i / this.g;
                    float f3 = i2 / this.h;
                    Matrix matrix3 = this.o;
                    float fMin = Math.min(f2, f3);
                    matrix3.set(matrix2);
                    matrix3.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    boolean z = c;
                    i3 = i4;
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = fArr[z ? 1 : 0];
                    float f5 = fArr[1];
                    float f6 = fArr[2];
                    float f7 = f4 * fArr[3];
                    float f8 = f5 * f6;
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f7 - f8) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.m;
                        path.reset();
                        avx[] avxVarArr = dtkVar.m;
                        if (avxVarArr != null) {
                            avd.a(avxVarArr, path);
                        }
                        Path path2 = this.n;
                        path2.reset();
                        if (dtkVar.a()) {
                            path2.setFillType(dtkVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                            matrix2 = matrix2;
                        } else {
                            dti dtiVar = (dti) dtkVar;
                            float f9 = dtiVar.e;
                            if (f9 == 0.0f && dtiVar.f == 1.0f) {
                                matrix2 = matrix2;
                            } else {
                                float f10 = dtiVar.g;
                                float f11 = (f9 + f10) % 1.0f;
                                float f12 = (dtiVar.f + f10) % 1.0f;
                                PathMeasure pathMeasure = this.p;
                                PathMeasure pathMeasure2 = pathMeasure;
                                if (pathMeasure == null) {
                                    PathMeasure pathMeasure3 = new PathMeasure();
                                    this.p = pathMeasure3;
                                    pathMeasure2 = pathMeasure3;
                                }
                                pathMeasure2.setPath(path, z);
                                float length = this.p.getLength();
                                float f13 = f11 * length;
                                float f14 = f12 * length;
                                path.reset();
                                PathMeasure pathMeasure4 = this.p;
                                if (f13 > f14) {
                                    pathMeasure4.getSegment(f13, length, path, true);
                                    f = 0.0f;
                                    this.p.getSegment(0.0f, f14, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure4.getSegment(f13, f14, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix3);
                            if (dtiVar.l.k()) {
                                yre yreVar = dtiVar.l;
                                if (this.c == null) {
                                    Paint paint = new Paint(1);
                                    this.c = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.c;
                                if (yreVar.h()) {
                                    Shader shader = (Shader) yreVar.c;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(dtiVar.d * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    paint2.setColor(dto.a(yreVar.a, dtiVar.d));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(dtiVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            if (dtiVar.k.k()) {
                                yre yreVar2 = dtiVar.k;
                                if (this.b == null) {
                                    Paint paint3 = new Paint(1);
                                    this.b = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.b;
                                Paint.Join join = dtiVar.i;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = dtiVar.h;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(dtiVar.j);
                                if (yreVar2.h()) {
                                    Shader shader2 = (Shader) yreVar2.c;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(dtiVar.c * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    paint4.setColor(dto.a(yreVar2.a, dtiVar.c));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(dtiVar.b * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    } else {
                        matrix2 = matrix2;
                    }
                }
                i4 = i3 + 1;
                matrix2 = matrix2;
                c = 0;
            }
            matrix2 = matrix2;
            i3 = i4;
            i4 = i3 + 1;
            matrix2 = matrix2;
            c = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public dtl() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new afv();
        this.d = new dtj();
        this.m = new Path();
        this.n = new Path();
    }
}
