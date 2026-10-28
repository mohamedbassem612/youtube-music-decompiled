package com.google.android.libraries.blocks.runtime;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.mew;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class InstanceProxy {
    protected InstanceProxy() {
    }

    public abstract mew a();

    public abstract ListenableFuture b(int i, byte[] bArr);

    public abstract void c(int i, long j, byte[] bArr);

    public abstract boolean d(int i);

    public abstract byte[] e(int i, byte[] bArr);
}
