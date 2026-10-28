package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fdv implements fdz, fdx {
    public volatile fdx a;
    public volatile fdx b;
    private final Object c;
    private final fdz d;
    private fdy e;
    private fdy f;

    public fdv(Object obj, fdz fdzVar) {
        fdy fdyVar = fdy.CLEARED;
        this.e = fdyVar;
        this.f = fdyVar;
        this.c = obj;
        this.d = fdzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [fdz] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.fdz
    public final fdz a() {
        ?? A;
        synchronized (this.c) {
            fdz fdzVar = this.d;
            this = this;
            if (fdzVar != null) {
                A = fdzVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.fdx
    public final void b() {
        synchronized (this.c) {
            fdy fdyVar = this.e;
            fdy fdyVar2 = fdy.RUNNING;
            if (fdyVar != fdyVar2) {
                this.e = fdyVar2;
                this.a.b();
            }
        }
    }

    @Override // defpackage.fdx
    public final void c() {
        synchronized (this.c) {
            fdy fdyVar = fdy.CLEARED;
            this.e = fdyVar;
            this.a.c();
            if (this.f != fdyVar) {
                this.f = fdyVar;
                this.b.c();
            }
        }
    }

    @Override // defpackage.fdz
    public final void d(fdx fdxVar) {
        synchronized (this.c) {
            if (fdxVar.equals(this.b)) {
                this.f = fdy.FAILED;
                fdz fdzVar = this.d;
                if (fdzVar != null) {
                    fdzVar.d(this);
                }
                return;
            }
            this.e = fdy.FAILED;
            fdy fdyVar = this.f;
            fdy fdyVar2 = fdy.RUNNING;
            if (fdyVar != fdyVar2) {
                this.f = fdyVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.fdz
    public final void e(fdx fdxVar) {
        synchronized (this.c) {
            if (fdxVar.equals(this.a)) {
                this.e = fdy.SUCCESS;
            } else if (fdxVar.equals(this.b)) {
                this.f = fdy.SUCCESS;
            }
            fdz fdzVar = this.d;
            if (fdzVar != null) {
                fdzVar.e(this);
            }
        }
    }

    @Override // defpackage.fdx
    public final void f() {
        synchronized (this.c) {
            fdy fdyVar = this.e;
            fdy fdyVar2 = fdy.RUNNING;
            if (fdyVar == fdyVar2) {
                this.e = fdy.PAUSED;
                this.a.f();
            }
            if (this.f == fdyVar2) {
                this.f = fdy.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.fdz
    public final boolean g(fdx fdxVar) {
        boolean z;
        synchronized (this.c) {
            fdz fdzVar = this.d;
            z = false;
            if ((fdzVar == null || fdzVar.g(this)) && fdxVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    @Override // defpackage.fdz
    public final boolean h(fdx fdxVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.c) {
            fdz fdzVar = this.d;
            z = false;
            if (fdzVar == null || fdzVar.h(this)) {
                fdy fdyVar = this.e;
                fdy fdyVar2 = fdy.FAILED;
                if (fdyVar != fdyVar2) {
                    zEquals = fdxVar.equals(this.a);
                } else {
                    if (fdxVar.equals(this.b)) {
                        fdy fdyVar3 = this.f;
                        if (fdyVar3 == fdy.SUCCESS) {
                            zEquals = true;
                        } else if (fdyVar3 != fdyVar2) {
                            zEquals = false;
                        }
                    } else {
                        zEquals = false;
                    }
                    z = true;
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.fdz
    public final boolean i(fdx fdxVar) {
        boolean z;
        synchronized (this.c) {
            fdz fdzVar = this.d;
            z = true;
            if (fdzVar != null && !fdzVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fdz, defpackage.fdx
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fdx
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            fdy fdyVar = this.e;
            fdy fdyVar2 = fdy.CLEARED;
            z = false;
            if (fdyVar == fdyVar2 && this.f == fdyVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.fdx
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            fdy fdyVar = this.e;
            fdy fdyVar2 = fdy.SUCCESS;
            z = true;
            if (fdyVar != fdyVar2 && this.f != fdyVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fdx
    public final boolean m(fdx fdxVar) {
        if (!(fdxVar instanceof fdv)) {
            return false;
        }
        fdv fdvVar = (fdv) fdxVar;
        return this.a.m(fdvVar.a) && this.b.m(fdvVar.b);
    }

    @Override // defpackage.fdx
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            fdy fdyVar = this.e;
            fdy fdyVar2 = fdy.RUNNING;
            z = true;
            if (fdyVar != fdyVar2 && this.f != fdyVar2) {
                z = false;
            }
        }
        return z;
    }
}
