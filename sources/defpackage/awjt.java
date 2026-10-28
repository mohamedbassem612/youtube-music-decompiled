package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awjt extends AtomicInteger implements avlk, axsq {
    private static final long serialVersionUID = -4945028590049415624L;
    final axsp a;
    final awkd b = new awkd();
    final AtomicLong c = new AtomicLong();
    final AtomicReference d = new AtomicReference();
    final AtomicBoolean e = new AtomicBoolean();
    volatile boolean f;

    public awjt(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.f = true;
        atqp.x(this.a, th, this, this.b);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (this.e.compareAndSet(false, true)) {
            this.a.e(this);
            awka.j(this.d, this.c, axsqVar);
        } else {
            axsqVar.kj();
            kj();
            b(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.f) {
            return;
        }
        awka.f(this.d);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        atqp.y(this.a, obj, this, this.b);
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.f = true;
        atqp.v(this.a, this, this.b);
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (j > 0) {
            awka.a(this.d, this.c, j);
        } else {
            kj();
            b(new IllegalArgumentException(a.bS(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}
