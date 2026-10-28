package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awdn extends avov implements Runnable, avlw {
    private static final long serialVersionUID = 6576896619930983584L;
    final avlw a;
    final avma b;
    final int c;
    avot d;
    avmn e;
    Throwable f;
    volatile boolean g;
    volatile boolean h;
    int i;
    boolean j;

    public awdn(avlw avlwVar, avma avmaVar, int i) {
        this.a = avlwVar;
        this.b = avmaVar;
        this.c = i;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.g) {
            atqp.n(th);
            return;
        }
        this.f = th;
        this.g = true;
        e();
    }

    @Override // defpackage.avot
    public final void c() {
        this.d.c();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.e, avmnVar)) {
            this.e = avmnVar;
            if (avmnVar instanceof avoo) {
                avoo avooVar = (avoo) avmnVar;
                int iKl = avooVar.kl(7);
                if (iKl == 1) {
                    this.i = 1;
                    this.d = avooVar;
                    this.g = true;
                    this.a.d(this);
                    e();
                    return;
                }
                if (iKl == 2) {
                    this.i = 2;
                    this.d = avooVar;
                    this.a.d(this);
                    return;
                }
            }
            this.d = new awig(this.c);
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.dispose();
        this.b.dispose();
        if (getAndIncrement() == 0) {
            this.d.c();
        }
    }

    final void e() {
        if (getAndIncrement() == 0) {
            this.b.a(this);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.h;
    }

    final boolean g(boolean z, boolean z2, avlw avlwVar) {
        if (this.h) {
            this.d.c();
            return true;
        }
        if (z) {
            Throwable th = this.f;
            if (th != null) {
                this.h = true;
                this.d.c();
                avlwVar.b(th);
                this.b.dispose();
                return true;
            }
            if (z2) {
                this.h = true;
                avlwVar.kn();
                this.b.dispose();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.d.i();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.g) {
            return;
        }
        if (this.i != 2) {
            this.d.j(obj);
        }
        e();
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.j = true;
        return 2;
    }

    @Override // defpackage.avot
    public final Object km() {
        return this.d.km();
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.g) {
            return;
        }
        this.g = true;
        e();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j) {
            int iAddAndGet = 1;
            while (!this.h) {
                boolean z = this.g;
                Throwable th = this.f;
                if (z && th != null) {
                    this.h = true;
                    this.a.b(this.f);
                    this.b.dispose();
                    return;
                }
                avlw avlwVar = this.a;
                avlwVar.kk(null);
                if (z) {
                    this.h = true;
                    Throwable th2 = this.f;
                    if (th2 != null) {
                        avlwVar.b(th2);
                    } else {
                        avlwVar.kn();
                    }
                    this.b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            return;
        }
        avot avotVar = this.d;
        avlw avlwVar2 = this.a;
        int iAddAndGet2 = 1;
        while (!g(this.g, avotVar.i(), avlwVar2)) {
            while (true) {
                boolean z2 = this.g;
                try {
                    Object objKm = avotVar.km();
                    boolean z3 = objKm == null;
                    if (g(z2, z3, avlwVar2)) {
                        return;
                    }
                    if (z3) {
                        break;
                    } else {
                        avlwVar2.kk(objKm);
                    }
                } catch (Throwable th3) {
                    avkz.a(th3);
                    this.h = true;
                    this.e.dispose();
                    avotVar.c();
                    avlwVar2.b(th3);
                    this.b.dispose();
                    return;
                }
            }
            iAddAndGet2 = addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
        }
    }
}
