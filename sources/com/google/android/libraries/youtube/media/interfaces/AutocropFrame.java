package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class AutocropFrame {
    final int height;
    final int width;
    final int x;
    final int y;

    public AutocropFrame(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString() {
        return "AutocropFrame{x=" + this.x + ",y=" + this.y + ",width=" + this.width + ",height=" + this.height + '}';
    }
}
