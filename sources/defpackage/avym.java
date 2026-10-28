package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avym implements avmd, avmn {
    final avln a;
    final avno b;
    avmn c;

    public avym(avln avlnVar, avno avnoVar) {
        this.a = avlnVar;
        this.b = avnoVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avmn avmnVar = this.c;
        this.c = avnr.DISPOSED;
        avmnVar.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        try {
            boolean zA = this.b.a(obj);
            avln avlnVar = this.a;
            if (zA) {
                avlnVar.ki(obj);
            } else {
                avlnVar.kn();
            }
        } catch (Throwable th) {
            avkz.a(th);
            this.a.b(th);
        }
    }
}
