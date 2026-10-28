package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwb extends AtomicBoolean implements avlk, axsq {
    private static final long serialVersionUID = -7419642935409022375L;
    final axsp a;
    final avwc b;
    final avwa c;
    axsq d;

    public avwb(axsp axspVar, avwc avwcVar, avwa avwaVar) {
        this.a = axspVar;
        this.b = avwcVar;
        this.c = avwaVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (!compareAndSet(false, true)) {
            atqp.n(th);
        } else {
            this.b.b(this.c);
            this.a.b(th);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.d, axsqVar)) {
            this.d = axsqVar;
            this.a.e(this);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.d.kj();
        if (compareAndSet(false, true)) {
            avwc avwcVar = this.b;
            avwa avwaVar = this.c;
            synchronized (avwcVar) {
                avwa avwaVar2 = avwcVar.c;
                if (avwaVar2 != null && avwaVar2 == avwaVar) {
                    long j = avwaVar.c - 1;
                    avwaVar.c = j;
                    if (j == 0 && avwaVar.d) {
                        avwcVar.c(avwaVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.kn();
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        this.d.ko(j);
    }
}
