package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agp extends agg {
    private int f;

    public agp(int i) {
        long[] jArr = agv.a;
        i(i);
    }

    private final int g(int i) {
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

    private final void h() {
        this.f = agv.a(this.d) - this.e;
    }

    private final void i(int i) {
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
        long[] jArr4 = this.a;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr4[i3] = (jArr4[i3] & (~j)) | j;
        h();
        this.b = new long[iMax];
        this.c = new Object[iMax];
    }

    public final int c(long j) {
        long j2;
        int i;
        long j3;
        long[] jArr;
        char c = ' ';
        int i2 = (int) (j ^ (j >>> 32));
        int i3 = -862048943;
        int i4 = (i2 ^ (i2 >>> 16)) * (-862048943);
        int i5 = i4 ^ (i4 >>> 16);
        int i6 = i5 >>> 7;
        int i7 = this.d;
        int i8 = i6 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = jArr2[i10] >>> i11;
            long j5 = jArr2[i10 + 1] << (64 - i11);
            char c2 = c;
            int i12 = i5;
            long j6 = i5 & 127;
            long j7 = j4 | (j5 & ((-i11) >> 63));
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                int i13 = i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i3 = i13;
            }
            int i14 = i3;
            int i15 = i9;
            int i16 = 0;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iG = g(i6);
                if (this.f != 0 || ((this.a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j2 = j6;
                    i = 0;
                    j3 = 128;
                } else {
                    int i17 = this.d;
                    if (i17 <= 8 || Long.compare((((long) this.e) << 5) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) > 0) {
                        j2 = j6;
                        i = 0;
                        j3 = 128;
                        int iB = agv.b(this.d);
                        long[] jArr3 = this.a;
                        long[] jArr4 = this.b;
                        Object[] objArr = this.c;
                        int i18 = this.d;
                        i(iB);
                        long[] jArr5 = this.a;
                        long[] jArr6 = this.b;
                        Object[] objArr2 = this.c;
                        int i19 = this.d;
                        int i20 = 0;
                        while (i20 < i18) {
                            if (((jArr3[i20 >> 3] >> ((i20 & 7) << 3)) & 255) < 128) {
                                long j10 = jArr4[i20];
                                int i21 = (int) ((j10 >>> c2) ^ j10);
                                int i22 = (i21 ^ (i21 >>> 16)) * i14;
                                int i23 = i22 ^ (i22 >>> 16);
                                int iG2 = g(i23 >>> 7);
                                int i24 = iG2 >> 3;
                                int i25 = (iG2 & 7) << 3;
                                jArr = jArr5;
                                long j11 = (jArr5[i24] & (~(255 << i25))) | (((long) (i23 & 127)) << i25);
                                jArr[i24] = j11;
                                jArr[(((iG2 - 7) & i19) + (i19 & 7)) >> 3] = j11;
                                jArr6[iG2] = j10;
                                objArr2[iG2] = objArr[i20];
                            } else {
                                jArr = jArr5;
                            }
                            i20++;
                            jArr3 = jArr3;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr7 = this.a;
                        int i26 = this.d;
                        long[] jArr8 = this.b;
                        Object[] objArr3 = this.c;
                        int i27 = i26 + 7;
                        i = 0;
                        while (i16 < (i27 >> 3)) {
                            long j12 = jArr7[i16] & (-9187201950435737472L);
                            jArr7[i16] = ((~j12) + (j12 >>> 7)) & (-72340172838076674L);
                            i16++;
                            c2 = c2;
                        }
                        char c3 = c2;
                        j3 = 128;
                        int iAO = atqq.aO(jArr7);
                        int i28 = iAO - 1;
                        long j13 = 72057594037927935L;
                        jArr7[i28] = (jArr7[i28] & 72057594037927935L) | (-72057594037927936L);
                        jArr7[iAO] = jArr7[0];
                        int i29 = 0;
                        while (i29 != i26) {
                            int i30 = i29 >> 3;
                            int i31 = (i29 & 7) << 3;
                            long j14 = (jArr7[i30] >> i31) & 255;
                            if (j14 == 128 || j14 != 254) {
                                i29++;
                            } else {
                                long j15 = jArr8[i29];
                                int i32 = (int) (j15 ^ (j15 >>> c3));
                                int i33 = (i32 ^ (i32 >>> 16)) * i14;
                                int i34 = i33 ^ (i33 >>> 16);
                                int i35 = i34 & 127;
                                int i36 = i34 >>> 7;
                                int iG3 = g(i36);
                                int i37 = i36 & i26;
                                long j16 = j13;
                                long j17 = j6;
                                long j18 = i35;
                                if (((iG3 - i37) & i26) / 8 == ((i29 - i37) & i26) / 8) {
                                    jArr7[i30] = (jArr7[i30] & (~(255 << i31))) | (j18 << i31);
                                    jArr7[atqq.aO(jArr7)] = (jArr7[0] & j16) | Long.MIN_VALUE;
                                    i29++;
                                } else {
                                    int i38 = iG3 >> 3;
                                    long j19 = jArr7[i38];
                                    int i39 = (iG3 & 7) << 3;
                                    long j20 = j18 << i39;
                                    long j21 = (~(255 << i39)) & j19;
                                    if (((j19 >> i39) & 255) == 128) {
                                        long j22 = ~(255 << i31);
                                        jArr7[i38] = j21 | j20;
                                        jArr7[i30] = (jArr7[i30] & j22) | (128 << i31);
                                        jArr8[iG3] = jArr8[i29];
                                        jArr8[i29] = 0;
                                        objArr3[iG3] = objArr3[i29];
                                        objArr3[i29] = null;
                                    } else {
                                        jArr7[i38] = j21 | j20;
                                        long j23 = jArr8[iG3];
                                        jArr8[iG3] = jArr8[i29];
                                        jArr8[i29] = j23;
                                        Object obj = objArr3[iG3];
                                        objArr3[iG3] = objArr3[i29];
                                        objArr3[i29] = obj;
                                        i29--;
                                    }
                                    jArr7[atqq.aO(jArr7)] = (jArr7[0] & j16) | Long.MIN_VALUE;
                                    i29++;
                                }
                                j6 = j17;
                                j13 = j16;
                            }
                        }
                        j2 = j6;
                        h();
                    }
                    iG = g(i6);
                }
                this.e++;
                int i40 = this.f;
                long[] jArr9 = this.a;
                int i41 = iG >> 3;
                long j24 = jArr9[i41];
                int i42 = (iG & 7) << 3;
                this.f = i40 - (((j24 >> i42) & 255) != j3 ? i : 1);
                int i43 = this.d;
                long j25 = (j24 & (~(255 << i42))) | (j2 << i42);
                jArr9[i41] = j25;
                jArr9[(((iG - 7) & i43) + (i43 & 7)) >> 3] = j25;
                return ~iG;
            }
            i9 = i15 + 8;
            i8 = (i8 + i9) & i7;
            i5 = i12;
            i3 = i14;
            c = c2;
        }
    }

    public final Object d(long j, Object obj) {
        int iC = c(j);
        if (iC < 0) {
            iC = ~iC;
        }
        Object[] objArr = this.c;
        Object obj2 = objArr[iC];
        this.b[iC] = j;
        objArr[iC] = obj;
        return obj2;
    }

    public final Object e(long j) {
        int iNumberOfTrailingZeros;
        int iAk = a.ak(j);
        int i = (iAk ^ (iAk >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = this.d;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j3 = (((long) (i2 & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = ((-72340172838076673L) + j3) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.e--;
        long[] jArr2 = this.a;
        int i8 = this.d;
        int i9 = iNumberOfTrailingZeros >> 3;
        int i10 = (iNumberOfTrailingZeros & 7) << 3;
        long j5 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
        jArr2[i9] = j5;
        jArr2[(((iNumberOfTrailingZeros - 7) & i8) + (i8 & 7)) >> 3] = j5;
        Object[] objArr = this.c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void f() {
        this.e = 0;
        if (this.a != agv.a) {
            atqq.aZ(this.a, -9187201950435737472L);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        atqq.bc(this.c, 0, this.d);
        h();
    }
}
