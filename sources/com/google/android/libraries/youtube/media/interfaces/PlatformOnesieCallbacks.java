package com.google.android.libraries.youtube.media.interfaces;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PlatformOnesieCallbacks {
    public abstract BufferManager createBufferManager(String str);

    public abstract MediaCache createCache(String str);

    public abstract void onDecryptedPlayerResponseBytes(ByteBuffer byteBuffer);

    public abstract void onDecryptedStreamingWatchBytes(ByteBuffer byteBuffer);

    public abstract void onOnesieRequestDone(QoeError qoeError);

    public abstract void setOnesieResponseSelector(String str, OnesieResponseSelector onesieResponseSelector);

    public abstract void setOnesieVideoData(String str, OnesieVideoData onesieVideoData);
}
