package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lux extends lxt implements lyq {
    public static final lux DEFAULT_INSTANCE;
    public static final int DIGEST_FIELD_NUMBER = 1;
    public static final int NAMESPACE_FIELD_NUMBER = 3;
    private static volatile lyu PARSER;
    public int bitField0_;
    public lxa digest_ = lxa.d;
    public String namespace_ = "";

    static {
        lux luxVar = new lux();
        DEFAULT_INSTANCE = luxVar;
        lxt.E(lux.class, luxVar);
    }

    private lux() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ည\u0000\u0003ဈ\u0001", new Object[]{"bitField0_", "digest_", "namespace_"});
        }
        if (i2 == 3) {
            return new lux();
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
