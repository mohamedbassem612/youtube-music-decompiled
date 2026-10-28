package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvd extends lxt implements lyq {
    public static final lvd DEFAULT_INSTANCE;
    public static final int DOCUMENT_SIZE_FIELD_NUMBER = 5;
    public static final int DOCUMENT_STORE_LATENCY_MS_FIELD_NUMBER = 2;
    public static final int EMBEDDING_INDEX_LATENCY_MS_FIELD_NUMBER = 12;
    public static final int INDEX_LATENCY_MS_FIELD_NUMBER = 3;
    public static final int INDEX_MERGE_LATENCY_MS_FIELD_NUMBER = 4;
    public static final int INTEGER_INDEX_LATENCY_MS_FIELD_NUMBER = 8;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    public static final int LITE_INDEX_SORT_LATENCY_MS_FIELD_NUMBER = 10;
    public static final int METADATA_TERM_INDEX_LATENCY_MS_FIELD_NUMBER = 11;
    private static volatile lyu PARSER = null;
    public static final int QUALIFIED_ID_JOIN_INDEX_LATENCY_MS_FIELD_NUMBER = 9;
    public static final int TERM_INDEX_LATENCY_MS_FIELD_NUMBER = 7;
    public static final int TOKENIZATION_STATS_FIELD_NUMBER = 6;
    private int bitField0_;
    public int documentSize_;
    public int documentStoreLatencyMs_;
    public int embeddingIndexLatencyMs_;
    public int indexLatencyMs_;
    public int indexMergeLatencyMs_;
    public int integerIndexLatencyMs_;
    public int latencyMs_;
    public int liteIndexSortLatencyMs_;
    public int metadataTermIndexLatencyMs_;
    public int qualifiedIdJoinIndexLatencyMs_;
    public int termIndexLatencyMs_;
    public lvc tokenizationStats_;

    static {
        lvd lvdVar = new lvd();
        DEFAULT_INSTANCE = lvdVar;
        lxt.E(lvd.class, lvdVar);
    }

    private lvd() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b", new Object[]{"bitField0_", "latencyMs_", "documentStoreLatencyMs_", "indexLatencyMs_", "indexMergeLatencyMs_", "documentSize_", "tokenizationStats_", "termIndexLatencyMs_", "integerIndexLatencyMs_", "qualifiedIdJoinIndexLatencyMs_", "liteIndexSortLatencyMs_", "metadataTermIndexLatencyMs_", "embeddingIndexLatencyMs_"});
        }
        if (i2 == 3) {
            return new lvd();
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
