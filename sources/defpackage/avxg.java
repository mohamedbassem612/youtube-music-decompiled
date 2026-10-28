package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxg implements avlk, axsq {
    private final /* synthetic */ int $cid;
    final axsp a;
    final avno b;
    axsq c;
    boolean d;

    public avxg(axsp axspVar, avno avnoVar, int i) {
        this.$cid = i;
        this.a = axspVar;
        this.b = avnoVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.$cid != 0) {
            this.a.b(th);
        } else if (this.d) {
            atqp.n(th);
        } else {
            this.d = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        int i = this.$cid;
        axsq axsqVar2 = this.c;
        if (i != 0) {
            if (awka.i(axsqVar2, axsqVar)) {
                this.c = axsqVar;
                this.a.e(this);
                return;
            }
            return;
        }
        if (awka.i(axsqVar2, axsqVar)) {
            this.c = axsqVar;
            this.a.e(this);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        int i = this.$cid;
        axsq axsqVar = this.c;
        if (i != 0) {
            axsqVar.kj();
        } else {
            axsqVar.kj();
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        int i = this.$cid;
        boolean z = this.d;
        if (i != 0) {
            if (z) {
                this.a.kk(obj);
                return;
            }
            try {
                if (this.b.a(obj)) {
                    this.c.ko(1L);
                    return;
                } else {
                    this.d = true;
                    this.a.kk(obj);
                    return;
                }
            } catch (Throwable th) {
                avkz.a(th);
                this.c.kj();
                this.a.b(th);
                return;
            }
        }
        if (z) {
            return;
        }
        this.a.kk(obj);
        try {
            if (this.b.a(obj)) {
                this.d = true;
                this.c.kj();
                this.a.kn();
            }
        } catch (Throwable th2) {
            avkz.a(th2);
            this.c.kj();
            b(th2);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.$cid != 0) {
            this.a.kn();
        } else {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.kn();
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        int i = this.$cid;
        axsq axsqVar = this.c;
        if (i != 0) {
            axsqVar.ko(j);
        } else {
            axsqVar.ko(j);
        }
    }
}
