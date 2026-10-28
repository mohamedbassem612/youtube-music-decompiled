package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avqk extends AtomicInteger implements avlc {
    private static final long serialVersionUID = -8360547806504310570L;
    final avlc a;
    final AtomicBoolean b;
    final avmm c;

    public avqk(avlc avlcVar, AtomicBoolean atomicBoolean, avmm avmmVar) {
        this.a = avlcVar;
        this.b = atomicBoolean;
        this.c = avmmVar;
        lazySet(3);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.c.dispose();
        if (this.b.compareAndSet(false, true)) {
            this.a.b(th);
        } else {
            atqp.n(th);
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        this.c.c(avmnVar);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        if (decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
            this.a.kn();
        }
    }
}
