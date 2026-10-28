package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class AutocropFormat {
    final int height;
    final int width;

    public AutocropFormat(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "AutocropFormat{width=" + this.width + ",height=" + this.height + '}';
    }
}
