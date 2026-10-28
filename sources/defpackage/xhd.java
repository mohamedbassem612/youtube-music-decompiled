package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class xhd implements vxf {
    private static final String a = "xhd";
    public static final String b;
    public static final String c;
    public static final String e;
    public static final String f;
    private final vxe g;
    private final xgm h;
    private final Set i;
    private final Set j;

    static {
        String name = xhd.class.getName();
        b = String.valueOf(name).concat(".flags");
        c = String.valueOf(name).concat(".log_click");
        e = String.valueOf(name).concat(".click_client_data");
        f = String.valueOf(name).concat(".csn");
    }

    public xhd(vxe vxeVar, xgm xgmVar, Set set, Set set2) {
        if (vxeVar instanceof xhd) {
            this.g = ((xhd) vxeVar).g;
        } else {
            vxeVar.getClass();
            this.g = vxeVar;
        }
        xgmVar.getClass();
        this.h = xgmVar;
        set.getClass();
        this.i = set;
        set2.getClass();
        this.j = set2;
    }

    public static amdd g(ajwo ajwoVar, Map map) {
        amdd amddVar = amdd.a;
        aihf aihfVarCreateBuilder = amddVar.createBuilder();
        ajwp ajwpVar = ajwoVar.e;
        if (ajwpVar == null) {
            ajwpVar = ajwp.a;
        }
        aihl aihlVar = amdx.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwpVar.c(aihlVarCheckIsLite);
        if (ajwpVar.j.n(aihlVarCheckIsLite.d)) {
            ajwp ajwpVar2 = ajwoVar.e;
            if (ajwpVar2 == null) {
                ajwpVar2 = ajwp.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwpVar2.c(aihlVarCheckIsLite2);
            Object objK = ajwpVar2.j.k(aihlVarCheckIsLite2.d);
            aihfVarCreateBuilder.mergeFrom((aihn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
        }
        Object objS = tym.S(map, e);
        if (objS instanceof amdd) {
            aihfVarCreateBuilder.mergeFrom((aihn) objS);
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arkr.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihf aihfVarCreateBuilder2 = amdc.a.createBuilder();
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arkr.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            String str = ((arkr) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).c;
            aihfVarCreateBuilder2.copyOnWrite();
            amdc amdcVar = (amdc) aihfVarCreateBuilder2.instance;
            str.getClass();
            amdcVar.b |= 1;
            amdcVar.c = str;
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar2 = (amdd) aihfVarCreateBuilder.instance;
            amdc amdcVar2 = (amdc) aihfVarCreateBuilder2.build();
            amdcVar2.getClass();
            amddVar2.e = amdcVar2;
            amddVar2.b |= 1;
        } else {
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(araw.a);
            ajwoVar.c(aihlVarCheckIsLite5);
            if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                aihf aihfVarCreateBuilder3 = amdc.a.createBuilder();
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(araw.a);
                ajwoVar.c(aihlVarCheckIsLite6);
                Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                String str2 = ((arav) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).c;
                aihfVarCreateBuilder3.copyOnWrite();
                amdc amdcVar3 = (amdc) aihfVarCreateBuilder3.instance;
                str2.getClass();
                amdcVar3.b |= 1;
                amdcVar3.c = str2;
                aihfVarCreateBuilder.copyOnWrite();
                amdd amddVar3 = (amdd) aihfVarCreateBuilder.instance;
                amdc amdcVar4 = (amdc) aihfVarCreateBuilder3.build();
                amdcVar4.getClass();
                amddVar3.e = amdcVar4;
                amddVar3.b |= 1;
            } else {
                aihl aihlVar2 = aojw.b;
                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar2);
                ajwoVar.c(aihlVarCheckIsLite7);
                if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
                    aihf aihfVarCreateBuilder4 = amdc.a.createBuilder();
                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar2);
                    ajwoVar.c(aihlVarCheckIsLite8);
                    Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
                    String str3 = ((aojw) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4))).c;
                    aihfVarCreateBuilder4.copyOnWrite();
                    amdc amdcVar5 = (amdc) aihfVarCreateBuilder4.instance;
                    str3.getClass();
                    amdcVar5.b |= 1;
                    amdcVar5.c = str3;
                    aihfVarCreateBuilder.copyOnWrite();
                    amdd amddVar4 = (amdd) aihfVarCreateBuilder.instance;
                    amdc amdcVar6 = (amdc) aihfVarCreateBuilder4.build();
                    amdcVar6.getClass();
                    amddVar4.e = amdcVar6;
                    amddVar4.b |= 1;
                } else {
                    aihl aihlVar3 = apyn.b;
                    aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar3);
                    ajwoVar.c(aihlVarCheckIsLite9);
                    if (ajwoVar.j.n(aihlVarCheckIsLite9.d)) {
                        aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar3);
                        ajwoVar.c(aihlVarCheckIsLite10);
                        Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite10.d);
                        apji apjiVar = ((apyn) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5))).c;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                        aihl aihlVarCheckIsLite11 = aihn.checkIsLite(aljv.a);
                        apjiVar.c(aihlVarCheckIsLite11);
                        Object objK6 = apjiVar.j.k(aihlVarCheckIsLite11.d);
                        apji apjiVar2 = ((alju) (objK6 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK6))).b;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite12 = aihn.checkIsLite(arkn.a);
                        apjiVar2.c(aihlVarCheckIsLite12);
                        Object objK7 = apjiVar2.j.k(aihlVarCheckIsLite12.d);
                        arkm arkmVar = (arkm) (objK7 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK7));
                        if (arkmVar.d == 14) {
                            aihf aihfVarCreateBuilder5 = amdc.a.createBuilder();
                            String str4 = arkmVar.d == 14 ? (String) arkmVar.e : "";
                            aihfVarCreateBuilder5.copyOnWrite();
                            amdc amdcVar7 = (amdc) aihfVarCreateBuilder5.instance;
                            str4.getClass();
                            amdcVar7.b |= 1;
                            amdcVar7.c = str4;
                            aihfVarCreateBuilder.copyOnWrite();
                            amdd amddVar5 = (amdd) aihfVarCreateBuilder.instance;
                            amdc amdcVar8 = (amdc) aihfVarCreateBuilder5.build();
                            amdcVar8.getClass();
                            amddVar5.e = amdcVar8;
                            amddVar5.b |= 1;
                        }
                    } else {
                        aihl aihlVar4 = aljt.b;
                        aihl aihlVarCheckIsLite13 = aihn.checkIsLite(aihlVar4);
                        ajwoVar.c(aihlVarCheckIsLite13);
                        if (ajwoVar.j.n(aihlVarCheckIsLite13.d)) {
                            aihf aihfVarCreateBuilder6 = amdc.a.createBuilder();
                            aihl aihlVarCheckIsLite14 = aihn.checkIsLite(aihlVar4);
                            ajwoVar.c(aihlVarCheckIsLite14);
                            Object objK8 = ajwoVar.j.k(aihlVarCheckIsLite14.d);
                            String str5 = ((aljt) (objK8 == null ? aihlVarCheckIsLite14.b : aihlVarCheckIsLite14.c(objK8))).c;
                            aihfVarCreateBuilder6.copyOnWrite();
                            amdc amdcVar9 = (amdc) aihfVarCreateBuilder6.instance;
                            str5.getClass();
                            amdcVar9.b |= 1;
                            amdcVar9.c = str5;
                            aihfVarCreateBuilder.copyOnWrite();
                            amdd amddVar6 = (amdd) aihfVarCreateBuilder.instance;
                            amdc amdcVar10 = (amdc) aihfVarCreateBuilder6.build();
                            amdcVar10.getClass();
                            amddVar6.e = amdcVar10;
                            amddVar6.b |= 1;
                        }
                    }
                }
            }
        }
        amdd amddVar7 = (amdd) aihfVarCreateBuilder.build();
        if (amddVar.equals(amddVar7)) {
            return null;
        }
        return amddVar7;
    }

    public static Map h(Object obj, boolean z) {
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        if (z) {
            map.put(c, Boolean.TRUE);
        }
        return map;
    }

    private static ajwo j(ajwo ajwoVar, String str) {
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        if (TextUtils.isEmpty(str)) {
            aihhVar.d(appx.b);
            return (ajwo) aihhVar.build();
        }
        aihl aihlVar = appx.b;
        if (!aihhVar.c(aihlVar)) {
            aihhVar.e(aihlVar, appw.a);
        }
        aihf builder = ((appw) aihhVar.b(aihlVar)).toBuilder();
        builder.copyOnWrite();
        appw appwVar = (appw) builder.instance;
        str.getClass();
        appwVar.b |= 1;
        appwVar.c = str;
        aihhVar.e(aihlVar, (appw) builder.build());
        return (ajwo) aihhVar.build();
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void a(ajwo ajwoVar) {
        yno.eB(this, ajwoVar);
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void b(List list) {
        yno.eC(this, list);
    }

    @Override // defpackage.vxe
    public final void c(ajwo ajwoVar, Map map) {
        Object objC;
        xgn xgnVar;
        xgn xgnVarHB = this.h.hB();
        if (xgnVarHB == null) {
            xgnVarHB = xgn.l;
        }
        if (map != null && (xgnVar = (xgn) map.get("com.google.android.libraries.youtube.logging.interaction_logger")) != null) {
            xgnVarHB = xgnVar;
        }
        if (i(ajwoVar, map) && (ajwoVar.b & 1) != 0) {
            xgnVarHB.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajwoVar.c, (amud) null), g(ajwoVar, map));
        }
        if (ajwoVar != null && (objC = vxg.c(ajwoVar)) != null && this.i.contains(objC.getClass())) {
            String str = map != null ? (String) map.get(f) : null;
            ajwoVar = TextUtils.isEmpty(str) ? j(ajwoVar, xgnVarHB.i()) : j(ajwoVar, str);
        }
        if ((((Integer) tym.T(map, b, 0)).intValue() & 1) == 0) {
            ajwoVar = xgnVarHB.f(ajwoVar);
        }
        if (map != null && !map.containsKey("com.google.android.libraries.youtube.logging.interaction_logger")) {
            try {
                agkh agkhVar = new agkh(4);
                agkhVar.i(map);
                agkhVar.e("com.google.android.libraries.youtube.logging.interaction_logger", xgnVarHB);
                map = agkhVar.d(true);
            } catch (NullPointerException unused) {
            }
        }
        if (map == null) {
            map = agkj.j("com.google.android.libraries.youtube.logging.interaction_logger", xgnVarHB);
        }
        this.g.c(ajwoVar, map);
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void d(List list, Map map) {
        yno.eD(this, list, map);
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void e(List list, Object obj) {
        yno.eE(this, list, obj);
    }

    @Override // defpackage.vxf
    public final vxe f() {
        vxe vxeVar = this.g;
        return vxeVar instanceof vxf ? ((vxf) vxeVar).f() : vxeVar;
    }

    public final boolean i(ajwo ajwoVar, Map map) {
        Object objC;
        if (ajwoVar == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(araw.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arkr.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (!ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aojw.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (!ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajex.a);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    if (!ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajbh.a);
                        ajwoVar.c(aihlVarCheckIsLite5);
                        if (!ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(akfr.b);
                            ajwoVar.c(aihlVarCheckIsLite6);
                            if (!ajwoVar.j.n(aihlVarCheckIsLite6.d)) {
                                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aomv.b);
                                ajwoVar.c(aihlVarCheckIsLite7);
                                if (!ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
                                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aror.b);
                                    ajwoVar.c(aihlVarCheckIsLite8);
                                    if (!ajwoVar.j.n(aihlVarCheckIsLite8.d)) {
                                        aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aqdn.b);
                                        ajwoVar.c(aihlVarCheckIsLite9);
                                        if (!ajwoVar.j.n(aihlVarCheckIsLite9.d)) {
                                            aihl aihlVarCheckIsLite10 = aihn.checkIsLite(ajdj.b);
                                            ajwoVar.c(aihlVarCheckIsLite10);
                                            if (!ajwoVar.j.n(aihlVarCheckIsLite10.d)) {
                                                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(aptg.b);
                                                ajwoVar.c(aihlVarCheckIsLite11);
                                                if (!ajwoVar.j.n(aihlVarCheckIsLite11.d)) {
                                                    aihl aihlVarCheckIsLite12 = aihn.checkIsLite(apxs.b);
                                                    ajwoVar.c(aihlVarCheckIsLite12);
                                                    if (!ajwoVar.j.n(aihlVarCheckIsLite12.d)) {
                                                        aihl aihlVarCheckIsLite13 = aihn.checkIsLite(amfp.b);
                                                        ajwoVar.c(aihlVarCheckIsLite13);
                                                        if (!ajwoVar.j.n(aihlVarCheckIsLite13.d)) {
                                                            aihl aihlVarCheckIsLite14 = aihn.checkIsLite(apyn.b);
                                                            ajwoVar.c(aihlVarCheckIsLite14);
                                                            if (!ajwoVar.j.n(aihlVarCheckIsLite14.d)) {
                                                                aihl aihlVarCheckIsLite15 = aihn.checkIsLite(aljt.b);
                                                                ajwoVar.c(aihlVarCheckIsLite15);
                                                                if (!ajwoVar.j.n(aihlVarCheckIsLite15.d) && (((objC = vxg.c(ajwoVar)) == null || !this.j.contains(objC.getClass())) && !((Boolean) tym.T(map, c, Boolean.FALSE)).booleanValue())) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
