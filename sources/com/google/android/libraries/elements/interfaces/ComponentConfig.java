package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentConfig {
    final int arenaMaxBlockSize;
    final int arenaStartBlockSize;
    final boolean componentClearStateOnSet;
    final boolean disableFbConversion;
    final boolean disableSharedElementArenaAllocation;
    final boolean eagerComponentCleanup;
    final boolean eagerlyDisposeComponentState;
    final int elementHashMode;
    final boolean enableCssStyling;
    final boolean enableCustomArenaConfig;
    final boolean enableEkoBranchAndLoopOptimization;
    final boolean enableEkoBytecode;
    final boolean enableEkoMathPerCharacterParsing;
    final boolean enableEkoStrictModeError;
    final boolean enableKnownFieldsModelParsing;
    final boolean enableNativeTemplateResolution;
    final boolean enableOptimizedComponentChangeDetection;
    final boolean enablePerformanceLogging;
    final boolean enableWasmNoSerialization;
    final boolean enableWasmPerformanceLogging;
    final boolean reuseSubscriptionProcessors;
    final boolean suppressPriorModelCheck;
    final boolean useElementProtoPtr;
    final boolean usePriorModelHash;
    final boolean usePriorModelHashForEkoNoSerialization;
    final boolean useSubscriptionProcessorMap;

    public ComponentConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, int i2, int i3) {
        this.reuseSubscriptionProcessors = z;
        this.useSubscriptionProcessorMap = z2;
        this.usePriorModelHash = z3;
        this.suppressPriorModelCheck = z4;
        this.useElementProtoPtr = z5;
        this.elementHashMode = i;
        this.disableFbConversion = z6;
        this.enableEkoMathPerCharacterParsing = z7;
        this.enableWasmPerformanceLogging = z8;
        this.enableKnownFieldsModelParsing = z9;
        this.componentClearStateOnSet = z10;
        this.disableSharedElementArenaAllocation = z11;
        this.enableNativeTemplateResolution = z12;
        this.enableWasmNoSerialization = z13;
        this.eagerlyDisposeComponentState = z14;
        this.eagerComponentCleanup = z15;
        this.enableOptimizedComponentChangeDetection = z16;
        this.usePriorModelHashForEkoNoSerialization = z17;
        this.enableEkoStrictModeError = z18;
        this.enableCssStyling = z19;
        this.enableEkoBytecode = z20;
        this.enableEkoBranchAndLoopOptimization = z21;
        this.enablePerformanceLogging = z22;
        this.enableCustomArenaConfig = z23;
        this.arenaStartBlockSize = i2;
        this.arenaMaxBlockSize = i3;
    }

    public int getArenaMaxBlockSize() {
        return this.arenaMaxBlockSize;
    }

    public int getArenaStartBlockSize() {
        return this.arenaStartBlockSize;
    }

    public boolean getComponentClearStateOnSet() {
        return this.componentClearStateOnSet;
    }

    public boolean getDisableFbConversion() {
        return this.disableFbConversion;
    }

    public boolean getDisableSharedElementArenaAllocation() {
        return this.disableSharedElementArenaAllocation;
    }

    public boolean getEagerComponentCleanup() {
        return this.eagerComponentCleanup;
    }

    public boolean getEagerlyDisposeComponentState() {
        return this.eagerlyDisposeComponentState;
    }

    public int getElementHashMode() {
        return this.elementHashMode;
    }

    public boolean getEnableCssStyling() {
        return this.enableCssStyling;
    }

    public boolean getEnableCustomArenaConfig() {
        return this.enableCustomArenaConfig;
    }

    public boolean getEnableEkoBranchAndLoopOptimization() {
        return this.enableEkoBranchAndLoopOptimization;
    }

    public boolean getEnableEkoBytecode() {
        return this.enableEkoBytecode;
    }

    public boolean getEnableEkoMathPerCharacterParsing() {
        return this.enableEkoMathPerCharacterParsing;
    }

    public boolean getEnableEkoStrictModeError() {
        return this.enableEkoStrictModeError;
    }

    public boolean getEnableKnownFieldsModelParsing() {
        return this.enableKnownFieldsModelParsing;
    }

    public boolean getEnableNativeTemplateResolution() {
        return this.enableNativeTemplateResolution;
    }

    public boolean getEnableOptimizedComponentChangeDetection() {
        return this.enableOptimizedComponentChangeDetection;
    }

    public boolean getEnablePerformanceLogging() {
        return this.enablePerformanceLogging;
    }

    public boolean getEnableWasmNoSerialization() {
        return this.enableWasmNoSerialization;
    }

    public boolean getEnableWasmPerformanceLogging() {
        return this.enableWasmPerformanceLogging;
    }

    public boolean getReuseSubscriptionProcessors() {
        return this.reuseSubscriptionProcessors;
    }

    public boolean getSuppressPriorModelCheck() {
        return this.suppressPriorModelCheck;
    }

    public boolean getUseElementProtoPtr() {
        return this.useElementProtoPtr;
    }

    public boolean getUsePriorModelHash() {
        return this.usePriorModelHash;
    }

    public boolean getUsePriorModelHashForEkoNoSerialization() {
        return this.usePriorModelHashForEkoNoSerialization;
    }

    public boolean getUseSubscriptionProcessorMap() {
        return this.useSubscriptionProcessorMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComponentConfig{reuseSubscriptionProcessors=");
        sb.append(this.reuseSubscriptionProcessors);
        sb.append(",useSubscriptionProcessorMap=");
        sb.append(this.useSubscriptionProcessorMap);
        sb.append(",usePriorModelHash=");
        sb.append(this.usePriorModelHash);
        sb.append(",suppressPriorModelCheck=");
        sb.append(this.suppressPriorModelCheck);
        sb.append(",useElementProtoPtr=");
        sb.append(this.useElementProtoPtr);
        sb.append(",elementHashMode=");
        sb.append(this.elementHashMode);
        sb.append(",disableFbConversion=");
        sb.append(this.disableFbConversion);
        sb.append(",enableEkoMathPerCharacterParsing=");
        sb.append(this.enableEkoMathPerCharacterParsing);
        sb.append(",enableWasmPerformanceLogging=");
        sb.append(this.enableWasmPerformanceLogging);
        sb.append(",enableKnownFieldsModelParsing=");
        sb.append(this.enableKnownFieldsModelParsing);
        sb.append(",componentClearStateOnSet=");
        sb.append(this.componentClearStateOnSet);
        sb.append(",disableSharedElementArenaAllocation=");
        sb.append(this.disableSharedElementArenaAllocation);
        sb.append(",enableNativeTemplateResolution=");
        sb.append(this.enableNativeTemplateResolution);
        sb.append(",enableWasmNoSerialization=");
        sb.append(this.enableWasmNoSerialization);
        sb.append(",eagerlyDisposeComponentState=");
        sb.append(this.eagerlyDisposeComponentState);
        sb.append(",eagerComponentCleanup=");
        sb.append(this.eagerComponentCleanup);
        sb.append(",enableOptimizedComponentChangeDetection=");
        sb.append(this.enableOptimizedComponentChangeDetection);
        sb.append(",usePriorModelHashForEkoNoSerialization=");
        sb.append(this.usePriorModelHashForEkoNoSerialization);
        sb.append(",enableEkoStrictModeError=");
        sb.append(this.enableEkoStrictModeError);
        sb.append(",enableCssStyling=");
        sb.append(this.enableCssStyling);
        sb.append(",enableEkoBytecode=");
        sb.append(this.enableEkoBytecode);
        sb.append(",enableEkoBranchAndLoopOptimization=");
        sb.append(this.enableEkoBranchAndLoopOptimization);
        sb.append(",enablePerformanceLogging=");
        sb.append(this.enablePerformanceLogging);
        sb.append(",enableCustomArenaConfig=");
        sb.append(this.enableCustomArenaConfig);
        int i = this.arenaMaxBlockSize;
        int i2 = this.arenaStartBlockSize;
        sb.append(",arenaStartBlockSize=");
        sb.append(i2);
        sb.append(",arenaMaxBlockSize=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
