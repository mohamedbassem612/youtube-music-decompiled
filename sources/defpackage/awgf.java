package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
abstract class awgf extends AtomicInteger implements Runnable, avlk, axsq {
    private static final long serialVersionUID = 9222303586456402150L;
    final int a;
    final int b;
    final awif c;
    final avma d;
    axsq e;
    volatile boolean f;
    Throwable g;
    final AtomicLong h = new AtomicLong();
    volatile boolean i;
    int j;

    public awgf(int i, awif awifVar, avma avmaVar) {
        this.a = i;
        this.c = awifVar;
        this.b = i - (i >> 2);
        this.d = avmaVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.f) {
            atqp.n(th);
            return;
        }
        this.g = th;
        this.f = true;
        d();
    }

    final void d() {
        if (getAndIncrement() == 0) {
            this.d.a(this);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.e.kj();
        this.d.dispose();
        if (getAndIncrement() == 0) {
            this.c.c();
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.f) {
            return;
        }
        if (this.c.j(obj)) {
            d();
        } else {
            this.e.kj();
            b(new avmx("Queue is full?!"));
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.f) {
            return;
        }
        this.f = true;
        d();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.h, j);
            d();
        }
    }
}
