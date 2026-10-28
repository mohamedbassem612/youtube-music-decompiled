package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class srh {
    public final awmd a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public srh(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10) {
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        awmdVar7.getClass();
        this.g = awmdVar7;
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.i = awmdVar9;
        awmdVar10.getClass();
        this.j = awmdVar10;
    }

    public static final void A(rsl rslVar, String str) {
        String str2;
        try {
            int i = rslVar.v;
            if (i == 0) {
                str2 = "FILL_NOT_REQUESTED";
            } else if (i == 1) {
                str2 = "FILL_REQUESTED";
            } else if (i != 2) {
                str2 = i != 3 ? "FILL_CANCELED" : "FILL_CANCEL_REQUESTED";
            } else {
                str2 = "FILLED";
            }
            rmp.k(rslVar.a, a.ca(str, str2, "Fulfillment status was ", " when calling method "));
        } catch (IllegalStateException unused) {
            rmp.k(rslVar.a, String.format("Fulfillment status was invalid status: %s when calling method %s", Integer.valueOf(rslVar.v), str));
        }
    }

    public static final void B(rsl rslVar, String str) {
        try {
            rmp.k(rslVar.a, d(rslVar, str));
        } catch (IllegalStateException unused) {
            rmp.k(rslVar.a, String.format("Slot status was invalid status: %s when calling method %s", Integer.valueOf(rslVar.u), str));
        }
    }

    private static String C(rsl rslVar) {
        slz slzVar;
        skh skhVar = rslVar.b;
        if (skhVar != null && (slzVar = skhVar.b) != null) {
            String str = slzVar.a;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        smr smrVar = rslVar.a;
        if (smrVar.e(sic.class)) {
            String str2 = (String) smrVar.d(sic.class);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    private static String D(smr smrVar) {
        Object obj;
        snk snkVar;
        Optional optionalOfNullable = smrVar.k;
        if (true == optionalOfNullable.isPresent()) {
            aizs aizsVar = (aizs) optionalOfNullable.get();
            aixr aixrVarA = aixr.a(aizsVar.e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA != aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED || aizsVar.b != 18) {
                optionalOfNullable = Optional.empty();
            }
        }
        if (true == optionalOfNullable.isPresent()) {
            aizs aizsVar2 = (aizs) optionalOfNullable.get();
            optionalOfNullable = Optional.ofNullable((aizsVar2.b == 18 ? (amka) aizsVar2.c : amka.a).b);
        }
        hly hlyVar = new hly(smrVar, 10);
        if (true != optionalOfNullable.isPresent()) {
            Object obj2 = hlyVar.a;
            int i = 0;
            do {
                agke agkeVar = ((smr) obj2).d;
                if (i < ((agpi) agkeVar).d) {
                    snkVar = (snk) agkeVar.get(i);
                    i++;
                } else {
                    obj = "";
                }
            } while (!(snkVar instanceof skv));
            obj = ((skv) snkVar).a;
        } else {
            obj = optionalOfNullable.get();
        }
        return (String) obj;
    }

    public static String d(rsl rslVar, String str) {
        return "Slot status was " + rslVar.a() + " when calling method " + str;
    }

    public final rsl a(smr smrVar) {
        Map mapE = e(smrVar);
        if (mapE != null) {
            return (rsl) mapE.get(smrVar.a);
        }
        return null;
    }

    public final skh b(smr smrVar) {
        rsl rslVarA = a(smrVar);
        if (rslVarA != null) {
            return rslVarA.b;
        }
        return null;
    }

    public final sko c(smr smrVar) {
        rsl rslVarA = a(smrVar);
        if (rslVarA == null) {
            return null;
        }
        return rslVarA.t;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final Map e(smr smrVar) {
        boolean zContains = ((agkz) this.j).contains(smrVar.c());
        smq smqVar = smrVar.b;
        if (zContains || smrVar.j) {
            ?? r3 = this.h;
            if (!r3.containsKey(smqVar)) {
                r3.put(smqVar, new HashMap());
            }
        }
        return (Map) this.h.get(smqVar);
    }

    public final void f(smr smrVar) {
        a(smrVar).r = true;
    }

    public final void g(smr smrVar) {
        a(smrVar).s = true;
    }

    public final void h(smr smrVar) {
        ((tbt) this.a.io()).c(new sfq());
        rsl rslVarA = a(smrVar);
        if (rslVarA.u != 0) {
            B(rslVarA, "onSlotScheduled");
        }
        rslVarA.u = 1;
    }

    public final void i(rsl rslVar, List list, int i, sgp sgpVar) throws sav {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aizs aizsVar = (aizs) it.next();
            int i2 = i;
            sgp sgpVar2 = sgpVar;
            rslVar.i.put(aizsVar.d, ((roq) this.c).e(i2, aizsVar, rslVar.a, rslVar.t, sgpVar2));
            i = i2;
            sgpVar = sgpVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void j(rsl rslVar, sko skoVar, List list, int i) {
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            snk snkVar = (snk) agqsVarListIterator.next();
            scg scgVar = (scg) ((awmd) this.e.get(snkVar.a())).io();
            scgVar.z(i, snkVar, rslVar.a, skoVar);
            rslVar.f.put(snkVar.b(), scgVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void k(smr smrVar, sko skoVar) {
        agqr it = skoVar.l.keySet().iterator();
        while (it.hasNext()) {
            snk snkVar = (snk) it.next();
            ((scg) ((awmd) this.e.get(snkVar.a())).io()).z(0, snkVar, smrVar, skoVar);
        }
    }

    public final void l(rsl rslVar, List list, int i, sgp sgpVar) throws sau, sav {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aizs aizsVar = (aizs) it.next();
            Object obj = this.c;
            smr smrVar = rslVar.a;
            int i2 = i;
            sgp sgpVar2 = sgpVar;
            scr scrVarE = ((roq) obj).e(i2, aizsVar, smrVar, (sko) smrVar.i.get(), sgpVar2);
            if (i2 == 6) {
                rslVar.j.put(aizsVar.d, scrVarE);
            } else {
                if (i2 != 8) {
                    throw new sau(a.bR(i2, "Unsupported trigger category: "), 138);
                }
                rslVar.h.put(aizsVar.d, scrVarE);
            }
            i = i2;
            sgpVar = sgpVar2;
        }
    }

    public final void m(smr smrVar, skh skhVar) throws sau {
        Map mapE = e(smrVar);
        String str = smrVar.a;
        if (mapE.containsKey(str)) {
            throw new sau("Duplicate slots not supported", 7);
        }
        mapE.put(str, new rsl(smrVar, skhVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void n(sko skoVar) {
        agqr it = skoVar.l.keySet().iterator();
        while (it.hasNext()) {
            snk snkVar = (snk) it.next();
            ((scg) ((awmd) this.e.get(snkVar.a())).io()).A(snkVar);
        }
    }

    public final void o(smr smrVar) {
        rsl rslVarA = a(smrVar);
        if (rslVarA == null) {
            throw new sau("Got enter request for unknown slot", 15);
        }
        if (!smrVar.j && rslVarA.p == null) {
            throw new sau("Tried to enter slot with no assigned slotAdapter", 17);
        }
        if (!rslVarA.e()) {
            throw new sau(d(rslVarA, "validateEnterSlot"), 16);
        }
        for (rsl rslVar : e(smrVar).values()) {
            if (rslVarA != rslVar && rslVar.c() && !t(rslVarA, rslVar)) {
                throw new sau("Trying to enter a slot when a slot of same type and physical position is already active. Its status: " + rslVar.u, 7);
            }
        }
    }

    public final void p(aizs aizsVar) throws sau {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (((roq) this.c).d(aixrVarA)) {
            return;
        }
        aixr aixrVarA2 = aixr.a(aizsVar.e);
        if (aixrVarA2 == null) {
            aixrVarA2 = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        throw new sau("No trigger adapter registered for slot with trigger of type: " + aixrVarA2.aT, 11);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void q(Iterable iterable) throws sas {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            snk snkVar = (snk) it.next();
            if (this.e.get(snkVar.a()) == null) {
                throw new sas("No trigger adapter registered for layout with trigger of type: ".concat(String.valueOf(snkVar.a().name())), 11);
            }
        }
    }

    public final boolean r(smr smrVar) {
        rsl rslVarA = a(smrVar);
        if (rslVarA != null) {
            return rslVarA.t != null && (!smrVar.j ? rslVarA.q != null : rslVarA.w != null);
        }
        return false;
    }

    public final boolean s(smr smrVar) {
        return e(smrVar).containsKey(smrVar.a);
    }

    public final boolean t(rsl rslVar, rsl rslVar2) {
        smr smrVar = rslVar.a;
        if (smrVar.c() == aixo.SLOT_TYPE_SEQUENCE_ITEM_AD_SELECTION && afxw.e((vyo) this.b).bF) {
            return true;
        }
        aixo aixoVarC = smrVar.c();
        aixo aixoVar = aixo.SLOT_TYPE_IN_PLAYER;
        if (aixoVarC == aixoVar) {
            smr smrVar2 = rslVar2.a;
            if (smrVar2.c() == aixoVar && ((smrVar.j || smrVar2.j) && afxw.e((vyo) this.b).bG)) {
                String strC = C(rslVar);
                String strC2 = C(rslVar2);
                if (!strC.isEmpty() && strC.equals(strC2)) {
                    if (rslVar2.g()) {
                        return true;
                    }
                    String strD = D(smrVar);
                    String strD2 = D(smrVar2);
                    if (!strD.isEmpty() && strD.equals(strD2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean u(smr smrVar) {
        return a(smrVar).s;
    }

    public final boolean v(smr smrVar, sko skoVar) {
        sko skoVar2;
        rsl rslVarA = a(smrVar);
        if (rslVarA == null || (skoVar2 = rslVarA.t) == null) {
            return false;
        }
        return TextUtils.equals(skoVar2.a, skoVar.a);
    }

    public final boolean w(smr smrVar) {
        rsl rslVarA = a(smrVar);
        return rslVarA != null && rslVarA.d();
    }

    public final boolean x(smr smrVar) {
        int i;
        rsl rslVarA = a(smrVar);
        return rslVarA != null && ((i = rslVarA.u) == 3 || i == 4 || i == 5 || i == 6);
    }

    public final boolean y(smr smrVar) {
        rsl rslVarA = a(smrVar);
        return rslVarA != null && rslVarA.f();
    }

    public final boolean z(smr smrVar) {
        return a(smrVar).r;
    }

    public srh(tld tldVar, tld tldVar2, rnj rnjVar, Map map, ryp rypVar, roq roqVar, awmd awmdVar, agkz agkzVar, vyo vyoVar) {
        this.d = tldVar;
        this.g = tldVar2;
        this.f = rnjVar;
        this.e = map;
        this.i = rypVar;
        this.c = roqVar;
        this.a = awmdVar;
        this.j = agkzVar;
        this.h = new HashMap();
        this.b = vyoVar;
    }
}
