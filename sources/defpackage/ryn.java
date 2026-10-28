package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ryn extends ryj {
    private aoki a;
    private final List b;
    private aorh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryn(smr smrVar, sko skoVar, rsk rskVar, rmp rmpVar) {
        super(smrVar, skoVar, rskVar);
        rskVar.getClass();
        rmpVar.getClass();
        this.b = new ArrayList();
    }

    private final void d(String str) {
        smr smrVar = this.d;
        sko skoVar = this.e;
        rmp.m(smrVar, skoVar, str);
        this.f.u(smrVar, skoVar, new sas(str, 3), 10);
    }

    private final void e(String str) {
        smr smrVar = this.d;
        sko skoVar = this.e;
        rmp.m(smrVar, skoVar, str);
        this.f.u(smrVar, skoVar, new sas(str, 3), 16);
    }

    @Override // defpackage.ryj
    public final void V(int i) {
        List list = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list.clear();
        aorh aorhVar = this.c;
        if (aorhVar != null) {
            for (apji apjiVar : aorhVar.b) {
                aihl aihlVar = akxw.a;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                    objC.getClass();
                    String str = ((akxv) objC).b;
                    str.getClass();
                    str.length();
                }
            }
        }
        this.f.d(this.d, this.e, i);
    }

    @Override // defpackage.ryj
    public final void a() {
        agev agevVar = this.e.p;
        if (!agevVar.g()) {
            e("Error: Missing server rendering content in payload.");
            return;
        }
        Object objC = agevVar.c();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aljz.a);
        aihi aihiVar = (aihi) objC;
        aihiVar.c(aihlVarCheckIsLite);
        if (!aihiVar.j.n(aihlVarCheckIsLite.d)) {
            e("Error: Missing InPlayerAdLayoutRenderer extension in payload.");
            return;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aljz.a);
        aihiVar.c(aihlVarCheckIsLite2);
        Object objK = aihiVar.j.k(aihlVarCheckIsLite2.d);
        Object objC2 = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        objC2.getClass();
        aljy aljyVar = (aljy) objC2;
        apji apjiVar = aljyVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVar = aokj.a;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite3);
        if (!apjiVar.j.n(aihlVarCheckIsLite3.d)) {
            apji apjiVar2 = aljyVar.c;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVar2 = aori.a;
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
            apjiVar2.c(aihlVarCheckIsLite4);
            if (!apjiVar2.j.n(aihlVarCheckIsLite4.d)) {
                e("Error: Missing OrganicMediaPlayerAdRenderer or PlayerOverlayLayerRenderer extension in payload.");
                return;
            }
            apji apjiVar3 = aljyVar.c;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar2);
            apjiVar3.c(aihlVarCheckIsLite5);
            Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite5.d);
            this.c = (aorh) (objK2 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK2));
            return;
        }
        apji apjiVar4 = aljyVar.c;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar);
        apjiVar4.c(aihlVarCheckIsLite6);
        Object objK3 = apjiVar4.j.k(aihlVarCheckIsLite6.d);
        Object objC3 = objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3);
        objC3.getClass();
        aoki aokiVar = (aoki) objC3;
        this.a = aokiVar;
        if ((aokiVar.b & 1) != 0) {
            apji apjiVar5 = aokiVar.c;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVar3 = aori.a;
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar3);
            apjiVar5.c(aihlVarCheckIsLite7);
            if (apjiVar5.j.n(aihlVarCheckIsLite7.d)) {
                apji apjiVar6 = aokiVar.c;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar3);
                apjiVar6.c(aihlVarCheckIsLite8);
                Object objK4 = apjiVar6.j.k(aihlVarCheckIsLite8.d);
                this.c = (aorh) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
            }
        }
    }

    @Override // defpackage.ryj
    public final void b() {
        aoki aokiVar = this.a;
        if (aokiVar == null) {
            if (this.c == null) {
                d("Error: Missing organicMediaPlayerAdRenderer or layerRenderer in init.");
                return;
            }
        } else if ((aokiVar.b & 2) != 0) {
            apji apjiVar = aokiVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = aokl.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = aokiVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                objC.getClass();
                aokk aokkVar = (aokk) objC;
                if ((aokkVar.b & 1) != 0) {
                    apji apjiVar3 = aokkVar.c;
                    if (apjiVar3 == null) {
                        apjiVar3 = apji.a;
                    }
                    aihl aihlVar2 = aqmt.a;
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                    apjiVar3.c(aihlVarCheckIsLite3);
                    if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                        apji apjiVar4 = aokkVar.c;
                        if (apjiVar4 == null) {
                            apjiVar4 = apji.a;
                        }
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                        apjiVar4.c(aihlVarCheckIsLite4);
                        Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                        Object objC2 = objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2);
                        objC2.getClass();
                        int i = ((aqms) objC2).b;
                        if ((i & 2) == 0 || (i & 4) == 0) {
                            d("Error: Missing timing data in elapsed time overlay.");
                            return;
                        }
                        this.b.add(new gqd(20));
                    }
                }
                if ((aokkVar.b & 2) != 0) {
                    apji apjiVar5 = aokkVar.d;
                    if (apjiVar5 == null) {
                        apjiVar5 = apji.a;
                    }
                    aihl aihlVar3 = aqmt.a;
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar3);
                    apjiVar5.c(aihlVarCheckIsLite5);
                    if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                        apji apjiVar6 = aokkVar.d;
                        if (apjiVar6 == null) {
                            apjiVar6 = apji.a;
                        }
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar3);
                        apjiVar6.c(aihlVarCheckIsLite6);
                        Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                        Object objC3 = objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3);
                        objC3.getClass();
                        int i2 = ((aqms) objC3).b;
                        if ((i2 & 2) == 0 || (i2 & 4) == 0) {
                            d("Error: Missing timing data in scrubber time overlay.");
                            return;
                        }
                        this.b.add(new tpo(1));
                    }
                }
            }
        }
        aorh aorhVar = this.c;
        if (aorhVar != null) {
            for (apji apjiVar7 : aorhVar.b) {
                aihl aihlVar4 = akxw.a;
                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar4);
                apjiVar7.c(aihlVarCheckIsLite7);
                if (apjiVar7.j.n(aihlVarCheckIsLite7.d)) {
                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar4);
                    apjiVar7.c(aihlVarCheckIsLite8);
                    Object objK4 = apjiVar7.j.k(aihlVarCheckIsLite8.d);
                    Object objC4 = objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4);
                    objC4.getClass();
                    String str = ((akxv) objC4).b;
                    str.getClass();
                    if (str.length() <= 0) {
                        d("Error: Missing organic overlay identifier in FeaturePlayerOverlayRenderer.");
                        return;
                    }
                }
            }
        }
        this.f.b(this.d, this.e);
    }
}
