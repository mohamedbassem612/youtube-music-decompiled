package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ces implements btf, cns, crc, cjv {
    public final bvd a;
    public final SparseArray b;
    public bth c;
    public bvq d;
    public boolean e;
    public final dhf f;
    public dje g;
    private final btl h;
    private final btm i;

    public ces(bvd bvdVar) {
        bvdVar.getClass();
        this.a = bvdVar;
        int i = bwp.a;
        Looper looperMyLooper = Looper.myLooper();
        this.g = new dje((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        btl btlVar = new btl();
        this.h = btlVar;
        this.i = new btm();
        this.f = new dhf(btlVar);
        this.b = new SparseArray();
    }

    private final cdy I(cnm cnmVar) {
        this.c.getClass();
        btn btnVarO = cnmVar == null ? null : this.f.o(cnmVar);
        if (cnmVar != null && btnVarO != null) {
            return C(btnVarO, btnVarO.m(cnmVar.a, this.h).c, cnmVar);
        }
        int iL = this.c.l();
        btn btnVarW = this.c.w();
        if (iL >= btnVarW.c()) {
            btnVarW = btn.a;
        }
        return C(btnVarW, iL, null);
    }

    private final cdy J(int i, cnm cnmVar) {
        bth bthVar = this.c;
        bthVar.getClass();
        if (cnmVar != null) {
            return this.f.o(cnmVar) != null ? I(cnmVar) : C(btn.a, i, cnmVar);
        }
        btn btnVarW = bthVar.w();
        if (i >= btnVarW.c()) {
            btnVarW = btn.a;
        }
        return C(btnVarW, i, null);
    }

    private final cdy K(bta btaVar) {
        cnm cnmVar;
        return (!(btaVar instanceof cbo) || (cnmVar = ((cbo) btaVar).h) == null) ? B() : I(cnmVar);
    }

    @Override // defpackage.btf
    public final void A() {
        H(B(), 14, new cce(11));
    }

    public final cdy B() {
        return I((cnm) this.f.e);
    }

    protected final cdy C(btn btnVar, int i, cnm cnmVar) {
        cnm cnmVar2 = true == btnVar.n() ? null : cnmVar;
        long jB = this.a.b();
        boolean z = btnVar.equals(this.c.w()) && i == this.c.l();
        long jA = 0;
        if (cnmVar2 == null || !cnmVar2.c()) {
            if (z) {
                ccm ccmVar = (ccm) this.c;
                ccmVar.ae();
                jA = ccmVar.Q(ccmVar.A);
            } else if (!btnVar.n()) {
                jA = btnVar.e(i, this.i, 0L).a();
            }
        } else if (z && this.c.j() == cnmVar2.b && this.c.k() == cnmVar2.c) {
            jA = this.c.r();
        }
        return new cdy(jB, btnVar, i, cnmVar2, jA, this.c.w(), this.c.l(), (cnm) this.f.e, this.c.r(), this.c.t());
    }

    public final cdy D() {
        return I((cnm) this.f.d);
    }

    public final cdy E() {
        return I((cnm) this.f.c);
    }

    public final void F(cdz cdzVar) {
        cdzVar.getClass();
        this.g.c(cdzVar);
    }

    @Override // defpackage.crc
    public final void G(final int i, final long j, long j2) {
        dhf dhfVar = this.f;
        final cdy cdyVarI = I(((agke) dhfVar.a).isEmpty() ? null : (cnm) aguu.K(dhfVar.a));
        H(cdyVarI, 1006, new bvs() { // from class: cec
            @Override // defpackage.bvs
            public final void a(Object obj) {
                ((cdz) obj).aw(cdyVarI, i, j);
            }
        });
    }

    public final void H(cdy cdyVar, int i, bvs bvsVar) {
        this.b.put(i, cdyVar);
        this.g.h(i, bvsVar);
    }

    @Override // defpackage.btf
    public final void b(final int i) {
        final cdy cdyVarE = E();
        H(cdyVarE, 21, new bvs() { // from class: cem
            @Override // defpackage.bvs
            public final void a(Object obj) {
                ((cdz) obj).F(cdyVarE, i);
            }
        });
    }

    @Override // defpackage.cjv
    public final void c(int i, cnm cnmVar, int i2) {
        cdy cdyVarJ = J(i, cnmVar);
        H(cdyVarJ, 1022, new ccd(cdyVarJ, i2, 7));
    }

    @Override // defpackage.cjv
    public final void d(int i, cnm cnmVar, Exception exc) {
        cdy cdyVarJ = J(i, cnmVar);
        H(cdyVarJ, SemanticState.ReadOnly, new cea(cdyVarJ, exc, 9));
    }

    @Override // defpackage.cjv
    public final void e(int i, cnm cnmVar) {
        cdy cdyVarJ = J(i, cnmVar);
        H(cdyVarJ, 1027, new cen(cdyVarJ, 2));
    }

    @Override // defpackage.cns
    public final void f(int i, cnm cnmVar, cnd cndVar, cni cniVar) {
        H(J(i, cnmVar), 1002, new cce(7));
    }

    @Override // defpackage.cns
    public final void g(int i, cnm cnmVar, cnd cndVar, cni cniVar) {
        H(J(i, cnmVar), 1001, new cce(8));
    }

    @Override // defpackage.cns
    public final void gd(int i, cnm cnmVar, cni cniVar) {
        cdy cdyVarJ = J(i, cnmVar);
        H(cdyVarJ, 1004, new cea(cdyVarJ, cniVar, 7));
    }

    @Override // defpackage.cjv
    public final void ge(int i, cnm cnmVar) {
        cdy cdyVarJ = J(i, cnmVar);
        H(cdyVarJ, 1025, new cen(cdyVarJ, 1));
    }

    @Override // defpackage.btf
    public final void gg(boolean z) {
        cdy cdyVarB = B();
        H(cdyVarB, 3, new ceb(cdyVarB, z, 1));
    }

    @Override // defpackage.btf
    public final void gh(boolean z) {
        cdy cdyVarB = B();
        H(cdyVarB, 7, new ceb(cdyVarB, z, 2));
    }

    @Override // defpackage.btf
    public final void gi(bsx bsxVar) {
        cdy cdyVarB = B();
        H(cdyVarB, 28, new cea(cdyVarB, bsxVar, 4, null));
    }

    @Override // defpackage.btf
    public final void gj(boolean z, int i) {
        cdy cdyVarB = B();
        H(cdyVarB, 5, new cej(cdyVarB, z, i, 0));
    }

    @Override // defpackage.btf
    public final void gk(btb btbVar) {
        cdy cdyVarB = B();
        H(cdyVarB, 12, new cea(cdyVarB, btbVar, 1, null));
    }

    @Override // defpackage.btf
    public final void gl(int i) {
        cdy cdyVarB = B();
        H(cdyVarB, 4, new ccd(cdyVarB, i, 6));
    }

    @Override // defpackage.cns
    public final void gm(int i, cnm cnmVar, cni cniVar) {
        cdy cdyVarJ = J(i, cnmVar);
        H(cdyVarJ, 1005, new cea(cdyVarJ, cniVar, 15));
    }

    @Override // defpackage.cjv
    public final void gn(int i, cnm cnmVar, auq auqVar) {
        cdy cdyVarJ = J(i, cnmVar);
        H(cdyVarJ, 1023, new cbv(cdyVarJ, 19));
    }

    @Override // defpackage.cns
    public final void h(int i, cnm cnmVar, final cnd cndVar, final cni cniVar, final IOException iOException, final boolean z) {
        final cdy cdyVarJ = J(i, cnmVar);
        H(cdyVarJ, 1003, new bvs() { // from class: cef
            @Override // defpackage.bvs
            public final void a(Object obj) {
                ((cdz) obj).S(cdyVarJ, cndVar, cniVar, iOException, z);
            }
        });
    }

    @Override // defpackage.cns
    public final void i(int i, cnm cnmVar, cnd cndVar, cni cniVar, int i2) {
        H(J(i, cnmVar), 1000, new cce(12));
    }

    @Override // defpackage.btf
    public final void iE(brq brqVar) {
        cdy cdyVarE = E();
        H(cdyVarE, 20, new cea(cdyVarE, brqVar, 3, null));
    }

    @Override // defpackage.btf
    public final void j(int i) {
        cdy cdyVarB = B();
        H(cdyVarB, 6, new ccd(cdyVarB, i, 4));
    }

    @Override // defpackage.btf
    public final void k(bta btaVar) {
        cdy cdyVarK = K(btaVar);
        H(cdyVarK, 10, new cea(cdyVarK, btaVar, 8, null));
    }

    @Override // defpackage.btf
    public final void l(bta btaVar) {
        H(K(btaVar), 10, new cce(4));
    }

    @Override // defpackage.btf
    public final void m(boolean z, int i) {
        cdy cdyVarB = B();
        H(cdyVarB, -1, new cej(cdyVarB, z, i, 1));
    }

    @Override // defpackage.btf
    public final void n(final btg btgVar, final btg btgVar2, final int i) {
        if (i == 1) {
            this.e = false;
            i = 1;
        }
        dhf dhfVar = this.f;
        bth bthVar = this.c;
        bthVar.getClass();
        Object obj = dhfVar.b;
        dhfVar.e = dhf.p(bthVar, (agke) dhfVar.a, (cnm) dhfVar.d, (btl) obj);
        final cdy cdyVarB = B();
        H(cdyVarB, 11, new bvs() { // from class: ceo
            @Override // defpackage.bvs
            public final void a(Object obj2) {
                ((cdz) obj2).ab(cdyVarB, btgVar, btgVar2, i);
            }
        });
    }

    @Override // defpackage.btf
    public final void p(int i) {
        cdy cdyVarB = B();
        H(cdyVarB, 8, new ccd(cdyVarB, i, 8));
    }

    @Override // defpackage.btf
    public final void q(boolean z) {
        cdy cdyVarE = E();
        H(cdyVarE, 23, new ceb(cdyVarE, z, 0));
    }

    @Override // defpackage.btf
    public final void r(final int i, final int i2) {
        final cdy cdyVarE = E();
        H(cdyVarE, 24, new bvs() { // from class: cer
            @Override // defpackage.bvs
            public final void a(Object obj) {
                ((cdz) obj).ah(cdyVarE, i, i2);
            }
        });
    }

    @Override // defpackage.btf
    public final void s(btu btuVar) {
        cdy cdyVarB = B();
        H(cdyVarB, 2, new cea(cdyVarB, btuVar, 5, null));
    }

    @Override // defpackage.btf
    public final void t(btz btzVar) {
        cdy cdyVarE = E();
        H(cdyVarE, 25, new cea(cdyVarE, btzVar, 12, null));
    }

    @Override // defpackage.btf
    public final void u(final float f) {
        final cdy cdyVarE = E();
        H(cdyVarE, 22, new bvs() { // from class: ced
            @Override // defpackage.bvs
            public final void a(Object obj) {
                ((cdz) obj).as(cdyVarE, f);
            }
        });
    }

    @Override // defpackage.btf
    public final void v(int i) {
        bth bthVar = this.c;
        bthVar.getClass();
        dhf dhfVar = this.f;
        Object obj = dhfVar.b;
        List list = dhfVar.a;
        agke agkeVar = (agke) list;
        dhfVar.e = dhf.p(bthVar, agkeVar, (cnm) dhfVar.d, (btl) obj);
        dhfVar.q(bthVar.w());
        cdy cdyVarB = B();
        H(cdyVarB, 0, new ccd(cdyVarB, i, 2));
    }

    @Override // defpackage.btf
    public final void w() {
        H(B(), 13, new cce(3));
    }

    @Override // defpackage.btf
    public final void x() {
        H(B(), 27, new cce(9));
    }

    @Override // defpackage.btf
    public final void y() {
        H(B(), 27, new cce(5));
    }

    @Override // defpackage.btf
    public final void z(int i) {
        cdy cdyVarB = B();
        H(cdyVarB, 1, new ccd(cdyVarB, i, 3));
    }

    @Override // defpackage.btf
    public final void o() {
    }

    @Override // defpackage.btf
    public final void gf(bth bthVar, bte bteVar) {
    }
}
