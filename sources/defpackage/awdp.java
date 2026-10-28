package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awdp implements avlw {
    final avlw a;
    final avnn b;
    final avnv c = new avnv();
    boolean d;
    boolean e;

    public awdp(avlw avlwVar, avnn avnnVar) {
        this.a = avlwVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.d) {
            if (this.e) {
                atqp.n(th);
                return;
            } else {
                this.a.b(th);
                return;
            }
        }
        this.d = true;
        try {
            avlu avluVar = (avlu) this.b.a(th);
            if (avluVar != null) {
                avluVar.ak(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th);
            this.a.b(nullPointerException);
        } catch (Throwable th2) {
            avkz.a(th2);
            this.a.b(new avmw(th, th2));
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.g(this.c, avmnVar);
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.e) {
            return;
        }
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d = true;
        this.a.kn();
    }
}
