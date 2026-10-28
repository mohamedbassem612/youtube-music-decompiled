package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avsq extends AtomicLong implements avlk, axsq {
    private static final long serialVersionUID = -9102637559663639004L;
    final axsp a;
    final long b;
    final TimeUnit c;
    final avma d;
    axsq e;
    avmn f;
    volatile long g;
    boolean h;

    public avsq(axsp axspVar, long j, TimeUnit timeUnit, avma avmaVar) {
        this.a = axspVar;
        this.b = j;
        this.c = timeUnit;
        this.d = avmaVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.h) {
            atqp.n(th);
            return;
        }
        this.h = true;
        Object obj = this.f;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        this.a.b(th);
        this.d.dispose();
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.e, axsqVar)) {
            this.e = axsqVar;
            this.a.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.e.kj();
        this.d.dispose();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.h) {
            return;
        }
        long j = this.g + 1;
        this.g = j;
        Object obj2 = this.f;
        if (obj2 != null) {
            avnr.b((AtomicReference) obj2);
        }
        avsp avspVar = new avsp(obj, j, this);
        this.f = avspVar;
        avnr.g(avspVar, this.d.b(avspVar, this.b, this.c));
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.h) {
            return;
        }
        this.h = true;
        Object obj = this.f;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            ((avsp) obj).a();
        }
        this.a.kn();
        this.d.dispose();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this, j);
        }
    }
}
