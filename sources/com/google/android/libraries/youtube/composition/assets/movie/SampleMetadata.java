package com.google.android.libraries.youtube.composition.assets.movie;

import com.google.android.libraries.youtube.media.interfaces.Time;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class SampleMetadata {
    final int flags;
    final Time presentationTimestamp;
    final long size;
    final int trackId;

    public SampleMetadata(int i, Time time, long j, int i2) {
        this.trackId = i;
        this.presentationTimestamp = time;
        this.size = j;
        this.flags = i2;
    }

    public int getFlags() {
        return this.flags;
    }

    public Time getPresentationTimestamp() {
        return this.presentationTimestamp;
    }

    public long getSize() {
        return this.size;
    }

    public int getTrackId() {
        return this.trackId;
    }

    public String toString() {
        return "SampleMetadata{trackId=" + this.trackId + ",presentationTimestamp=" + String.valueOf(this.presentationTimestamp) + ",size=" + this.size + ",flags=" + this.flags + '}';
    }
}
