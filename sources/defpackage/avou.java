package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class avou implements avlw, avoo {
    protected final avlw a;
    protected avmn b;
    protected avoo c;
    protected boolean d;
    protected int e;

    public avou(avlw avlwVar) {
        this.a = avlwVar;
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

    @Override // defpackage.avot
    public final void c() {
        this.c.c();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.b, avmnVar)) {
            this.b = avmnVar;
            if (avmnVar instanceof avoo) {
                this.c = (avoo) avmnVar;
            }
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.b.dispose();
    }

    protected final int e(int i) {
        avoo avooVar = this.c;
        if (avooVar == null || (i & 4) != 0) {
            return 0;
        }
        int iKl = avooVar.kl(i);
        if (iKl == 0) {
            return iKl;
        }
        this.e = iKl;
        return iKl;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b.f();
    }

    protected final void g(Throwable th) {
        avkz.a(th);
        this.b.dispose();
        b(th);
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.c.i();
    }

    @Override // defpackage.avot
    public final boolean j(Object obj) {
        return a.aD();
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
