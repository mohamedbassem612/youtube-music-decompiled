package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luj extends lxt implements lyq {
    public static final int AFTER_LAST_FLUSH_FULL_CALL_TYPES_FIELD_NUMBER = 22;
    public static final int AFTER_LAST_FLUSH_LITE_CALL_TYPES_FIELD_NUMBER = 24;
    public static final int AFTER_LAST_FLUSH_RECOVERY_PROOF_CALL_TYPES_FIELD_NUMBER = 23;
    public static final luj DEFAULT_INSTANCE;
    public static final int DOCUMENT_STORE_DATA_STATUS_FIELD_NUMBER = 8;
    public static final int DOCUMENT_STORE_RECOVERY_CAUSE_FIELD_NUMBER = 2;
    public static final int DOCUMENT_STORE_RECOVERY_LATENCY_MS_FIELD_NUMBER = 5;
    public static final int EMBEDDING_INDEX_RESTORATION_CAUSE_FIELD_NUMBER = 14;
    public static final int FAILURE_STAGE_FIELD_NUMBER = 17;
    public static final int ICU_NORMALIZER_CREATION_STATUS_FIELD_NUMBER = 19;
    public static final int ICU_SEGMENTER_CREATION_STATUS_FIELD_NUMBER = 18;
    public static final int INDEX_RESTORATION_CAUSE_FIELD_NUMBER = 3;
    public static final int INDEX_RESTORATION_LATENCY_MS_FIELD_NUMBER = 6;
    public static final int INITIALIZE_ICU_DATA_STATUS_FIELD_NUMBER = 15;
    public static final int INTEGER_INDEX_RESTORATION_CAUSE_FIELD_NUMBER = 12;
    public static final int LAST_PERSIST_TO_DISK_TYPE_FIELD_NUMBER = 21;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    public static final int NEXT_EXPIRATION_TIMESTAMP_MS_FIELD_NUMBER = 20;
    public static final int NUM_DOCUMENTS_FIELD_NUMBER = 9;
    public static final int NUM_FAILED_REINDEXED_DOCUMENTS_FIELD_NUMBER = 16;
    public static final int NUM_PREVIOUS_INIT_FAILURES_FIELD_NUMBER = 11;
    public static final int NUM_SCHEMA_TYPES_FIELD_NUMBER = 10;
    private static volatile lyu PARSER = null;
    public static final int QUALIFIED_ID_JOIN_INDEX_RESTORATION_CAUSE_FIELD_NUMBER = 13;
    public static final int SCHEMA_PROTO_BYTE_SIZE_FIELD_NUMBER = 25;
    public static final int SCHEMA_STORE_RECOVERY_CAUSE_FIELD_NUMBER = 4;
    public static final int SCHEMA_STORE_RECOVERY_LATENCY_MS_FIELD_NUMBER = 7;
    private int afterLastFlushFullCallTypesMemoizedSerializedSize;
    public lya afterLastFlushFullCallTypes_;
    private int afterLastFlushLiteCallTypesMemoizedSerializedSize;
    public lya afterLastFlushLiteCallTypes_;
    private int afterLastFlushRecoveryProofCallTypesMemoizedSerializedSize;
    public lya afterLastFlushRecoveryProofCallTypes_;
    private int bitField0_;
    private int documentStoreDataStatus_;
    private int documentStoreRecoveryCause_;
    public int documentStoreRecoveryLatencyMs_;
    private int embeddingIndexRestorationCause_;
    public int failureStage_;
    public lwf icuNormalizerCreationStatus_;
    public lwf icuSegmenterCreationStatus_;
    private int indexRestorationCause_;
    public int indexRestorationLatencyMs_;
    public lwf initializeIcuDataStatus_;
    private int integerIndexRestorationCause_;
    public int lastPersistToDiskType_;
    public int latencyMs_;
    private long nextExpirationTimestampMs_;
    public int numDocuments_;
    public int numFailedReindexedDocuments_;
    public int numPreviousInitFailures_;
    public int numSchemaTypes_;
    private int qualifiedIdJoinIndexRestorationCause_;
    public long schemaProtoByteSize_;
    private int schemaStoreRecoveryCause_;
    public int schemaStoreRecoveryLatencyMs_;
    public static final lyb afterLastFlushFullCallTypes_converter_ = new lui(1);
    public static final lyb afterLastFlushRecoveryProofCallTypes_converter_ = new lui(0);
    public static final lyb afterLastFlushLiteCallTypes_converter_ = new lui(2);

    static {
        luj lujVar = new luj();
        DEFAULT_INSTANCE = lujVar;
        lxt.E(luj.class, lujVar);
    }

    private luj() {
        lxu lxuVar = lxu.a;
        this.afterLastFlushFullCallTypes_ = lxuVar;
        this.afterLastFlushRecoveryProofCallTypes_ = lxuVar;
        this.afterLastFlushLiteCallTypes_ = lxuVar;
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            lxy lxyVar = ltw.g;
            lxy lxyVar2 = ltw.d;
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0003\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\b᠌\u0007\tင\b\nင\t\u000bင\n\f᠌\u000b\r᠌\f\u000e᠌\r\u000fဉ\u000e\u0010င\u000f\u0011᠌\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဂ\u0013\u0015᠌\u0014\u0016ࠬ\u0017ࠬ\u0018ࠬ\u0019ဂ\u0015", new Object[]{"bitField0_", "latencyMs_", "documentStoreRecoveryCause_", lxyVar, "indexRestorationCause_", lxyVar, "schemaStoreRecoveryCause_", lxyVar, "documentStoreRecoveryLatencyMs_", "indexRestorationLatencyMs_", "schemaStoreRecoveryLatencyMs_", "documentStoreDataStatus_", ltw.e, "numDocuments_", "numSchemaTypes_", "numPreviousInitFailures_", "integerIndexRestorationCause_", lxyVar, "qualifiedIdJoinIndexRestorationCause_", lxyVar, "embeddingIndexRestorationCause_", lxyVar, "initializeIcuDataStatus_", "numFailedReindexedDocuments_", "failureStage_", ltw.f, "icuSegmenterCreationStatus_", "icuNormalizerCreationStatus_", "nextExpirationTimestampMs_", "lastPersistToDiskType_", ltw.m, "afterLastFlushFullCallTypes_", lxyVar2, "afterLastFlushRecoveryProofCallTypes_", lxyVar2, "afterLastFlushLiteCallTypes_", lxyVar2, "schemaProtoByteSize_"});
        }
        if (i2 == 3) {
            return new luj();
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
        int iAS = a.aS(this.documentStoreDataStatus_);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    public final int c() {
        int iB = CommonApis.b(this.documentStoreRecoveryCause_);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final int d() {
        int iB = CommonApis.b(this.embeddingIndexRestorationCause_);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final int e() {
        int iB = CommonApis.b(this.indexRestorationCause_);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final int f() {
        int iB = CommonApis.b(this.integerIndexRestorationCause_);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final int g() {
        int iB = CommonApis.b(this.qualifiedIdJoinIndexRestorationCause_);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final int h() {
        int iB = CommonApis.b(this.schemaStoreRecoveryCause_);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }
}
