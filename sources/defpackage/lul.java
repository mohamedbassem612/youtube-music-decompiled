package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lul extends lxt implements lyq {
    public static final lul DEFAULT_INSTANCE;
    private static volatile lyu PARSER = null;
    public static final int RESULT_SPEC_FIELD_NUMBER = 3;
    public static final int SCORING_SPEC_FIELD_NUMBER = 2;
    public static final int SEARCH_SPEC_FIELD_NUMBER = 1;
    public int bitField0_;
    public lvl resultSpec_;
    public lvt scoringSpec_;
    public lvx searchSpec_;

    static {
        lul lulVar = new lul();
        DEFAULT_INSTANCE = lulVar;
        lxt.E(lul.class, lulVar);
    }

    private lul() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "searchSpec_", "scoringSpec_", "resultSpec_"});
        }
        if (i2 == 3) {
            return new lul();
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
