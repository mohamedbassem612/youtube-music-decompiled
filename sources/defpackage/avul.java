package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avul implements avlk, axsq {
    final axsp a;
    axsq b;

    public avul(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.b, axsqVar)) {
            this.b = axsqVar;
            this.a.e(this);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.b.kj();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.a.kn();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        this.b.ko(j);
    }
}
