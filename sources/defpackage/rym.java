package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rym extends ryj {
    private final vyo a;
    private aorh b;

    public rym(smr smrVar, sko skoVar, rsk rskVar, rmp rmpVar, vyo vyoVar) {
        super(smrVar, skoVar, rskVar);
        rmpVar.getClass();
        vyoVar.getClass();
        this.a = vyoVar;
    }

    private static akxv d(apji apjiVar) {
        aihl aihlVar = akxw.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite2);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
        return (akxv) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
    }

    private final void e(String str) {
        smr smrVar = this.d;
        sko skoVar = this.e;
        rmp.m(smrVar, skoVar, str);
        this.f.u(smrVar, skoVar, new sas(str, 3), 10);
    }

    @Override // defpackage.ryj
    public final void V(int i) {
        aorh aorhVar = this.b;
        if (aorhVar != null) {
            Iterator it = aorhVar.b.iterator();
            while (it.hasNext()) {
                akxv akxvVarD = d((apji) it.next());
                if (akxvVarD != null) {
                    akxvVarD.b.isEmpty();
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
        aljy aljyVar = (aljy) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        apji apjiVar = aljyVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVar = aori.a;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite3);
        if (!apjiVar.j.n(aihlVarCheckIsLite3.d)) {
            e("Error: Missing PlayerOverlayLayerRenderer extension in payload.");
            return;
        }
        apji apjiVar2 = aljyVar.c;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
        apjiVar2.c(aihlVarCheckIsLite4);
        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
        this.b = (aorh) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
    }

    @Override // defpackage.ryj
    public final void b() {
        aorh aorhVar = this.b;
        if (aorhVar != null) {
            boolean z = afxw.e(this.a).cz;
            ArrayList<String> arrayList = z ? new ArrayList() : null;
            Iterator it = aorhVar.b.iterator();
            while (it.hasNext()) {
                akxv akxvVarD = d((apji) it.next());
                if (akxvVarD != null) {
                    String str = akxvVarD.b;
                    if (str.isEmpty()) {
                        if (z) {
                            if (arrayList != null) {
                                for (String str2 : arrayList) {
                                }
                            }
                            smr smrVar = this.d;
                            sko skoVar = this.e;
                            rmp.m(smrVar, skoVar, "Error: Missing overlay identifier in FeaturePlayerOverlayRenderer.");
                            this.f.u(smrVar, skoVar, new sas("Error: Missing overlay identifier in FeaturePlayerOverlayRenderer.", 23), 10);
                            return;
                        }
                        rmp.m(this.d, this.e, "Error: Missing overlay identifier in FeaturePlayerOverlayRenderer.");
                    } else if (arrayList != null) {
                        arrayList.add(str);
                    }
                }
            }
            this.f.b(this.d, this.e);
        }
    }
}
