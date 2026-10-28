package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cdg implements cns, cjv {
    public final /* synthetic */ cdj a;
    private final cdh b;

    public cdg(cdj cdjVar, cdh cdhVar) {
        this.a = cdjVar;
        this.b = cdhVar;
    }

    private final Pair l(int i, cnm cnmVar) {
        cnm cnmVarA;
        cnm cnmVar2 = null;
        if (cnmVar != null) {
            cdh cdhVar = this.b;
            int i2 = 0;
            while (true) {
                List list = cdhVar.c;
                if (i2 >= list.size()) {
                    cnmVarA = null;
                    break;
                }
                if (((cnm) list.get(i2)).d == cnmVar.d) {
                    Object obj = cnmVar.a;
                    Object obj2 = cdhVar.b;
                    int i3 = cau.e;
                    cnmVarA = cnmVar.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (cnmVarA == null) {
                return null;
            }
            cnmVar2 = cnmVarA;
        }
        return Pair.create(Integer.valueOf(i + this.b.d), cnmVar2);
    }

    @Override // defpackage.cjv
    public final void c(int i, cnm cnmVar, int i2) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new qd(this, pairL, i2, 5));
        }
    }

    @Override // defpackage.cjv
    public final void d(int i, cnm cnmVar, Exception exc) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new bf(this, pairL, exc, 8, (char[]) null));
        }
    }

    @Override // defpackage.cjv
    public final void e(int i, cnm cnmVar) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new blq((Object) this, (Object) pairL, 18, (byte[]) null));
        }
    }

    @Override // defpackage.cns
    public final void f(int i, cnm cnmVar, cnd cndVar, cni cniVar) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new aew(this, pairL, cndVar, cniVar, 5));
        }
    }

    @Override // defpackage.cns
    public final void g(int i, cnm cnmVar, cnd cndVar, cni cniVar) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new aew(this, pairL, cndVar, cniVar, 6));
        }
    }

    @Override // defpackage.cns
    public final void gd(int i, cnm cnmVar, cni cniVar) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new bf(this, pairL, cniVar, 9, (char[]) null));
        }
    }

    @Override // defpackage.cjv
    public final void ge(int i, cnm cnmVar) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new blq((Object) this, (Object) pairL, 17, (byte[]) null));
        }
    }

    @Override // defpackage.cns
    public final void gm(int i, cnm cnmVar, cni cniVar) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new bf(this, pairL, cniVar, 6, (char[]) null));
        }
    }

    @Override // defpackage.cjv
    public final void gn(int i, cnm cnmVar, auq auqVar) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new bf(this, pairL, auqVar, 7, (char[]) null));
        }
    }

    @Override // defpackage.cns
    public final void h(int i, cnm cnmVar, cnd cndVar, cni cniVar, IOException iOException, boolean z) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new lex(this, pairL, cndVar, cniVar, iOException, z, 1));
        }
    }

    @Override // defpackage.cns
    public final void i(int i, cnm cnmVar, cnd cndVar, cni cniVar, int i2) {
        Pair pairL = l(i, cnmVar);
        if (pairL != null) {
            cdj cdjVar = this.a;
            cdjVar.g.d(new cdf(this, pairL, cndVar, cniVar, i2, 0));
        }
    }
}
