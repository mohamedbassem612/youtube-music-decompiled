package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awbz implements avlw, avmn {
    final avln a;
    avmn b;
    long c;
    boolean d;

    public awbz(avln avlnVar) {
        this.a = avlnVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.d) {
            atqp.n(th);
        } else {
            this.d = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.b, avmnVar)) {
            this.b = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b.f();
    }

    @Override // defpackage.avlw
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
        this.b.dispose();
        this.a.ki(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.kn();
    }
}
