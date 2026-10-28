package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avtf implements avlk, avmn {
    final avln a;
    axsq b;
    long c;
    boolean d;

    public avtf(avln avlnVar) {
        this.a = avlnVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.d) {
            atqp.n(th);
            return;
        }
        this.d = true;
        this.b = awka.CANCELLED;
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
        if (this.d) {
            return;
        }
        long j = this.c;
        if (j != 0) {
            this.c = j + 1;
            return;
        }
        this.d = true;
        this.b.kj();
        this.b = awka.CANCELLED;
        this.a.ki(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.b = awka.CANCELLED;
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.kn();
    }
}
