package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awcl extends avov implements avlw {
    private static final long serialVersionUID = 8443155186132538303L;
    final avlw a;
    final avnn c;
    avmn e;
    volatile boolean f;
    final awkd b = new awkd();
    final avmm d = new avmm();

    public awcl(avlw avlwVar, avnn avnnVar) {
        this.a = avlwVar;
        this.c = avnnVar;
        lazySet(1);
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        awkd awkdVar = this.b;
        if (!awkh.e(awkdVar, th)) {
            atqp.n(th);
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            this.a.b(awkh.d(awkdVar));
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.e, avmnVar)) {
            this.e = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.f = true;
        this.e.dispose();
        this.d.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.e.f();
    }

    @Override // defpackage.avot
    public final boolean i() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [avle, java.lang.Object] */
    @Override // defpackage.avlw
    public final void kk(Object obj) {
        try {
            ?? A = this.c.a(obj);
            getAndIncrement();
            awck awckVar = new awck(this);
            if (this.f || !this.d.c(awckVar)) {
                return;
            }
            A.kp(awckVar);
        } catch (Throwable th) {
            avkz.a(th);
            this.e.dispose();
            b(th);
        }
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return i & 2;
    }

    @Override // defpackage.avot
    public final Object km() {
        return null;
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (decrementAndGet() == 0) {
            Throwable thD = awkh.d(this.b);
            avlw avlwVar = this.a;
            if (thD != null) {
                avlwVar.b(thD);
            } else {
                avlwVar.kn();
            }
        }
    }

    @Override // defpackage.avot
    public final void c() {
    }
}
