package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awjm implements avlk, avoq {
    protected final axsp e;
    protected axsq f;
    protected avoq g;
    protected boolean h;
    protected int i;

    public awjm(axsp axspVar) {
        this.e = axspVar;
    }

    @Override // defpackage.axsp
    public void b(Throwable th) {
        if (this.h) {
            atqp.n(th);
        } else {
            this.h = true;
            this.e.b(th);
        }
    }

    public void c() {
        this.g.c();
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.f, axsqVar)) {
            this.f = axsqVar;
            if (axsqVar instanceof avoq) {
                this.g = (avoq) axsqVar;
            }
            this.e.e(this);
        }
    }

    protected final int f(int i) {
        avoq avoqVar = this.g;
        if (avoqVar == null || (i & 4) != 0) {
            return 0;
        }
        int iKl = avoqVar.kl(i);
        if (iKl == 0) {
            return iKl;
        }
        this.i = iKl;
        return iKl;
    }

    protected final void g(Throwable th) {
        avkz.a(th);
        this.f.kj();
        b(th);
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.g.i();
    }

    @Override // defpackage.avot
    public final boolean j(Object obj) {
        return a.aD();
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.f.kj();
    }

    @Override // defpackage.axsp
    public void kn() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.kn();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        this.f.ko(j);
    }
}
