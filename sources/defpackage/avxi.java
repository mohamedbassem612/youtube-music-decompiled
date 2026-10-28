package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxi extends AtomicInteger implements Runnable, avlk, axsq {
    private static final long serialVersionUID = -8296689127439125014L;
    final axsp a;
    final long b;
    final TimeUnit c;
    final avma d;
    final boolean e;
    final AtomicReference f = new AtomicReference();
    final AtomicLong g = new AtomicLong();
    axsq h;
    volatile boolean i;
    Throwable j;
    volatile boolean k;
    volatile boolean l;
    long m;
    boolean n;

    public avxi(axsp axspVar, long j, TimeUnit timeUnit, avma avmaVar, boolean z) {
        this.a = axspVar;
        this.b = j;
        this.c = timeUnit;
        this.d = avmaVar;
        this.e = z;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.j = th;
        this.i = true;
        d();
    }

    final void d() {
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.f;
            AtomicLong atomicLong = this.g;
            axsp axspVar = this.a;
            int iAddAndGet = 1;
            while (!this.k) {
                boolean z = this.i;
                if (z && this.j != null) {
                    atomicReference.lazySet(null);
                    axspVar.b(this.j);
                    this.d.dispose();
                    return;
                }
                Object obj = atomicReference.get();
                if (z) {
                    if (obj == null || !this.e) {
                        atomicReference.lazySet(null);
                        axspVar.kn();
                    } else {
                        Object andSet = atomicReference.getAndSet(null);
                        long j = this.m;
                        if (j != atomicLong.get()) {
                            this.m = j + 1;
                            axspVar.kk(andSet);
                            axspVar.kn();
                        } else {
                            axspVar.b(new avmx("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.d.dispose();
                    return;
                }
                if (obj == null) {
                    if (this.l) {
                        this.n = false;
                        this.l = false;
                    }
                } else if (!this.n || this.l) {
                    Object andSet2 = atomicReference.getAndSet(null);
                    long j2 = this.m;
                    if (j2 == atomicLong.get()) {
                        this.h.kj();
                        axspVar.b(new avmx("Could not emit value due to lack of requests"));
                        this.d.dispose();
                        return;
                    } else {
                        axspVar.kk(andSet2);
                        this.m = j2 + 1;
                        this.l = false;
                        this.n = true;
                        this.d.b(this, this.b, this.c);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.h, axsqVar)) {
            this.h = axsqVar;
            this.a.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.k = true;
        this.h.kj();
        this.d.dispose();
        if (getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.f.set(obj);
        d();
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.i = true;
        d();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.g, j);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.l = true;
        d();
    }
}
