package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awgh extends awgf {
    private static final long serialVersionUID = 1075119423897941642L;
    final avok k;

    public awgh(avok avokVar, int i, awif awifVar, avma avmaVar) {
        super(i, awifVar, avmaVar);
        this.k = avokVar;
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
        avok avokVar;
        awif awifVar;
        Throwable th;
        int i = this.j;
        int iAddAndGet = 1;
        while (true) {
            AtomicLong atomicLong = this.h;
            long j = atomicLong.get();
            long j2 = 0;
            while (true) {
                avokVar = this.k;
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
                    avokVar.b(th);
                    this.d.dispose();
                    return;
                }
                Object objKm = awifVar.km();
                if (!z) {
                    if (objKm == null) {
                        break;
                    }
                } else if (objKm == null) {
                    avokVar.kn();
                    this.d.dispose();
                    return;
                }
                if (avokVar.d(objKm)) {
                    j2++;
                }
                i++;
                if (i == this.b) {
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
                        avokVar.b(th2);
                        this.d.dispose();
                        return;
                    } else if (awifVar.i()) {
                        avokVar.kn();
                        this.d.dispose();
                        return;
                    }
                }
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                atomicLong.addAndGet(-j2);
            }
            int i2 = get();
            if (i2 == iAddAndGet) {
                this.j = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i2;
            }
        }
    }
}
