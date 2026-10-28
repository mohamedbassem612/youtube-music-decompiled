package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lto extends lxt implements lyq {
    public static final lto DEFAULT_INSTANCE;
    public static final int DOCUMENT_REMOVAL_LATENCY_MS_FIELD_NUMBER = 8;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    public static final int NUM_DOCUMENTS_DELETED_FIELD_NUMBER = 2;
    public static final int NUM_NAMESPACES_FILTERED_FIELD_NUMBER = 5;
    public static final int NUM_SCHEMA_TYPES_FILTERED_FIELD_NUMBER = 6;
    public static final int NUM_TERMS_FIELD_NUMBER = 4;
    private static volatile lyu PARSER = null;
    public static final int PARSE_QUERY_LATENCY_MS_FIELD_NUMBER = 7;
    public static final int QUERY_LENGTH_FIELD_NUMBER = 3;
    private int bitField0_;
    public int documentRemovalLatencyMs_;
    public int latencyMs_;
    public int numDocumentsDeleted_;
    public int numNamespacesFiltered_;
    public int numSchemaTypesFiltered_;
    public int numTerms_;
    public int parseQueryLatencyMs_;
    public int queryLength_;

    static {
        lto ltoVar = new lto();
        DEFAULT_INSTANCE = ltoVar;
        lxt.E(lto.class, ltoVar);
    }

    private lto() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"bitField0_", "latencyMs_", "numDocumentsDeleted_", "queryLength_", "numTerms_", "numNamespacesFiltered_", "numSchemaTypesFiltered_", "parseQueryLatencyMs_", "documentRemovalLatencyMs_"});
        }
        if (i2 == 3) {
            return new lto();
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
