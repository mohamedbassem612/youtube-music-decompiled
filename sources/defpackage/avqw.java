package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avqw implements avlc {
    private final avmm a;
    private final AtomicBoolean b;
    private final avlc c;

    public avqw(avmm avmmVar, AtomicBoolean atomicBoolean, avlc avlcVar) {
        this.a = avmmVar;
        this.b = atomicBoolean;
        this.c = avlcVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        if (!this.b.compareAndSet(false, true)) {
            atqp.n(th);
        } else {
            this.a.dispose();
            this.c.b(th);
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        this.a.c(avmnVar);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        if (this.b.compareAndSet(false, true)) {
            this.a.dispose();
            this.c.kn();
        }
    }
}
