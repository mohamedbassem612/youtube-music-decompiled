package com.google.android.libraries.youtube.composition.api;

import com.google.android.libraries.youtube.media.interfaces.Time;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class OnOutputProcessedParams {
    final String channelId;
    final Time timelineTime;

    public OnOutputProcessedParams(String str, Time time) {
        this.channelId = str;
        this.timelineTime = time;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public Time getTimelineTime() {
        return this.timelineTime;
    }

    public String toString() {
        return "OnOutputProcessedParams{channelId=" + this.channelId + ",timelineTime=" + String.valueOf(this.timelineTime) + '}';
    }
}
