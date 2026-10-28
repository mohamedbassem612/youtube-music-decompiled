package com.google.android.libraries.youtube.media.interfaces;

import defpackage.zik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class SabrDataProviderWrapper implements AutoCloseable {
    private boolean a = false;
    private long nativePtr;

    protected SabrDataProviderWrapper(long j) {
        this.nativePtr = j;
    }

    private native void nativeDestroy(long j);

    public final long b() {
        long j;
        synchronized (zik.class) {
            j = this.nativePtr;
        }
        return j;
    }

    public final boolean c() {
        boolean z;
        synchronized (zik.class) {
            z = this.a;
        }
        return z;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (zik.class) {
            if (this.a) {
                return;
            }
            long j = this.nativePtr;
            if (j != 0) {
                nativeDestroy(j);
                this.nativePtr = 0L;
            }
            this.a = true;
        }
    }
}
