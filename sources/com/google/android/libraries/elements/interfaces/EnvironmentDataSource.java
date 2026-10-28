package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnvironmentDataSource {
    public static final long INVALID_SUBSCRIPTION = -1;

    public abstract byte[] getEnvironmentData();

    public abstract long subscribeToEnvironmentData(EnvironmentDataObserver environmentDataObserver);

    public abstract void unsubscribeFromEnvironmentData(long j);
}
