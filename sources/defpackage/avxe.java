package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxe extends AtomicInteger implements avlk, axsq {
    private static final long serialVersionUID = -4945480365982832967L;
    final axsp a;
    final AtomicLong b = new AtomicLong();
    final AtomicReference c = new AtomicReference();
    final avxd e = new avxd(this);
    final awkd d = new awkd();

    public avxe(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        awka.f(this.e);
        atqp.x(this.a, th, this, this.d);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        awka.j(this.c, this.b, axsqVar);
    }

    @Override // defpackage.axsq
    public final void kj() {
        awka.f(this.c);
        awka.f(this.e);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        atqp.y(this.a, obj, this, this.d);
    }

    @Override // defpackage.axsp
    public final void kn() {
        awka.f(this.e);
        atqp.v(this.a, this, this.d);
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        awka.a(this.c, this.b, j);
    }
}
