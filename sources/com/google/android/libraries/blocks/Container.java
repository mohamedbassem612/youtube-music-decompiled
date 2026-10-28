package com.google.android.libraries.blocks;

import com.google.android.libraries.blocks.runtime.ContainerInstanceProxy;
import defpackage.may;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Container extends may {
    private final ContainerInstanceProxy b;

    public Container(ContainerInstanceProxy containerInstanceProxy) {
        super(containerInstanceProxy);
        this.b = containerInstanceProxy;
    }

    private static Container fromNativeContainerInstance(long j) {
        return new Container(new ContainerInstanceProxy(j));
    }

    public final void d() {
        ContainerInstanceProxy containerInstanceProxy = this.b;
        containerInstanceProxy.nativeInvalidate(containerInstanceProxy.b);
    }

    public long getNativeContainerInstance() {
        return this.b.b;
    }
}
