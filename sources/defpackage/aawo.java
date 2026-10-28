package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aawo {
    public static final xgz a(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVar = aoaq.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                objC.getClass();
                argn argnVar = ((aoar) objC).j;
                if (argnVar == null) {
                    argnVar = argn.a;
                }
                return new xgx(argnVar);
            }
        }
        return null;
    }

    public static final xhz b(xhy xhyVar, xhy xhyVar2, Runnable runnable, wjf wjfVar, String str, ajwo ajwoVar) {
        xhyVar.getClass();
        xhyVar2.getClass();
        if (wjfVar == null) {
            return null;
        }
        xhz xhzVarO = o(xhyVar, runnable, new xgj(wjfVar.ab()), ajwoVar);
        if (str == null) {
            return xhzVarO;
        }
        p(xhyVar2, a(ajwoVar), str);
        return xhzVarO;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public static final xhz c(xhy xhyVar, xhy xhyVar2, Runnable runnable, wgi wgiVar, String str, ajwo ajwoVar) {
        xhz xhzVarO;
        xhyVar.getClass();
        xhyVar2.getClass();
        if (wgiVar == null) {
            return null;
        }
        ajwo ajwoVar2 = wgiVar.d;
        if (ajwoVar2 != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
            ajwoVar2.c(aihlVarCheckIsLite);
            if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                xhzVarO = o(xhyVar, runnable, new xgj(xhb.b(13187)), ajwoVar);
            } else {
                xhzVarO = o(xhyVar, runnable, new xgj(wgiVar.d()), ajwoVar);
            }
        } else {
            xhzVarO = o(xhyVar, runnable, new xgj(wgiVar.d()), ajwoVar);
        }
        if (str != null) {
            p(xhyVar2, a(ajwoVar), str);
        }
        avbm avbmVar = wgiVar.h;
        if (avbmVar != null) {
            aaoz aaozVar = new aaoz(xhyVar, 5);
            Object obj = avbmVar.g;
            if (obj != null) {
                ((wfx) obj).a(aaozVar);
            }
            Object obj2 = avbmVar.b;
            if (obj2 != null) {
                ((wfx) obj2).a(aaozVar);
            }
            Object obj3 = avbmVar.e;
            if (obj3 != null) {
                ((wfx) obj3).a(aaozVar);
            }
            Object obj4 = avbmVar.a;
            if (obj4 != null) {
                ((wfx) obj4).a(aaozVar);
            }
            Object obj5 = avbmVar.c;
            if (obj5 != null) {
                ((wfx) obj5).a(aaozVar);
            }
            Object obj6 = avbmVar.d;
            if (obj6 != null) {
                ((wfx) obj6).a(aaozVar);
            }
            Object obj7 = avbmVar.f;
            if (obj7 != null) {
                ((wfx) obj7).a(aaozVar);
            }
            Object obj8 = avbmVar.i;
            if (obj8 != null) {
                ((wfx) obj8).a(aaozVar);
            }
            Object obj9 = avbmVar.h;
            if (obj9 != null) {
                ((wfx) obj9).a(aaozVar);
            }
        }
        return xhzVarO;
    }

    public static wgs d(wjf wjfVar, acca accaVar) {
        wja wjaVarG = wjfVar.g();
        if (wjaVarG != null) {
            for (wgs wgsVar : wjaVarG.r) {
                if (TextUtils.equals(wgsVar.f, accaVar.n)) {
                    return wgsVar;
                }
            }
        }
        return null;
    }

    public static List e(wjf wjfVar, int i) {
        Optional optionalEmpty;
        Optional optionalEmpty2;
        Optional optionalEmpty3;
        Optional optionalEmpty4;
        acca accaVarA;
        ArrayList arrayList = new ArrayList();
        for (wgs wgsVar : wjfVar.g().r) {
            if (wgsVar.e() == i) {
                String str = wgsVar.c;
                acbz acbzVarA = acca.a();
                if (str != null) {
                    acbzVarA.n(str);
                }
                String strC = wgsVar.C();
                if (strC != null) {
                    acbzVarA.a = strC;
                }
                acbj acbjVarA = acbk.a();
                alaw alawVar = wgsVar.b;
                ajoj ajojVar = alawVar.E;
                if (ajojVar == null) {
                    ajojVar = ajoj.a;
                }
                ajoi ajoiVar = ajojVar.g;
                if (ajoiVar == null) {
                    ajoiVar = ajoi.a;
                }
                if ((ajoiVar.b & 1) != 0) {
                    ajoj ajojVar2 = alawVar.E;
                    if (ajojVar2 == null) {
                        ajojVar2 = ajoj.a;
                    }
                    ajoi ajoiVar2 = ajojVar2.g;
                    if (ajoiVar2 == null) {
                        ajoiVar2 = ajoi.a;
                    }
                    optionalEmpty = Optional.of(Double.valueOf(ajoiVar2.c));
                } else {
                    optionalEmpty = Optional.empty();
                }
                Double dValueOf = Double.valueOf(0.0d);
                acbjVarA.c(((Double) optionalEmpty.orElse(dValueOf)).doubleValue());
                ajoj ajojVar3 = alawVar.E;
                ajoi ajoiVar3 = (ajojVar3 == null ? ajoj.a : ajojVar3).g;
                if (ajoiVar3 == null) {
                    ajoiVar3 = ajoi.a;
                }
                if ((ajoiVar3.b & 2) != 0) {
                    if (ajojVar3 == null) {
                        ajojVar3 = ajoj.a;
                    }
                    ajoi ajoiVar4 = ajojVar3.g;
                    if (ajoiVar4 == null) {
                        ajoiVar4 = ajoi.a;
                    }
                    optionalEmpty2 = Optional.of(Double.valueOf(ajoiVar4.d));
                } else {
                    optionalEmpty2 = Optional.empty();
                }
                acbjVarA.d(((Double) optionalEmpty2.orElse(dValueOf)).doubleValue());
                ajoj ajojVar4 = alawVar.E;
                ajoi ajoiVar5 = (ajojVar4 == null ? ajoj.a : ajojVar4).g;
                if (ajoiVar5 == null) {
                    ajoiVar5 = ajoi.a;
                }
                if ((ajoiVar5.b & 4) != 0) {
                    if (ajojVar4 == null) {
                        ajojVar4 = ajoj.a;
                    }
                    ajoi ajoiVar6 = ajojVar4.g;
                    if (ajoiVar6 == null) {
                        ajoiVar6 = ajoi.a;
                    }
                    optionalEmpty3 = Optional.of(Double.valueOf(ajoiVar6.e));
                } else {
                    optionalEmpty3 = Optional.empty();
                }
                Double dValueOf2 = Double.valueOf(1.0d);
                acbjVarA.e(((Double) optionalEmpty3.orElse(dValueOf2)).doubleValue());
                ajoj ajojVar5 = alawVar.E;
                ajoi ajoiVar7 = (ajojVar5 == null ? ajoj.a : ajojVar5).g;
                if (ajoiVar7 == null) {
                    ajoiVar7 = ajoi.a;
                }
                if ((ajoiVar7.b & 8) != 0) {
                    if (ajojVar5 == null) {
                        ajojVar5 = ajoj.a;
                    }
                    ajoi ajoiVar8 = ajojVar5.g;
                    if (ajoiVar8 == null) {
                        ajoiVar8 = ajoi.a;
                    }
                    optionalEmpty4 = Optional.of(Double.valueOf(ajoiVar8.f));
                } else {
                    optionalEmpty4 = Optional.empty();
                }
                acbjVarA.b(((Double) optionalEmpty4.orElse(dValueOf2)).doubleValue());
                acbzVarA.c(acbjVarA.a());
                if (wgsVar.y().isEmpty()) {
                    String displayName = Locale.forLanguageTag("en").getDisplayName(Locale.getDefault());
                    acbzVarA.i("en");
                    acbzVarA.o(".en");
                    acbzVarA.e(wgsVar.f);
                    acbzVarA.m("");
                    acbzVarA.c = displayName;
                    acbzVarA.j(displayName);
                    acbzVarA.l("");
                    acbzVarA.d(wgsVar.e());
                    acbzVarA.k(wgsVar.x());
                    accaVarA = acbzVarA.a();
                } else {
                    acbzVarA.i(wgsVar.y());
                    ajoj ajojVar6 = alawVar.E;
                    if (ajojVar6 == null) {
                        ajojVar6 = ajoj.a;
                    }
                    acbzVarA.o(ajojVar6.d);
                    acbzVarA.e(wgsVar.f);
                    acbzVarA.m("");
                    acbzVarA.c = wgsVar.w();
                    acbzVarA.j(Locale.forLanguageTag(wgsVar.y().replace("_", "-")).getDisplayName(Locale.getDefault()));
                    acbzVarA.l(wgsVar.w());
                    acbzVarA.d(wgsVar.e());
                    acbzVarA.k(wgsVar.x());
                    accaVarA = acbzVarA.a();
                }
                arrayList.add(accaVarA);
            }
        }
        return arrayList;
    }

    public static acbd f(wgs wgsVar, twi twiVar, aunn aunnVar, boolean z, boolean z2, abmt abmtVar) {
        int iE = wgsVar.e();
        if (iE == 386) {
            return new acbe(twiVar, aunnVar, z, z2, abmtVar);
        }
        if (iE != 387) {
            return null;
        }
        return new acbf(twiVar);
    }

    public static final int g(wjm wjmVar, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z4 && !z && z2 && z3;
        if (wjmVar == null) {
            return 0;
        }
        int i = true == z ? 4 : 0;
        return !z5 ? wjmVar.b(i) : i;
    }

    public static final abzb h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, float f, float f2, int i, String str10, String str11, agkj agkjVar, Optional optional, int i2, byte b) {
        return new abzb(str, str2, str3, str4, str5, str6, "0", str8, str9, f, f2, i, str10, str11, agkjVar, optional, i2);
    }

    public static final agke i(List list) {
        list.getClass();
        agjz agjzVar = new agjz(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar = (ajwo) it.next();
            if (ajwoVar != null) {
                aihf aihfVarCreateBuilder = apgk.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                    objC.getClass();
                    apfp apfpVar = (apfp) objC;
                    if ((apfpVar.d & 262144) != 0) {
                        String str = apfpVar.U;
                        str.getClass();
                        aihfVarCreateBuilder.copyOnWrite();
                        apgk apgkVar = (apgk) aihfVarCreateBuilder.instance;
                        apgkVar.b |= 1;
                        apgkVar.c = str;
                    }
                }
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                agjzVar.h((apgk) aihnVarBuild);
            }
        }
        agke agkeVarG = agjzVar.g();
        agkeVarG.getClass();
        return agkeVarG;
    }

    public static final boolean j(acra acraVar) {
        ajwo ajwoVar;
        if (acraVar == null || (ajwoVar = acraVar.f) == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        objC.getClass();
        apfp apfpVar = (apfp) objC;
        return (apfpVar.c & 64) != 0 && aasc.c(apfpVar.q);
    }

    public static acor k(cc ccVar) {
        return new acor(ccVar.requireContext());
    }

    public static Optional l(acoi acoiVar) {
        return Optional.ofNullable(acoiVar.aZ);
    }

    public static eqq m(Activity activity, tza tzaVar, vxe vxeVar) {
        return new eqq(new ContextThemeWrapper(activity, tzaVar.a), tzaVar, vxeVar);
    }

    public static acou n(cc ccVar, hno hnoVar) {
        acou acouVar = new acou(ccVar.requireContext(), hnoVar);
        int i = 0;
        boolean zL = ((vxz) hnoVar.f).l(359, 45834531L, false);
        acouVar.c = zL;
        while (true) {
            SparseArray sparseArray = acouVar.b;
            if (i >= sparseArray.size()) {
                return acouVar;
            }
            ((accs) sparseArray.valueAt(i)).a(zL);
            i++;
        }
    }

    private static final xhz o(xhy xhyVar, Runnable runnable, xgj xgjVar, ajwo ajwoVar) {
        xgz xgzVarA = a(ajwoVar);
        xhz xhzVarE = xgzVarA != null ? xhyVar.e(xgjVar, xgzVarA) : xhyVar.d(xgjVar);
        runnable.run();
        return xhzVarE;
    }

    private static final void p(xhy xhyVar, xgz xgzVar, String str) {
        if (xgzVar == null) {
            xhyVar.r(str);
        } else {
            xhyVar.s(xgzVar, str);
        }
    }
}
