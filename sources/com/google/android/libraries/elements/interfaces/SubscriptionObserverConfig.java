package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SubscriptionObserverConfig {
    final boolean enableCssStyling;
    final boolean enableFaultPass;
    final boolean enableNativeModelSynthesis;
    final boolean enablePreparsedTheme;
    final Integer observerPriority;
    final boolean suppressNotificationIfEntityValueUnchanged;

    public SubscriptionObserverConfig(boolean z, Integer num, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.suppressNotificationIfEntityValueUnchanged = z;
        this.observerPriority = num;
        this.enableFaultPass = z2;
        this.enableCssStyling = z3;
        this.enableNativeModelSynthesis = z4;
        this.enablePreparsedTheme = z5;
    }

    public boolean getEnableCssStyling() {
        return this.enableCssStyling;
    }

    public boolean getEnableFaultPass() {
        return this.enableFaultPass;
    }

    public boolean getEnableNativeModelSynthesis() {
        return this.enableNativeModelSynthesis;
    }

    public boolean getEnablePreparsedTheme() {
        return this.enablePreparsedTheme;
    }

    public Integer getObserverPriority() {
        return this.observerPriority;
    }

    public boolean getSuppressNotificationIfEntityValueUnchanged() {
        return this.suppressNotificationIfEntityValueUnchanged;
    }

    public String toString() {
        return "SubscriptionObserverConfig{suppressNotificationIfEntityValueUnchanged=" + this.suppressNotificationIfEntityValueUnchanged + ",observerPriority=" + this.observerPriority + ",enableFaultPass=" + this.enableFaultPass + ",enableCssStyling=" + this.enableCssStyling + ",enableNativeModelSynthesis=" + this.enableNativeModelSynthesis + ",enablePreparsedTheme=" + this.enablePreparsedTheme + '}';
    }
}
