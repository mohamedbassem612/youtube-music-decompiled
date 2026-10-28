package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awfc implements avlw, avmn {
    final avlw a;
    boolean b;
    avmn c;
    long d = 1;

    public awfc(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.b) {
            atqp.n(th);
            return;
        }
        this.b = true;
        this.c.dispose();
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            if (this.d != 0) {
                this.a.d(this);
                return;
            }
            this.b = true;
            avmnVar.dispose();
            avlw avlwVar = this.a;
            avlwVar.d(avns.a);
            avlwVar.kn();
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
        if (this.b) {
            return;
        }
        long j = this.d;
        long j2 = (-1) + j;
        this.d = j2;
        if (j > 0) {
            this.a.kk(obj);
            if (j2 == 0) {
                kn();
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.dispose();
        this.a.kn();
    }
}
