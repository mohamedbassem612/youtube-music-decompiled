package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvg extends lxt implements lyq {
    public static final int CHILD_SEARCH_STATS_FIELD_NUMBER = 25;
    public static final lvg DEFAULT_INSTANCE;
    public static final int DOCUMENT_RETRIEVAL_LATENCY_MS_FIELD_NUMBER = 14;
    public static final int IS_FIRST_PAGE_FIELD_NUMBER = 5;
    public static final int IS_JOIN_QUERY_FIELD_NUMBER = 23;
    public static final int JAVA_TO_NATIVE_JNI_LATENCY_MS_FIELD_NUMBER = 19;
    public static final int JOIN_LATENCY_MS_FIELD_NUMBER = 21;
    public static final int LATENCY_MS_FIELD_NUMBER = 10;
    public static final int LITE_INDEX_HIT_BUFFER_BYTE_SIZE_FIELD_NUMBER = 26;
    public static final int LITE_INDEX_HIT_BUFFER_UNSORTED_BYTE_SIZE_FIELD_NUMBER = 27;
    public static final int LOCK_ACQUISITION_LATENCY_MS_FIELD_NUMBER = 17;
    public static final int NATIVE_TO_JAVA_JNI_LATENCY_MS_FIELD_NUMBER = 20;
    public static final int NATIVE_TO_JAVA_START_TIMESTAMP_MS_FIELD_NUMBER = 18;
    public static final int NUM_DOCUMENTS_SCORED_FIELD_NUMBER = 8;
    public static final int NUM_JOINED_RESULTS_RETURNED_CURRENT_PAGE_FIELD_NUMBER = 22;
    public static final int NUM_NAMESPACES_FILTERED_FIELD_NUMBER = 2;
    public static final int NUM_RESULTS_RETURNED_CURRENT_PAGE_FIELD_NUMBER = 7;
    public static final int NUM_RESULTS_WITH_SNIPPETS_FIELD_NUMBER = 15;
    public static final int NUM_RESULT_STATES_EVICTED_FIELD_NUMBER = 29;
    public static final int NUM_SCHEMA_TYPES_FILTERED_FIELD_NUMBER = 3;
    public static final int NUM_TERMS_FIELD_NUMBER = 1;
    public static final int PAGE_TOKEN_TYPE_FIELD_NUMBER = 28;
    public static final int PARENT_SEARCH_STATS_FIELD_NUMBER = 24;
    private static volatile lyu PARSER = null;
    public static final int PARSE_QUERY_LATENCY_MS_FIELD_NUMBER = 11;
    public static final int QUERY_LENGTH_FIELD_NUMBER = 16;
    public static final int RANKING_LATENCY_MS_FIELD_NUMBER = 13;
    public static final int RANKING_STRATEGY_FIELD_NUMBER = 4;
    public static final int REQUESTED_PAGE_SIZE_FIELD_NUMBER = 6;
    public static final int SCORING_LATENCY_MS_FIELD_NUMBER = 12;
    public int bitField0_;
    public lvf childSearchStats_;
    public int documentRetrievalLatencyMs_;
    public boolean isFirstPage_;
    private boolean isJoinQuery_;
    public int javaToNativeJniLatencyMs_;
    public int joinLatencyMs_;
    public int latencyMs_;
    public long liteIndexHitBufferByteSize_;
    public long liteIndexHitBufferUnsortedByteSize_;
    public int lockAcquisitionLatencyMs_;
    public int nativeToJavaJniLatencyMs_;
    public long nativeToJavaStartTimestampMs_;
    private int numDocumentsScored_;
    public int numJoinedResultsReturnedCurrentPage_;
    private int numNamespacesFiltered_;
    public int numResultStatesEvicted_;
    public int numResultsReturnedCurrentPage_;
    public int numResultsWithSnippets_;
    private int numSchemaTypesFiltered_;
    private int numTerms_;
    public int pageTokenType_;
    public lvf parentSearchStats_;
    private int parseQueryLatencyMs_;
    private int queryLength_;
    public int rankingLatencyMs_;
    private int rankingStrategy_;
    public int requestedPageSize_;
    private int scoringLatencyMs_;

    static {
        lvg lvgVar = new lvg();
        DEFAULT_INSTANCE = lvgVar;
        lxt.E(lvg.class, lvgVar);
    }

    private lvg() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u001c\u0000\u0001\u0001\u001d\u001c\u0000\u0000\u0000\u0001င\u0001\u0002င\u0002\u0003င\u0003\u0004᠌\u0004\u0005ဇ\u0005\u0006င\u0006\u0007င\u0007\bင\b\nင\n\u000bင\u000b\fင\f\rင\r\u000eင\u000e\u000fင\t\u0010င\u0000\u0011င\u000f\u0012ဂ\u0010\u0013င\u0011\u0014င\u0012\u0015င\u0013\u0016င\u0014\u0017ဇ\u0015\u0018ဉ\u0016\u0019ဉ\u0017\u001aဂ\u0018\u001bဂ\u0019\u001c᠌\u001a\u001dင\u001b", new Object[]{"bitField0_", "numTerms_", "numNamespacesFiltered_", "numSchemaTypesFiltered_", "rankingStrategy_", ltw.u, "isFirstPage_", "requestedPageSize_", "numResultsReturnedCurrentPage_", "numDocumentsScored_", "latencyMs_", "parseQueryLatencyMs_", "scoringLatencyMs_", "rankingLatencyMs_", "documentRetrievalLatencyMs_", "numResultsWithSnippets_", "queryLength_", "lockAcquisitionLatencyMs_", "nativeToJavaStartTimestampMs_", "javaToNativeJniLatencyMs_", "nativeToJavaJniLatencyMs_", "joinLatencyMs_", "numJoinedResultsReturnedCurrentPage_", "isJoinQuery_", "parentSearchStats_", "childSearchStats_", "liteIndexHitBufferByteSize_", "liteIndexHitBufferUnsortedByteSize_", "pageTokenType_", ltw.q, "numResultStatesEvicted_"});
        }
        if (i2 == 3) {
            return new lvg();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final int b() {
        int iAV = a.aV(this.pageTokenType_);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }
}
