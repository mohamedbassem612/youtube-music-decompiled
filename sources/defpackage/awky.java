package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awky extends awkv {
    final awkv b;
    boolean c;
    awkc d;
    volatile boolean e;

    public awky(awkv awkvVar) {
        this.b = awkvVar;
    }

    final void aC() {
        awkc awkcVar;
        while (true) {
            synchronized (this) {
                awkcVar = this.d;
                if (awkcVar == null) {
                    this.c = false;
                    return;
                }
                this.d = null;
            }
            awkcVar.d(this.b);
        }
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        this.b.aq(axspVar);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.e) {
            atqp.n(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.e) {
                this.e = true;
                if (this.c) {
                    awkc awkcVar = this.d;
                    if (awkcVar == null) {
                        awkcVar = new awkc();
                        this.d = awkcVar;
                    }
                    awkcVar.c(new awkj(th));
                    return;
                }
                this.c = true;
                z = false;
            }
            if (z) {
                atqp.n(th);
            } else {
                this.b.b(th);
            }
        }
    }

    @Override // defpackage.axsp
    public final void e(axsq axsqVar) {
        boolean z = true;
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    if (this.c) {
                        awkc awkcVar = this.d;
                        if (awkcVar == null) {
                            awkcVar = new awkc();
                            this.d = awkcVar;
                        }
                        awkcVar.a(new awkk(axsqVar));
                        return;
                    }
                    this.c = true;
                    z = false;
                }
            }
        }
        if (z) {
            axsqVar.kj();
        } else {
            this.b.e(axsqVar);
            aC();
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (!this.c) {
                this.c = true;
                this.b.kk(obj);
                aC();
            } else {
                awkc awkcVar = this.d;
                if (awkcVar == null) {
                    awkcVar = new awkc();
                    this.d = awkcVar;
                }
                awkcVar.a(obj);
            }
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            this.e = true;
            if (!this.c) {
                this.c = true;
                this.b.kn();
                return;
            }
            awkc awkcVar = this.d;
            if (awkcVar == null) {
                awkcVar = new awkc();
                this.d = awkcVar;
            }
            awkcVar.a(awkl.COMPLETE);
        }
    }
}
