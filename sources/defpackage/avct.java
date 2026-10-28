package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avct implements avdz {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final int c;
    public final avkf d;
    public boolean e;
    public final axst f;
    private final boolean g;

    public avct(axst axstVar, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, avkf avkfVar) {
        boolean z = scheduledExecutorService == null;
        this.g = z;
        this.a = z ? (ScheduledExecutorService) avjw.a(avfp.n) : scheduledExecutorService;
        this.c = i;
        this.f = axstVar;
        this.b = executor;
        this.d = avkfVar;
    }

    @Override // defpackage.avdz
    public final ScheduledExecutorService a() {
        throw null;
    }

    @Override // defpackage.avdz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.g) {
            avjw.c(avfp.n, this.a);
        }
    }
}
