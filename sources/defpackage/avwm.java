package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwm extends AtomicInteger implements avlk, axsq {
    private static final long serialVersionUID = -1776795561228106469L;
    final axsp a;
    final avnf b;
    final avos c;
    final AtomicLong d;
    final int e;
    final int f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;
    axsq j;
    Object k;
    int l;

    public avwm(axsp axspVar, avnf avnfVar, Object obj, int i) {
        this.a = axspVar;
        this.b = avnfVar;
        this.k = obj;
        this.e = i;
        this.f = i - (i >> 2);
        awif awifVar = new awif(i);
        this.c = awifVar;
        awifVar.j(obj);
        this.d = new AtomicLong();
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.h) {
            atqp.n(th);
            return;
        }
        this.i = th;
        this.h = true;
        d();
    }

    final void d() {
        Throwable th;
        if (getAndIncrement() == 0) {
            axsp axspVar = this.a;
            avos avosVar = this.c;
            int i = this.f;
            int i2 = this.l;
            int iAddAndGet = 1;
            do {
                AtomicLong atomicLong = this.d;
                long j = atomicLong.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.g) {
                        avosVar.c();
                        return;
                    }
                    boolean z = this.h;
                    if (z && (th = this.i) != null) {
                        avosVar.c();
                        axspVar.b(th);
                        return;
                    }
                    Object objKm = avosVar.km();
                    if (!z) {
                        if (objKm == null) {
                            break;
                        }
                    } else if (objKm == null) {
                        axspVar.kn();
                        return;
                    }
                    axspVar.kk(objKm);
                    j2++;
                    i2++;
                    if (i2 == i) {
                        this.j.ko(i);
                        i2 = 0;
                    }
                }
                if (j2 == j && this.h) {
                    Throwable th2 = this.i;
                    if (th2 != null) {
                        avosVar.c();
                        axspVar.b(th2);
                        return;
                    } else if (avosVar.i()) {
                        axspVar.kn();
                        return;
                    }
                }
                if (j2 != 0) {
                    atqp.F(atomicLong, j2);
                }
                this.l = i2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.j, axsqVar)) {
            this.j = axsqVar;
            this.a.e(this);
            axsqVar.ko(this.e - 1);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.g = true;
        this.j.kj();
        if (getAndIncrement() == 0) {
            this.c.c();
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.h) {
            return;
        }
        try {
            Object objA = this.b.a(this.k, obj);
            objA.getClass();
            this.k = objA;
            this.c.j(objA);
            d();
        } catch (Throwable th) {
            avkz.a(th);
            this.j.kj();
            b(th);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.h) {
            return;
        }
        this.h = true;
        d();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.d, j);
            d();
        }
    }
}
