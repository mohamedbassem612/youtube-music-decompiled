package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltq extends lxt implements lyq {
    public static final ltq DEFAULT_INSTANCE;
    public static final int DELETE_TYPE_FIELD_NUMBER = 2;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    public static final int NUM_DOCUMENTS_DELETED_FIELD_NUMBER = 3;
    private static volatile lyu PARSER;
    private int bitField0_;
    private int deleteType_;
    private int latencyMs_;
    private int numDocumentsDeleted_;

    static {
        ltq ltqVar = new ltq();
        DEFAULT_INSTANCE = ltqVar;
        lxt.E(ltq.class, ltqVar);
    }

    private ltq() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"bitField0_", "latencyMs_", "deleteType_", ltw.b, "numDocumentsDeleted_"});
        }
        if (i2 == 3) {
            return new ltq();
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
