package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awfm extends AtomicReference implements avlw, avmn {
    private static final long serialVersionUID = 3764492702657003550L;
    public final avlw a;
    final TimeUnit c;
    public final avma d;
    public avlu h;
    final long b = 300;
    final avnv e = new avnv();
    public final AtomicLong f = new AtomicLong();
    public final AtomicReference g = new AtomicReference();

    public awfm(avlw avlwVar, TimeUnit timeUnit, avma avmaVar, avlu avluVar) {
        this.a = avlwVar;
        this.c = timeUnit;
        this.d = avmaVar;
        this.h = avluVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            atqp.n(th);
            return;
        }
        avnr.b(this.e);
        this.a.b(th);
        this.d.dispose();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.d(this.g, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this.g);
        avnr.b(this);
        this.d.dispose();
    }

    final void e(long j) {
        avnr.g(this.e, this.d.b(new avxl(j, this, 2), this.b, this.c));
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        AtomicLong atomicLong = this.f;
        long j = atomicLong.get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (atomicLong.compareAndSet(j, j2)) {
                ((avmn) this.e.get()).dispose();
                this.a.kk(obj);
                e(j2);
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            avnr.b(this.e);
            this.a.kn();
            this.d.dispose();
        }
    }
}
