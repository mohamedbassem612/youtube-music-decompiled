package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awhx extends awjw implements avmd {
    private static final long serialVersionUID = 187782011903685568L;
    avmn a;

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.f.b(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.a, avmnVar)) {
            this.a = avmnVar;
            this.f.e(this);
        }
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        f(obj);
    }

    @Override // defpackage.awjw, defpackage.axsq
    public final void kj() {
        super.kj();
        this.a.dispose();
    }
}
