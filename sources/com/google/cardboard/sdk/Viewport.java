package com.google.cardboard.sdk;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class Viewport {
    public int height;
    public int width;
    public int x;
    public int y;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Viewport) {
            Viewport viewport = (Viewport) obj;
            if (this.x == viewport.x && this.y == viewport.y && this.width == viewport.width && this.height == viewport.height) {
                return true;
            }
        }
        return false;
    }

    public void getAsArray(int[] iArr, int i) {
        if (i + 4 > iArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        iArr[i] = this.x;
        iArr[i + 1] = this.y;
        iArr[i + 2] = this.width;
        iArr[i + 3] = this.height;
    }

    public int hashCode() {
        return ((Integer.valueOf(this.x).hashCode() ^ Integer.valueOf(this.y).hashCode()) ^ Integer.valueOf(this.width).hashCode()) ^ Integer.valueOf(this.height).hashCode();
    }

    public void setGLScissor() {
        GLES20.glScissor(this.x, this.y, this.width, this.height);
    }

    public void setGLViewport() {
        GLES20.glViewport(this.x, this.y, this.width, this.height);
    }

    public void setViewport(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        sb.append("  x: " + this.x + ",\n");
        sb.append("  y: " + this.y + ",\n");
        sb.append("  width: " + this.width + ",\n");
        sb.append("  height: " + this.height + ",\n");
        sb.append('}');
        return sb.toString();
    }
}
