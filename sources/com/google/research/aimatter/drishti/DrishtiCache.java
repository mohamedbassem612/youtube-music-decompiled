package com.google.research.aimatter.drishti;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class DrishtiCache {
    public final long a = nativeCreateCache();
    public final AtomicBoolean b = new AtomicBoolean(true);

    private native long nativeCreateCache();

    public final long a() {
        if (this.b.get()) {
            return this.a;
        }
        return 0L;
    }

    public native void nativeReleaseCache(long j);
}
