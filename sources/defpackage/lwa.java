package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwa extends lxt implements lyq {
    public static final lwa DEFAULT_INSTANCE;
    public static final int DOCUMENT_STORE_OPTIMIZED_UPDATE_SCHEMA_LATENCY_MS_FIELD_NUMBER = 4;
    public static final int DOCUMENT_STORE_UPDATE_SCHEMA_LATENCY_MS_FIELD_NUMBER = 3;
    public static final int INDEX_RESTORATION_LATENCY_MS_FIELD_NUMBER = 5;
    public static final int OVERALL_LATENCY_MS_FIELD_NUMBER = 1;
    private static volatile lyu PARSER = null;
    public static final int SCHEMA_PROTO_BYTE_SIZE_FIELD_NUMBER = 7;
    public static final int SCHEMA_STORE_REINITIALIZATION_LATENCY_MS_FIELD_NUMBER = 8;
    public static final int SCHEMA_STORE_SET_SCHEMA_LATENCY_MS_FIELD_NUMBER = 2;
    public static final int SCORABLE_PROPERTY_CACHE_REGENERATION_LATENCY_MS_FIELD_NUMBER = 6;
    private int bitField0_;
    public int documentStoreOptimizedUpdateSchemaLatencyMs_;
    public int documentStoreUpdateSchemaLatencyMs_;
    public int indexRestorationLatencyMs_;
    private int overallLatencyMs_;
    public long schemaProtoByteSize_;
    public int schemaStoreReinitializationLatencyMs_;
    public int schemaStoreSetSchemaLatencyMs_;
    public int scorablePropertyCacheRegenerationLatencyMs_;

    static {
        lwa lwaVar = new lwa();
        DEFAULT_INSTANCE = lwaVar;
        lxt.E(lwa.class, lwaVar);
    }

    private lwa() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006\bင\u0007", new Object[]{"bitField0_", "overallLatencyMs_", "schemaStoreSetSchemaLatencyMs_", "documentStoreUpdateSchemaLatencyMs_", "documentStoreOptimizedUpdateSchemaLatencyMs_", "indexRestorationLatencyMs_", "scorablePropertyCacheRegenerationLatencyMs_", "schemaProtoByteSize_", "schemaStoreReinitializationLatencyMs_"});
        }
        if (i2 == 3) {
            return new lwa();
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
