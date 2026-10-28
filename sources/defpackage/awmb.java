package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awmb implements avlk, axsq {
    final axsp a;
    axsq b;
    boolean c;
    awkc d;
    volatile boolean e;

    public awmb(axsp axspVar) {
        this.a = axspVar;
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
                if (this.c) {
                    this.e = true;
                    awkc awkcVar = this.d;
                    if (awkcVar == null) {
                        awkcVar = new awkc();
                        this.d = awkcVar;
                    }
                    awkcVar.c(new awkj(th));
                    return;
                }
                this.e = true;
                this.c = true;
                z = false;
            }
            if (z) {
                atqp.n(th);
            } else {
                this.a.b(th);
            }
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.b, axsqVar)) {
            this.b = axsqVar;
            this.a.e(this);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.b.kj();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        awkc awkcVar;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.kj();
            b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                awkc awkcVar2 = this.d;
                if (awkcVar2 == null) {
                    awkcVar2 = new awkc();
                    this.d = awkcVar2;
                }
                awkcVar2.a(obj);
                return;
            }
            this.c = true;
            this.a.kk(obj);
            do {
                synchronized (this) {
                    awkcVar = this.d;
                    if (awkcVar == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                }
            } while (!awkcVar.d(this.a));
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
            if (!this.c) {
                this.e = true;
                this.c = true;
                this.a.kn();
            } else {
                awkc awkcVar = this.d;
                if (awkcVar == null) {
                    awkcVar = new awkc();
                    this.d = awkcVar;
                }
                awkcVar.a(awkl.COMPLETE);
            }
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        this.b.ko(j);
    }
}
