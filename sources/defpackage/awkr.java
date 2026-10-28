package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awkr implements avlw, avmn {
    final avlw a;
    avmn b;
    boolean c;
    awkc d;
    volatile boolean e;

    public awkr(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avlw
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

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.b, avmnVar)) {
            this.b = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        Object[] objArr;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.dispose();
            b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                awkc awkcVar = this.d;
                if (awkcVar == null) {
                    awkcVar = new awkc();
                    this.d = awkcVar;
                }
                awkcVar.a(obj);
                return;
            }
            this.c = true;
            this.a.kk(obj);
            while (true) {
                synchronized (this) {
                    awkc awkcVar2 = this.d;
                    if (awkcVar2 == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                    avlw avlwVar = this.a;
                    for (Object[] objArr2 = awkcVar2.a; objArr2 != null; objArr2 = objArr2[4]) {
                        for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                            if (awkl.c(objArr, avlwVar)) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.avlw
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
}
