package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awbu implements avlw, avmn {
    final avlw a;
    final avni b;
    final avni c;
    final avnd d;
    avmn e;
    boolean f;

    public awbu(avlw avlwVar, avni avniVar, avni avniVar2, avnd avndVar) {
        this.a = avlwVar;
        this.b = avniVar;
        this.c = avniVar2;
        this.d = avndVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.f) {
            atqp.n(th);
            return;
        }
        this.f = true;
        try {
            this.c.a(th);
        } catch (Throwable th2) {
            avkz.a(th2);
            th = new avmw(th, th2);
        }
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.e, avmnVar)) {
            this.e = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.e.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.e.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.f) {
            return;
        }
        try {
            this.b.a(obj);
            this.a.kk(obj);
        } catch (Throwable th) {
            avkz.a(th);
            this.e.dispose();
            b(th);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.f) {
            return;
        }
        try {
            this.d.a();
            this.f = true;
            this.a.kn();
        } catch (Throwable th) {
            avkz.a(th);
            b(th);
        }
    }
}
