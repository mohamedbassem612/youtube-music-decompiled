package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aclz implements actu, aclm {
    public abnc e;
    public final hno f;
    private final vyo m;
    private final spv n;
    private final vxz o;
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final Set g = new HashSet();
    private final Set j = new HashSet();
    private final Set k = new HashSet();
    private final Set i = new HashSet();
    public final Map a = new HashMap();
    final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    private final Map h = new HashMap();

    public aclz(actv actvVar, hno hnoVar, vyo vyoVar, spv spvVar, vxz vxzVar) {
        this.m = vyoVar;
        this.o = vxzVar;
        actvVar.z(this);
        this.f = hnoVar;
        this.n = spvVar;
        actvVar.a.ag(new acjp(this, 6), new abxq(7));
    }

    private static final void m(Map map, Set set) {
        Collection.EL.removeIf(map.keySet(), new aciy(set, 4));
    }

    private static final void n(Map map, Set set) {
        map.keySet().removeAll(set);
    }

    @Override // defpackage.aclm
    public final void a(agkz agkzVar) {
        if (!this.f.af() || agkzVar.isEmpty()) {
            return;
        }
        synchronized (this) {
            m(this.a, agkzVar);
            m(this.c, agkzVar);
            m(this.d, agkzVar);
            n(this.b, agkzVar);
            n(this.h, agkzVar);
            this.i.removeAll(agkzVar);
        }
        j(new aasz(agkzVar, 11));
    }

    @Override // defpackage.aclm
    public final void b(ajwo ajwoVar, String str) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apfp apfpVarY = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if (this.f.ai()) {
                apfpVarY = aecm.Y(apfpVarY);
            }
            if (!aecm.ag(apfpVarY) && (taq.aB(this.m) || this.o.m(1, 45842958L))) {
                this.d.put(apfpVarY, str);
                j(new aata(6));
            }
            Map map = this.a;
            if (map.containsKey(apfpVarY)) {
                j(new aata(7));
            }
        }
    }

    @Override // defpackage.aclm
    public final void c(ajwo ajwoVar, alvt alvtVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apfp apfpVarY = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if (this.f.ai()) {
                apfpVarY = aecm.Y(apfpVarY);
            }
            int i = 1;
            if (taq.aB(this.m) || this.o.m(1, 45842958L)) {
                j(new aata(17));
            }
            Map map = this.d;
            if (map.containsKey(apfpVarY)) {
                ((String) map.get(apfpVarY)).getClass();
                j(new acnq(this, apfpVarY, i));
            }
            Map map2 = this.a;
            if (map2.containsKey(apfpVarY)) {
                ((smf) map2.get(apfpVarY)).b.b(alvtVar);
            }
        }
    }

    @Override // defpackage.aclm
    public final void d(List list, alqi alqiVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        aihf aihfVarCreateBuilder = aizc.a.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar = (ajwo) it.next();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apfp apfpVarY = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                if (aecm.ag(apfpVarY)) {
                    Map map = this.a;
                    if (!map.containsKey(apfpVarY)) {
                        if (this.f.ai()) {
                            apfpVarY = aecm.Y(apfpVarY);
                        }
                        smf smfVar = new smf(apfpVarY);
                        smfVar.a = this.e;
                        arrayList.add(smfVar);
                        map.put(apfpVarY, smfVar);
                    }
                }
            } else {
                aihl aihlVar = apef.b;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    apef apefVar = (apef) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    apji apjiVar = apefVar.d;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVar2 = apei.a;
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar2);
                    apjiVar.c(aihlVarCheckIsLite5);
                    if (apjiVar.j.n(aihlVarCheckIsLite5.d)) {
                        apji apjiVar2 = apefVar.d;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar2);
                        apjiVar2.c(aihlVarCheckIsLite6);
                        Object objK3 = apjiVar2.j.k(aihlVarCheckIsLite6.d);
                        apeh apehVar = (apeh) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                        if (!apehVar.e.isEmpty()) {
                            apeg apegVar = apehVar.d;
                            if (apegVar == null) {
                                apegVar = apeg.a;
                            }
                            aihl aihlVar3 = apee.b;
                            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar3);
                            apegVar.c(aihlVarCheckIsLite7);
                            if (apegVar.j.n(aihlVarCheckIsLite7.d)) {
                                apeg apegVar2 = apehVar.d;
                                if (apegVar2 == null) {
                                    apegVar2 = apeg.a;
                                }
                                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar3);
                                apegVar2.c(aihlVarCheckIsLite8);
                                Object objK4 = apegVar2.j.k(aihlVarCheckIsLite8.d);
                                smg smgVar = new smg(apehVar, apefVar.e);
                                String str = apehVar.e;
                                if (this.f.af()) {
                                    str = apefVar.e;
                                }
                                this.b.put(str, smgVar);
                                arrayList2.add(smgVar);
                            }
                        }
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            aihfVarCreateBuilder.copyOnWrite();
            aizc aizcVar = (aizc) aihfVarCreateBuilder.instance;
            aizcVar.b |= 2;
            aizcVar.d = size;
            j(new aata(10));
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            aihfVarCreateBuilder.copyOnWrite();
            aizc aizcVar2 = (aizc) aihfVarCreateBuilder.instance;
            aizcVar2.b |= 1;
            aizcVar2.c = size2;
            j(new aata(11));
        }
        if (alqiVar != null) {
            int size3 = alqiVar.b.size();
            aihfVarCreateBuilder.copyOnWrite();
            aizc aizcVar3 = (aizc) aihfVarCreateBuilder.instance;
            aizcVar3.b |= 4;
            aizcVar3.e = size3;
            j(new aata(12));
        }
        if (afxw.e(this.m).bI) {
            aihf aihfVarCreateBuilder2 = aizg.a.createBuilder();
            aixn aixnVar = aixn.RENDERING_EVENT_TYPE_REEL_OPPORTUNITY_ADS_RECEIVED;
            aihfVarCreateBuilder2.copyOnWrite();
            aizg aizgVar = (aizg) aihfVarCreateBuilder2.instance;
            aizgVar.e = aixnVar.C;
            aizgVar.b |= 1;
            aizc aizcVar4 = (aizc) aihfVarCreateBuilder.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aizg aizgVar2 = (aizg) aihfVarCreateBuilder2.instance;
            aizcVar4.getClass();
            aizgVar2.d = aizcVar4;
            aizgVar2.c = 8;
            this.n.a((aizg) aihfVarCreateBuilder2.build(), null, null, null);
        }
    }

    @Override // defpackage.aclm
    public final void e(aclq aclqVar) {
        final boolean zN;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwo ajwoVar = ((acqk) aclqVar).a;
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apfp apfpVarY = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if (this.f.ai()) {
                apfpVarY = aecm.Y(apfpVarY);
            }
            Map map = this.a;
            if (map.containsKey(apfpVarY)) {
                rmp.j(null, "Reel page was entered with no attached view");
                j(new aata(18));
            } else {
                Map map2 = this.c;
                if (map2.containsKey(apfpVarY)) {
                    rmp.j(null, "Reel organic page was entered with no attached view");
                    j(new aata(19));
                }
            }
        } else {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                agev agevVarI = i(ajwoVar);
                if (agevVarI.g()) {
                    agevVarI.c();
                    rmp.j(null, "No view attached for reels NVC when page entered");
                    j(new aata(20));
                }
            }
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite4);
        if (!ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite5);
            if (!ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                return;
            }
        }
        j(new aata(4));
        final String strAd = aecm.ad(ajwoVar);
        if (strAd != null && !strAd.isEmpty()) {
            this.h.put(strAd, aclqVar);
        }
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite6);
        final boolean zN2 = ajwoVar.j.n(aihlVarCheckIsLite6.d);
        if (zN2) {
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite7);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite7.d);
            zN = aecm.ag((apfp) (objK2 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK2)));
        } else {
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite8);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
            apji apjiVar = ((apef) (objK3 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK3))).d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = apei.a;
            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite9);
            if (apjiVar.j.n(aihlVarCheckIsLite9.d)) {
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar);
                apjiVar.c(aihlVarCheckIsLite10);
                Object objK4 = apjiVar.j.k(aihlVarCheckIsLite10.d);
                apeg apegVar = ((apeh) (objK4 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK4))).d;
                if (apegVar == null) {
                    apegVar = apeg.a;
                }
                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(apee.b);
                apegVar.c(aihlVarCheckIsLite11);
                zN = apegVar.j.n(aihlVarCheckIsLite11.d);
            } else {
                zN = false;
            }
        }
        j(new twi() { // from class: aclw
            @Override // defpackage.twi
            public final void a(Object obj) {
                ((acln) obj).b(strAd, zN, zN2);
            }
        });
    }

    @Override // defpackage.aclm
    public final void f(aclq aclqVar, int i) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwo ajwoVar = ((acqk) aclqVar).a;
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apfp apfpVarY = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if (this.f.ai()) {
                apfpVarY = aecm.Y(apfpVarY);
            }
            Map map = this.a;
            if (map.containsKey(apfpVarY)) {
                j(new aata(3));
            } else {
                Map map2 = this.c;
                if (map2.containsKey(apfpVarY)) {
                    j(new aata(5));
                }
            }
        } else {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                agev agevVarI = i(ajwoVar);
                if (agevVarI.g()) {
                    agevVarI.c();
                    j(new aata(13));
                }
            }
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite4);
        if (!ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite5);
            if (!ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                return;
            }
        }
        String strAd = aecm.ad(ajwoVar);
        if (strAd != null && !strAd.isEmpty()) {
            this.h.remove(strAd);
            if (i == 0) {
                this.i.add(strAd);
            }
        }
        j(new acly(i, strAd, 0));
    }

    @Override // defpackage.aclm
    public final boolean h(aclq aclqVar, final int i) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwo ajwoVar = ((acqk) aclqVar).a;
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        final boolean zAg = aecm.ag((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
        j(new twi() { // from class: aclx
            @Override // defpackage.twi
            public final void a(Object obj) {
                ((acln) obj).ah(i, zAg);
            }
        });
        return true;
    }

    public final agev i(ajwo ajwoVar) {
        aihl aihlVar = apef.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apef apefVar = (apef) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            apji apjiVar = apefVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar2 = apei.a;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
            apjiVar.c(aihlVarCheckIsLite3);
            if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                apji apjiVar2 = apefVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                apjiVar2.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
                apeh apehVar = (apeh) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                if (!apehVar.e.isEmpty()) {
                    String strAd = apehVar.e;
                    if (this.f.af()) {
                        strAd = aecm.ad(ajwoVar);
                    }
                    Map map = this.b;
                    if (map.containsKey(strAd)) {
                        return agev.i((smg) map.get(strAd));
                    }
                }
            }
        }
        return agdf.a;
    }

    public final synchronized void j(twi twiVar) {
        AtomicBoolean atomicBoolean = this.l;
        atomicBoolean.set(true);
        Set<acln> set = this.g;
        for (acln aclnVar : set) {
            if (aclnVar != null) {
                twiVar.a(aclnVar);
            }
        }
        atomicBoolean.set(false);
        Set set2 = this.j;
        set.addAll(set2);
        Set set3 = this.k;
        set.removeAll(set3);
        set2.clear();
        set3.clear();
    }

    public final void k(ajwo ajwoVar, alqc alqcVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (alqcVar != null && (alqcVar.b & 2) != 0) {
            apez apezVar = alqcVar.d;
            if (apezVar == null) {
                apezVar = apez.a;
            }
            if (apezVar.b == 1001) {
                Map map = this.a;
                if (map.containsKey(apfpVar)) {
                    ((smf) map.get(apfpVar)).c.b(alqcVar);
                    j(new aata(8));
                }
            }
        }
        apez apezVar2 = alqcVar.d;
        if (apezVar2 == null) {
            apezVar2 = apez.a;
        }
        apey apeyVar = apezVar2.b == 139970731 ? (apey) apezVar2.c : apey.a;
        agke agkeVar = apeyVar != null ? (agke) Collection.EL.stream(apeyVar.o).filter(new acwb(0)).map(new accu(5)).collect(aghu.a) : agpi.a;
        ArrayList arrayList = new ArrayList();
        if (!agkeVar.isEmpty()) {
            if (alqcVar.e == null) {
                alvt alvtVar = alvt.a;
            }
            Map map2 = this.c;
            if (!map2.containsKey(apfpVar)) {
                smi smiVar = new smi(apfpVar, alqcVar);
                arrayList.add(smiVar);
                map2.put(apfpVar, smiVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        j(new aata(9));
    }

    @Override // defpackage.actu
    public final void l(acsu acsuVar) {
        acsuVar.getClass();
        Objects.checkIndex(0, 3);
        if (acsuVar instanceof acso) {
            acso acsoVar = (acso) acsuVar;
            k(acsoVar.a, acsoVar.b);
        } else if (acsuVar instanceof acsp) {
            acsp acspVar = (acsp) acsuVar;
            k(acspVar.a, acspVar.b);
        }
    }

    @Override // defpackage.aclm
    public final /* synthetic */ void g() {
    }
}
