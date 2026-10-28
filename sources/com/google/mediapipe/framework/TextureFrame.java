package com.google.mediapipe.framework;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface TextureFrame extends TextureReleaseCallback {
    int getFormat();

    int getHeight();

    int getTextureName();

    long getTimestamp();

    int getWidth();

    void release();

    @Override // com.google.mediapipe.framework.TextureReleaseCallback
    void release(GlSyncToken glSyncToken);

    void retain();

    boolean supportsRetain();
}
