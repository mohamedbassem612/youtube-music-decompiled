package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwz extends AtomicInteger implements avlk, axsq {
    static final avwy a;
    private static final long serialVersionUID = -3491074160481096299L;
    final axsp b;
    final avnn c;
    final int d;
    volatile boolean f;
    volatile boolean h;
    axsq i;
    volatile long l;
    final AtomicReference j = new AtomicReference();
    final AtomicLong k = new AtomicLong();
    final boolean e = false;
    final awkd g = new awkd();

    static {
        avwy avwyVar = new avwy(null, -1L, 1);
        a = avwyVar;
        awka.f(avwyVar);
    }

    public avwz(axsp axspVar, avnn avnnVar, int i) {
        this.b = axspVar;
        this.c = avnnVar;
        this.d = i;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.f || !awkh.e(this.g, th)) {
            atqp.n(th);
            return;
        }
        d();
        this.f = true;
        f();
    }

    final void d() {
        avwy avwyVar;
        AtomicReference atomicReference = this.j;
        avwy avwyVar2 = (avwy) atomicReference.get();
        avwy avwyVar3 = a;
        if (avwyVar2 == avwyVar3 || (avwyVar = (avwy) atomicReference.getAndSet(avwyVar3)) == avwyVar3 || avwyVar == null) {
            return;
        }
        awka.f(avwyVar);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.i, axsqVar)) {
            this.i = axsqVar;
            this.b.e(this);
        }
    }

    final void f() {
        boolean z;
        long j;
        Object objKm;
        if (getAndIncrement() == 0) {
            axsp axspVar = this.b;
            int iAddAndGet = 1;
            while (!this.h) {
                if (this.f) {
                    if (((Throwable) this.g.get()) != null) {
                        d();
                        axspVar.b(awkh.d(this.g));
                        return;
                    } else if (this.j.get() == null) {
                        axspVar.kn();
                        return;
                    }
                }
                AtomicReference atomicReference = this.j;
                avwy avwyVar = (avwy) atomicReference.get();
                avot avotVar = avwyVar != null ? avwyVar.d : null;
                if (avotVar != null) {
                    if (avwyVar.e) {
                        if (((Throwable) this.g.get()) != null) {
                            d();
                            axspVar.b(awkh.d(this.g));
                            return;
                        } else if (avotVar.i()) {
                            a.av(atomicReference, avwyVar, null);
                        }
                    }
                    long j2 = this.k.get();
                    long j3 = 0;
                    while (true) {
                        z = false;
                        if (j3 == j2) {
                            j = 0;
                            break;
                        }
                        if (!this.h) {
                            boolean z2 = avwyVar.e;
                            try {
                                objKm = avotVar.km();
                            } catch (Throwable th) {
                                avkz.a(th);
                                awka.f(avwyVar);
                                awkh.e(this.g, th);
                                z2 = true;
                                objKm = null;
                            }
                            j = 0;
                            AtomicReference atomicReference2 = this.j;
                            if (avwyVar == atomicReference2.get()) {
                                if (!z2) {
                                    if (objKm == null) {
                                        break;
                                    }
                                } else {
                                    awkd awkdVar = this.g;
                                    if (((Throwable) awkdVar.get()) != null) {
                                        axspVar.b(awkh.d(awkdVar));
                                        return;
                                    } else if (objKm == null) {
                                        a.av(atomicReference2, avwyVar, null);
                                    }
                                }
                                axspVar.kk(objKm);
                                j3++;
                            }
                            z = true;
                            break;
                        }
                        return;
                    }
                    if (j3 != j && !this.h) {
                        if (j2 != Long.MAX_VALUE) {
                            this.k.addAndGet(-j3);
                        }
                        if (avwyVar.f != 1) {
                            ((axsq) avwyVar.get()).ko(j3);
                        }
                    }
                    if (z) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.j.lazySet(null);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.i.kj();
        d();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        AtomicReference atomicReference;
        avwy avwyVar;
        if (this.f) {
            return;
        }
        long j = this.l + 1;
        this.l = j;
        avwy avwyVar2 = (avwy) this.j.get();
        if (avwyVar2 != null) {
            awka.f(avwyVar2);
        }
        try {
            axso axsoVar = (axso) this.c.a(obj);
            axsoVar.getClass();
            avwy avwyVar3 = new avwy(this, j, this.d);
            do {
                atomicReference = this.j;
                avwyVar = (avwy) atomicReference.get();
                if (avwyVar == a) {
                    return;
                }
            } while (!a.av(atomicReference, avwyVar, avwyVar3));
            axsoVar.aq(avwyVar3);
        } catch (Throwable th) {
            avkz.a(th);
            this.i.kj();
            b(th);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.f) {
            return;
        }
        this.f = true;
        f();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.k, j);
            if (this.l == 0) {
                this.i.ko(Long.MAX_VALUE);
            } else {
                f();
            }
        }
    }
}
