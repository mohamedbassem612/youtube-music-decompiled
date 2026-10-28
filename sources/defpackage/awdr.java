package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awdr implements avlw, avmn {
    final avlw a;
    final avnn b;
    avmn c;

    public awdr(avlw avlwVar, avnn avnnVar) {
        this.a = avlwVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        try {
            Object objA = this.b.a(th);
            if (objA == null) {
                NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                nullPointerException.initCause(th);
                this.a.b(nullPointerException);
            } else {
                avlw avlwVar = this.a;
                avlwVar.kk(objA);
                avlwVar.kn();
            }
        } catch (Throwable th2) {
            avkz.a(th2);
            this.a.b(new avmw(th, th2));
        }
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
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.kn();
    }
}
