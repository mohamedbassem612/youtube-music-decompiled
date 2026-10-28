package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awiw extends avmb {
    static final awja b;
    static final awja c;
    static final awiv d;
    static final awit e;
    final ThreadFactory f;
    final AtomicReference g;
    private static final TimeUnit i = TimeUnit.SECONDS;
    private static final long h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        awiv awivVar = new awiv(new awja("RxCachedThreadSchedulerShutdown", 5, false));
        d = awivVar;
        awivVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        awja awjaVar = new awja("RxCachedThreadScheduler", iMax, false);
        b = awjaVar;
        c = new awja("RxCachedWorkerPoolEvictor", iMax, false);
        awit awitVar = new awit(0L, null, awjaVar);
        e = awitVar;
        awitVar.a();
    }

    public awiw() {
        awja awjaVar = b;
        this.f = awjaVar;
        awit awitVar = e;
        AtomicReference atomicReference = new AtomicReference(awitVar);
        this.g = atomicReference;
        awit awitVar2 = new awit(h, i, awjaVar);
        if (a.av(atomicReference, awitVar, awitVar2)) {
            return;
        }
        awitVar2.a();
    }

    @Override // defpackage.avmb
    public final avma a() {
        return new awiu((awit) this.g.get());
    }
}
