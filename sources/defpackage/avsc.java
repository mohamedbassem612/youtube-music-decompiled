package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avsc extends AtomicInteger implements avlk, axsq {
    private static final long serialVersionUID = -4255299542215038287L;
    final axsp a;
    final avnn b;
    final int c;
    final int d;
    final awig g;
    axsq h;
    volatile boolean i;
    volatile boolean j;
    volatile awjo k;
    final int l = 1;
    final awkd e = new awkd();
    final AtomicLong f = new AtomicLong();

    public avsc(axsp axspVar, avnn avnnVar, int i, int i2) {
        this.a = axspVar;
        this.b = avnnVar;
        this.c = i;
        this.d = i2;
        this.g = new awig(Math.min(i2, i));
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (!awkh.e(this.e, th)) {
            atqp.n(th);
        } else {
            this.j = true;
            f();
        }
    }

    final void d() {
        awjo awjoVar = this.k;
        this.k = null;
        if (awjoVar != null) {
            awka.f(awjoVar);
        }
        while (true) {
            awjo awjoVar2 = (awjo) this.g.km();
            if (awjoVar2 == null) {
                return;
            } else {
                awka.f(awjoVar2);
            }
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.h, axsqVar)) {
            this.h = axsqVar;
            this.a.e(this);
            int i = this.c;
            axsqVar.ko(i == Integer.MAX_VALUE ? Long.MAX_VALUE : i);
        }
    }

    public final void f() {
        awjo awjoVar;
        int i;
        long j;
        avot avotVar;
        long j2;
        int i2;
        if (getAndIncrement() != 0) {
            return;
        }
        awjo awjoVar2 = this.k;
        axsp axspVar = this.a;
        int i3 = this.l;
        int i4 = 1;
        int iAddAndGet = 1;
        while (true) {
            AtomicLong atomicLong = this.f;
            long j3 = atomicLong.get();
            if (awjoVar2 == null) {
                awkd awkdVar = this.e;
                if (((Throwable) awkdVar.get()) != null) {
                    d();
                    axspVar.b(awkh.d(awkdVar));
                    return;
                }
                boolean z = this.j;
                awjoVar = (awjo) this.g.km();
                if (z && awjoVar == null) {
                    Throwable thD = awkh.d(awkdVar);
                    if (thD != null) {
                        axspVar.b(thD);
                        return;
                    } else {
                        axspVar.kn();
                        return;
                    }
                }
                if (awjoVar != null) {
                    this.k = awjoVar;
                }
            } else {
                awjoVar = awjoVar2;
            }
            if (awjoVar == null || (avotVar = awjoVar.c) == null) {
                iAddAndGet = iAddAndGet;
                i = 0;
                j = 0;
            } else {
                j = 0;
                while (true) {
                    if (j != j3) {
                        if (this.i) {
                            d();
                            return;
                        }
                        if (i3 == i4 && ((Throwable) this.e.get()) != null) {
                            this.k = null;
                            awka.f(awjoVar);
                            d();
                            axspVar.b(awkh.d(this.e));
                            return;
                        }
                        boolean z2 = awjoVar.d;
                        try {
                            Object objKm = avotVar.km();
                            if (!z2) {
                                j2 = 1;
                                if (objKm == null) {
                                }
                            } else {
                                if (objKm == null) {
                                    this.k = null;
                                    this.h.ko(1L);
                                    i = i4;
                                    awjoVar = null;
                                    break;
                                }
                                j2 = 1;
                            }
                            axspVar.kk(objKm);
                            j += j2;
                            if (awjoVar.f != i4) {
                                long j4 = awjoVar.e + j2;
                                i2 = iAddAndGet;
                                if (j4 == awjoVar.b) {
                                    awjoVar.e = 0L;
                                    ((axsq) awjoVar.get()).ko(j4);
                                } else {
                                    awjoVar.e = j4;
                                }
                            } else {
                                i2 = iAddAndGet;
                            }
                            iAddAndGet = i2;
                            i4 = 1;
                        } catch (Throwable th) {
                            avkz.a(th);
                            this.k = null;
                            awka.f(awjoVar);
                            d();
                            axspVar.b(th);
                            return;
                        }
                    }
                    i = 0;
                    break;
                }
                if (j != j3) {
                    i4 = 1;
                } else {
                    if (this.i) {
                        d();
                        return;
                    }
                    i4 = 1;
                    if (i3 == 1 && ((Throwable) this.e.get()) != null) {
                        this.k = null;
                        awka.f(awjoVar);
                        d();
                        axspVar.b(awkh.d(this.e));
                        return;
                    }
                    boolean z3 = awjoVar.d;
                    boolean zI = avotVar.i();
                    if (z3 && zI) {
                        this.k = null;
                        this.h.ko(1L);
                        i = 1;
                        awjoVar = null;
                    }
                }
            }
            if (j != 0 && j3 != Long.MAX_VALUE) {
                atomicLong.addAndGet(-j);
            }
            if (i == 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = iAddAndGet;
            }
            awjoVar2 = awjoVar;
        }
    }

    final void g() {
        if (getAndIncrement() == 0) {
            do {
                d();
            } while (decrementAndGet() != 0);
        }
    }

    public final void h(awjo awjoVar) {
        awjoVar.d();
        f();
    }

    public final void i(awjo awjoVar, Throwable th) {
        if (!awkh.e(this.e, th)) {
            atqp.n(th);
            return;
        }
        awjoVar.d();
        this.h.kj();
        f();
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.h.kj();
        g();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        try {
            axso axsoVar = (axso) this.b.a(obj);
            axsoVar.getClass();
            awjo awjoVar = new awjo(this, this.d);
            if (this.i) {
                return;
            }
            this.g.j(awjoVar);
            axsoVar.aq(awjoVar);
            if (this.i) {
                awka.f(awjoVar);
                g();
            }
        } catch (Throwable th) {
            avkz.a(th);
            this.h.kj();
            b(th);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.j = true;
        f();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.f, j);
            f();
        }
    }
}
