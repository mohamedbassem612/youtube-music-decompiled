package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acni {
    public acnh a;
    public acor b;
    public int c = 0;
    public boolean d = false;
    public final awli e = new awli(Boolean.FALSE);
    public boolean f = false;
    public boolean g = false;
    public final tth h;
    public final vxz i;
    public final hno j;
    private final Context k;

    public acni(Context context, tth tthVar, hno hnoVar, vxz vxzVar) {
        this.k = context;
        this.h = tthVar;
        this.j = hnoVar;
        this.i = vxzVar;
    }

    public final int a() {
        hno hnoVar = this.j;
        boolean zL = ((vxz) hnoVar.i).l(45, 45530957L, false);
        Context context = this.k;
        if (zL) {
            float fI = twm.i(context);
            float fG = twm.g(context);
            if (fI > 0.0f && fG / fI > hnoVar.b()) {
                return 0;
            }
        } else if (nuo.i(context)) {
            return 0;
        }
        return this.c;
    }

    public final void b(apfp apfpVar) {
        if (this.a != null) {
            apfu apfuVar = apfpVar.R;
            if (apfuVar == null) {
                apfuVar = apfu.a;
            }
            apgf apgfVar = apfuVar.f;
            if (apgfVar == null) {
                apgfVar = apgf.a;
            }
            int iAS = a.aS(apgfVar.b);
            if (iAS == 0 || iAS != 2) {
                return;
            }
            c(true);
            this.a.m(tvz.d);
        }
    }

    public final void c(boolean z) {
        this.d = z;
        this.e.kk(Boolean.valueOf(z));
    }

    public final void d(boolean z) {
        acnh acnhVar;
        ViewGroup viewGroup;
        this.g = z;
        if (z && this.j.aQ() && (acnhVar = this.a) != null && this.g && (viewGroup = (ViewGroup) acnhVar.k()) != null) {
            viewGroup.setPadding(0, 0, 0, 0);
        }
    }

    public final boolean e(abnl abnlVar) {
        if (!((vxz) this.j.m).l(103, 45816909L, false)) {
            apfp apfpVarZ = aecm.Z(abnlVar);
            if (aecm.aA(aecm.Z(abnlVar)) != 12 && !aecm.ah(apfpVarZ) && !aecm.ak(apfpVarZ) && !aecm.al(apfpVarZ) && !aecm.ao(apfpVarZ)) {
                return false;
            }
        }
        return true;
    }
}
