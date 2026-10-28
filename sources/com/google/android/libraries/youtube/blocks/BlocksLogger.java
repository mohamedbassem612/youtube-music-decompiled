package com.google.android.libraries.youtube.blocks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class BlocksLogger {
    public abstract boolean allowClientPerformanceSample();

    public abstract boolean endLatencyActionSpan(String str);

    public abstract void logBindingError(byte[] bArr);

    public abstract boolean logLatencyActionSpan(String str);

    public abstract void logSpan(byte[] bArr);

    public abstract void startLatencyActionSpan(String str);
}
