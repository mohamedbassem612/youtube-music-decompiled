package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avsf extends avse {
    private static final long serialVersionUID = 2427151001689639875L;
    final awig c;
    Throwable d;
    volatile boolean e;
    final AtomicInteger f;

    public avsf(axsp axspVar, int i) {
        super(axspVar);
        this.c = new awig(i);
        this.f = new AtomicInteger();
    }

    @Override // defpackage.avlg
    public final void c(Object obj) {
        if (this.e || j()) {
            return;
        }
        this.c.j(obj);
        l();
    }

    @Override // defpackage.avse
    public final void g() {
        l();
    }

    @Override // defpackage.avse
    public final void h() {
        if (this.f.getAndIncrement() == 0) {
            this.c.c();
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
            awig awigVar = this.c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        if (!j()) {
                            boolean z = this.e;
                            boolean zI = awigVar.i();
                            if (!z || !zI) {
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
                        awigVar.c();
                        return;
                    }
                    if (j()) {
                        awigVar.c();
                        return;
                    }
                    boolean z2 = this.e;
                    Object objKm = awigVar.km();
                    if (!z2) {
                        if (objKm == null) {
                            break;
                        }
                    } else if (objKm == null) {
                        Throwable th2 = this.d;
                        if (th2 != null) {
                            i(th2);
                            return;
                        } else {
                            f();
                            return;
                        }
                    }
                    axspVar.kk(objKm);
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
