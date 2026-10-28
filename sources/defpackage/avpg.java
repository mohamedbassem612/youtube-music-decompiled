package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avpg implements avlc, axsq {
    final axsp a;
    avmn b;

    public avpg(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.b, avmnVar)) {
            this.b = avmnVar;
            this.a.e(this);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.b.dispose();
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.a.kn();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
    }
}
