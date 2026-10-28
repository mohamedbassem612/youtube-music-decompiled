package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltx extends lxt implements lyq {
    public static final ltx DEFAULT_INSTANCE;
    public static final int EMBEDDING_INDEXING_TYPE_FIELD_NUMBER = 1;
    private static volatile lyu PARSER = null;
    public static final int QUANTIZATION_TYPE_FIELD_NUMBER = 2;
    public int bitField0_;
    public int embeddingIndexingType_;
    public int quantizationType_;

    static {
        ltx ltxVar = new ltx();
        DEFAULT_INSTANCE = ltxVar;
        lxt.E(ltx.class, ltxVar);
    }

    private ltx() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "embeddingIndexingType_", ltw.a, "quantizationType_", ltw.c});
        }
        if (i2 == 3) {
            return new ltx();
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
