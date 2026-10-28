package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class NamespacedStoreConfig {
    public static final NamespacedStoreConfig EMPTY_CONFIG = new NamespacedStoreConfig(false, false, false, false);
    final boolean legacyDidNotify;
    final boolean preferInlineObserverQueue;
    final boolean preferInlineTxQueue;
    final boolean useLockyByteStore;

    public NamespacedStoreConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.useLockyByteStore = z;
        this.legacyDidNotify = z2;
        this.preferInlineTxQueue = z3;
        this.preferInlineObserverQueue = z4;
    }

    public boolean getLegacyDidNotify() {
        return this.legacyDidNotify;
    }

    public boolean getPreferInlineObserverQueue() {
        return this.preferInlineObserverQueue;
    }

    public boolean getPreferInlineTxQueue() {
        return this.preferInlineTxQueue;
    }

    public boolean getUseLockyByteStore() {
        return this.useLockyByteStore;
    }

    public String toString() {
        return "NamespacedStoreConfig{useLockyByteStore=" + this.useLockyByteStore + ",legacyDidNotify=" + this.legacyDidNotify + ",preferInlineTxQueue=" + this.preferInlineTxQueue + ",preferInlineObserverQueue=" + this.preferInlineObserverQueue + '}';
    }
}
