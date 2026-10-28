package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awlv extends awly implements awkb {
    final awly a;
    boolean b;
    awkc c;
    volatile boolean d;

    public awlv(awly awlyVar) {
        this.a = awlyVar;
    }

    @Override // defpackage.awkb, defpackage.avno
    public final boolean a(Object obj) {
        return awkl.c(obj, this.a);
    }

    final void au() {
        awkc awkcVar;
        while (true) {
            synchronized (this) {
                awkcVar = this.c;
                if (awkcVar == null) {
                    this.b = false;
                    return;
                }
                this.c = null;
            }
            awkcVar.b(this);
        }
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.d) {
            atqp.n(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.d) {
                this.d = true;
                if (this.b) {
                    awkc awkcVar = this.c;
                    if (awkcVar == null) {
                        awkcVar = new awkc();
                        this.c = awkcVar;
                    }
                    awkcVar.c(new awkj(th));
                    return;
                }
                this.b = true;
                z = false;
            }
            if (z) {
                atqp.n(th);
            } else {
                this.a.b(th);
            }
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        boolean z = true;
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    if (this.b) {
                        awkc awkcVar = this.c;
                        if (awkcVar == null) {
                            awkcVar = new awkc();
                            this.c = awkcVar;
                        }
                        awkcVar.a(new awki(avmnVar));
                        return;
                    }
                    this.b = true;
                    z = false;
                }
            }
        }
        if (z) {
            avmnVar.dispose();
        } else {
            this.a.d(avmnVar);
            au();
        }
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        this.a.ak(avlwVar);
    }

    @Override // defpackage.awly
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.d) {
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            if (!this.b) {
                this.b = true;
                this.a.kk(obj);
                au();
            } else {
                awkc awkcVar = this.c;
                if (awkcVar == null) {
                    awkcVar = new awkc();
                    this.c = awkcVar;
                }
                awkcVar.a(obj);
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.d) {
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            if (!this.b) {
                this.b = true;
                this.a.kn();
                return;
            }
            awkc awkcVar = this.c;
            if (awkcVar == null) {
                awkcVar = new awkc();
                this.c = awkcVar;
            }
            awkcVar.a(awkl.COMPLETE);
        }
    }
}
