package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahnb implements ahge {
    public static ahge b(ahku ahkuVar) {
        try {
            Provider providerD = ahmm.d();
            if (providerD != null) {
                return ahmm.b(ahkuVar, providerD);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            byte[] bArr = ahmk.a;
            KeyFactory keyFactory = (KeyFactory) ahmx.c.a("RSA");
            BigInteger bigInteger = ahkuVar.b;
            ahks ahksVar = ahkuVar.a;
            return new ahmk((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, ahksVar.c)), (ahna) ahmk.c.c(ahksVar.e), ahkuVar.c.c(), ahksVar.d.equals(ahkr.c) ? ahmk.b : ahmk.a);
        }
    }

    public static ahge c(ahkf ahkfVar) throws GeneralSecurityException {
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            int i = ahmf.a;
            Provider providerA = ahgn.a();
            if (providerA == null) {
                throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
            }
            if (afyd.q(1)) {
                return new ahmf(ahkfVar.b.c(), ahkfVar.c.c(), ahkfVar.a.a.equals(ahkb.c) ? new byte[]{0} : new byte[0], providerA);
            }
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        } catch (GeneralSecurityException unused) {
            return new ahmu(ahkfVar.b.c(), ahkfVar.c.c(), ahkfVar.a.a.equals(ahkb.c) ? new byte[]{0} : new byte[0], 0);
        }
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
