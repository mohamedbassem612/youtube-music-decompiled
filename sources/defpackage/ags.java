package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ags {
    public long[] a = agv.a;
    public Object[] b = ahe.c;
    public long[] c = agz.a;
    public int d = Alert.DURATION_SHOW_INDEFINITELY;
    public int e = Alert.DURATION_SHOW_INDEFINITELY;
    public int f;
    public int g;
    private int h;

    public ags(int i) {
        e(i);
    }

    private final int c(int i) {
        int i2 = this.f;
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

    private final void d() {
        this.h = agv.a(this.f) - this.g;
    }

    private final void e(int i) {
        int iMax;
        long[] jArr;
        int i2;
        int i3;
        Object[] objArr;
        long[] jArr2;
        if (i > 0) {
            long[] jArr3 = agv.a;
            iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.f = iMax;
        if (iMax == 0) {
            jArr = agv.a;
            i2 = 0;
        } else {
            int i4 = (iMax + 15) >> 3;
            long[] jArr4 = new long[i4];
            Arrays.fill(jArr4, 0, i4, -9187201950435737472L);
            jArr = jArr4;
            i2 = iMax;
        }
        this.a = jArr;
        int i5 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j)) | j;
        d();
        if (iMax == 0) {
            objArr = ahe.c;
            i3 = 0;
        } else {
            i3 = iMax;
            objArr = new Object[iMax];
        }
        this.b = objArr;
        if (i3 == 0) {
            jArr2 = agz.a;
        } else {
            jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, 4611686018427387903L);
        }
        this.c = jArr2;
    }

    public final int a(Object obj) {
        int i;
        long j;
        int i2;
        long j2;
        int iNumberOfTrailingZeros;
        int i3;
        long[] jArr;
        int i4;
        int iHashCode = obj.hashCode();
        int i5 = -862048943;
        int i6 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i7 = i6 ^ (i6 >>> 16);
        int i8 = i7 >>> 7;
        int i9 = this.f;
        int i10 = i8 & i9;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i13 = i10 >> 3;
            int i14 = (i10 & 7) << 3;
            long j3 = jArr2[i13] >>> i14;
            long j4 = jArr2[i13 + 1] << (64 - i14);
            int i15 = 1;
            long j5 = i7 & 127;
            long j6 = j3 | (j4 & ((-i14) >> 63));
            long j7 = (72340172838076673L * j5) ^ j6;
            long j8 = (j7 - 72340172838076673L) & (~j7);
            long j9 = -9187201950435737472L;
            long j10 = j8 & (-9187201950435737472L);
            while (j10 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i10) & i9;
                int i16 = i5;
                long j11 = j9;
                if (awrc.c(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
                i5 = i16;
                j9 = j11;
            }
            int i17 = i5;
            long j12 = j9;
            if ((j6 & ((~j6) << 6) & j12) != 0) {
                int iC = c(i8);
                if (this.h != 0 || ((this.a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = 255;
                    i2 = 1;
                    j2 = 128;
                } else {
                    int i18 = this.f;
                    if (i18 > 8) {
                        j2 = 128;
                        j = 255;
                        if (Long.compare((((long) this.g) << 5) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            if (jArr3 == null) {
                                i4 = i8;
                                i = 0;
                                i2 = 1;
                            } else {
                                int i19 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr4 = this.c;
                                long[] jArr5 = new long[i19];
                                Arrays.fill(jArr5, 0, i19, 9223372034707292159L);
                                int i20 = (i19 + 7) >> 3;
                                int i21 = 0;
                                while (i21 < i20) {
                                    int i22 = i11;
                                    long j13 = jArr3[i21] & j12;
                                    jArr3[i21] = ((~j13) + (j13 >>> 7)) & (-72340172838076674L);
                                    i21++;
                                    i15 = i15;
                                    i11 = i22;
                                    jArr4 = jArr4;
                                }
                                i = i11;
                                long[] jArr6 = jArr4;
                                i2 = i15;
                                int iAO = atqq.aO(jArr3);
                                int i23 = iAO - 1;
                                jArr3[i23] = (jArr3[i23] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[iAO] = jArr3[i];
                                int i24 = i;
                                while (i24 != i19) {
                                    int i25 = i24 >> 3;
                                    int i26 = (i24 & 7) << 3;
                                    long j14 = (jArr3[i25] >> i26) & 255;
                                    if (j14 == 128 || j14 != 254) {
                                        i24++;
                                    } else {
                                        Object obj2 = objArr[i24];
                                        int iHashCode2 = obj2 != null ? obj2.hashCode() : i;
                                        int i27 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i17;
                                        int i28 = i27 ^ (i27 >>> 16);
                                        int i29 = i28 & 127;
                                        int i30 = i28 >>> 7;
                                        int iC2 = c(i30);
                                        int i31 = i30 & i19;
                                        int i32 = i8;
                                        long j15 = i29;
                                        if (((iC2 - i31) & i19) / 8 == ((i24 - i31) & i19) / 8) {
                                            int i33 = i24 + 1;
                                            jArr3[i25] = (jArr3[i25] & (~(255 << i26))) | (j15 << i26);
                                            if (jArr5[i24] == 9223372034707292159L) {
                                                long j16 = i24;
                                                jArr5[i24] = (j16 << 32) | j16;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[i];
                                            i24 = i33;
                                        } else {
                                            long j17 = i24;
                                            long j18 = iC2;
                                            int i34 = iC2 >> 3;
                                            long j19 = jArr3[i34];
                                            int i35 = (iC2 & 7) << 3;
                                            long j20 = j15 << i35;
                                            long j21 = j19 & (~(255 << i35));
                                            if (((j19 >> i35) & 255) == 128) {
                                                long j22 = j17 << 32;
                                                long j23 = ~(255 << i26);
                                                jArr3[i34] = j21 | j20;
                                                jArr3[i25] = (jArr3[i25] & j23) | (128 << i26);
                                                objArr[iC2] = objArr[i24];
                                                objArr[i24] = null;
                                                jArr6[iC2] = jArr6[i24];
                                                jArr6[i24] = 4611686018427387903L;
                                                int i36 = (int) ((jArr5[i24] >> 32) & 4294967295L);
                                                if (i36 != Integer.MAX_VALUE) {
                                                    jArr5[i36] = (jArr5[i36] & (-4294967296L)) | j18;
                                                    jArr5[i24] = (jArr5[i24] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr5[i24] = j18 | 9223372032559808512L;
                                                }
                                                jArr5[iC2] = j22 | 2147483647L;
                                            } else {
                                                long j24 = j18 << 32;
                                                jArr3[i34] = j21 | j20;
                                                Object obj3 = objArr[iC2];
                                                objArr[iC2] = objArr[i24];
                                                objArr[i24] = obj3;
                                                long j25 = jArr6[iC2];
                                                jArr6[iC2] = jArr6[i24];
                                                jArr6[i24] = j25;
                                                int i37 = (int) ((jArr5[i24] >> 32) & 4294967295L);
                                                if (i37 != Integer.MAX_VALUE) {
                                                    jArr5[i37] = (jArr5[i37] & (-4294967296L)) | j18;
                                                    jArr5[i24] = j24 | (jArr5[i24] & 4294967295L);
                                                } else {
                                                    jArr5[i24] = j24 | j18;
                                                    i37 = i24;
                                                }
                                                jArr5[iC2] = (((long) i37) << 32) | j17;
                                                i24--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[i];
                                            i24++;
                                        }
                                        i8 = i32;
                                    }
                                }
                                i3 = i8;
                                d();
                                long[] jArr7 = this.c;
                                int length = jArr7.length;
                                for (int i38 = i; i38 < length; i38++) {
                                    long j26 = jArr7[i38];
                                    int i39 = (int) ((j26 >> 31) & 2147483647L);
                                    int i40 = (int) (j26 & 2147483647L);
                                    jArr7[i38] = (((j26 & (-4611686018427387904L)) | ((long) (i39 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i39] & 4294967295L)))) << 31) | ((long) (i40 == Integer.MAX_VALUE ? Alert.DURATION_SHOW_INDEFINITELY : (int) (jArr5[i40] & 4294967295L)));
                                }
                                int i41 = this.d;
                                if (i41 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr5[i41] & 4294967295L);
                                }
                                int i42 = this.e;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr5[i42] & 4294967295L);
                                }
                            }
                            iC = c(i4);
                        }
                        i4 = i3;
                        iC = c(i4);
                    } else {
                        j = 255;
                        j2 = 128;
                    }
                    i3 = i8;
                    i = 0;
                    i2 = 1;
                    int iB = agv.b(this.f);
                    long[] jArr8 = this.a;
                    Object[] objArr2 = this.b;
                    long[] jArr9 = this.c;
                    int i43 = this.f;
                    int[] iArr = new int[i43];
                    e(iB);
                    long[] jArr10 = this.a;
                    Object[] objArr3 = this.b;
                    long[] jArr11 = this.c;
                    int i44 = this.f;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr8[i45 >> 3] >> ((i45 & 7) << 3)) & j) < j2) {
                            Object obj4 = objArr2[i45];
                            int iHashCode3 = obj4 != null ? obj4.hashCode() : 0;
                            int i46 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i17;
                            int i47 = i46 ^ (i46 >>> 16);
                            int iC3 = c(i47 >>> 7);
                            int i48 = iC3 >> 3;
                            int i49 = (iC3 & 7) << 3;
                            jArr = jArr10;
                            long j27 = (jArr10[i48] & (~(j << i49))) | (((long) (i47 & 127)) << i49);
                            jArr[i48] = j27;
                            jArr[(((iC3 - 7) & i44) + (i44 & 7)) >> 3] = j27;
                            objArr3[iC3] = obj4;
                            jArr11[iC3] = jArr9[i45];
                            iArr[i45] = iC3;
                        } else {
                            jArr = jArr10;
                        }
                        i45++;
                        jArr8 = jArr8;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.c;
                    int length2 = jArr12.length;
                    for (int i50 = 0; i50 < length2; i50++) {
                        long j28 = jArr12[i50];
                        int i51 = (int) ((j28 >> 31) & 2147483647L);
                        int i52 = (int) (j28 & 2147483647L);
                        jArr12[i50] = (((j28 & (-4611686018427387904L)) | ((long) (i51 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i51]))) << 31) | ((long) (i52 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i52]));
                    }
                    int i53 = this.d;
                    if (i53 != Integer.MAX_VALUE) {
                        this.d = iArr[i53];
                    }
                    int i54 = this.e;
                    if (i54 != Integer.MAX_VALUE) {
                        this.e = iArr[i54];
                    }
                    i4 = i3;
                    iC = c(i4);
                }
                iNumberOfTrailingZeros = iC;
                this.g++;
                int i55 = this.h;
                long[] jArr13 = this.a;
                int i56 = iNumberOfTrailingZeros >> 3;
                long j29 = jArr13[i56];
                int i57 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j29 >> i57) & j) != j2) {
                    i2 = i;
                }
                this.h = i55 - i2;
                int i58 = this.f;
                long j30 = (j29 & (~(j << i57))) | (j5 << i57);
                jArr13[i56] = j30;
                jArr13[(((iNumberOfTrailingZeros - 7) & i58) + (i58 & 7)) >> 3] = j30;
                break;
            }
            i12 += 8;
            i10 = (i10 + i12) & i9;
            i5 = i17;
        }
        return iNumberOfTrailingZeros;
    }

    public final boolean b(Object obj) {
        int i = this.g;
        int iA = a(obj);
        this.b[iA] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[iA] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = (jArr[i2] & (-4611686016279904257L)) | ((((long) iA) & 2147483647L) << 31);
        }
        this.d = iA;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iA;
        }
        return this.g != i;
    }

    public final boolean equals(Object obj) {
        boolean z;
        long j;
        int iNumberOfTrailingZeros;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ags) {
            ags agsVar = (ags) obj;
            if (agsVar.g == this.g) {
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
                                int i2 = agsVar.f;
                                int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
                                int i4 = i3 ^ (i3 >>> 16);
                                int i5 = (i4 >>> 7) & i2;
                                int i6 = 0;
                                while (true) {
                                    long[] jArr2 = agsVar.a;
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
                                            if (awrc.c(agsVar.b[iNumberOfTrailingZeros], obj2)) {
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
        int iHashCode = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = ~jArr[i];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j == 0) {
                        break;
                    }
                    Object obj = objArr[(i << 3) + (Long.numberOfTrailingZeros(j) >>> 3)];
                    if (!awrc.c(obj, this)) {
                        iHashCode += obj != null ? obj.hashCode() : 0;
                    }
                    j2 = (-1) + j;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        agw agwVar = new agw(this, 1);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i] >> 31;
            Object obj = objArr[i];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) agwVar.invoke(obj));
            i2++;
            i = (int) (j & 2147483647L);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public ags() {
    }
}
