package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaou {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/player/OfflineFallbackStrategyFutureUtil");
    private final abmt b;

    public aaou(abmt abmtVar) {
        this.b = abmtVar;
    }

    public static ListenableFuture a(ListenableFuture listenableFuture, Set set, ahcy ahcyVar, Executor executor) {
        return ahbz.f(listenableFuture, Exception.class, new aaoq(set, ahcyVar, 0), executor);
    }

    public static ListenableFuture c(ListenableFuture listenableFuture, int i, ScheduledExecutorService scheduledExecutorService) {
        return ahcs.e(listenableFuture, new iow(i, 3), scheduledExecutorService);
    }

    public final ListenableFuture b(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, long j, ScheduledExecutorService scheduledExecutorService, agkz agkzVar) {
        abmt abmtVar = this.b;
        agke agkeVarF = ahng.f(agke.r(listenableFuture, abmtVar.g.m(89, 45571970L) ? ahno.an(listenableFuture2, Throwable.class, new oly(10), scheduledExecutorService) : listenableFuture2));
        ListenableFuture listenableFutureU = ahng.u(ahng.o(c(listenableFuture, 0, scheduledExecutorService)), j, TimeUnit.MILLISECONDS, scheduledExecutorService);
        agkx agkxVar = new agkx();
        agkxVar.j(agkzVar);
        agkxVar.c(TimeoutException.class);
        ListenableFuture listenableFutureA = a(listenableFutureU, agkxVar.g(), new qmw(agkeVarF, scheduledExecutorService, agkzVar, listenableFuture, 11, (char[]) null), scheduledExecutorService);
        if (abmtVar.bV()) {
            ahng.z(listenableFutureA, listenableFuture);
            ahng.z(listenableFutureA, listenableFuture2);
        }
        return listenableFutureA;
    }

    public final ListenableFuture d(String str, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, long j, agkz agkzVar, ScheduledExecutorService scheduledExecutorService, aalv aalvVar, agex agexVar, int i) {
        ListenableFuture listenableFutureB = b(listenableFuture, listenableFuture2, j, scheduledExecutorService, agkzVar);
        ahng.x(listenableFutureB, new aaor(agexVar, aalvVar, str, i, listenableFuture2, MoreExecutors.directExecutor()), MoreExecutors.directExecutor());
        return ahcs.e(listenableFutureB, new aakt(9), MoreExecutors.directExecutor());
    }
}
