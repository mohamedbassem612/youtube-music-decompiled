package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avrk extends awjw implements avlk {
    private static final long serialVersionUID = -3521127104134758517L;
    final avno a;
    axsq b;
    boolean c;

    public avrk(axsp axspVar, avno avnoVar) {
        super(axspVar);
        this.a = avnoVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.c) {
            atqp.n(th);
        } else {
            this.c = true;
            this.f.b(th);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.b, axsqVar)) {
            this.b = axsqVar;
            this.f.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.awjw, defpackage.axsq
    public final void kj() {
        super.kj();
        this.b.kj();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.c) {
            return;
        }
        try {
            if (this.a.a(obj)) {
                return;
            }
            this.c = true;
            this.b.kj();
            f(Boolean.FALSE);
        } catch (Throwable th) {
            avkz.a(th);
            this.b.kj();
            b(th);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.c) {
            return;
        }
        this.c = true;
        f(Boolean.TRUE);
    }
}
