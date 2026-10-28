package com.google.android.libraries.blocks.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ClientCreatorProxy {
    public final long a;

    public ClientCreatorProxy(long j) {
        this.a = j;
    }

    private native void nativeDelete(long j);

    private native byte[] nativeGetKeyedSignal(byte[] bArr, long j, int i);

    private native byte[] nativeGetSignal(long j, int i);

    private native void nativeUpdateSignal(byte[] bArr, long j, int i);

    public final void a(byte[] bArr, int i) {
        nativeUpdateSignal(bArr, this.a, i);
    }

    protected final void finalize() {
        nativeDelete(this.a);
    }

    public native long nativeCreateBlock(long j, int i);

    public native long nativeCreateBlockWithArgs(long j, int i, byte[] bArr);

    public native long nativeCreateConcreteBlock(long j, long j2, InstanceProxy instanceProxy);

    public native long nativeCreateFromMovableRef(long j, String str);

    public native long nativeCreateFromWeakRef(long j, String str);

    public native long nativeCreateInstanceContext(long j, int i);

    public native void nativeUpdateKeyedSignal(byte[] bArr, byte[] bArr2, long j, int i);
}
