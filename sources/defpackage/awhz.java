package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awhz extends avpb implements avmd {
    private static final long serialVersionUID = 3786543492451018833L;
    avmn c;

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        g(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avpb, defpackage.avmn
    public final void dispose() {
        super.dispose();
        this.c.dispose();
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        e(obj);
    }
}
