package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvy extends lxt implements lyq {
    public static final int DATABASE_FIELD_NUMBER = 2;
    public static final lvy DEFAULT_INSTANCE;
    public static final int IGNORE_ERRORS_AND_DELETE_DOCUMENTS_FIELD_NUMBER = 3;
    private static volatile lyu PARSER = null;
    public static final int SCHEMA_FIELD_NUMBER = 1;
    public int bitField0_;
    public String database_ = "";
    public boolean ignoreErrorsAndDeleteDocuments_;
    public lvm schema_;

    static {
        lvy lvyVar = new lvy();
        DEFAULT_INSTANCE = lvyVar;
        lxt.E(lvy.class, lvyVar);
    }

    private lvy() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "schema_", "database_", "ignoreErrorsAndDeleteDocuments_"});
        }
        if (i2 == 3) {
            return new lvy();
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
