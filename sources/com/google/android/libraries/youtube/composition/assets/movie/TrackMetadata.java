package com.google.android.libraries.youtube.composition.assets.movie;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class TrackMetadata {
    final AndroidMediaFormat format;
    final int id;

    public TrackMetadata(int i, AndroidMediaFormat androidMediaFormat) {
        this.id = i;
        this.format = androidMediaFormat;
    }

    public AndroidMediaFormat getFormat() {
        return this.format;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "TrackMetadata{id=" + this.id + ",format=" + String.valueOf(this.format) + '}';
    }
}
