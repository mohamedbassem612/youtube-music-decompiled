package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luk extends lxt implements lyq {
    public static final luk DEFAULT_INSTANCE;
    public static final int NUMERIC_MATCH_TYPE_FIELD_NUMBER = 1;
    private static volatile lyu PARSER;
    public int bitField0_;
    public int numericMatchType_;

    static {
        luk lukVar = new luk();
        DEFAULT_INSTANCE = lukVar;
        lxt.E(luk.class, lukVar);
    }

    private luk() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "numericMatchType_", ltw.h});
        }
        if (i2 == 3) {
            return new luk();
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
