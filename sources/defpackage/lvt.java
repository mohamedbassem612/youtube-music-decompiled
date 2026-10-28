package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvt extends lxt implements lyq {
    public static final int ADDITIONAL_ADVANCED_SCORING_EXPRESSIONS_FIELD_NUMBER = 5;
    public static final int ADVANCED_SCORING_EXPRESSION_FIELD_NUMBER = 4;
    public static final lvt DEFAULT_INSTANCE;
    public static final int ORDER_BY_FIELD_NUMBER = 2;
    private static volatile lyu PARSER = null;
    public static final int RANK_BY_FIELD_NUMBER = 1;
    public static final int SCHEMA_TYPE_ALIAS_MAP_PROTOS_FIELD_NUMBER = 6;
    public static final int SCORING_FEATURE_TYPES_ENABLED_FIELD_NUMBER = 7;
    public static final int TYPE_PROPERTY_WEIGHTS_FIELD_NUMBER = 3;
    private static final lyb scoringFeatureTypesEnabled_converter_ = new lui(3);
    public lye additionalAdvancedScoringExpressions_;
    public String advancedScoringExpression_;
    public int bitField0_;
    public int orderBy_;
    public int rankBy_;
    public lye schemaTypeAliasMapProtos_;
    private int scoringFeatureTypesEnabledMemoizedSerializedSize;
    public lya scoringFeatureTypesEnabled_;
    public lye typePropertyWeights_;

    static {
        lvt lvtVar = new lvt();
        DEFAULT_INSTANCE = lvtVar;
        lxt.E(lvt.class, lvtVar);
    }

    private lvt() {
        lyx lyxVar = lyx.a;
        this.typePropertyWeights_ = lyxVar;
        this.advancedScoringExpression_ = "";
        this.additionalAdvancedScoringExpressions_ = lyxVar;
        this.schemaTypeAliasMapProtos_ = lyxVar;
        this.scoringFeatureTypesEnabled_ = lxu.a;
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004ဈ\u0002\u0005\u001a\u0006\u001b\u0007ࠬ", new Object[]{"bitField0_", "rankBy_", ltw.u, "orderBy_", ltw.t, "typePropertyWeights_", lwl.class, "advancedScoringExpression_", "additionalAdvancedScoringExpressions_", "schemaTypeAliasMapProtos_", lvo.class, "scoringFeatureTypesEnabled_", ltw.s});
        }
        if (i2 == 3) {
            return new lvt();
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
