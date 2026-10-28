package com.google.android.libraries.youtube.composition.api;

import com.google.android.libraries.youtube.media.interfaces.Time;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class OnExportCompletedParams {
    final String containerMimeType;
    final Time mediaDuration;
    final int videoFrameCount;

    public OnExportCompletedParams(Time time, String str, int i) {
        this.mediaDuration = time;
        this.containerMimeType = str;
        this.videoFrameCount = i;
    }

    public String getContainerMimeType() {
        return this.containerMimeType;
    }

    public Time getMediaDuration() {
        return this.mediaDuration;
    }

    public int getVideoFrameCount() {
        return this.videoFrameCount;
    }

    public String toString() {
        return "OnExportCompletedParams{mediaDuration=" + String.valueOf(this.mediaDuration) + ",containerMimeType=" + this.containerMimeType + ",videoFrameCount=" + this.videoFrameCount + '}';
    }
}
