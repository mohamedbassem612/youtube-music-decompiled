package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avvj extends AtomicLong implements avlk, axsq {
    private static final long serialVersionUID = -6246093802440953054L;
    final axsp a;
    axsq b;
    boolean c;

    public avvj(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.c) {
            atqp.n(th);
        } else {
            this.c = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.b, axsqVar)) {
            this.b = axsqVar;
            this.a.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.b.kj();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.c || get() == 0) {
            return;
        }
        this.a.kk(obj);
        atqp.F(this, 1L);
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
            atqp.B(this, j);
        }
    }
}
