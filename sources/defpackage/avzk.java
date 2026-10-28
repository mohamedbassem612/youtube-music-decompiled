package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avzk implements avln, avmn {
    final avln a;
    final avzl b;
    avmn c;

    public avzk(avln avlnVar, avzl avzlVar) {
        this.a = avlnVar;
        this.b = avzlVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        if (this.c == avnr.DISPOSED) {
            atqp.n(th);
        } else {
            c(th);
        }
    }

    final void c(Throwable th) {
        try {
            this.b.c.a(th);
        } catch (Throwable th2) {
            avkz.a(th2);
            th = new avmw(th, th2);
        }
        this.c = avnr.DISPOSED;
        this.a.b(th);
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c.dispose();
        this.c = avnr.DISPOSED;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        if (this.c != avnr.DISPOSED) {
            try {
                this.b.b.a(obj);
                this.c = avnr.DISPOSED;
                this.a.ki(obj);
            } catch (Throwable th) {
                avkz.a(th);
                c(th);
            }
        }
    }

    @Override // defpackage.avln
    public final void kn() {
        if (this.c != avnr.DISPOSED) {
            try {
                this.b.d.a();
                this.c = avnr.DISPOSED;
                this.a.kn();
            } catch (Throwable th) {
                avkz.a(th);
                c(th);
            }
        }
    }
}
