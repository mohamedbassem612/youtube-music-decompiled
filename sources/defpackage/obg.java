package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obg implements obc {
    private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    @Override // defpackage.obc
    public final void b(Runnable runnable, long j) {
        this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.obc
    public final void a() {
    }
}
