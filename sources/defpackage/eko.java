package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eko {
    public final float[] a;
    public final int[] b;

    public eko(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final eko a(float[] fArr) {
        int iD;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            if (iBinarySearch >= 0) {
                iD = this.b[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                int[] iArr2 = this.b;
                if (i2 == 0) {
                    iD = iArr2[0];
                } else {
                    int length = iArr2.length - 1;
                    if (i2 == length) {
                        iD = iArr2[length];
                    } else {
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        iD = qa.D((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = iD;
        }
        return new eko(fArr, iArr);
    }

    public final void b(eko ekoVar) {
        int i = 0;
        while (true) {
            int[] iArr = ekoVar.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = ekoVar.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eko ekoVar = (eko) obj;
            if (Arrays.equals(this.a, ekoVar.a) && Arrays.equals(this.b, ekoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }
}
