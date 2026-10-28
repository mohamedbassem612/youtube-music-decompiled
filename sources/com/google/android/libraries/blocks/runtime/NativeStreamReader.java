package com.google.android.libraries.blocks.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NativeStreamReader {
    public final long a;

    public NativeStreamReader(long j) {
        this.a = j;
    }

    private native void nativeDelete(long j);

    private native byte[] nativeGetSynchronousValue(long j);

    private native void nativeReadsDoneWithError(long j, byte[] bArr);

    protected final void finalize() {
        nativeDelete(this.a);
    }

    public native void nativeReadsDone(long j);

    public native void nativeSetReader(long j, ReaderProxy readerProxy);
}
