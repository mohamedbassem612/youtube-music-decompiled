package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lty extends lxt implements lyq {
    public static final lty DEFAULT_INSTANCE;
    public static final int EMBEDDING_QUERY_METRIC_TYPE_FIELD_NUMBER = 3;
    public static final int EMBEDDING_QUERY_VECTOR_INDEX_FIELD_NUMBER = 2;
    private static volatile lyu PARSER = null;
    public static final int SEMANTIC_SCORE_FIELD_NUMBER = 1;
    private int bitField0_;
    public int embeddingQueryMetricType_;
    public int embeddingQueryVectorIndex_;
    public double semanticScore_;

    static {
        lty ltyVar = new lty();
        DEFAULT_INSTANCE = ltyVar;
        lxt.E(lty.class, ltyVar);
    }

    private lty() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "semanticScore_", "embeddingQueryVectorIndex_", "embeddingQueryMetricType_", lwe.b});
        }
        if (i2 == 3) {
            return new lty();
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
