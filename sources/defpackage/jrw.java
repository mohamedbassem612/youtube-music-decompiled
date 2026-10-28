package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jrw extends lxt implements lyq {
    public static final jrw DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    public static final int PACKAGE_SHA256CERT_FIELD_NUMBER = 2;
    public static final int PACKAGE_SHA256_CERTS_FIELD_NUMBER = 3;
    private static volatile lyu PARSER;
    public int bitField0_;
    public String packageName_ = "";
    public lxa packageSha256Cert_ = lxa.d;
    public lye packageSha256Certs_ = lyx.a;

    static {
        jrw jrwVar = new jrw();
        DEFAULT_INSTANCE = jrwVar;
        lxt.E(jrw.class, jrwVar);
    }

    private jrw() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003\u001c", new Object[]{"bitField0_", "packageName_", "packageSha256Cert_", "packageSha256Certs_"});
        }
        if (i2 == 3) {
            return new jrw();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
