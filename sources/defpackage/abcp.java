package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abcp extends abcq {
    private final float[] a;
    private final float[] b;
    private final float[] c;

    public abcp(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        if (length != fArr2.length || length < 2) {
            throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
        }
        int i = length - 1;
        float[] fArr3 = new float[i];
        float[] fArr4 = new float[length];
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            float f = fArr[i4] - fArr[i3];
            if (f <= 0.0f) {
                throw new IllegalArgumentException("The control points must all have strictly increasing X values.");
            }
            fArr3[i3] = (fArr2[i4] - fArr2[i3]) / f;
            i3 = i4;
        }
        fArr4[0] = fArr3[0];
        for (int i5 = 1; i5 < i; i5++) {
            fArr4[i5] = (fArr3[i5 - 1] + fArr3[i5]) * 0.5f;
        }
        fArr4[i] = fArr3[length - 2];
        while (i2 < i) {
            int i6 = i2 + 1;
            float f2 = fArr3[i2];
            if (f2 == 0.0f) {
                fArr4[i2] = 0.0f;
                fArr4[i6] = 0.0f;
            } else {
                float f3 = fArr4[i2] / f2;
                float f4 = fArr4[i6] / f2;
                if (f3 < 0.0f || f4 < 0.0f) {
                    throw new IllegalArgumentException("The control points must have monotonic Y values.");
                }
                float fHypot = (float) Math.hypot(f3, f4);
                if (fHypot > 3.0f) {
                    float f5 = 3.0f / fHypot;
                    fArr4[i2] = fArr4[i2] * f5;
                    fArr4[i6] = fArr4[i6] * f5;
                }
            }
            i2 = i6;
        }
        this.a = fArr;
        this.b = fArr2;
        this.c = fArr4;
    }

    @Override // defpackage.abcq
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return f;
        }
        float[] fArr = this.a;
        int i = 0;
        if (f <= fArr[0]) {
            return this.b[0];
        }
        int length = fArr.length - 1;
        if (f >= fArr[length]) {
            return this.b[length];
        }
        while (true) {
            int i2 = i + 1;
            float f2 = fArr[i2];
            if (f < f2) {
                float f3 = fArr[i];
                float f4 = f2 - f3;
                float f5 = f - f3;
                float[] fArr2 = this.b;
                float f6 = f5 / f4;
                float f7 = f6 + f6;
                float f8 = fArr2[i] * (f7 + 1.0f);
                float[] fArr3 = this.c;
                float f9 = 1.0f - f6;
                return ((f8 + (fArr3[i] * f4 * f6)) * f9 * f9) + (((fArr2[i2] * (3.0f - f7)) + (f4 * fArr3[i2] * ((-1.0f) + f6))) * f6 * f6);
            }
            if (f == f2) {
                return this.b[i2];
            }
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MonotoneCubicSpline{[");
        int i = 0;
        while (true) {
            float[] fArr = this.a;
            if (i >= fArr.length) {
                sb.append("]}");
                return sb.toString();
            }
            if (i != 0) {
                sb.append(", ");
            }
            sb.append('(');
            sb.append(fArr[i]);
            sb.append(", ");
            sb.append(this.b[i]);
            sb.append(": ");
            sb.append(this.c[i]);
            sb.append(')');
            i++;
        }
    }
}
