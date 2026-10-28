package com.google.android.libraries.multiplatform.elements.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ReaperThreadJniWrapper {
    public final long a = jniCreateReaperThread();

    private static native long jniCreateReaperThread();

    private static native void jniDeleteReaperThread(long j);

    protected final void finalize() {
        long j = this.a;
        if (j != 0) {
            jniDeleteReaperThread(j);
        }
    }
}
