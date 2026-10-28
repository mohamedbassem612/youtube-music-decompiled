package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avtb implements avlk, axsq {
    final axsp a;
    final avni b;
    axsq c;

    public avtb(axsp axspVar, avni avniVar) {
        this.a = axspVar;
        this.b = avniVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.c != awka.CANCELLED) {
            this.a.b(th);
        } else {
            atqp.n(th);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        try {
            this.b.a(axsqVar);
            if (awka.i(this.c, axsqVar)) {
                this.c = axsqVar;
                this.a.e(this);
            }
        } catch (Throwable th) {
            avkz.a(th);
            axsqVar.kj();
            this.c = awka.CANCELLED;
            awjx.f(th, this.a);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        axsq axsqVar = this.c;
        awka awkaVar = awka.CANCELLED;
        if (axsqVar != awkaVar) {
            this.c = awkaVar;
            axsqVar.kj();
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.c != awka.CANCELLED) {
            this.a.kn();
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        this.c.ko(j);
    }
}
