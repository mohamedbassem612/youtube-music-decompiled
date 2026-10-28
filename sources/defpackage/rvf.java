package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, d = {shw.class, shl.class, sic.class})
public final class rvf extends rvo {
    public final aehs a;

    public rvf(rvr rvrVar, aehs aehsVar) {
        super(rvrVar);
        this.a = aehsVar;
    }

    @Override // defpackage.rvo
    public final void b() {
        this.i.b(new agek() { // from class: rve
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                aehs aehsVar;
                agke agkeVarC;
                agke agkeVarC2;
                smr smrVar = (smr) obj;
                ajlj ajljVar = (ajlj) smrVar.d(shw.class);
                String str = (String) smrVar.d(sic.class);
                aiuc aiucVar = ajljVar.c;
                if (aiucVar == null) {
                    aiucVar = aiuc.a;
                }
                apji apjiVar = ajljVar.d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aitn.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                aiie aiieVar = ((aitm) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
                ArrayList arrayList = new ArrayList();
                if (aiieVar.size() == 0) {
                    return null;
                }
                ajwo ajwoVar = ajljVar.h;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                Iterator it = aiieVar.iterator();
                while (true) {
                    rvf rvfVar = this.a;
                    boolean zHasNext = it.hasNext();
                    aehsVar = rvfVar.a;
                    if (!zHasNext) {
                        break;
                    }
                    String strT = aehs.t((akuf) it.next());
                    if (TextUtils.isEmpty(strT)) {
                        Object obj2 = aehsVar.e;
                        rmp.n(smrVar, "Missing panel ID for ads engagement panel.");
                    } else {
                        arrayList.add(strT);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new shr(aiieVar));
                arrayList2.add(new sin(arrayList));
                if ((ajljVar.b & 4) != 0) {
                    arrayList2.add(new sjv(ajwoVar));
                    arrayList2.add(new sjt(agpn.b));
                }
                agke agkeVarC3 = agpi.a;
                try {
                    Object obj3 = aehsVar.i;
                    agkeVarC = nrj.c(ajljVar.e, Optional.of(str));
                    try {
                        agkeVarC2 = nrj.c(ajljVar.f, Optional.of(str));
                        try {
                            agkeVarC3 = nrj.c(ajljVar.g, Optional.of(str));
                        } catch (sav e) {
                            e = e;
                            Object obj4 = aehsVar.e;
                            rmp.n(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                        }
                    } catch (sav e2) {
                        e = e2;
                        agkeVarC2 = agkeVarC3;
                    }
                } catch (sav e3) {
                    e = e3;
                    agkeVarC = agkeVarC3;
                    agkeVarC2 = agkeVarC;
                }
                Object obj5 = aehsVar.a;
                String str2 = aiucVar.c;
                aixg aixgVarA = aixg.a(aiucVar.d);
                if (aixgVarA == null) {
                    aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                }
                aiua aiuaVar = aiucVar.e;
                if (aiuaVar == null) {
                    aiuaVar = aiua.a;
                }
                amco amcoVarAi = ((vwt) obj5).ai(smrVar, str2, aixgVarA, aiuaVar);
                skn sknVarA = sko.a();
                sknVarA.l(aiucVar.c);
                aixg aixgVarA2 = aixg.a(aiucVar.d);
                if (aixgVarA2 == null) {
                    aixgVarA2 = aixg.LAYOUT_TYPE_UNSPECIFIED;
                }
                sknVarA.a = aixgVarA2;
                sknVarA.m(1);
                sknVarA.g(agkeVarC);
                sknVarA.i(agkeVarC2);
                sknVarA.k(agkeVarC3);
                aiua aiuaVar2 = aiucVar.e;
                if (aiuaVar2 == null) {
                    aiuaVar2 = aiua.a;
                }
                sknVarA.b(aiuaVar2);
                sknVarA.c(amcoVarAi);
                sknVarA.c = shh.a(arrayList2);
                return sknVarA.a();
            }
        });
    }
}
