package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmo implements ahge {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    private final RSAPublicKey c;
    private final String d;
    private final PSSParameterSpec e;
    private final byte[] f;
    private final byte[] g;
    private final Provider h;

    public ahmo(RSAPublicKey rSAPublicKey, ahkx ahkxVar, ahkx ahkxVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!afyd.q(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!ahkxVar.equals(ahkxVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        ahne.a(rSAPublicKey.getModulus().bitLength());
        ahne.b(rSAPublicKey.getPublicExponent());
        this.c = rSAPublicKey;
        this.d = b(ahkxVar);
        this.e = d(ahkxVar, ahkxVar2, i);
        this.f = bArr;
        this.g = bArr2;
        this.h = provider;
    }

    static String b(ahkx ahkxVar) {
        if (ahkxVar == ahkx.a) {
            return "SHA256withRSA/PSS";
        }
        if (ahkxVar == ahkx.b) {
            return "SHA384withRSA/PSS";
        }
        if (ahkxVar == ahkx.c) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(String.valueOf(ahkxVar))));
    }

    public static Provider c() {
        if (ahie.b()) {
            ahie.a().intValue();
        }
        return ahgn.a();
    }

    static PSSParameterSpec d(ahkx ahkxVar, ahkx ahkxVar2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        ahkx ahkxVar3 = ahkx.a;
        if (ahkxVar == ahkxVar3) {
            str = "SHA-256";
        } else if (ahkxVar == ahkx.b) {
            str = "SHA-384";
        } else {
            if (ahkxVar != ahkx.c) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(String.valueOf(ahkxVar))));
            }
            str = "SHA-512";
        }
        if (ahkxVar2 == ahkxVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (ahkxVar2 == ahkx.b) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (ahkxVar2 != ahkx.c) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(String.valueOf(ahkxVar2))));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f;
        if (!ahie.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.d;
        Provider provider = this.h;
        RSAPublicKey rSAPublicKey = this.c;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.e);
        signature.update(bArr2);
        byte[] bArr4 = this.g;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
