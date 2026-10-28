package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxu extends AtomicReference implements avok, axsq {
    private static final long serialVersionUID = -312246233408980075L;
    final axsp a;
    final avnf b;
    final AtomicReference c = new AtomicReference();
    final AtomicLong d = new AtomicLong();
    final AtomicReference e = new AtomicReference();

    public avxu(axsp axspVar, avnf avnfVar) {
        this.a = axspVar;
        this.b = avnfVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        awka.f(this.e);
        this.a.b(th);
    }

    @Override // defpackage.avok
    public final boolean d(Object obj) {
        Object obj2 = get();
        if (obj2 == null) {
            return false;
        }
        try {
            Object objA = this.b.a(obj, obj2);
            objA.getClass();
            this.a.kk(objA);
            return true;
        } catch (Throwable th) {
            avkz.a(th);
            kj();
            this.a.b(th);
            return false;
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        awka.j(this.c, this.d, axsqVar);
    }

    @Override // defpackage.axsq
    public final void kj() {
        awka.f(this.c);
        awka.f(this.e);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (d(obj)) {
            return;
        }
        ((axsq) this.c.get()).ko(1L);
    }

    @Override // defpackage.axsp
    public final void kn() {
        awka.f(this.e);
        this.a.kn();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        awka.a(this.c, this.d, j);
    }
}
