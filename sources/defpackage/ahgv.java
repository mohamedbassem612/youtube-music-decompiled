package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahgv {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] c = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] d = {67108863, 33554431};
    private static final int[] e = {26, 25};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr2[0];
        long j2 = jArr3[0];
        long j3 = jArr3[1];
        long j4 = jArr2[1];
        long j5 = jArr3[2];
        long j6 = jArr2[2];
        long j7 = jArr3[3];
        long j8 = jArr2[3];
        long j9 = jArr3[4];
        long j10 = jArr2[4];
        long j11 = jArr3[5];
        long j12 = jArr2[5];
        long j13 = jArr3[6];
        long j14 = jArr2[6];
        long j15 = jArr3[7];
        long j16 = jArr2[7];
        long j17 = jArr3[8];
        long j18 = jArr2[8];
        long j19 = jArr3[9];
        long j20 = jArr2[9];
        b(new long[]{j * j2, (j * j3) + (j4 * j2), ((j4 << 1) * j3) + (j * j5) + (j6 * j2), (j4 * j5) + (j6 * j3) + (j * j7) + (j8 * j2), (j6 * j5) + (((j4 * j7) + (j8 * j3)) << 1) + (j * j9) + (j10 * j2), (j6 * j7) + (j8 * j5) + (j4 * j9) + (j10 * j3) + (j * j11) + (j12 * j2), ((((j8 * j7) + (j4 * j11)) + (j12 * j3)) << 1) + (j6 * j9) + (j10 * j5) + (j * j13) + (j14 * j2), (j8 * j9) + (j10 * j7) + (j6 * j11) + (j12 * j5) + (j4 * j13) + (j14 * j3) + (j * j15) + (j16 * j2), (j10 * j9) + (((((j8 * j11) + (j12 * j7)) + (j4 * j15)) + (j16 * j3)) << 1) + (j6 * j13) + (j14 * j5) + (j * j17) + (j18 * j2), (j10 * j11) + (j12 * j9) + (j8 * j13) + (j14 * j7) + (j6 * j15) + (j16 * j5) + (j4 * j17) + (j18 * j3) + (j * j19) + (j2 * j20), ((((((j12 * j11) + (j8 * j15)) + (j16 * j7)) + (j4 * j19)) + (j3 * j20)) << 1) + (j10 * j13) + (j14 * j9) + (j6 * j17) + (j18 * j5), (j12 * j13) + (j14 * j11) + (j10 * j15) + (j16 * j9) + (j8 * j17) + (j18 * j7) + (j6 * j19) + (j5 * j20), (j14 * j13) + (((((j12 * j15) + (j16 * j11)) + (j8 * j19)) + (j7 * j20)) << 1) + (j10 * j17) + (j18 * j9), (j14 * j15) + (j16 * j13) + (j12 * j17) + (j18 * j11) + (j10 * j19) + (j9 * j20), ((((j16 * j15) + (j12 * j19)) + (j11 * j20)) << 1) + (j14 * j17) + (j18 * j13), (j16 * j17) + (j18 * j15) + (j14 * j19) + (j13 * j20), (j18 * j17) + (((j16 * j19) + (j15 * j20)) << 1), (j18 * j19) + (j17 * j20), (j20 << 1) * j19}, jArr);
    }

    static void b(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
        c(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void c(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void d(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[1];
        long j3 = jArr2[2];
        long j4 = jArr2[3];
        long j5 = jArr2[4];
        long j6 = jArr2[5];
        long j7 = jArr2[6];
        long j8 = jArr2[7];
        long j9 = jArr2[8];
        long j10 = jArr2[9];
        b(new long[]{j * j, (j << 1) * j2, ((j2 * j2) + (j * j3)) << 1, ((j2 * j3) + (j * j4)) << 1, (j3 * j3) + ((j2 << 2) * j4) + ((j << 1) * j5), (((j3 * j4) + (j2 * j5)) + (j * j6)) << 1, ((((j4 * j4) + (j3 * j5)) + (j * j7)) + ((j2 << 1) * j6)) << 1, ((((j4 * j5) + (j3 * j6)) + (j2 * j7)) + (j * j8)) << 1, (j5 * j5) + ((((j3 * j7) + (j * j9)) + (((j2 * j8) + (j4 * j6)) << 1)) << 1), (((((j5 * j6) + (j4 * j7)) + (j3 * j8)) + (j2 * j9)) + (j * j10)) << 1, ((((j6 * j6) + (j5 * j7)) + (j3 * j9)) + (((j4 * j8) + (j2 * j10)) << 1)) << 1, ((((j6 * j7) + (j5 * j8)) + (j4 * j9)) + (j3 * j10)) << 1, (j7 * j7) + (((j5 * j9) + (((j6 * j8) + (j4 * j10)) << 1)) << 1), (((j7 * j8) + (j6 * j9)) + (j5 * j10)) << 1, (((j8 * j8) + (j7 * j9)) + ((j6 << 1) * j10)) << 1, ((j8 * j9) + (j7 * j10)) << 1, (j9 * j9) + ((j8 << 2) * j10), (j9 << 1) * j10, (j10 << 1) * j10}, jArr);
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static byte[] g(long[] jArr) {
        int i;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j = jArrCopyOf[i4];
                int i5 = e[i4 & 1];
                int i6 = -((int) (((j >> 31) & j) >> i5));
                jArrCopyOf[i4] = j + ((long) (i6 << i5));
                i4++;
                jArrCopyOf[i4] = jArrCopyOf[i4] - ((long) i6);
            }
            long j2 = jArrCopyOf[9];
            int i7 = -((int) (((j2 >> 31) & j2) >> 25));
            jArrCopyOf[9] = j2 + ((long) (i7 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i7) * 19);
            i3++;
        }
        long j3 = jArrCopyOf[0];
        int i8 = -((int) (((j3 >> 31) & j3) >> 26));
        jArrCopyOf[0] = j3 + ((long) (i8 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i8);
        int i9 = 0;
        while (i9 < 2) {
            int i10 = i2;
            while (i10 < 9) {
                long j4 = jArrCopyOf[i10];
                int i11 = i10 & 1;
                int i12 = i2;
                long j5 = j4 >> e[i11];
                jArrCopyOf[i10] = j4 & ((long) d[i11]);
                i10++;
                jArrCopyOf[i10] = jArrCopyOf[i10] + ((long) ((int) j5));
                i2 = i12;
                i9 = i9;
            }
            i9++;
        }
        int i13 = i2;
        long j6 = jArrCopyOf[9];
        jArrCopyOf[9] = j6 & 33554431;
        long j7 = jArrCopyOf[i13] + (((long) ((int) (j6 >> 25))) * 19);
        jArrCopyOf[i13] = j7;
        int i14 = ~((((int) j7) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) jArrCopyOf[i15]) ^ d[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 << 1)) >> 31;
        }
        jArrCopyOf[i13] = jArrCopyOf[i13] - ((long) (67108845 & i14));
        long j8 = 33554431 & i14;
        jArrCopyOf[1] = jArrCopyOf[1] - j8;
        for (i = 2; i < 10; i += 2) {
            jArrCopyOf[i] = jArrCopyOf[i] - ((long) (67108863 & i14));
            int i21 = i + 1;
            jArrCopyOf[i21] = jArrCopyOf[i21] - j8;
        }
        for (int i22 = i13; i22 < 10; i22++) {
            jArrCopyOf[i22] = jArrCopyOf[i22] << c[i22];
        }
        byte[] bArr = new byte[32];
        for (int i23 = i13; i23 < 10; i23++) {
            int i24 = b[i23];
            long j9 = bArr[i24];
            long j10 = jArrCopyOf[i23];
            bArr[i24] = (byte) (j9 | (j10 & 255));
            int i25 = i24 + 1;
            bArr[i25] = (byte) (((long) bArr[i25]) | ((j10 >> 8) & 255));
            int i26 = i24 + 2;
            bArr[i26] = (byte) (((long) bArr[i26]) | ((j10 >> 16) & 255));
            int i27 = i24 + 3;
            bArr[i27] = (byte) (((long) bArr[i27]) | ((j10 >> 24) & 255));
        }
        return bArr;
    }

    public static long[] h(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = b[i];
            int i3 = bArr[i2] & 255;
            int i4 = bArr[i2 + 1] & 255;
            long j = ((long) i3) | (((long) i4) << 8);
            jArr[i] = (((j | (((long) (bArr[i2 + 2] & 255)) << 16)) | (((long) (bArr[i2 + 3] & 255)) << 24)) >> c[i]) & ((long) d[i & 1]);
        }
        return jArr;
    }
}
