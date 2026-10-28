package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avxk extends AtomicLong implements avlk, axsq {
    private static final long serialVersionUID = 3764492702657003550L;
    final axsp a;
    final TimeUnit c;
    final avma d;
    final long b = 5;
    final avnv e = new avnv();
    final AtomicReference f = new AtomicReference();
    final AtomicLong g = new AtomicLong();

    public avxk(axsp axspVar, TimeUnit timeUnit, avma avmaVar) {
        this.a = axspVar;
        this.c = timeUnit;
        this.d = avmaVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            atqp.n(th);
            return;
        }
        avnr.b(this.e);
        this.a.b(th);
        this.d.dispose();
    }

    final void d(long j) {
        avnr.g(this.e, this.d.b(new avxl(j, this, 0), this.b, this.c));
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        awka.j(this.f, this.g, axsqVar);
    }

    @Override // defpackage.axsq
    public final void kj() {
        awka.f(this.f);
        this.d.dispose();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                ((avmn) this.e.get()).dispose();
                this.a.kk(obj);
                d(j2);
            }
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            avnr.b(this.e);
            this.a.kn();
            this.d.dispose();
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        awka.a(this.f, this.g, j);
    }
}
