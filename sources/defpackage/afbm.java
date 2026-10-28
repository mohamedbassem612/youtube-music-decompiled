package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afbm {
    private final afbu[] a = new afbu[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final afbu g = new afbu();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public afbm() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new afbu();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static afbm a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? afbl.a : new afbm();
    }

    static final afay b(int i, afbk afbkVar) {
        if (i == 1) {
            return afbkVar.d;
        }
        if (i != 2) {
            return i != 3 ? afbkVar.c : afbkVar.b;
        }
        return afbkVar.e;
    }

    private final boolean d(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].c(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private static final float e(int i) {
        return ((i + 1) % 4) * 90;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.BitSet] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    public final void c(afbk afbkVar, float[] fArr, float f, RectF rectF, abpi abpiVar, Path path) {
        int i;
        int i2;
        ?? r3;
        afba afbaVar;
        int i3;
        char c;
        afba afbaVar2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            i2 = 1;
            if (i4 >= 4) {
                break;
            }
            afay afayVarB = fArr == null ? b(i4, afbkVar) : new afax(fArr[i4]);
            if (i4 == 1) {
                afbaVar2 = afbkVar.l;
            } else if (i4 != 2) {
                afbaVar2 = i4 != 3 ? afbkVar.k : afbkVar.j;
            } else {
                afbaVar2 = afbkVar.m;
            }
            afbu[] afbuVarArr = this.a;
            afbaVar2.a(afbuVarArr[i4], f, afayVarB.a(rectF));
            float fE = e(i4);
            Matrix[] matrixArr = this.b;
            matrixArr[i4].reset();
            PointF pointF = this.d;
            if (i4 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i4 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i4 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr[i4].setTranslate(pointF.x, pointF.y);
            matrixArr[i4].preRotate(fE);
            float[] fArr2 = this.h;
            afbu afbuVar = afbuVarArr[i4];
            fArr2[0] = afbuVar.c;
            fArr2[1] = afbuVar.d;
            matrixArr[i4].mapPoints(fArr2);
            float fE2 = e(i4);
            Matrix[] matrixArr2 = this.c;
            matrixArr2[i4].reset();
            matrixArr2[i4].setTranslate(fArr2[0], fArr2[1]);
            matrixArr2[i4].preRotate(fE2);
            i4++;
        }
        char c2 = 0;
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            float[] fArr3 = this.h;
            afbu[] afbuVarArr2 = this.a;
            afbu afbuVar2 = afbuVarArr2[i5];
            fArr3[c2] = afbuVar2.a;
            fArr3[i2] = afbuVar2.b;
            Matrix[] matrixArr3 = this.b;
            matrixArr3[i5].mapPoints(fArr3);
            if (i5 == 0) {
                path.moveTo(fArr3[c2], fArr3[i2]);
            } else {
                path.lineTo(fArr3[c2], fArr3[i2]);
            }
            afbuVarArr2[i5].c(matrixArr3[i5], path);
            if (abpiVar != null) {
                afbu afbuVar3 = afbuVarArr2[i5];
                Matrix matrix = matrixArr3[i5];
                afbe afbeVar = (afbe) abpiVar.a;
                ?? r4 = c2;
                afbeVar.d.set(i5, r4);
                afbeVar.b[i5] = afbuVar3.a(matrix);
                r3 = r4;
            } else {
                r3 = c2;
            }
            int i6 = i5 + 1;
            afbu afbuVar4 = afbuVarArr2[i5];
            fArr3[r3] = afbuVar4.c;
            fArr3[i2] = afbuVar4.d;
            matrixArr3[i5].mapPoints(fArr3);
            float[] fArr4 = this.i;
            int i7 = i6 % 4;
            afbu afbuVar5 = afbuVarArr2[i7];
            ?? r16 = r3;
            fArr4[r16 == true ? 1 : 0] = afbuVar5.a;
            fArr4[i2] = afbuVar5.b;
            matrixArr3[i7].mapPoints(fArr4);
            float fMax = Math.max(((float) Math.hypot(fArr3[r16 == true ? 1 : 0] - fArr4[r16 == true ? 1 : 0], fArr3[i2] - fArr4[i2])) - 0.001f, 0.0f);
            afbu afbuVar6 = afbuVarArr2[i5];
            fArr3[0] = afbuVar6.c;
            fArr3[i2] = afbuVar6.d;
            matrixArr3[i5].mapPoints(fArr3);
            int i8 = i2;
            float fAbs = (i5 == i8 || i5 == 3) ? Math.abs(rectF.centerX() - fArr3[0]) : Math.abs(rectF.centerY() - fArr3[i8]);
            afbu afbuVar7 = this.g;
            afbuVar7.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i5 == 1) {
                afbaVar = afbkVar.h;
            } else if (i5 != 2) {
                afbaVar = i5 != 3 ? afbkVar.g : afbkVar.f;
            } else {
                afbaVar = afbkVar.i;
            }
            afbaVar.b(fMax, fAbs, f, afbuVar7);
            Path path4 = this.j;
            path4.reset();
            Matrix[] matrixArr4 = this.c;
            afbuVar7.c(matrixArr4[i5], path4);
            if (this.l && (afbaVar.c() || d(path4, i5) || d(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr3[0] = afbuVar7.a;
                i3 = 1;
                fArr3[1] = afbuVar7.b;
                matrixArr4[i5].mapPoints(fArr3);
                path2.moveTo(fArr3[0], fArr3[1]);
                afbuVar7.c(matrixArr4[i5], path2);
            } else {
                i3 = 1;
                afbuVar7.c(matrixArr4[i5], path);
            }
            if (abpiVar != null) {
                Matrix matrix2 = matrixArr4[i5];
                afbe afbeVar2 = (afbe) abpiVar.a;
                c = 0;
                afbeVar2.d.set(i5 + 4, false);
                afbeVar2.c[i5] = afbuVar7.a(matrix2);
            } else {
                c = 0;
            }
            i5 = i6;
            c2 = c;
            i2 = i3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
