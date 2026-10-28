package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahme implements ahgd {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public ahme(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(aedi.A(b, bArr)));
    }

    @Override // defpackage.ahgd
    public final void a(byte[] bArr) {
        throw null;
    }
}
