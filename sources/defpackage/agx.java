package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agx {
    public long[] a = agv.a;
    public Object[] b = ahe.c;
    public int c;
    public int d;
    public int e;

    public agx(int i) {
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
        int i2 = 0;
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
            int i3 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i3];
            Arrays.fill(jArr3, 0, i3, -9187201950435737472L);
            i2 = iMax;
            jArr = jArr3;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        b();
        this.b = iMax == 0 ? ahe.c : new Object[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z;
        long j;
        int iNumberOfTrailingZeros;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agx) {
            agx agxVar = (agx) obj;
            if (agxVar.d == this.d) {
                Object[] objArr = this.b;
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
                                Object obj2 = objArr[(i << 3) + (Long.numberOfTrailingZeros(j3) >>> 3)];
                                int iHashCode = obj2 != null ? obj2.hashCode() : 0;
                                int i2 = agxVar.c;
                                int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
                                int i4 = i3 ^ (i3 >>> 16);
                                int i5 = (i4 >>> 7) & i2;
                                int i6 = 0;
                                while (true) {
                                    long[] jArr2 = agxVar.a;
                                    int i7 = i5 >> 3;
                                    j = j2;
                                    int i8 = (i5 & 7) << 3;
                                    long j5 = j4;
                                    long j6 = (jArr2[i7] >>> i8) | ((jArr2[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
                                    long j7 = (((long) (i4 & 127)) * 72340172838076673L) ^ j6;
                                    long j8 = (j7 - 72340172838076673L) & (~j7) & j;
                                    while (true) {
                                        if (j8 == j5) {
                                            if ((j6 & ((~j6) << 6) & j) != j5) {
                                                break loop0;
                                            }
                                            i6 += 8;
                                            i5 = (i5 + i6) & i2;
                                            j2 = j;
                                            j4 = j5;
                                        } else {
                                            iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j8) >> 3)) & i2;
                                            if (awrc.c(agxVar.b[iNumberOfTrailingZeros], obj2)) {
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
        Object[] objArr = this.b;
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
                Object obj = objArr[(i << 3) + (Long.numberOfTrailingZeros(j) >>> 3)];
                iHashCode += obj != null ? obj.hashCode() : 0;
                j2 = (-1) + j;
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        int i = 0;
        agw agwVar = new agw(this, i);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0: while (true) {
                long j = ~jArr[i];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j != 0) {
                        Object obj = objArr[(i << 3) + (Long.numberOfTrailingZeros(j) >>> 3)];
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        sb.append((CharSequence) agwVar.invoke(obj));
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

    public agx() {
    }
}
