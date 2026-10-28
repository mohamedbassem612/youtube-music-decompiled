package com.google.android.libraries.youtube.composition.api;

import android.util.Size;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class RecorderOptions {
    final String filePath;
    final float fps;
    final ArrayList metadataTags;
    final Size outputSize;

    public RecorderOptions(String str, Size size, float f, ArrayList arrayList) {
        this.filePath = str;
        this.outputSize = size;
        this.fps = f;
        this.metadataTags = arrayList;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public float getFps() {
        return this.fps;
    }

    public ArrayList getMetadataTags() {
        return this.metadataTags;
    }

    public Size getOutputSize() {
        return this.outputSize;
    }

    public String toString() {
        ArrayList arrayList = this.metadataTags;
        return "RecorderOptions{filePath=" + this.filePath + ",outputSize=" + String.valueOf(this.outputSize) + ",fps=" + this.fps + ",metadataTags=" + String.valueOf(arrayList) + '}';
    }
}
