package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class OnesieRetryConfig {
    final double backoffFactor;
    final long initialDelayMs;
    final double jitterFactor;
    final long maxRetryTimeoutMs;
    final long maximumDelayMs;

    public OnesieRetryConfig(long j, long j2, double d, double d2, long j3) {
        this.initialDelayMs = j;
        this.maximumDelayMs = j2;
        this.backoffFactor = d;
        this.jitterFactor = d2;
        this.maxRetryTimeoutMs = j3;
    }

    public double getBackoffFactor() {
        return this.backoffFactor;
    }

    public long getInitialDelayMs() {
        return this.initialDelayMs;
    }

    public double getJitterFactor() {
        return this.jitterFactor;
    }

    public long getMaxRetryTimeoutMs() {
        return this.maxRetryTimeoutMs;
    }

    public long getMaximumDelayMs() {
        return this.maximumDelayMs;
    }

    public String toString() {
        return "OnesieRetryConfig{initialDelayMs=" + this.initialDelayMs + ",maximumDelayMs=" + this.maximumDelayMs + ",backoffFactor=" + this.backoffFactor + ",jitterFactor=" + this.jitterFactor + ",maxRetryTimeoutMs=" + this.maxRetryTimeoutMs + '}';
    }
}
