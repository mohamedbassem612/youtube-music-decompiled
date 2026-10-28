package com.google.android.libraries.youtube.composition.assets.movie;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidEncoderResult {
    final String codecName;
    final AndroidMediaFormat format;

    public AndroidEncoderResult(String str, AndroidMediaFormat androidMediaFormat) {
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
        return "AndroidEncoderResult{codecName=" + this.codecName + ",format=" + String.valueOf(this.format) + '}';
    }
}
