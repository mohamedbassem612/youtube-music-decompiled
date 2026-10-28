package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avqp implements avlc, avmn {
    final avlc a;
    avmn b;
    final /* synthetic */ avqq c;

    public avqp(avqq avqqVar, avlc avlcVar) {
        this.c = avqqVar;
        this.a = avlcVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        if (this.b == avnr.DISPOSED) {
            atqp.n(th);
            return;
        }
        try {
            this.c.c.a(th);
        } catch (Throwable th2) {
            avkz.a(th2);
            th = new avmw(th, th2);
        }
        this.a.b(th);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        try {
            this.c.b.a(avmnVar);
            if (avnr.e(this.b, avmnVar)) {
                this.b = avmnVar;
                this.a.d(this);
            }
        } catch (Throwable th) {
            avkz.a(th);
            avmnVar.dispose();
            this.b = avnr.DISPOSED;
            avns.e(th, this.a);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        try {
            this.c.e.a();
        } catch (Throwable th) {
            avkz.a(th);
            atqp.n(th);
        }
        this.b.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b.f();
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        if (this.b != avnr.DISPOSED) {
            try {
                this.c.d.a();
                this.a.kn();
            } catch (Throwable th) {
                avkz.a(th);
                this.a.b(th);
            }
        }
    }
}
