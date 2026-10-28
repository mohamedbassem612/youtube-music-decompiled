package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avsn extends AtomicLong implements avlk, axsq {
    private static final long serialVersionUID = 6725975399620862591L;
    final axsp a;
    final avnn b;
    axsq c;
    final AtomicReference d = new AtomicReference();
    volatile long e;
    boolean f;

    public avsn(axsp axspVar, avnn avnnVar) {
        this.a = axspVar;
        this.b = avnnVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        avnr.b(this.d);
        this.a.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.c, axsqVar)) {
            this.c = axsqVar;
            this.a.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.c.kj();
        avnr.b(this.d);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [axso, java.lang.Object] */
    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.f) {
            return;
        }
        long j = this.e + 1;
        this.e = j;
        avmn avmnVar = (avmn) this.d.get();
        if (avmnVar != null) {
            avmnVar.dispose();
        }
        try {
            ?? A = this.b.a(obj);
            avsm avsmVar = new avsm(this, j, obj);
            if (a.av(this.d, avmnVar, avsmVar)) {
                A.aq(avsmVar);
            }
        } catch (Throwable th) {
            avkz.a(th);
            kj();
            this.a.b(th);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.f) {
            return;
        }
        this.f = true;
        AtomicReference atomicReference = this.d;
        avmn avmnVar = (avmn) atomicReference.get();
        if (avnr.c(avmnVar)) {
            return;
        }
        avsm avsmVar = (avsm) avmnVar;
        if (avsmVar != null) {
            avsmVar.d();
        }
        avnr.b(atomicReference);
        this.a.kn();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this, j);
        }
    }
}
