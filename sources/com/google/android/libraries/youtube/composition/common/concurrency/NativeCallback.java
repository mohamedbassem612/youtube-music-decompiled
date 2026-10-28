package com.google.android.libraries.youtube.composition.common.concurrency;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeCallback implements Callback {
    private final long a;

    public NativeCallback(long j) {
        this.a = j;
    }

    private static native void nativeCall(long j, Object obj);

    @Override // com.google.android.libraries.youtube.composition.common.concurrency.Callback
    public final void call(Object obj) {
        long j = this.a;
        if (j == 0 || obj == null) {
            return;
        }
        nativeCall(j, obj);
    }
}
