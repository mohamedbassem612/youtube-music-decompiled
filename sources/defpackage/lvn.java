package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvn extends lxt implements lyq {
    public static final lvn DEFAULT_INSTANCE;
    public static final int NUM_SCHEMA_TYPES_FIELD_NUMBER = 2;
    public static final int NUM_SCHEMA_TYPES_SECTIONS_EXHAUSTED_FIELD_NUMBER = 4;
    public static final int NUM_TOTAL_SECTIONS_FIELD_NUMBER = 3;
    private static volatile lyu PARSER = null;
    public static final int SCHEMA_STORE_SIZE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int numSchemaTypesSectionsExhausted_;
    private int numSchemaTypes_;
    private int numTotalSections_;
    private long schemaStoreSize_;

    static {
        lvn lvnVar = new lvn();
        DEFAULT_INSTANCE = lvnVar;
        lxt.E(lvn.class, lvnVar);
    }

    private lvn() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "schemaStoreSize_", "numSchemaTypes_", "numTotalSections_", "numSchemaTypesSectionsExhausted_"});
        }
        if (i2 == 3) {
            return new lvn();
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
