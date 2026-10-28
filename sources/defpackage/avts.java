package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avts extends AtomicInteger implements avlk, axsq {
    private static final long serialVersionUID = 8600231336733376951L;
    final axsp a;
    final avnn g;
    axsq i;
    volatile boolean j;
    final int b = Alert.DURATION_SHOW_INDEFINITELY;
    final AtomicLong c = new AtomicLong();
    final avmm d = new avmm();
    final awkd f = new awkd();
    final AtomicInteger e = new AtomicInteger(1);
    final AtomicReference h = new AtomicReference();

    public avts(axsp axspVar, avnn avnnVar) {
        this.a = axspVar;
        this.g = avnnVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.e.decrementAndGet();
        if (!awkh.e(this.f, th)) {
            atqp.n(th);
        } else {
            this.d.dispose();
            g();
        }
    }

    final awig d() {
        AtomicReference atomicReference;
        awig awigVar;
        do {
            atomicReference = this.h;
            awigVar = (awig) atomicReference.get();
            if (awigVar != null) {
                break;
            }
            awigVar = new awig(avlh.a);
        } while (!a.ap(atomicReference, awigVar));
        return awigVar;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.i, axsqVar)) {
            this.i = axsqVar;
            this.a.e(this);
            int i = this.b;
            if (i == Integer.MAX_VALUE) {
                axsqVar.ko(Long.MAX_VALUE);
            } else {
                axsqVar.ko(i);
            }
        }
    }

    final void f() {
        awig awigVar = (awig) this.h.get();
        if (awigVar != null) {
            awigVar.c();
        }
    }

    final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    final void h() {
        AtomicReference atomicReference;
        AtomicInteger atomicInteger;
        axsp axspVar;
        int iAddAndGet = 1;
        do {
            AtomicLong atomicLong = this.c;
            long j = atomicLong.get();
            long j2 = 0;
            while (true) {
                atomicReference = this.h;
                atomicInteger = this.e;
                axspVar = this.a;
                if (j2 == j) {
                    break;
                }
                if (this.j) {
                    f();
                    return;
                }
                awkd awkdVar = this.f;
                if (((Throwable) awkdVar.get()) != null) {
                    Throwable thD = awkh.d(awkdVar);
                    f();
                    axspVar.b(thD);
                    return;
                }
                int i = atomicInteger.get();
                awig awigVar = (awig) atomicReference.get();
                Object objKm = awigVar != null ? awigVar.km() : null;
                if (i != 0) {
                    if (objKm == null) {
                        break;
                    }
                } else if (objKm == null) {
                    Throwable thD2 = awkh.d(awkdVar);
                    if (thD2 != null) {
                        axspVar.b(thD2);
                        return;
                    } else {
                        axspVar.kn();
                        return;
                    }
                }
                axspVar.kk(objKm);
                j2++;
            }
            if (j2 == j) {
                if (this.j) {
                    f();
                    return;
                }
                awkd awkdVar2 = this.f;
                if (((Throwable) awkdVar2.get()) != null) {
                    Throwable thD3 = awkh.d(awkdVar2);
                    f();
                    axspVar.b(thD3);
                    return;
                }
                int i2 = atomicInteger.get();
                awig awigVar2 = (awig) atomicReference.get();
                boolean z = awigVar2 == null || awigVar2.i();
                if (i2 == 0 && z) {
                    Throwable thD4 = awkh.d(awkdVar2);
                    if (thD4 != null) {
                        axspVar.b(thD4);
                        return;
                    } else {
                        axspVar.kn();
                        return;
                    }
                }
            }
            if (j2 != 0) {
                atqp.F(atomicLong, j2);
                if (this.b != Integer.MAX_VALUE) {
                    this.i.ko(j2);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.j = true;
        this.i.kj();
        this.d.dispose();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [avlp, java.lang.Object] */
    @Override // defpackage.axsp
    public final void kk(Object obj) {
        try {
            ?? A = this.g.a(obj);
            this.e.getAndIncrement();
            avtr avtrVar = new avtr(this);
            if (this.j || !this.d.c(avtrVar)) {
                return;
            }
            A.F(avtrVar);
        } catch (Throwable th) {
            avkz.a(th);
            this.i.kj();
            b(th);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.e.decrementAndGet();
        g();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.c, j);
            g();
        }
    }
}
