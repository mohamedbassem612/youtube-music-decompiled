package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwu extends AtomicReference implements Runnable, avlk, axsq {
    private static final long serialVersionUID = 8094547886072529208L;
    final axsp a;
    final avma b;
    final AtomicReference c = new AtomicReference();
    final AtomicLong d = new AtomicLong();
    final boolean e;
    axso f;

    public avwu(axsp axspVar, avma avmaVar, axso axsoVar, boolean z) {
        this.a = axspVar;
        this.b = avmaVar;
        this.f = axsoVar;
        this.e = !z;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.a.b(th);
        this.b.dispose();
    }

    final void d(long j, axsq axsqVar) {
        if (this.e || Thread.currentThread() == get()) {
            axsqVar.ko(j);
        } else {
            this.b.a(new avxl(axsqVar, j, 1));
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.g(this.c, axsqVar)) {
            long andSet = this.d.getAndSet(0L);
            if (andSet != 0) {
                d(andSet, axsqVar);
            }
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        awka.f(this.c);
        this.b.dispose();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.a.kn();
        this.b.dispose();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            AtomicReference atomicReference = this.c;
            axsq axsqVar = (axsq) atomicReference.get();
            if (axsqVar != null) {
                d(j, axsqVar);
                return;
            }
            AtomicLong atomicLong = this.d;
            atqp.B(atomicLong, j);
            axsq axsqVar2 = (axsq) atomicReference.get();
            if (axsqVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    d(andSet, axsqVar2);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        axso axsoVar = this.f;
        this.f = null;
        axsoVar.aq(this);
    }
}
