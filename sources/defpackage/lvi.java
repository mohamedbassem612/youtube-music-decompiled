package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvi extends lxt implements lyq {
    public static final lvi DEFAULT_INSTANCE;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private static volatile lyu PARSER = null;
    public static final int SCHEMA_FIELD_NUMBER = 2;
    public int bitField0_;
    public String namespace_ = "";
    public String schema_ = "";

    static {
        lvi lviVar = new lvi();
        DEFAULT_INSTANCE = lviVar;
        lxt.E(lvi.class, lviVar);
    }

    private lvi() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "namespace_", "schema_"});
        }
        if (i2 == 3) {
            return new lvi();
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
