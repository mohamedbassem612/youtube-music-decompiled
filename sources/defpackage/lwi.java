package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwi extends lxt implements lyq {
    public static final lwi DEFAULT_INSTANCE;
    private static volatile lyu PARSER = null;
    public static final int TERM_MATCH_TYPE_FIELD_NUMBER = 1;
    public static final int TOKENIZER_TYPE_FIELD_NUMBER = 2;
    public int bitField0_;
    public int termMatchType_;
    public int tokenizerType_;

    static {
        lwi lwiVar = new lwi();
        DEFAULT_INSTANCE = lwiVar;
        lxt.E(lwi.class, lwiVar);
    }

    private lwi() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "termMatchType_", lwe.d, "tokenizerType_", lwe.c});
        }
        if (i2 == 3) {
            return new lwi();
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
