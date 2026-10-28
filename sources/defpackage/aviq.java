package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aviq implements avdz {
    public final avdz a;
    private final AtomicInteger b = new AtomicInteger(1);

    public aviq(avdz avdzVar) {
        this.a = avdzVar;
    }

    @Override // defpackage.avdz
    public final ScheduledExecutorService a() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    @Override // defpackage.avdz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int iDecrementAndGet = this.b.decrementAndGet();
        ahno.Q((iDecrementAndGet ^ (-1)) >>> 31, "Reference count has gone negative: %s", iDecrementAndGet);
        if (iDecrementAndGet == 0) {
            this.a.close();
        }
    }
}
