package com.google.android.libraries.blocks.runtime;

import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NativeStreamWriter {
    public final long a;

    public NativeStreamWriter(long j) {
        this.a = j;
    }

    private native boolean nativeWriteUpb(long j, long j2, long j3, long j4);

    protected final void finalize() {
        nativeDelete(this.a);
    }

    public native void nativeDelete(long j);

    public native void nativeOnClosed(long j, Consumer consumer);

    public native void nativeOnRead(long j, Runnable runnable);

    public native boolean nativeWrite(long j, byte[] bArr);

    public native void nativeWritesDone(long j);

    public native void nativeWritesDoneWithError(long j, byte[] bArr);
}
