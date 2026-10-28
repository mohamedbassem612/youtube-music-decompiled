package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avun implements avlk, avoq {
    final axsp a;
    axsq b;

    public avun(axsp axspVar) {
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
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.avot
    public final boolean i() {
        return true;
    }

    @Override // defpackage.avot
    public final boolean j(Object obj) {
        return a.aD();
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.b.kj();
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return i & 2;
    }

    @Override // defpackage.avot
    public final Object km() {
        return null;
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.a.kn();
    }

    @Override // defpackage.avot
    public final void c() {
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
    }
}
