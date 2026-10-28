package com.google.android.libraries.video.mediaengine.effects.skia;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SkiaLayerLruCache {
    public final long a;
    public final AtomicBoolean b;

    public SkiaLayerLruCache(long j, AtomicBoolean atomicBoolean) {
        this.a = j;
        this.b = atomicBoolean;
    }

    public static native long nativeCreateCache(int i);

    public static native void nativeReleaseCache(long j);
}
