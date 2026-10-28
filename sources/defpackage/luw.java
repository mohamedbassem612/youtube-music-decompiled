package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luw extends lxt implements lyq {
    public static final int CARDINALITY_FIELD_NUMBER = 4;
    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    public static final luw DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 9;
    public static final int DOCUMENT_INDEXING_CONFIG_FIELD_NUMBER = 6;
    public static final int EMBEDDING_INDEXING_CONFIG_FIELD_NUMBER = 10;
    public static final int INTEGER_INDEXING_CONFIG_FIELD_NUMBER = 7;
    public static final int JOINABLE_CONFIG_FIELD_NUMBER = 8;
    private static volatile lyu PARSER = null;
    public static final int PROPERTY_NAME_FIELD_NUMBER = 1;
    public static final int SCHEMA_TYPE_FIELD_NUMBER = 3;
    public static final int SCORABLE_TYPE_FIELD_NUMBER = 11;
    public static final int STRING_INDEXING_CONFIG_FIELD_NUMBER = 5;
    public int bitField0_;
    public int cardinality_;
    public int dataType_;
    public ltr documentIndexingConfig_;
    public ltx embeddingIndexingConfig_;
    public luk integerIndexingConfig_;
    public lun joinableConfig_;
    public int scorableType_;
    public lwi stringIndexingConfig_;
    public String propertyName_ = "";
    public String description_ = "";
    public String schemaType_ = "";

    static {
        luw luwVar = new luw();
        DEFAULT_INSTANCE = luwVar;
        lxt.E(luw.class, luwVar);
    }

    private luw() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003ဈ\u0003\u0004᠌\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\tဈ\u0001\nဉ\t\u000b᠌\n", new Object[]{"bitField0_", "propertyName_", "dataType_", ltw.o, "schemaType_", "cardinality_", ltw.n, "stringIndexingConfig_", "documentIndexingConfig_", "integerIndexingConfig_", "joinableConfig_", "description_", "embeddingIndexingConfig_", "scorableType_", ltw.p});
        }
        if (i2 == 3) {
            return new luw();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final ltr b() {
        ltr ltrVar = this.documentIndexingConfig_;
        return ltrVar == null ? ltr.DEFAULT_INSTANCE : ltrVar;
    }

    public final ltx c() {
        ltx ltxVar = this.embeddingIndexingConfig_;
        return ltxVar == null ? ltx.DEFAULT_INSTANCE : ltxVar;
    }

    public final lun d() {
        lun lunVar = this.joinableConfig_;
        return lunVar == null ? lun.DEFAULT_INSTANCE : lunVar;
    }

    public final lwi e() {
        lwi lwiVar = this.stringIndexingConfig_;
        return lwiVar == null ? lwi.DEFAULT_INSTANCE : lwiVar;
    }

    public final int f() {
        int iAV = a.aV(this.cardinality_);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }

    public final int g() {
        int iBh = a.bh(this.dataType_);
        if (iBh == 0) {
            return 1;
        }
        return iBh;
    }

    public final int h() {
        int iAS = a.aS(this.scorableType_);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }
}
