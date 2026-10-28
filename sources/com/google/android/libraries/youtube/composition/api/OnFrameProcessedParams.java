package com.google.android.libraries.youtube.composition.api;

import com.google.android.libraries.youtube.media.interfaces.Time;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class OnFrameProcessedParams {
    final String timelineId;
    final Time timelineTime;

    public OnFrameProcessedParams(String str, Time time) {
        this.timelineId = str;
        this.timelineTime = time;
    }

    public String getTimelineId() {
        return this.timelineId;
    }

    public Time getTimelineTime() {
        return this.timelineTime;
    }

    public String toString() {
        return "OnFrameProcessedParams{timelineId=" + this.timelineId + ",timelineTime=" + String.valueOf(this.timelineTime) + '}';
    }
}
