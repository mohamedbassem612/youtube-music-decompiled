package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awik extends avmb implements awje {
    static final awij b;
    static final awja c;
    static final int d;
    static final awiy g;
    final ThreadFactory e;
    final AtomicReference f;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        d = iAvailableProcessors;
        awiy awiyVar = new awiy(new awja("RxComputationShutdown", 5, false));
        g = awiyVar;
        awiyVar.dispose();
        awja awjaVar = new awja("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        c = awjaVar;
        awij awijVar = new awij(0, awjaVar);
        b = awijVar;
        awijVar.a();
    }

    public awik() {
        awja awjaVar = c;
        this.e = awjaVar;
        awij awijVar = b;
        AtomicReference atomicReference = new AtomicReference(awijVar);
        this.f = atomicReference;
        awij awijVar2 = new awij(d, awjaVar);
        if (a.av(atomicReference, awijVar, awijVar2)) {
            return;
        }
        awijVar2.a();
    }

    @Override // defpackage.avmb
    public final avma a() {
        return new awii(((awij) this.f.get()).c());
    }

    @Override // defpackage.awje
    public final void b(int i, awgg awggVar) {
        avoj.a(i, "number > 0 required");
        ((awij) this.f.get()).b(i, awggVar);
    }

    @Override // defpackage.avmb
    public final avmn c(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((awij) this.f.get()).c().e(runnable, j, timeUnit);
    }

    @Override // defpackage.avmb
    public final avmn d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((awij) this.f.get()).c().g(runnable, j, j2, timeUnit);
    }
}
