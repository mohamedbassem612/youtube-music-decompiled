package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lus extends lxt implements lyq {
    public static final int AFTER_OPTIMIZE_PERSIST_STATS_FIELD_NUMBER = 15;
    public static final int BEFORE_OPTIMIZE_PERSIST_STATS_FIELD_NUMBER = 14;
    public static final lus DEFAULT_INSTANCE;
    public static final int DOCUMENT_STORE_OPTIMIZE_LATENCY_MS_FIELD_NUMBER = 2;
    public static final int INDEX_RESTORATION_LATENCY_MS_FIELD_NUMBER = 3;
    public static final int INDEX_RESTORATION_MODE_FIELD_NUMBER = 10;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    public static final int NUM_DELETED_DOCUMENTS_FIELD_NUMBER = 5;
    public static final int NUM_DELETED_NAMESPACES_FIELD_NUMBER = 12;
    public static final int NUM_EXPIRED_DOCUMENTS_FIELD_NUMBER = 6;
    public static final int NUM_ORIGINAL_DOCUMENTS_FIELD_NUMBER = 4;
    public static final int NUM_ORIGINAL_NAMESPACES_FIELD_NUMBER = 11;
    private static volatile lyu PARSER = null;
    public static final int STORAGE_SIZE_AFTER_FIELD_NUMBER = 8;
    public static final int STORAGE_SIZE_BEFORE_FIELD_NUMBER = 7;
    public static final int TIME_SINCE_LAST_OPTIMIZE_MS_FIELD_NUMBER = 9;
    public static final int TIME_SINCE_LAST_SUCCESSFUL_OPTIMIZE_MS_FIELD_NUMBER = 13;
    private luu afterOptimizePersistStats_;
    private luu beforeOptimizePersistStats_;
    private int bitField0_;
    public int documentStoreOptimizeLatencyMs_;
    public int indexRestorationLatencyMs_;
    public int indexRestorationMode_;
    public int latencyMs_;
    public int numDeletedDocuments_;
    public int numDeletedNamespaces_;
    public int numExpiredDocuments_;
    public int numOriginalDocuments_;
    public int numOriginalNamespaces_;
    public long storageSizeAfter_;
    public long storageSizeBefore_;
    public long timeSinceLastOptimizeMs_;
    private long timeSinceLastSuccessfulOptimizeMs_;

    static {
        lus lusVar = new lus();
        DEFAULT_INSTANCE = lusVar;
        lxt.E(lus.class, lusVar);
    }

    private lus() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\n᠌\n\u000bင\u000b\fင\f\rဂ\t\u000eဉ\r\u000fဉ\u000e", new Object[]{"bitField0_", "latencyMs_", "documentStoreOptimizeLatencyMs_", "indexRestorationLatencyMs_", "numOriginalDocuments_", "numDeletedDocuments_", "numExpiredDocuments_", "storageSizeBefore_", "storageSizeAfter_", "timeSinceLastOptimizeMs_", "indexRestorationMode_", ltw.l, "numOriginalNamespaces_", "numDeletedNamespaces_", "timeSinceLastSuccessfulOptimizeMs_", "beforeOptimizePersistStats_", "afterOptimizePersistStats_"});
        }
        if (i2 == 3) {
            return new lus();
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
