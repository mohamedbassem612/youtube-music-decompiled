package com.google.android.libraries.youtube.media.interfaces;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class BufferState {
    final ArrayList bufferedRanges;
    final ArrayList initializationFormatIds;
    final boolean isBufferedToEof;
    final Integer lastReadItag;
    final Double liveIngestionOffsetSeconds;
    final ArrayList partialSegments;

    public BufferState(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z, Double d, Integer num) {
        this.initializationFormatIds = arrayList;
        this.bufferedRanges = arrayList2;
        this.partialSegments = arrayList3;
        this.isBufferedToEof = z;
        this.liveIngestionOffsetSeconds = d;
        this.lastReadItag = num;
    }

    public ArrayList getBufferedRanges() {
        return this.bufferedRanges;
    }

    public ArrayList getInitializationFormatIds() {
        return this.initializationFormatIds;
    }

    public boolean getIsBufferedToEof() {
        return this.isBufferedToEof;
    }

    public Integer getLastReadItag() {
        return this.lastReadItag;
    }

    public Double getLiveIngestionOffsetSeconds() {
        return this.liveIngestionOffsetSeconds;
    }

    public ArrayList getPartialSegments() {
        return this.partialSegments;
    }

    public String toString() {
        ArrayList arrayList = this.partialSegments;
        ArrayList arrayList2 = this.bufferedRanges;
        return "BufferState{initializationFormatIds=" + String.valueOf(this.initializationFormatIds) + ",bufferedRanges=" + String.valueOf(arrayList2) + ",partialSegments=" + String.valueOf(arrayList) + ",isBufferedToEof=" + this.isBufferedToEof + ",liveIngestionOffsetSeconds=" + this.liveIngestionOffsetSeconds + ",lastReadItag=" + this.lastReadItag + '}';
    }
}
