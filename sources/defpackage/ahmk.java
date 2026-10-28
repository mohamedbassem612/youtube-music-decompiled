package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmk implements ahge {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final ahtv c;
    private final RSAPublicKey d;
    private final ahna e;
    private final byte[] f;
    private final byte[] g;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agvp.B(ahna.c, ahkq.a, map, map2);
        agvp.B(ahna.d, ahkq.b, map, map2);
        agvp.B(ahna.e, ahkq.c, map, map2);
        c = agvp.C(map, map2);
    }

    public ahmk(RSAPublicKey rSAPublicKey, ahna ahnaVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (ahgm.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        ahne.c(ahnaVar);
        ahne.a(rSAPublicKey.getModulus().bitLength());
        ahne.b(rSAPublicKey.getPublicExponent());
        this.d = rSAPublicKey;
        this.e = ahnaVar;
        this.f = bArr;
        this.g = bArr2;
    }

    private final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrW;
        int i;
        RSAPublicKey rSAPublicKey = this.d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrM = afyd.m(bigInteger.modPow(publicExponent, modulus), iBitLength);
        ahna ahnaVar = this.e;
        ahne.c(ahnaVar);
        MessageDigest messageDigest = (MessageDigest) ahmx.b.a(aedi.u(ahnaVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.g;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = ahnaVar.ordinal();
        int i2 = 2;
        if (iOrdinal == 2) {
            bArrW = aedi.w("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrW = aedi.w("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(ahnaVar.toString()));
            }
            bArrW = aedi.w("3051300d060960864801650304020305000440");
        }
        int length = bArrDigest.length;
        int i3 = length + 19;
        if (iBitLength < length + 30) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i4 = 0;
        while (true) {
            i = i2 + 1;
            if (i4 >= (iBitLength - i3) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i4++;
            i2 = i;
        }
        bArr4[i2] = 0;
        System.arraycopy(bArrW, 0, bArr4, i, 19);
        System.arraycopy(bArrDigest, 0, bArr4, i2 + 20, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrM, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!ahie.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
