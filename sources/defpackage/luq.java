package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luq extends lxt implements lyq {
    public static final luq DEFAULT_INSTANCE;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    public static final int NUM_ALIVE_DOCUMENTS_FIELD_NUMBER = 2;
    public static final int NUM_ALIVE_DOCUMENTS_USAGE_TYPE1_FIELD_NUMBER = 4;
    public static final int NUM_ALIVE_DOCUMENTS_USAGE_TYPE2_FIELD_NUMBER = 5;
    public static final int NUM_ALIVE_DOCUMENTS_USAGE_TYPE3_FIELD_NUMBER = 6;
    public static final int NUM_EXPIRED_DOCUMENTS_FIELD_NUMBER = 3;
    public static final int NUM_EXPIRED_DOCUMENTS_USAGE_TYPE1_FIELD_NUMBER = 7;
    public static final int NUM_EXPIRED_DOCUMENTS_USAGE_TYPE2_FIELD_NUMBER = 8;
    public static final int NUM_EXPIRED_DOCUMENTS_USAGE_TYPE3_FIELD_NUMBER = 9;
    private static volatile lyu PARSER;
    private int bitField0_;
    public String namespace_ = "";
    private int numAliveDocumentsUsageType1_;
    private int numAliveDocumentsUsageType2_;
    private int numAliveDocumentsUsageType3_;
    public int numAliveDocuments_;
    private int numExpiredDocumentsUsageType1_;
    private int numExpiredDocumentsUsageType2_;
    private int numExpiredDocumentsUsageType3_;
    public int numExpiredDocuments_;

    static {
        luq luqVar = new luq();
        DEFAULT_INSTANCE = luqVar;
        lxt.E(luq.class, luqVar);
    }

    private luq() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"bitField0_", "namespace_", "numAliveDocuments_", "numExpiredDocuments_", "numAliveDocumentsUsageType1_", "numAliveDocumentsUsageType2_", "numAliveDocumentsUsageType3_", "numExpiredDocumentsUsageType1_", "numExpiredDocumentsUsageType2_", "numExpiredDocumentsUsageType3_"});
        }
        if (i2 == 3) {
            return new luq();
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
