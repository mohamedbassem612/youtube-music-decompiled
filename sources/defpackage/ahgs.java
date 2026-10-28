package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahgs {
    public static final long[] a;
    static final long[] b;
    public static final long[] c;
    static final ahgo[][] d;
    public static final ahgo[] e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        i = bigIntegerModPow;
        ahgr ahgrVar = new ahgr();
        ahgrVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        BigInteger bigInteger = (BigInteger) ahgrVar.b;
        BigInteger bigIntegerMultiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(bigIntegerMod.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        ahgrVar.a = bigIntegerModPow2;
        a = ahgv.h(c(bigIntegerMod));
        b = ahgv.h(c(bigIntegerMod2));
        c = ahgv.h(c(bigIntegerModPow));
        d = (ahgo[][]) Array.newInstance((Class<?>) ahgo.class, 32, 8);
        ahgr ahgrVarB = ahgrVar;
        for (int i2 = 0; i2 < 32; i2++) {
            ahgr ahgrVarB2 = ahgrVarB;
            for (int i3 = 0; i3 < 8; i3++) {
                d[i2][i3] = a(ahgrVarB2);
                ahgrVarB2 = b(ahgrVarB2, ahgrVarB);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                ahgrVarB = b(ahgrVarB, ahgrVarB);
            }
        }
        ahgr ahgrVarB3 = b(ahgrVar, ahgrVar);
        e = new ahgo[8];
        for (int i5 = 0; i5 < 8; i5++) {
            e[i5] = a(ahgrVar);
            ahgrVar = b(ahgrVar, ahgrVarB3);
        }
    }

    private static ahgo a(ahgr ahgrVar) {
        BigInteger bigIntegerAdd = ((BigInteger) ahgrVar.b).add((BigInteger) ahgrVar.a);
        BigInteger bigInteger = f;
        return new ahgo(ahgv.h(c(bigIntegerAdd.mod(bigInteger))), ahgv.h(c(((BigInteger) ahgrVar.b).subtract((BigInteger) ahgrVar.a).mod(bigInteger))), ahgv.h(c(h.multiply((BigInteger) ahgrVar.a).multiply((BigInteger) ahgrVar.b).mod(bigInteger))));
    }

    private static ahgr b(ahgr ahgrVar, ahgr ahgrVar2) {
        ahgr ahgrVar3 = new ahgr();
        BigInteger bigIntegerMultiply = g.multiply(((BigInteger) ahgrVar.a).multiply((BigInteger) ahgrVar2.a).multiply((BigInteger) ahgrVar.b).multiply((BigInteger) ahgrVar2.b));
        BigInteger bigInteger = f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        ahgrVar3.a = ((BigInteger) ahgrVar.a).multiply((BigInteger) ahgrVar2.b).add(((BigInteger) ahgrVar2.a).multiply((BigInteger) ahgrVar.b)).multiply(BigInteger.ONE.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        ahgrVar3.b = ((BigInteger) ahgrVar.b).multiply((BigInteger) ahgrVar2.b).add(((BigInteger) ahgrVar.a).multiply((BigInteger) ahgrVar2.a)).multiply(BigInteger.ONE.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return ahgrVar3;
    }

    private static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }
}
