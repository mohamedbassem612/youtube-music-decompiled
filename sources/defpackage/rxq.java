package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, b = aixo.SLOT_TYPE_PLAYER_BYTES, c = {sjq.class}, d = {sid.class, sjy.class, sic.class})
public final class rxq implements rxj, rxw, rsq {
    private final sdo A;
    private final acm B;
    public final List a;
    public int b;
    private final rsr c;
    private final saq d;
    private final smr e;
    private final sko f;
    private final List g;
    private final wjf h;
    private final String i;
    private final Executor j;
    private final agev k;
    private final skh l;
    private final vyo m;
    private final awmd n;
    private final awmd o;
    private final awmd p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final slm t;
    private final Long u;
    private final abmt v;
    private final boolean w;
    private final rsk x;
    private final rsk y;
    private final rus z;

    /* JADX WARN: Code duplicated, block: B:15:0x008f  */
    public rxq(rsk rskVar, rsk rskVar2, rsr rsrVar, saq saqVar, rus rusVar, smr smrVar, sko skoVar, wjf wjfVar, Executor executor, acm acmVar, sdo sdoVar, vyo vyoVar, rmp rmpVar, awmd awmdVar, abmt abmtVar, awmd awmdVar2, awmd awmdVar3) {
        agev agevVarI;
        snh snhVar;
        this.x = rskVar;
        this.y = rskVar2;
        this.c = rsrVar;
        this.d = saqVar;
        this.z = rusVar;
        this.e = smrVar;
        this.f = skoVar;
        List list = (List) skoVar.d(sjq.class);
        this.g = list;
        this.h = wjfVar;
        this.i = (String) smrVar.d(sic.class);
        this.j = executor;
        this.a = new ArrayList(list.size());
        if (list.isEmpty()) {
            agevVarI = agdf.a;
        } else {
            int i = 0;
            if (((sko) list.get(0)).e(sjb.class)) {
                slb slbVar = (slb) ((sko) list.get(0)).d(sjb.class);
                agke agkeVar = smrVar.d;
                int i2 = ((agpi) agkeVar).d;
                while (true) {
                    if (i >= i2) {
                        snhVar = null;
                        break;
                    }
                    snk snkVar = (snk) agkeVar.get(i);
                    i++;
                    if (snkVar instanceof slk) {
                        long j = ((slk) snkVar).b.a;
                        snhVar = new snh((-15000) + j, j);
                        break;
                    }
                }
                agevVarI = snhVar == null ? agdf.a : agev.i(new eqq(this.z, slbVar, snhVar));
            } else {
                agevVarI = agdf.a;
            }
        }
        this.k = agevVarI;
        this.b = -1;
        this.l = skh.a(this.i, (wjf) smrVar.d(sid.class));
        this.B = acmVar;
        this.A = sdoVar;
        this.m = vyoVar;
        this.n = awmdVar;
        slm slmVarF = nrj.f(smrVar, skoVar);
        this.t = slmVarF;
        this.q = slmVarF.equals(slm.PRE_ROLL);
        this.r = slmVarF.equals(slm.MID_ROLL);
        this.s = slmVarF.equals(slm.POST_ROLL);
        this.w = sdi.c(vyoVar, slmVarF, wjfVar);
        this.u = nrj.p(smrVar, skoVar, vyoVar);
        this.v = abmtVar;
        this.o = awmdVar2;
        this.p = awmdVar3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    private final void A(int i) {
        boolean zCi;
        wjf wjfVar;
        this.c.h(this);
        this.b = -2;
        if (this.t == slm.PRE_ROLL) {
            if (i == 0 || i == 2) {
                zCi = this.v.ci();
                wjfVar = this.h;
                if (zCi) {
                    wjfVar.k().g();
                } else {
                    wjfVar.k().b("PREROLL_SHOWN", true);
                }
            } else if (i == 3) {
                i = 3;
                zCi = this.v.ci();
                wjfVar = this.h;
                if (zCi) {
                    wjfVar.k().g();
                } else {
                    wjfVar.k().b("PREROLL_SHOWN", true);
                }
            }
        }
        this.x.d(this.e, this.f, i);
    }

    private final boolean B() {
        try {
            return !((rxx) aguu.K(this.a)).a().e(sjb.class);
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    private final boolean C() {
        try {
            if (!D()) {
                return false;
            }
            List list = this.g;
            if (!((sko) list.get(this.b)).e(sjb.class)) {
                return false;
            }
            if (this.b != list.size() - 1) {
                for (int i = this.b + 1; i < list.size(); i++) {
                    if (((sko) list.get(i)).e(sjb.class)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    private final boolean D() {
        int i = this.b;
        return i >= 0 && i < this.g.size();
    }

    private final boolean E() {
        if (this.h.f().ac()) {
            if (!this.q) {
                return true;
            }
        } else if (!this.B.f() && !this.q) {
            vyo vyoVar = this.m;
            if (taq.aP(vyoVar) || taq.aQ(vyoVar)) {
                return true;
            }
        }
        return false;
    }

    private static String F(auzk auzkVar) {
        Object obj = auzkVar.b;
        if (obj == null) {
            return "no error details";
        }
        aosi aosiVar = (aosi) obj;
        int iBv = acfz.bv(aosiVar.c);
        if (iBv == 0) {
            iBv = 1;
        }
        return Integer.toString(iBv - 2) + ": " + aosiVar.d;
    }

    private final long v() {
        if (this.r) {
            smr smrVar = this.e;
            if (smrVar.e(sjf.class)) {
                return -((aopn) smrVar.d(sjf.class)).h;
            }
        }
        return 0L;
    }

    private static smc x(sko skoVar) {
        if (skoVar.e(sjb.class)) {
            return (smc) skoVar.d(sjb.class);
        }
        if (skoVar.e(sje.class)) {
            return (smc) skoVar.d(sje.class);
        }
        if (skoVar.e(sjc.class)) {
            return (smc) skoVar.d(sjc.class);
        }
        return null;
    }

    private final String y() {
        rxx rxxVar;
        smc smcVarX;
        int i = this.b;
        if (i >= 0) {
            List list = this.a;
            if (i < list.size() && (rxxVar = (rxx) list.get(this.b)) != null && (smcVarX = x(rxxVar.a())) != null) {
                return smcVarX.o;
            }
        }
        return null;
    }

    private final List z() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return arrayList;
            }
            rxx rxxVar = (rxx) list.get(i);
            if (rxxVar.a().e(sjb.class)) {
                abno abnoVarA = abnp.a();
                if (i > 0 && ((rxx) list.get(i - 1)).a().b == aixg.LAYOUT_TYPE_MEDIA_BREAK) {
                    abnoVarA.h(true);
                }
                wjf wjfVarC = ((slb) rxxVar.a().d(sjb.class)).c();
                String str = ((slb) rxxVar.a().d(sjb.class)).o;
                smr smrVar = this.e;
                arrayList.add(sdo.l(wjfVarC, str, (acfw) smrVar.d(sjy.class), abnoVarA.a(), nrj.i(smrVar, this.m)));
            }
            i++;
        }
    }

    @Override // defpackage.rxj
    public final void M() {
        if (this.t == slm.POST_ROLL) {
            this.j.execute(afwl.i(new rxn(this, 2)));
        } else {
            s();
        }
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        slb slbVar;
        smc smcVarX;
        String str = null;
        rxx rxxVar = D() ? (rxx) this.a.get(this.b) : null;
        if (rxxVar != null) {
            rxxVar.N(i);
        }
        if (this.w) {
            if (i != 4) {
                String strY = y();
                if (strY == null) {
                    List list = this.g;
                    if (!list.isEmpty() && (smcVarX = x((sko) list.get(list.size() - 1))) != null) {
                        str = smcVarX.o;
                    }
                } else {
                    str = strY;
                }
                if (str != null) {
                    auzk auzkVarB = ((rug) this.p.io()).b(str, this.i);
                    if (!auzkVarB.a) {
                        rmp.n(this.e, "skipClip failed: ".concat(F(auzkVarB)));
                    }
                }
            } else {
                i = 4;
            }
            A(i);
            return;
        }
        vyo vyoVar = this.m;
        wjf wjfVar = this.h;
        boolean z = this.q;
        boolean z2 = this.r;
        boolean z3 = this.s;
        if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), z, z2, z3, false)) {
            if (i != 4) {
                ArrayList arrayList = new ArrayList();
                for (rxx rxxVar2 : this.a) {
                    if (rxxVar2.a().e(sjb.class) && (slbVar = (slb) rxxVar2.a().d(sjb.class)) != null) {
                        arrayList.add(slbVar.o);
                    }
                }
                try {
                    abmt abmtVar = this.v;
                    boolean z4 = true;
                    if (((abmtVar.az() && z) || (abmtVar.ay() && z2)) && C()) {
                        smr smrVar = this.e;
                        acfw acfwVar = (acfw) smrVar.d(sjy.class);
                        if (i == 0) {
                            z4 = false;
                        } else if (i == 2) {
                            z4 = false;
                            i = 2;
                        }
                        sdo.k(acfwVar, z4, z2, false, (String[]) arrayList.toArray(new String[0]));
                        if (i == 2) {
                            sdo.j((acfw) smrVar.d(sjy.class));
                        }
                    } else {
                        acfw acfwVar2 = (acfw) this.e.d(sjy.class);
                        if (i == 0 && !z3) {
                            z4 = false;
                        }
                        sdo.k(acfwVar2, z4, z2, z3, (String[]) arrayList.toArray(new String[0]));
                    }
                } catch (rso e) {
                    rmp.n(this.e, e.toString());
                }
            } else {
                i = 4;
            }
        }
        A(i);
    }

    @Override // defpackage.rxj
    public final void S() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            this.y.h(this.l, this.e, (sko) it.next());
        }
        this.c.h(this);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rxj
    public final void b() throws Throwable {
        if (this.w) {
            String str = this.i;
            rsk rskVar = this.x;
            smr smrVar = this.e;
            if (nrj.o(str, rskVar, smrVar, this.f)) {
                try {
                    rug rugVar = (rug) this.p.io();
                    wjf wjfVar = this.h;
                    long jLongValue = this.u.longValue();
                    List list = this.g;
                    vyo vyoVar = this.m;
                    sdi.f(rugVar, smrVar, str, wjfVar, jLongValue, list, !nrj.i(smrVar, vyoVar), this.t, (spv) this.o.io(), vyoVar);
                    if (!list.isEmpty()) {
                        t();
                    }
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((rxx) it.next()).b();
                    }
                    Iterator it2 = this.g.iterator();
                    while (it2.hasNext()) {
                        this.y.g(this.l, this.e, (sko) it2.next());
                    }
                    if (this.k.g()) {
                        this.c.e(this);
                        return;
                    }
                    return;
                } catch (sas e) {
                    this.x.u(this.e, this.f, e, 9);
                    return;
                }
            }
            return;
        }
        vyo vyoVar2 = this.m;
        wjf wjfVar2 = this.h;
        boolean z = this.q;
        boolean z2 = this.r;
        boolean z3 = this.s;
        if (taq.at(vyoVar2, wjfVar2.V(), wjfVar2.P(), z, z2, z3, false) && E()) {
            try {
                List listZ = z();
                if (!listZ.isEmpty()) {
                    t();
                }
                if (taq.aU(vyoVar2)) {
                    spv spvVar = (spv) this.o.io();
                    aihf aihfVarCreateBuilder = aizg.a.createBuilder();
                    aixn aixnVar = aixn.RENDERING_EVENT_TYPE_SEGMENT_INSERTED_QUEUE_AHEAD;
                    aihfVarCreateBuilder.copyOnWrite();
                    aizg aizgVar = (aizg) aihfVarCreateBuilder.instance;
                    aizgVar.e = aixnVar.C;
                    aizgVar.b |= 1;
                    spvVar.a((aizg) aihfVarCreateBuilder.build(), this.l, this.e, this.f);
                }
                acfw acfwVar = (acfw) this.e.d(sjy.class);
                this.A.h(acfwVar, (z3 && taq.aQ(vyoVar2)) ? acfwVar.b() : this.u.longValue(), B(), v(), (aciw[]) listZ.toArray(new aciw[0]));
            } catch (rso e2) {
                List list2 = this.a;
                if (list2.get(0) != null) {
                    ((rxx) list2.get(0)).a();
                    w(new sas(e2.getMessage(), e2.a), 9);
                    return;
                }
                return;
            }
        }
        Iterator it3 = this.a.iterator();
        while (it3.hasNext()) {
            ((rxx) it3.next()).b();
        }
        Iterator it4 = this.g.iterator();
        while (it4.hasNext()) {
            this.y.g(this.l, this.e, (sko) it4.next());
        }
        if (this.k.g()) {
            this.c.e(this);
        }
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        if (!TextUtils.equals(str, this.i)) {
            if (this.b >= 0) {
                this.a.size();
            }
        } else {
            agev agevVar = this.k;
            if (agevVar.g() && this.b == -1) {
                ((eqq) agevVar.c()).c(j);
            }
        }
    }

