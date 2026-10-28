package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class phl implements phc {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final pls c;
    private final pcn d;
    private final pav e;
    private final awmd f;

    public phl(Context context, pls plsVar, pcn pcnVar, pav pavVar, awmd awmdVar) {
        context.getClass();
        plsVar.getClass();
        pcnVar.getClass();
        pavVar.getClass();
        awmdVar.getClass();
        this.b = context;
        this.c = plsVar;
        this.d = pcnVar;
        this.e = pavVar;
        this.f = awmdVar;
    }

    private final void b(pqf pqfVar) {
        ((pwf) this.f.io()).m(this.b.getPackageName(), this.c.a, Build.VERSION.SDK_INT, pqfVar.name());
    }

    private final void c(String str) {
        if (str.length() != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri uri = Uri.parse(str);
            uri.getClass();
            intent.setData(uri);
            intent.addFlags(268435456);
            try {
                this.b.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                ((agsj) ((agsj) a.b()).j(e)).w("Failed to start activity for destination URL: %s", str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0322  */
    /* JADX WARN: Code duplicated, block: B:140:0x0337  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:143:0x033f  */
    /* JADX WARN: Code duplicated, block: B:145:0x034d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0365  */
    /* JADX WARN: Code duplicated, block: B:149:0x036a  */
    /* JADX WARN: Code duplicated, block: B:152:0x038c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0390  */
    /* JADX WARN: Code duplicated, block: B:156:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:163:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:166:0x0402  */
    /* JADX WARN: Code duplicated, block: B:168:0x042b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0439  */
    /* JADX WARN: Code duplicated, block: B:181:0x0485  */
    /* JADX WARN: Code duplicated, block: B:184:0x049c  */
    /* JADX WARN: Code duplicated, block: B:186:0x049f  */
    /* JADX WARN: Code duplicated, block: B:187:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:191:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:204:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, vxe] */
    @Override // defpackage.phc
    public final Object a(pbf pbfVar, awoq awoqVar) throws Throwable {
        Iterator it;
        Object next;
        pos posVar;
        aicf aicfVarB;
        String str;
        agev agevVarA;
        Object obj;
        int i;
        abqq abqqVar;
        Optional optional;
        Object objAd;
        awox awoxVar;
        int iAS;
        abqq abqqVar2;
        Optional optional2;
        Object objAd2;
        awox awoxVar2;
        int iAS2;
        Object obj2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        agom agomVar;
        Object qaaVar;
        Object obj4;
        if (pbfVar.d != pbd.a) {
            ((agsj) a.b()).t("NotificationEvent threads are not system tray threads");
            return awmy.a;
        }
        agke<pot> agkeVarB = pbfVar.b();
        boolean z = pbfVar.j;
        pbfVar.getClass();
        Intent intent = pbfVar.g;
        Bundle bundleA = intent != null ? pho.a(intent) : null;
        plx plxVar = pbfVar.c;
        String str2 = pbfVar.b;
        int i2 = 3;
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -522037453) {
                if (iHashCode != 742466871) {
                    if (iHashCode == 1647722549 && str2.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED")) {
                        agkeVarB.getClass();
                        nwb.a(plxVar);
                        nwb.b(agkeVarB);
                        paw pawVarB = this.e.b(ahzv.CLICKED);
                        pbc pbcVar = (pbc) pawVarB;
                        pbcVar.r = 2;
                        pawVarB.f(plxVar);
                        for (pot potVar : agkeVarB) {
                            List list = pbcVar.j;
                            aihf builder = pbc.m(potVar, true).toBuilder();
                            builder.getClass();
                            aewo.aa(potVar.q, builder);
                            aidc aidcVar = potVar.o.o;
                            if (aidcVar == null) {
                                aidcVar = aidc.a;
                            }
                            String str3 = aidcVar.b;
                            str3.getClass();
                            aewo.Y(str3, builder);
                            list.add(aewo.X(builder));
                            pbcVar.p.addAll(potVar.k);
                        }
                        pawVarB.a();
                        b(pqf.y);
                        nvj.c(agkeVarB);
                        agev agevVarB = this.d.b();
                        if (!agevVarB.g()) {
                            if (agkeVarB.size() == 1) {
                                String str4 = ((pot) atqq.X(agkeVarB)).o.i;
                                str4.getClass();
                                c(str4);
                            }
                            obj4 = awmy.a;
                        } else if (z) {
                            ((elr) ((abqq) agevVarB.c()).e).p(aaao.CLICKED, false);
                            obj4 = awmy.a;
                            Object objAd3 = awrc.ad(ahng.n(obj4), awoqVar);
                            awox awoxVar3 = awox.a;
                            if (objAd3 == awoxVar3) {
                                obj4 = objAd3;
                            }
                            if (obj4 != awoxVar3) {
                                obj4 = awmy.a;
                            }
                        } else {
                            obj4 = awmy.a;
                            Object objAd4 = awrc.ad(ahng.n(obj4), awoqVar);
                            awox awoxVar4 = awox.a;
                            if (objAd4 == awoxVar4) {
                                obj4 = objAd4;
                            }
                            if (obj4 != awoxVar4) {
                                obj4 = awmy.a;
                            }
                        }
                        if (obj4 == awox.a) {
                            return obj4;
                        }
                    } else if (str2 != null) {
                        if (agkeVarB.size() == 1) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        agkeVarB.getClass();
                        Object objX = atqq.X(agkeVarB);
                        objX.getClass();
                        it = ((pot) objX).u.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!awrc.c(((pos) next).a, str2));
                        posVar = (pos) next;
                        if (posVar != null) {
                            aicfVarB = posVar.b();
                        } else {
                            aicfVarB = null;
                        }
                        if (aicfVarB != null) {
                            Object objX2 = atqq.X(agkeVarB);
                            objX2.getClass();
                            pot potVar2 = (pot) objX2;
                            if (aicfVarB.c == 4) {
                            }
                            nwb.a(plxVar);
                            paw pawVarB2 = this.e.b(ahzv.ACTION_CLICK);
                            pbc pbcVar2 = (pbc) pawVarB2;
                            pbcVar2.r = 2;
                            if (aicfVarB.c == 4) {
                                str = (String) aicfVarB.d;
                            } else {
                                str = "";
                            }
                            pbcVar2.d = str;
                            pawVarB2.f(plxVar);
                            pawVarB2.b(potVar2);
                            pawVarB2.a();
                            b(pqf.z);
                            ozj ozjVarB = nvj.b(potVar2);
                            agevVarA = this.d.a(ozjVarB);
                            if (agevVarA.g()) {
                                i = 13;
                                if (z) {
                                    abqqVar2 = (abqq) agevVarA.c();
                                    abqqVar2.q(aicfVarB);
                                    agev agevVarA2 = ozi.a(aicfVarB);
                                    Object obj5 = abqqVar2.j;
                                    optional2 = (Optional) agevVarA2.a(new xwd(obj5, i)).d(new ytj(i));
                                    if (!optional2.isEmpty()) {
                                        iAS2 = a.aS(((ajcp) optional2.get()).e);
                                        if (iAS2 == 0) {
                                            ((aaap) abqqVar2.f).a("Not an app Activity behavior.");
                                        } else {
                                            ((aaap) abqqVar2.f).a("Not an app Activity behavior.");
                                        }
                                    }
                                    obj = awmy.a;
                                    objAd2 = awrc.ad(ahng.n(obj), awoqVar);
                                    awoxVar2 = awox.a;
                                    if (objAd2 == awoxVar2) {
                                        obj = objAd2;
                                    }
                                    if (obj != awoxVar2) {
                                        obj = awmy.a;
                                    }
                                } else {
                                    abqqVar = (abqq) agevVarA.c();
                                    abqqVar.q(aicfVarB);
                                    agev agevVarA3 = ozi.a(aicfVarB);
                                    Object obj6 = abqqVar.j;
                                    optional = (Optional) agevVarA3.a(new xwd(obj6, i)).d(new ytj(i));
                                    if (!optional.isEmpty()) {
                                        iAS = a.aS(((ajcp) optional.get()).e);
                                        if (iAS == 0) {
                                            ((aaap) abqqVar.f).a("Not a background behavior.");
                                        } else {
                                            ((aaap) abqqVar.f).a("Not a background behavior.");
                                        }
                                    }
                                    obj = awmy.a;
                                    objAd = awrc.ad(ahng.n(obj), awoqVar);
                                    awoxVar = awox.a;
                                    if (objAd == awoxVar) {
                                        obj = objAd;
                                    }
                                    if (obj != awoxVar) {
                                        obj = awmy.a;
                                    }
                                }
                            } else {
                                String str5 = aicfVarB.h;
                                str5.getClass();
                                c(str5);
                                obj = awmy.a;
                            }
                            if (obj == awox.a) {
                                return obj;
                            }
                        }
                    }
                } else if (str2.equals("com.google.android.libraries.notifications.NOTIFICATION_DISMISSED")) {
                    agkeVarB.getClass();
                    pbh pbhVar = pbfVar.k;
                    agom agomVar2 = pbhVar != null ? pbhVar.c : null;
                    if (agomVar2 != null) {
                        Collection<Map.Entry> collectionJ = agomVar2.j();
                        linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(collectionJ, 10)), 16));
                        for (Map.Entry entry : collectionJ) {
                            entry.getClass();
                            Object key = entry.getKey();
                            key.getClass();
                            pbg pbgVar = (pbg) key;
                            Object value = entry.getValue();
                            value.getClass();
                            String str6 = (String) value;
                            Objects.checkIndex(0, i2);
                            if (pbgVar instanceof pbj) {
                                qaaVar = new qad(((pbj) pbgVar).a);
                            } else {
                                if (!(pbgVar instanceof pbi)) {
                                    throw new awmj();
                                }
                                pbi pbiVar = (pbi) pbgVar;
                                qaaVar = new qaa(pbiVar.a, pbiVar.b);
                            }
                            awml awmlVar = new awml(str6, qaaVar);
                            linkedHashMap.put(awmlVar.a, awmlVar.b);
                            i2 = 3;
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    nwb.a(plxVar);
                    nwb.b(agkeVarB);
                    ahza ahzaVar = pbhVar != null ? pbhVar.a : null;
                    ahza ahzaVar2 = ahza.LIMIT_REACHED;
                    if (ahzaVar != ahzaVar2 && ((pbhVar == null || (agomVar = pbhVar.b) == null || !agomVar.t(ahzaVar2)) && (agomVar2 == null || agomVar2.w()))) {
                        paw pawVarB3 = this.e.b(ahzv.DISMISSED);
                        ((pbc) pawVarB3).r = 2;
                        pawVarB3.f(plxVar);
                        pawVarB3.c(agkeVarB);
                        pawVarB3.a();
                        b(pqf.x);
                    }
                    List listC = nvj.c(agkeVarB);
                    agev agevVarB2 = this.d.b();
                    if (agevVarB2.g()) {
                        abqq abqqVar3 = (abqq) agevVarB2.c();
                        pzx pzxVar = new pzx(bundleA, linkedHashMap);
                        if (((vxz) abqqVar3.b).l(23, 45714778L, false)) {
                            Iterator it2 = listC.iterator();
                            while (it2.hasNext()) {
                                abqqVar3.p((ozj) it2.next(), pzxVar);
                            }
                        } else {
                            Optional optionalT = ((elr) abqqVar3.j).t(listC);
                            if (!optionalT.isEmpty()) {
                                abqqVar3.p((ozj) optionalT.get(), pzxVar);
                            }
                        }
                        obj3 = awmy.a;
                        Object objAd5 = awrc.ad(ahng.n(obj3), awoqVar);
                        awox awoxVar5 = awox.a;
                        if (objAd5 != awoxVar5) {
                            objAd5 = obj3;
                        }
                        if (objAd5 == awoxVar5) {
                            obj3 = objAd5;
                        }
                    } else {
                        obj3 = awmy.a;
                    }
                    if (obj3 == awox.a) {
                        return obj3;
                    }
                } else if (str2 != null) {
                    if (agkeVarB.size() == 1) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    agkeVarB.getClass();
                    Object objX3 = atqq.X(agkeVarB);
                    objX3.getClass();
                    it = ((pot) objX3).u.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!awrc.c(((pos) next).a, str2));
                    posVar = (pos) next;
                    if (posVar != null) {
                        aicfVarB = posVar.b();
                    } else {
                        aicfVarB = null;
                    }
                    if (aicfVarB != null) {
                        Object objX4 = atqq.X(agkeVarB);
                        objX4.getClass();
                        pot potVar3 = (pot) objX4;
                        if (aicfVarB.c == 4) {
                        }
                        nwb.a(plxVar);
                        paw pawVarB4 = this.e.b(ahzv.ACTION_CLICK);
                        pbc pbcVar3 = (pbc) pawVarB4;
                        pbcVar3.r = 2;
                        if (aicfVarB.c == 4) {
                            str = (String) aicfVarB.d;
                        } else {
                            str = "";
                        }
                        pbcVar3.d = str;
                        pawVarB4.f(plxVar);
                        pawVarB4.b(potVar3);
                        pawVarB4.a();
                        b(pqf.z);
                        ozj ozjVarB2 = nvj.b(potVar3);
                        agevVarA = this.d.a(ozjVarB2);
                        if (agevVarA.g()) {
                            i = 13;
                            if (z) {
                                abqqVar2 = (abqq) agevVarA.c();
                                abqqVar2.q(aicfVarB);
                                agev agevVarA4 = ozi.a(aicfVarB);
                                Object obj7 = abqqVar2.j;
                                optional2 = (Optional) agevVarA4.a(new xwd(obj7, i)).d(new ytj(i));
                                if (!optional2.isEmpty()) {
                                    iAS2 = a.aS(((ajcp) optional2.get()).e);
                                    if (iAS2 == 0) {
                                        ((aaap) abqqVar2.f).a("Not an app Activity behavior.");
                                    } else {
                                        ((aaap) abqqVar2.f).a("Not an app Activity behavior.");
                                    }
                                }
                                obj = awmy.a;
                                objAd2 = awrc.ad(ahng.n(obj), awoqVar);
                                awoxVar2 = awox.a;
                                if (objAd2 == awoxVar2) {
                                    obj = objAd2;
                                }
                                if (obj != awoxVar2) {
                                    obj = awmy.a;
                                }
                            } else {
                                abqqVar = (abqq) agevVarA.c();
                                abqqVar.q(aicfVarB);
                                agev agevVarA5 = ozi.a(aicfVarB);
                                Object obj8 = abqqVar.j;
                                optional = (Optional) agevVarA5.a(new xwd(obj8, i)).d(new ytj(i));
                                if (!optional.isEmpty()) {
                                    iAS = a.aS(((ajcp) optional.get()).e);
                                    if (iAS == 0) {
                                        ((aaap) abqqVar.f).a("Not a background behavior.");
                                    } else {
                                        ((aaap) abqqVar.f).a("Not a background behavior.");
                                    }
                                }
                                obj = awmy.a;
                                objAd = awrc.ad(ahng.n(obj), awoqVar);
                                awoxVar = awox.a;
                                if (objAd == awoxVar) {
                                    obj = objAd;
                                }
                                if (obj != awoxVar) {
                                    obj = awmy.a;
                                }
                            }
                        } else {
                            String str7 = aicfVarB.h;
                            str7.getClass();
                            c(str7);
                            obj = awmy.a;
                        }
                        if (obj == awox.a) {
                            return obj;
                        }
                    }
                }
            } else if (str2.equals("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED")) {
                agkeVarB.getClass();
                nwb.a(plxVar);
                nwb.b(agkeVarB);
                paw pawVarB5 = this.e.b(ahzv.EXPIRED);
                pawVarB5.f(plxVar);
                pawVarB5.c(agkeVarB);
                pawVarB5.a();
                b(pqf.A);
                pcn pcnVar = this.d;
                List listC2 = nvj.c(agkeVarB);
                agev agevVarB3 = pcnVar.b();
                if (agevVarB3.g()) {
                    abqq abqqVar4 = (abqq) agevVarB3.c();
                    pzt pztVar = new pzt(bundleA);
                    if (((vxz) abqqVar4.b).l(23, 45714778L, false)) {
                        Iterator it3 = listC2.iterator();
                        while (it3.hasNext()) {
                            abqqVar4.o(((elr) abqqVar4.j).s((ozj) it3.next()), pztVar);
                        }
                    } else {
                        elr elrVar = (elr) abqqVar4.j;
                        Optional optionalT2 = elrVar.t(listC2);
                        abqqVar4.o(optionalT2.isPresent() ? elrVar.s((ozj) optionalT2.get()) : Optional.empty(), pztVar);
                    }
                    obj2 = awmy.a;
                    Object objAd6 = awrc.ad(ahng.n(obj2), awoqVar);
                    awox awoxVar6 = awox.a;
                    if (objAd6 != awoxVar6) {
                        objAd6 = obj2;
                    }
                    if (objAd6 == awoxVar6) {
                        obj2 = objAd6;
                    }
                } else {
                    obj2 = awmy.a;
                }
                if (obj2 == awox.a) {
                    return obj2;
                }
            } else if (str2 != null) {
                if (agkeVarB.size() == 1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                agkeVarB.getClass();
                Object objX5 = atqq.X(agkeVarB);
                objX5.getClass();
                it = ((pot) objX5).u.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!awrc.c(((pos) next).a, str2));
                posVar = (pos) next;
                if (posVar != null) {
                    aicfVarB = posVar.b();
                } else {
                    aicfVarB = null;
                }
                if (aicfVarB != null) {
                    Object objX6 = atqq.X(agkeVarB);
                    objX6.getClass();
                    pot potVar4 = (pot) objX6;
                    if (aicfVarB.c == 4) {
                    }
                    nwb.a(plxVar);
                    paw pawVarB6 = this.e.b(ahzv.ACTION_CLICK);
                    pbc pbcVar4 = (pbc) pawVarB6;
                    pbcVar4.r = 2;
                    if (aicfVarB.c == 4) {
                        str = (String) aicfVarB.d;
                    } else {
                        str = "";
                    }
                    pbcVar4.d = str;
                    pawVarB6.f(plxVar);
                    pawVarB6.b(potVar4);
                    pawVarB6.a();
                    b(pqf.z);
                    ozj ozjVarB3 = nvj.b(potVar4);
                    agevVarA = this.d.a(ozjVarB3);
                    if (agevVarA.g()) {
                        i = 13;
                        if (z) {
                            abqqVar2 = (abqq) agevVarA.c();
                            abqqVar2.q(aicfVarB);
                            agev agevVarA6 = ozi.a(aicfVarB);
                            Object obj9 = abqqVar2.j;
                            optional2 = (Optional) agevVarA6.a(new xwd(obj9, i)).d(new ytj(i));
                            if (!optional2.isEmpty()) {
                                iAS2 = a.aS(((ajcp) optional2.get()).e);
                                if (iAS2 == 0) {
                                    ((aaap) abqqVar2.f).a("Not an app Activity behavior.");
                                } else {
                                    ((aaap) abqqVar2.f).a("Not an app Activity behavior.");
                                }
                            }
                            obj = awmy.a;
                            objAd2 = awrc.ad(ahng.n(obj), awoqVar);
                            awoxVar2 = awox.a;
                            if (objAd2 == awoxVar2) {
                                obj = objAd2;
                            }
                            if (obj != awoxVar2) {
                                obj = awmy.a;
                            }
                        } else {
                            abqqVar = (abqq) agevVarA.c();
                            abqqVar.q(aicfVarB);
                            agev agevVarA7 = ozi.a(aicfVarB);
                            Object obj10 = abqqVar.j;
                            optional = (Optional) agevVarA7.a(new xwd(obj10, i)).d(new ytj(i));
                            if (!optional.isEmpty()) {
                                iAS = a.aS(((ajcp) optional.get()).e);
                                if (iAS == 0) {
                                    ((aaap) abqqVar.f).a("Not a background behavior.");
                                } else {
                                    ((aaap) abqqVar.f).a("Not a background behavior.");
                                }
                            }
                            obj = awmy.a;
                            objAd = awrc.ad(ahng.n(obj), awoqVar);
                            awoxVar = awox.a;
                            if (objAd == awoxVar) {
                                obj = objAd;
                            }
                            if (obj != awoxVar) {
                                obj = awmy.a;
                            }
                        }
                    } else {
                        String str8 = aicfVarB.h;
                        str8.getClass();
                        c(str8);
                        obj = awmy.a;
                    }
                    if (obj == awox.a) {
                        return obj;
                    }
                }
            }
        } else if (str2 != null && str2.length() != 0) {
            if (agkeVarB.size() == 1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            agkeVarB.getClass();
            Object objX7 = atqq.X(agkeVarB);
            objX7.getClass();
            it = ((pot) objX7).u.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!awrc.c(((pos) next).a, str2));
            posVar = (pos) next;
            if (posVar != null) {
                aicfVarB = posVar.b();
            } else {
                aicfVarB = null;
            }
            if (aicfVarB != null) {
                Object objX8 = atqq.X(agkeVarB);
                objX8.getClass();
                pot potVar5 = (pot) objX8;
                if (aicfVarB.c == 4) {
                }
                nwb.a(plxVar);
                paw pawVarB7 = this.e.b(ahzv.ACTION_CLICK);
                pbc pbcVar5 = (pbc) pawVarB7;
                pbcVar5.r = 2;
                if (aicfVarB.c == 4) {
                    str = (String) aicfVarB.d;
                } else {
                    str = "";
                }
                pbcVar5.d = str;
                pawVarB7.f(plxVar);
                pawVarB7.b(potVar5);
                pawVarB7.a();
                b(pqf.z);
                ozj ozjVarB4 = nvj.b(potVar5);
                agevVarA = this.d.a(ozjVarB4);
                if (agevVarA.g()) {
                    i = 13;
                    if (z) {
                        abqqVar2 = (abqq) agevVarA.c();
                        abqqVar2.q(aicfVarB);
                        agev agevVarA8 = ozi.a(aicfVarB);
                        Object obj11 = abqqVar2.j;
                        optional2 = (Optional) agevVarA8.a(new xwd(obj11, i)).d(new ytj(i));
                        if (!optional2.isEmpty()) {
                            iAS2 = a.aS(((ajcp) optional2.get()).e);
                            if (iAS2 == 0 && iAS2 == 2) {
                                ahgb ahgbVar = (ahgb) abqqVar2.i;
                                ahgbVar.f((ajcp) optional2.get(), ((elr) obj11).s(ozjVarB4), bundleA);
                                ahgbVar.d((ajcp) optional2.get());
                            } else {
                                ((aaap) abqqVar2.f).a("Not an app Activity behavior.");
                            }
                        }
                        obj = awmy.a;
                        objAd2 = awrc.ad(ahng.n(obj), awoqVar);
                        awoxVar2 = awox.a;
                        if (objAd2 == awoxVar2) {
                            obj = objAd2;
                        }
                        if (obj != awoxVar2) {
                            obj = awmy.a;
                        }
                    } else {
                        abqqVar = (abqq) agevVarA.c();
                        abqqVar.q(aicfVarB);
                        agev agevVarA9 = ozi.a(aicfVarB);
                        Object obj12 = abqqVar.j;
                        optional = (Optional) agevVarA9.a(new xwd(obj12, i)).d(new ytj(i));
                        if (!optional.isEmpty()) {
                            iAS = a.aS(((ajcp) optional.get()).e);
                            if (iAS == 0 && iAS == 3) {
                                ahgb ahgbVar2 = (ahgb) abqqVar.i;
                                ahgbVar2.f((ajcp) optional.get(), ((elr) obj12).s(ozjVarB4), bundleA);
                                ahgbVar2.d((ajcp) optional.get());
                                ajcp ajcpVar = (ajcp) optional.get();
                                if ((ajcpVar.b & 1) != 0) {
                                    afv afvVar = new afv();
                                    ajwo ajwoVar = ajcpVar.c;
                                    if (ajwoVar == null) {
                                        ajwoVar = ajwo.a;
                                    }
                                    afvVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ajwoVar.c.G());
                                    ?? r3 = abqqVar.a;
                                    ajwo ajwoVar2 = ajcpVar.c;
                                    if (ajwoVar2 == null) {
                                        ajwoVar2 = ajwo.a;
                                    }
                                    r3.c(ajwoVar2, afvVar);
                                }
                            } else {
                                ((aaap) abqqVar.f).a("Not a background behavior.");
                            }
                        }
                        obj = awmy.a;
                        objAd = awrc.ad(ahng.n(obj), awoqVar);
                        awoxVar = awox.a;
                        if (objAd == awoxVar) {
                            obj = objAd;
                        }
                        if (obj != awoxVar) {
                            obj = awmy.a;
                        }
                    }
                } else {
                    String str9 = aicfVarB.h;
                    str9.getClass();
                    c(str9);
                    obj = awmy.a;
                }
                if (obj == awox.a) {
                    return obj;
                }
            }
        }
        return awmy.a;
    }
}
