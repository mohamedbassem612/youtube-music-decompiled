package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvk extends lxt implements lyq {
    public static final lvk DEFAULT_INSTANCE;
    public static final int GET_EMBEDDING_MATCH_INFO_FIELD_NUMBER = 4;
    public static final int MAX_WINDOW_UTF32_LENGTH_FIELD_NUMBER = 3;
    public static final int NUM_MATCHES_PER_PROPERTY_FIELD_NUMBER = 2;
    public static final int NUM_TO_SNIPPET_FIELD_NUMBER = 1;
    private static volatile lyu PARSER;
    public int bitField0_;
    public boolean getEmbeddingMatchInfo_;
    public int maxWindowUtf32Length_;
    public int numMatchesPerProperty_;
    public int numToSnippet_;

    static {
        lvk lvkVar = new lvk();
        DEFAULT_INSTANCE = lvkVar;
        lxt.E(lvk.class, lvkVar);
    }

    private lvk() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "numToSnippet_", "numMatchesPerProperty_", "maxWindowUtf32Length_", "getEmbeddingMatchInfo_"});
        }
        if (i2 == 3) {
            return new lvk();
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
