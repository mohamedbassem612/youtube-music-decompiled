package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awbs extends avov implements avlw {
    private static final long serialVersionUID = 4109457741734051389L;
    final avlw a;
    final avnd b;
    avmn c;
    avoo d;
    boolean e;

    public awbs(avlw avlwVar, avnd avndVar) {
        this.a = avlwVar;
        this.b = avndVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.b(th);
        e();
    }

    @Override // defpackage.avot
    public final void c() {
        this.d.c();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            if (avmnVar instanceof avoo) {
                this.d = (avoo) avmnVar;
            }
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c.dispose();
        e();
    }

    final void e() {
        if (compareAndSet(0, 1)) {
            try {
                this.b.a();
            } catch (Throwable th) {
                avkz.a(th);
                atqp.n(th);
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.d.i();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        avoo avooVar = this.d;
        if (avooVar == null || (i & 4) != 0) {
            return 0;
        }
        int iKl = avooVar.kl(i);
        if (iKl != 0) {
            this.e = iKl == 1;
        }
        return iKl;
    }

    @Override // defpackage.avot
    public final Object km() {
        Object objKm = this.d.km();
        if (objKm != null || !this.e) {
            return objKm;
        }
        e();
        return null;
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.kn();
        e();
    }
}
