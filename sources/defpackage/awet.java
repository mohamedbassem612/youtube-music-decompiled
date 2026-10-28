package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awet implements avlw, avmn {
    final avlw a;
    long b = 1;
    avmn c;

    public awet(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.b != 0) {
            this.b = 0L;
        } else {
            this.a.kk(obj);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.kn();
    }
}
