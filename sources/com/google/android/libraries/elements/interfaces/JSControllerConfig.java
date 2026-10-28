package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class JSControllerConfig {
    public static final int DEFAULT_VM_CONTEXT_LRU_SIZE = 5;
    final boolean asyncCallingThreadDispose;
    final boolean blocksEnableSignalsCallbackDispatch;
    final int compiledModuleCacheSize;
    final int compiledModuleDiskCacheSize;
    final boolean controllerBackgroundDispose;
    final boolean controllerDisposeLifecycleFix;
    final int diskCacheAppVersion;
    final String diskCachePath;
    final boolean enableAsyncInit;
    final boolean enableControllerDisposalEarlyExit;
    final boolean enableControllerStateHolderDeadlockFix;
    final boolean enableMultiLanguageStackTraceError;
    final boolean enableSwapProtoKernel;
    final boolean enableThreadSafeControllerExecutor;
    final boolean enableVmContextLru;
    final boolean executeCommandCallbackDispatch;
    final boolean executeJsFunctionCommandAsync;
    final boolean executeJsFunctionCommandAsyncAllCalls;
    final String executorName;
    final String extraVmFlags;
    final long idleMessageMicroseconds;
    final boolean individualModuleLoading;
    final JSControllerInitializationMode initializationMode;
    final boolean jsClientErrorLoggerEnabled;
    final int jsEngineSelection;
    final byte[] platformDetails;
    final boolean pumpMessageLoop;
    final boolean runOnLoadModuleHookOnBackgroundThread;
    final boolean shouldLockVmIsolate;
    final boolean shouldUseDirectJsObjectCreation;
    final boolean useLogJsSpanBinding;
    final boolean useScopedCommandResolver;
    final int vmContextLruSize;

    public JSControllerConfig(JSControllerInitializationMode jSControllerInitializationMode, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, int i2, String str, byte[] bArr, boolean z6, int i3, int i4, String str2, int i5, boolean z7, String str3, boolean z8, long j, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22) {
        this.initializationMode = jSControllerInitializationMode;
        this.enableVmContextLru = z;
        this.vmContextLruSize = i;
        this.shouldLockVmIsolate = z2;
        this.shouldUseDirectJsObjectCreation = z3;
        this.runOnLoadModuleHookOnBackgroundThread = z4;
        this.jsClientErrorLoggerEnabled = z5;
        this.jsEngineSelection = i2;
        this.extraVmFlags = str;
        this.platformDetails = bArr;
        this.individualModuleLoading = z6;
        this.compiledModuleCacheSize = i3;
        this.compiledModuleDiskCacheSize = i4;
        this.diskCachePath = str2;
        this.diskCacheAppVersion = i5;
        this.useLogJsSpanBinding = z7;
        this.executorName = str3;
        this.pumpMessageLoop = z8;
        this.idleMessageMicroseconds = j;
        this.enableAsyncInit = z9;
        this.controllerDisposeLifecycleFix = z10;
        this.controllerBackgroundDispose = z11;
        this.enableMultiLanguageStackTraceError = z12;
        this.enableControllerDisposalEarlyExit = z13;
        this.enableSwapProtoKernel = z14;
        this.asyncCallingThreadDispose = z15;
        this.executeCommandCallbackDispatch = z16;
        this.executeJsFunctionCommandAsync = z17;
        this.executeJsFunctionCommandAsyncAllCalls = z18;
        this.blocksEnableSignalsCallbackDispatch = z19;
        this.enableThreadSafeControllerExecutor = z20;
        this.enableControllerStateHolderDeadlockFix = z21;
        this.useScopedCommandResolver = z22;
    }

    public boolean getAsyncCallingThreadDispose() {
        return this.asyncCallingThreadDispose;
    }

    public boolean getBlocksEnableSignalsCallbackDispatch() {
        return this.blocksEnableSignalsCallbackDispatch;
    }

    public int getCompiledModuleCacheSize() {
        return this.compiledModuleCacheSize;
    }

    public int getCompiledModuleDiskCacheSize() {
        return this.compiledModuleDiskCacheSize;
    }

    public boolean getControllerBackgroundDispose() {
        return this.controllerBackgroundDispose;
    }

    public boolean getControllerDisposeLifecycleFix() {
        return this.controllerDisposeLifecycleFix;
    }

    public int getDiskCacheAppVersion() {
        return this.diskCacheAppVersion;
    }

    public String getDiskCachePath() {
        return this.diskCachePath;
    }

    public boolean getEnableAsyncInit() {
        return this.enableAsyncInit;
    }

    public boolean getEnableControllerDisposalEarlyExit() {
        return this.enableControllerDisposalEarlyExit;
    }

    public boolean getEnableControllerStateHolderDeadlockFix() {
        return this.enableControllerStateHolderDeadlockFix;
    }

    public boolean getEnableMultiLanguageStackTraceError() {
        return this.enableMultiLanguageStackTraceError;
    }

    public boolean getEnableSwapProtoKernel() {
        return this.enableSwapProtoKernel;
    }

    public boolean getEnableThreadSafeControllerExecutor() {
        return this.enableThreadSafeControllerExecutor;
    }

    public boolean getEnableVmContextLru() {
        return this.enableVmContextLru;
    }

    public boolean getExecuteCommandCallbackDispatch() {
        return this.executeCommandCallbackDispatch;
    }

    public boolean getExecuteJsFunctionCommandAsync() {
        return this.executeJsFunctionCommandAsync;
    }

    public boolean getExecuteJsFunctionCommandAsyncAllCalls() {
        return this.executeJsFunctionCommandAsyncAllCalls;
    }

    public String getExecutorName() {
        return this.executorName;
    }

    public String getExtraVmFlags() {
        return this.extraVmFlags;
    }

    public long getIdleMessageMicroseconds() {
        return this.idleMessageMicroseconds;
    }

    public boolean getIndividualModuleLoading() {
        return this.individualModuleLoading;
    }

    public JSControllerInitializationMode getInitializationMode() {
        return this.initializationMode;
    }

    public boolean getJsClientErrorLoggerEnabled() {
        return this.jsClientErrorLoggerEnabled;
    }

    public int getJsEngineSelection() {
        return this.jsEngineSelection;
    }

    public byte[] getPlatformDetails() {
        return this.platformDetails;
    }

    public boolean getPumpMessageLoop() {
        return this.pumpMessageLoop;
    }

    public boolean getRunOnLoadModuleHookOnBackgroundThread() {
        return this.runOnLoadModuleHookOnBackgroundThread;
    }

    public boolean getShouldLockVmIsolate() {
        return this.shouldLockVmIsolate;
    }

    public boolean getShouldUseDirectJsObjectCreation() {
        return this.shouldUseDirectJsObjectCreation;
    }

    public boolean getUseLogJsSpanBinding() {
        return this.useLogJsSpanBinding;
    }

    public boolean getUseScopedCommandResolver() {
        return this.useScopedCommandResolver;
    }

    public int getVmContextLruSize() {
        return this.vmContextLruSize;
    }

    public String toString() {
        byte[] bArr = this.platformDetails;
        String strValueOf = String.valueOf(this.initializationMode);
        String strValueOf2 = String.valueOf(bArr);
        StringBuilder sb = new StringBuilder("JSControllerConfig{initializationMode=");
        sb.append(strValueOf);
        sb.append(",enableVmContextLru=");
        sb.append(this.enableVmContextLru);
        sb.append(",vmContextLruSize=");
        sb.append(this.vmContextLruSize);
        sb.append(",shouldLockVmIsolate=");
        sb.append(this.shouldLockVmIsolate);
        sb.append(",shouldUseDirectJsObjectCreation=");
        sb.append(this.shouldUseDirectJsObjectCreation);
        sb.append(",runOnLoadModuleHookOnBackgroundThread=");
        sb.append(this.runOnLoadModuleHookOnBackgroundThread);
        sb.append(",jsClientErrorLoggerEnabled=");
        sb.append(this.jsClientErrorLoggerEnabled);
        sb.append(",jsEngineSelection=");
        sb.append(this.jsEngineSelection);
        sb.append(",extraVmFlags=");
        sb.append(this.extraVmFlags);
        sb.append(",platformDetails=");
        sb.append(strValueOf2);
        sb.append(",individualModuleLoading=");
        sb.append(this.individualModuleLoading);
        sb.append(",compiledModuleCacheSize=");
        sb.append(this.compiledModuleCacheSize);
        sb.append(",compiledModuleDiskCacheSize=");
        sb.append(this.compiledModuleDiskCacheSize);
        sb.append(",diskCachePath=");
        sb.append(this.diskCachePath);
        sb.append(",diskCacheAppVersion=");
        sb.append(this.diskCacheAppVersion);
        sb.append(",useLogJsSpanBinding=");
        sb.append(this.useLogJsSpanBinding);
        sb.append(",executorName=");
        sb.append(this.executorName);
        sb.append(",pumpMessageLoop=");
        sb.append(this.pumpMessageLoop);
        sb.append(",idleMessageMicroseconds=");
        sb.append(this.idleMessageMicroseconds);
        sb.append(",enableAsyncInit=");
        sb.append(this.enableAsyncInit);
        sb.append(",controllerDisposeLifecycleFix=");
        sb.append(this.controllerDisposeLifecycleFix);
        boolean z = this.useScopedCommandResolver;
        boolean z2 = this.enableControllerStateHolderDeadlockFix;
        boolean z3 = this.enableThreadSafeControllerExecutor;
        boolean z4 = this.blocksEnableSignalsCallbackDispatch;
        boolean z5 = this.executeJsFunctionCommandAsyncAllCalls;
        boolean z6 = this.executeJsFunctionCommandAsync;
        boolean z7 = this.executeCommandCallbackDispatch;
        boolean z8 = this.asyncCallingThreadDispose;
        boolean z9 = this.enableSwapProtoKernel;
        boolean z10 = this.enableControllerDisposalEarlyExit;
        boolean z11 = this.enableMultiLanguageStackTraceError;
        boolean z12 = this.controllerBackgroundDispose;
        sb.append(",controllerBackgroundDispose=");
        sb.append(z12);
        sb.append(",enableMultiLanguageStackTraceError=");
        sb.append(z11);
        sb.append(",enableControllerDisposalEarlyExit=");
        sb.append(z10);
        sb.append(",enableSwapProtoKernel=");
        sb.append(z9);
        sb.append(",asyncCallingThreadDispose=");
        sb.append(z8);
        sb.append(",executeCommandCallbackDispatch=");
        sb.append(z7);
        sb.append(",executeJsFunctionCommandAsync=");
        sb.append(z6);
        sb.append(",executeJsFunctionCommandAsyncAllCalls=");
        sb.append(z5);
        sb.append(",blocksEnableSignalsCallbackDispatch=");
        sb.append(z4);
        sb.append(",enableThreadSafeControllerExecutor=");
        sb.append(z3);
        sb.append(",enableControllerStateHolderDeadlockFix=");
        sb.append(z2);
        sb.append(",useScopedCommandResolver=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
