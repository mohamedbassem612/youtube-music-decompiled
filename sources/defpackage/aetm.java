package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aetm implements aeto {
    private final aetp a = new aetp();
    private final acwa b;

    public aetm(acwa acwaVar) {
        this.b = acwaVar;
    }

    @Override // defpackage.aeto
    public final avlh a() {
        return this.a.a();
    }

    @Override // defpackage.aeto
    public final void b() {
        this.a.b();
    }

    public final void c(aqpq aqpqVar) {
        Object aetlVar;
        aqpqVar.getClass();
        aiie aiieVar = aqpqVar.c;
        aiieVar.getClass();
        b();
        ArrayList arrayList = new ArrayList(atqq.N(aiieVar, 10));
        Iterator<E> it = aiieVar.iterator();
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                break;
            }
            aiie<aqpr> aiieVar2 = ((aqpp) it.next()).b;
            aiieVar2.getClass();
            acwa acwaVar = this.b;
            ArrayList arrayList2 = new ArrayList(atqq.N(aiieVar2, 10));
            for (aqpr aqprVar : aiieVar2) {
                aqprVar.getClass();
                aihl aihlVar = apdv.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                aqprVar.c(aihlVarCheckIsLite);
                if (aqprVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    aqprVar.c(aihlVarCheckIsLite2);
                    Object objK = aqprVar.j.k(aihlVarCheckIsLite2.d);
                    Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                    objC.getClass();
                    avlh avlhVarP = acwaVar.b.p();
                    apdu apduVarA = apdu.a(((apdv) objC).c);
                    if (apduVarA == null) {
                        apduVarA = apdu.REEL_CONTENT_CONTEXTUAL_STATE_UNKNOWN;
                    }
                    aetlVar = new aetl(avlhVarP, atqq.o(apduVarA));
                } else {
                    aihl aihlVar2 = apdt.b;
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                    aqprVar.c(aihlVarCheckIsLite3);
                    if (aqprVar.j.n(aihlVarCheckIsLite3.d)) {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                        aqprVar.c(aihlVarCheckIsLite4);
                        Object objK2 = aqprVar.j.k(aihlVarCheckIsLite4.d);
                        Object objC2 = objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2);
                        objC2.getClass();
                        avlh avlhVarP2 = acwaVar.c.p();
                        apds apdsVarA = apds.a(((apdt) objC2).c);
                        if (apdsVarA == null) {
                            apdsVarA = apds.REEL_CONTENT_CLEAR_MODE_STATE_UNKNOWN;
                        }
                        aetlVar = new aetl(avlhVarP2, atqq.o(apdsVarA));
                    } else {
                        aetlVar = acwa.a;
                    }
                }
                arrayList2.add(aetlVar);
            }
            aeto aeteVar = new aete(arrayList2);
            for (aqpr aqprVar2 : aiieVar2) {
                aihl aihlVar3 = aoqk.b;
                aihlVar3.getClass();
                Integer numValueOf = Integer.valueOf(((aoqk) aext.x(aqprVar2, aihlVar3)).c);
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    num = numValueOf;
                    break;
                }
            }
            if (num != null) {
                aeteVar = new aetj(aeteVar, num.intValue());
            }
            arrayList.add(aeteVar);
        }
        aetp aetpVar = this.a;
        aetf aetfVar = new aetf(arrayList);
        Object obj = aetpVar.c;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        aeto aetoVar = aetpVar.b;
        if (aetoVar != null) {
            aetoVar.b();
        }
        aetpVar.b = aetfVar;
        avlh avlhVar = aetfVar.b;
        awku awkuVar = aetpVar.a;
        aetpVar.c = avlhVar.al(new aeti(new acqe(awkuVar, 5, (boolean[]) null), 5), new aeti(new acqe(awkuVar, 6, (float[]) null), 6));
    }
}
