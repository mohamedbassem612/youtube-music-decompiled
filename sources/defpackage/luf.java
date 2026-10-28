package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luf extends lxt implements lyq {
    public static final int ALLOW_CIRCULAR_SCHEMA_DEFINITIONS_FIELD_NUMBER = 8;
    public static final int AUTO_FLUSH_FIELD_NUMBER = 58;
    public static final int BASE_DIR_FIELD_NUMBER = 1;
    public static final int BLOB_STORE_COMPRESSION_LEVEL_FIELD_NUMBER = 23;
    public static final int BLOB_STORE_COMPRESSION_MEM_LEVEL_FIELD_NUMBER = 38;
    public static final int BUILD_PROPERTY_EXISTENCE_METADATA_HITS_FIELD_NUMBER = 15;
    public static final int CALCULATE_TIME_SINCE_LAST_ATTEMPTED_OPTIMIZE_FIELD_NUMBER = 28;
    public static final int COMPRESSION_LEVEL_FIELD_NUMBER = 7;
    public static final int COMPRESSION_MEM_LEVEL_FIELD_NUMBER = 37;
    public static final int COMPRESSION_THRESHOLD_BYTES_FIELD_NUMBER = 36;
    public static final luf DEFAULT_INSTANCE;
    public static final int DOCUMENT_STORE_NAMESPACE_ID_FINGERPRINT_FIELD_NUMBER = 5;
    public static final int EMBEDDING_INDEX_NUM_SHARDS_FIELD_NUMBER = 46;
    public static final int ENABLE_ACCOUNT_PROPERTY_INCOMPATIBILITY_CHECK_FIELD_NUMBER = 56;
    public static final int ENABLE_BACKGROUND_TASK_SCHEDULER_FIELD_NUMBER = 51;
    public static final int ENABLE_BLOB_STORE_FIELD_NUMBER = 16;
    public static final int ENABLE_DATABASE_STABLENESS_LOG_FIELD_NUMBER = 54;
    public static final int ENABLE_DELETE_PROPAGATION_FROM_FIELD_NUMBER = 30;
    public static final int ENABLE_EIGEN_EMBEDDING_SCORING_FIELD_NUMBER = 40;
    public static final int ENABLE_EMBEDDING_BACKUP_GENERATION_FIELD_NUMBER = 27;
    public static final int ENABLE_EMBEDDING_INDEX_FIELD_NUMBER = 19;
    public static final int ENABLE_EMBEDDING_ITERATOR_V2_FIELD_NUMBER = 43;
    public static final int ENABLE_EMBEDDING_QUANTIZATION_FIELD_NUMBER = 22;
    public static final int ENABLE_EMBED_QUERY_OPTIMIZATION_FIELD_NUMBER = 52;
    public static final int ENABLE_FINE_GRAINED_INDEX_REBUILD_FIELD_NUMBER = 60;
    public static final int ENABLE_INDEX_RESTORATION_CRITICAL_ERROR_HANDLING_FIX_FIELD_NUMBER = 63;
    public static final int ENABLE_MANUAL_PERSIST_TO_DISK_FIELD_NUMBER = 55;
    public static final int ENABLE_MARKER_FILE_FOR_OPTIMIZE_FIELD_NUMBER = 32;
    public static final int ENABLE_NON_EXISTENT_QUALIFIED_ID_JOIN_FIELD_NUMBER = 49;
    public static final int ENABLE_OPTIMIZE_IMPROVEMENTS_FIELD_NUMBER = 47;
    public static final int ENABLE_OPTIMIZE_RESULT_STATES_FIELD_NUMBER = 62;
    public static final int ENABLE_PASSING_FILTER_TO_CHILDREN_FIELD_NUMBER = 41;
    public static final int ENABLE_PROTO_LOG_NEW_HEADER_FORMAT_FIELD_NUMBER = 42;
    public static final int ENABLE_QUALIFIED_ID_JOIN_INDEX_V3_FIELD_NUMBER = 29;
    public static final int ENABLE_READ_DURING_ANN_MAINTENANCE_FIELD_NUMBER = 61;
    public static final int ENABLE_REPEATED_FIELD_JOINS_FIELD_NUMBER = 24;
    public static final int ENABLE_REUSABLE_DECOMPRESSION_BUFFER_FIELD_NUMBER = 44;
    public static final int ENABLE_SCHEMA_DATABASE_FIELD_NUMBER = 18;
    public static final int ENABLE_SCHEMA_DEFINITION_DEDUPING_FIELD_NUMBER = 53;
    public static final int ENABLE_SCHEMA_TYPE_ID_OPTIMIZATION_FIELD_NUMBER = 45;
    public static final int ENABLE_SCORABLE_PROPERTIES_FIELD_NUMBER = 21;
    public static final int ENABLE_SKIP_SET_SCHEMA_TYPE_EQUALITY_CHECK_FIELD_NUMBER = 50;
    public static final int ENABLE_SMALLER_DECOMPRESSION_BUFFER_SIZE_FIELD_NUMBER = 39;
    public static final int ENABLE_SOFT_INDEX_RESTORATION_FIELD_NUMBER = 31;
    public static final int ENABLE_STRICT_PAGE_BYTE_SIZE_LIMIT_FIELD_NUMBER = 35;
    public static final int EXPIRED_DOCUMENT_PURGE_THRESHOLD_MS_FIELD_NUMBER = 48;
    public static final int ICU_DATA_FILE_ABSOLUTE_PATH_FIELD_NUMBER = 26;
    public static final int INDEX_MERGE_SIZE_FIELD_NUMBER = 4;
    public static final int INTEGER_INDEX_BUCKET_SPLIT_THRESHOLD_FIELD_NUMBER = 11;
    public static final int LITE_INDEX_SORT_AT_INDEXING_FIELD_NUMBER = 12;
    public static final int LITE_INDEX_SORT_SIZE_FIELD_NUMBER = 13;
    public static final int MANAGE_BLOB_FILES_FIELD_NUMBER = 33;
    public static final int MAX_TOKEN_LENGTH_FIELD_NUMBER = 3;
    public static final int OPTIMIZE_REBUILD_INDEX_THRESHOLD_FIELD_NUMBER = 6;
    public static final int ORPHAN_BLOB_TIME_TO_LIVE_MS_FIELD_NUMBER = 17;
    private static volatile lyu PARSER = null;
    public static final int PRE_MAPPING_FBV_FIELD_NUMBER = 9;
    public static final int RELEASE_BACKUP_SCHEMA_FILE_IF_OVERLAY_PRESENT_FIELD_NUMBER = 34;
    public static final int REMOVE_SCHEMA_STORE_MOVE_ASSIGNMENT_FIELD_NUMBER = 59;
    public static final int SCHEMA_STORE_RELEASE_CACHED_PROTO_AFTER_USE_FIELD_NUMBER = 57;
    public static final int USE_NEW_QUALIFIED_ID_JOIN_INDEX_FIELD_NUMBER = 14;
    public static final int USE_PERSISTENT_HASH_MAP_FIELD_NUMBER = 10;
    public boolean allowCircularSchemaDefinitions_;
    private boolean autoFlush_;
    public int bitField0_;
    public int bitField1_;
    public int compressionThresholdBytes_;
    public boolean enableAccountPropertyIncompatibilityCheck_;
    public boolean enableBackgroundTaskScheduler_;
    public boolean enableDatabaseStablenessLog_;
    public boolean enableDeletePropagationFrom_;
    private boolean enableEmbeddingBackupGeneration_;
    public boolean enableFineGrainedIndexRebuild_;
    public boolean enableIndexRestorationCriticalErrorHandlingFix_;
    private boolean enableManualPersistToDisk_;
    public boolean enableNonExistentQualifiedIdJoin_;
    public boolean enableOptimizeImprovements_;
    public boolean enableOptimizeResultStates_;
    public boolean enableReadDuringAnnMaintenance_;
    public boolean enableRepeatedFieldJoins_;
    public boolean enableSchemaDefinitionDeduping_;
    public boolean enableScorableProperties_;
    public boolean enableSkipSetSchemaTypeEqualityCheck_;
    public float optimizeRebuildIndexThreshold_;
    public long orphanBlobTimeToLiveMs_;
    public boolean preMappingFbv_;
    public boolean removeSchemaStoreMoveAssignment_;
    public boolean schemaStoreReleaseCachedProtoAfterUse_;
    public String baseDir_ = "";
    public int maxTokenLength_ = 30;
    public int indexMergeSize_ = 1048576;
    private boolean documentStoreNamespaceIdFingerprint_ = true;
    public int compressionLevel_ = 3;
    public int compressionMemLevel_ = 8;
    private boolean usePersistentHashMap_ = true;
    public int integerIndexBucketSplitThreshold_ = 65536;
    private boolean liteIndexSortAtIndexing_ = true;
    public int liteIndexSortSize_ = SemanticState.Multiline;
    private boolean useNewQualifiedIdJoinIndex_ = true;
    private boolean buildPropertyExistenceMetadataHits_ = true;
    private boolean enableBlobStore_ = true;
    private boolean enableSchemaDatabase_ = true;
    private boolean enableEmbeddingIndex_ = true;
    private boolean enableEmbeddingQuantization_ = true;
    private int blobStoreCompressionLevel_ = 3;
    private int blobStoreCompressionMemLevel_ = 8;
    public String icuDataFileAbsolutePath_ = "";
    private boolean calculateTimeSinceLastAttemptedOptimize_ = true;
    private boolean enableQualifiedIdJoinIndexV3_ = true;
    private boolean enableSoftIndexRestoration_ = true;
    private boolean enableMarkerFileForOptimize_ = true;
    public boolean manageBlobFiles_ = true;
    private boolean releaseBackupSchemaFileIfOverlayPresent_ = true;
    private boolean enableStrictPageByteSizeLimit_ = true;
    private boolean enableSmallerDecompressionBufferSize_ = true;
    private boolean enableEigenEmbeddingScoring_ = true;
    private boolean enablePassingFilterToChildren_ = true;
    private boolean enableProtoLogNewHeaderFormat_ = true;
    private boolean enableEmbeddingIteratorV2_ = true;
    private boolean enableReusableDecompressionBuffer_ = true;
    private boolean enableSchemaTypeIdOptimization_ = true;
    public int embeddingIndexNumShards_ = 1;
    public long expiredDocumentPurgeThresholdMs_ = 60000;
    private boolean enableEmbedQueryOptimization_ = true;

    static {
        luf lufVar = new luf();
        DEFAULT_INSTANCE = lufVar;
        lxt.E(luf.class, lufVar);
    }

    private luf() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001<\u0000\u0002\u0001?<\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0001\u0004င\u0002\u0005ဇ\u0003\u0006ခ\u0004\u0007င\u0005\bဇ\u0007\tဇ\b\nဇ\t\u000bင\n\fဇ\u000b\rင\f\u000eဇ\r\u000fဇ\u000e\u0010ဇ\u000f\u0011ဂ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0015ဇ\u0013\u0016ဇ\u0014\u0017င\u0015\u0018ဇ\u0017\u001aဈ\u0018\u001bဇ\u0019\u001cဇ\u001a\u001dဇ\u001b\u001eဇ\u001c\u001fဇ\u001d ဇ\u001e!ဇ\u001f\"ဇ #ဇ!$ဋ\"%င\u0006&င\u0016'ဇ#(ဇ$)ဇ%*ဇ&+ဇ',ဇ(-ဇ).ဋ*/ဇ+0ဂ,1ဇ-2ဇ.3ဇ/4ဇ05ဇ16ဇ27ဇ38ဇ49ဇ5:ဇ6;ဇ7<ဇ8=ဇ9>ဇ:?ဇ;", new Object[]{"bitField0_", "bitField1_", "baseDir_", "maxTokenLength_", "indexMergeSize_", "documentStoreNamespaceIdFingerprint_", "optimizeRebuildIndexThreshold_", "compressionLevel_", "allowCircularSchemaDefinitions_", "preMappingFbv_", "usePersistentHashMap_", "integerIndexBucketSplitThreshold_", "liteIndexSortAtIndexing_", "liteIndexSortSize_", "useNewQualifiedIdJoinIndex_", "buildPropertyExistenceMetadataHits_", "enableBlobStore_", "orphanBlobTimeToLiveMs_", "enableSchemaDatabase_", "enableEmbeddingIndex_", "enableScorableProperties_", "enableEmbeddingQuantization_", "blobStoreCompressionLevel_", "enableRepeatedFieldJoins_", "icuDataFileAbsolutePath_", "enableEmbeddingBackupGeneration_", "calculateTimeSinceLastAttemptedOptimize_", "enableQualifiedIdJoinIndexV3_", "enableDeletePropagationFrom_", "enableSoftIndexRestoration_", "enableMarkerFileForOptimize_", "manageBlobFiles_", "releaseBackupSchemaFileIfOverlayPresent_", "enableStrictPageByteSizeLimit_", "compressionThresholdBytes_", "compressionMemLevel_", "blobStoreCompressionMemLevel_", "enableSmallerDecompressionBufferSize_", "enableEigenEmbeddingScoring_", "enablePassingFilterToChildren_", "enableProtoLogNewHeaderFormat_", "enableEmbeddingIteratorV2_", "enableReusableDecompressionBuffer_", "enableSchemaTypeIdOptimization_", "embeddingIndexNumShards_", "enableOptimizeImprovements_", "expiredDocumentPurgeThresholdMs_", "enableNonExistentQualifiedIdJoin_", "enableSkipSetSchemaTypeEqualityCheck_", "enableBackgroundTaskScheduler_", "enableEmbedQueryOptimization_", "enableSchemaDefinitionDeduping_", "enableDatabaseStablenessLog_", "enableManualPersistToDisk_", "enableAccountPropertyIncompatibilityCheck_", "schemaStoreReleaseCachedProtoAfterUse_", "autoFlush_", "removeSchemaStoreMoveAssignment_", "enableFineGrainedIndexRebuild_", "enableReadDuringAnnMaintenance_", "enableOptimizeResultStates_", "enableIndexRestorationCriticalErrorHandlingFix_"});
        }
        if (i2 == 3) {
            return new luf();
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
