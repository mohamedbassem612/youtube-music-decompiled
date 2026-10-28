package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avis {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final agfp g;

    public avis(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, agfp agfpVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = agfpVar;
        agfpVar.e();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
