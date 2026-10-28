package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rjb {
    public final Object b = new Object();
    public boolean c = false;
    private final boolean d;
    private ahex e;
    private static final rbm f = rbm.c(rjb.class);
    public static final rjb a = new rjb(true);

    public rjb(boolean z) {
        this.d = z;
    }

    public final ListenableFuture a(ListenableFuture listenableFuture, Class cls, agek agekVar) {
        return ahno.am(listenableFuture, cls, agekVar, h());
    }

    public final ListenableFuture b(ListenableFuture listenableFuture, Class cls, ahcy ahcyVar) {
        return ahno.an(listenableFuture, cls, ahcyVar, h());
    }

    public final ListenableFuture c(Callable callable) {
        return h().submit(afwl.j(callable));
    }

    public final ListenableFuture d(ListenableFuture listenableFuture, agek agekVar) {
        return ahno.ar(listenableFuture, agekVar, h());
    }

    public final ListenableFuture e(ListenableFuture listenableFuture, ahcy ahcyVar) {
        return ahno.as(listenableFuture, ahcyVar, h());
    }

    public final ListenableFuture f(Collection collection, ahcx ahcxVar) {
        return ahno.au(collection).l(ahcxVar, h());
    }

    public final ListenableFuture g(ListenableFuture listenableFuture, Callable callable) {
        return ahno.au(agke.q(listenableFuture)).k(callable, h());
    }

    public final ahex h() {
        ahex ahexVarA;
        synchronized (this.b) {
            ahexVarA = this.e;
            if (ahexVarA == null) {
                if (this.c && !this.d) {
                    rbc rbcVar = new rbc(f, rbd.e);
                    rbcVar.c();
                    rbcVar.a = new Exception();
                    rbcVar.a("Trying to access a background executor after it was stopped.", new Object[0]);
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                ahfi ahfiVar = new ahfi();
                ahfiVar.c("engine-pool-thread-%d");
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 30L, timeUnit, linkedBlockingQueue, ahfi.a(ahfiVar));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
                ahexVarA = MoreExecutors.a(threadPoolExecutor);
                this.e = ahexVarA;
            }
        }
        return ahexVarA;
    }

    public final void i(Runnable runnable) {
        h().execute(runnable);
    }

    public final void j() {
        ahex ahexVar;
        synchronized (this.b) {
            ahexVar = this.e;
            this.e = null;
            this.c = true;
        }
        if (ahexVar != null) {
            try {
                rjs.b(ahexVar, "engine pool thread");
            } catch (InterruptedException e) {
                rbc rbcVar = new rbc(f, rbd.d);
                rbcVar.a = e;
                rbcVar.c();
                rbcVar.a("Interrupted while waiting for engine pool to finish.", new Object[0]);
            }
        }
    }
}
