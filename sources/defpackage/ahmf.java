package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmf implements ahge {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    private final PublicKey c;
    private final byte[] d;
    private final byte[] e;
    private final Provider f;

    public ahmf(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.c = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(aedi.A(b, bArr)));
        this.d = bArr2;
        this.e = bArr3;
        this.f = provider;
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            throw new GeneralSecurityException(String.format("Invalid signature length: %s", 64));
        }
        if (!ahie.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Provider provider = this.f;
        PublicKey publicKey = this.c;
        Signature signature = Signature.getInstance("Ed25519", provider);
        signature.initVerify(publicKey);
        signature.update(bArr2);
        signature.update(this.e);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
