package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class agg {
    public long[] a = agv.a;
    public long[] b = agj.a;
    public Object[] c = ahe.c;
    public int d;
    public int e;

    public final Object a(long j) {
        int iNumberOfTrailingZeros;
        int i = (int) ((j >>> 32) ^ j);
        int i2 = (i ^ (i >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j3 = (((long) (i3 & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = ((-72340172838076673L) + j3) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void b(awqg awqgVar) {
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                awqgVar.invoke(objArr[(i << 3) + (Long.numberOfTrailingZeros(j) >>> 3)]);
                j2 = (-1) + j;
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        Object[] objArr;
        long j;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agg) {
            agg aggVar = (agg) obj;
            if (aggVar.e == this.e) {
                long[] jArr = this.b;
                Object[] objArr2 = this.c;
                long[] jArr2 = this.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i = 0;
                    loop0: while (true) {
                        long j2 = -9187201950435737472L;
                        long j3 = (~jArr2[i]) & (-9187201950435737472L);
                        while (true) {
                            long j4 = 0;
                            if (j3 != 0) {
                                int iNumberOfTrailingZeros = (i << 3) + (Long.numberOfTrailingZeros(j3) >>> 3);
                                long[] jArr3 = jArr;
                                long j5 = jArr3[iNumberOfTrailingZeros];
                                Object obj2 = objArr2[iNumberOfTrailingZeros];
                                if (obj2 != null) {
                                    objArr = objArr2;
                                    j = j2;
                                    if (!awrc.c(obj2, aggVar.a(j5))) {
                                        break loop0;
                                    }
                                    j3 &= j3 - 1;
                                    jArr = jArr3;
                                    objArr2 = objArr;
                                    j2 = j;
                                } else {
                                    if (aggVar.a(j5) != null) {
                                        break loop0;
                                    }
                                    int iAk = a.ak(j5);
                                    int i2 = aggVar.d;
                                    int i3 = (iAk ^ (iAk >>> 16)) * (-862048943);
                                    int i4 = i3 ^ (i3 >>> 16);
                                    int i5 = (i4 >>> 7) & i2;
                                    int i6 = 0;
                                    while (true) {
                                        j = j2;
                                        long[] jArr4 = aggVar.a;
                                        int i7 = i5 >> 3;
                                        long j6 = j4;
                                        int i8 = (i5 & 7) << 3;
                                        int i9 = i2;
                                        objArr = objArr2;
                                        long j7 = (jArr4[i7] >>> i8) | ((jArr4[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
                                        long j8 = (((long) (i4 & 127)) * 72340172838076673L) ^ j7;
                                        for (long j9 = (j8 - 72340172838076673L) & (~j8) & j; j9 != j6; j9 &= j9 - 1) {
                                            int iNumberOfTrailingZeros2 = (i5 + (Long.numberOfTrailingZeros(j9) >> 3)) & i9;
                                            if (aggVar.b[iNumberOfTrailingZeros2] == j5) {
                                                if (iNumberOfTrailingZeros2 < 0) {
                                                    break loop0;
                                                }
                                                break;
                                            }
                                        }
                                        if ((j7 & ((~j7) << 6) & j) != j6) {
                                            break loop0;
                                        }
                                        i6 += 8;
                                        i5 = (i5 + i6) & i9;
                                        i2 = i9;
                                        objArr2 = objArr;
                                        j2 = j;
                                        j4 = j6;
                                    }
                                    j3 &= j3 - 1;
                                    jArr = jArr3;
                                    objArr2 = objArr;
                                    j2 = j;
                                }
                            }
                        }
                        long[] jArr5 = jArr;
                        Object[] objArr3 = objArr2;
                        z = true;
                        if (i != length) {
                            i++;
                            jArr = jArr5;
                            objArr2 = objArr3;
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
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iAk = 0;
        while (true) {
            long j = ~jArr2[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                int iNumberOfTrailingZeros = (i << 3) + (Long.numberOfTrailingZeros(j) >>> 3);
                long j3 = jArr[iNumberOfTrailingZeros];
                Object obj = objArr[iNumberOfTrailingZeros];
                iAk += a.ak(j3) ^ (obj != null ? obj.hashCode() : 0);
                j2 = (-1) + j;
            }
            if (i == length) {
                return iAk;
            }
            i++;
        }
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = ~jArr2[i];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j == 0) {
                        break;
                    }
                    int iNumberOfTrailingZeros = (i << 3) + (Long.numberOfTrailingZeros(j) >>> 3);
                    long j3 = jArr[iNumberOfTrailingZeros];
                    Object obj = objArr[iNumberOfTrailingZeros];
                    sb.append(j3);
                    sb.append('=');
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb.append(obj);
                    i2++;
                    if (i2 < this.e) {
                        sb.append(", ");
                    }
                    j2 = (-1) + j;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
