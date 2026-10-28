package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awam extends AtomicInteger implements avlk, axsq {
    static final awal a = new awal(null);
    private static final long serialVersionUID = -5402190102429853762L;
    final axsp b;
    final avnn c;
    final awkd d = new awkd();
    final AtomicLong e = new AtomicLong();
    final AtomicReference f = new AtomicReference();
    axsq g;
    volatile boolean h;
    volatile boolean i;
    long j;

    public awam(axsp axspVar, avnn avnnVar) {
        this.b = axspVar;
        this.c = avnnVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (!awkh.e(this.d, th)) {
            atqp.n(th);
            return;
        }
        d();
        this.h = true;
        f();
    }

    final void d() {
        AtomicReference atomicReference = this.f;
        awal awalVar = a;
        awal awalVar2 = (awal) atomicReference.getAndSet(awalVar);
        if (awalVar2 == null || awalVar2 == awalVar) {
            return;
        }
        avnr.b(awalVar2);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.g, axsqVar)) {
            this.g = axsqVar;
            this.b.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0011 A[SYNTHETIC] */
    final void f() {
        if (getAndIncrement() == 0) {
            axsp axspVar = this.b;
            awkd awkdVar = this.d;
            AtomicReference atomicReference = this.f;
            AtomicLong atomicLong = this.e;
            long j = this.j;
            int iAddAndGet = 1;
            while (!this.i) {
                if (awkdVar.get() != null) {
                    axspVar.b(awkh.d(awkdVar));
                    return;
                }
                boolean z = this.h;
                awal awalVar = (awal) atomicReference.get();
                if (!z) {
                    if (awalVar != null) {
                    }
                    this.j = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (awalVar == null) {
                    Throwable thD = awkh.d(awkdVar);
                    if (thD != null) {
                        axspVar.b(thD);
                        return;
                    } else {
                        axspVar.kn();
                        return;
                    }
                }
                if (awalVar.b == null || j == atomicLong.get()) {
                    this.j = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    a.av(atomicReference, awalVar, null);
                    axspVar.kk(awalVar.b);
                    j++;
                }
            }
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.i = true;
        this.g.kj();
        d();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        AtomicReference atomicReference;
        awal awalVar;
        awal awalVar2 = (awal) this.f.get();
        if (awalVar2 != null) {
            avnr.b(awalVar2);
        }
        try {
            avmf avmfVar = (avmf) this.c.a(obj);
            avmfVar.getClass();
            awal awalVar3 = new awal(this);
            do {
                atomicReference = this.f;
                awalVar = (awal) atomicReference.get();
                if (awalVar == a) {
                    return;
                }
            } while (!a.av(atomicReference, awalVar, awalVar3));
            avmfVar.F(awalVar3);
        } catch (Throwable th) {
            avkz.a(th);
            this.g.kj();
            this.f.getAndSet(a);
            b(th);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.h = true;
        f();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        atqp.B(this.e, j);
        f();
    }
}
