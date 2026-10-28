package com.google.android.libraries.blocks.runtime;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.aheh;
import defpackage.ahng;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncCallback implements aheh {
    private final int a;

    public AsyncCallback(int i) {
        this.a = i;
    }

    public static void register(ListenableFuture listenableFuture, int i) {
        ahng.x(listenableFuture, new AsyncCallback(i), MoreExecutors.directExecutor());
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        String message = th.getMessage();
        nativeOnFailure(this.a, message == null ? new byte[0] : message.getBytes(StandardCharsets.UTF_8));
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        nativeOnSuccess(this.a, (byte[]) obj);
    }

    public native void nativeOnFailure(int i, byte[] bArr);

    public native void nativeOnSuccess(int i, byte[] bArr);
}
