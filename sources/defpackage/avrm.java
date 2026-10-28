package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avrm implements avlk, avmn {
    final avmd a;
    final avno b;
    axsq c;
    boolean d;

    public avrm(avmd avmdVar, avno avnoVar) {
        this.a = avmdVar;
        this.b = avnoVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.d) {
            atqp.n(th);
            return;
        }
        this.d = true;
        this.c = awka.CANCELLED;
        this.a.b(th);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c.kj();
        this.c = awka.CANCELLED;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.c, axsqVar)) {
            this.c = axsqVar;
            this.a.d(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c == awka.CANCELLED;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.d) {
            return;
        }
        try {
            if (this.b.a(obj)) {
                return;
            }
            this.d = true;
            this.c.kj();
            this.c = awka.CANCELLED;
            this.a.ki(Boolean.FALSE);
        } catch (Throwable th) {
            avkz.a(th);
            this.c.kj();
            this.c = awka.CANCELLED;
            b(th);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c = awka.CANCELLED;
        this.a.ki(Boolean.TRUE);
    }
}
