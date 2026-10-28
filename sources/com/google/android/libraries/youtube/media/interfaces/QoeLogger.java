package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class QoeLogger {
    public abstract void logBandwidthSample(long j, long j2);

    public abstract void logCacheBytesLoaded(long j);

    public abstract void logKeyValue(String str, String str2);

    public abstract void logNonFatalError(QoeError qoeError);

    public abstract void logTimedKeyValue(String str, String str2);
}
