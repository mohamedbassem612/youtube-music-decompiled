package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agu {
    public long[] a = agv.a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    public Map f;
    private int g;

    public agu(int i) {
        Object[] objArr = ahe.c;
        this.b = objArr;
        this.c = objArr;
        k(i);
    }

    public static /* synthetic */ boolean d(agu aguVar, Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = aguVar.d;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = (i3 >>> 7) & i;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = aguVar.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i3;
            long j = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i;
                if (awrc.c(aguVar.b[iNumberOfTrailingZeros], obj)) {
                    if (iNumberOfTrailingZeros < 0) {
                        break loop0;
                    }
                    return true;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i;
            i3 = i8;
        }
        return false;
    }

    private final int i(int i) {
        int i2 = this.d;
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

    private final void j() {
        this.g = agv.a(this.d) - this.e;
    }

    private final void k(int i) {
        int iMax;
        long[] jArr;
        Object[] objArr;
        int i2 = 0;
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
            int i3 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i3];
            Arrays.fill(jArr3, 0, i3, -9187201950435737472L);
            int i4 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr3[i4] = (jArr3[i4] & (~j)) | j;
            jArr = jArr3;
        }
        this.a = jArr;
        j();
        if (iMax == 0) {
            objArr = ahe.c;
        } else {
            i2 = iMax;
            objArr = new Object[iMax];
        }
        this.b = objArr;
        this.c = i2 == 0 ? ahe.c : new Object[i2];
    }

    public final Object a(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
        int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i4 = i3 ^ (i3 >>> 16);
        int i5 = i4 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i2;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i4 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i2;
                if (awrc.c(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final boolean b(Object obj) {
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j != 0) {
                    if (awrc.c(obj, objArr[(i << 3) + (Long.numberOfTrailingZeros(j) >>> 3)])) {
                        return true;
                    }
                    j2 = (-1) + j;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }

    public final boolean c() {
        return this.e == 0;
    }

    public final int e(Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        long[] jArr;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = -862048943;
        int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i4 = i3 ^ (i3 >>> 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr2[i9] >>> i10;
            long j5 = jArr2[i9 + 1] << (64 - i10);
            int i11 = i4;
            int i12 = 0;
            long j6 = i4 & 127;
            long j7 = j4 | (j5 & ((-i10) >> 63));
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
                int i13 = i2;
                if (awrc.c(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i2 = i13;
            }
            int i14 = i2;
            char c = '\b';
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int i15 = i(i5);
                long j10 = 255;
                if (this.g != 0 || ((this.a[i15 >> 3] >> ((i15 & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i16 = this.d;
                    if (i16 > 8) {
                        j3 = 128;
                        if (Long.compare((((long) this.e) << 5) ^ Long.MIN_VALUE, (((long) i16) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i17 = this.d;
                            Object[] objArr = this.b;
                            Object[] objArr2 = this.c;
                            int i18 = i17 + 7;
                            int i19 = 0;
                            while (i19 < (i18 >> 3)) {
                                char c2 = c;
                                long j11 = jArr3[i19] & (-9187201950435737472L);
                                jArr3[i19] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                i19++;
                                i18 = i18;
                                i12 = i12;
                                c = c2;
                                j10 = j10;
                            }
                            j2 = j10;
                            int i20 = i12;
                            int iAO = atqq.aO(jArr3);
                            int i21 = iAO - 1;
                            jArr3[i21] = (jArr3[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iAO] = jArr3[i20];
                            int i22 = i20;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr3[i23] >> i24) & j2;
                                if (j12 == 128 || j12 != 254) {
                                    i22++;
                                } else {
                                    Object obj2 = objArr[i22];
                                    int iHashCode2 = obj2 != null ? obj2.hashCode() : i20;
                                    int i25 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i14;
                                    int i26 = i25 ^ (i25 >>> 16);
                                    int i27 = i26 & 127;
                                    int i28 = i26 >>> 7;
                                    int i29 = i(i28);
                                    int i30 = i28 & i17;
                                    int i31 = i20;
                                    long j13 = j6;
                                    long[] jArr4 = jArr3;
                                    long j14 = i27;
                                    if (((i29 - i30) & i17) / 8 == ((i22 - i30) & i17) / 8) {
                                        jArr4[i23] = (jArr4[i23] & (~(j2 << i24))) | (j14 << i24);
                                        jArr4[atqq.aO(jArr4)] = jArr4[i31];
                                        i22++;
                                    } else {
                                        int i32 = i29 >> 3;
                                        long j15 = jArr4[i32];
                                        int i33 = (i29 & 7) << 3;
                                        long j16 = j14 << i33;
                                        long j17 = (~(j2 << i33)) & j15;
                                        if (((j15 >> i33) & j2) == 128) {
                                            long j18 = ~(j2 << i24);
                                            jArr4[i32] = j17 | j16;
                                            jArr4[i23] = (jArr4[i23] & j18) | (128 << i24);
                                            objArr[i29] = objArr[i22];
                                            objArr[i22] = null;
                                            objArr2[i29] = objArr2[i22];
                                            objArr2[i22] = null;
                                        } else {
                                            jArr4[i32] = j17 | j16;
                                            Object obj3 = objArr[i29];
                                            objArr[i29] = objArr[i22];
                                            objArr[i22] = obj3;
                                            Object obj4 = objArr2[i29];
                                            objArr2[i29] = objArr2[i22];
                                            objArr2[i22] = obj4;
                                            i22--;
                                        }
                                        jArr4[atqq.aO(jArr4)] = jArr4[i31];
                                        i22++;
                                    }
                                    jArr3 = jArr4;
                                    i20 = i31;
                                    j6 = j13;
                                }
                            }
                            j = j6;
                            i = i20;
                            j();
                        }
                        i15 = i(i5);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    int iB = agv.b(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.b;
                    Object[] objArr4 = this.c;
                    int i34 = this.d;
                    k(iB);
                    long[] jArr6 = this.a;
                    Object[] objArr5 = this.b;
                    Object[] objArr6 = this.c;
                    int i35 = this.d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            Object obj5 = objArr3[i36];
                            int iHashCode3 = obj5 != null ? obj5.hashCode() : 0;
                            int i37 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i14;
                            int i38 = i37 ^ (i37 >>> 16);
                            int i39 = i(i38 >>> 7);
                            int i40 = i39 >> 3;
                            int i41 = (i39 & 7) << 3;
                            jArr = jArr6;
                            long j19 = (jArr6[i40] & (~(255 << i41))) | (((long) (i38 & 127)) << i41);
                            jArr[i40] = j19;
                            jArr[(((i39 - 7) & i35) + (i35 & 7)) >> 3] = j19;
                            objArr5[i39] = obj5;
                            objArr6[i39] = objArr4[i36];
                        } else {
                            jArr = jArr6;
                        }
                        i36++;
                        jArr5 = jArr5;
                        jArr6 = jArr;
                    }
                    i15 = i(i5);
                }
                this.e++;
                int i42 = this.g;
                long[] jArr7 = this.a;
                int i43 = i15 >> 3;
                long j20 = jArr7[i43];
                int i44 = (i15 & 7) << 3;
                this.g = i42 - (((j20 >> i44) & j2) != j3 ? i : 1);
                int i45 = this.d;
                long j21 = (j20 & (~(j2 << i44))) | (j << i44);
                jArr7[i43] = j21;
                jArr7[(((i15 - 7) & i45) + (i45 & 7)) >> 3] = j21;
                return ~i15;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i4 = i11;
            i2 = i14;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agu) {
            agu aguVar = (agu) obj;
            if (aguVar.e == this.e) {
                Object[] objArr = this.b;
                Object[] objArr2 = this.c;
                long[] jArr = this.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return true;
                }
                int i = 0;
                loop0: while (true) {
                    long j = ~jArr[i];
                    long j2 = -9187201950435737472L;
                    while (true) {
                        j &= j2;
                        if (j != 0) {
                            int iNumberOfTrailingZeros = (i << 3) + (Long.numberOfTrailingZeros(j) >>> 3);
                            Object obj2 = objArr[iNumberOfTrailingZeros];
                            Object obj3 = objArr2[iNumberOfTrailingZeros];
                            if (obj3 == null) {
                                if (aguVar.a(obj2) != null || !d(aguVar, obj2)) {
                                    break loop0;
                                }
                                j2 = (-1) + j;
                            } else {
                                if (!awrc.c(obj3, aguVar.a(obj2))) {
                                    break loop0;
                                }
                                j2 = (-1) + j;
                            }
                        }
                    }
                    if (i == length) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final Object f(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
        int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i4 = i3 ^ (i3 >>> 16);
        int i5 = i4 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i2;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i4 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i2;
                if (awrc.c(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.e--;
        long[] jArr2 = this.a;
        int i9 = this.d;
        int i10 = iNumberOfTrailingZeros >> 3;
        int i11 = (iNumberOfTrailingZeros & 7) << 3;
        long j4 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
        jArr2[i10] = j4;
        jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j4;
        this.b[iNumberOfTrailingZeros] = null;
        Object[] objArr = this.c;
        Object obj2 = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj2;
    }

    public final void g(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            iE = ~iE;
        }
        this.b[iE] = obj;
        this.c[iE] = obj2;
    }

    public final void h(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            iE = ~iE;
        }
        Object[] objArr = this.c;
        Object obj3 = objArr[iE];
        this.b[iE] = obj;
        objArr[iE] = obj2;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                Object obj2 = objArr2[iNumberOfTrailingZeros];
                iHashCode += (obj != null ? obj.hashCode() : 0) ^ (obj2 != null ? obj2.hashCode() : 0);
                j2 = (-1) + j;
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        if (c()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
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
                    Object obj2 = objArr2[iNumberOfTrailingZeros];
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb.append(obj);
                    sb.append('=');
                    if (obj2 == this) {
                        obj2 = "(this)";
                    }
                    sb.append(obj2);
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

    public agu() {
        Object[] objArr = ahe.c;
        this.b = objArr;
        this.c = objArr;
    }
}
