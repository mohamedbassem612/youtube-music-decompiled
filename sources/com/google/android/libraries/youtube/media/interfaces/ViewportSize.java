package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewportSize {
    final int height;
    final int width;

    public ViewportSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ViewportSize)) {
            return false;
        }
        ViewportSize viewportSize = (ViewportSize) obj;
        return this.width == viewportSize.width && this.height == viewportSize.height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((this.width + 527) * 31) + this.height;
    }

    public String toString() {
        return "ViewportSize{width=" + this.width + ",height=" + this.height + '}';
    }
}
