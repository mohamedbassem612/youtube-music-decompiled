package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class BandwidthSample {
    final long bytesReceived;
    final long timeElapsedMs;

    public BandwidthSample(long j, long j2) {
        this.timeElapsedMs = j;
        this.bytesReceived = j2;
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getTimeElapsedMs() {
        return this.timeElapsedMs;
    }

    public String toString() {
        return "BandwidthSample{timeElapsedMs=" + this.timeElapsedMs + ",bytesReceived=" + this.bytesReceived + '}';
    }
}
