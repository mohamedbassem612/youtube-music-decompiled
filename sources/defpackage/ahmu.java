package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmu implements ahge {
    private final /* synthetic */ int $cid;
    private final byte[] a;
    private final byte[] b;
    private final Object c;

    public ahmu(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.$cid = i;
        if (!afyd.q(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.a = (byte[]) bArr.clone();
        this.b = bArr2;
        this.c = bArr3;
        ahgq.d();
    }

    public static byte[] b(ahgb ahgbVar) {
        return ahgbVar.d.equals(ahga.c) ? new byte[]{0} : new byte[0];
    }

    public static byte[] c(ahgb ahgbVar) {
        ahnf ahnfVarA;
        Object obj = ahgbVar.d;
        Object obj2 = ahgbVar.e;
        if (obj == ahga.d) {
            if (obj2 != null) {
                throw new GeneralSecurityException("RAW output prefix type cannot have an id requirement");
            }
            ahnfVarA = ahhk.a;
        } else {
            if (obj2 == null) {
                throw new GeneralSecurityException("idRequirement must be non-null for " + ((ahga) obj).g + " type");
            }
            if (obj == ahga.b) {
                ahnfVarA = ahhk.b(((Integer) obj2).intValue());
            } else {
                if (obj != ahga.c && obj != ahga.e) {
                    throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(((ahga) obj).g));
                }
                ahnfVarA = ahhk.a(((Integer) obj2).intValue());
            }
        }
        return ahnfVarA.c();
    }

    private final void d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte b;
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        char c = 1;
        if (length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        byte[] bArr4 = this.a;
        byte[] bArr5 = ahgq.a;
        if (length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i = 31;
            while (i >= 0) {
                int i2 = bArrCopyOfRange[i] & 255;
                int i3 = ahgq.a[i] & 255;
                if (i2 != i3) {
                    if (i2 >= i3) {
                        break;
                    }
                    MessageDigest messageDigest = (MessageDigest) ahmx.b.a("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArr4);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jB = ahgq.b(bArrDigest, 0) & 2097151;
                    long jC = ahgq.c(bArrDigest, 2) >> 5;
                    long jB2 = ahgq.b(bArrDigest, 5) >> 2;
                    long jC2 = ahgq.c(bArrDigest, 7) >> 7;
                    long jC3 = ahgq.c(bArrDigest, 10) >> 4;
                    long jB3 = ahgq.b(bArrDigest, 13) >> c;
                    long jC4 = ahgq.c(bArrDigest, 15) >> 6;
                    long jB4 = ahgq.b(bArrDigest, 18) >> 3;
                    long jB5 = ahgq.b(bArrDigest, 21) & 2097151;
                    long jC5 = ahgq.c(bArrDigest, 23) >> 5;
                    long jB6 = ahgq.b(bArrDigest, 26) >> 2;
                    long jC6 = ahgq.c(bArrDigest, 28) >> 7;
                    long jC7 = ahgq.c(bArrDigest, 31) >> 4;
                    long jB7 = ahgq.b(bArrDigest, 34) >> c;
                    long jC8 = ahgq.c(bArrDigest, 36) >> 6;
                    long jB8 = ahgq.b(bArrDigest, 39) >> 3;
                    long jB9 = ahgq.b(bArrDigest, 42) & 2097151;
                    long jC9 = ahgq.c(bArrDigest, 44) >> 5;
                    long jB10 = ahgq.b(bArrDigest, 47) >> 2;
                    long jC10 = (ahgq.c(bArrDigest, 49) >> 7) & 2097151;
                    long j = jB10 & 2097151;
                    long jC11 = (ahgq.c(bArrDigest, 52) >> 4) & 2097151;
                    long jB11 = (ahgq.b(bArrDigest, 55) >> c) & 2097151;
                    long jC12 = (ahgq.c(bArrDigest, 57) >> 6) & 2097151;
                    long jC13 = ahgq.c(bArrDigest, 60) >> 3;
                    long j2 = (jC4 & 2097151) + (j * 666643);
                    long j3 = (j2 + 1048576) >> 21;
                    long j4 = j3 << 21;
                    long j5 = jB5 + (jC11 * 666643) + (jC10 * 470296) + (j * 654183);
                    long j6 = (j5 + 1048576) >> 21;
                    long j7 = j6 << 21;
                    long j8 = (((((jB6 & 2097151) + (jC12 * 666643)) + (jB11 * 470296)) + (jC11 * 654183)) - (jC10 * 997805)) + (j * 136657);
                    long j9 = (j8 + 1048576) >> 21;
                    long j10 = j9 << 21;
                    long j11 = (((((jC7 & 2097151) + (jC13 * 470296)) + (jC12 * 654183)) - (jB11 * 997805)) + (jC11 * 136657)) - (jC10 * 683901);
                    long j12 = (j11 + 1048576) >> 21;
                    long j13 = (((jC8 & 2097151) - (jC13 * 997805)) + (jC12 * 136657)) - (jB11 * 683901);
                    long j14 = (j13 + 1048576) >> 21;
                    long j15 = jB9 - (jC13 * 683901);
                    long j16 = (j15 + 1048576) >> 21;
                    long j17 = jB4 + (jC10 * 666643) + (j * 470296) + j3;
                    long j18 = (j17 + 1048576) >> 21;
                    long j19 = j18 << 21;
                    long j20 = (((((jC5 & 2097151) + (jB11 * 666643)) + (jC11 * 470296)) + (jC10 * 654183)) - (j * 997805)) + j6;
                    long j21 = (j20 + 1048576) >> 21;
                    long j22 = j21 << 21;
                    long j23 = (((((((jC6 & 2097151) + (jC13 * 666643)) + (jC12 * 470296)) + (jB11 * 654183)) - (jC11 * 997805)) + (jC10 * 136657)) - (j * 683901)) + j9;
                    long j24 = (j23 + 1048576) >> 21;
                    long j25 = j24 << 21;
                    long j26 = (((((jB7 & 2097151) + (jC13 * 654183)) - (jC12 * 997805)) + (jB11 * 136657)) - (jC11 * 683901)) + j12;
                    long j27 = (j26 + 1048576) >> 21;
                    long j28 = ((jB8 + (jC13 * 136657)) - (jC12 * 683901)) + j14;
                    long j29 = (j28 + 1048576) >> 21;
                    long j30 = (j11 - (j12 << 21)) + j24;
                    long j31 = jB + (j30 * 666643);
                    long j32 = (j31 + 1048576) >> 21;
                    long j33 = j32 << 21;
                    long j34 = (j13 - (j14 << 21)) + j27;
                    long j35 = j26 - (j27 << 21);
                    long j36 = (jB2 & 2097151) + (j34 * 666643) + (j35 * 470296) + (j30 * 654183);
                    long j37 = (j36 + 1048576) >> 21;
                    long j38 = j37 << 21;
                    long j39 = (j15 - (j16 << 21)) + j29;
                    long j40 = j28 - (j29 << 21);
                    long j41 = (((((jC3 & 2097151) + (j39 * 666643)) + (j40 * 470296)) + (j34 * 654183)) - (j35 * 997805)) + (j30 * 136657);
                    long j42 = (j41 + 1048576) >> 21;
                    long j43 = j42 << 21;
                    long j44 = (jC9 & 2097151) + j16;
                    long j45 = (((((j2 - j4) + (j44 * 470296)) + (j39 * 654183)) - (j40 * 997805)) + (j34 * 136657)) - (j35 * 683901);
                    long j46 = (j45 + 1048576) >> 21;
                    long j47 = j46 << 21;
                    long j48 = ((((j5 - j7) + j18) - (j44 * 997805)) + (j39 * 136657)) - (j40 * 683901);
                    long j49 = (j48 + 1048576) >> 21;
                    long j50 = j49 << 21;
                    long j51 = ((j8 - j10) + j21) - (j44 * 683901);
                    long j52 = (j51 + 1048576) >> 21;
                    long j53 = (jC & 2097151) + (j35 * 666643) + (j30 * 470296) + j32;
                    long j54 = (j53 + 1048576) >> 21;
                    long j55 = (((((jC2 & 2097151) + (j40 * 666643)) + (j34 * 470296)) + (j35 * 654183)) - (j30 * 997805)) + j37;
                    long j56 = (j55 + 1048576) >> 21;
                    long j57 = (((((((jB3 & 2097151) + (j44 * 666643)) + (j39 * 470296)) + (j40 * 654183)) - (j34 * 997805)) + (j35 * 136657)) - (j30 * 683901)) + j42;
                    long j58 = (j57 + 1048576) >> 21;
                    long j59 = (((((j17 - j19) + (j44 * 654183)) - (j39 * 997805)) + (j40 * 136657)) - (j34 * 683901)) + j46;
                    long j60 = (j59 + 1048576) >> 21;
                    long j61 = (((j20 - j22) + (j44 * 136657)) - (j39 * 683901)) + j49;
                    long j62 = (j61 + 1048576) >> 21;
                    long j63 = (j23 - j25) + j52;
                    long j64 = (j63 + 1048576) >> 21;
                    long j65 = (j31 - j33) + (j64 * 666643);
                    long j66 = j65 >> 21;
                    long j67 = j66 << 21;
                    long j68 = (j53 - (j54 << 21)) + (j64 * 470296) + j66;
                    long j69 = j68 >> 21;
                    long j70 = j69 << 21;
                    long j71 = (j36 - j38) + j54 + (j64 * 654183) + j69;
                    long j72 = j71 >> 21;
                    long j73 = j72 << 21;
                    long j74 = ((j55 - (j56 << 21)) - (j64 * 997805)) + j72;
                    long j75 = j74 >> 21;
                    long j76 = j75 << 21;
                    long j77 = (j41 - j43) + j56 + (j64 * 136657) + j75;
                    long j78 = j77 >> 21;
                    long j79 = j78 << 21;
                    long j80 = ((j57 - (j58 << 21)) - (j64 * 683901)) + j78;
                    long j81 = j80 >> 21;
                    long j82 = j81 << 21;
                    long j83 = (j45 - j47) + j58 + j81;
                    long j84 = j83 >> 21;
                    long j85 = j84 << 21;
                    long j86 = (j59 - (j60 << 21)) + j84;
                    long j87 = j86 >> 21;
                    long j88 = j87 << 21;
                    long j89 = (j48 - j50) + j60 + j87;
                    long j90 = j89 >> 21;
                    long j91 = j90 << 21;
                    long j92 = (j61 - (j62 << 21)) + j90;
                    long j93 = j92 >> 21;
                    long j94 = j93 << 21;
                    long j95 = (j51 - (j52 << 21)) + j62 + j93;
                    long j96 = j95 >> 21;
                    long j97 = j96 << 21;
                    long j98 = (j63 - (j64 << 21)) + j96;
                    long j99 = j98 >> 21;
                    long j100 = j99 << 21;
                    long j101 = (j65 - j67) + (666643 * j99);
                    long j102 = j101 >> 21;
                    long j103 = j102 << 21;
                    long j104 = (j68 - j70) + (470296 * j99) + j102;
                    long j105 = j104 >> 21;
                    long j106 = j105 << 21;
                    long j107 = (j71 - j73) + (654183 * j99) + j105;
                    long j108 = j107 >> 21;
                    long j109 = j108 << 21;
                    long j110 = ((j74 - j76) - (997805 * j99)) + j108;
                    long j111 = j110 >> 21;
                    long j112 = j111 << 21;
                    long j113 = (j77 - j79) + (136657 * j99) + j111;
                    long j114 = j113 >> 21;
                    long j115 = ((j80 - j82) - (j99 * 683901)) + j114;
                    long j116 = j115 >> 21;
                    long j117 = j116 << 21;
                    long j118 = (j83 - j85) + j116;
                    long j119 = j118 >> 21;
                    long j120 = j119 << 21;
                    long j121 = (j86 - j88) + j119;
                    long j122 = j121 >> 21;
                    long j123 = j122 << 21;
                    long j124 = (j89 - j91) + j122;
                    long j125 = j124 >> 21;
                    long j126 = j125 << 21;
                    long j127 = (j92 - j94) + j125;
                    long j128 = j127 >> 21;
                    long j129 = j128 << 21;
                    long j130 = (j95 - j97) + j128;
                    long j131 = j130 >> 21;
                    long j132 = j101 - j103;
                    bArrDigest[0] = (byte) j132;
                    long j133 = j121 - j123;
                    long j134 = j118 - j120;
                    long j135 = j115 - j117;
                    long j136 = j113 - (j114 << 21);
                    long j137 = j110 - j112;
                    long j138 = j107 - j109;
                    long j139 = j104 - j106;
                    bArrDigest[c] = (byte) (j132 >> 8);
                    bArrDigest[2] = (byte) ((j132 >> 16) | (j139 << 5));
                    bArrDigest[3] = (byte) (j139 >> 3);
                    bArrDigest[4] = (byte) (j139 >> 11);
                    bArrDigest[5] = (byte) ((j139 >> 19) | (j138 << 2));
                    bArrDigest[6] = (byte) (j138 >> 6);
                    bArrDigest[7] = (byte) ((j138 >> 14) | (j137 << 7));
                    bArrDigest[8] = (byte) (j137 >> c);
                    bArrDigest[9] = (byte) (j137 >> 9);
                    bArrDigest[10] = (byte) ((j137 >> 17) | (j136 << 4));
                    bArrDigest[11] = (byte) (j136 >> 4);
                    bArrDigest[12] = (byte) (j136 >> 12);
                    bArrDigest[13] = (byte) ((j136 >> 20) | (j135 << c));
                    bArrDigest[14] = (byte) (j135 >> 7);
                    bArrDigest[15] = (byte) ((j135 >> 15) | (j134 << 6));
                    bArrDigest[16] = (byte) (j134 >> 2);
                    bArrDigest[17] = (byte) (j134 >> 10);
                    bArrDigest[18] = (byte) ((j134 >> 18) | (j133 << 3));
                    long j140 = j130 - (j131 << 21);
                    long j141 = (j98 - j100) + j131;
                    long j142 = j127 - j129;
                    long j143 = j124 - j126;
                    bArrDigest[19] = (byte) (j133 >> 5);
                    bArrDigest[20] = (byte) (j133 >> 13);
                    bArrDigest[21] = (byte) j143;
                    bArrDigest[22] = (byte) (j143 >> 8);
                    bArrDigest[23] = (byte) ((j143 >> 16) | (j142 << 5));
                    bArrDigest[24] = (byte) (j142 >> 3);
                    bArrDigest[25] = (byte) (j142 >> 11);
                    bArrDigest[26] = (byte) ((j142 >> 19) | (j140 << 2));
                    bArrDigest[27] = (byte) (j140 >> 6);
                    bArrDigest[28] = (byte) ((j140 >> 14) | (j141 << 7));
                    bArrDigest[29] = (byte) (j141 >> c);
                    bArrDigest[30] = (byte) (j141 >> 9);
                    bArrDigest[31] = (byte) (j141 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrH = ahgv.h(bArr4);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    ahgv.d(jArr4, jArrH);
                    ahgv.a(jArr5, jArr4, ahgs.a);
                    ahgv.e(jArr4, jArr4, jArr2);
                    ahgv.f(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    ahgv.d(jArr8, jArr5);
                    ahgv.a(jArr8, jArr8, jArr5);
                    ahgv.d(jArr, jArr8);
                    ahgv.a(jArr, jArr, jArr5);
                    ahgv.a(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    ahgv.d(jArr9, jArr);
                    ahgv.d(jArr10, jArr9);
                    ahgv.d(jArr10, jArr10);
                    ahgv.a(jArr10, jArr, jArr10);
                    ahgv.a(jArr9, jArr9, jArr10);
                    ahgv.d(jArr9, jArr9);
                    ahgv.a(jArr9, jArr10, jArr9);
                    ahgv.d(jArr10, jArr9);
                    for (int i4 = 1; i4 < 5; i4++) {
                        ahgv.d(jArr10, jArr10);
                    }
                    ahgv.a(jArr9, jArr10, jArr9);
                    ahgv.d(jArr10, jArr9);
                    for (int i5 = 1; i5 < 10; i5++) {
                        ahgv.d(jArr10, jArr10);
                    }
                    ahgv.a(jArr10, jArr10, jArr9);
                    ahgv.d(jArr11, jArr10);
                    for (int i6 = 1; i6 < 20; i6++) {
                        ahgv.d(jArr11, jArr11);
                    }
                    ahgv.a(jArr10, jArr11, jArr10);
                    ahgv.d(jArr10, jArr10);
                    for (int i7 = 1; i7 < 10; i7++) {
                        ahgv.d(jArr10, jArr10);
                    }
                    ahgv.a(jArr9, jArr10, jArr9);
                    ahgv.d(jArr10, jArr9);
                    for (int i8 = 1; i8 < 50; i8++) {
                        ahgv.d(jArr10, jArr10);
                    }
                    ahgv.a(jArr10, jArr10, jArr9);
                    ahgv.d(jArr11, jArr10);
                    for (int i9 = 1; i9 < 100; i9++) {
                        ahgv.d(jArr11, jArr11);
                    }
                    ahgv.a(jArr10, jArr11, jArr10);
                    ahgv.d(jArr10, jArr10);
                    for (int i10 = 1; i10 < 50; i10++) {
                        ahgv.d(jArr10, jArr10);
                    }
                    ahgv.a(jArr9, jArr10, jArr9);
                    ahgv.d(jArr9, jArr9);
                    ahgv.d(jArr9, jArr9);
                    ahgv.a(jArr, jArr9, jArr);
                    ahgv.a(jArr, jArr, jArr8);
                    ahgv.a(jArr, jArr, jArr4);
                    ahgv.d(jArr6, jArr);
                    ahgv.a(jArr6, jArr6, jArr5);
                    ahgv.e(jArr7, jArr6, jArr4);
                    if (ahgq.f(jArr7)) {
                        ahgv.f(jArr7, jArr6, jArr4);
                        if (ahgq.f(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        ahgv.a(jArr, jArr, ahgs.c);
                    }
                    if (ahgq.f(jArr)) {
                        b = 255;
                    } else {
                        b = 255;
                        if (((bArr4[31] & 255) >> 7) != 0) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                        }
                    }
                    if (ahgq.a(jArr) == ((bArr4[31] & b) >> 7)) {
                        ahgq.e(jArr, jArr);
                    }
                    ahgv.a(jArr3, jArr, jArrH);
                    ahtv ahtvVar = new ahtv(new axlj(jArr, jArrH, jArr2), jArr3);
                    ahgp[] ahgpVarArr = new ahgp[8];
                    ahgpVarArr[0] = new ahgp(ahtvVar);
                    aciz acizVar = new aciz(new axlj((byte[]) null), new long[10], (char[]) null);
                    ahgq.j(acizVar, (axlj) ahtvVar.a);
                    ahtv ahtvVar2 = new ahtv(acizVar);
                    for (int i11 = 1; i11 < 8; i11++) {
                        ahgq.k(acizVar, ahtvVar2, ahgpVarArr[i11 - 1]);
                        ahgpVarArr[i11] = new ahgp(new ahtv(acizVar));
                    }
                    byte[] bArrI = ahgq.i(bArrDigest);
                    byte[] bArrI2 = ahgq.i(bArrCopyOfRange);
                    aciz acizVar2 = new aciz(ahgq.b);
                    ahtv ahtvVar3 = new ahtv((byte[]) null);
                    int i12 = b;
                    while (i12 >= 0 && bArrI[i12] == 0 && bArrI2[i12] == 0) {
                        i12--;
                    }
                    while (i12 >= 0) {
                        ahgq.j(acizVar2, new axlj(acizVar2));
                        byte b2 = bArrI[i12];
                        if (b2 > 0) {
                            ahtv.i(ahtvVar3, acizVar2);
                            ahgq.k(acizVar2, ahtvVar3, ahgpVarArr[bArrI[i12] / 2]);
                        } else if (b2 < 0) {
                            ahtv.i(ahtvVar3, acizVar2);
                            ahgq.l(acizVar2, ahtvVar3, ahgpVarArr[(-bArrI[i12]) / 2]);
                        }
                        byte b3 = bArrI2[i12];
                        if (b3 > 0) {
                            ahtv.i(ahtvVar3, acizVar2);
                            ahgq.k(acizVar2, ahtvVar3, ahgs.e[bArrI2[i12] / 2]);
                        } else if (b3 < 0) {
                            ahtv.i(ahtvVar3, acizVar2);
                            ahgq.l(acizVar2, ahtvVar3, ahgs.e[(-bArrI2[i12]) / 2]);
                        }
                        i12--;
                    }
                    byte[] bArrC = new axlj(acizVar2).c();
                    for (int i13 = 0; i13 < 32; i13++) {
                        if (bArrC[i13] != bArr[i13]) {
                            break;
                        }
                    }
                    return;
                }
                i--;
                bArr3 = bArr;
                c = 1;
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [ahge, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [ahge, java.lang.Object] */
    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.$cid != 0) {
            byte[] bArr3 = this.a;
            int length = bArr3.length;
            if (length == 0 && this.b.length == 0) {
                this.c.a(bArr, bArr2);
                return;
            } else {
                if (!ahie.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                byte[] bArr4 = this.b;
                if (bArr4.length != 0) {
                    bArr2 = aedi.A(bArr2, bArr4);
                }
                this.c.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                return;
            }
        }
        byte[] bArr5 = this.b;
        int length2 = bArr5.length;
        if (length2 == 0 && ((byte[]) this.c).length == 0) {
            d(bArr, bArr2);
        } else {
            if (!ahie.c(bArr5, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr6 = (byte[]) this.c;
            if (bArr6.length != 0) {
                bArr2 = aedi.A(bArr2, bArr6);
            }
            d(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
        }
    }

    public ahmu(ahge ahgeVar, byte[] bArr, byte[] bArr2, int i) {
        this.$cid = i;
        this.c = ahgeVar;
        this.a = bArr;
        this.b = bArr2;
    }
}
