package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class OnesieTransferEvent {
    final Long bytesReceived;
    final OnesieTransferEventType eventType;
    final long timestamp;

    public OnesieTransferEvent(long j, OnesieTransferEventType onesieTransferEventType, Long l) {
        this.timestamp = j;
        this.eventType = onesieTransferEventType;
        this.bytesReceived = l;
    }

    public Long getBytesReceived() {
        return this.bytesReceived;
    }

    public OnesieTransferEventType getEventType() {
        return this.eventType;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String toString() {
        return "OnesieTransferEvent{timestamp=" + this.timestamp + ",eventType=" + String.valueOf(this.eventType) + ",bytesReceived=" + this.bytesReceived + '}';
    }
}
