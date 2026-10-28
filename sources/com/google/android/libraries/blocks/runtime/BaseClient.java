package com.google.android.libraries.blocks.runtime;

import com.google.android.libraries.blocks.StatusException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import defpackage.agek;
import defpackage.ahcs;
import defpackage.ahcy;
import defpackage.ahng;
import defpackage.ahxw;
import defpackage.aiik;
import defpackage.aiix;
import defpackage.mba;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseClient implements AutoCloseable {
    public final long a;

    protected BaseClient(long j) {
        this.a = j;
    }

    private native void nativeCallAsync(long j, int i, byte[] bArr, SettableFuture settableFuture);

    private native long nativeCallReadableStream(long j, int i, byte[] bArr);

    private native void nativeDelete(long j);

    private native long[] nativeGetImplMetadata(long j);

    private native byte[] nativeGetSignal(long j, int i);

    private native InstanceProxy nativeGetUnderlyingInstanceProxy(long j);

    private native boolean nativeMethodExists(long j, int i);

    private native void nativeRelease(long j);

    private native void nativeSubscribeToKeyedSignal(long j, byte[] bArr, int i, SignalCallbackProxy signalCallbackProxy);

    private native void nativeSubscribeToSignal(long j, int i, SignalCallbackProxy signalCallbackProxy);

    private native String nativeToMovableRef(long j);

    private native String nativeToWeakRef(long j);

    private native void nativeUnsubscribeFromKeyedSignal(long j, byte[] bArr, int i);

    private native void nativeUnsubscribeFromSignal(long j, int i);

    public abstract int a();

    public final mba b(int i, MessageLite messageLite, aiix aiixVar) {
        return c(i, messageLite, aiixVar, new BaseClient$$ExternalSyntheticLambda1());
    }

    public final mba c(int i, MessageLite messageLite, aiix aiixVar, agek agekVar) {
        return new RuntimeStreamReader(nativeCallReadableStream(this.a, i, messageLite.toByteArray()), aiixVar, agekVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        nativeRelease(this.a);
    }

    public final InstanceProxy d() {
        return nativeGetUnderlyingInstanceProxy(this.a);
    }

    public final ListenableFuture e(int i, MessageLite messageLite, final aiix aiixVar) {
        long j = this.a;
        SettableFuture settableFutureCreate = SettableFuture.create();
        nativeCallAsync(j, i, messageLite.toByteArray(), settableFutureCreate);
        return ahcs.f(settableFutureCreate, new ahcy() { // from class: com.google.android.libraries.blocks.runtime.BaseClient$$ExternalSyntheticLambda0
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                return ahng.n(aiixVar.h((byte[]) obj, ExtensionRegistryLite.getGeneratedRegistry()));
            }
        }, MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public final MessageLite f(int i, MessageLite messageLite, aiix aiixVar) {
        try {
            return aiixVar.h(nativeCallSync(this.a, i, messageLite.toByteArray()), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik e) {
            ahxw ahxwVar = ahxw.INTERNAL;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            throw new StatusException(ahxwVar, message, e.getStackTrace(), null, null);
        }
    }

    protected final void finalize() {
        nativeDelete(this.a);
    }

    public final String g() {
        return nativeToMovableRef(this.a);
    }

    public final String h() {
        return nativeToWeakRef(this.a);
    }

    public native byte[] nativeCallSync(long j, int i, byte[] bArr);

    public native byte[] nativeGetKeyedSignal(long j, byte[] bArr, int i);
}
