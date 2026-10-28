package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvx {
    public final acxt a;
    boolean b;
    public agfr c;
    public abdl d;
    private akrn e;
    private ViewGroup f;
    private final xgm g;
    private final Context h;
    private final awmd i;
    private final awmd j;
    private final acyx k;
    private final Executor l;
    private final awmd m;
    private final boolean n;
    private oso o;
    private final hno p;

    public acvx(tqj tqjVar, xgm xgmVar, awmd awmdVar, awmd awmdVar2, acyx acyxVar, hno hnoVar, Executor executor, Context context, awmd awmdVar3, awmd awmdVar4) {
        int i = tqr.a;
        this.n = tqjVar.k(1073830488);
        this.g = xgmVar;
        this.a = (acxt) awmdVar2.io();
        this.k = acyxVar;
        this.p = hnoVar;
        this.m = awmdVar;
        this.d = new abdl(xgmVar.hB(), executor, new wix(14), Boolean.FALSE);
        this.l = executor;
        this.h = context;
        this.j = awmdVar3;
        this.i = awmdVar4;
    }

    private final boolean e(ViewGroup viewGroup, akrn akrnVar) {
        return akrnVar.equals(this.e) && viewGroup == this.f && viewGroup.getChildCount() > 0;
    }

    public final xgn a(String str) {
        return (str == null || !this.p.ak()) ? new adyn(this, 1).hB() : ((aenr) ((aenu) this.m.io()).f(str).io()).a();
    }

    public final void b() {
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f.setVisibility(8);
            this.f = null;
            this.e = null;
        }
        this.a.b(null);
        oso osoVar = this.o;
        if (osoVar != null) {
            osoVar.b();
            if (this.n) {
                this.o = null;
            }
        }
        xgm xgmVar = this.g;
        this.d = new abdl(xgmVar.hB(), this.l, new wix(15), Boolean.FALSE);
    }

    public final void c(ViewGroup viewGroup, akrn akrnVar, String str) {
        if (e(viewGroup, akrnVar)) {
            return;
        }
        acfz.I(viewGroup, true);
        oso osoVar = this.o;
        if (osoVar == null || !this.b) {
            adly adlyVar = new adly();
            xgn xgnVarA = a(str);
            xgnVarA.getClass();
            adlyVar.a(xgnVarA);
            acxm acxmVarC = this.k.c(akrnVar);
            acxt acxtVar = this.a;
            acxtVar.f(adlyVar, acxmVarC, true);
            viewGroup.removeAllViews();
            View viewA = acxtVar.a();
            if (viewA != null) {
                ViewParent parent = viewA.getParent();
                if (parent instanceof ViewManager) {
                    ((ViewManager) parent).removeView(viewA);
                }
                viewGroup.addView(viewA);
            }
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(osoVar.a());
        }
        this.e = akrnVar;
        this.f = viewGroup;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    public final void d(ViewGroup viewGroup, akrn akrnVar, String str, boolean z) {
        boolean z2;
        oso osoVar;
        if (akrnVar == null || viewGroup == null) {
            return;
        }
        if (z && !this.p.ak()) {
            abdl abdlVar = this.d;
            abdlVar.d = Boolean.TRUE;
            abdlVar.F();
        }
        if (e(viewGroup, akrnVar)) {
            return;
        }
        acfz.I(viewGroup, true);
        acxm acxmVarC = this.k.c(akrnVar);
        adly adlyVar = new adly();
        xgn xgnVarA = a(str);
        xgnVarA.getClass();
        adlyVar.a(xgnVarA);
        vxz vxzVar = (vxz) this.p.i;
        if (!vxzVar.l(97, 45649743L, false) && !vxzVar.l(109, 45677719L, false)) {
            this.b = false;
            if (z) {
                c(viewGroup, akrnVar, str);
                return;
            } else {
                this.a.g(adlyVar, acxmVarC, null);
                return;
            }
        }
        awmd awmdVar = this.j;
        if (((Optional) awmdVar.io()).isPresent()) {
            int i = acxu.a;
            akro akroVar = akrnVar.c;
            if (akroVar == null) {
                akroVar = akro.a;
            }
            if (!akroVar.h) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(arrj.a);
                akrnVar.c(aihlVarCheckIsLite);
                Object objK = akrnVar.j.k(aihlVarCheckIsLite.d);
                byte[] bArrA = acxu.a((aigj) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
                if (!qnl.aF(aigm.O(bArrA, 0, bArrA.length, false))) {
                    z2 = false;
                }
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.b = z2;
        if (!z2) {
            this.a.g(adlyVar, acxmVarC, new acvw(this, viewGroup, akrnVar, str, 0));
            return;
        }
        ElementsServices elementsServices = (ElementsServices) ((Optional) awmdVar.io()).get();
        oso osoVar2 = this.o;
        if (osoVar2 == null) {
            ahno.G(View.MeasureSpec.getMode(0) != 0, "Presenting RenderNext UI with unknown width");
            oso osoVar3 = new oso(elementsServices, this.h, View.MeasureSpec.getSize(0));
            this.o = osoVar3;
            osoVar = osoVar3;
        } else {
            osoVar = osoVar2;
        }
        awmd awmdVar2 = this.i;
        xgm xgmVar = this.g;
        opf opfVarA = oph.a();
        opfVarA.c = aguu.al(new rrw(this, awmdVar2, str, akrnVar, 4));
        opfVarA.c(1);
        opfVarA.b = new adaq(null, null, xgmVar.hB(), null);
        opfVarA.d(this.c);
        opfVarA.b(true);
        oph ophVarA = opfVarA.a();
        osoVar.d(new aasv(this, viewGroup, akrnVar, str, 11));
        osoVar.c(acxmVarC.c, acxmVarC instanceof adai ? ((adai) acxmVarC).e : new ElementsRetainedState(), ophVarA);
    }
}
