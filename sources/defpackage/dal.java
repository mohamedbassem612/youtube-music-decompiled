package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dal {
    public final daj a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final int[] h;
    public final long i;
    public final boolean j;

    public dal(daj dajVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        int length = iArr.length;
        int length2 = jArr2.length;
        ahno.F(length == length2);
        ahno.F(jArr.length == length2);
        int length3 = iArr2.length;
        ahno.F(length3 == length2);
        this.a = dajVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = iArr3;
        this.j = z;
        this.i = j;
        this.b = i2;
        if (length3 > 0) {
            int i3 = length3 - 1;
            iArr2[i3] = iArr2[i3] | 536870912;
        }
    }

    public final int a(long j) {
        if (!c()) {
            return -1;
        }
        int i = 0;
        if (this.j) {
            return bwp.an(this.f, j, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int i3 = ((length - i) / 2) + i;
            if (this.f[iArr[i3]] <= j) {
                i = i3 + 1;
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long[] jArr = this.f;
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0) {
                int i4 = i2 - 1;
                if (jArr[iArr[i4]] != j2) {
                    break;
                }
                i2 = i4;
            }
        }
        return iArr[i2];
    }

    public final int b(long j) {
        if (!c()) {
            return -1;
        }
        if (this.j) {
            return bwp.al(this.f, j, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int i3 = ((length - i) / 2) + i;
            if (this.f[iArr[i3]] >= j) {
                length = i3 - 1;
                i2 = i3;
            } else {
                i = i3 + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long[] jArr = this.f;
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i4 = i2 + 1;
                if (jArr[iArr[i4]] != j2) {
                    break;
                }
                i2 = i4;
            }
        }
        return iArr[i2];
    }

    public final boolean c() {
        return this.f.length > 0;
    }
}
