package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxf {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static int a(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        ahno.O((i3 ^ (-1)) >>> 31);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            i(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            i(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            i(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    i(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static int c(bse bseVar) {
        String strH = h(bseVar);
        if (Objects.equals(strH, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strH, "video/hevc") || Objects.equals(strH, "video/vvc")) ? 2 : 0;
    }

    public static int d(byte[] bArr, int i, int i2) {
        while (i < i2 - 1) {
            int i3 = 0;
            while (i < i2) {
                int i4 = i + 1;
                int i5 = bArr[i] & 255;
                i3 += i5;
                if (i5 != 255) {
                    int i6 = 0;
                    while (i4 < i2) {
                        int i7 = i4 + 1;
                        int i8 = bArr[i4] & 255;
                        i6 += i8;
                        if (i8 == 255) {
                            i4 = i7;
                        } else {
                            if (i6 < 0 || i6 > i2 - i7) {
                                return -1;
                            }
                            if (i3 == 45 && i6 > 0) {
                                dqp dqpVar = new dqp(bArr, i7 + i6);
                                dqpVar.q(i7 << 3);
                                int i9 = 0;
                                while (dqpVar.f() > 0 && !dqpVar.u()) {
                                    i9++;
                                }
                                if (i9 <= 31 && dqpVar.f() >= i9 + 1) {
                                    dqpVar.s(i9);
                                    if (!dqpVar.u()) {
                                        if (dqpVar.f() < 7) {
                                            continue;
                                        } else {
                                            int i10 = dqpVar.i(7);
                                            if (i10 == 3) {
                                                return 2;
                                            }
                                            if (i10 == 4) {
                                                return 1;
                                            }
                                            if (i10 == 6) {
                                            }
                                        }
                                    }
                                    return 0;
                                }
                            }
                            i = i6 + i7;
                        }
                    }
                    return -1;
                }
                i = i4;
            }
            return -1;
        }
        return -1;
    }

    public static int e(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    int i5 = i3 + 1;
                    if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3 = i5;
                }
                if (i3 < i) {
                    int[] iArrCopyOf = d;
                    int length = iArrCopyOf.length;
                    if (length <= i4) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, length << 1);
                        d = iArrCopyOf;
                    }
                    iArrCopyOf[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = d[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    public static bxb f(bxi bxiVar, boolean z, int i, bxb bxbVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int[] iArr2 = new int[6];
        if (z) {
            int iA = bxiVar.a(2);
            boolean zG = bxiVar.g();
            int iA2 = bxiVar.a(5);
            int i5 = 0;
            for (int i6 = 0; i6 < 32; i6++) {
                if (bxiVar.g()) {
                    i5 |= 1 << i6;
                }
            }
            for (int i7 = 0; i7 < 6; i7++) {
                iArr2[i7] = bxiVar.a(8);
            }
            i2 = iA;
            iArr = iArr2;
            i3 = iA2;
            i4 = i5;
            z2 = zG;
        } else if (bxbVar != null) {
            int i8 = bxbVar.a;
            boolean z3 = bxbVar.b;
            int i9 = bxbVar.c;
            int i10 = bxbVar.d;
            i2 = i8;
            iArr = bxbVar.e;
            i3 = i9;
            i4 = i10;
            z2 = z3;
        } else {
            iArr = iArr2;
            i2 = 0;
            z2 = false;
            i3 = 0;
            i4 = 0;
        }
        int iA3 = bxiVar.a(8);
        int i11 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            if (bxiVar.g()) {
                i11 += 88;
            }
            if (bxiVar.g()) {
                i11 += 8;
            }
        }
        bxiVar.e(i11);
        if (i > 0) {
            bxiVar.e((8 - i) << 1);
        }
        return new bxb(i2, z2, i3, i4, iArr, iA3);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0185  */
    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01de  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0205  */
    /* JADX WARN: Code duplicated, block: B:136:0x0211  */
    /* JADX WARN: Code duplicated, block: B:138:0x022e  */
    /* JADX WARN: Code duplicated, block: B:143:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:94:0x0163  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    public static bxe g(byte[] bArr, int i, int i2) {
        int iB;
        int i3;
        int iB2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iB3;
        int i15;
        float f;
        float f2;
        int i16;
        int i17;
        int i18;
        int i19;
        int iA;
        int iB4;
        int i20;
        boolean zG;
        boolean zG2;
        int i21;
        int iA2;
        int iA3;
        int iA4;
        int i22;
        bxi bxiVar = new bxi(bArr, i, i2);
        int iA5 = bxiVar.a(8);
        int iA6 = bxiVar.a(8);
        int iA7 = bxiVar.a(8);
        int iB5 = bxiVar.b();
        if (iA5 == 100 || iA5 == 110 || iA5 == 122 || iA5 == 244 || iA5 == 44 || iA5 == 83 || iA5 == 86 || iA5 == 118 || iA5 == 128) {
            iB = bxiVar.b();
            if (iB == 3) {
                bxiVar.g();
                i3 = 3;
            } else {
                i3 = iB;
            }
            iB2 = bxiVar.b();
            int iB6 = bxiVar.b();
            bxiVar.d();
            if (bxiVar.g()) {
                if (i3 != 3) {
                    i5 = 8;
                } else {
                    i5 = 12;
                }
                for (i6 = 0; i6 < i5; i6++) {
                    if (!bxiVar.g()) {
                        if (i6 < 6) {
                            i7 = 16;
                        } else {
                            i7 = 64;
                        }
                        i8 = 0;
                        i9 = 8;
                        i10 = 8;
                        while (i8 < i7) {
                            if (i9 != 0) {
                                int iB7 = bxiVar.b();
                                i12 = iB7 % 2;
                                int i23 = (iB7 + 1) / 2;
                                if (i12 == 0) {
                                    i13 = -1;
                                } else {
                                    i13 = 1;
                                }
                                i11 = ((i10 + (i13 * i23)) + SemanticState.Hidden) % SemanticState.Hidden;
                            } else {
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                i10 = i11;
                            }
                            i8++;
                            i9 = i11;
                        }
                    }
                }
            }
            i4 = iB6;
        } else if (iA5 == 138) {
            iA5 = 138;
            iB = bxiVar.b();
            if (iB == 3) {
                bxiVar.g();
                i3 = 3;
            } else {
                i3 = iB;
            }
            iB2 = bxiVar.b();
            int iB8 = bxiVar.b();
            bxiVar.d();
            if (bxiVar.g()) {
                if (i3 != 3) {
                    i5 = 8;
                } else {
                    i5 = 12;
                }
                while (i6 < i5) {
                    if (!bxiVar.g()) {
                        if (i6 < 6) {
                            i7 = 16;
                        } else {
                            i7 = 64;
                        }
                        i8 = 0;
                        i9 = 8;
                        i10 = 8;
                        while (i8 < i7) {
                            if (i9 != 0) {
                                int iB9 = bxiVar.b();
                                i12 = iB9 % 2;
                                int i24 = (iB9 + 1) / 2;
                                if (i12 == 0) {
                                    i13 = -1;
                                } else {
                                    i13 = 1;
                                }
                                i11 = ((i10 + (i13 * i24)) + SemanticState.Hidden) % SemanticState.Hidden;
                            } else {
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                i10 = i11;
                            }
                            i8++;
                            i9 = i11;
                        }
                    }
                }
            }
            i4 = iB8;
        } else {
            iB = 1;
            i4 = 0;
            iB2 = 0;
        }
        bxiVar.b();
        int iB10 = bxiVar.b();
        if (iB10 == 0) {
            bxiVar.b();
        } else if (iB10 == 1) {
            bxiVar.g();
            bxiVar.b();
            bxiVar.b();
            long jB = bxiVar.b();
            for (int i25 = 0; i25 < jB; i25++) {
                bxiVar.b();
            }
        }
        bxiVar.b();
        bxiVar.d();
        int iB11 = bxiVar.b() + 1;
        int iB12 = bxiVar.b() + 1;
        boolean zG3 = bxiVar.g();
        int i26 = 2 - (zG3 ? 1 : 0);
        if (!zG3) {
            bxiVar.d();
        }
        bxiVar.d();
        int i27 = iB11 << 4;
        int i28 = (iB12 * i26) << 4;
        if (bxiVar.g()) {
            int iB13 = bxiVar.b();
            int iB14 = bxiVar.b();
            int iB15 = bxiVar.b();
            int iB16 = bxiVar.b();
            if (iB == 0) {
                i22 = 1;
            } else {
                i22 = iB == 3 ? 1 : 2;
                i26 *= iB == 1 ? 2 : 1;
            }
            i27 -= (iB13 + iB14) * i22;
            i28 -= (iB15 + iB16) * i26;
        }
        int i29 = i27;
        int i30 = i28;
        if (iA5 != 44 && iA5 != 86 && iA5 != 100 && iA5 != 110 && iA5 != 122) {
            if (iA5 == 244) {
                i14 = 244;
            } else {
                i15 = iA5;
            }
            f = 1.0f;
            if (bxiVar.g()) {
                if (bxiVar.g()) {
                    iA2 = bxiVar.a(8);
                    if (iA2 == 255) {
                        iA3 = bxiVar.a(16);
                        iA4 = bxiVar.a(16);
                        if (iA3 != 0 && iA4 != 0) {
                            f = iA3 / iA4;
                        }
                    } else if (iA2 < 17) {
                        f = b[iA2];
                    } else {
                        bvx.e("NalUnitUtil", a.bR(iA2, "Unexpected aspect_ratio_idc value: "));
                    }
                }
                if (bxiVar.g()) {
                    bxiVar.d();
                }
                if (bxiVar.g()) {
                    bxiVar.e(3);
                    i21 = true != bxiVar.g() ? 2 : 1;
                    if (bxiVar.g()) {
                        int iA8 = bxiVar.a(8);
                        int iA9 = bxiVar.a(8);
                        bxiVar.e(8);
                        iA = bru.a(iA8);
                        iB4 = bru.b(iA9);
                        i20 = i21;
                    } else {
                        i20 = i21;
                        iA = -1;
                        iB4 = -1;
                    }
                } else {
                    iA = -1;
                    iB4 = -1;
                    i20 = -1;
                }
                if (bxiVar.g()) {
                    bxiVar.b();
                    bxiVar.b();
                }
                if (bxiVar.g()) {
                    bxiVar.e(65);
                }
                zG = bxiVar.g();
                if (zG) {
                    n(bxiVar);
                }
                zG2 = bxiVar.g();
                if (zG2) {
                    n(bxiVar);
                }
                if (zG || zG2) {
                    bxiVar.d();
                }
                bxiVar.d();
                if (bxiVar.g()) {
                    bxiVar.d();
                    bxiVar.b();
                    bxiVar.b();
                    bxiVar.b();
                    bxiVar.b();
                    iB3 = bxiVar.b();
                    bxiVar.b();
                }
                i17 = iA;
                f2 = f;
                i16 = iB3;
                i18 = i20;
                i19 = iB4;
            } else {
                f2 = 1.0f;
                i16 = iB3;
                i17 = -1;
                i18 = -1;
                i19 = -1;
            }
            return new bxe(i15, iA6, iA7, iB5, i29, i30, f2, iB2, i4, i17, i18, i19, i16);
        }
        i14 = iA5;
        i15 = i14;
        iB3 = (iA6 & 16) != 0 ? 0 : 16;
        f = 1.0f;
        if (bxiVar.g()) {
            if (bxiVar.g()) {
                iA2 = bxiVar.a(8);
                if (iA2 == 255) {
                    iA3 = bxiVar.a(16);
                    iA4 = bxiVar.a(16);
                    if (iA3 != 0) {
                        f = iA3 / iA4;
                    }
                } else if (iA2 < 17) {
                    f = b[iA2];
                } else {
                    bvx.e("NalUnitUtil", a.bR(iA2, "Unexpected aspect_ratio_idc value: "));
                }
            }
            if (bxiVar.g()) {
                bxiVar.d();
            }
            if (bxiVar.g()) {
                bxiVar.e(3);
                if (true != bxiVar.g()) {
                }
                if (bxiVar.g()) {
                    int iA10 = bxiVar.a(8);
                    int iA11 = bxiVar.a(8);
                    bxiVar.e(8);
                    iA = bru.a(iA10);
                    iB4 = bru.b(iA11);
                    i20 = i21;
                } else {
                    i20 = i21;
                    iA = -1;
                    iB4 = -1;
                }
            } else {
                iA = -1;
                iB4 = -1;
                i20 = -1;
            }
            if (bxiVar.g()) {
                bxiVar.b();
                bxiVar.b();
            }
            if (bxiVar.g()) {
                bxiVar.e(65);
            }
            zG = bxiVar.g();
            if (zG) {
                n(bxiVar);
            }
            zG2 = bxiVar.g();
            if (zG2) {
                n(bxiVar);
            }
            if (zG) {
                bxiVar.d();
            } else {
                bxiVar.d();
            }
            bxiVar.d();
            if (bxiVar.g()) {
                bxiVar.d();
                bxiVar.b();
                bxiVar.b();
                bxiVar.b();
                bxiVar.b();
                iB3 = bxiVar.b();
                bxiVar.b();
            }
            i17 = iA;
            f2 = f;
            i16 = iB3;
            i18 = i20;
            i19 = iB4;
        } else {
            f2 = 1.0f;
            i16 = iB3;
            i17 = -1;
            i18 = -1;
            i19 = -1;
        }
        return new bxe(i15, iA6, iA7, iB5, i29, i30, f2, iB2, i4, i17, i18, i19, i16);
    }

    public static String h(bse bseVar) {
        String str;
        String str2 = bseVar.q;
        if (!Objects.equals(str2, "video/dolby-vision") || (str = bseVar.l) == null) {
            return str2;
        }
        if (str.startsWith("dva1") || str.startsWith("dvav")) {
            return "video/avc";
        }
        return (str.startsWith("dvh1") || str.startsWith("dvhe")) ? "video/hevc" : str2;
    }

    public static void i(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean j(byte[] bArr, int i, bse bseVar) {
        int i2;
        String str = bseVar.q;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            aamu aamuVarM = m(new bxi(bArr, 4, i + 4));
            int i3 = aamuVarM.a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && aamuVarM.c == bseVar.H - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    public static bxd k(byte[] bArr, int i, int i2, dep depVar) {
        int i3;
        boolean z;
        int i4;
        int iA;
        int i5;
        int i6;
        int i7;
        int iB;
        int iB2;
        int i8;
        int i9;
        int iMax;
        float f;
        int i10;
        int i11;
        int i12;
        int iA2;
        int iB3;
        int i13;
        Object obj;
        int i14;
        Object obj2;
        aamu aamuVarM = m(new bxi(bArr, i, i2));
        bxi bxiVar = new bxi(bArr, i + 2, i2);
        int i15 = 4;
        bxiVar.e(4);
        int iA3 = bxiVar.a(3);
        int i16 = aamuVarM.b;
        if (i16 == 0 || iA3 != 7) {
            i3 = iA3;
            z = false;
        } else {
            z = true;
            i3 = 7;
        }
        if (depVar != null) {
            agke agkeVar = (agke) depVar.a;
            if (agkeVar.isEmpty()) {
                i4 = 0;
            } else {
                i4 = ((ys) agkeVar.get(Math.min(i16, agkeVar.size() - 1))).b;
            }
        } else {
            i4 = 0;
        }
        bxb bxbVarF = null;
        if (!z) {
            bxiVar.d();
            bxbVarF = f(bxiVar, true, i3, null);
        } else if (depVar != null) {
            eol eolVar = (eol) depVar.c;
            int i17 = ((int[]) eolVar.a)[i4];
            agke agkeVar2 = (agke) eolVar.b;
            if (agkeVar2.size() > i17) {
                bxbVarF = (bxb) agkeVar2.get(i17);
            }
        }
        bxiVar.b();
        if (z) {
            int iA4 = bxiVar.g() ? bxiVar.a(8) : -1;
            if (depVar == null || (obj2 = depVar.d) == null) {
                iB = 0;
                iB2 = 0;
                i9 = 0;
                i7 = 0;
                i8 = 0;
                i6 = 0;
            } else {
                if (iA4 == -1) {
                    iA4 = ((int[]) ((eol) obj2).b)[i4];
                }
                if (iA4 != -1) {
                    agke agkeVar3 = (agke) ((eol) obj2).a;
                    if (agkeVar3.size() > iA4) {
                        bxc bxcVar = (bxc) agkeVar3.get(iA4);
                        int i18 = bxcVar.a;
                        i9 = bxcVar.d;
                        i7 = bxcVar.e;
                        iB = bxcVar.b;
                        iB2 = bxcVar.c;
                        i8 = i9;
                        i6 = i7;
                    } else {
                        iB = 0;
                        iB2 = 0;
                        i9 = 0;
                        i7 = 0;
                        i8 = 0;
                        i6 = 0;
                    }
                } else {
                    iB = 0;
                    iB2 = 0;
                    i9 = 0;
                    i7 = 0;
                    i8 = 0;
                    i6 = 0;
                }
            }
        } else {
            int iB4 = bxiVar.b();
            if (iB4 == 3) {
                bxiVar.d();
                iB4 = 3;
            }
            int iB5 = bxiVar.b();
            int iB6 = bxiVar.b();
            if (bxiVar.g()) {
                int iB7 = bxiVar.b();
                int iB8 = bxiVar.b();
                int iB9 = bxiVar.b();
                int iB10 = bxiVar.b();
                iA = a(iB5, iB4, iB7, iB8);
                i5 = iB6 - ((iB4 == 1 ? 2 : 1) * (iB9 + iB10));
            } else {
                iA = iB5;
                i5 = iB6;
            }
            i6 = iB6;
            i7 = i5;
            iB = bxiVar.b();
            iB2 = bxiVar.b();
            i8 = iB5;
            i9 = iA;
        }
        int iB11 = bxiVar.b();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i19 = true != bxiVar.g() ? i3 : 0; i19 <= i3; i19++) {
                bxiVar.b();
                iMax = Math.max(bxiVar.b(), iMax);
                bxiVar.b();
            }
        }
        bxiVar.b();
        bxiVar.b();
        bxiVar.b();
        bxiVar.b();
        bxiVar.b();
        bxiVar.b();
        if (bxiVar.g()) {
            int i20 = 6;
            if (z && bxiVar.g()) {
                bxiVar.e(6);
            } else if (bxiVar.g()) {
                int i21 = 0;
                while (i21 < i15) {
                    int i22 = 0;
                    while (i22 < i20) {
                        if (bxiVar.g()) {
                            int iMin = Math.min(64, 1 << ((i21 << 1) + 4));
                            if (i21 > 1) {
                                bxiVar.b();
                            }
                            for (int i23 = 0; i23 < iMin; i23++) {
                                bxiVar.b();
                            }
                        } else {
                            bxiVar.b();
                        }
                        i22 += i21 == 3 ? 3 : 1;
                        i20 = 6;
                    }
                    i21++;
                    i15 = 4;
                    i20 = 6;
                }
            }
        }
        bxiVar.e(2);
        if (bxiVar.g()) {
            bxiVar.e(8);
            bxiVar.b();
            bxiVar.b();
            bxiVar.d();
        }
        int iB12 = bxiVar.b();
        int i24 = 0;
        int[] iArrCopyOf = new int[0];
        int[] iArr = new int[0];
        int i25 = -1;
        int i26 = -1;
        while (i24 < iB12) {
            if (i24 == 0 || !bxiVar.g()) {
                int iB13 = bxiVar.b();
                int iB14 = bxiVar.b();
                int[] iArr2 = new int[iB13];
                int i27 = 0;
                while (i27 < iB13) {
                    iArr2[i27] = (i27 > 0 ? iArr2[i27 - 1] : 0) - (bxiVar.b() + 1);
                    bxiVar.d();
                    i27++;
                }
                int[] iArr3 = new int[iB14];
                int i28 = 0;
                while (i28 < iB14) {
                    iArr3[i28] = (i28 > 0 ? iArr3[i28 - 1] : 0) + bxiVar.b() + 1;
                    bxiVar.d();
                    i28++;
                }
                i26 = iB13;
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i25 = iB14;
            } else {
                int i29 = i26 + i25;
                boolean zG = bxiVar.g();
                int iB15 = bxiVar.b() + 1;
                int i30 = 1 - ((zG ? 1 : 0) << 1);
                int i31 = i29 + 1;
                boolean[] zArr = new boolean[i31];
                for (int i32 = 0; i32 <= i29; i32++) {
                    if (bxiVar.g()) {
                        zArr[i32] = true;
                    } else {
                        zArr[i32] = bxiVar.g();
                    }
                }
                int i33 = i25 - 1;
                int[] iArr4 = new int[i31];
                int[] iArr5 = new int[i31];
                int i34 = 0;
                while (true) {
                    i14 = i30 * iB15;
                    if (i33 < 0) {
                        break;
                    }
                    int i35 = iArrCopyOf[i33] + i14;
                    if (i35 < 0 && zArr[i26 + i33]) {
                        iArr4[i34] = i35;
                        i34++;
                    }
                    i33--;
                }
                if (i14 < 0 && zArr[i29]) {
                    iArr4[i34] = i14;
                    i34++;
                }
                int i36 = i34;
                for (int i37 = 0; i37 < i26; i37++) {
                    int i38 = iArr[i37] + i14;
                    if (i38 < 0 && zArr[i37]) {
                        iArr4[i36] = i38;
                        i36++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i36);
                int i39 = 0;
                for (int i40 = i26 - 1; i40 >= 0; i40--) {
                    int i41 = iArr[i40] + i14;
                    if (i41 > 0 && zArr[i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                if (i14 > 0 && zArr[i29]) {
                    iArr5[i39] = i14;
                    i39++;
                }
                iArr = iArrCopyOf2;
                int i42 = i39;
                for (int i43 = 0; i43 < i25; i43++) {
                    int i44 = iArrCopyOf[i43] + i14;
                    if (i44 > 0 && zArr[i26 + i43]) {
                        iArr5[i42] = i44;
                        i42++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i42);
                i26 = i36;
                i25 = i42;
            }
            i24++;
            iB12 = iB12;
            iMax = iMax;
            i4 = i4;
        }
        int i45 = i4;
        int i46 = iMax;
        if (bxiVar.g()) {
            int iB16 = bxiVar.b();
            for (int i47 = 0; i47 < iB16; i47++) {
                bxiVar.e(iB11 + 5);
            }
        }
        bxiVar.e(2);
        float f2 = 1.0f;
        if (bxiVar.g()) {
            if (bxiVar.g()) {
                int iA5 = bxiVar.a(8);
                if (iA5 == 255) {
                    int iA6 = bxiVar.a(16);
                    int iA7 = bxiVar.a(16);
                    if (iA6 != 0 && iA7 != 0) {
                        f2 = iA6 / iA7;
                    }
                } else if (iA5 < 17) {
                    f2 = b[iA5];
                } else {
                    bvx.e("NalUnitUtil", a.bR(iA5, "Unexpected aspect_ratio_idc value: "));
                }
            }
            if (bxiVar.g()) {
                bxiVar.d();
            }
            if (bxiVar.g()) {
                bxiVar.e(3);
                i13 = true != bxiVar.g() ? 2 : 1;
                if (bxiVar.g()) {
                    int iA8 = bxiVar.a(8);
                    int iA9 = bxiVar.a(8);
                    bxiVar.e(8);
                    iA2 = bru.a(iA8);
                    iB3 = bru.b(iA9);
                } else {
                    iA2 = -1;
                    iB3 = -1;
                }
            } else if (depVar == null || (obj = depVar.b) == null) {
                iA2 = -1;
                iB3 = -1;
                i13 = -1;
            } else {
                eol eolVar2 = (eol) obj;
                int i48 = ((int[]) eolVar2.b)[i45];
                agke agkeVar4 = (agke) eolVar2.a;
                if (agkeVar4.size() > i48) {
                    aamu aamuVar = (aamu) agkeVar4.get(i48);
                    int i49 = aamuVar.a;
                    int i50 = aamuVar.b;
                    iB3 = aamuVar.c;
                    iA2 = i49;
                    i13 = i50;
                } else {
                    iA2 = -1;
                    iB3 = -1;
                    i13 = -1;
                }
            }
            if (bxiVar.g()) {
                bxiVar.b();
                bxiVar.b();
            }
            bxiVar.d();
            if (bxiVar.g()) {
                i7 <<= 1;
            }
            i10 = iA2;
            i12 = iB3;
            f = f2;
            i11 = i13;
        } else {
            f = 1.0f;
            i10 = -1;
            i11 = -1;
            i12 = -1;
        }
        return new bxd(i3, bxbVarF, iB, iB2, i9, i7, i8, i6, f, i46, i10, i11, i12);
    }

    public static amp l(byte[] bArr, int i) {
        bxi bxiVar = new bxi(bArr, 4, i);
        int iB = bxiVar.b();
        bxiVar.b();
        bxiVar.d();
        bxiVar.g();
        return new amp(iB);
    }

    public static aamu m(bxi bxiVar) {
        bxiVar.d();
        return new aamu(bxiVar.a(6), bxiVar.a(6), bxiVar.a(3) - 1);
    }

    private static void n(bxi bxiVar) {
        int iB = bxiVar.b() + 1;
        bxiVar.e(8);
        for (int i = 0; i < iB; i++) {
            bxiVar.b();
            bxiVar.b();
            bxiVar.d();
        }
        bxiVar.e(20);
    }
}
