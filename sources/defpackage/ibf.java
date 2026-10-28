package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibf extends iaz {
    public final ibe f;
    public boolean g;
    private boolean h;
    private boolean i;

    public ibf(ibe ibeVar, iba ibaVar) {
        super(ibeVar, ibaVar);
        this.f = ibeVar;
        this.g = true;
    }

    private final void l(boolean z, boolean z2) {
        this.h = z;
        i(z2);
    }

    @Override // defpackage.iaz
    public final void b() {
        ibe ibeVar = this.f;
        this.e.e(aaja.f(ibeVar.w() ? ibeVar.a() : this.b.c, this.b.a));
    }

    public final void e(boolean z) {
        this.e.d(false, z);
        l(false, z);
    }

    public final void f() {
        int i;
        ibe ibeVar = this.f;
        if (ibeVar.w() || (i = ibeVar.i) == 1) {
            return;
        }
        if (i == 2) {
            ibeVar.d.a();
            return;
        }
        ibc ibcVar = ibeVar.d;
        ibcVar.a();
        ibcVar.f.postDelayed(ibcVar.e, ibcVar.d);
    }

    public final void g(boolean z) {
        if (this.i != z) {
            this.i = z;
            h();
            i(false);
        }
    }

    public final void h() {
        boolean z = !this.i;
        ibe ibeVar = this.f;
        if (ibeVar.g != z) {
            boolean zH = ibeVar.h();
            ibeVar.g = z;
            if (zH != ibeVar.h()) {
                ibeVar.requestLayout();
            }
        }
    }

    public final void i(boolean z) {
        boolean z2 = !this.i || (this.g && this.h);
        ibe ibeVar = this.f;
        if (z2) {
            ibb ibbVar = ibeVar.c;
            if (ibbVar.b() == 1.0f) {
                ibbVar.f();
            } else {
                if (z) {
                    ibbVar.d();
                } else {
                    ibbVar.f();
                }
                ibbVar.a.postInvalidate();
            }
        } else {
            ibb ibbVar2 = ibeVar.c;
            if (ibbVar2.b() == 0.0f) {
                ibbVar2.g();
            } else {
                if (z) {
                    ibbVar2.c();
                } else {
                    ibbVar2.g();
                    ibbVar2.a.b();
                }
                ibbVar2.a.postInvalidate();
            }
        }
        if (!z2) {
            int i = bac.a;
            ibeVar.setImportantForAccessibility(2);
        } else {
            f();
            int i2 = bac.a;
            ibeVar.setImportantForAccessibility(1);
        }
    }

    public final void j(int i) {
        ibe ibeVar = this.f;
        if (ibeVar.i != i) {
            ibeVar.i = i;
            if (i != 2) {
                if (!ibeVar.w()) {
                    ibc ibcVar = ibeVar.d;
                    ibe ibeVar2 = ibcVar.f;
                    ibeVar2.removeCallbacks(ibcVar.e);
                    if (ibcVar.b() == 0.0f) {
                        ibcVar.g();
                    } else {
                        ibcVar.c();
                        ibeVar2.postInvalidate();
                    }
                }
                ibeVar.b();
            }
        }
    }

    public final void k() {
        this.e.d(true, false);
        l(true, false);
    }
}
