package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SubscriptionResources {
    final BlockRegistryProvider blockRegistryProvider;
    final String blockRegistryRef;
    final ClientDataObservable clientDataObservable;
    final ContextSubscriptionInput contextSubscriptionInput;
    final EnvironmentDataSource envSource;
    final SubscriptionObserverConfig observerConfig;
    final boolean useUpb;

    public SubscriptionResources(SubscriptionObserverConfig subscriptionObserverConfig, EnvironmentDataSource environmentDataSource, ClientDataObservable clientDataObservable, String str, BlockRegistryProvider blockRegistryProvider, boolean z, ContextSubscriptionInput contextSubscriptionInput) {
        this.observerConfig = subscriptionObserverConfig;
        this.envSource = environmentDataSource;
        this.clientDataObservable = clientDataObservable;
        this.blockRegistryRef = str;
        this.blockRegistryProvider = blockRegistryProvider;
        this.useUpb = z;
        this.contextSubscriptionInput = contextSubscriptionInput;
    }

    public BlockRegistryProvider getBlockRegistryProvider() {
        return this.blockRegistryProvider;
    }

    public String getBlockRegistryRef() {
        return this.blockRegistryRef;
    }

    public ClientDataObservable getClientDataObservable() {
        return this.clientDataObservable;
    }

    public ContextSubscriptionInput getContextSubscriptionInput() {
        return this.contextSubscriptionInput;
    }

    public EnvironmentDataSource getEnvSource() {
        return this.envSource;
    }

    public SubscriptionObserverConfig getObserverConfig() {
        return this.observerConfig;
    }

    public boolean getUseUpb() {
        return this.useUpb;
    }

    public String toString() {
        ContextSubscriptionInput contextSubscriptionInput = this.contextSubscriptionInput;
        BlockRegistryProvider blockRegistryProvider = this.blockRegistryProvider;
        ClientDataObservable clientDataObservable = this.clientDataObservable;
        EnvironmentDataSource environmentDataSource = this.envSource;
        return "SubscriptionResources{observerConfig=" + String.valueOf(this.observerConfig) + ",envSource=" + String.valueOf(environmentDataSource) + ",clientDataObservable=" + String.valueOf(clientDataObservable) + ",blockRegistryRef=" + this.blockRegistryRef + ",blockRegistryProvider=" + String.valueOf(blockRegistryProvider) + ",useUpb=" + this.useUpb + ",contextSubscriptionInput=" + String.valueOf(contextSubscriptionInput) + '}';
    }
}
