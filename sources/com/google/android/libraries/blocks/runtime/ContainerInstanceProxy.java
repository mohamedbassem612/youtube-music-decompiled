package com.google.android.libraries.blocks.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ContainerInstanceProxy extends ClientCreatorProxy {
    public final long b;

    public ContainerInstanceProxy(long j) {
        super(j);
        this.b = j;
    }

    private native byte[] nativeContainerDebugSnapshot(long j);

    public native void nativeInvalidate(long j);
}
