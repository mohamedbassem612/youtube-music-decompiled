package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aga {
    public long[] a = agv.a;
    public int[] b = agd.a;
    public Object[] c = ahe.c;
    public int d;
    public int e;
    private int f;

    public aga(int i) {
        if (i < 0) {
            dl.k("Capacity must be a positive value.");
        }
        j(i == 7 ? 8 : i + ((i - 1) / 7));
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

    private final void j(int i) {
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
        f();
        this.b = new int[iMax];
        this.c = new Object[iMax];
    }

    public final Object a(int i) {
        int iNumberOfTrailingZeros;
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
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

    public final void b(awqk awqkVar) {
        int[] iArr = this.b;
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
                int iNumberOfTrailingZeros = (i << 3) + (Long.numberOfTrailingZeros(j) >>> 3);
                awqkVar.invoke(Integer.valueOf(iArr[iNumberOfTrailingZeros]), objArr[iNumberOfTrailingZeros]);
                j2 = (-1) + j;
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int c(int i) {
        long j;
        int i2;
        int i3;
        long j2;
        long[] jArr;
        int i4 = -862048943;
        int i5 = ((i >>> 16) ^ i) * (-862048943);
        int i6 = i5 ^ (i5 >>> 16);
        int i7 = i6 >>> 7;
        int i8 = this.d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j3 = jArr2[i11] >>> i12;
            int i13 = 1;
            long j4 = jArr2[i11 + 1] << (64 - i12);
            int i14 = i10;
            int i15 = 0;
            long j5 = i6 & 127;
            long j6 = j3 | (j4 & ((-i12) >> 63));
            long j7 = (72340172838076673L * j5) ^ j6;
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i9) & i8;
                int i16 = i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i4 = i16;
            }
            int i17 = i4;
            char c = '\b';
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                int i18 = i(i7);
                long j9 = 255;
                if (this.f != 0 || ((this.a[i18 >> 3] >> ((i18 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 0;
                    i3 = 1;
                    j2 = 128;
                } else {
                    int i19 = this.d;
                    if (i19 <= 8 || Long.compare((((long) this.e) << 5) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) > 0) {
                        j = 255;
                        i2 = 0;
                        j2 = 128;
                        int iB = agv.b(this.d);
                        long[] jArr3 = this.a;
                        int[] iArr = this.b;
                        Object[] objArr = this.c;
                        int i20 = this.d;
                        j(iB);
                        long[] jArr4 = this.a;
                        int[] iArr2 = this.b;
                        Object[] objArr2 = this.c;
                        int i21 = this.d;
                        int i22 = 0;
                        while (i22 < i20) {
                            if (((jArr3[i22 >> 3] >> ((i22 & 7) << 3)) & 255) < 128) {
                                int i23 = iArr[i22];
                                int i24 = ((i23 >>> 16) ^ i23) * i17;
                                int i25 = i24 ^ (i24 >>> 16);
                                int i26 = i(i25 >>> 7);
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                jArr = jArr4;
                                long j10 = (jArr4[i27] & (~(255 << i28))) | (((long) (i25 & 127)) << i28);
                                jArr[i27] = j10;
                                jArr[(((i26 - 7) & i21) + (i21 & 7)) >> 3] = j10;
                                iArr2[i26] = i23;
                                objArr2[i26] = objArr[i22];
                            } else {
                                jArr = jArr4;
                            }
                            i22++;
                            i13 = i13;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.a;
                        int i29 = this.d;
                        int[] iArr3 = this.b;
                        Object[] objArr3 = this.c;
                        int i30 = i29 + 7;
                        int i31 = 0;
                        j2 = 128;
                        while (i31 < (i30 >> 3)) {
                            long j11 = jArr5[i31] & (-9187201950435737472L);
                            jArr5[i31] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                            i31++;
                            c = c;
                            j9 = j9;
                        }
                        j = j9;
                        int iAO = atqq.aO(jArr5);
                        int i32 = iAO - 1;
                        jArr5[i32] = (jArr5[i32] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[iAO] = jArr5[0];
                        int i33 = 0;
                        while (i33 != i29) {
                            int i34 = i33 >> 3;
                            int i35 = (i33 & 7) << 3;
                            long j12 = (jArr5[i34] >> i35) & j;
                            if (j12 == 128 || j12 != 254) {
                                i33++;
                            } else {
                                int i36 = iArr3[i33];
                                int i37 = (i36 ^ (i36 >>> 16)) * i17;
                                int i38 = i37 ^ (i37 >>> 16);
                                int i39 = i38 & 127;
                                int i40 = i38 >>> 7;
                                int i41 = i(i40);
                                int i42 = i40 & i29;
                                int i43 = i15;
                                long[] jArr6 = jArr5;
                                int i44 = i29;
                                long j13 = i39;
                                if (((i41 - i42) & i29) / 8 == ((i33 - i42) & i29) / 8) {
                                    jArr6[i34] = (jArr6[i34] & (~(j << i35))) | (j13 << i35);
                                    jArr6[atqq.aO(jArr6)] = (jArr6[i43] & 72057594037927935L) | Long.MIN_VALUE;
                                    i33++;
                                } else {
                                    int i45 = i41 >> 3;
                                    long j14 = jArr6[i45];
                                    int i46 = (i41 & 7) << 3;
                                    long j15 = j13 << i46;
                                    long j16 = j14 & (~(j << i46));
                                    if (((j14 >> i46) & j) == 128) {
                                        long j17 = ~(j << i35);
                                        jArr6[i45] = j16 | j15;
                                        jArr6[i34] = (jArr6[i34] & j17) | (128 << i35);
                                        iArr3[i41] = iArr3[i33];
                                        iArr3[i33] = i43;
                                        objArr3[i41] = objArr3[i33];
                                        objArr3[i33] = null;
                                    } else {
                                        jArr6[i45] = j16 | j15;
                                        int i47 = iArr3[i41];
                                        iArr3[i41] = iArr3[i33];
                                        iArr3[i33] = i47;
                                        Object obj = objArr3[i41];
                                        objArr3[i41] = objArr3[i33];
                                        objArr3[i33] = obj;
                                        i33--;
                                    }
                                    jArr6[atqq.aO(jArr6)] = (jArr6[i43] & 72057594037927935L) | Long.MIN_VALUE;
                                    i33++;
                                }
                                jArr5 = jArr6;
                                i15 = i43;
                                i29 = i44;
                            }
                        }
                        i2 = i15;
                        f();
                    }
                    i3 = i13;
                    i18 = i(i7);
                }
                this.e++;
                int i48 = this.f;
                long[] jArr7 = this.a;
                int i49 = i18 >> 3;
                long j18 = jArr7[i49];
                int i50 = (i18 & 7) << 3;
                if (((j18 >> i50) & j) != j2) {
                    i3 = i2;
                }
                this.f = i48 - i3;
                int i51 = this.d;
                long j19 = (j18 & (~(j << i50))) | (j5 << i50);
                jArr7[i49] = j19;
                jArr7[(((i18 - 7) & i51) + (i51 & 7)) >> 3] = j19;
                return ~i18;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
    }

    public final Object d(int i, Object obj) {
        int iC = c(i);
        if (iC < 0) {
            iC = ~iC;
        }
        Object[] objArr = this.c;
        Object obj2 = objArr[iC];
        this.b[iC] = i;
        objArr[iC] = obj;
        return obj2;
    }

    public final Object e(int i) {
        int iNumberOfTrailingZeros;
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
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
        Object[] objArr = this.c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final boolean equals(Object obj) {
        boolean z;
        long j;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aga) {
            aga agaVar = (aga) obj;
            if (agaVar.e == this.e) {
                int[] iArr = this.b;
                Object[] objArr = this.c;
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
                                int iNumberOfTrailingZeros = (i << 3) + (Long.numberOfTrailingZeros(j3) >>> 3);
                                int i2 = iArr[iNumberOfTrailingZeros];
                                Object obj2 = objArr[iNumberOfTrailingZeros];
                                if (obj2 != null) {
                                    j = j2;
                                    if (!awrc.c(obj2, agaVar.a(i2))) {
                                        break loop0;
                                    }
                                    j3 &= j3 - 1;
                                    j2 = j;
                                } else {
                                    if (agaVar.a(i2) != null) {
                                        break loop0;
                                    }
                                    int i3 = agaVar.d;
                                    int i4 = ((i2 >>> 16) ^ i2) * (-862048943);
                                    int i5 = i4 ^ (i4 >>> 16);
                                    int i6 = (i5 >>> 7) & i3;
                                    int i7 = 0;
                                    while (true) {
                                        j = j2;
                                        long[] jArr2 = agaVar.a;
                                        int i8 = i6 >> 3;
                                        long j5 = j4;
                                        int i9 = (i6 & 7) << 3;
                                        long j6 = (jArr2[i8] >>> i9) | ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63));
                                        long j7 = (((long) (i5 & 127)) * 72340172838076673L) ^ j6;
                                        for (long j8 = (j7 - 72340172838076673L) & (~j7) & j; j8 != j5; j8 &= j8 - 1) {
                                            int iNumberOfTrailingZeros2 = (i6 + (Long.numberOfTrailingZeros(j8) >> 3)) & i3;
                                            if (agaVar.b[iNumberOfTrailingZeros2] == i2) {
                                                if (iNumberOfTrailingZeros2 < 0) {
                                                    break loop0;
                                                }
                                                break;
                                            }
                                        }
                                        if ((j6 & ((~j6) << 6) & j) != j5) {
                                            break loop0;
                                        }
                                        i7 += 8;
                                        i6 = (i6 + i7) & i3;
                                        j2 = j;
                                        j4 = j5;
                                    }
                                    j3 &= j3 - 1;
                                    j2 = j;
                                }
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

    public final void f() {
        this.f = agv.a(this.d) - this.e;
    }

    public final void g(aga agaVar) {
        int[] iArr = agaVar.b;
        Object[] objArr = agaVar.c;
        long[] jArr = agaVar.a;
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
                int iNumberOfTrailingZeros = (i << 3) + (Long.numberOfTrailingZeros(j) >>> 3);
                h(iArr[iNumberOfTrailingZeros], objArr[iNumberOfTrailingZeros]);
                j2 = (-1) + j;
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void h(int i, Object obj) {
        int iC = c(i);
        if (iC < 0) {
            iC = ~iC;
        }
        this.b[iC] = i;
        this.c[iC] = obj;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                int i2 = iArr[iNumberOfTrailingZeros];
                Object obj = objArr[iNumberOfTrailingZeros];
                iHashCode += i2 ^ (obj != null ? obj.hashCode() : 0);
                j2 = (-1) + j;
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                    int i3 = iArr[iNumberOfTrailingZeros];
                    Object obj = objArr[iNumberOfTrailingZeros];
                    sb.append(i3);
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

    public aga() {
    }
}
