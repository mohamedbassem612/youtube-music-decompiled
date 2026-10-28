package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltm extends lxt implements lyq {
    public static final ltm DEFAULT_INSTANCE;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private static volatile lyu PARSER = null;
    public static final int SCHEMA_FIELD_NUMBER = 2;
    public static final int URIS_FIELD_NUMBER = 3;
    private int bitField0_;
    public String namespace_ = "";
    public String schema_ = "";
    public lye uris_ = lyx.a;

    static {
        ltm ltmVar = new ltm();
        DEFAULT_INSTANCE = ltmVar;
        lxt.E(ltm.class, ltmVar);
    }

    private ltm() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"bitField0_", "namespace_", "schema_", "uris_"});
        }
        if (i2 == 3) {
            return new ltm();
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
