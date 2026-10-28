package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltv extends lxt implements lyq {
    public static final int CORPUS_MAPPER_SIZE_FIELD_NUMBER = 10;
    public static final int CORPUS_SCORE_CACHE_SIZE_FIELD_NUMBER = 11;
    public static final ltv DEFAULT_INSTANCE;
    public static final int DOCUMENT_ID_MAPPER_SIZE_FIELD_NUMBER = 7;
    public static final int DOCUMENT_LOG_SIZE_FIELD_NUMBER = 5;
    public static final int DOCUMENT_STORE_SIZE_FIELD_NUMBER = 4;
    public static final int FILTER_CACHE_SIZE_FIELD_NUMBER = 9;
    public static final int KEY_MAPPER_SIZE_FIELD_NUMBER = 6;
    public static final int NAMESPACE_ID_MAPPER_SIZE_FIELD_NUMBER = 12;
    public static final int NAMESPACE_STORAGE_INFO_FIELD_NUMBER = 14;
    public static final int NUM_ALIVE_DOCUMENTS_FIELD_NUMBER = 1;
    public static final int NUM_DELETED_DOCUMENTS_FIELD_NUMBER = 2;
    public static final int NUM_EXPIRED_DOCUMENTS_FIELD_NUMBER = 3;
    public static final int NUM_NAMESPACES_FIELD_NUMBER = 13;
    private static volatile lyu PARSER = null;
    public static final int SCORABLE_PROPERTY_CACHE_SIZE_FIELD_NUMBER = 15;
    public static final int SCORE_CACHE_SIZE_FIELD_NUMBER = 8;
    private int bitField0_;
    private long corpusMapperSize_;
    private long corpusScoreCacheSize_;
    private long documentIdMapperSize_;
    private long documentLogSize_;
    private long documentStoreSize_;
    private long filterCacheSize_;
    private long keyMapperSize_;
    private long namespaceIdMapperSize_;
    public lye namespaceStorageInfo_ = lyx.a;
    public int numAliveDocuments_;
    private int numDeletedDocuments_;
    public int numExpiredDocuments_;
    private int numNamespaces_;
    private long scorablePropertyCacheSize_;
    private long scoreCacheSize_;

    static {
        ltv ltvVar = new ltv();
        DEFAULT_INSTANCE = ltvVar;
        lxt.E(ltv.class, ltvVar);
    }

    private ltv() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rင\r\u000e\u001b\u000fဂ\f", new Object[]{"bitField0_", "numAliveDocuments_", "numDeletedDocuments_", "numExpiredDocuments_", "documentStoreSize_", "documentLogSize_", "keyMapperSize_", "documentIdMapperSize_", "scoreCacheSize_", "filterCacheSize_", "corpusMapperSize_", "corpusScoreCacheSize_", "namespaceIdMapperSize_", "numNamespaces_", "namespaceStorageInfo_", luq.class, "scorablePropertyCacheSize_"});
        }
        if (i2 == 3) {
            return new ltv();
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
