package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avsi extends avse {
    private static final long serialVersionUID = 4023437720691792495L;
    final AtomicReference c;
    Throwable d;
    volatile boolean e;
    final AtomicInteger f;

    public avsi(axsp axspVar) {
        super(axspVar);
        this.c = new AtomicReference();
        this.f = new AtomicInteger();
    }

    @Override // defpackage.avlg
    public final void c(Object obj) {
        if (this.e || j()) {
            return;
        }
        this.c.set(obj);
        l();
    }

    @Override // defpackage.avse
    public final void g() {
        l();
    }

    @Override // defpackage.avse
    public final void h() {
        if (this.f.getAndIncrement() == 0) {
            this.c.lazySet(null);
        }
    }

    @Override // defpackage.avse
    public final boolean k(Throwable th) {
        if (this.e || j()) {
            return false;
        }
        this.d = th;
        this.e = true;
        l();
        return true;
    }

    final void l() {
        AtomicInteger atomicInteger = this.f;
        if (atomicInteger.getAndIncrement() == 0) {
            axsp axspVar = this.a;
            AtomicReference atomicReference = this.c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        if (!j()) {
                            boolean z = this.e;
                            Object obj = atomicReference.get();
                            if (!z || obj != null) {
                                break;
                                break;
                            }
                            Throwable th = this.d;
                            if (th != null) {
                                i(th);
                                return;
                            } else {
                                f();
                                return;
                            }
                        }
                        atomicReference.lazySet(null);
                        return;
                    }
                    if (j()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z2 = this.e;
                    Object andSet = atomicReference.getAndSet(null);
                    if (!z2) {
                        if (andSet == null) {
                            break;
                        }
                    } else if (andSet == null) {
                        Throwable th2 = this.d;
                        if (th2 != null) {
                            i(th2);
                            return;
                        } else {
                            f();
                            return;
                        }
                    }
                    axspVar.kk(andSet);
                    j2++;
                }
                if (j2 != 0) {
                    atqp.F(this, j2);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
