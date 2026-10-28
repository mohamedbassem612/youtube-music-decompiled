package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tah implements tag {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/common/concurrent/arbiter/ConcurrencyArbiterImpl");
    public final Executor a;
    private final ScheduledExecutorService c;
    private final Executor d;
    private final Executor e;
    private final ScheduledExecutorService f;
    private final tqj g;

    public tah(tqj tqjVar, ScheduledExecutorService scheduledExecutorService, Executor executor, awmd awmdVar, awmd awmdVar2) {
        int i = tqr.a;
        long jC = tqjVar.c(1075839383);
        if ((1 & jC) != 0 || tqjVar.k(1073815121)) {
            this.c = (ScheduledExecutorService) awmdVar.io();
            this.a = new ahfg((Executor) awmdVar2.io());
        } else {
            this.c = scheduledExecutorService;
            this.a = new ahfg(executor);
        }
        if ((jC & 32) != 0) {
            this.d = executor;
        } else {
            this.d = MoreExecutors.directExecutor();
        }
        this.e = executor;
        this.f = scheduledExecutorService;
        this.g = tqjVar;
    }

    @Override // defpackage.tag
    public final ScheduledFuture a(tai taiVar, Runnable runnable, long j, TimeUnit timeUnit) {
        if (taiVar.ordinal() != 0) {
            throw new UnsupportedOperationException("ConcurrencyArbiter does not support ".concat(taiVar.toString()));
        }
        tqj tqjVar = this.g;
        int i = tqr.a;
        return tqjVar.k(1073815165) ? this.f.schedule(new sxk(this, runnable, 2), j, timeUnit) : this.c.schedule(afwl.i(runnable), j, timeUnit);
    }

    @Override // defpackage.tag
    @Deprecated
    public final void b(tai taiVar, Runnable runnable) {
        int iOrdinal = taiVar.ordinal();
        if (iOrdinal == 0) {
            this.c.execute(afwl.i(runnable));
            return;
        }
        if (iOrdinal == 1) {
            this.a.execute(afwl.i(runnable));
            return;
        }
        if (iOrdinal == 2) {
            this.e.execute(afwl.i(runnable));
        } else if (iOrdinal == 3) {
            this.d.execute(afwl.i(runnable));
        } else {
            ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/common/concurrent/arbiter/ConcurrencyArbiterImpl", "execute", 94, "ConcurrencyArbiterImpl.java")).w("Using default bgExecutor for feature : %s", taiVar);
            this.e.execute(afwl.i(runnable));
        }
    }
}
