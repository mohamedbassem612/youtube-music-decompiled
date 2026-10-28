package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvu extends lxt implements lyq {
    public static final lvu DEFAULT_INSTANCE;
    public static final int EXECUTED_QUERY_FIELD_NUMBER = 3;
    private static volatile lyu PARSER;
    private int bitField0_;
    private String executedQuery_ = "";

    static {
        lvu lvuVar = new lvu();
        DEFAULT_INSTANCE = lvuVar;
        lxt.E(lvu.class, lvuVar);
    }

    private lvu() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{"bitField0_", "executedQuery_"});
        }
        if (i2 == 3) {
            return new lvu();
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
