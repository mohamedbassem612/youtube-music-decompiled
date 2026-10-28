package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luu extends lxt implements lyq {
    public static final int BLOB_STORE_PERSIST_LATENCY_MS_FIELD_NUMBER = 3;
    public static final luu DEFAULT_INSTANCE;
    public static final int DOCUMENT_LOG_CHECKSUM_UPDATE_LATENCY_MS_FIELD_NUMBER = 7;
    public static final int DOCUMENT_LOG_DATA_SYNC_LATENCY_MS_FIELD_NUMBER = 8;
    public static final int DOCUMENT_STORE_CHECKSUM_UPDATE_LATENCY_MS_FIELD_NUMBER = 6;
    public static final int DOCUMENT_STORE_COMPONENTS_PERSIST_LATENCY_MS_FIELD_NUMBER = 5;
    public static final int DOCUMENT_STORE_TOTAL_PERSIST_LATENCY_MS_FIELD_NUMBER = 4;
    public static final int EMBEDDING_INDEX_PERSIST_LATENCY_MS_FIELD_NUMBER = 13;
    public static final int INDEX_PERSIST_LATENCY_MS_FIELD_NUMBER = 10;
    public static final int INTEGER_INDEX_PERSIST_LATENCY_MS_FIELD_NUMBER = 11;
    public static final int LATENCY_MS_FIELD_NUMBER = 2;
    private static volatile lyu PARSER = null;
    public static final int PERSIST_TYPE_FIELD_NUMBER = 1;
    public static final int QUALIFIED_ID_JOIN_INDEX_PERSIST_LATENCY_MS_FIELD_NUMBER = 12;
    public static final int SCHEMA_STORE_PERSIST_LATENCY_MS_FIELD_NUMBER = 9;
    private int bitField0_;
    public int blobStorePersistLatencyMs_;
    public int documentLogChecksumUpdateLatencyMs_;
    public int documentLogDataSyncLatencyMs_;
    public int documentStoreChecksumUpdateLatencyMs_;
    public int documentStoreComponentsPersistLatencyMs_;
    public int documentStoreTotalPersistLatencyMs_;
    public int embeddingIndexPersistLatencyMs_;
    public int indexPersistLatencyMs_;
    public int integerIndexPersistLatencyMs_;
    public int latencyMs_;
    public int persistType_;
    public int qualifiedIdJoinIndexPersistLatencyMs_;
    public int schemaStorePersistLatencyMs_;

    static {
        luu luuVar = new luu();
        DEFAULT_INSTANCE = luuVar;
        lxt.E(luu.class, luuVar);
    }

    private luu() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rင\f", new Object[]{"bitField0_", "persistType_", ltw.m, "latencyMs_", "blobStorePersistLatencyMs_", "documentStoreTotalPersistLatencyMs_", "documentStoreComponentsPersistLatencyMs_", "documentStoreChecksumUpdateLatencyMs_", "documentLogChecksumUpdateLatencyMs_", "documentLogDataSyncLatencyMs_", "schemaStorePersistLatencyMs_", "indexPersistLatencyMs_", "integerIndexPersistLatencyMs_", "qualifiedIdJoinIndexPersistLatencyMs_", "embeddingIndexPersistLatencyMs_"});
        }
        if (i2 == 3) {
            return new luu();
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
