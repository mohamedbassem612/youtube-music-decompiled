package defpackage;

import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awfy implements axsq {
    final int a;
    final int b;
    final /* synthetic */ awfz c;

    public awfy(awfz awfzVar, int i, int i2) {
        this.c = awfzVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.axsq
    public final void kj() {
        int i = this.b;
        int i2 = this.a;
        awfz awfzVar = this.c;
        AtomicLongArray atomicLongArray = awfzVar.b;
        if (atomicLongArray.compareAndSet(i + i2, 0L, 1L) && atomicLongArray.decrementAndGet(i << 1) == 0) {
            awfzVar.k = true;
            awfzVar.f.kj();
            if (awfzVar.getAndIncrement() == 0) {
                awfzVar.g.c();
            }
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        AtomicLongArray atomicLongArray;
        int i;
        long j2;
        if (awka.h(j)) {
            awfz awfzVar = this.c;
            do {
                atomicLongArray = awfzVar.b;
                i = this.a;
                j2 = atomicLongArray.get(i);
                if (j2 == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLongArray.compareAndSet(i, j2, atqp.D(j2, j)));
            if (awfzVar.l.get() == this.b) {
                awfzVar.d();
            }
        }
    }
}
