package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fee implements fdz, fdx {
    public volatile fdx a;
    public volatile fdx b;
    private final fdz c;
    private final Object d;
    private fdy e;
    private fdy f;
    private boolean g;

    public fee(Object obj, fdz fdzVar) {
        fdy fdyVar = fdy.CLEARED;
        this.e = fdyVar;
        this.f = fdyVar;
        this.d = obj;
        this.c = fdzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [fdz] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.fdz
    public final fdz a() {
        ?? A;
        synchronized (this.d) {
            fdz fdzVar = this.c;
            this = this;
            if (fdzVar != null) {
                A = fdzVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.fdx
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != fdy.SUCCESS) {
                    fdy fdyVar = this.f;
                    fdy fdyVar2 = fdy.RUNNING;
                    if (fdyVar != fdyVar2) {
                        this.f = fdyVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    fdy fdyVar3 = this.e;
                    fdy fdyVar4 = fdy.RUNNING;
                    if (fdyVar3 != fdyVar4) {
                        this.e = fdyVar4;
                        this.a.b();
                    }
                }
                this.g = false;
            } catch (Throwable th) {
                this.g = false;
                throw th;
            }
        }
    }

    @Override // defpackage.fdx
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            fdy fdyVar = fdy.CLEARED;
            this.e = fdyVar;
            this.f = fdyVar;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.fdz
    public final void d(fdx fdxVar) {
        synchronized (this.d) {
            if (!fdxVar.equals(this.a)) {
                this.f = fdy.FAILED;
                return;
            }
            this.e = fdy.FAILED;
            fdz fdzVar = this.c;
            if (fdzVar != null) {
                fdzVar.d(this);
            }
        }
    }

    @Override // defpackage.fdz
    public final void e(fdx fdxVar) {
        synchronized (this.d) {
            if (fdxVar.equals(this.b)) {
                this.f = fdy.SUCCESS;
                return;
            }
            this.e = fdy.SUCCESS;
            fdz fdzVar = this.c;
            if (fdzVar != null) {
                fdzVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.fdx
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = fdy.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = fdy.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.fdz
    public final boolean g(fdx fdxVar) {
        boolean z;
        synchronized (this.d) {
            fdz fdzVar = this.c;
            z = false;
            if ((fdzVar == null || fdzVar.g(this)) && fdxVar.equals(this.a) && this.e != fdy.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.fdz
    public final boolean h(fdx fdxVar) {
        boolean z;
        synchronized (this.d) {
            fdz fdzVar = this.c;
            z = false;
            if ((fdzVar == null || fdzVar.h(this)) && fdxVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.fdz
    public final boolean i(fdx fdxVar) {
        boolean z;
        synchronized (this.d) {
            fdz fdzVar = this.c;
            z = false;
            if ((fdzVar == null || fdzVar.i(this)) && (fdxVar.equals(this.a) || this.e != fdy.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.fdz, defpackage.fdx
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fdx
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == fdy.CLEARED;
        }
        return z;
    }

    @Override // defpackage.fdx
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == fdy.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.fdx
    public final boolean m(fdx fdxVar) {
        if (!(fdxVar instanceof fee)) {
            return false;
        }
        fee feeVar = (fee) fdxVar;
        if (this.a == null) {
            if (feeVar.a != null) {
                return false;
            }
        } else if (!this.a.m(feeVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (feeVar.b != null) {
                return false;
            }
        } else if (!this.b.m(feeVar.b)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fdx
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == fdy.RUNNING;
        }
        return z;
    }
}
