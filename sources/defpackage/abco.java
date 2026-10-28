package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abco extends abcq {
    private final float[] a;
    private final float[] b;
    private final float[] c;

    public abco(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        if (length != fArr2.length) {
            throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
        }
        int i = length - 1;
        this.c = new float[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            this.c[i2] = (fArr2[i3] - fArr2[i2]) / (fArr[i3] - fArr[i2]);
            i2 = i3;
        }
        this.a = fArr;
        this.b = fArr2;
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
                return this.b[i] + (this.c[i] * (f - fArr[i]));
            }
            if (f == f2) {
                return this.b[i2];
            }
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinearSpline{[");
        int i = 0;
        while (true) {
            float[] fArr = this.a;
            int length = fArr.length;
            if (i >= length) {
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
            if (i < length - 1) {
                sb.append(": ");
                sb.append(this.c[i]);
            }
            sb.append(')');
            i++;
        }
    }
}
