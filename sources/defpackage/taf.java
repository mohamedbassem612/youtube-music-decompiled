package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class taf {
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/common/concurrent/YouTubeFutures");
    private static final agfr e = aguu.al(new jxp(15));
    public static final Executor a = new vp(5);
    public static final tab b = new hmb(10);
    public static final tae c = new rro(2);

    public static ListenableFuture a(bog bogVar, ListenableFuture listenableFuture, agek agekVar) {
        bob bobVar = bob.b;
        boc lifecycle = bogVar.getLifecycle();
        taq.d();
        tad tadVar = new tad(bobVar, lifecycle, agekVar);
        ListenableFuture listenableFutureE = ahcs.e(listenableFuture, tadVar, a);
        tadVar.a = listenableFutureE;
        lifecycle.b(tadVar);
        return listenableFutureE;
    }

    public static Object b(Future future, agek agekVar) throws Exception {
        try {
            return future.get();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            Exception exc = (Exception) agekVar.apply(e2);
            exc.getClass();
            throw exc;
        } catch (ExecutionException e3) {
            r(e3.getCause(), agekVar);
            throw new AssertionError();
        }
    }

    public static Object c(Future future, agek agekVar, long j, TimeUnit timeUnit) throws Exception {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            Exception exc = (Exception) agekVar.apply(e2);
            exc.getClass();
            throw exc;
        } catch (ExecutionException e3) {
            r(e3.getCause(), agekVar);
            throw new AssertionError();
        } catch (TimeoutException e4) {
            Exception exc2 = (Exception) agekVar.apply(e4);
            exc2.getClass();
            throw exc2;
        }
    }

    public static Object d(Future future, Object obj) {
        try {
            return b(future, new sdp(2));
        } catch (Exception e2) {
            ((agrc) ((agrc) ((agrc) d.b()).j(e2)).k("com/google/android/libraries/youtube/common/concurrent/YouTubeFutures", "getCheckedOrDefault", '\\', "YouTubeFutures.java")).t("Failed to get the result of the future.");
            return obj;
        }
    }

    public static Object e(Future future, long j, TimeUnit timeUnit, Object obj) {
        try {
            return c(future, new sdp(2), j, timeUnit);
        } catch (Exception e2) {
            ((agrc) ((agrc) ((agrc) d.b()).j(e2)).k("com/google/android/libraries/youtube/common/concurrent/YouTubeFutures", "getCheckedOrDefault", 'j', "YouTubeFutures.java")).t("Failed to get the result of the future.");
            return obj;
        }
    }

    public static Object f(Future future, Object obj) {
        try {
            ahno.R(future.isDone(), "Future was expected to be done: %s", future);
            return a.i(future);
        } catch (Exception e2) {
            ((agrc) ((agrc) ((agrc) d.b()).j(e2)).k("com/google/android/libraries/youtube/common/concurrent/YouTubeFutures", "getDoneOrDefault", 'O', "YouTubeFutures.java")).t("Failed to get the value of the future.");
            return obj;
        }
    }

    public static void g(ListenableFuture listenableFuture, tae taeVar) {
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(taeVar, null, b);
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    public static void h(ListenableFuture listenableFuture, Executor executor, tab tabVar) {
        taa taaVar = new taa(c, null, tabVar);
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), taaVar, 0)), executor);
    }

    public static void i(ListenableFuture listenableFuture, Executor executor, tab tabVar, tae taeVar, Runnable runnable) {
        taa taaVar = new taa(taeVar, runnable, tabVar);
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), taaVar, 0)), executor);
    }

    public static void j(ListenableFuture listenableFuture, tab tabVar) {
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(c, null, tabVar);
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    public static void k(bog bogVar, ListenableFuture listenableFuture, twi twiVar, twi twiVar2) {
        boc lifecycle = bogVar.getLifecycle();
        bob bobVar = bob.b;
        taq.d();
        tac tacVar = new tac(bobVar, lifecycle, twiVar2, twiVar);
        Executor executor = a;
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), tacVar, 0)), executor);
    }

    public static void l(bog bogVar, ListenableFuture listenableFuture, twi twiVar, twi twiVar2) {
        q(bogVar.getLifecycle(), listenableFuture, twiVar, twiVar2, bob.e);
    }

    public static void m(bog bogVar, ListenableFuture listenableFuture, twi twiVar, twi twiVar2) {
        q(bogVar.getLifecycle(), listenableFuture, twiVar, twiVar2, bob.d);
    }

    public static void n(ListenableFuture listenableFuture, Executor executor, tae taeVar) {
        taa taaVar = new taa(taeVar, null, b);
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), taaVar, 0)), executor);
    }

    public static /* synthetic */ void o(Runnable runnable) {
        if (a.x()) {
            runnable.run();
        } else {
            ((Executor) e.io()).execute(runnable);
        }
    }

    private static void q(boc bocVar, ListenableFuture listenableFuture, twi twiVar, twi twiVar2, bob bobVar) {
        taq.d();
        tac tacVar = new tac(bobVar, bocVar, twiVar2, twiVar);
        Executor executor = a;
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), tacVar, 0)), executor);
    }

    private static void r(Throwable th, agek agekVar) throws Exception {
        if (th instanceof Error) {
            throw new ahdu((Error) th);
        }
        if (th instanceof RuntimeException) {
            throw new ahfp(th);
        }
        Exception exc = (Exception) agekVar.apply(th);
        exc.getClass();
        throw exc;
    }
}
