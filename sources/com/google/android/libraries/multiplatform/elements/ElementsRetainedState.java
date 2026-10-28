package com.google.android.libraries.multiplatform.elements;

import defpackage.bpi;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ElementsRetainedState extends bpi implements AutoCloseable {
    public final AtomicLong a = new AtomicLong(0);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Object c = new Object();
    public Map d;

    public static native void jniDisposeElementsRetainedState(long j);

    private static native boolean jniIsElementsRetainedStateEmpty(long j);

    public final long a() {
        return this.a.get();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        synchronized (this.c) {
            this.d = null;
        }
        long andSet = this.a.getAndSet(0L);
        if (andSet != 0) {
            jniDisposeElementsRetainedState(andSet);
        }
    }

    @Override // defpackage.bpi
    public final void d() {
        close();
    }

    protected final void finalize() {
        close();
    }
}
