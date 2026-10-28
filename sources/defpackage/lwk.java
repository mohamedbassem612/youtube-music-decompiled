package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwk extends lxt implements lyq {
    public static final lwk DEFAULT_INSTANCE;
    private static volatile lyu PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 2;
    public static final int SCHEMA_TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public String schemaType_ = "";
    public lye paths_ = lyx.a;

    static {
        lwk lwkVar = new lwk();
        DEFAULT_INSTANCE = lwkVar;
        lxt.E(lwk.class, lwkVar);
    }

    private lwk() {
    }

    public static lwj b() {
        return (lwj) DEFAULT_INSTANCE.s();
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"bitField0_", "schemaType_", "paths_"});
        }
        if (i2 == 3) {
            return new lwk();
        }
        if (i2 == 4) {
            return new lwj();
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
