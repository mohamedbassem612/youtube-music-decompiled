package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agc {
    public long[] a = agv.a;
    public int[] b = agd.a;
    public int c;
    public int d;
    public int e;

    public agc(int i) {
        c(i);
    }

    public final int a(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = (jArr[i5] >>> i6) | ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63));
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void b() {
        this.e = agv.a(this.c) - this.d;
    }

    public final void c(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = agv.a;
            iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.c = iMax;
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
        b();
        this.b = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z;
        long j;
        int iNumberOfTrailingZeros;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agc) {
            agc agcVar = (agc) obj;
            if (agcVar.d == this.d) {
                int[] iArr = this.b;
                long[] jArr = this.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    loop0: while (true) {
                        long j2 = -9187201950435737472L;
                        long j3 = (~jArr[i]) & (-9187201950435737472L);
                        while (true) {
                            long j4 = 0;
                            if (j3 != 0) {
                                int i2 = iArr[(i << 3) + (Long.numberOfTrailingZeros(j3) >>> 3)];
                                int i3 = agcVar.c;
                                int i4 = ((i2 >>> 16) ^ i2) * (-862048943);
                                int i5 = i4 ^ (i4 >>> 16);
                                int i6 = (i5 >>> 7) & i3;
                                int i7 = 0;
                                while (true) {
                                    long[] jArr2 = agcVar.a;
                                    int i8 = i6 >> 3;
                                    j = j2;
                                    int i9 = (i6 & 7) << 3;
                                    long j5 = j4;
                                    long j6 = (jArr2[i8] >>> i9) | ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63));
                                    long j7 = (((long) (i5 & 127)) * 72340172838076673L) ^ j6;
                                    long j8 = (j7 - 72340172838076673L) & (~j7) & j;
                                    while (true) {
                                        if (j8 == j5) {
                                            if ((j6 & ((~j6) << 6) & j) != j5) {
                                                break loop0;
                                            }
                                            i7 += 8;
                                            i6 = (i6 + i7) & i3;
                                            j2 = j;
                                            j4 = j5;
                                        } else {
                                            iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j8) >> 3)) & i3;
                                            if (agcVar.b[iNumberOfTrailingZeros] == i2) {
                                                break;
                                            }
                                            j8 &= j8 - 1;
                                        }
                                    }
                                }
                                if (iNumberOfTrailingZeros < 0) {
                                    break loop0;
                                }
                                j3 &= (-1) + j3;
                                j2 = j;
                            }
                        }
                        z = true;
                        if (i != length) {
                            i++;
                        }
                    }
                } else {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        int i = 0;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                i2 += iArr[(i << 3) + (Long.numberOfTrailingZeros(j) >>> 3)];
                j2 = (-1) + j;
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = ~jArr[i];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j != 0) {
                        int i3 = iArr[(i << 3) + (Long.numberOfTrailingZeros(j) >>> 3)];
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        sb.append(i3);
                        i2++;
                        j2 = (-1) + j;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public agc() {
    }
}
