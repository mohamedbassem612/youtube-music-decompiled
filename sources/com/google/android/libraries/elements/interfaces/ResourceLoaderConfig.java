package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceLoaderConfig {
    final String bytesPath;
    final Long cacheCap;
    final Long cacheExpirationBuffer;
    final Long cachePurgeBytes;
    final Boolean compressSrsDiskCache;
    final Boolean diskCacheGranularEvictOnError;
    final EmlMobserveConfigRecord emlMobserveConfigRecord;
    final Boolean enableAlreadyProcessedFix;
    final Boolean enableDedupDiskCacheWithMobserve;
    final Boolean enableEnsureProcessedShortCircuit;
    final Boolean enableExperimentalMetadataTracking;
    final Boolean enableFasterMissingResourcesCheck;
    final Boolean enableLocksEliminationInMobserve;
    final Boolean enableLocksEliminationInReadResources;
    final Boolean enableLruPurge;
    final Boolean enableLruPurgeKillSwitch;
    final Boolean enableModernConfigForDiskCache;
    final Boolean enablePackedResourceTags;
    final Boolean enablePreemptiveLruPurge;
    final Boolean enableReduceLockScopeInAddResourcesToBatch;
    final Boolean enableReleaseLockBeforeReadInCacheManager;
    final Boolean enableResourceRouterErrorParity;
    final Boolean enableRouterV2;
    final Boolean enableRouterV2ForDiskCache;
    final Boolean enableSuppressSubsequentCertErrors;
    final Boolean enableVersionMaps;
    final Boolean forceFullyProcessed;
    final Boolean loadWasmInEkoLoader;
    final Integer maxBuildLabels;
    final Integer maxDiskCacheTags;
    final Integer maxTags;
    final String metadataPath;
    final Long preemptiveLruPurgeThresholdBytes;
    final Boolean resourceLoaderHashAllJsModules;

    public ResourceLoaderConfig(Integer num, Integer num2, String str, String str2, Long l, Long l2, Boolean bool, Long l3, Boolean bool2, Boolean bool3, Long l4, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, EmlMobserveConfigRecord emlMobserveConfigRecord, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Integer num3, Boolean bool23, Boolean bool24) {
        this.maxTags = num;
        this.maxBuildLabels = num2;
        this.bytesPath = str;
        this.metadataPath = str2;
        this.cacheCap = l;
        this.cacheExpirationBuffer = l2;
        this.enableLruPurge = bool;
        this.cachePurgeBytes = l3;
        this.enableLruPurgeKillSwitch = bool2;
        this.enablePreemptiveLruPurge = bool3;
        this.preemptiveLruPurgeThresholdBytes = l4;
        this.diskCacheGranularEvictOnError = bool4;
        this.compressSrsDiskCache = bool5;
        this.enableAlreadyProcessedFix = bool6;
        this.enableEnsureProcessedShortCircuit = bool7;
        this.enablePackedResourceTags = bool8;
        this.enableFasterMissingResourcesCheck = bool9;
        this.enableExperimentalMetadataTracking = bool10;
        this.emlMobserveConfigRecord = emlMobserveConfigRecord;
        this.loadWasmInEkoLoader = bool11;
        this.forceFullyProcessed = bool12;
        this.enableSuppressSubsequentCertErrors = bool13;
        this.enableDedupDiskCacheWithMobserve = bool14;
        this.enableRouterV2 = bool15;
        this.enableRouterV2ForDiskCache = bool16;
        this.enableResourceRouterErrorParity = bool17;
        this.enableReduceLockScopeInAddResourcesToBatch = bool18;
        this.enableLocksEliminationInReadResources = bool19;
        this.enableReleaseLockBeforeReadInCacheManager = bool20;
        this.enableModernConfigForDiskCache = bool21;
        this.enableLocksEliminationInMobserve = bool22;
        this.maxDiskCacheTags = num3;
        this.resourceLoaderHashAllJsModules = bool23;
        this.enableVersionMaps = bool24;
    }

    public String getBytesPath() {
        return this.bytesPath;
    }

    public Long getCacheCap() {
        return this.cacheCap;
    }

    public Long getCacheExpirationBuffer() {
        return this.cacheExpirationBuffer;
    }

    public Long getCachePurgeBytes() {
        return this.cachePurgeBytes;
    }

    public Boolean getCompressSrsDiskCache() {
        return this.compressSrsDiskCache;
    }

    public Boolean getDiskCacheGranularEvictOnError() {
        return this.diskCacheGranularEvictOnError;
    }

    public EmlMobserveConfigRecord getEmlMobserveConfigRecord() {
        return this.emlMobserveConfigRecord;
    }

    public Boolean getEnableAlreadyProcessedFix() {
        return this.enableAlreadyProcessedFix;
    }

    public Boolean getEnableDedupDiskCacheWithMobserve() {
        return this.enableDedupDiskCacheWithMobserve;
    }

    public Boolean getEnableEnsureProcessedShortCircuit() {
        return this.enableEnsureProcessedShortCircuit;
    }

    public Boolean getEnableExperimentalMetadataTracking() {
        return this.enableExperimentalMetadataTracking;
    }

    public Boolean getEnableFasterMissingResourcesCheck() {
        return this.enableFasterMissingResourcesCheck;
    }

    public Boolean getEnableLocksEliminationInMobserve() {
        return this.enableLocksEliminationInMobserve;
    }

    public Boolean getEnableLocksEliminationInReadResources() {
        return this.enableLocksEliminationInReadResources;
    }

    public Boolean getEnableLruPurge() {
        return this.enableLruPurge;
    }

    public Boolean getEnableLruPurgeKillSwitch() {
        return this.enableLruPurgeKillSwitch;
    }

    public Boolean getEnableModernConfigForDiskCache() {
        return this.enableModernConfigForDiskCache;
    }

    public Boolean getEnablePackedResourceTags() {
        return this.enablePackedResourceTags;
    }

    public Boolean getEnablePreemptiveLruPurge() {
        return this.enablePreemptiveLruPurge;
    }

    public Boolean getEnableReduceLockScopeInAddResourcesToBatch() {
        return this.enableReduceLockScopeInAddResourcesToBatch;
    }

    public Boolean getEnableReleaseLockBeforeReadInCacheManager() {
        return this.enableReleaseLockBeforeReadInCacheManager;
    }

    public Boolean getEnableResourceRouterErrorParity() {
        return this.enableResourceRouterErrorParity;
    }

    public Boolean getEnableRouterV2() {
        return this.enableRouterV2;
    }

    public Boolean getEnableRouterV2ForDiskCache() {
        return this.enableRouterV2ForDiskCache;
    }

    public Boolean getEnableSuppressSubsequentCertErrors() {
        return this.enableSuppressSubsequentCertErrors;
    }

    public Boolean getEnableVersionMaps() {
        return this.enableVersionMaps;
    }

    public Boolean getForceFullyProcessed() {
        return this.forceFullyProcessed;
    }

    public Boolean getLoadWasmInEkoLoader() {
        return this.loadWasmInEkoLoader;
    }

    public Integer getMaxBuildLabels() {
        return this.maxBuildLabels;
    }

    public Integer getMaxDiskCacheTags() {
        return this.maxDiskCacheTags;
    }

    public Integer getMaxTags() {
        return this.maxTags;
    }

    public String getMetadataPath() {
        return this.metadataPath;
    }

    public Long getPreemptiveLruPurgeThresholdBytes() {
        return this.preemptiveLruPurgeThresholdBytes;
    }

    public Boolean getResourceLoaderHashAllJsModules() {
        return this.resourceLoaderHashAllJsModules;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.emlMobserveConfigRecord);
        StringBuilder sb = new StringBuilder("ResourceLoaderConfig{maxTags=");
        sb.append(this.maxTags);
        sb.append(",maxBuildLabels=");
        sb.append(this.maxBuildLabels);
        sb.append(",bytesPath=");
        sb.append(this.bytesPath);
        sb.append(",metadataPath=");
        sb.append(this.metadataPath);
        sb.append(",cacheCap=");
        sb.append(this.cacheCap);
        sb.append(",cacheExpirationBuffer=");
        sb.append(this.cacheExpirationBuffer);
        sb.append(",enableLruPurge=");
        sb.append(this.enableLruPurge);
        sb.append(",cachePurgeBytes=");
        sb.append(this.cachePurgeBytes);
        sb.append(",enableLruPurgeKillSwitch=");
        sb.append(this.enableLruPurgeKillSwitch);
        sb.append(",enablePreemptiveLruPurge=");
        sb.append(this.enablePreemptiveLruPurge);
        sb.append(",preemptiveLruPurgeThresholdBytes=");
        sb.append(this.preemptiveLruPurgeThresholdBytes);
        sb.append(",diskCacheGranularEvictOnError=");
        sb.append(this.diskCacheGranularEvictOnError);
        sb.append(",compressSrsDiskCache=");
        sb.append(this.compressSrsDiskCache);
        sb.append(",enableAlreadyProcessedFix=");
        sb.append(this.enableAlreadyProcessedFix);
        sb.append(",enableEnsureProcessedShortCircuit=");
        sb.append(this.enableEnsureProcessedShortCircuit);
        sb.append(",enablePackedResourceTags=");
        sb.append(this.enablePackedResourceTags);
        sb.append(",enableFasterMissingResourcesCheck=");
        sb.append(this.enableFasterMissingResourcesCheck);
        sb.append(",enableExperimentalMetadataTracking=");
        sb.append(this.enableExperimentalMetadataTracking);
        sb.append(",emlMobserveConfigRecord=");
        sb.append(strValueOf);
        sb.append(",loadWasmInEkoLoader=");
        sb.append(this.loadWasmInEkoLoader);
        sb.append(",forceFullyProcessed=");
        sb.append(this.forceFullyProcessed);
        Boolean bool = this.enableVersionMaps;
        Boolean bool2 = this.resourceLoaderHashAllJsModules;
        Integer num = this.maxDiskCacheTags;
        Boolean bool3 = this.enableLocksEliminationInMobserve;
        Boolean bool4 = this.enableModernConfigForDiskCache;
        Boolean bool5 = this.enableReleaseLockBeforeReadInCacheManager;
        Boolean bool6 = this.enableLocksEliminationInReadResources;
        Boolean bool7 = this.enableReduceLockScopeInAddResourcesToBatch;
        Boolean bool8 = this.enableResourceRouterErrorParity;
        Boolean bool9 = this.enableRouterV2ForDiskCache;
        Boolean bool10 = this.enableRouterV2;
        Boolean bool11 = this.enableDedupDiskCacheWithMobserve;
        Boolean bool12 = this.enableSuppressSubsequentCertErrors;
        sb.append(",enableSuppressSubsequentCertErrors=");
        sb.append(bool12);
        sb.append(",enableDedupDiskCacheWithMobserve=");
        sb.append(bool11);
        sb.append(",enableRouterV2=");
        sb.append(bool10);
        sb.append(",enableRouterV2ForDiskCache=");
        sb.append(bool9);
        sb.append(",enableResourceRouterErrorParity=");
        sb.append(bool8);
        sb.append(",enableReduceLockScopeInAddResourcesToBatch=");
        sb.append(bool7);
        sb.append(",enableLocksEliminationInReadResources=");
        sb.append(bool6);
        sb.append(",enableReleaseLockBeforeReadInCacheManager=");
        sb.append(bool5);
        sb.append(",enableModernConfigForDiskCache=");
        sb.append(bool4);
        sb.append(",enableLocksEliminationInMobserve=");
        sb.append(bool3);
        sb.append(",maxDiskCacheTags=");
        sb.append(num);
        sb.append(",resourceLoaderHashAllJsModules=");
        sb.append(bool2);
        sb.append(",enableVersionMaps=");
        sb.append(bool);
        sb.append('}');
        return sb.toString();
    }
}
