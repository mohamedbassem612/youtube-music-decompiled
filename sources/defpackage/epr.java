package defpackage;

import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class epr extends eps {
    private final byte[] a;

    public epr(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // defpackage.eps, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.a;
    }
}
