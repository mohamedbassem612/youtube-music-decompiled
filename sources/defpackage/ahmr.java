package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmr implements ahge {
    private final byte[] a;
    private final PublicKey b;
    private final String c = "SLH-DSA-SHA2-128S";
    private final Provider d;

    public ahmr(byte[] bArr, PublicKey publicKey, Provider provider) {
        this.a = bArr;
        this.b = publicKey;
        this.d = provider;
    }

    public static ahge b(ahlu ahluVar, Provider provider) throws GeneralSecurityException {
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Can not use SLH-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
        }
        ahls ahlsVar = ahluVar.a;
        if (ahlsVar.a != ahlp.a || ahlsVar.b != ahlq.b) {
            throw new GeneralSecurityException("Unsupported SLH-DSA parameters");
        }
        return new ahmr(ahluVar.c.c(), KeyFactory.getInstance("SLH-DSA-SHA2-128S", provider).generatePublic(new ahmq(ahluVar.b.c())), provider);
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.a;
        if (!ahie.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length != length2 + 7856) {
            throw new GeneralSecurityException("Invalid signature length");
        }
        String str = this.c;
        Provider provider = this.d;
        PublicKey publicKey = this.b;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(publicKey);
        signature.update(bArr2);
        if (!signature.verify(bArr, length2, 7856)) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
