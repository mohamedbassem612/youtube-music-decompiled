package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aetc {
    public ViewGroup a;
    private final acyx b;
    private final awmd c;
    private final wbz d;
    private final xgm e;
    private final avmb f;

    public aetc(acyx acyxVar, awmd awmdVar, wbz wbzVar, xgm xgmVar, avmb avmbVar) {
        this.b = acyxVar;
        this.c = awmdVar;
        this.d = wbzVar;
        this.e = xgmVar;
        this.f = avmbVar;
    }

    public final void a(aoqt aoqtVar, absm absmVar, zwa zwaVar, absn absnVar) {
        akrn akrnVar = null;
        if ((aoqtVar.b & 1) != 0) {
            apji apjiVar = aoqtVar.c;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = aoqtVar.c;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        if (akrnVar != null) {
            b(akrnVar, absmVar, aoqtVar.d, zwaVar, absnVar);
        } else if (absnVar != null) {
            absnVar.a();
        }
    }

    public final void b(Object obj, absm absmVar, String str, zwa zwaVar, absn absnVar) {
        acnk acnkVar;
        acra acraVar;
        ViewGroup viewGroup = this.a;
        if (viewGroup == null || !(obj instanceof akrn)) {
            if (absnVar != null) {
                absnVar.a();
                return;
            }
            return;
        }
        acxm acxmVarC = this.b.c((akrn) obj);
        adly adlyVar = new adly();
        xgn xgnVarHB = this.e.hB();
        xgnVarHB.getClass();
        adlyVar.a(xgnVarHB);
        acxt acxtVar = (acxt) this.c.io();
        acxtVar.h(adlyVar, acxmVarC, false, false);
        viewGroup.removeAllViews();
        viewGroup.addView(acxtVar.a());
        tuk.l(viewGroup, true);
        if (absnVar != null) {
            absn absnVar2 = ((absf) absnVar).c.g;
            if (absnVar2 != null && (acraVar = (acnkVar = (acnk) absnVar2).m) != null) {
                acsy acsyVar = acnkVar.g;
                acsyVar.b = acraVar.b;
                acsyVar.a = ahno.Z(acnkVar.n);
                actm actmVar = acnkVar.i;
                actmVar.f("r_agis");
                actmVar.e.c(68);
                if (((vxz) acnkVar.s.i).l(50, 45585333L, false)) {
                    actmVar.d();
                }
                acnkVar.f();
                alvl alvlVar = absmVar.b;
                if (alvlVar != null) {
                    acnkVar.j.g(ahno.Z(acnkVar.n), 20, "Playability Error: Failure Reason is " + alvlVar.f + ':' + alvlVar.e);
                }
            }
        } else {
            absnVar = null;
        }
        if (zwaVar == null || str == null || str.isEmpty()) {
            return;
        }
        this.d.e(zwaVar).j(str, false).B(new adhb(4)).O(this.f).ag(new acym(absnVar, 14), new acym(absnVar, 15));
    }
}
