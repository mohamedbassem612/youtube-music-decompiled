package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avuf implements avlw, axsq {
    final axsp a;
    avmn b;

    public avuf(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        this.b = avmnVar;
        this.a.e(this);
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.b.dispose();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.kn();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
    }
}
