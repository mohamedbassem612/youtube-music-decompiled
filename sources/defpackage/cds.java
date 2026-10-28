package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cds {
    public final cdp a;
    public final cdp b;
    public int c = 0;
    public boolean d = false;
    public boolean e = false;
    private final int f;

    public cds(cdp cdpVar, cdp cdpVar2, int i) {
        this.a = cdpVar;
        this.f = i;
        this.b = cdpVar2;
    }

    private final boolean A() {
        int i = this.c;
        return i == 2 || i == 5;
    }

    private final boolean B() {
        int i = this.c;
        return i == 3 || i == 4;
    }

    private final int C(cdp cdpVar, cda cdaVar, pob pobVar, cbf cbfVar) {
        if (cdpVar == null || !t(cdpVar)) {
            return 1;
        }
        cdp cdpVar2 = this.a;
        boolean z = cdpVar != cdpVar2;
        if (cdpVar == cdpVar2 && A()) {
            return 1;
        }
        if (cdpVar == this.b && B()) {
            return 1;
        }
        coo cooVarW = cdpVar.w();
        coo[] cooVarArr = cdaVar.c;
        int i = this.f;
        coo cooVar = cooVarArr[i];
        boolean zD = pobVar.d(i);
        if (zD && cooVarW == cooVar) {
            return 1;
        }
        if (!cdpVar.Y()) {
            bse[] bseVarArrU = u(((cqs[]) pobVar.e)[i]);
            coo cooVar2 = cooVarArr[i];
            cooVar2.getClass();
            cdpVar.O(bseVarArrU, cooVar2, cdaVar.c(), cdaVar.j, cdaVar.g.a);
            return 3;
        }
        if (!cdpVar.ag()) {
            return 0;
        }
        d(cdpVar, cbfVar);
        if (zD && !p()) {
            return 1;
        }
        f(!z);
        return 1;
    }

    public static boolean t(cdp cdpVar) {
        return cdpVar.i() != 0;
    }

    public static bse[] u(cqs cqsVar) {
        int iQ = cqsVar != null ? cqsVar.q() : 0;
        bse[] bseVarArr = new bse[iQ];
        for (int i = 0; i < iQ; i++) {
            cqsVar.getClass();
            bseVarArr[i] = cqsVar.b(i);
        }
        return bseVarArr;
    }

    public static final void v(cdp cdpVar) {
        if (cdpVar.i() == 2) {
            cdpVar.W();
        }
    }

    public static final void w(cdp cdpVar, long j) {
        cdpVar.S();
        if (cdpVar instanceof cpy) {
            cpy cpyVar = (cpy) cdpVar;
            ahno.O(cpyVar.g);
            cpyVar.k = j;
        }
    }

    private final boolean z(cda cdaVar, cdp cdpVar) {
        if (cdpVar == null) {
            return true;
        }
        coo[] cooVarArr = cdaVar.c;
        int i = this.f;
        coo cooVar = cooVarArr[i];
        if (cdpVar.w() == null) {
            return true;
        }
        if (cdpVar.w() == cooVar) {
            if (cooVar == null || cdpVar.X()) {
                return true;
            }
            cda cdaVar2 = cdaVar.h;
            boolean z = cdaVar.g.f;
        }
        for (cda cdaVar3 = cdaVar.h; cdaVar3 != null; cdaVar3 = cdaVar3.h) {
            if (Objects.equals(cdaVar3.c[i], cdpVar.w())) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        cdp cdpVar = this.b;
        boolean zT = t(this.a);
        int i = 0;
        if (cdpVar != null && t(cdpVar)) {
            i = 1;
        }
        return (zT ? 1 : 0) + i;
    }

    public final int b() {
        return this.a.j();
    }

    public final cdp c(cda cdaVar) {
        if (cdaVar == null) {
            return null;
        }
        int i = this.f;
        coo[] cooVarArr = cdaVar.c;
        if (cooVarArr[i] == null) {
            return null;
        }
        cdp cdpVar = this.a;
        coo cooVarW = cdpVar.w();
        coo cooVar = cooVarArr[i];
        if (cooVarW == cooVar) {
            return cdpVar;
        }
        cdp cdpVar2 = this.b;
        if (cdpVar2 == null || cdpVar2.w() != cooVar) {
            return null;
        }
        return cdpVar2;
    }

    public final void d(cdp cdpVar, cbf cbfVar) {
        ahno.O(this.a == cdpVar || this.b == cdpVar);
        if (t(cdpVar)) {
            if (cdpVar == cbfVar.c) {
                cbfVar.d = null;
                cbfVar.c = null;
                cbfVar.e = true;
            }
            v(cdpVar);
            cdpVar.y();
        }
    }

    public final void e(cdp cdpVar, coo cooVar, cbf cbfVar, long j, boolean z) {
        if (t(cdpVar)) {
            if (cooVar != cdpVar.w()) {
                d(cdpVar, cbfVar);
            } else if (z) {
                cdpVar.Q(j, true);
            }
        }
    }

    public final void f(boolean z) {
        if (z) {
            if (this.d) {
                this.a.P();
                this.d = false;
                return;
            }
            return;
        }
        if (this.e) {
            cdp cdpVar = this.b;
            cdpVar.getClass();
            cdpVar.P();
            this.e = false;
        }
    }

    public final void g() {
        if (!t(this.a)) {
            f(true);
        }
        cdp cdpVar = this.b;
        if (cdpVar == null || t(cdpVar)) {
            return;
        }
        f(false);
    }

    public final void h(cda cdaVar, long j) {
        cdp cdpVarC = c(cdaVar);
        cdpVarC.getClass();
        w(cdpVarC, j);
    }

    public final void i() {
        cdp cdpVar = this.a;
        if (cdpVar.i() == 1 && this.c != 5) {
            cdpVar.V();
            return;
        }
        cdp cdpVar2 = this.b;
        if (cdpVar2 == null || cdpVar2.i() != 1 || this.c == 4) {
            return;
        }
        cdpVar2.V();
    }

    public final void j() {
        int i;
        ahno.O(!p());
        if (t(this.a)) {
            i = 4;
        } else {
            cdp cdpVar = this.b;
            if (cdpVar == null || !t(cdpVar)) {
                i = this.c == 0 ? 2 : 3;
            } else {
                i = 5;
            }
        }
        this.c = i;
    }

    public final void k(boolean z) {
        if (z) {
            cdp cdpVar = this.b;
            cdpVar.getClass();
            cdpVar.A(17, this.a);
        } else {
            cdp cdpVar2 = this.a;
            cdp cdpVar3 = this.b;
            cdpVar3.getClass();
            cdpVar2.A(17, cdpVar3);
        }
    }

    public final boolean l(cda cdaVar) {
        return z(cdaVar, this.a) && z(cdaVar, this.b);
    }

    public final boolean m(cda cdaVar) {
        cdp cdpVarC = c(cdaVar);
        cdpVarC.getClass();
        return cdpVarC.X();
    }

    public final boolean n() {
        return this.b != null;
    }

    public final boolean o() {
        cdp cdpVar = this.a;
        boolean zAg = t(cdpVar) ? cdpVar.ag() : true;
        cdp cdpVar2 = this.b;
        return (cdpVar2 == null || !t(cdpVar2)) ? zAg : zAg & cdpVar2.ag();
    }

    public final boolean p() {
        return A() || B();
    }

    public final boolean q(cda cdaVar) {
        return (A() && c(cdaVar) == this.a) || (B() && c(cdaVar) == this.b);
    }

    public final boolean r(cda cdaVar) {
        return c(cdaVar) != null;
    }

    public final boolean s() {
        int i = this.c;
        if (i == 0 || i == 2 || i == 5) {
            return t(this.a);
        }
        cdp cdpVar = this.b;
        cdpVar.getClass();
        return t(cdpVar);
    }

    public final int x(cda cdaVar, pob pobVar, cbf cbfVar) {
        int iC = C(this.a, cdaVar, pobVar, cbfVar);
        return iC == 1 ? C(this.b, cdaVar, pobVar, cbfVar) : iC;
    }

    public final void y(pob pobVar, pob pobVar2, long j) {
        int i;
        cdp cdpVar = this.b;
        int i2 = this.f;
        boolean zD = pobVar.d(i2);
        boolean zD2 = pobVar2.d(i2);
        if (cdpVar == null || (i = this.c) == 4 || i == 3 || (i == 0 && t(this.a))) {
            cdpVar = this.a;
        }
        if (!zD || cdpVar.Y()) {
            return;
        }
        b();
        cdr cdrVar = ((cdr[]) pobVar.d)[i2];
        cdr cdrVar2 = ((cdr[]) pobVar2.d)[i2];
        if (zD2 && Objects.equals(cdrVar2, cdrVar) && !p()) {
            return;
        }
        w(cdpVar, j);
    }
}
