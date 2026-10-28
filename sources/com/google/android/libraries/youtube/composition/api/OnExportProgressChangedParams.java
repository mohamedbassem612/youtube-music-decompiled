package com.google.android.libraries.youtube.composition.api;

import com.google.android.libraries.youtube.media.interfaces.Time;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class OnExportProgressChangedParams {
    final Time mediaDuration;
    final float progress;

    public OnExportProgressChangedParams(float f, Time time) {
        this.progress = f;
        this.mediaDuration = time;
    }

    public Time getMediaDuration() {
        return this.mediaDuration;
    }

    public float getProgress() {
        return this.progress;
    }

    public String toString() {
        return "OnExportProgressChangedParams{progress=" + this.progress + ",mediaDuration=" + String.valueOf(this.mediaDuration) + '}';
    }
}
