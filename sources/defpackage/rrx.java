package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rrx implements rrh {
    public final Context a;
    public volatile agev b;
    public final ScheduledExecutorService c;
    private final ListenableFuture d;
    private final ListenableFuture e;
    private final agfr f;
    private final ListenableFuture g;

    public rrx(vxu vxuVar, tre treVar, avlb avlbVar, Context context, ScheduledExecutorService scheduledExecutorService, avmb avmbVar, rmp rmpVar, tqj tqjVar, agev agevVar) {
        agdf agdfVar = agdf.a;
        this.b = agdfVar;
        this.a = context;
        this.c = scheduledExecutorService;
        ListenableFuture listenableFutureAr = ahno.ar(vxuVar.a(), new rmk(9), MoreExecutors.directExecutor());
        this.g = ahno.ar(vxuVar.a(), new rmk(8), MoreExecutors.directExecutor());
        this.d = g(listenableFutureAr, new qoh(context, 10), agdfVar, scheduledExecutorService);
        g(listenableFutureAr, new qoh(treVar, 9), agdfVar, scheduledExecutorService);
        this.e = ahno.as(listenableFutureAr, new okm(this, avlbVar, avmbVar, rmpVar, tqjVar, 5), scheduledExecutorService);
        this.f = aguu.al(new rrw(tqjVar, agevVar, listenableFutureAr, scheduledExecutorService, 0));
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, Object obj, long j, ScheduledExecutorService scheduledExecutorService) {
        return ahno.am(ahng.u(listenableFuture, j, TimeUnit.SECONDS, scheduledExecutorService), TimeoutException.class, new rns(obj, 6), MoreExecutors.directExecutor());
    }

    static ListenableFuture g(ListenableFuture listenableFuture, Callable callable, Object obj, ScheduledExecutorService scheduledExecutorService) {
        return ahno.as(listenableFuture, new qzc(callable, scheduledExecutorService, obj, 4), MoreExecutors.directExecutor());
    }

    @Override // defpackage.rrh
    public final ListenableFuture a() {
        return ahng.o(this.e);
    }

    @Override // defpackage.rrh
    public final ListenableFuture b() {
        return ahng.o((ListenableFuture) this.f.io());
    }

    @Override // defpackage.rrh
    public final ListenableFuture c() {
        return ahng.o(this.d);
    }

    @Override // defpackage.rrh
    public final void d() {
        ahno.as(this.g, new qmu(this, 15), MoreExecutors.directExecutor());
    }

    @Override // defpackage.rrh
    public final int e() {
        ListenableFuture listenableFuture = this.d;
        agev agevVar = listenableFuture.isDone() ? (agev) taf.f(listenableFuture, agdf.a) : agdf.a;
        if (!agevVar.g()) {
            return 1;
        }
        long jLongValue = ((Long) agevVar.c()).longValue();
        int i = 4;
        if (jLongValue < rpi.T(4)) {
            i = 5;
            if (jLongValue < rpi.T(5)) {
                i = 3;
                if (jLongValue < rpi.T(3)) {
                    i = 2;
                    if (jLongValue < rpi.T(2)) {
                        return 1;
                    }
                }
            }
        }
        return i;
    }
}
