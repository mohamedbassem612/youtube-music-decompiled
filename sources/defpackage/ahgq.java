package defpackage;

import app.rive.semantics.SemanticState;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahgq {
    private static final ahgo c = new ahgo(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final aciz b = new aciz(new axlj(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, (char[]) null);
    public static final byte[] a = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static int a(long[] jArr) {
        return ahgv.g(jArr)[0] & 1;
    }

    public static long b(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | (((long) (bArr[i + 1] & 255)) << 8) | (((long) (bArr[i + 2] & 255)) << 16);
    }

    public static long c(byte[] bArr, int i) {
        return b(bArr, i) | (((long) (bArr[i + 3] & 255)) << 24);
    }

    public static void d() {
        if (ahgs.a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static void e(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static boolean f(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        ahgv.c(jArr2);
        byte[] bArrG = ahgv.g(jArr2);
        for (int i = 0; i < 32; i++) {
            if (bArrG[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] g(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) ahmx.b.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i;
        bArrDigest[31] = (byte) (i | 64);
        return bArrDigest;
    }

    public static byte[] h(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 << 1;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b2;
            int i6 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        aciz acizVar = new aciz(b);
        ahtv ahtvVar = new ahtv((byte[]) null);
        for (i = 1; i < 64; i += 2) {
            ahgo ahgoVar = new ahgo(c);
            m(ahgoVar, i / 2, bArr2[i]);
            ahtv.i(ahtvVar, acizVar);
            k(acizVar, ahtvVar, ahgoVar);
        }
        axlj axljVar = new axlj((byte[]) null);
        axlj.J(axljVar, acizVar);
        j(acizVar, axljVar);
        axlj.J(axljVar, acizVar);
        j(acizVar, axljVar);
        axlj.J(axljVar, acizVar);
        j(acizVar, axljVar);
        axlj.J(axljVar, acizVar);
        j(acizVar, axljVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            ahgo ahgoVar2 = new ahgo(c);
            m(ahgoVar2, i7 / 2, bArr2[i7]);
            ahtv.i(ahtvVar, acizVar);
            k(acizVar, ahtvVar, ahgoVar2);
        }
        axlj axljVar2 = new axlj(acizVar);
        long[] jArr = new long[10];
        ahgv.d(jArr, (long[]) axljVar2.c);
        long[] jArr2 = new long[10];
        ahgv.d(jArr2, (long[]) axljVar2.b);
        long[] jArr3 = new long[10];
        ahgv.d(jArr3, (long[]) axljVar2.a);
        long[] jArr4 = new long[10];
        ahgv.d(jArr4, jArr3);
        long[] jArr5 = new long[10];
        ahgv.e(jArr5, jArr2, jArr);
        ahgv.a(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        ahgv.a(jArr6, jArr, jArr2);
        ahgv.a(jArr6, jArr6, ahgs.a);
        ahgv.f(jArr6, jArr6, jArr4);
        ahgv.b(jArr6, jArr6);
        if (MessageDigest.isEqual(ahgv.g(jArr5), ahgv.g(jArr6))) {
            return axljVar2.c();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] i(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[SemanticState.Hidden];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (((bArr[i2 >> 3] & 255) >> (i2 & 7)) & 1);
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 > 15) {
                            int i7 = b3 - i5;
                            if (i7 < -15) {
                                break;
                            }
                            bArr2[i3] = (byte) i7;
                            while (i < 256) {
                                if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                }
                                bArr2[i] = 0;
                                i++;
                            }
                        } else {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void j(aciz acizVar, axlj axljVar) {
        long[] jArr = new long[10];
        axlj axljVar2 = (axlj) acizVar.a;
        Object obj = axljVar2.c;
        long[] jArr2 = (long[]) axljVar.c;
        long[] jArr3 = (long[]) obj;
        ahgv.d(jArr3, jArr2);
        Object obj2 = axljVar2.a;
        long[] jArr4 = (long[]) axljVar.b;
        long[] jArr5 = (long[]) obj2;
        ahgv.d(jArr5, jArr4);
        long[] jArr6 = (long[]) axljVar.a;
        long[] jArr7 = (long[]) acizVar.b;
        ahgv.d(jArr7, jArr6);
        ahgv.f(jArr7, jArr7, jArr7);
        long[] jArr8 = (long[]) axljVar2.b;
        ahgv.f(jArr8, jArr2, jArr4);
        ahgv.d(jArr, jArr8);
        ahgv.f(jArr8, jArr5, jArr3);
        ahgv.e(jArr5, jArr5, jArr3);
        ahgv.e(jArr3, jArr, jArr8);
        ahgv.e(jArr7, jArr7, jArr5);
    }

    public static void k(aciz acizVar, ahtv ahtvVar, ahgo ahgoVar) {
        long[] jArr = new long[10];
        axlj axljVar = (axlj) acizVar.a;
        Object obj = axljVar.c;
        axlj axljVar2 = (axlj) ahtvVar.a;
        Object obj2 = axljVar2.b;
        long[] jArr2 = (long[]) axljVar2.c;
        long[] jArr3 = (long[]) obj2;
        long[] jArr4 = (long[]) obj;
        ahgv.f(jArr4, jArr3, jArr2);
        long[] jArr5 = (long[]) axljVar.b;
        ahgv.e(jArr5, jArr3, jArr2);
        ahgv.a(jArr5, jArr5, ahgoVar.b);
        long[] jArr6 = (long[]) axljVar.a;
        ahgv.a(jArr6, jArr4, ahgoVar.a);
        long[] jArr7 = ahgoVar.c;
        long[] jArr8 = (long[]) ahtvVar.b;
        long[] jArr9 = (long[]) acizVar.b;
        ahgv.a(jArr9, jArr8, jArr7);
        ahgoVar.b(jArr4, (long[]) axljVar2.a);
        ahgv.f(jArr, jArr4, jArr4);
        ahgv.e(jArr4, jArr6, jArr5);
        ahgv.f(jArr5, jArr6, jArr5);
        ahgv.f(jArr6, jArr, jArr9);
        ahgv.e(jArr9, jArr, jArr9);
    }

    public static void l(aciz acizVar, ahtv ahtvVar, ahgo ahgoVar) {
        long[] jArr = new long[10];
        axlj axljVar = (axlj) acizVar.a;
        Object obj = axljVar.c;
        axlj axljVar2 = (axlj) ahtvVar.a;
        Object obj2 = axljVar2.b;
        long[] jArr2 = (long[]) axljVar2.c;
        long[] jArr3 = (long[]) obj2;
        long[] jArr4 = (long[]) obj;
        ahgv.f(jArr4, jArr3, jArr2);
        long[] jArr5 = (long[]) axljVar.b;
        ahgv.e(jArr5, jArr3, jArr2);
        ahgv.a(jArr5, jArr5, ahgoVar.a);
        long[] jArr6 = (long[]) axljVar.a;
        ahgv.a(jArr6, jArr4, ahgoVar.b);
        long[] jArr7 = ahgoVar.c;
        long[] jArr8 = (long[]) ahtvVar.b;
        long[] jArr9 = (long[]) acizVar.b;
        ahgv.a(jArr9, jArr8, jArr7);
        ahgoVar.b(jArr4, (long[]) axljVar2.a);
        ahgv.f(jArr, jArr4, jArr4);
        ahgv.e(jArr4, jArr6, jArr5);
        ahgv.f(jArr5, jArr6, jArr5);
        ahgv.e(jArr6, jArr, jArr9);
        ahgv.f(jArr9, jArr, jArr9);
    }

    private static void m(ahgo ahgoVar, int i, byte b2) {
        ahgo[][] ahgoVarArr = ahgs.d;
        int i2 = (b2 & 255) >> 7;
        int i3 = b2 - (((-i2) & b2) << 1);
        int i4 = (i3 ^ (-2)) & 255;
        int i5 = i4 & (i4 << 4);
        int i6 = i5 & (i5 << 2);
        ahgoVar.a(ahgoVarArr[i][0], (i6 & (i6 << 1)) >> 7);
        int i7 = (i3 ^ (-3)) & 255;
        int i8 = i7 & (i7 << 4);
        int i9 = i8 & (i8 << 2);
        ahgoVar.a(ahgoVarArr[i][1], (i9 & (i9 << 1)) >> 7);
        int i10 = (i3 ^ (-4)) & 255;
        int i11 = i10 & (i10 << 4);
        int i12 = i11 & (i11 << 2);
        ahgoVar.a(ahgoVarArr[i][2], (i12 & (i12 << 1)) >> 7);
        int i13 = (i3 ^ (-5)) & 255;
        int i14 = i13 & (i13 << 4);
        int i15 = i14 & (i14 << 2);
        ahgoVar.a(ahgoVarArr[i][3], (i15 & (i15 << 1)) >> 7);
        int i16 = (i3 ^ (-6)) & 255;
        int i17 = i16 & (i16 << 4);
        int i18 = i17 & (i17 << 2);
        ahgoVar.a(ahgoVarArr[i][4], (i18 & (i18 << 1)) >> 7);
        int i19 = (i3 ^ (-7)) & 255;
        int i20 = i19 & (i19 << 4);
        int i21 = i20 & (i20 << 2);
        ahgoVar.a(ahgoVarArr[i][5], (i21 & (i21 << 1)) >> 7);
        int i22 = (i3 ^ (-8)) & 255;
        int i23 = i22 & (i22 << 4);
        int i24 = i23 & (i23 << 2);
        ahgoVar.a(ahgoVarArr[i][6], (i24 & (i24 << 1)) >> 7);
        int i25 = (i3 ^ (-9)) & 255;
        int i26 = i25 & (i25 << 4);
        int i27 = i26 & (i26 << 2);
        ahgoVar.a(ahgoVarArr[i][7], (i27 & (i27 << 1)) >> 7);
        long[] jArr = ahgoVar.b;
        long[] jArr2 = ahgoVar.a;
        long[] jArr3 = ahgoVar.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr3, 10);
        e(jArrCopyOf3, jArrCopyOf3);
        ahgoVar.a(new ahgo(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i2);
    }
}
