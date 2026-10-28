package com.google.android.libraries.youtube.composition.common.concurrency;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class OnceClosure implements Runnable {
    private long a;

    private OnceClosure(long j) {
        this.a = j;
    }

    private static native void invoke(long j);

    private static native void release(long j);

    protected final void finalize() {
        long j = this.a;
        if (j != 0) {
            release(j);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.a;
        if (j == 0) {
            throw new AssertionError("OnceClosure called twice.");
        }
        this.a = 0L;
        invoke(j);
    }
}
