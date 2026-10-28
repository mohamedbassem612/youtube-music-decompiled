package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahnc implements ahge {
    private final RSAPublicKey a;
    private final ahna b;
    private final ahna c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public ahnc(RSAPublicKey rSAPublicKey, ahna ahnaVar, ahna ahnaVar2, int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (ahgm.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        ahne.c(ahnaVar);
        if (!ahnaVar.equals(ahnaVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        ahne.a(rSAPublicKey.getModulus().bitLength());
        ahne.b(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = ahnaVar;
        this.c = ahnaVar2;
        this.d = i;
        this.e = bArr;
        this.f = bArr2;
    }

    private final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrM = afyd.m(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        ahna ahnaVar = this.b;
        ahne.c(ahnaVar);
        ahmx ahmxVar = ahmx.b;
        MessageDigest messageDigest = (MessageDigest) ahmxVar.a(aedi.u(ahnaVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrM.length;
        int i = this.d;
        if (length < digestLength + i + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrM[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrM, i3);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM, length2, length2 + digestLength);
        int i4 = 0;
        while (true) {
            long j = (((long) length) << 3) - ((long) iBitLength3);
            if (i4 < j) {
                if (((bArrCopyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i4++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) ahmxVar.a(aedi.u(this.c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i3];
                int i5 = 0;
                int i6 = 0;
                while (i5 <= (i2 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    messageDigest2.update(afyd.m(BigInteger.valueOf(i5), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i6, Math.min(length3, i3 - i6));
                    i6 += length3;
                    i5++;
                    messageDigest2 = messageDigest2;
                }
                byte[] bArr5 = new byte[i3];
                for (int i7 = 0; i7 < i3; i7++) {
                    bArr5[i7] = (byte) (bArr4[i7] ^ bArrCopyOf[i7]);
                }
                for (int i8 = 0; i8 <= j; i8++) {
                    int i9 = i8 / 8;
                    bArr5[i9] = (byte) (bArr5[i9] & (~(1 << (7 - (i8 % 8)))));
                }
                int i10 = 0;
                while (true) {
                    int i11 = (i2 - i) - 2;
                    if (i10 >= i11) {
                        if (bArr5[i11] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i3 - i, i3);
                        int i12 = digestLength + 8;
                        byte[] bArr6 = new byte[i + i12];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i12, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i10] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i10++;
                }
            }
        }
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.e;
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
