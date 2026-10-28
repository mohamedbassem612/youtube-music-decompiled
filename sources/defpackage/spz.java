package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class spz extends spx implements rsd {
    public final smc b;
    public final sga c;
    public boolean d;
    public aaxo e;
    public final snz f;
    public final zdj g;
    private final int h;
    private boolean i;
    private int j;
    private int k;
    private PriorityQueue l;
    private PriorityQueue m;
    private vxe n;
    private avmn o;
    private final vyo p;

    public spz(sgv sgvVar, snz snzVar, smc smcVar, String str, aaxo aaxoVar, adws adwsVar, zdj zdjVar, sga sgaVar, int i, vxe vxeVar, Long l, slm slmVar, vyo vyoVar) {
        sgvVar.getClass();
        this.f = snzVar;
        smcVar.getClass();
        this.b = smcVar;
        this.g = zdjVar;
        this.k = -1;
        PriorityQueue priorityQueue = new PriorityQueue(smcVar.ab().size() + 1, a);
        for (aivk aivkVar : smcVar.ab()) {
            if (aivkVar.d >= 0) {
                priorityQueue.add(aivkVar);
            }
        }
        this.l = priorityQueue;
        this.m = this.b.p() == null ? new PriorityQueue() : (PriorityQueue) Collection.EL.stream(this.b.p().j).flatMap(new rhk(this, 14)).filter(new mob(this.k, 3)).collect(Collectors.toCollection(new ieu(13)));
        this.e = aaxoVar;
        this.c = sgaVar;
        this.h = i;
        this.n = vxeVar;
        this.p = vyoVar;
        sgaVar.e(smcVar.i, str);
        sgaVar.d(l, slmVar);
        sgaVar.e = new skm(smcVar);
        sgaVar.b = this.e;
        if (zdjVar != null) {
            zdjVar.b = this;
        }
        this.o = adwsVar.b().ak(new rlb(this, 20));
    }

    private final void D() {
        zdj zdjVar = this.g;
        ofg ofgVarM = zdjVar != null ? zdjVar.m() : null;
        snz snzVar = this.f;
        smc smcVar = this.b;
        snzVar.e(smcVar.X());
        C(smcVar.ae(), ofgVarM);
        if (smcVar.p() != null) {
            A(smcVar.p().b, ofgVarM, this.c);
        }
    }

    private final boolean E() {
        aivy aivyVar = this.b.n.d.p;
        if (aivyVar == null) {
            aivyVar = aivy.a;
        }
        return aivyVar.b;
    }

    public final void A(List list, ofg ofgVar, sga sgaVar) {
        B(list, sgaVar.c(ofgVar));
    }

    public final void B(List list, zzi... zziVarArr) {
        if (this.n == null || list.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        if (zziVarArr.length != 0) {
            map.put("MacrosConverters.CustomConvertersKey", zziVarArr);
        }
        yno.eA(this.n, list, map);
    }

    public final boolean C(List list, ofg ofgVar) {
        return this.f.d(list, this.c.c(ofgVar));
    }

    @Override // defpackage.rsd
    public final ogm a() {
        int iA = this.b.a() * 1000;
        int i = this.k;
        abnr abnrVar = this.e.a;
        return new ogm(iA, i, abnrVar == abnr.FULLSCREEN, abnrVar == abnr.BACKGROUND);
    }

    @Override // defpackage.rsd
    public final Set b(ogj ogjVar) {
        return zzj.b(sng.b(this.b, ogjVar), this.c.a);
    }

    @Override // defpackage.rsd
    public final void c(ofg ofgVar) {
        smc smcVar = this.b;
        C(smcVar.L(), ofgVar);
        if (smcVar.p() != null) {
            aivd aivdVar = smcVar.p().m;
            if (aivdVar == null) {
                aivdVar = aivd.a;
            }
            A(aivdVar.b, ofgVar, this.c);
        }
    }

    @Override // defpackage.rsd
    public final void d(ofg ofgVar) {
        smc smcVar = this.b;
        C(smcVar.M(), ofgVar);
        if (smcVar.p() != null) {
            aivd aivdVar = smcVar.p().m;
            if (aivdVar == null) {
                aivdVar = aivd.a;
            }
            A(aivdVar.c, ofgVar, this.c);
        }
    }

    @Override // defpackage.rsd
    public final void e(ofg ofgVar) {
        smc smcVar = this.b;
        C(smcVar.N(), ofgVar);
        if (smcVar.p() != null) {
            A(smcVar.p().p, ofgVar, this.c);
        }
    }

    @Override // defpackage.rsd
    public final void f(ofg ofgVar) {
        smc smcVar = this.b;
        C(smcVar.O(), ofgVar);
        if (smcVar.p() != null) {
            A(smcVar.p().o, ofgVar, this.c);
        }
    }

    @Override // defpackage.rsd
    public final void g(ofg ofgVar) {
        smc smcVar = this.b;
        C(smcVar.P(), ofgVar);
        if (smcVar.p() != null) {
            A(smcVar.p().n, ofgVar, this.c);
        }
    }

    @Override // defpackage.spx
    public final sga h() {
        return this.c;
    }

    @Override // defpackage.spx
    public final String i() {
        return this.b.o;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.spx
    public final void k() {
        if (this.i || !this.d) {
            return;
        }
        zdj zdjVar = this.g;
        ofg ofgVarI = zdjVar != null ? zdjVar.i() : null;
        smc smcVar = this.b;
        if (smcVar.p() != null) {
            A(smcVar.p().r, ofgVarI, this.c);
        }
        snz snzVar = this.f;
        List listK = smcVar.K();
        sga sgaVar = this.c;
        snzVar.d(listK, sgaVar.c(ofgVarI), sgaVar);
    }

    @Override // defpackage.spx
    public final void l(sgm sgmVar) {
        if (this.i) {
            return;
        }
        this.i = true;
        if (sgmVar == sgm.VIDEO_ENDED || sgmVar == sgm.SURVEY_ENDED) {
            sga sgaVar = this.c;
            sgaVar.c = false;
            smc smcVar = this.b;
            sgaVar.d = TimeUnit.SECONDS.toMillis(smcVar.a());
            zdj zdjVar = this.g;
            sfy sfyVarC = sgaVar.c(zdjVar != null ? ((ofj) zdjVar.a).a.n(null) : null);
            while (!this.l.isEmpty()) {
                this.f.c((aivk) this.l.poll(), sfyVarC);
            }
            while (!this.m.isEmpty()) {
                this.n.c(((sme) this.m.poll()).b, null);
            }
            C(smcVar.S(), zdjVar != null ? zdjVar.j() : null);
            this.j = 5;
        }
        if (sgmVar == sgm.AD_VIDEO_TIMEOUT) {
            sfw sfwVar = new sfw(new sfv(sfu.VIDEO_PLAYBACK_ERROR_LOAD_TIMEOUT, "ad.loadtimeout.fatal"));
            snz snzVar = this.f;
            smc smcVar2 = this.b;
            snzVar.d(smcVar2.U(), sfwVar);
            if (smcVar2.p() != null) {
                B(smcVar2.p().c, new zzi[0]);
            }
        }
    }

    @Override // defpackage.spx
    public final void m(int i, int i2) {
        zdj zdjVar = this.g;
        ofg ofgVarQ = zdjVar != null ? zdjVar.q() : null;
        sgd sgdVar = new sgd(i, i2);
        sga sgaVar = this.c;
        vyo vyoVar = this.p;
        sfy sfyVarC = sgaVar.c(ofgVarQ);
        aizx aizxVar = vyoVar.b().o;
        if (aizxVar == null) {
            aizxVar = aizx.a;
        }
        boolean z = aizxVar.T && this.e.a == abnr.FULLSCREEN;
        aizx aizxVar2 = vyoVar.b().o;
        if (aizxVar2 == null) {
            aizxVar2 = aizx.a;
        }
        boolean z2 = aizxVar2.U && this.e.a == abnr.DEFAULT;
        snz snzVar = this.f;
        smc smcVar = this.b;
        snzVar.d(smcVar.ad(), sgdVar, sfyVarC);
        if (smcVar.p() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(smcVar.p().f);
            if (z) {
                arrayList.addAll(smcVar.p().g);
            }
            if (z2) {
                arrayList.addAll(smcVar.p().h);
            }
            B(arrayList, sgdVar, sfyVarC);
        }
    }

    @Override // defpackage.spx
    public final void o() {
        snz snzVar = this.f;
        smc smcVar = this.b;
        snzVar.e(smcVar.Q());
        if (smcVar.p() != null) {
            B(smcVar.p().k, new zzi[0]);
        }
    }

    @Override // defpackage.spx
    public final void p(zhz zhzVar) {
        sfw sfwVar = new sfw(sfv.d(zhzVar));
        if (this.j != 5) {
            snz snzVar = this.f;
            smc smcVar = this.b;
            snzVar.d(smcVar.R(), sfwVar);
            snzVar.d(smcVar.U(), sfwVar);
            if (smcVar.p() != null) {
                B(smcVar.p().c, sfwVar);
            }
            this.j = 5;
        }
    }

    @Override // defpackage.spx
    public final void r() {
        snz snzVar = this.f;
        smc smcVar = this.b;
        snzVar.e(smcVar.Y());
        aizx aizxVar = this.p.b().o;
        if (aizxVar == null) {
            aizxVar = aizx.a;
        }
        boolean z = aizxVar.V && this.e.a == abnr.DEFAULT;
        if (smcVar.p() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(smcVar.p().s);
            if (z) {
                arrayList.addAll(smcVar.p().t);
            }
            B(arrayList, new zzi[0]);
        }
    }

    @Override // defpackage.spx
    public final void s() {
        sga sgaVar = this.c;
        sgaVar.c = false;
        zdj zdjVar = this.g;
        ofg ofgVarN = zdjVar != null ? zdjVar.n() : null;
        smc smcVar = this.b;
        C(smcVar.aa(), ofgVarN);
        if (smcVar.p() != null) {
            A(smcVar.p().d, ofgVarN, sgaVar);
        }
    }

    @Override // defpackage.spx
    public final void t() {
        zdj zdjVar = this.g;
        if (zdjVar != null) {
            zdjVar.t();
        }
    }

    @Override // defpackage.spx
    public final void u() {
        sga sgaVar = this.c;
        sgaVar.c = true;
        if (!this.d && !E()) {
            D();
            this.d = true;
        }
        if (this.j == 0) {
            this.j = 1;
            return;
        }
        zdj zdjVar = this.g;
        ofg ofgVarO = zdjVar != null ? zdjVar.o() : null;
        smc smcVar = this.b;
        C(smcVar.ac(), ofgVarO);
        if (smcVar.p() != null) {
            A(smcVar.p().e, ofgVarO, sgaVar);
        }
    }

    @Override // defpackage.spx
    public final void w() {
        snz snzVar = this.f;
        smc smcVar = this.b;
        snzVar.e(smcVar.R());
        if (smcVar.p() != null) {
            B(smcVar.p().i, new zzi[0]);
        }
    }

    @Override // defpackage.spx
    public final void x(aazk aazkVar) {
        if (!aazkVar.h || this.i) {
            return;
        }
        int i = (int) aazkVar.a;
        int i2 = this.h;
        if (i2 <= 0 || i - this.k <= i2) {
            long j = i;
            this.c.d = j;
            if (!this.d && E()) {
                D();
                this.d = true;
            }
            while (true) {
                if (this.l.isEmpty() || i < ((aivk) this.l.peek()).d) {
                    break;
                } else {
                    this.f.c((aivk) this.l.poll(), zzi.f);
                }
            }
            while (!this.m.isEmpty() && j >= ((sme) this.m.peek()).a) {
                this.n.c(((sme) this.m.poll()).b, null);
            }
            this.k = i;
            smc smcVar = this.b;
            int iA = smcVar.a() * 1000;
            int i3 = iA > 0 ? (i << 2) / iA : 0;
            if (i3 >= this.j) {
                for (int i4 = i3; i4 >= this.j; i4--) {
                    zdj zdjVar = this.g;
                    if (C(j(smcVar, i4), zdjVar != null ? zdjVar.p(i4) : null)) {
                        break;
                    }
                }
                this.j = i3 + 1;
            }
        }
    }

    @Override // defpackage.spx
    public final void z() {
        zdj zdjVar = this.g;
        if (zdjVar != null) {
            zdjVar.s();
            zdjVar.r();
            zdjVar.b = null;
        }
        Object obj = this.o;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.o = null;
        }
    }

    @Override // defpackage.spx
    public final void q() {
    }

    @Override // defpackage.spx
    public final void v() {
    }

    @Override // defpackage.spx
    public final void y(aazn aaznVar) {
    }
}
