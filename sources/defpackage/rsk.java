package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rsk implements tcq {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final spv f;
    public final srh g;
    public final rmp h;
    private final Set i;
    private final Set j;
    private final Set k;
    private final Set l;
    private final Set m;
    private final agke n;
    private final agke o;
    private final sae p;
    private final vyo q;
    private final sqe r = new sqe(10);
    private tdd s;
    private final tld t;

    public rsk(srh srhVar, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8, Set set9, agke agkeVar, agke agkeVar2, Set set10, Context context, spv spvVar, rmp rmpVar, tld tldVar, sae saeVar, awmd awmdVar, tqj tqjVar, vyo vyoVar) {
        this.g = srhVar;
        this.a = set;
        this.b = set2;
        this.i = set3;
        this.j = set4;
        this.c = set5;
        this.k = set6;
        this.l = set7;
        this.d = set8;
        this.m = set9;
        this.n = agkeVar;
        this.o = agkeVar2;
        this.e = set10;
        this.f = spvVar;
        this.h = rmpVar;
        this.t = tldVar;
        this.p = saeVar;
        this.q = vyoVar;
        int i = tqr.a;
        if (tqjVar.k(1073830161)) {
            ((oml) awmdVar.io()).g(this);
            return;
        }
        tdd tddVar = new tdd(tqjVar);
        this.s = tddVar;
        tddVar.b(tym.L(context));
        this.s.a(this);
    }

    private final void A(smr smrVar) {
        srh srhVar = this.g;
        if (srhVar.s(smrVar) && srhVar.a(smrVar).u == 3 && srhVar.r(smrVar)) {
            this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_ENTER_LAYOUT_REQUESTED, smrVar, srhVar.c(smrVar), null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
            rsl rslVarA = srhVar.a(smrVar);
            rslVarA.u = 4;
            if (smrVar.j) {
                rslVarA.w.b();
            } else {
                rslVarA.q.M();
            }
        }
    }

    private final void B(smr smrVar, sko skoVar, int i) {
        aixe aixeVar = (aixe) sdd.c.get(Integer.valueOf(i));
        if (aixeVar == null) {
            aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED;
        }
        aixe aixeVar2 = aixeVar;
        spv spvVar = this.f;
        srh srhVar = this.g;
        spvVar.f(aixeVar2, smrVar, skoVar, null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
        rsl rslVarA = srhVar.a(smrVar);
        if (rslVarA.u != 4) {
            srh.B(rslVarA, "stopRenderingLayout");
        }
        rslVarA.u = 5;
        if (smrVar.j) {
            rslVarA.w.V(i);
        } else {
            rslVarA.q.N(i);
        }
    }

    private final boolean C(smr smrVar, sko skoVar) {
        srh srhVar = this.g;
        return srhVar.s(smrVar) && srhVar.r(smrVar) && srhVar.x(smrVar) && srhVar.w(smrVar) && srhVar.v(smrVar, skoVar);
    }

    private final void w(smr smrVar, boolean z) {
        srh srhVar = this.g;
        sko skoVarC = srhVar.c(smrVar);
        if (C(smrVar, skoVarC)) {
            B(smrVar, skoVarC, true == z ? 1 : 4);
            return;
        }
        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_EXIT_SLOT_REQUESTED, smrVar, null, null, null, 0, null, null, srhVar.b(smrVar), null, null, z);
        rsl rslVarA = srhVar.a(smrVar);
        int i = rslVarA.u;
        if (i != 2 && i != 3 && i != 4) {
            srh.B(rslVarA, "exitSlot");
        }
        rslVarA.u = 6;
        if (!smrVar.j) {
            rslVarA.p.b();
        } else {
            ryj ryjVar = rslVarA.w;
            ryjVar.f.l(ryjVar.d);
        }
    }

    private final void x(skh skhVar, smr smrVar, sko skoVar, int i) {
        aixe aixeVar = (aixe) sdd.d.get(Integer.valueOf(i));
        if (aixeVar == null) {
            aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED;
        }
        this.f.f(aixeVar, smrVar, skoVar, null, null, 0, null, null, skhVar, null, null, false);
    }

    private final void y(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            snl snlVar = (snl) it.next();
            smr smrVar = snlVar.c;
            sko skoVar = snlVar.d;
            if (C(smrVar, skoVar)) {
                B(smrVar, skoVar, i);
            }
        }
    }

    private final void z(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sni sniVar = (sni) it.next();
            smr smrVar = sniVar.c;
            sko skoVar = sniVar.d;
            if (C(smrVar, skoVar)) {
                B(smrVar, skoVar, i);
            }
        }
    }

    public final agev a(smr smrVar, aixm aixmVar) {
        int i;
        int iOrdinal = aixmVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                rsl rslVarA = smrVar != null ? this.g.a(smrVar) : null;
                if (rslVarA == null) {
                    return agev.i(this.r);
                }
                sqe sqeVar = rslVarA.c;
                if (sqeVar.b <= 0 && (i = afxw.e(this.q).cl) > 0 && i != sqeVar.a && sqeVar.b <= 0) {
                    sqeVar.a = i;
                }
                return agev.i(sqeVar);
            }
            if (iOrdinal != 2) {
                throw new RuntimeException(null, null);
            }
        } else {
            rmp.n(smrVar, "Tried to log a rendering event with unspecified tier. This should never happen.");
        }
        return agdf.a;
    }

    public final void b(smr smrVar, sko skoVar) {
        c(this.g.b(smrVar), smrVar, skoVar);
    }

    public final void c(skh skhVar, smr smrVar, sko skoVar) {
        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_ENTERED, smrVar, skoVar, null, null, 0, null, null, skhVar, null, null, false);
        agke agkeVar = this.n;
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            ((sah) agkeVar.get(i)).W(smrVar, skoVar);
        }
    }

    public final void d(smr smrVar, sko skoVar, int i) {
        srh srhVar = this.g;
        if (!srhVar.s(smrVar)) {
            rmp.l(smrVar, skoVar, "Warning - got onLayoutExited() when slot was unregistered");
            return;
        }
        x(srhVar.b(smrVar), smrVar, skoVar, i);
        if (!srhVar.x(smrVar)) {
            rmp.l(smrVar, skoVar, "Warning - got onLayoutExited() when slot was inactive");
        }
        if (srhVar.v(smrVar, skoVar)) {
            rsl rslVarA = srhVar.a(smrVar);
            if (!rslVarA.d()) {
                srh.B(rslVarA, "onLayoutExited");
            }
            rslVarA.u = 3;
        }
        agke agkeVar = this.o;
        int size = agkeVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((sai) agkeVar.get(i2)).b(smrVar, skoVar, i);
        }
        if (srhVar.s(smrVar) && srhVar.v(smrVar, skoVar)) {
            w(smrVar, false);
        }
    }

    public final void e(skh skhVar, smr smrVar, sko skoVar, int i) {
        x(skhVar, smrVar, skoVar, i);
        agke agkeVar = this.o;
        int size = agkeVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((sai) agkeVar.get(i2)).b(smrVar, skoVar, i);
        }
    }

    public final void f(skh skhVar, smr smrVar, sko skoVar) {
        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_RECEIVED, smrVar, skoVar, null, null, 0, null, null, skhVar, null, null, false);
    }

    public final void g(skh skhVar, smr smrVar, sko skoVar) {
        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED, smrVar, skoVar, null, null, 0, null, null, skhVar, null, null, false);
        try {
            this.g.k(smrVar, skoVar);
        } catch (sau e) {
            rmp.k(smrVar, e.toString());
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((saj) it.next()).c(skoVar);
        }
    }

    public final void h(skh skhVar, smr smrVar, sko skoVar) {
        this.g.n(skoVar);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((sak) it.next()).w(skoVar);
        }
        if (afxw.e(this.q).B) {
            this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_UNSCHEDULED, smrVar, skoVar, null, null, 0, null, null, skhVar, null, null, false);
        }
    }

    public final void i(List list) {
        SparseArray sparseArray = new SparseArray();
        Collections.sort(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            snl snlVar = (snl) it.next();
            srh srhVar = this.g;
            smr smrVar = snlVar.c;
            if (srhVar.s(smrVar)) {
                rsl rslVarA = srhVar.a(smrVar);
                if (rslVarA == null) {
                    rmp.l(smrVar, snlVar.d, "Slot state is null when trying to validate the trigger activation condition.");
                } else if (!snlVar.b.f || !rslVarA.n.contains(snlVar)) {
                }
                if (srhVar.z(smrVar)) {
                    rsl rslVarA2 = srhVar.a(smrVar);
                    if (rslVarA2 == null) {
                        rmp.l(smrVar, snlVar.d, "Slot state is null when trying to add a deferred server trigger for later activation.");
                    } else {
                        rslVarA2.m.add(snlVar);
                    }
                } else {
                    rsl rslVarA3 = srhVar.a(smrVar);
                    if (rslVarA3 == null) {
                        rmp.l(smrVar, snlVar.d, "Slot state is null when trying to add an activated server trigger.");
                    } else {
                        rslVarA3.n.add(snlVar);
                    }
                    spv spvVar = this.f;
                    vwt vwtVar = spvVar.b;
                    aixe aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_TRIGGER_ACTIVATED;
                    if (vwtVar.ah()) {
                        spvVar.f(aixeVar, smrVar, snlVar.d, null, snlVar, 0, null, null, null, null, null, false);
                    }
                    int i = snlVar.a;
                    List arrayList = (List) sparseArray.get(i);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        sparseArray.put(i, arrayList);
                    }
                    arrayList.add(snlVar);
                }
            } else {
                rmp.m(smrVar, snlVar.d, "Server trigger activated when slot is not registered");
            }
        }
        if (sparseArray.get(1) != null) {
            y((List) sparseArray.get(1), 0);
        }
        if (sparseArray.get(2) != null) {
            y((List) sparseArray.get(2), 2);
        }
        if (sparseArray.get(3) != null) {
            y((List) sparseArray.get(3), 3);
        }
        if (sparseArray.get(5) != null) {
            y((List) sparseArray.get(5), 6);
        }
        if (sparseArray.get(6) != null) {
            Iterator it2 = ((List) sparseArray.get(6)).iterator();
            while (it2.hasNext()) {
                s(((snl) it2.next()).c, false);
            }
        }
        if (sparseArray.get(8) != null) {
            for (snl snlVar2 : (List) sparseArray.get(8)) {
                srh srhVar2 = this.g;
                smr smrVar2 = snlVar2.c;
                if (!srhVar2.y(smrVar2) && !srhVar2.x(smrVar2)) {
                    this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_ENTER_SLOT_REQUESTED, smrVar2, null, null, null, 0, null, null, srhVar2.b(smrVar2), null, null, false);
                    Set set = this.i;
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        ((sal) it3.next()).d(smrVar2);
                    }
                    try {
                        srhVar2.o(smrVar2);
                        rsl rslVarA4 = srhVar2.a(smrVar2);
                        if (rslVarA4 == null) {
                            throw new sau("Null slotState for requestEnterV2Slot", 15);
                        }
                        if (!rslVarA4.e()) {
                            srh.B(rslVarA4, "requestEnterSlot");
                        }
                        rslVarA4.u = 2;
                        ryj ryjVar = rslVarA4.w;
                        if (ryjVar == null) {
                            throw new sau("Null registeredRenderingAdapter for requestEnterV2Slot", 147);
                        }
                        ryjVar.s();
                        Iterator it4 = set.iterator();
                        while (it4.hasNext()) {
                            ((sal) it4.next()).e(smrVar2);
                        }
                    } catch (sau e) {
                        spv spvVar2 = this.f;
                        srh srhVar3 = this.g;
                        smr smrVar3 = snlVar2.c;
                        spvVar2.d(7, e.a, srhVar3.b(smrVar3), smrVar3);
                        e.toString();
                        s(smrVar3, true);
                    }
                }
            }
        }
    }

    public final void j(smr smrVar) {
        srh srhVar = this.g;
        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED, smrVar, null, null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
        try {
            rsl rslVarA = srhVar.a(smrVar);
            if (rslVarA == null) {
                throw new sau("Null slotState for onSlotEntered", 15);
            }
            if (!rslVarA.f()) {
                throw new sau(srh.d(rslVarA, "validateOnSlotEntered"), 16);
            }
            if (!smrVar.j && rslVarA.p == null) {
                throw new sau("No registeredSlotAdapter onSlotEntered", 17);
            }
            for (rsl rslVar : srhVar.e(smrVar).values()) {
                if (rslVarA != rslVar && rslVar.c() && !srhVar.t(rslVarA, rslVar)) {
                    throw new sau("Entered a slot when a slot of same type and physical position is already active. Its status: ".concat(rslVar.a()), 7);
                }
            }
            rsl rslVarA2 = srhVar.a(smrVar);
            if (!rslVarA2.f()) {
                srh.B(rslVarA2, "onSlotEntered");
            }
            rslVarA2.u = 3;
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((sam) it.next()).f(smrVar);
            }
            A(smrVar);
        } catch (sau e) {
            this.f.d(7, e.a, this.g.b(smrVar), smrVar);
            e.toString();
            s(smrVar, true);
        }
    }

    public final void k(skh skhVar, smr smrVar) {
        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED, smrVar, null, null, null, 0, null, null, skhVar, null, null, false);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((sam) it.next()).f(smrVar);
        }
    }

    public final void l(smr smrVar) {
        srh srhVar = this.g;
        if (!srhVar.s(smrVar)) {
            rmp.k(smrVar, "Warning - got onSlotExited() when slot was unregistered");
            return;
        }
        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_EXITED, smrVar, null, null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
        rsl rslVarA = srhVar.a(smrVar);
        if (!rslVarA.g()) {
            srh.B(rslVarA, "onSlotExited");
        }
        rslVarA.u = 1;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((san) it.next()).g(smrVar);
        }
        if (srhVar.s(smrVar) && srhVar.u(smrVar)) {
            s(smrVar, false);
        }
    }

    /* JADX WARN: Type inference failed for: r3v27, types: [awmd, java.lang.Object] */
    public final void m(smr smrVar, sko skoVar) {
        sko skoVar2;
        srh srhVar = this.g;
        if (srhVar.s(smrVar)) {
            rsl rslVarA = srhVar.a(smrVar);
            if (!rslVarA.b()) {
                srh.A(rslVarA, "registerLayout");
            }
            rslVarA.v = 2;
            rslVarA.t = skoVar;
            spv spvVar = this.f;
            if (skoVar == null) {
                spvVar.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_EMPTY, smrVar, null, null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
                agqr it = ((agqj) this.l).iterator();
                while (it.hasNext()) {
                    sbj sbjVar = (sbj) it.next();
                    ArrayList arrayList = new ArrayList();
                    for (sni sniVar : sbjVar.g.aa()) {
                        snk snkVar = sniVar.b;
                        if ((snkVar instanceof smw) && TextUtils.equals(((smw) snkVar).a, smrVar.a)) {
                            arrayList.add(sniVar);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ((rsk) sbjVar.a.io()).q(arrayList);
                    }
                }
                s(smrVar, false);
                return;
            }
            spvVar.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_NON_EMPTY, smrVar, skoVar, null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
            aixe aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_RECEIVED;
            spvVar.f(aixeVar, smrVar, skoVar, null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
            spv spvVar2 = spvVar;
            if (skoVar.e(sjq.class)) {
                Iterator it2 = ((List) skoVar.d(sjq.class)).iterator();
                while (it2.hasNext()) {
                    spv spvVar3 = spvVar2;
                    spvVar3.f(aixeVar, smrVar, (sko) it2.next(), null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
                    spvVar2 = spvVar3;
                }
            }
            spv spvVar4 = spvVar2;
            agqr it3 = ((agqj) this.k).iterator();
            while (it3.hasNext()) {
                sbj sbjVar2 = (sbj) it3.next();
                Set set = sbjVar2.d;
                String str = smrVar.a;
                set.add(str);
                ArrayList arrayList2 = new ArrayList();
                for (sni sniVar2 : sbjVar2.g.aa()) {
                    sbjVar2.j(arrayList2, sniVar2, agev.i(str), agdf.a);
                    snk snkVar2 = sniVar2.b;
                    if ((snkVar2 instanceof smx) && TextUtils.equals(((smx) snkVar2).a, str)) {
                        arrayList2.add(sniVar2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ((rsk) sbjVar2.a.io()).q(arrayList2);
                }
            }
            if (srhVar.s(smrVar)) {
                if (srhVar.u(smrVar)) {
                    s(smrVar, false);
                    return;
                }
                spvVar4.f(aixe.ADS_CLIENT_EVENT_TYPE_SCHEDULE_LAYOUT_REQUESTED, smrVar, skoVar, null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
                try {
                    sko skoVar3 = srhVar.a(smrVar).t;
                    if (skoVar3.c().isEmpty()) {
                        throw new sas("Layout has no exit triggers.", 30);
                    }
                    srhVar.q(skoVar3.c());
                    srhVar.q(skoVar3.l.keySet());
                    if (!skoVar3.b().isEmpty()) {
                        throw new sas("V2 triggers as layout exit triggers are not supported for V1 slot", 141);
                    }
                    srhVar.f(smrVar);
                    try {
                        rsl rslVarA2 = srhVar.a(smrVar);
                        Object obj = srhVar.g;
                        sko skoVar4 = rslVarA2.t;
                        awmd awmdVar = (awmd) ((agkj) ((tld) obj).a).get(smrVar.c());
                        if (awmdVar != null) {
                            rye ryeVar = (rye) awmdVar.io();
                            rxj rxjVarU = ryeVar.U(smrVar, skoVar4);
                            rxjVarU.b();
                            rslVarA2.q = rxjVarU;
                            srhVar.k(rslVarA2.a, rslVarA2.t);
                            sko skoVar5 = rslVarA2.t;
                            srhVar.j(rslVarA2, skoVar5, skoVar5.d, 1);
                            srhVar.j(rslVarA2, skoVar5, skoVar5.f, 2);
                            srhVar.j(rslVarA2, skoVar5, skoVar5.h, 3);
                            srhVar.j(rslVarA2, skoVar5, skoVar5.j, 5);
                            this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED, smrVar, skoVar, null, null, 0, null, null, this.g.b(smrVar), null, null, false);
                            Iterator it4 = this.d.iterator();
                            while (it4.hasNext()) {
                                ((saj) it4.next()).c(skoVar);
                            }
                            r(smrVar, false);
                            A(smrVar);
                            return;
                        }
                        skoVar2 = skoVar;
                        try {
                            throw new ryd("Could not find a matching layoutRenderingAdapterFactory for slotType: ".concat(String.valueOf(smrVar.c().name())), 52);
                        } catch (ryd e) {
                            e = e;
                        } catch (sau e2) {
                            e = e2;
                        }
                    } catch (ryd | sau e3) {
                        e = e3;
                        skoVar2 = skoVar;
                    }
                    this.f.e(9, ((sar) e).a(), this.g.b(smrVar), smrVar, skoVar2);
                    e.toString();
                    r(smrVar, true);
                    s(smrVar, true);
                } catch (sas e4) {
                    this.f.e(9, e4.a, this.g.b(smrVar), smrVar, skoVar);
                    e4.toString();
                    s(smrVar, true);
                }
            }
        }
    }

    public final void n(smr smrVar) {
        spv spvVar = this.f;
        aixe aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLMENT_CANCELLED;
        srh srhVar = this.g;
        spvVar.f(aixeVar, smrVar, null, null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
        if (srhVar.s(smrVar)) {
            srhVar.a(smrVar).v = 4;
            s(smrVar, false);
        }
    }

    public final void o(skh skhVar, smr smrVar) {
        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_RECEIVED, smrVar, null, null, null, 0, null, null, skhVar, null, null, false);
    }

    public final void p(skh skhVar, smr smrVar) {
        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED, smrVar, null, null, null, 0, null, null, skhVar, null, null, false);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sao) it.next()).h(smrVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d2  */
    public final void q(List list) {
        int i;
        List list2;
        srh srhVar;
        smr smrVar;
        spv spvVar;
        sko skoVar;
        int i2;
        aixe aixeVar;
        skh skhVarB;
        aizg aizgVar;
        boolean z;
        sni sniVar;
        snl snlVar;
        int i3;
        List list3;
        aixz aixzVar;
        smr smrVar2;
        smb smbVar;
        SparseArray sparseArray = new SparseArray();
        Collections.sort(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sni sniVar2 = (sni) it.next();
            srh srhVar2 = this.g;
            smr smrVar3 = sniVar2.c;
            if (srhVar2.s(smrVar3)) {
                snk snkVar = sniVar2.b;
                if (!snkVar.d() || !srhVar2.a(smrVar3).l.contains(sniVar2)) {
                    if (srhVar2.z(smrVar3)) {
                        srhVar2.a(smrVar3).k.add(sniVar2);
                    } else {
                        snj snjVar = (snj) snkVar.getClass().getAnnotation(snj.class);
                        if (snjVar == null || sniVar2.e.e(snjVar.a())) {
                            srhVar2.a(smrVar3).l.add(sniVar2);
                            spv spvVar2 = this.f;
                            aixe aixeVar2 = aixe.ADS_CLIENT_EVENT_TYPE_TRIGGER_ACTIVATED;
                            skh skhVarB2 = srhVar2.b(smrVar3);
                            if (spvVar2.b.ah()) {
                                spvVar2.f(aixeVar2, smrVar3, sniVar2.d, sniVar2, null, 0, null, null, skhVarB2, null, null, false);
                            }
                            int i4 = sniVar2.a;
                            List arrayList = (List) sparseArray.get(i4);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                sparseArray.put(i4, arrayList);
                            }
                            arrayList.add(sniVar2);
                        } else {
                            rmp.m(smrVar3, sniVar2.d, "TriggerBundle doesn't have the required metadata specified by the trigger ".concat(String.valueOf(snkVar.a().name())));
                        }
                    }
                }
            }
        }
        int i5 = 2;
        if (sparseArray.get(0) != null) {
            for (sni sniVar3 : (List) sparseArray.get(0)) {
                sko skoVar2 = sniVar3.d;
                if (skoVar2 != null) {
                    snk snkVar2 = sniVar3.b;
                    agkj agkjVar = skoVar2.l;
                    if (agkjVar.containsKey(snkVar2)) {
                        List list4 = (List) agkjVar.get(snkVar2);
                        int i6 = 0;
                        while (i6 < list4.size()) {
                            aivk aivkVar = (aivk) list4.get(i6);
                            skj skjVar = null;
                            List list5 = list4;
                            try {
                                int i7 = i6;
                                try {
                                    try {
                                        list2 = list5;
                                        try {
                                            try {
                                                i = i7;
                                                try {
                                                    try {
                                                        skj skjVarA = this.p.a(sniVar3.c, skoVar2, sniVar3.e, aivkVar, snkVar2.a());
                                                        try {
                                                            this.t.d(skjVarA);
                                                            if ((aivkVar.b & 8) != 0) {
                                                                spv spvVar3 = this.f;
                                                                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_PING_DISPATCHED;
                                                                smr smrVar4 = sniVar3.c;
                                                                sko skoVar3 = sniVar3.d;
                                                                smb smbVar2 = new smb(i5, i, aivkVar, agev.h(skjVarA));
                                                                skhVarB = this.g.b(smrVar4);
                                                                aizgVar = null;
                                                                z = false;
                                                                sniVar = null;
                                                                snlVar = null;
                                                                i3 = 0;
                                                                list3 = null;
                                                                aixzVar = null;
                                                                spvVar = spvVar3;
                                                                smrVar2 = smrVar4;
                                                                skoVar = skoVar3;
                                                                smbVar = smbVar2;
                                                                spvVar.f(aixeVar, smrVar2, skoVar, sniVar, snlVar, i3, list3, smbVar, skhVarB, aixzVar, aizgVar, z);
                                                            }
                                                        } catch (sat e) {
                                                            e = e;
                                                            skjVar = skjVarA;
                                                            spv spvVar4 = this.f;
                                                            int i8 = e.b;
                                                            srhVar = this.g;
                                                            smrVar = sniVar3.c;
                                                            skh skhVarB3 = srhVar.b(smrVar);
                                                            sko skoVar4 = sniVar3.d;
                                                            spvVar = spvVar4;
                                                            spvVar.e(13, i8, skhVarB3, smrVar, skoVar4);
                                                            skoVar = skoVar4;
                                                            i2 = e.a;
                                                            if ((aivkVar.b & 8) != 0) {
                                                                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_PING_DISPATCHED;
                                                                smb smbVar3 = new smb(i2, i, aivkVar, agev.h(skjVar));
                                                                skhVarB = srhVar.b(smrVar);
                                                                aizgVar = null;
                                                                z = false;
                                                                sniVar = null;
                                                                snlVar = null;
                                                                i3 = 0;
                                                                list3 = null;
                                                                aixzVar = null;
                                                                smrVar2 = smrVar;
                                                                smbVar = smbVar3;
                                                            }
                                                            i6 = i + 1;
                                                            list4 = list2;
                                                            i5 = 2;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            skjVar = skjVarA;
                                                            if ((aivkVar.b & 8) != 0) {
                                                                spv spvVar5 = this.f;
                                                                aixe aixeVar3 = aixe.ADS_CLIENT_EVENT_TYPE_PING_DISPATCHED;
                                                                smr smrVar5 = sniVar3.c;
                                                                spvVar5.f(aixeVar3, smrVar5, sniVar3.d, null, null, 0, null, new smb(1, i, aivkVar, agev.h(skjVar)), this.g.b(smrVar5), null, null, false);
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                } catch (sat e2) {
                                                    e = e2;
                                                }
                                            } catch (sat e3) {
                                                e = e3;
                                                i = i7;
                                                spv spvVar6 = this.f;
                                                int i9 = e.b;
                                                srhVar = this.g;
                                                smrVar = sniVar3.c;
                                                skh skhVarB4 = srhVar.b(smrVar);
                                                sko skoVar5 = sniVar3.d;
                                                spvVar = spvVar6;
                                                spvVar.e(13, i9, skhVarB4, smrVar, skoVar5);
                                                skoVar = skoVar5;
                                                i2 = e.a;
                                                if ((aivkVar.b & 8) != 0) {
                                                    aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_PING_DISPATCHED;
                                                    smb smbVar4 = new smb(i2, i, aivkVar, agev.h(skjVar));
                                                    skhVarB = srhVar.b(smrVar);
                                                    aizgVar = null;
                                                    z = false;
                                                    sniVar = null;
                                                    snlVar = null;
                                                    i3 = 0;
                                                    list3 = null;
                                                    aixzVar = null;
                                                    smrVar2 = smrVar;
                                                    smbVar = smbVar4;
                                                    spvVar.f(aixeVar, smrVar2, skoVar, sniVar, snlVar, i3, list3, smbVar, skhVarB, aixzVar, aizgVar, z);
                                                }
                                                i6 = i + 1;
                                                list4 = list2;
                                                i5 = 2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                i = i7;
                                                if ((aivkVar.b & 8) != 0) {
                                                    spv spvVar7 = this.f;
                                                    aixe aixeVar4 = aixe.ADS_CLIENT_EVENT_TYPE_PING_DISPATCHED;
                                                    smr smrVar6 = sniVar3.c;
                                                    spvVar7.f(aixeVar4, smrVar6, sniVar3.d, null, null, 0, null, new smb(1, i, aivkVar, agev.h(skjVar)), this.g.b(smrVar6), null, null, false);
                                                }
                                                throw th;
                                            }
                                        } catch (sat e4) {
                                            e = e4;
                                            i = i7;
                                            spv spvVar8 = this.f;
                                            int i10 = e.b;
                                            srhVar = this.g;
                                            smrVar = sniVar3.c;
                                            skh skhVarB5 = srhVar.b(smrVar);
                                            sko skoVar6 = sniVar3.d;
                                            spvVar = spvVar8;
                                            spvVar.e(13, i10, skhVarB5, smrVar, skoVar6);
                                            skoVar = skoVar6;
                                            i2 = e.a;
                                            if ((aivkVar.b & 8) != 0) {
                                                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_PING_DISPATCHED;
                                                smb smbVar5 = new smb(i2, i, aivkVar, agev.h(skjVar));
                                                skhVarB = srhVar.b(smrVar);
                                                aizgVar = null;
                                                z = false;
                                                sniVar = null;
                                                snlVar = null;
                                                i3 = 0;
                                                list3 = null;
                                                aixzVar = null;
                                                smrVar2 = smrVar;
                                                smbVar = smbVar5;
                                                spvVar.f(aixeVar, smrVar2, skoVar, sniVar, snlVar, i3, list3, smbVar, skhVarB, aixzVar, aizgVar, z);
                                            }
                                            i6 = i + 1;
                                            list4 = list2;
                                            i5 = 2;
                                        }
                                    } catch (sat e5) {
                                        e = e5;
                                        list2 = list5;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    i = i7;
                                }
                            } catch (sat e6) {
                                e = e6;
                                i = i6;
                                list2 = list5;
                            } catch (Throwable th5) {
                                th = th5;
                                i = i6;
                            }
                            i6 = i + 1;
                            list4 = list2;
                            i5 = 2;
                        }
                    }
                }
                rmp.m(sniVar3.c, sniVar3.d, "Ping migration no associated ping bindings for activated trigger: ".concat(String.valueOf(sniVar3.b.a().name())));
                i5 = 2;
            }
        }
        if (sparseArray.get(1) != null) {
            z((List) sparseArray.get(1), 0);
        }
        if (sparseArray.get(2) != null) {
            z((List) sparseArray.get(2), 2);
        }
        if (sparseArray.get(3) != null) {
            z((List) sparseArray.get(3), 3);
        }
        if (sparseArray.get(5) != null) {
            z((List) sparseArray.get(5), 6);
        }
        if (sparseArray.get(6) != null) {
            Iterator it2 = ((List) sparseArray.get(6)).iterator();
            while (it2.hasNext()) {
                s(((sni) it2.next()).c, false);
            }
        }
        if (sparseArray.get(7) != null) {
            for (sni sniVar4 : (List) sparseArray.get(7)) {
                srh srhVar3 = this.g;
                smr smrVar7 = sniVar4.c;
                if (srhVar3.s(smrVar7)) {
                    int i11 = srhVar3.a(smrVar7).v;
                    if (i11 != 1 && i11 != 2) {
                        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_FULFILL_SLOT_REQUESTED, smrVar7, null, null, null, 0, null, null, srhVar3.b(smrVar7), null, null, false);
                        rsl rslVarA = srhVar3.a(smrVar7);
                        if (rslVarA.v != 0) {
                            srh.A(rslVarA, "markFillRequested");
                        }
                        rslVarA.v = 1;
                        rslVarA.o.b();
                    }
                } else {
                    this.f.d(5, 18, srhVar3.b(smrVar7), smrVar7);
                }
            }
        }
        if (sparseArray.get(8) != null) {
            for (sni sniVar5 : (List) sparseArray.get(8)) {
                srh srhVar4 = this.g;
                smr smrVar8 = sniVar5.c;
                if (!srhVar4.y(smrVar8) && !srhVar4.x(smrVar8)) {
                    this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_ENTER_SLOT_REQUESTED, smrVar8, null, null, null, 0, null, null, srhVar4.b(smrVar8), null, null, false);
                    Iterator it3 = this.i.iterator();
                    while (it3.hasNext()) {
                        ((sal) it3.next()).d(smrVar8);
                    }
                    try {
                        srhVar4.o(smrVar8);
                        srh srhVar5 = this.g;
                        smr smrVar9 = sniVar5.c;
                        shh shhVar = sniVar5.e;
                        rsl rslVarA2 = srhVar5.a(smrVar9);
                        if (!rslVarA2.e()) {
                            srh.B(rslVarA2, "requestEnterSlot");
                        }
                        rslVarA2.u = 2;
                        if (!smrVar9.j) {
                            rslVarA2.p.a(shhVar);
                        }
                        Iterator it4 = this.i.iterator();
                        while (it4.hasNext()) {
                            ((sal) it4.next()).e(smrVar9);
                        }
                    } catch (sau e7) {
                        spv spvVar9 = this.f;
                        srh srhVar6 = this.g;
                        smr smrVar10 = sniVar5.c;
                        spvVar9.d(7, e7.a, srhVar6.b(smrVar10), smrVar10);
                        e7.toString();
                        s(smrVar10, true);
                    }
                }
            }
        }
    }

    public final void r(smr smrVar, boolean z) {
        srh srhVar = this.g;
        srhVar.a(smrVar).r = false;
        if (z) {
            return;
        }
        if (!smrVar.j) {
            rsl rslVarA = srhVar.a(smrVar);
            ArrayList arrayList = new ArrayList();
            List list = rslVarA.k;
            arrayList.addAll(list);
            list.clear();
            q(arrayList);
            return;
        }
        rsl rslVarA2 = srhVar.a(smrVar);
        ArrayList arrayList2 = new ArrayList();
        if (rslVarA2 == null) {
            rmp.k(smrVar, "Slot state is null when trying to get and clear deferred server triggers.");
        } else {
            List list2 = rslVarA2.m;
            arrayList2.addAll(list2);
            list2.clear();
        }
        i(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void s(smr smrVar, boolean z) {
        boolean z2;
        sau sauVar;
        srh srhVar = this.g;
        if (srhVar.s(smrVar)) {
            if (srhVar.a(smrVar).g() || srhVar.a(smrVar).u == 5) {
                srhVar.g(smrVar);
                if (!z) {
                    return;
                } else {
                    z2 = true;
                }
            } else {
                z2 = z;
            }
            if (srhVar.x(smrVar) || srhVar.y(smrVar)) {
                this.g.g(smrVar);
                w(smrVar, z2);
                return;
            }
            if (srhVar.a(smrVar).b()) {
                srhVar.g(smrVar);
                int i = 6;
                try {
                    try {
                        this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_CANCEL_SLOT_FULFILLMENT_REQUESTED, smrVar, null, null, null, 0, null, null, srhVar.b(smrVar), null, null, z2);
                        rsl rslVarA = srhVar.a(smrVar);
                        if (rslVarA == null) {
                            throw new sau("Couldn't cancel fill request due to null slot", 5);
                        }
                        if (rslVarA.o == null) {
                            throw new sau("Couldn't cancel fill request due to null fulfillment adapter", 6);
                        }
                        try {
                            srhVar.a(smrVar).v = 3;
                            rvr rvrVar = rslVarA.o.i;
                            if (!rvrVar.b) {
                                smr smrVar2 = rvrVar.a;
                                rmp.j(smrVar2, "Tried to cancel task when nothing had been initiated");
                                rvrVar.d.n(smrVar2);
                                return;
                            }
                            rvp rvpVar = rvrVar.c;
                            if (rvpVar != null) {
                                rvpVar.a = true;
                                rvpVar.b.cancel(false);
                                return;
                            } else {
                                smr smrVar3 = rvrVar.a;
                                rmp.j(smrVar3, "Tried to cancel task when the task was synchronous");
                                rvrVar.d.n(smrVar3);
                                return;
                            }
                        } catch (sau e) {
                            sauVar = e;
                            i = 6;
                        }
                    } catch (sau e2) {
                        e = e2;
                        i = 6;
                        sauVar = e;
                    }
                } catch (sau e3) {
                    e = e3;
                }
                this.f.f(aixe.ADS_CLIENT_EVENT_TYPE_ERROR, smrVar, null, null, null, 0, null, null, this.g.b(smrVar), spv.b(i, sauVar.a), null, true);
                sauVar.toString();
                return;
            }
            boolean z3 = z2;
            sko skoVarC = srhVar.c(smrVar);
            skh skhVarB = srhVar.b(smrVar);
            if (skoVarC != null) {
                spv spvVar = this.f;
                spvVar.f(aixe.ADS_CLIENT_EVENT_TYPE_UNSCHEDULE_LAYOUT_REQUESTED, smrVar, skoVarC, null, null, 0, null, null, skhVarB, null, null, false);
                spvVar.f(aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_UNSCHEDULED, smrVar, skoVarC, null, null, 0, null, null, skhVarB, null, null, false);
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((sak) it.next()).w(skoVarC);
                }
            }
            spv spvVar2 = this.f;
            spvVar2.f(aixe.ADS_CLIENT_EVENT_TYPE_UNSCHEDULE_SLOT_REQUESTED, smrVar, null, null, null, 0, null, null, skhVarB, null, null, z3);
            if (smrVar.j) {
                rsl rslVarA2 = srhVar.a(smrVar);
                if (rslVarA2 != null) {
                    Optional optional = smrVar.k;
                    rbj rbjVar = new rbj(rslVarA2, 18);
                    if (true == optional.isPresent()) {
                        Object obj = optional.get();
                        aizs aizsVar = (aizs) obj;
                        scr scrVar = (scr) ((rsl) rbjVar.a).h.remove(aizsVar.d);
                        if (scrVar != null) {
                            scrVar.u(aizsVar);
                        }
                    }
                    agke agkeVar = smrVar.l;
                    int size = agkeVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        aizs aizsVar2 = (aizs) agkeVar.get(i2);
                        scr scrVar2 = (scr) rslVarA2.j.remove(aizsVar2.d);
                        if (scrVar2 != null) {
                            scrVar2.u(aizsVar2);
                        }
                    }
                    if (srhVar.r(smrVar)) {
                        agqs agqsVarListIterator = rslVarA2.t.b().listIterator(0);
                        while (agqsVarListIterator.hasNext()) {
                            aizs aizsVar3 = (aizs) agqsVarListIterator.next();
                            scr scrVar3 = (scr) rslVarA2.i.remove(aizsVar3.d);
                            if (scrVar3 != null) {
                                scrVar3.u(aizsVar3);
                            }
                        }
                    }
                    ryj ryjVar = rslVarA2.w;
                    if (ryjVar != null) {
                        ryjVar.t();
                    }
                    rslVarA2.w = null;
                }
            } else {
                rsl rslVarA3 = srhVar.a(smrVar);
                if (rslVarA3 != null) {
                    agke agkeVar2 = smrVar.d;
                    int i3 = ((agpi) agkeVar2).d;
                    for (int i4 = 0; i4 < i3; i4++) {
                        snk snkVar = (snk) agkeVar2.get(i4);
                        scg scgVar = (scg) rslVarA3.d.remove(snkVar.b());
                        if (scgVar != null) {
                            scgVar.A(snkVar);
                        }
                    }
                    agke agkeVar3 = smrVar.e;
                    int i5 = ((agpi) agkeVar3).d;
                    for (int i6 = 0; i6 < i5; i6++) {
                        snk snkVar2 = (snk) agkeVar3.get(i6);
                        scg scgVar2 = (scg) rslVarA3.e.remove(snkVar2.b());
                        if (scgVar2 != null) {
                            scgVar2.A(snkVar2);
                        }
                    }
                    agke agkeVar4 = smrVar.f;
                    int i7 = ((agpi) agkeVar4).d;
                    for (int i8 = 0; i8 < i7; i8++) {
                        snk snkVar3 = (snk) agkeVar4.get(i8);
                        scg scgVar3 = (scg) rslVarA3.g.remove(snkVar3.b());
                        if (scgVar3 != null) {
                            scgVar3.A(snkVar3);
                        }
                    }
                    if (srhVar.r(smrVar)) {
                        sko skoVar = rslVarA3.t;
                        agqs agqsVarListIterator2 = skoVar.c().listIterator(0);
                        while (agqsVarListIterator2.hasNext()) {
                            snk snkVar4 = (snk) agqsVarListIterator2.next();
                            scg scgVar4 = (scg) rslVarA3.f.remove(snkVar4.b());
                            if (scgVar4 != null) {
                                scgVar4.A(snkVar4);
                            }
                        }
                        srhVar.n(skoVar);
                    }
                    rslVarA3.o = null;
                    rslVarA3.p = null;
                    rxj rxjVar = rslVarA3.q;
                    if (rxjVar != null) {
                        rxjVar.S();
                    }
                    rslVarA3.q = null;
                }
            }
            rsl rslVarA4 = srhVar.a(smrVar);
            if (rslVarA4 != null) {
                int i9 = rslVarA4.u;
                if (i9 != 0 && i9 != 1) {
                    srh.B(rslVarA4, "unregisterSlot");
                }
                rslVarA4.u = 0;
                srhVar.e(smrVar).remove(smrVar.a);
            }
            spvVar2.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED, smrVar, null, null, null, 0, null, null, skhVarB, null, null, z3);
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((sap) it2.next()).X(smrVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.tcq
    public final void t() {
        ArrayList<smr> arrayList = new ArrayList();
        srh srhVar = this.g;
        Iterator it = srhVar.h.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                arrayList.add(((rsl) it2.next()).a);
            }
        }
        for (smr smrVar : arrayList) {
            boolean zW = srhVar.w(smrVar);
            spv spvVar = this.f;
            if (zW) {
                spvVar.f(aixe.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, smrVar, srhVar.c(smrVar), null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
            } else {
                spvVar.f(aixe.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, smrVar, null, null, null, 0, null, null, srhVar.b(smrVar), null, null, false);
            }
        }
    }

    public final void u(smr smrVar, sko skoVar, sas sasVar, int i) {
        this.f.e(i, sasVar.a, this.g.b(smrVar), smrVar, skoVar);
        sasVar.toString();
        s(smrVar, true);
    }

    public final void v(smr smrVar, sau sauVar, int i) {
        this.f.d(i, sauVar.a, this.g.b(smrVar), smrVar);
        sauVar.toString();
        s(smrVar, true);
    }
}
