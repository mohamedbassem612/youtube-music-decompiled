package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lum extends lxt implements lyq {
    public static final int AGGREGATION_SCORING_STRATEGY_FIELD_NUMBER = 5;
    public static final int CHILD_PROPERTY_EXPRESSION_FIELD_NUMBER = 3;
    public static final lum DEFAULT_INSTANCE;
    public static final int MAX_JOINED_CHILD_COUNT_FIELD_NUMBER = 4;
    public static final int NESTED_SPEC_FIELD_NUMBER = 1;
    public static final int PARENT_PROPERTY_EXPRESSION_FIELD_NUMBER = 2;
    private static volatile lyu PARSER;
    public int aggregationScoringStrategy_;
    public int bitField0_;
    private int maxJoinedChildCount_;
    public lul nestedSpec_;
    public String parentPropertyExpression_ = "";
    public String childPropertyExpression_ = "";

    static {
        lum lumVar = new lum();
        DEFAULT_INSTANCE = lumVar;
        lxt.E(lum.class, lumVar);
    }

    private lum() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "nestedSpec_", "parentPropertyExpression_", "childPropertyExpression_", "maxJoinedChildCount_", "aggregationScoringStrategy_", ltw.i});
        }
        if (i2 == 3) {
            return new lum();
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
