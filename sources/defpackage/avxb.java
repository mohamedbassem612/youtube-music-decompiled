package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxb extends AtomicBoolean implements avlk, axsq {
    private static final long serialVersionUID = -5636543848937116287L;
    final axsp a;
    boolean c;
    axsq d;
    final long b = 1;
    long e = 1;

    public avxb(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.c) {
            atqp.n(th);
            return;
        }
        this.c = true;
        this.d.kj();
        this.a.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.d, axsqVar)) {
            this.d = axsqVar;
            if (this.b != 0) {
                this.a.e(this);
                return;
            }
            axsqVar.kj();
            this.c = true;
            awjx.d(this.a);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.d.kj();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.c) {
            return;
        }
        long j = this.e;
        long j2 = (-1) + j;
        this.e = j2;
        if (j > 0) {
            this.a.kk(obj);
            if (j2 == 0) {
                this.d.kj();
                kn();
            }
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.kn();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            if (get() || !compareAndSet(false, true) || j < this.b) {
                this.d.ko(j);
            } else {
                this.d.ko(Long.MAX_VALUE);
            }
        }
    }
}
