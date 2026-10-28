package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdj implements avdz {
    public final avdz a;

    public avdj(avdz avdzVar, Executor executor) {
        avdzVar.getClass();
        this.a = avdzVar;
        executor.getClass();
    }

    @Override // defpackage.avdz
    public final ScheduledExecutorService a() {
        return ((avct) ((aviq) this.a).a).a;
    }

    @Override // defpackage.avdz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
