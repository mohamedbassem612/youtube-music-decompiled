package com.google.android.libraries.blocks.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class NativeBindingRouter {
    private NativeBindingRouter() {
    }

    private native byte[] nativeCallRootBinding(byte[] bArr);

    private native long nativeCreateContainerBinding(int i, byte[] bArr);

    private native long nativeCreateContainerBinding2(int i, byte[] bArr, byte[] bArr2, int[] iArr, JavaRuntime.NativeInstanceProxyCreator[] nativeInstanceProxyCreatorArr, long j);
}
