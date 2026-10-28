package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjl {
    public static final ahjl a = new ahjl("ED25519");
    public static final ahjl b = new ahjl("ECDSA_P256");
    public static final ahjl c = new ahjl("ECDSA_P384");
    public static final ahjl d = new ahjl("ECDSA_P521");
    public static final ahjl e = new ahjl("RSA2048_PSS");
    public static final ahjl f = new ahjl("RSA3072_PSS");
    public static final ahjl g = new ahjl("RSA4096_PSS");
    public static final ahjl h = new ahjl("RSA2048_PKCS1");
    public static final ahjl i = new ahjl("RSA3072_PKCS1");
    public static final ahjl j = new ahjl("RSA4096_PKCS1");
    public final String k;

    private ahjl(String str) {
        this.k = str;
    }

    public final String toString() {
        return this.k;
    }
}
