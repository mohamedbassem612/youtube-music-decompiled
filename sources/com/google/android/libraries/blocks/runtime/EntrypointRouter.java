package com.google.android.libraries.blocks.runtime;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.asiu;
import defpackage.mew;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class EntrypointRouter {
    private EntrypointRouter() {
    }

    public static void callSignalCallback(SignalCallbackProxy signalCallbackProxy, byte[] bArr) {
        signalCallbackProxy.a();
    }

    public static void readerProxyOnStreamData(ReaderProxy readerProxy, byte[] bArr) {
        readerProxy.onStreamData(bArr);
    }

    public static void readerProxyOnStreamFinished(ReaderProxy readerProxy, byte[] bArr) {
        readerProxy.onStreamFinished(Status.a(bArr));
    }

    public static ListenableFuture routeCallAsync(InstanceProxy instanceProxy, int i, byte[] bArr) {
        return instanceProxy.b(i, bArr);
    }

    public static void routeCallReadableStream(InstanceProxy instanceProxy, int i, long j, byte[] bArr) {
        instanceProxy.c(i, j, bArr);
    }

    public static byte[] routeCallSync(InstanceProxy instanceProxy, int i, byte[] bArr) {
        return instanceProxy.e(i, bArr);
    }

    public static long[] routeGetImplMetadata(InstanceProxy instanceProxy) {
        mew mewVarA = instanceProxy.a();
        if (mewVarA == null) {
            return null;
        }
        ((asiu) mewVarA).aR();
        UpbMessage upbMessage = mewVarA.b;
        return new long[]{upbMessage.a, upbMessage.b.a, upbMessage.c.a};
    }

    public static boolean routeMethodExists(InstanceProxy instanceProxy, int i) {
        return instanceProxy.d(i);
    }

    public static void streamWriterOnStreamClosed(Consumer consumer, byte[] bArr) {
        consumer.r(Status.a(bArr));
    }

    public static void streamWriterOnStreamRead(Runnable runnable) {
        runnable.run();
    }
}
