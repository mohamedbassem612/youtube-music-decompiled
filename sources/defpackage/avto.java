package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avto extends AtomicReference implements avlk, avmn {
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final avtp b;
    final int c;
    final int d;
    volatile boolean e;
    volatile avot f;
    long g;
    int h;

    public avto(avtp avtpVar, long j) {
        this.a = j;
        this.b = avtpVar;
        int i = avtpVar.f;
        this.d = i;
        this.c = i >> 2;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        lazySet(awka.CANCELLED);
        avtp avtpVar = this.b;
        if (!awkh.e(avtpVar.i, th)) {
            atqp.n(th);
            return;
        }
        this.e = true;
        avtpVar.m.kj();
        for (avto avtoVar : (avto[]) avtpVar.k.getAndSet(avtp.b)) {
            awka.f(avtoVar);
        }
        avtpVar.g();
    }

    final void d(long j) {
        if (this.h != 1) {
            long j2 = this.g + j;
            if (j2 < this.c) {
                this.g = j2;
            } else {
                this.g = 0L;
                ((axsq) get()).ko(j2);
            }
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        awka.f(this);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.g(this, axsqVar)) {
            if (axsqVar instanceof avoq) {
                avoq avoqVar = (avoq) axsqVar;
                int iKl = avoqVar.kl(7);
                if (iKl == 1) {
                    this.h = 1;
                    this.f = avoqVar;
                    this.e = true;
                    this.b.g();
                    return;
                }
                if (iKl == 2) {
                    this.h = 2;
                    this.f = avoqVar;
                }
            }
            axsqVar.ko(this.d);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == awka.CANCELLED;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        int i = this.h;
        avtp avtpVar = this.b;
        if (i == 2) {
            avtpVar.g();
            return;
        }
        if (avtpVar.get() == 0 && avtpVar.compareAndSet(0, 1)) {
            AtomicLong atomicLong = avtpVar.l;
            long j = atomicLong.get();
            avot awifVar = this.f;
            if (j == 0 || !(awifVar == null || awifVar.i())) {
                if (awifVar == null && (awifVar = this.f) == null) {
                    awifVar = new awif(avtpVar.f);
                    this.f = awifVar;
                }
                if (!awifVar.j(obj)) {
                    avtpVar.b(new avmx("Inner queue full?!"));
                    return;
                }
            } else {
                avtpVar.c.kk(obj);
                if (j != Long.MAX_VALUE) {
                    atomicLong.decrementAndGet();
                }
                d(1L);
            }
            if (avtpVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            avot avotVar = this.f;
            if (avotVar == null) {
                awif awifVar2 = new awif(avtpVar.f);
                this.f = awifVar2;
                avotVar = awifVar2;
            }
            if (!avotVar.j(obj)) {
                avtpVar.b(new avmx("Inner queue full?!"));
                return;
            } else if (avtpVar.getAndIncrement() != 0) {
                return;
            }
        }
        avtpVar.h();
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.e = true;
        this.b.g();
    }
}
