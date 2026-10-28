package defpackage;

import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cmr implements cns, cjv {
    final /* synthetic */ cms a;
    private final Object b;
    private aae c;
    private aae d;

    public cmr(cms cmsVar, Object obj) {
        this.a = cmsVar;
        this.c = cmsVar.F(null);
        this.d = cmsVar.G(null);
        this.b = obj;
    }

    private final boolean l(int i, cnm cnmVar) {
        cnm cnmVarF;
        if (cnmVar != null) {
            cnmVarF = this.a.f(this.b, cnmVar);
            if (cnmVarF == null) {
                return false;
            }
        } else {
            cnmVarF = null;
        }
        cms cmsVar = this.a;
        int iD = cmsVar.d(this.b, i);
        aae aaeVar = this.c;
        if (aaeVar.a != iD || !Objects.equals(aaeVar.b, cnmVarF)) {
            this.c = cmsVar.A.t(iD, cnmVarF);
        }
        aae aaeVar2 = this.d;
        if (aaeVar2.a != iD || !Objects.equals(aaeVar2.b, cnmVarF)) {
            this.d = cmsVar.B.u(iD, cnmVarF);
        }
        return true;
    }

    private final void m(cni cniVar) {
        cms cmsVar = this.a;
        Object obj = this.b;
        cmsVar.m(obj);
        cmsVar.m(obj);
    }

    @Override // defpackage.cjv
    public final void c(int i, cnm cnmVar, int i2) {
        if (l(i, cnmVar)) {
            this.d.p(i2);
        }
    }

    @Override // defpackage.cjv
    public final void d(int i, cnm cnmVar, Exception exc) {
        if (l(i, cnmVar)) {
            this.d.q(exc);
        }
    }

    @Override // defpackage.cjv
    public final void e(int i, cnm cnmVar) {
        if (l(i, cnmVar)) {
            this.d.r();
        }
    }

    @Override // defpackage.cns
    public final void f(int i, cnm cnmVar, cnd cndVar, cni cniVar) {
        if (l(i, cnmVar)) {
            aae aaeVar = this.c;
            m(cniVar);
            aaeVar.e(cndVar, cniVar);
        }
    }

    @Override // defpackage.cns
    public final void g(int i, cnm cnmVar, cnd cndVar, cni cniVar) {
        if (l(i, cnmVar)) {
            aae aaeVar = this.c;
            m(cniVar);
            aaeVar.g(cndVar, cniVar);
        }
    }

    @Override // defpackage.cns
    public final void gd(int i, cnm cnmVar, cni cniVar) {
        if (l(i, cnmVar)) {
            aae aaeVar = this.c;
            m(cniVar);
            aaeVar.c(cniVar);
        }
    }

    @Override // defpackage.cjv
    public final void ge(int i, cnm cnmVar) {
        if (l(i, cnmVar)) {
            this.d.o();
        }
    }

    @Override // defpackage.cns
    public final void gm(int i, cnm cnmVar, cni cniVar) {
        if (l(i, cnmVar)) {
            aae aaeVar = this.c;
            m(cniVar);
            aaeVar.m(cniVar);
        }
    }

    @Override // defpackage.cjv
    public final void gn(int i, cnm cnmVar, auq auqVar) {
        if (l(i, cnmVar)) {
            this.d.s(auqVar);
        }
    }

    @Override // defpackage.cns
    public final void h(int i, cnm cnmVar, cnd cndVar, cni cniVar, IOException iOException, boolean z) {
        if (l(i, cnmVar)) {
            aae aaeVar = this.c;
            m(cniVar);
            aaeVar.i(cndVar, cniVar, iOException, z);
        }
    }

    @Override // defpackage.cns
    public final void i(int i, cnm cnmVar, cnd cndVar, cni cniVar, int i2) {
        if (l(i, cnmVar)) {
            aae aaeVar = this.c;
            m(cniVar);
            aaeVar.k(cndVar, cniVar, i2);
        }
    }
}
