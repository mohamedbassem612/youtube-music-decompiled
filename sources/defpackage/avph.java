package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avph implements avlc {
    final AtomicBoolean a;
    final avmm b;
    final avlc c;
    avmn d;

    public avph(AtomicBoolean atomicBoolean, avmm avmmVar, avlc avlcVar) {
        this.a = atomicBoolean;
        this.b = avmmVar;
        this.c = avlcVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        if (!this.a.compareAndSet(false, true)) {
            atqp.n(th);
            return;
        }
        avmm avmmVar = this.b;
        avmmVar.d(this.d);
        avmmVar.dispose();
        this.c.b(th);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        this.d = avmnVar;
        this.b.c(avmnVar);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        if (this.a.compareAndSet(false, true)) {
            avmm avmmVar = this.b;
            avmmVar.d(this.d);
            avmmVar.dispose();
            this.c.kn();
        }
    }
}
