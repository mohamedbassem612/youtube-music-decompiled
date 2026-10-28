package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acok {
    private static final ArrayList g = new ArrayList(Arrays.asList(new xgj(xhb.b(37419)), new xgj(xhb.b(37420)), new xgj(xhb.b(56922)), new xgj(xhb.b(56921)), new xgj(xhb.b(58160))));
    public final xhu a;
    public final actm b;
    public final aunn c;
    public final tqj d;
    final vxz e;
    public final aawr f;
    private final aclz h;
    private final boolean i;
    private final acul j;
    private boolean k;
    private final hno l;

    public acok(aclz aclzVar, tqj tqjVar, vxz vxzVar, acul aculVar, hno hnoVar, aunn aunnVar, xhu xhuVar, aawr aawrVar, actm actmVar) {
        this.h = aclzVar;
        this.a = xhuVar;
        this.f = aawrVar;
        this.b = actmVar;
        int i = tqr.a;
        this.i = tqjVar.k(1073814153);
        this.e = vxzVar;
        this.j = aculVar;
        this.l = hnoVar;
        this.c = aunnVar;
        this.d = tqjVar;
    }

    public static int a(ajwo ajwoVar) {
        aihl aihlVar = apef.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if ((apfpVar.d & 16) != 0) {
                return apfpVar.N;
            }
            return 37414;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        apji apjiVar = ((apef) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apei.a);
        apjiVar.c(aihlVarCheckIsLite4);
        Object objK3 = apjiVar.j.k(aihlVarCheckIsLite4.d);
        apeh apehVar = (apeh) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
        apmn apmnVar = apehVar.c;
        if (apmnVar == null) {
            apmnVar = apmn.a;
        }
        if ((apmnVar.b & 1) == 0) {
            return 83769;
        }
        apmn apmnVar2 = apehVar.c;
        if (apmnVar2 == null) {
            apmnVar2 = apmn.a;
        }
        return apmnVar2.c;
    }

    public final void b(xgn xgnVar) {
        if (this.k) {
            if (!this.l.ak()) {
                xgnVar.t();
            }
            this.k = false;
        }
    }

    public final boolean c(ajwo ajwoVar) {
        apfp apfpVarAa;
        int iAU;
        hno hnoVar = this.l;
        vxz vxzVar = (vxz) hnoVar.m;
        return vxzVar.l(22, 45694776L, false) || hnoVar.ak() || (vxzVar.l(49, 45726051L, false) && (apfpVarAa = aecm.aa(ajwoVar)) != null && (iAU = a.aU(apfpVarAa.M)) != 0 && iAU == 2);
    }

    public final void d(xgn xgnVar, ajwo ajwoVar, String str, String str2, boolean z, boolean z2, apfu apfuVar, Optional optional) {
        xgt xgtVarA;
        actm actmVar = this.b;
        actmVar.f("r_lns");
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            aihf aihfVarCreateBuilder2 = amdk.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            amdk amdkVar = (amdk) aihfVarCreateBuilder2.instance;
            str.getClass();
            amdkVar.b |= 1;
            amdkVar.c = str;
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
            amdk amdkVar2 = (amdk) aihfVarCreateBuilder2.build();
            amdkVar2.getClass();
            amddVar.j = amdkVar2;
            amddVar.b |= 64;
        }
        aihf aihfVarCreateBuilder3 = amdl.a.createBuilder();
        int i = true != z2 ? 2 : 4;
        aihfVarCreateBuilder3.copyOnWrite();
        amdl amdlVar = (amdl) aihfVarCreateBuilder3.instance;
        amdlVar.c = i - 1;
        amdlVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar2 = (amdd) aihfVarCreateBuilder.instance;
        amdl amdlVar2 = (amdl) aihfVarCreateBuilder3.build();
        amdlVar2.getClass();
        amddVar2.v = amdlVar2;
        amddVar2.c |= 268435456;
        hno hnoVar = this.l;
        Bundle bundle = null;
        if (!hnoVar.ak()) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                int iA = a(ajwoVar);
                if (iA == 83769) {
                    aawr.v(zvn.b, zvm.y, "ReelNonVideoContentRenderer did not provide a screen VE type. Logging as UNKNOWN_PAGE.");
                    iA = 83769;
                }
                xgnVar.b(xhb.a(iA), ajwoVar, null);
            } else {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                xgnVar.c(xhb.a(a(ajwoVar)), xgu.a, ajwoVar, acfz.N(this.j, (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)), apfuVar, hnoVar.A()), (amdd) aihfVarCreateBuilder.build());
            }
            this.k = true;
        }
        if (!c(ajwoVar) && z && !TextUtils.isEmpty(str2)) {
            xgnVar.r(str2);
        }
        if (xgnVar != null && (xgtVarA = xgnVar.a()) != null) {
            bundle = new Bundle();
            bundle.putString("tracking_interaction_parent_csn", xgtVarA.a);
            xgtVarA.b();
            bundle.putInt("tracking_interaction_parent_ve", xgtVarA.b().a);
        }
        if (bundle != null) {
            this.a.a = bundle;
        }
        aclz aclzVar = this.h;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            apfp apfpVarY = (apfp) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            if (aclzVar.f.ai()) {
                apfpVarY = aecm.Y(apfpVarY);
            }
            Map map = aclzVar.a;
            if (map.containsKey(apfpVarY)) {
                aclzVar.j(new aata(14));
            } else {
                Map map2 = aclzVar.c;
                if (map2.containsKey(apfpVarY)) {
                    aclzVar.j(new aata(15));
                }
            }
        } else {
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite5);
            if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                agev agevVarI = aclzVar.i(ajwoVar);
                if (agevVarI.g()) {
                    agevVarI.c();
                    aclzVar.j(new aata(16));
                }
            }
        }
        boolean z3 = this.i;
        vxz vxzVar = this.e;
        if (z3) {
            if (!vxzVar.l(166, 45659759L, false)) {
                g.add(0, new xgj(xhb.b(22156)));
            }
            if (hnoVar.aP() && optional.isPresent()) {
                if (((Long) optional.get()).longValue() > 0) {
                    g.add(new xgj(xhb.b(296497)));
                }
                g.add(new xgj(xhb.b(296496)));
            }
            xgnVar.n(g);
        } else {
            if (!vxzVar.l(166, 45659759L, false)) {
                xgnVar.l(new xgj(xhb.b(22156)));
            }
            xgnVar.l(new xgj(xhb.b(37419)));
            xgnVar.l(new xgj(xhb.b(37420)));
            xgnVar.l(new xgj(xhb.b(56922)));
            xgnVar.l(new xgj(xhb.b(56921)));
            xgnVar.l(new xgj(xhb.b(58160)));
            if (hnoVar.aP() && optional.isPresent()) {
                if (((Long) optional.get()).longValue() > 0) {
                    xgnVar.l(new xgj(xhb.b(296497)));
                }
                xgnVar.l(new xgj(xhb.b(296496)));
            }
        }
        actmVar.f("r_lnsc");
    }
}
