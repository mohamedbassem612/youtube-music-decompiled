package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awcz implements avlk, avmn {
    final avlw a;
    axsq b;

    public awcz(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.b.kj();
        this.b = awka.CANCELLED;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.b, axsqVar)) {
            this.b = axsqVar;
            this.a.d(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b == awka.CANCELLED;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.a.kn();
    }
}
