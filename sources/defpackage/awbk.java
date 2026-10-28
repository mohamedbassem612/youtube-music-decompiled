package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awbk extends AtomicInteger implements avls {
    private static final long serialVersionUID = 4883307006032401862L;
    public final avls a;
    public final awkd b = new awkd();
    final awig c = new awig(16);
    public volatile boolean d;

    public awbk(avls avlsVar) {
        this.a = avlsVar;
    }

    @Override // defpackage.avlg
    public final void a() {
        throw null;
    }

    @Override // defpackage.avlg
    public final void b(Throwable th) {
        throw null;
    }

    @Override // defpackage.avlg
    public final void c(Object obj) {
        avls avlsVar = this.a;
        if (avlsVar.f() || this.d) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            avlsVar.c(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            awig awigVar = this.c;
            synchronized (awigVar) {
                awigVar.j(obj);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        i();
    }

    @Override // defpackage.avls
    public final void d(avnh avnhVar) {
        throw null;
    }

    @Override // defpackage.avls
    public final void e(avmn avmnVar) {
        avnr.i((AtomicReference) this.a, avmnVar);
    }

    @Override // defpackage.avls, defpackage.avmn
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.avls
    public final boolean g(Throwable th) {
        throw null;
    }

    public final void h() {
        if (getAndIncrement() == 0) {
            i();
        }
    }

    final void i() {
        int iAddAndGet = 1;
        while (true) {
            awig awigVar = this.c;
            avls avlsVar = this.a;
            if (avlsVar.f()) {
                awigVar.c();
                return;
            }
            awkd awkdVar = this.b;
            if (awkdVar.get() != null) {
                awigVar.c();
                avlsVar.b(awkh.d(awkdVar));
                return;
            }
            boolean z = this.d;
            Object objKm = awigVar.km();
            if (z) {
                if (objKm == null) {
                    avlsVar.a();
                    return;
                }
            } else if (objKm == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            avlsVar.c(objKm);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.a.toString();
    }
}
