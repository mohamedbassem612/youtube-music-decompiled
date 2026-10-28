package com.google.mediapipe.framework;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class Packet {
    private long a;

    private Packet(long j) {
        this.a = j;
    }

    public static Packet create(long j) {
        return new Packet(j);
    }

    private native long nativeGetTimestamp(long j);

    private native void nativeReleasePacket(long j);

    public final long a() {
        return nativeGetTimestamp(this.a);
    }

    public long getNativeHandle() {
        return this.a;
    }

    public void release() {
        long j = this.a;
        if (j != 0) {
            nativeReleasePacket(j);
            this.a = 0L;
        }
    }
}
