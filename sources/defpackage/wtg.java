package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wtg implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wtg(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [acjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, wxk] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, wxk] */
    /* JADX WARN: Type inference failed for: r8v32, types: [acjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [awmd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        amnd amndVar;
        int i = 4;
        switch (this.$cid) {
            case 0:
                this.a.a(this.b);
                break;
            case 1:
                ajth ajthVar = (ajth) this.b;
                if ((ajthVar.c & 1) != 0) {
                    vxe vxeVar = (vxe) ((vrf) this.a).a.io();
                    ajwo ajwoVar = ajthVar.f;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.a(ajwoVar);
                }
                break;
            case 2:
                wvv wvvVar = (wvv) this.a;
                wvvVar.b.k(Collections.singletonList(this.b), wvvVar.a, true);
                break;
            case 3:
                wvw wvwVar = (wvw) this.a;
                wvwVar.b.k(Collections.singletonList(this.b), wvwVar.a, true);
                break;
            case 4:
                ((wwb) this.a).c(((wwf) this.b).b);
                break;
            case 5:
                this.a.d((amno) this.b);
                break;
            case 6:
                this.a.g((ajwo) this.b);
                break;
            case 7:
                ((wwk) this.a).c(((amno) this.b).d);
                break;
            case 8:
                ((wwk) this.a).c(((amno) this.b).d);
                break;
            case 9:
                wwn wwnVar = (wwn) this.a;
                wvt wvtVar = wwnVar.c;
                amqm amqmVar = (amqm) this.b;
                wvtVar.a(amqmVar.g, wwnVar.a(amqmVar.d));
                break;
            case 10:
                apji apjiVar = ((ammv) this.b).d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(amne.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                amnd amndVar2 = (amnd) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                wxo wxoVar = ((wws) this.a).a;
                if (wxoVar != null) {
                    xbw xbwVar = (xbw) wxoVar;
                    if (xbwVar.u && (amndVar = xbwVar.q) != null && TextUtils.equals(amndVar2.c, amndVar.c) && (amndVar2.b & 4) != 0) {
                        apji apjiVar2 = amndVar2.d;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aowl.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        if (apjiVar2.j.n(aihlVarCheckIsLite2.d)) {
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aowl.a);
                            apjiVar2.c(aihlVarCheckIsLite3);
                            Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite3.d);
                            aowk aowkVar = (aowk) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                            if (xbwVar.u(aowkVar)) {
                                xbwVar.c(aowkVar);
                                xbwVar.q = amndVar2;
                            }
                        }
                        break;
                    }
                }
                break;
            case 11:
                apji apjiVar3 = ((amna) this.b).d;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aowl.a);
                apjiVar3.c(aihlVarCheckIsLite4);
                Object objK3 = apjiVar3.j.k(aihlVarCheckIsLite4.d);
                aowk aowkVar2 = (aowk) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
                wxo wxoVar2 = ((wws) this.a).a;
                if (wxoVar2 != null && ((xbw) wxoVar2).u) {
                    wxoVar2.c(aowkVar2);
                    break;
                }
                break;
            case 12:
                ((wws) this.a).b(((ammr) this.b).g, false);
                break;
            case 13:
                ((wxc) ((wxb) this.a).a).u(this.b);
                break;
            case 14:
                amqm amqmVarR = wxc.r(new wra((alsi) this.b, 0).a());
                wxc wxcVar = (wxc) ((wxb) this.a).a;
                wxcVar.e.m(amqmVarR);
                if (wxcVar.j.m(3, 45725416L) && amqmVarR != null && amqmVarR.d.isEmpty()) {
                    wxcVar.k();
                    break;
                }
                break;
            case 15:
                ((adtv) this.a).iM(this.b);
                break;
            case 16:
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akrs.a);
                aihi aihiVar = (aihi) this.b;
                aihiVar.c(aihlVarCheckIsLite5);
                Object objK4 = aihiVar.j.k(aihlVarCheckIsLite5.d);
                Object objC = objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4);
                wyq wyqVar = (wyq) this.a;
                wyqVar.r(wyp.b, wyqVar.d.c((akrn) objC));
                break;
            case 17:
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(akrs.a);
                aihi aihiVar2 = (aihi) this.b;
                aihiVar2.c(aihlVarCheckIsLite6);
                Object objK5 = aihiVar2.j.k(aihlVarCheckIsLite6.d);
                akrn akrnVar = (akrn) (objK5 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK5));
                akro akroVar = akrnVar.c;
                if (akroVar == null) {
                    akroVar = akro.a;
                }
                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aomj.b);
                akroVar.c(aihlVarCheckIsLite7);
                Object objK6 = akroVar.j.k(aihlVarCheckIsLite7.d);
                Object objC2 = objK6 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK6);
                wyq wyqVar2 = (wyq) this.a;
                wyqVar2.f = ((aomj) objC2).d;
                wyqVar2.r(wyp.a, wyqVar2.d.c(akrnVar));
                break;
            case 18:
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(ammr.b);
                Object obj = this.b;
                aihi aihiVar3 = (aihi) obj;
                aihiVar3.c(aihlVarCheckIsLite8);
                if (aihiVar3.j.n(aihlVarCheckIsLite8.d)) {
                    Object obj2 = this.a;
                    aihl aihlVarCheckIsLite9 = aihn.checkIsLite(ammr.b);
                    aihiVar3.c(aihlVarCheckIsLite9);
                    Object objK7 = aihiVar3.j.k(aihlVarCheckIsLite9.d);
                    wyq wyqVar3 = (wyq) obj2;
                    wyo wyoVar = (wyo) wyqVar3.c.get(((ammr) (objK7 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK7))).g);
                    if (wyoVar != null) {
                        Object obj3 = wyoVar.b;
                        if ((obj3 instanceof amrd) || (obj3 instanceof amra) || (wyqVar3.h.s() && (obj3 instanceof amrc))) {
                            wyqVar3.a.removeCallbacks(wyoVar);
                            wyoVar.run();
                        } else {
                            wyoVar.e = (ajwo) obj;
                            wyqVar3.b.k(obj3, obj3);
                        }
                    }
                } else {
                    aihl aihlVarCheckIsLite10 = aihn.checkIsLite(amms.b);
                    aihiVar3.c(aihlVarCheckIsLite10);
                    if (aihiVar3.j.n(aihlVarCheckIsLite10.d)) {
                        aihl aihlVarCheckIsLite11 = aihn.checkIsLite(amms.b);
                        aihiVar3.c(aihlVarCheckIsLite11);
                        Object objK8 = aihiVar3.j.k(aihlVarCheckIsLite11.d);
                        String str = ((amms) (objK8 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK8))).g;
                        ArrayList arrayList = new ArrayList();
                        wyq wyqVar4 = (wyq) this.a;
                        for (wyo wyoVar2 : wyqVar4.c.values()) {
                            Object obj4 = wyoVar2.b;
                            if (TextUtils.equals(str, yno.dN(obj4))) {
                                if ((obj4 instanceof amrd) || (obj4 instanceof amra) || (wyqVar4.h.s() && (obj4 instanceof amrc))) {
                                    arrayList.add(wyoVar2);
                                } else {
                                    wyoVar2.e = (ajwo) obj;
                                    wyqVar4.b.k(obj4, obj4);
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            wyo wyoVar3 = (wyo) arrayList.get(i2);
                            wyqVar4.a.removeCallbacks(wyoVar3);
                            wyoVar3.run();
                        }
                    }
                }
                break;
            case 19:
                xhw xhwVar = (xhw) this.a;
                xhwVar.a.l(xhwVar.b, (xie) this.b);
                break;
            default:
                agkh agkhVar = new agkh(4);
                Stream streamFilter = Collection.EL.stream(this.b).filter(new xdn(i));
                Object obj5 = this.a;
                streamFilter.forEach(new rew(obj5, agkhVar, 19, null));
                ((xic) obj5).g = agkhVar.d(false);
                break;
        }
    }

    public /* synthetic */ wtg(wwf wwfVar, wwb wwbVar, int i) {
        this.$cid = i;
        this.b = wwfVar;
        this.a = wwbVar;
    }

    public wtg(wyq wyqVar, ajwo ajwoVar, int i) {
        this.$cid = i;
        this.b = ajwoVar;
        this.a = wyqVar;
    }
}
