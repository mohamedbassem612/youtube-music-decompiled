package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvz extends lxt implements lyq {
    public static final lvz DEFAULT_INSTANCE;
    public static final int DELETED_DOCUMENT_COUNT_FIELD_NUMBER = 9;
    public static final int DELETED_SCHEMA_TYPES_FIELD_NUMBER = 2;
    public static final int FULLY_COMPATIBLE_CHANGED_SCHEMA_TYPES_FIELD_NUMBER = 5;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 10;
    public static final int HAS_EMBEDDING_INDEX_RESTORED_FIELD_NUMBER = 15;
    public static final int HAS_INTEGER_INDEX_RESTORED_FIELD_NUMBER = 14;
    public static final int HAS_QUALIFIED_ID_JOIN_INDEX_RESTORED_FIELD_NUMBER = 16;
    public static final int HAS_TERM_INDEX_RESTORED_FIELD_NUMBER = 13;
    public static final int INCOMPATIBLE_SCHEMA_TYPES_FIELD_NUMBER = 3;
    public static final int INDEX_INCOMPATIBLE_CHANGED_SCHEMA_TYPES_FIELD_NUMBER = 6;
    public static final int JOIN_INCOMPATIBLE_CHANGED_SCHEMA_TYPES_FIELD_NUMBER = 8;
    public static final int LATENCY_MS_FIELD_NUMBER = 7;
    public static final int NEEDS_PERSIST_TYPE_FIELD_NUMBER = 17;
    public static final int NEW_SCHEMA_TYPES_FIELD_NUMBER = 4;
    private static volatile lyu PARSER = null;
    public static final int REQUEST_BYTES_FIELD_NUMBER = 19;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 20;
    public static final int SCORABLE_PROPERTY_INCOMPATIBLE_CHANGED_SCHEMA_TYPES_FIELD_NUMBER = 11;
    public static final int SET_SCHEMA_STATS_FIELD_NUMBER = 12;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 18;
    public int bitField0_;
    public int deletedDocumentCount_;
    public lye deletedSchemaTypes_;
    public lye fullyCompatibleChangedSchemaTypes_;
    public int getVmLatencyMs_;
    public boolean hasEmbeddingIndexRestored_;
    public boolean hasIntegerIndexRestored_;
    public boolean hasQualifiedIdJoinIndexRestored_;
    public boolean hasTermIndexRestored_;
    public lye incompatibleSchemaTypes_;
    public lye indexIncompatibleChangedSchemaTypes_;
    public lye joinIncompatibleChangedSchemaTypes_;
    private int latencyMs_;
    private int needsPersistType_;
    public lye newSchemaTypes_;
    public int requestBytes_;
    public int responseBytes_;
    private lye scorablePropertyIncompatibleChangedSchemaTypes_;
    private lwa setSchemaStats_;
    public lwf status_;
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        lvz lvzVar = new lvz();
        DEFAULT_INSTANCE = lvzVar;
        lxt.E(lvz.class, lvzVar);
    }

    private lvz() {
        lyx lyxVar = lyx.a;
        this.deletedSchemaTypes_ = lyxVar;
        this.incompatibleSchemaTypes_ = lyxVar;
        this.newSchemaTypes_ = lyxVar;
        this.fullyCompatibleChangedSchemaTypes_ = lyxVar;
        this.indexIncompatibleChangedSchemaTypes_ = lyxVar;
        this.joinIncompatibleChangedSchemaTypes_ = lyxVar;
        this.scorablePropertyIncompatibleChangedSchemaTypes_ = lyxVar;
    }

    public static lxq h() {
        return DEFAULT_INSTANCE.s();
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0007\u0000\u0001ဉ\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0006\u001a\u0007င\u0001\b\u001a\tင\u0002\nင\u0003\u000b\u001a\fဉ\u0004\rဇ\u0005\u000eဇ\u0006\u000fဇ\u0007\u0010ဇ\b\u0011᠌\t\u0012ဂ\n\u0013င\u000b\u0014င\f", new Object[]{"bitField0_", "status_", "deletedSchemaTypes_", "incompatibleSchemaTypes_", "newSchemaTypes_", "fullyCompatibleChangedSchemaTypes_", "indexIncompatibleChangedSchemaTypes_", "latencyMs_", "joinIncompatibleChangedSchemaTypes_", "deletedDocumentCount_", "getVmLatencyMs_", "scorablePropertyIncompatibleChangedSchemaTypes_", "setSchemaStats_", "hasTermIndexRestored_", "hasIntegerIndexRestored_", "hasEmbeddingIndexRestored_", "hasQualifiedIdJoinIndexRestored_", "needsPersistType_", ltw.m, "vmBinderTransactionLatencyStartTimeMs_", "requestBytes_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new lvz();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final int b() {
        return this.deletedSchemaTypes_.size();
    }

    public final int c() {
        return this.incompatibleSchemaTypes_.size();
    }

    public final int d() {
        return this.newSchemaTypes_.size();
    }

    public final int e() {
        return this.scorablePropertyIncompatibleChangedSchemaTypes_.size();
    }

    public final lwa f() {
        lwa lwaVar = this.setSchemaStats_;
        return lwaVar == null ? lwa.DEFAULT_INSTANCE : lwaVar;
    }

    public final lwf g() {
        lwf lwfVar = this.status_;
        return lwfVar == null ? lwf.DEFAULT_INSTANCE : lwfVar;
    }
}
