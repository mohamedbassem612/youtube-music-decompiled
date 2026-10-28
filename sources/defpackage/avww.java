package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avww implements avlk {
    final axsp a;
    final axso b;
    boolean d = true;
    final awjz c = new awjz();

    public avww(axsp axspVar, axso axsoVar) {
        this.a = axspVar;
        this.b = axsoVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        this.c.h(axsqVar);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.d) {
            this.d = false;
        }
        this.a.kk(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (!this.d) {
            this.a.kn();
        } else {
            this.d = false;
            this.b.aq(this);
        }
    }
}
