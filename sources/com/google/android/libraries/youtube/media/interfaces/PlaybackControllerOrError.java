package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackControllerOrError {
    final QoeError error;
    final PlaybackController playback;

    public PlaybackControllerOrError(PlaybackController playbackController, QoeError qoeError) {
        this.playback = playbackController;
        this.error = qoeError;
    }

    public QoeError getError() {
        return this.error;
    }

    public PlaybackController getPlayback() {
        return this.playback;
    }

    public String toString() {
        QoeError qoeError = this.error;
        return "PlaybackControllerOrError{playback=" + String.valueOf(this.playback) + ",error=" + String.valueOf(qoeError) + '}';
    }
}
