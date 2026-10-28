package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aweq implements avlw, avmn {
    final avlw a;
    final avnf b;
    Object c;
    avmn d;
    boolean e;

    public aweq(avlw avlwVar, avnf avnfVar, Object obj) {
        this.a = avlwVar;
        this.b = avnfVar;
        this.c = obj;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.e) {
            atqp.n(th);
        } else {
            this.e = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.d, avmnVar)) {
            this.d = avmnVar;
            avlw avlwVar = this.a;
            avlwVar.d(this);
            avlwVar.kk(this.c);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.d.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.e) {
            return;
        }
        try {
            Object objA = this.b.a(this.c, obj);
            this.c = objA;
            this.a.kk(objA);
        } catch (Throwable th) {
            avkz.a(th);
            this.d.dispose();
            b(th);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.kn();
    }
}
