package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lts extends lxt implements lyq {
    public static final lts DEFAULT_INSTANCE;
    public static final int LENGTH_IN_TOKENS_FIELD_NUMBER = 1;
    private static volatile lyu PARSER;
    private int bitField0_;
    private int lengthInTokens_;

    static {
        lts ltsVar = new lts();
        DEFAULT_INSTANCE = ltsVar;
        lxt.E(lts.class, ltsVar);
    }

    private lts() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "lengthInTokens_"});
        }
        if (i2 == 3) {
            return new lts();
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
