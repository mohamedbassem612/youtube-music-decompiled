package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avqf implements avlc, avmn {
    final avlc a;
    avmn b;

    public avqf(avlc avlcVar) {
        this.a = avlcVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.b, avmnVar)) {
            this.b = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.b.dispose();
        this.b = avnr.DISPOSED;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b.f();
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.a.kn();
    }
}
