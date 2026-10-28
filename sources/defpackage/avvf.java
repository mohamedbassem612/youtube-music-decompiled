package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avvf extends awju implements avlk {
    private static final long serialVersionUID = -2514538129242366402L;
    final axsp a;
    final avos b;
    axsq c;
    volatile boolean d;
    volatile boolean e;
    Throwable f;
    final AtomicLong g = new AtomicLong();
    boolean h;

    public avvf(axsp axspVar, int i) {
        this.a = axspVar;
        this.b = new awig(i);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.f = th;
        this.e = true;
        if (this.h) {
            this.a.b(th);
        } else {
            d();
        }
    }

    @Override // defpackage.avot
    public final void c() {
        this.b.c();
    }

    final void d() {
        if (getAndIncrement() == 0) {
            avos avosVar = this.b;
            axsp axspVar = this.a;
            int iAddAndGet = 1;
            while (!f(this.e, avosVar.i(), axspVar)) {
                AtomicLong atomicLong = this.g;
                long j = atomicLong.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.e;
                    Object objKm = avosVar.km();
                    boolean z2 = objKm == null;
                    if (!f(z, z2, axspVar)) {
                        if (z2) {
                            break;
                        }
                        axspVar.kk(objKm);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (j2 == j && f(this.e, avosVar.i(), axspVar)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    atomicLong.addAndGet(-j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.c, axsqVar)) {
            this.c = axsqVar;
            this.a.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    final boolean f(boolean z, boolean z2, axsp axspVar) {
        if (this.d) {
            this.b.c();
            return true;
        }
        if (z) {
            Throwable th = this.f;
            if (th != null) {
                this.b.c();
                axspVar.b(th);
                return true;
            }
            if (z2) {
                axspVar.kn();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.b.i();
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.kj();
        if (getAndIncrement() == 0) {
            this.b.c();
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.b.j(obj);
        if (this.h) {
            this.a.kk(null);
        } else {
            d();
        }
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.h = true;
        return 2;
    }

    @Override // defpackage.avot
    public final Object km() {
        return this.b.km();
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.e = true;
        if (this.h) {
            this.a.kn();
        } else {
            d();
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (this.h || !awka.h(j)) {
            return;
        }
        atqp.B(this.g, j);
        d();
    }
}
