package com.google.research.aimatter.drishti;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class DrishtiLruCache {
    public final long a;
    public final AtomicBoolean b;

    public DrishtiLruCache() {
        long jNativeCreateLruCache = nativeCreateLruCache(3);
        this.a = jNativeCreateLruCache;
        this.b = new AtomicBoolean(jNativeCreateLruCache != 0);
    }

    private native long nativeCreateLruCache(int i);

    public native void nativeReleaseLruCache(long j);
}
