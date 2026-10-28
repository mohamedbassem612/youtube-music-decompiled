package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ynq implements tpq {
    public volatile Optional a;
    private final tpq b;
    private final avlh c;
    private final MessageLite d;
    private final Object e = new Object();
    private final awkv f;
    private final ListenableFuture g;

    public ynq(tpq tpqVar, MessageLite messageLite) {
        this.b = tpqVar;
        awkv awkvVarAI = new awku().aI();
        this.f = awkvVarAI;
        this.c = awkvVarAI.P().E().p();
        this.a = Optional.empty();
        this.d = messageLite;
        this.g = g();
    }

    private final ListenableFuture g() {
        ListenableFuture listenableFutureA = this.b.a();
        thc thcVar = new thc(this, 11);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        ahcq ahcqVar = new ahcq(listenableFutureA, thcVar);
        listenableFutureA.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
        MessageLite messageLite = this.d;
        thc thcVar2 = new thc(messageLite == null ? aher.a : new aher(messageLite), 12);
        Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
        int i = ahbz.d;
        ahbx ahbxVar = new ahbx(ahcqVar, Exception.class, thcVar2);
        ahcqVar.addListener(ahbxVar, MoreExecutors.c(executorDirectExecutor2, ahbxVar));
        return ahng.o(ahbxVar);
    }

    private static ListenableFuture h(ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        thc thcVar = new thc(listenableFuture2, 12);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahbz.d;
        ahbx ahbxVar = new ahbx(listenableFuture, Exception.class, thcVar);
        listenableFuture.addListener(ahbxVar, MoreExecutors.c(executorDirectExecutor, ahbxVar));
        return ahbxVar;
    }

    @Override // defpackage.tpq
    public final ListenableFuture a() {
        if (this.a.isPresent()) {
            return new aher(this.a.get());
        }
        ListenableFuture listenableFuture = this.g;
        return listenableFuture.isDone() ? g() : listenableFuture;
    }

    @Override // defpackage.tpq
    public final ListenableFuture b(agek agekVar) {
        ListenableFuture listenableFutureH;
        synchronized (this.e) {
            if (this.a.isEmpty()) {
                listenableFutureH = h(this.b.b(new tvm(this, agekVar, 17)), aher.a);
            } else {
                MessageLite messageLite = (MessageLite) agekVar.apply(this.a.get());
                e(messageLite);
                listenableFutureH = h(this.b.b(new xwd(messageLite, 5)), aher.a);
            }
        }
        return listenableFutureH;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // defpackage.tpq
    public final MessageLite c() {
        if (this.a.isPresent()) {
            return this.a.get();
        }
        ListenableFuture listenableFuture = this.g;
        if (listenableFuture.isDone()) {
            f(this.b.c());
            return this.a.get();
        }
        try {
            return (MessageLite) listenableFuture.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return this.d;
        } catch (ExecutionException unused2) {
            return this.d;
        }
    }

    @Override // defpackage.tpq
    public final avlh d() {
        return this.c;
    }

    public final void e(MessageLite messageLite) {
        synchronized (this.e) {
            this.f.kk(messageLite);
            this.a = Optional.of(messageLite);
        }
    }

    public final void f(MessageLite messageLite) {
        if (this.a.isPresent()) {
            return;
        }
        synchronized (this.e) {
            if (this.a.isEmpty()) {
                e(messageLite);
            }
        }
    }
}
