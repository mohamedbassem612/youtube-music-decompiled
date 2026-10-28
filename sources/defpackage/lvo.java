package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvo extends lxt implements lyq {
    public static final int ALIAS_SCHEMA_TYPE_FIELD_NUMBER = 1;
    public static final lvo DEFAULT_INSTANCE;
    private static volatile lyu PARSER = null;
    public static final int SCHEMA_TYPES_FIELD_NUMBER = 2;
    public int bitField0_;
    public String aliasSchemaType_ = "";
    public lye schemaTypes_ = lyx.a;

    static {
        lvo lvoVar = new lvo();
        DEFAULT_INSTANCE = lvoVar;
        lxt.E(lvo.class, lvoVar);
    }

    private lvo() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"bitField0_", "aliasSchemaType_", "schemaTypes_"});
        }
        if (i2 == 3) {
            return new lvo();
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
