package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awiu extends avma {
    final AtomicBoolean a = new AtomicBoolean();
    private final avmm b = new avmm();
    private final awit c;
    private final awiv d;

    public awiu(awit awitVar) {
        awiv awivVar;
        this.c = awitVar;
        if (awitVar.c.b) {
            awivVar = awiw.d;
        } else {
            while (!awitVar.b.isEmpty()) {
                awivVar = (awiv) awitVar.b.poll();
                if (awivVar != null) {
                }
            }
            awivVar = new awiv(awitVar.d);
            awitVar.c.c(awivVar);
        }
        this.d = awivVar;
    }

    @Override // defpackage.avma
    public final avmn b(Runnable runnable, long j, TimeUnit timeUnit) {
        avmm avmmVar = this.b;
        return avmmVar.b ? avns.a : this.d.h(runnable, j, timeUnit, avmmVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.a.compareAndSet(false, true)) {
            this.b.dispose();
            awit awitVar = this.c;
            awiv awivVar = this.d;
            awivVar.a = System.nanoTime() + awitVar.a;
            awitVar.b.offer(awivVar);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.a.get();
    }
}
