package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afkf implements ExecutorService, AutoCloseable {
    private static final agrf g = agrf.h("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor");
    public final boolean b;
    public boolean c;
    public ListenableFuture d;
    public afke e;
    private final Executor h;
    private final boolean j;
    public final Deque a = new ArrayDeque();
    public int f = 1;
    private final afkd k = new afkd(this);
    private final boolean i = true;

    public afkf(Executor executor, boolean z, boolean z2) {
        this.h = executor;
        this.b = z;
        this.j = z2;
    }

    public static /* synthetic */ void a(ListenableFuture listenableFuture, String str) {
        try {
            ahng.v(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((agrc) ((agrc) ((agrc) g.b()).j(e.getCause())).k("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor", "logOnFailure", (char) 426, "SuspendableUiThreadExecutor.java")).t(str);
        }
    }

    private static void b(ListenableFuture listenableFuture, String str) {
        listenableFuture.addListener(afwl.i(new aead(listenableFuture, str, 20)), MoreExecutors.directExecutor());
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.as(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        runnable.getClass();
        Deque deque = this.a;
        synchronized (deque) {
            if (this.c || (i = this.f) == 3 || i == 2) {
                deque.add(runnable);
            } else {
                deque.add(runnable);
                if (this.b) {
                    afke afkeVar = new afke(this.k);
                    this.e = afkeVar;
                    this.h.execute(afwl.i(afkeVar));
                } else {
                    ListenableFuture listenableFutureQ = ahng.q(afwl.i(this.k), this.h);
                    this.d = listenableFutureQ;
                    if (this.j) {
                        b(listenableFutureQ, "Silently ignored exception in MainImmediateContext.");
                    } else {
                        b(listenableFutureQ, "Silently ignored exception in SuspendableUiThreadExecutor.");
                    }
                }
                this.f = 2;
            }
        }
        synchronized (this.a) {
            z = false;
            if (qpj.g() && this.i && !this.c && this.f != 3) {
                if (this.b) {
                    afke afkeVar2 = this.e;
                    afkeVar2.getClass();
                    afkeVar2.a();
                    this.e = null;
                } else {
                    ListenableFuture listenableFuture = this.d;
                    listenableFuture.getClass();
                    listenableFuture.cancel(false);
                    this.d = null;
                }
                this.f = 2;
                z = true;
            }
        }
        if (z) {
            this.k.run();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return ahng.r(new aalq(runnable, obj, 20, null), this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return ahng.q(runnable, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return ahng.r(callable, this);
    }
}
