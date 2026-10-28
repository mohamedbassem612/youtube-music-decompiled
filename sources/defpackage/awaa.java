package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awaa extends awjw implements avln {
    private static final long serialVersionUID = 7603343402964826922L;
    avmn a;

    @Override // defpackage.avln
    public final void b(Throwable th) {
        this.f.b(th);
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.a, avmnVar)) {
            this.a = avmnVar;
            this.f.e(this);
        }
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        f(obj);
    }

    @Override // defpackage.awjw, defpackage.axsq
    public final void kj() {
        super.kj();
        this.a.dispose();
    }

    @Override // defpackage.avln
    public final void kn() {
        this.f.kn();
    }
}
