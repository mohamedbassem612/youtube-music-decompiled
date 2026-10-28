package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xsh {
    public final xtl b;
    public final xsj c;
    public final xrd d;
    public final tbt e;
    public final awmd f;
    public final abvn g;
    public final awmd h;
    public final cf i;
    public final vxz j;
    public final vxz k;
    public final hfn l;
    public final kro m;
    public final dov n;
    private final Context o;
    private final did p;
    public boolean a = false;
    private final ArrayList q = new ArrayList();

    public xsh(cf cfVar, xtl xtlVar, xsj xsjVar, did didVar, xrd xrdVar, dov dovVar, tbt tbtVar, awmd awmdVar, hfn hfnVar, kro kroVar, abvn abvnVar, awmd awmdVar2, vxz vxzVar, vxz vxzVar2) {
        this.o = cfVar;
        this.b = xtlVar;
        this.c = xsjVar;
        this.p = didVar;
        this.d = xrdVar;
        this.n = dovVar;
        this.e = tbtVar;
        this.f = awmdVar;
        this.l = hfnVar;
        this.m = kroVar;
        this.g = abvnVar;
        this.h = awmdVar2;
        this.j = vxzVar;
        this.i = cfVar;
        this.k = vxzVar2;
    }

    public final int a() {
        return this.c.a();
    }

    public final void b(cf cfVar) {
        if (cfVar != null) {
            dd supportFragmentManager = cfVar.getSupportFragmentManager();
            if (tuk.s(supportFragmentManager)) {
                cc ccVarG = supportFragmentManager.g("DevicePickerOverflowMenuFragment");
                if (ccVarG instanceof gs) {
                    ((gs) ccVarG).dismiss();
                    this.c.h();
                }
            }
        }
    }

    public final void c(boolean z) {
        xsj xsjVar = this.c;
        xsjVar.v = z;
        if ((!xsjVar.v() && xsjVar.v && !xsjVar.s()) || (xsjVar.v() && xsjVar.v)) {
            xsjVar.m(xsjVar.d(xsjVar.p));
        }
        if (z) {
            xsjVar.l(false);
            this.b.e();
            return;
        }
        xsjVar.z = null;
        xsjVar.y.clear();
        xsjVar.A = null;
        xsjVar.B = null;
        xsjVar.C = null;
        xsjVar.D = null;
        xsjVar.E = null;
        xsjVar.F = null;
        xsjVar.G = null;
        xsjVar.L = null;
        xsjVar.H = false;
        this.b.g();
    }

    public final void d() {
        xsj xsjVar;
        xtf xtfVar = new xtf(xsj.e);
        int i = 0;
        while (true) {
            xsjVar = this.c;
            if (i >= xsjVar.p.size()) {
                break;
            }
            Object obj = xsjVar.p.get(i);
            if ((obj instanceof xtf) && !((xtf) obj).equals(xtfVar)) {
                xsjVar.p.set(i, xtfVar);
                break;
            }
            i++;
        }
        xsjVar.k(xsjVar.p);
    }

    public final void e(boolean z) {
        if (z) {
            return;
        }
        xsj xsjVar = this.c;
        xsjVar.J = null;
        xsjVar.K = null;
        xsjVar.I = null;
    }

    public final boolean f() {
        return this.c.w.equals("m");
    }

    public final boolean g() {
        xsj xsjVar = this.c;
        return xsjVar.t || xsjVar.o();
    }

    public final void h(cf cfVar, int i) {
        if (cfVar != null) {
            dd supportFragmentManager = cfVar.getSupportFragmentManager();
            if (tuk.s(supportFragmentManager)) {
                if (this.j.l(208, 45757733L, false) && this.a) {
                    this.a = false;
                    return;
                }
                cc ccVarG = supportFragmentManager.g("DevicePickerDialogFragment");
                if (ccVarG instanceof gs) {
                    ((gs) ccVarG).dismiss();
                    this.c.x(i, a());
                }
            }
        }
    }

    public final void i(azs azsVar) {
        if (azsVar != null) {
            j(azsVar);
            this.q.add(azsVar);
            Context context = this.o;
            dij.b(context).p(this.p, azsVar, 0);
        }
    }

    public final void j(azs azsVar) {
        if (azsVar != null) {
            ArrayList arrayList = this.q;
            if (arrayList.contains(azsVar)) {
                dij.b(this.o).q(azsVar);
                arrayList.remove(azsVar);
            }
        }
    }
}
