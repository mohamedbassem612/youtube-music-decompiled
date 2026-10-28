package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvx extends lxt implements lyq {
    public static final lvx DEFAULT_INSTANCE;
    public static final int DOCUMENT_URI_FILTERS_FIELD_NUMBER = 14;
    public static final int EMBEDDING_QUERY_METRIC_TYPE_FIELD_NUMBER = 12;
    public static final int EMBEDDING_QUERY_NPROBE_FIELD_NUMBER = 15;
    public static final int EMBEDDING_QUERY_VECTORS_FIELD_NUMBER = 11;
    public static final int ENABLED_FEATURES_FIELD_NUMBER = 8;
    public static final int JAVA_TO_NATIVE_START_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int JOIN_SPEC_FIELD_NUMBER = 7;
    public static final int NAMESPACE_FILTERS_FIELD_NUMBER = 3;
    private static volatile lyu PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 1;
    public static final int QUERY_PARAMETER_STRINGS_FIELD_NUMBER = 13;
    public static final int SCHEMA_TYPE_FILTERS_FIELD_NUMBER = 4;
    public static final int TERM_MATCH_TYPE_FIELD_NUMBER = 2;
    public static final int TYPE_PROPERTY_FILTERS_FIELD_NUMBER = 10;
    public static final int USE_READ_ONLY_SEARCH_FIELD_NUMBER = 9;
    public int bitField0_;
    public lye documentUriFilters_;
    public int embeddingQueryMetricType_;
    public int embeddingQueryNprobe_;
    public lye embeddingQueryVectors_;
    public lye enabledFeatures_;
    private long javaToNativeStartTimestampMs_;
    public lum joinSpec_;
    public lye namespaceFilters_;
    public lye queryParameterStrings_;
    public String query_ = "";
    public lye schemaTypeFilters_;
    public int termMatchType_;
    public lye typePropertyFilters_;
    public boolean useReadOnlySearch_;

    static {
        lvx lvxVar = new lvx();
        DEFAULT_INSTANCE = lvxVar;
        lxt.E(lvx.class, lvxVar);
    }

    private lvx() {
        lyx lyxVar = lyx.a;
        this.namespaceFilters_ = lyxVar;
        this.schemaTypeFilters_ = lyxVar;
        this.documentUriFilters_ = lyxVar;
        this.enabledFeatures_ = lyxVar;
        this.useReadOnlySearch_ = true;
        this.typePropertyFilters_ = lyxVar;
        this.embeddingQueryVectors_ = lyxVar;
        this.queryParameterStrings_ = lyxVar;
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0007\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u001a\u0004\u001a\u0005ဂ\u0002\u0007ဉ\u0003\b\u001a\tဇ\u0004\n\u001b\u000b\u001b\f᠌\u0005\r\u001a\u000e\u001b\u000fင\u0006", new Object[]{"bitField0_", "query_", "termMatchType_", lwe.d, "namespaceFilters_", "schemaTypeFilters_", "javaToNativeStartTimestampMs_", "joinSpec_", "enabledFeatures_", "useReadOnlySearch_", "typePropertyFilters_", lwk.class, "embeddingQueryVectors_", luy.class, "embeddingQueryMetricType_", lwe.b, "queryParameterStrings_", "documentUriFilters_", lup.class, "embeddingQueryNprobe_"});
        }
        if (i2 == 3) {
            return new lvx();
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
