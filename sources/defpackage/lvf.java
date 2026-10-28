package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvf extends lxt implements lyq {
    public static final lvf DEFAULT_INSTANCE;
    public static final int IS_NUMERIC_QUERY_FIELD_NUMBER = 9;
    public static final int NUM_ANN_EMBEDDINGS_SCORED_FIELD_NUMBER = 20;
    public static final int NUM_DOCUMENTS_SCORED_FIELD_NUMBER = 6;
    public static final int NUM_EMBEDDING_BYTES_READ_FIELD_NUMBER = 19;
    public static final int NUM_EMBEDDING_SHARDS_READ_FIELD_NUMBER = 18;
    public static final int NUM_FETCHED_HITS_INTEGER_INDEX_FIELD_NUMBER = 12;
    public static final int NUM_FETCHED_HITS_LITE_INDEX_FIELD_NUMBER = 10;
    public static final int NUM_FETCHED_HITS_MAIN_INDEX_FIELD_NUMBER = 11;
    public static final int NUM_NAMESPACES_FILTERED_FIELD_NUMBER = 3;
    public static final int NUM_QUANTIZED_EMBEDDINGS_SCORED_FIELD_NUMBER = 17;
    public static final int NUM_SCHEMA_TYPES_FILTERED_FIELD_NUMBER = 4;
    public static final int NUM_TERMS_FIELD_NUMBER = 2;
    public static final int NUM_UNQUANTIZED_EMBEDDINGS_SCORED_FIELD_NUMBER = 16;
    private static volatile lyu PARSER = null;
    public static final int PARSE_QUERY_LATENCY_MS_FIELD_NUMBER = 7;
    public static final int QUERY_LENGTH_FIELD_NUMBER = 1;
    public static final int QUERY_PROCESSOR_LEXER_EXTRACT_TOKEN_LATENCY_MS_FIELD_NUMBER = 13;
    public static final int QUERY_PROCESSOR_PARSER_CONSUME_QUERY_LATENCY_MS_FIELD_NUMBER = 14;
    public static final int QUERY_PROCESSOR_QUERY_VISITOR_LATENCY_MS_FIELD_NUMBER = 15;
    public static final int RANKING_STRATEGY_FIELD_NUMBER = 5;
    public static final int SCORING_LATENCY_MS_FIELD_NUMBER = 8;
    private int bitField0_;
    public boolean isNumericQuery_;
    public int numAnnEmbeddingsScored_;
    public int numDocumentsScored_;
    public long numEmbeddingBytesRead_;
    public int numEmbeddingShardsRead_;
    public int numFetchedHitsIntegerIndex_;
    public int numFetchedHitsLiteIndex_;
    public int numFetchedHitsMainIndex_;
    public int numNamespacesFiltered_;
    public int numQuantizedEmbeddingsScored_;
    public int numSchemaTypesFiltered_;
    public int numTerms_;
    public int numUnquantizedEmbeddingsScored_;
    public int parseQueryLatencyMs_;
    public int queryLength_;
    public int queryProcessorLexerExtractTokenLatencyMs_;
    public int queryProcessorParserConsumeQueryLatencyMs_;
    public int queryProcessorQueryVisitorLatencyMs_;
    public int rankingStrategy_;
    public int scoringLatencyMs_;

    static {
        lvf lvfVar = new lvf();
        DEFAULT_INSTANCE = lvfVar;
        lxt.E(lvf.class, lvfVar);
    }

    private lvf() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005᠌\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဇ\b\nင\t\u000bင\n\fင\u000b\rင\f\u000eင\r\u000fင\u000e\u0010င\u000f\u0011င\u0010\u0012င\u0011\u0013ဂ\u0012\u0014င\u0013", new Object[]{"bitField0_", "queryLength_", "numTerms_", "numNamespacesFiltered_", "numSchemaTypesFiltered_", "rankingStrategy_", ltw.u, "numDocumentsScored_", "parseQueryLatencyMs_", "scoringLatencyMs_", "isNumericQuery_", "numFetchedHitsLiteIndex_", "numFetchedHitsMainIndex_", "numFetchedHitsIntegerIndex_", "queryProcessorLexerExtractTokenLatencyMs_", "queryProcessorParserConsumeQueryLatencyMs_", "queryProcessorQueryVisitorLatencyMs_", "numUnquantizedEmbeddingsScored_", "numQuantizedEmbeddingsScored_", "numEmbeddingShardsRead_", "numEmbeddingBytesRead_", "numAnnEmbeddingsScored_"});
        }
        if (i2 == 3) {
            return new lvf();
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
