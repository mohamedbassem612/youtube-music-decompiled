package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwr implements avlk, axsq {
    final axsp a;
    long b = 1;
    axsq c;

    public avwr(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.c, axsqVar)) {
            long j = this.b;
            this.c = axsqVar;
            this.a.e(this);
            axsqVar.ko(j);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.c.kj();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.b != 0) {
            this.b = 0L;
        } else {
            this.a.kk(obj);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.a.kn();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        this.c.ko(j);
    }
}
