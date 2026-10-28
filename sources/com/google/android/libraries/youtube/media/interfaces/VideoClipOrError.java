package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class VideoClipOrError {
    final QoeError error;
    final VideoClip videoClip;

    public VideoClipOrError(VideoClip videoClip, QoeError qoeError) {
        this.videoClip = videoClip;
        this.error = qoeError;
    }

    public QoeError getError() {
        return this.error;
    }

    public VideoClip getVideoClip() {
        return this.videoClip;
    }

    public String toString() {
        QoeError qoeError = this.error;
        return "VideoClipOrError{videoClip=" + String.valueOf(this.videoClip) + ",error=" + String.valueOf(qoeError) + '}';
    }
}
