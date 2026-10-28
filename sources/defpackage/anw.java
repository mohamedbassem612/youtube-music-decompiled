package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anw extends anj implements and, anl, any {
    public final ans f;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean m;
    public float n;
    public int g = Alert.DURATION_SHOW_INDEFINITELY;
    public int o = 3;
    private long q = 0;
    public final vbq p = new vbq(this);
    public final aiz k = new aiz(new anw[16]);
    public boolean l = true;

    public anw(ans ansVar) {
        this.f = ansVar;
        ape.d(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.amz
    public final int a(int i) {
        return m().a(i);
    }

    @Override // defpackage.amz
    public final int b(int i) {
        return m().b(i);
    }

    @Override // defpackage.amz
    public final int c(int i) {
        return m().c(i);
    }

    @Override // defpackage.amz
    public final int d(int i) {
        return m().d(i);
    }

    @Override // defpackage.and
    public final anj e(long j) throws Throwable {
        if (l().g == 3) {
            l().g();
        }
        this.o = 3;
        anq anqVarL = l();
        try {
            amw.a("LayoutNode should be attached to an owner");
            throw new awmh();
        } catch (Throwable th) {
            anqVarL.k(th);
            throw new awmh();
        }
    }

    @Override // defpackage.anl
    public final int f() {
        return this.g;
    }

    @Override // defpackage.anl
    public final aoa g() {
        return l().c();
    }

    @Override // defpackage.anl
    public final void h() {
        this.m = true;
        if (this.j) {
            aiz aizVarA = l().a();
            Object[] objArr = aizVarA.a;
            int i = aizVarA.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((anq) objArr[i2]).n();
            }
        }
        if (g().g || !this.j) {
            vbq vbqVar = this.p;
            if (vbqVar.a) {
                Object obj = vbqVar.d;
            }
            this.m = false;
            return;
        }
        this.j = false;
        p();
        this.f.a(false);
        amw.a("LayoutNode should be attached to an owner");
        throw new awmh();
    }

    @Override // defpackage.anl
    public final void i(boolean z) {
        g().g = z;
    }

    @Override // defpackage.anl
    public final boolean j() {
        return g().g;
    }

    @Override // defpackage.any
    public final void k() {
        m();
    }

    public final anq l() {
        return this.f.a;
    }

    public final aoa m() {
        return this.f.a.d.c;
    }

    public final void n() {
        boolean z = this.h;
        this.h = true;
        anq anqVarL = l();
        if (!z) {
            anqVarL.c().m();
            amw.a("LayoutNode should be attached to an owner");
            throw new awmh();
        }
        anqVarL.c();
        for (aoa aoaVarD = anqVarL.d(); !awrc.c(aoaVarD, null) && aoaVarD != null; aoaVarD = null) {
        }
        aiz aizVarA = anqVarL.a();
        Object[] objArr = aizVarA.a;
        int i = aizVarA.b;
        for (int i2 = 0; i2 < i; i2++) {
            anq anqVar = (anq) objArr[i2];
            if (anqVar.b().g != Integer.MAX_VALUE) {
                anqVar.b().n();
                int iL = anqVar.l();
                int i3 = iL - 1;
                if (iL == 0) {
                    throw null;
                }
                if (i3 != 4) {
                    int iL2 = anqVar.l();
                    wf.f(iL2);
                    throw new IllegalStateException("Unexpected state ".concat(wf.f(iL2)));
                }
                boolean z2 = anqVar.e.b;
                anqVar.n();
                anqVar.m();
            }
        }
    }

    public final void o() {
        if (!l().j() || this.f.e <= 0) {
            return;
        }
        ans ansVar = l().e;
        if (ansVar.c || ansVar.d) {
            ansVar.b();
        }
        aiz aizVarA = l().a();
        Object[] objArr = aizVarA.a;
        int i = aizVarA.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((anq) objArr[i2]).b().o();
        }
    }

    public final void p() {
        this.f.k = 3;
    }

    @Override // defpackage.anj
    protected final void q(long j) throws Throwable {
        anq anqVarL = l();
        try {
            if (j != this.q) {
                ans ansVar = this.f;
                if (ansVar.d || ansVar.c) {
                    this.j = true;
                }
            }
            p();
            this.q = j;
            amw.a("LayoutNode should be attached to an owner");
            throw new awmh();
        } catch (Throwable th) {
            anqVarL.k(th);
            throw new awmh();
        }
    }

    @Override // defpackage.anl
    public final vbq t() {
        return this.p;
    }
}
