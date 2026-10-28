package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmm implements ahge {
    private static final byte[] a = new byte[0];
    private static final byte[] b = {0};
    private final RSAPublicKey c;
    private final String d;
    private final byte[] e;
    private final byte[] f;
    private final Provider g;

    private ahmm(RSAPublicKey rSAPublicKey, ahkq ahkqVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!afyd.q(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        ahne.a(rSAPublicKey.getModulus().bitLength());
        ahne.b(rSAPublicKey.getPublicExponent());
        this.c = rSAPublicKey;
        this.d = c(ahkqVar);
        this.e = bArr;
        this.f = bArr2;
        this.g = provider;
    }

    public static ahge b(ahku ahkuVar, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = ahkuVar.b;
        ahks ahksVar = ahkuVar.a;
        return new ahmm((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, ahksVar.c)), ahksVar.e, ahkuVar.c.c(), ahksVar.d.equals(ahkr.c) ? b : a, provider);
    }

    public static String c(ahkq ahkqVar) throws GeneralSecurityException {
        if (ahkqVar == ahkq.a) {
            return "SHA256withRSA";
        }
        if (ahkqVar == ahkq.b) {
            return "SHA384withRSA";
        }
        if (ahkqVar == ahkq.c) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static Provider d() {
        if (ahie.b()) {
            ahie.a().intValue();
        }
        return ahgn.a();
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.e;
        if (!ahie.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.d;
        Provider provider = this.g;
        RSAPublicKey rSAPublicKey = this.c;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.f;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
