package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avpp extends AtomicInteger implements avlc {
    private static final long serialVersionUID = -7965400327305809232L;
    final avlc a;
    final avle[] b;
    int c;
    final avnv d = new avnv();

    public avpp(avlc avlcVar, avle[] avleVarArr) {
        this.a = avlcVar;
        this.b = avleVarArr;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    final void c() {
        avnv avnvVar = this.d;
        if (avnvVar.f() || getAndIncrement() != 0) {
            return;
        }
        avle[] avleVarArr = this.b;
        while (!avnvVar.f()) {
            int i = this.c;
            this.c = i + 1;
            int length = avleVarArr.length;
            if (i == 2) {
                this.a.kn();
                return;
            } else {
                avleVarArr[i].kp(this);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.g(this.d, avmnVar);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        c();
    }
}
