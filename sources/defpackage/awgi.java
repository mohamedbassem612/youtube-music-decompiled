package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awgi extends awgf {
    private static final long serialVersionUID = 1075119423897941642L;
    final axsp k;

    public awgi(axsp axspVar, int i, awif awifVar, avma avmaVar) {
        super(i, awifVar, avmaVar);
        this.k = axspVar;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.e, axsqVar)) {
            this.e = axsqVar;
            this.k.e(this);
            axsqVar.ko(this.a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        axsp axspVar;
        awif awifVar;
        Throwable th;
        int i = this.j;
        int iAddAndGet = 1;
        while (true) {
            AtomicLong atomicLong = this.h;
            long j = atomicLong.get();
            long j2 = 0;
            while (true) {
                axspVar = this.k;
                awifVar = this.c;
                if (j2 == j) {
                    break;
                }
                if (this.i) {
                    awifVar.c();
                    return;
                }
                boolean z = this.f;
                if (z && (th = this.g) != null) {
                    awifVar.c();
                    axspVar.b(th);
                    this.d.dispose();
                    return;
                }
                Object objKm = awifVar.km();
                if (!z) {
                    if (objKm == null) {
                        break;
                    }
                } else if (objKm == null) {
                    axspVar.kn();
                    this.d.dispose();
                    return;
                }
                int i2 = this.b;
                axspVar.kk(objKm);
                j2++;
                i++;
                if (i == i2) {
                    this.e.ko(i);
                    i = 0;
                }
            }
            if (j2 == j) {
                if (this.i) {
                    awifVar.c();
                    return;
                }
                if (this.f) {
                    Throwable th2 = this.g;
                    if (th2 != null) {
                        awifVar.c();
                        axspVar.b(th2);
                        this.d.dispose();
                        return;
                    } else if (awifVar.i()) {
                        axspVar.kn();
                        this.d.dispose();
                        return;
                    }
                }
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                atomicLong.addAndGet(-j2);
            }
            int i3 = get();
            if (i3 == iAddAndGet) {
                this.j = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i3;
            }
        }
    }
}