    public final void s() {
        this.b++;
        if (!D()) {
            this.d.ab(this.f, 0);
            return;
        }
        rxx rxxVar = (rxx) this.a.get(this.b);
        if (this.b == 0) {
            this.x.b(this.e, this.f);
        }
        rxxVar.M();
        if (this.w) {
            return;
        }
        vyo vyoVar = this.m;
        wjf wjfVar = this.h;
        if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.q, this.r, this.s, false) && this.b == 0 && !E()) {
            if (this.B.f() || wjfVar.f().ac()) {
                try {
                    List listZ = z();
                    if (!listZ.isEmpty()) {
                        t();
                    }
                    if (taq.aU(vyoVar)) {
                        spv spvVar = (spv) this.o.io();
                        aihf aihfVarCreateBuilder = aizg.a.createBuilder();
                        aixn aixnVar = aixn.RENDERING_EVENT_TYPE_SEGMENT_INSERTED_CURRENT_TIME;
                        aihfVarCreateBuilder.copyOnWrite();
                        aizg aizgVar = (aizg) aihfVarCreateBuilder.instance;
                        aizgVar.e = aixnVar.C;
                        aizgVar.b |= 1;
                        spvVar.a((aizg) aihfVarCreateBuilder.build(), this.l, this.e, this.f);
                    }
                    this.A.i((acfw) this.e.d(sjy.class), B(), v(), (aciw[]) listZ.toArray(new aciw[0]));
                } catch (rso e) {
                    List list = this.a;
                    if (list.get(0) != null) {
                        ((rxx) list.get(0)).a();
                        w(new sas(e.getMessage(), e.a), 10);
                    }
                    this.B.d();
                }
            }
        }
    }

    @Override // defpackage.rxw
    public final void t() {
        boolean z = this.w;
        int i = this.b;
        boolean z2 = true;
        if (!z ? i != 0 : i != -1) {
            z2 = false;
        }
        if (this.q && z2) {
            ((run) this.n.io()).s();
        }
    }

    @Override // defpackage.rxw
    public final void u(sko skoVar, int i) {
        aixl aixlVarA;
        if (!D()) {
            this.x.u(this.e, this.f, new sas("Exited subLayout when currIndex not valid", 39), 11);
            return;
        }
        String str = skoVar.a;
        List list = this.g;
        if (!TextUtils.equals(str, ((sko) list.get(this.b)).a)) {
            this.x.u(this.e, this.f, new sas("Exited subLayout when a different subLayout was anticipated to be playing", 47), 11);
            return;
        }
        vyo vyoVar = this.m;
        if (taq.al(vyoVar) && (aixlVarA = nrk.a(i)) != aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_UNSPECIFIED) {
            smc smcVarX = x(skoVar);
            String str2 = smcVarX != null ? smcVarX.o : "";
            nrk.b((spv) this.o.io(), this.e, skh.b(this.i, this.h, str2), aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_TERMINATION_EVENTS, aixlVarA, this.f);
        }
        if (i == 1) {
            this.x.u(this.e, this.f, new sas("Unexpected layoutExitReason: 1", 40), 11);
            return;
        }
        if (i != 2) {
            int i2 = this.b + 1;
            List list2 = this.g;
            boolean z = this.w;
            int size = list2.size();
            if (z && i2 < size) {
                aixg aixgVar = skoVar.b;
                aixg aixgVar2 = aixg.LAYOUT_TYPE_MEDIA_BREAK;
                if (aixgVar == aixgVar2 || ((sko) list2.get(this.b + 1)).b == aixgVar2) {
                    String strY = y();
                    smc smcVarX2 = x((sko) list2.get(this.b + 1));
                    String str3 = smcVarX2 != null ? smcVarX2.o : null;
                    if (strY != null && str3 != null) {
                        auzk auzkVarB = ((rug) this.p.io()).b(strY, str3);
                        if (!auzkVarB.a) {
                            rmp.n(this.e, "skipClip failed: ".concat(F(auzkVarB)));
                        }
                    }
                }
            }
            s();
            return;
        }
        smc smcVarX3 = x(skoVar);
        int iIJ = smcVarX3 != null ? smcVarX3.iJ() : 0;
        String strY2 = y();
        while (this.b < list.size() - 1) {
            List list3 = this.a;
            int i3 = this.b + 1;
            this.b = i3;
            rxx rxxVar = (rxx) list3.get(i3);
            smc smcVarX4 = x(rxxVar.a());
            if (smcVarX4 == null) {
                this.x.u(this.e, this.f, new sas("SubLayout does not have a valid PlayerAd", 41), 10);
                return;
            }
            if (smcVarX4.iI() == iIJ) {
                if (!this.w) {
                    wjf wjfVar = this.h;
                    boolean z2 = this.q;
                    boolean z3 = this.r;
                    boolean z4 = this.s;
                    if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), z2, z3, z4, false) && strY2 != null) {
                        try {
                            sdo.k((acfw) this.e.d(sjy.class), true, false, z4, strY2);
                        } catch (rso e) {
                            rmp.n(this.e, e.toString());
                        }
                    }
                } else if (strY2 != null) {
                    auzk auzkVarB2 = ((rug) this.p.io()).b(strY2, smcVarX4.o);
                    if (!auzkVarB2.a) {
                        rmp.n(this.e, "skipClip failed: ".concat(F(auzkVarB2)));
                    }
                }
                rxxVar.M();
                return;
            }
        }
        if (!this.w) {
            this.x.u(this.e, this.f, new sas("Skip-to-index was requested but target index was not found", 42), 10);
            return;
        }
        if (strY2 != null) {
            auzk auzkVarB3 = ((rug) this.p.io()).b(strY2, this.i);
            if (!auzkVarB3.a) {
                rmp.n(this.e, "skipClip failed: ".concat(F(auzkVarB3)));
            }
        }
        A(2);
    }

    @Override // defpackage.rxw
    public final void w(sas sasVar, int i) {
        this.x.u(this.e, this.f, sasVar, i);
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }
}
