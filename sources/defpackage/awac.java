package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awac extends avpb implements avln {
    private static final long serialVersionUID = 7603343402964826922L;
    avmn c;

    @Override // defpackage.avln
    public final void b(Throwable th) {
        g(th);
    }

    @Override // defpackage.avln
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

    @Override // defpackage.avln
    public final void ki(Object obj) {
        e(obj);
    }

    @Override // defpackage.avln
    public final void kn() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.a.kn();
        }
    }
}
