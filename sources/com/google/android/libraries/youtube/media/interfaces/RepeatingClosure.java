package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class RepeatingClosure implements Runnable {
    private final long a;

    private RepeatingClosure(long j) {
        this.a = j;
    }

    private static native void invoke(long j);

    private static native void release(long j);

    protected final void finalize() {
        release(this.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        invoke(this.a);
    }
}
