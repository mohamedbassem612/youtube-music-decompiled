package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchProviderException;
import java.security.Provider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmt implements ahgd {
    private final byte[] a;

    private ahmt(byte[] bArr) throws GeneralSecurityException {
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrG = ahgq.g(bArr);
        this.a = bArrG;
        ahgq.h(bArrG);
    }

    public static ahgd b(ahkd ahkdVar) throws GeneralSecurityException {
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            int i = ahme.a;
            Provider providerA = ahgn.a();
            if (providerA == null) {
                throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
            }
            byte[] bArrC = ahkdVar.b.c();
            ahkdVar.e().c();
            ahkdVar.b().a.equals(ahkb.c);
            return new ahme(bArrC, providerA);
        } catch (GeneralSecurityException unused) {
            byte[] bArrC2 = ahkdVar.b.c();
            ahkdVar.e().c();
            ahkdVar.b().a.equals(ahkb.c);
            return new ahmt(bArrC2);
        }
    }

    @Override // defpackage.ahgd
    public final void a(byte[] bArr) {
        throw null;
    }
}
