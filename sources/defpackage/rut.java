package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rut implements wjw {
    public final Set a = new HashSet();

    /* JADX WARN: Code duplicated, block: B:129:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x000c A[SYNTHETIC] */
    @Override // defpackage.wjw
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        sko skoVarH;
        sko skoVar;
        aixg aixgVar;
        wjf wjfVar = (wjf) obj;
        for (rzz rzzVar : this.a) {
            vyo vyoVar = rzzVar.e;
            if (afxw.e(vyoVar).bU && wjfVar != null && !wjfVar.u().n.isEmpty()) {
                Iterator it = wjfVar.u().n.iterator();
                while (it.hasNext()) {
                    aivt aivtVar = (aivt) aavv.s((apji) it.next(), aivv.a);
                    if (aivtVar != null) {
                        aihf aihfVarCreateBuilder = aiyn.a.createBuilder();
                        if ((aivtVar.b & 1) != 0) {
                            aivs aivsVar = aivtVar.c;
                            if (aivsVar == null) {
                                aivsVar = aivs.a;
                            }
                            if ((aivsVar.b & 2) != 0) {
                                aivs aivsVar2 = aivtVar.c;
                                if (aivsVar2 == null) {
                                    aivsVar2 = aivs.a;
                                }
                                aixo aixoVarA = aixo.a(aivsVar2.d);
                                if (aixoVarA == null) {
                                    aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                                }
                                aihfVarCreateBuilder.copyOnWrite();
                                aiyn aiynVar = (aiyn) aihfVarCreateBuilder.instance;
                                aiynVar.c = aixoVarA.G;
                                aiynVar.b |= 4;
                            }
                            aivs aivsVar3 = aivtVar.c;
                            if (((aivsVar3 == null ? aivs.a : aivsVar3).b & 8) != 0) {
                                if (aivsVar3 == null) {
                                    aivsVar3 = aivs.a;
                                }
                                aivr aivrVar = aivsVar3.f;
                                if (aivrVar == null) {
                                    aivrVar = aivr.a;
                                }
                                aigj aigjVar = aivrVar.b;
                                if (!aigjVar.E()) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aiyn aiynVar2 = (aiyn) aihfVarCreateBuilder.instance;
                                    aigjVar.getClass();
                                    aiynVar2.b |= 8;
                                    aiynVar2.d = aigjVar;
                                }
                            }
                        }
                        aihf aihfVarCreateBuilder2 = aiyb.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aiyb aiybVar = (aiyb) aihfVarCreateBuilder2.instance;
                        aiyn aiynVar3 = (aiyn) aihfVarCreateBuilder.build();
                        aiynVar3.getClass();
                        aiybVar.c = aiynVar3;
                        aiybVar.b = 19;
                        xeu xeuVar = (xeu) rzzVar.f.io();
                        if (xeuVar.b) {
                            xff xffVarA = xeuVar.a(aihfVarCreateBuilder2, alot.ADS_CLIENT_STATE_CHANGE);
                            ztf ztfVar = xffVarA.k.e;
                            xffVarA.l = ztfVar.a();
                            ztfVar.k(xffVarA);
                        } else {
                            alos alosVar = (alos) alou.a.createBuilder();
                            alosVar.copyOnWrite();
                            alou alouVar = (alou) alosVar.instance;
                            aiyb aiybVar2 = (aiyb) aihfVarCreateBuilder2.build();
                            aiybVar2.getClass();
                            alouVar.d = aiybVar2;
                            alouVar.c = 197;
                            xeuVar.b((alou) alosVar.build());
                        }
                    }
                }
            }
            if (afxw.e(vyoVar).ab) {
                rzzVar.g = null;
            } else {
                rzy rzyVar = rzzVar.g;
                if (rzyVar == null || !TextUtils.equals(wjfVar.G(), rzyVar.a) || !rzyVar.b) {
                    rzzVar.g = null;
                    if (sdi.a(wjfVar)) {
                        alvt alvtVarU = wjfVar.u();
                        aixo aixoVar = aixo.SLOT_TYPE_PLAYER_BYTES;
                        Optional optionalG = nre.g(alvtVarU, agke.q(aixoVar));
                        if (optionalG.isPresent()) {
                            aivt aivtVar2 = (aivt) optionalG.get();
                            aivu aivuVar = aivtVar2.e;
                            if (aivuVar == null) {
                                aivuVar = aivu.a;
                            }
                            apji apjiVar = aivuVar.b;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(aopo.a);
                            apjiVar.c(aihlVarCheckIsLite);
                            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                                aivu aivuVar2 = aivtVar2.e;
                                if (aivuVar2 == null) {
                                    aivuVar2 = aivu.a;
                                }
                                apji apjiVar2 = aivuVar2.b;
                                if (apjiVar2 == null) {
                                    apjiVar2 = apji.a;
                                }
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aopo.a);
                                apjiVar2.c(aihlVarCheckIsLite2);
                                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                                aopn aopnVar = (aopn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                                aivs aivsVar4 = aivtVar2.c;
                                if (aivsVar4 == null) {
                                    aivsVar4 = aivs.a;
                                }
                                String str = aivsVar4.c;
                                try {
                                    aiuc aiucVar = aopnVar.c;
                                    if (aiucVar == null) {
                                        aiucVar = aiuc.a;
                                    }
                                    aixg aixgVarA = aixg.a(aiucVar.d);
                                    if (aixgVarA == null) {
                                        aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                                    }
                                    int iOrdinal = aixgVarA.ordinal();
                                    if (iOrdinal == 1) {
                                        skoVarH = ((aehs) rzzVar.d.io()).h(aopnVar, wjfVar, Optional.empty());
                                    } else if (iOrdinal != 2) {
                                        if (iOrdinal != 15) {
                                            rmp rmpVar = rzzVar.k;
                                            rmp.n(null, "Unable to create a layout due to the unsupported layout type.");
                                            skoVar = null;
                                        } else {
                                            skoVarH = ((aehs) rzzVar.d.io()).f(aopnVar, wjfVar, str, Optional.empty(), false);
                                        }
                                        if (skoVar != null) {
                                            rzzVar.g = new rzy(wjfVar.G(), rzzVar.i, ((sdm) rzzVar.a.io()).a(wjfVar), nre.d(wjfVar.u(), agke.q(aixoVar)), str, skoVar);
                                        }
                                    } else {
                                        skoVarH = ((aehs) rzzVar.d.io()).g(aopnVar, wjfVar, Optional.empty());
                                    }
                                    skoVar = skoVarH;
                                    if (skoVar != null) {
                                        rzzVar.g = new rzy(wjfVar.G(), rzzVar.i, ((sdm) rzzVar.a.io()).a(wjfVar), nre.d(wjfVar.u(), agke.q(aixoVar)), str, skoVar);
                                    }
                                } catch (sas unused) {
                                    rmp rmpVar2 = rzzVar.k;
                                    rmp.n(null, "Bootstrapped layout construction resulted in non PlayerBytesLayout.");
                                }
                            }
                        } else {
                            awmd awmdVar = rzzVar.a;
                            List listA = ((sdm) awmdVar.io()).a(wjfVar);
                            if (listA.isEmpty() || ((skl) listA.get(0)).b() != slm.PRE_ROLL) {
                                rzzVar.g = new rzy(wjfVar.G(), rzzVar.i, listA, nre.d(wjfVar.u(), agke.q(aixoVar)), null, null);
                            } else {
                                skl sklVar = (skl) listA.get(0);
                                List listB = ((sdm) awmdVar.io()).b(sklVar, sklVar.f(), wjfVar);
                                String strAa = ((xsc) rzzVar.b.io()).aa();
                                sko skoVarC = ((aehs) rzzVar.d.io()).c(strAa, (skl) listA.get(0), Optional.empty(), listB);
                                if (skoVarC == null || !((aixgVar = skoVarC.b) == aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES || aixgVar == aixg.LAYOUT_TYPE_MEDIA || aixgVar == aixg.LAYOUT_TYPE_MEDIA_BREAK)) {
                                    rmp rmpVar3 = rzzVar.k;
                                    rmp.n(null, "Bootstrapped layout construction resulted in non PlayerBytesLayout. PlayerAds count: " + listB.size() + ", layout: " + String.valueOf(skoVarC));
                                } else {
                                    rzzVar.g = new rzy(wjfVar.G(), rzzVar.i, listA, nre.d(wjfVar.u(), agke.q(aixoVar)), strAa, skoVarC);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
