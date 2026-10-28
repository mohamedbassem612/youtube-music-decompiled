package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahej implements Runnable {
    private final /* synthetic */ int $cid;
    public Object a;
    public Object b;

    public ahej(ahcx ahcxVar, Executor executor, int i) {
        this.$cid = i;
        this.a = ahcxVar;
        executor.getClass();
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid == 0) {
            ahng.y(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }

    public ahej(ListenableFuture listenableFuture, Future future, int i) {
        this.$cid = i;
        this.a = listenableFuture;
        this.b = future;
    }
}
