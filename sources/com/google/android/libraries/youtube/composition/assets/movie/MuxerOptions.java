package com.google.android.libraries.youtube.composition.assets.movie;

import com.google.android.libraries.youtube.media.interfaces.Time;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class MuxerOptions {
    final ArrayList exportTags;
    final String outputFilePath;
    final Time videoDuration;

    public MuxerOptions(String str, Time time, ArrayList arrayList) {
        this.outputFilePath = str;
        this.videoDuration = time;
        this.exportTags = arrayList;
    }

    public ArrayList getExportTags() {
        return this.exportTags;
    }

    public String getOutputFilePath() {
        return this.outputFilePath;
    }

    public Time getVideoDuration() {
        return this.videoDuration;
    }

    public String toString() {
        ArrayList arrayList = this.exportTags;
        return "MuxerOptions{outputFilePath=" + this.outputFilePath + ",videoDuration=" + String.valueOf(this.videoDuration) + ",exportTags=" + String.valueOf(arrayList) + '}';
    }
}
