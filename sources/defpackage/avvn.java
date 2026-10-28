package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avvn extends AtomicInteger implements avlk, axsq {
    private static final long serialVersionUID = 163080509307634843L;
    final axsp a;
    axsq b;
    volatile boolean c;
    Throwable d;
    volatile boolean e;
    final AtomicLong f = new AtomicLong();
    final AtomicReference g = new AtomicReference();

    public avvn(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.d = th;
        this.c = true;
        d();
    }

    final void d() {
        if (getAndIncrement() == 0) {
            axsp axspVar = this.a;
            AtomicLong atomicLong = this.f;
            AtomicReference atomicReference = this.g;
            int iAddAndGet = 1;
            do {
                long j = 0;
                while (true) {
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.c;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (!f(z, z2, axspVar, atomicReference)) {
                        if (z2) {
                            break;
                        }
                        axspVar.kk(andSet);
                        j++;
                    } else {
                        return;
                    }
                }
                if (j == atomicLong.get()) {
                    if (f(this.c, atomicReference.get() == null, axspVar, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    atqp.F(atomicLong, j);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
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

    final boolean f(boolean z, boolean z2, axsp axspVar, AtomicReference atomicReference) {
        if (this.e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (z) {
            Throwable th = this.d;
            if (th != null) {
                atomicReference.lazySet(null);
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

    @Override // defpackage.axsq
    public final void kj() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.kj();
        if (getAndIncrement() == 0) {
            this.g.lazySet(null);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.g.lazySet(obj);
        d();
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.c = true;
        d();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.f, j);
            d();
        }
    }
}
