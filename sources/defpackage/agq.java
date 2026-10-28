package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agq {
    public long[] a = agv.a;
    public Object[] b = ahe.c;
    public int[] c = agd.a;
    public int d;
    public int e;
    public int f;

    public agq(int i) {
        b(i);
    }

    public final void a() {
        this.f = agv.a(this.d);
    }

    public final void b(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = agv.a;
            iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.d = iMax;
        if (iMax == 0) {
            jArr = agv.a;
        } else {
            int i2 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        a();
        this.b = new Object[iMax];
        this.c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z;
        long j;
        long j2;
        int iNumberOfTrailingZeros;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agq) {
            agq agqVar = (agq) obj;
            int i = agqVar.e;
            Object[] objArr = this.b;
            int[] iArr = this.c;
            long[] jArr = this.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                loop0: while (true) {
                    long j3 = -9187201950435737472L;
                    long j4 = (~jArr[i2]) & (-9187201950435737472L);
                    while (true) {
                        long j5 = 0;
                        if (j4 != 0) {
                            int iNumberOfTrailingZeros2 = (i2 << 3) + (Long.numberOfTrailingZeros(j4) >>> 3);
                            Object obj2 = objArr[iNumberOfTrailingZeros2];
                            int i3 = iArr[iNumberOfTrailingZeros2];
                            int iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            int i4 = agqVar.d;
                            int i5 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
                            int i6 = i5 ^ (i5 >>> 16);
                            int i7 = (i6 >>> 7) & i4;
                            int i8 = 0;
                            while (true) {
                                j = j3;
                                long[] jArr2 = agqVar.a;
                                int i9 = i7 >> 3;
                                long j6 = j5;
                                int i10 = (i7 & 7) << 3;
                                long j7 = (jArr2[i9] >>> i10) | ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63));
                                long j8 = (((long) (i6 & 127)) * 72340172838076673L) ^ j7;
                                for (long j9 = (j8 - 72340172838076673L) & (~j8) & j; j9 != j6; j9 &= j9 - 1) {
                                    iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j9) >> 3)) & i4;
                                    j2 = -1;
                                    if (awrc.c(agqVar.b[iNumberOfTrailingZeros], obj2)) {
                                        break;
                                    }
                                }
                                j2 = -1;
                                if ((j7 & ((~j7) << 6) & j) != j6) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i8 += 8;
                                i7 = (i7 + i8) & i4;
                                j3 = j;
                                j5 = j6;
                            }
                            if (iNumberOfTrailingZeros < 0 || i3 != agqVar.c[iNumberOfTrailingZeros]) {
                                break loop0;
                            }
                            j4 &= j4 + j2;
                            j3 = j;
                        }
                    }
                    z = true;
                    if (i2 != length) {
                        i2++;
                    }
                }
            } else {
                z = true;
            }
            return z;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                int iNumberOfTrailingZeros = (i << 3) + (Long.numberOfTrailingZeros(j) >>> 3);
                Object obj = objArr[iNumberOfTrailingZeros];
                iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[iNumberOfTrailingZeros];
                j2 = (-1) + j;
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        return "{}";
    }

    public agq() {
    }
}
