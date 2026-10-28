package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agxe extends agxc {
    public static final agxj a = new agxe();

    private static void g(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jB = j + agxr.b(bArr, i);
        long jB2 = agxr.b(bArr, i + 8);
        long jB3 = agxr.b(bArr, i + 16);
        long jB4 = agxr.b(bArr, i + 24);
        long j3 = jB2 + jB + jB3;
        long jRotateRight = Long.rotateRight(j2 + jB + jB4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jB4;
        jArr[1] = jRotateRight + jB;
    }

    @Override // defpackage.agwz
    public final agxi e(byte[] bArr, int i) {
        int i2;
        char c;
        int i3;
        long j;
        long j2;
        char c2;
        long jRotateRight;
        long[] jArr;
        long j3;
        byte[] bArr2 = bArr;
        char c3 = 0;
        ahno.N(0, i, bArr2.length);
        long j4 = -5435081209227447693L;
        long j5 = -7286425919675154353L;
        char c4 = 1;
        if (i > 32) {
            char c5 = '@';
            if (i <= 64) {
                long jB = agxr.b(bArr2, 0) * (-7286425919675154353L);
                long jB2 = agxr.b(bArr2, 8);
                long j6 = (((long) i) << 1) - 7286425919675154353L;
                long jB3 = agxr.b(bArr2, i - 8) * j6;
                long jB4 = agxr.b(bArr2, i - 16) * (-7286425919675154353L);
                long jRotateRight2 = Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30);
                long jRotateRight3 = Long.rotateRight(jB2 - 7286425919675154353L, 18) + jB;
                long jB5 = agxr.b(bArr2, 16) * j6;
                long jB6 = agxr.b(bArr2, 24);
                long j7 = jRotateRight2 + jB4;
                long jB7 = j7 + agxr.b(bArr2, i - 32);
                long j8 = jRotateRight3 + jB3;
                long j9 = (j7 ^ j8) * j6;
                long j10 = (j8 ^ (j9 ^ (j9 >>> 47))) * j6;
                long jB8 = ((j10 ^ (j10 >>> 47)) * j6) + agxr.b(bArr2, i - 24);
                long j11 = jB7 * j6;
                long jRotateRight4 = Long.rotateRight(jB5 + jB6, 43) + Long.rotateRight(j11, 30);
                long jRotateRight5 = jB5 + Long.rotateRight(jB6 + jB, 18) + j11;
                long j12 = ((jRotateRight4 + (jB8 * j6)) ^ jRotateRight5) * j6;
                long j13 = (jRotateRight5 ^ (j12 ^ (j12 >>> 47))) * j6;
                j5 = (j13 ^ (j13 >>> 47)) * j6;
            } else {
                long[] jArr2 = new long[2];
                long[] jArr3 = new long[2];
                long jB9 = agxr.b(bArr2, 0) + 95310865018149119L;
                long j14 = 1390051526045402406L;
                long j15 = 2480279821605975764L;
                int i4 = 0;
                while (true) {
                    i2 = i - 1;
                    c = c3;
                    i3 = (i2 >> 6) << 6;
                    j = j4;
                    long jRotateRight6 = Long.rotateRight(jB9 + j15 + jArr2[c] + agxr.b(bArr2, i4 + 8), 37) * j;
                    long jB10 = j15 + jArr2[c4] + agxr.b(bArr2, i4 + 48);
                    char c6 = c5;
                    long jRotateRight7 = Long.rotateRight(jB10, 42) * j;
                    j2 = jRotateRight6 ^ jArr3[c4];
                    c2 = c4;
                    long jB11 = jArr2[c] + agxr.b(bArr2, i4 + 40);
                    jRotateRight = Long.rotateRight(j14 + jArr3[c], 33) * j;
                    int i5 = i4;
                    g(bArr2, i5, jArr2[c2] * j, j2 + jArr3[c], jArr2);
                    jArr = jArr2;
                    j3 = jRotateRight7 + jB11;
                    g(bArr2, i5 + 32, jRotateRight + jArr3[c2], agxr.b(bArr2, i5 + 16) + j3, jArr3);
                    i4 = i5 + 64;
                    if (i4 == i3) {
                        break;
                    }
                    c3 = c;
                    bArr2 = bArr;
                    c5 = c6;
                    c4 = c2;
                    j14 = j2;
                    jB9 = jRotateRight;
                    jArr2 = jArr;
                    j15 = j3;
                    j4 = j;
                }
                int i6 = i2 & 63;
                int i7 = i3 + i6;
                long j16 = ((j2 & 255) << c2) + j;
                long j17 = jArr3[c] + ((long) i6);
                long j18 = jArr[c] + j17;
                jArr[c] = j18;
                jArr3[c] = j17 + j18;
                long jRotateRight8 = Long.rotateRight(jRotateRight + j3 + j18 + agxr.b(bArr2, i7 - 55), 37) * j16;
                long jRotateRight9 = Long.rotateRight(j3 + jArr[c2] + agxr.b(bArr2, i7 - 15), 42) * j16;
                long j19 = jArr3[c2] * 9;
                long jB12 = (jArr[c] * 9) + agxr.b(bArr2, i7 - 23);
                long jRotateRight10 = Long.rotateRight(j2 + jArr3[c], 33) * j16;
                long j20 = jRotateRight8 ^ j19;
                g(bArr2, i7 - 63, jArr[c2] * j16, j20 + jArr3[c], jArr);
                long j21 = jRotateRight9 + jB12;
                g(bArr2, i7 - 31, jRotateRight10 + jArr3[c2], agxr.b(bArr2, i7 - 47) + j21, jArr3);
                long j22 = jArr[c];
                long j23 = jArr3[c];
                long j24 = (j22 ^ j23) * j16;
                long j25 = jArr[c2];
                long j26 = jArr3[c2];
                long j27 = (j25 ^ j26) * j16;
                long j28 = (j26 ^ (j27 ^ (j27 >>> 47))) * j16;
                long j29 = (j23 ^ (j24 ^ (j24 >>> 47))) * j16;
                long j30 = ((j28 ^ (j28 >>> 47)) * j16) + jRotateRight10;
                long j31 = (((((j29 ^ (j29 >>> 47)) * j16) + ((j21 ^ (j21 >>> 47)) * (-4348849565147123417L))) + j20) ^ j30) * j16;
                long j32 = (j30 ^ (j31 ^ (j31 >>> 47))) * j16;
                j5 = (j32 ^ (j32 >>> 47)) * j16;
            }
        } else if (i > 16) {
            long jB13 = agxr.b(bArr2, 0) * (-5435081209227447693L);
            long jB14 = agxr.b(bArr2, 8);
            long j33 = (((long) i) << 1) - 7286425919675154353L;
            long jB15 = agxr.b(bArr2, i - 8) * j33;
            long jB16 = agxr.b(bArr2, i - 16) * (-7286425919675154353L);
            long jRotateRight11 = Long.rotateRight(jB13 + jB14, 43) + Long.rotateRight(jB15, 30);
            long jRotateRight12 = jB13 + Long.rotateRight(jB14 - 7286425919675154353L, 18) + jB15;
            long j34 = ((jRotateRight11 + jB16) ^ jRotateRight12) * j33;
            long j35 = (jRotateRight12 ^ (j34 ^ (j34 >>> 47))) * j33;
            j5 = j33 * (j35 ^ (j35 >>> 47));
        } else if (i >= 8) {
            long j36 = (((long) i) << 1) - 7286425919675154353L;
            long jB17 = agxr.b(bArr2, 0) - 7286425919675154353L;
            long jB18 = agxr.b(bArr2, i - 8);
            long jRotateRight13 = Long.rotateRight(jB18, 37) * j36;
            long jRotateRight14 = (Long.rotateRight(jB17, 25) + jB18) * j36;
            long j37 = ((jRotateRight13 + jB17) ^ jRotateRight14) * j36;
            long j38 = (jRotateRight14 ^ (j37 ^ (j37 >>> 47))) * j36;
            j5 = (j38 ^ (j38 >>> 47)) * j36;
        } else if (i >= 4) {
            long j39 = ((long) (i << 1)) - 7286425919675154353L;
            long jA = agxr.a(bArr2, 0);
            long jA2 = ((long) agxr.a(bArr2, i - 4)) & 4294967295L;
            long j40 = ((((long) i) + ((jA & 4294967295L) << 3)) ^ jA2) * j39;
            long j41 = (jA2 ^ (j40 ^ (j40 >>> 47))) * j39;
            j5 = (j41 ^ (j41 >>> 47)) * j39;
        } else if (i > 0) {
            long j42 = (((long) ((bArr2[0] & 255) + ((bArr2[i >> 1] & 255) << 8))) * (-7286425919675154353L)) ^ (((long) (((bArr2[i - 1] & 255) << 2) + i)) * (-4348849565147123417L));
            j5 = (-7286425919675154353L) * (j42 ^ (j42 >>> 47));
        }
        int i8 = agxi.b;
        return new agxh(j5);
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
