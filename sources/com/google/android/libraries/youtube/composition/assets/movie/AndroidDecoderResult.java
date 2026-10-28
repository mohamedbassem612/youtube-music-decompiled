package com.google.android.libraries.youtube.composition.assets.movie;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidDecoderResult {
    final String codecName;
    final AndroidMediaFormat format;

    public AndroidDecoderResult(String str, AndroidMediaFormat androidMediaFormat) {
        this.codecName = str;
        this.format = androidMediaFormat;
    }

    public String getCodecName() {
        return this.codecName;
    }

    public AndroidMediaFormat getFormat() {
        return this.format;
    }

    public String toString() {
        return "AndroidDecoderResult{codecName=" + this.codecName + ",format=" + String.valueOf(this.format) + '}';
    }
}
