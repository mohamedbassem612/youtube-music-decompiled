package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, b = aixo.SLOT_TYPE_PLAYER_BYTES, c = {sjq.class}, d = {sih.class, sjy.class, sid.class, sic.class, siv.class})
public final class rxo implements rxj, rxw, rst, rsq {
    public final rsr a;
    public final smr c;
    public final List e;
    public final awmd f;
    public final boolean g;
    private final tbt i;
    private final Executor j;
    private final Executor k;
    private final sko l;
    private final long m;
    private final skh n;
    private final vyo o;
    private boolean q;
    private aciw[] r;
    private final ruw s;
    private final spy t;
    private final rsk u;
    private final rsk v;
    public boolean h = false;
    public final AtomicReference b = new AtomicReference();
    private final AtomicReference p = new AtomicReference(Optional.empty());
    public final List d = new ArrayList();

    public rxo(rsr rsrVar, ruw ruwVar, spy spyVar, tbt tbtVar, Executor executor, Executor executor2, smr smrVar, sko skoVar, rsk rskVar, rsk rskVar2, yvs yvsVar, vyo vyoVar, awmd awmdVar, abmt abmtVar) {
        this.a = rsrVar;
        this.s = ruwVar;
        this.t = spyVar;
        this.i = tbtVar;
        this.j = executor;
        this.k = executor2;
        this.c = smrVar;
        this.l = skoVar;
        this.u = rskVar;
        this.v = rskVar2;
        this.n = skh.a((String) smrVar.d(sic.class), (wjf) smrVar.d(sid.class));
        this.o = vyoVar;
        this.f = awmdVar;
        Iterator it = ((List) skoVar.d(sjq.class)).iterator();
        while (it.hasNext()) {
            this.d.add((slb) ((sko) it.next()).d(sjb.class));
        }
        this.e = new ArrayList(this.d.size());
        Iterator it2 = this.d.iterator();
        long millis = 0;
        while (it2.hasNext()) {
            millis += TimeUnit.SECONDS.toMillis(((slb) it2.next()).a());
        }
        this.m = millis;
        this.b.set(new snh(yvsVar.a(), yvsVar.a() + yvsVar.d));
        if (!smrVar.e(shx.class) && !skoVar.e(sip.class)) {
            rmp.m(smrVar, skoVar, "Slot is missing BreakTypeGetter and layout is also missing InstreamAdBreakGetter. This is unexpected.");
        }
        this.g = ((wjf) smrVar.d(sid.class)).T() || abmtVar.ao();
    }

    private final void x(String str, boolean z) {
        if (!z) {
            z(0);
            return;
        }
        for (rxx rxxVar : this.e) {
            if (TextUtils.equals(((slb) rxxVar.a().d(sjb.class)).o, str)) {
                if (!this.q) {
                    rmp.m(this.c, this.l, "Trying to active SubLayoutRenderingAdapter without primary started");
                    return;
                }
                Optional optional = (Optional) this.p.getAndSet(Optional.of(rxxVar));
                if (optional.isPresent() && optional.get() == rxxVar) {
                    rmp.m(this.c, this.l, "SubLayoutRenderingAdapter has already been activated");
                    return;
                }
                tbt tbtVar = this.i;
                optional.isPresent();
                tbtVar.c(new xng());
                if (optional.isPresent()) {
                    ((rxx) optional.get()).N(0);
                }
                rxxVar.M();
            }
        }
    }

    private final void y() {
        this.j.execute(afwl.i(new rxn(this, 1)));
    }

    private final void z(int i) {
        Optional optional = (Optional) this.p.getAndSet(Optional.empty());
        if (optional.isPresent()) {
            this.i.c(new xng());
            ((rxx) optional.get()).N(i);
        }
    }

    @Override // defpackage.rxj
    public final void M() {
        this.q = true;
        smr smrVar = this.c;
        if (!smrVar.e(shx.class)) {
            spy spyVar = this.t;
            skl sklVar = (skl) this.l.d(sip.class);
            smc smcVar = (smc) ((rxx) aguu.K(this.e)).a().d(sjb.class);
            taq.d();
            Map map = spyVar.c;
            if (!map.containsKey(sklVar)) {
                map.put(sklVar, new sqa(spyVar.g.i(), sklVar, smcVar));
            }
            spyVar.f = (nrm) map.get(sklVar);
        }
        this.u.b(smrVar, this.l);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        if (this.q || !this.g) {
            this.q = false;
            if (this.g) {
                if (i == 2) {
                    this.h = true;
                    Optional optional = (Optional) this.p.get();
                    if (optional.isPresent()) {
                        s(((rxx) optional.get()).a());
                    }
                    i = 2;
                }
                z(i);
                spy spyVar = this.t;
                if (i == 4) {
                    spyVar.a();
                } else {
                    spyVar.c();
                }
            } else {
                this.t.c();
            }
            this.u.d(this.c, this.l, i);
        }
    }

    @Override // defpackage.rst
    public final void O(String str, String str2, String str3) {
        List list = this.d;
        boolean zAnyMatch = Collection.EL.stream(list).anyMatch(new jmy(str2, 17));
        boolean zAnyMatch2 = Collection.EL.stream(list).anyMatch(new jmy(str, 18));
        if (this.g && zAnyMatch2) {
            if (!zAnyMatch) {
                return;
            } else {
                zAnyMatch = true;
            }
        }
        x(str2, zAnyMatch);
    }

    @Override // defpackage.rxj
    public final void S() {
        Iterator it = ((List) this.l.d(sjq.class)).iterator();
        while (it.hasNext()) {
            this.v.h(this.n, this.c, (sko) it.next());
        }
        this.a.h(this);
        this.s.b(this);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rxj
    public final void b() {
        y();
        Iterator it = ((List) this.l.d(sjq.class)).iterator();
        while (it.hasNext()) {
            this.v.g(this.n, this.c, (sko) it.next());
        }
        this.a.e(this);
        this.s.a(this);
    }

    @Override // defpackage.rsq
    public final void d(String str, int i) {
        x(str, i == 1);
    }

    @Override // defpackage.rsq
    public final void e(aaxa aaxaVar) {
        yvs yvsVar = aaxaVar.a;
        if (TextUtils.equals(yvsVar.a, ((yvs) this.c.d(sih.class)).a)) {
            this.b.set(new snh(yvsVar.a(), yvsVar.a() + yvsVar.d));
            y();
        }
    }

    public final void s(sko skoVar) {
        smr smrVar = this.c;
        acjb acjbVarD = ((acfw) smrVar.d(sjy.class)).d();
        if (acjbVarD == null) {
            rmp.n(smrVar, "Null playback timeline for DAI finishSkippedSegments");
            return;
        }
        acjbVarD.I(((slb) skoVar.d(sjb.class)).o, (String) smrVar.d(sic.class));
        this.k.execute(afwl.i(new rno(acjbVarD, 20)));
    }

    @Override // defpackage.rxw
    public final void u(sko skoVar, int i) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x012b A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:27:0x00a1, B:29:0x00a7, B:30:0x00b1, B:34:0x00cb, B:35:0x00dd, B:37:0x00f2, B:41:0x0100, B:43:0x0115, B:45:0x011f, B:47:0x0127, B:48:0x012b, B:49:0x012f, B:51:0x0135), top: B:59:0x00a1 }] */
    public final void v(snh snhVar) {
        smr smrVar = this.c;
        acjb acjbVarD = ((acfw) smrVar.d(sjy.class)).d();
        if (acjbVarD == null) {
            rmp.n(smrVar, "Null playback timeline for DAI update");
            return;
        }
        if (this.r == null) {
            yvs yvsVar = (yvs) smrVar.d(sih.class);
            aigj aigjVar = null;
            String str = (!afxw.e(this.o).bM || yvsVar == null) ? null : yvsVar.a;
            sko skoVar = this.l;
            if (skoVar.e(sjp.class)) {
                aigjVar = (aigj) skoVar.d(sjp.class);
            } else if (smrVar.e(sjp.class)) {
                aigjVar = (aigj) smrVar.d(sjp.class);
            }
            List list = this.d;
            this.r = new aciw[list.size()];
            for (int i = 0; i < list.size(); i++) {
                slb slbVar = (slb) list.get(i);
                aciw[] aciwVarArr = this.r;
                int i2 = sll.a;
                aciwVarArr[i] = acjbVarD.m(slbVar.c() != null ? slbVar.c() : new wji((wja) slbVar.g().orElseThrow(), (wje) slbVar.f().orElseThrow(), slbVar.n), slbVar.o, str, aigjVar);
            }
        }
        try {
            for (aciw aciwVar : this.r) {
                acjbVarD.d(aciwVar.h);
            }
            long j = snhVar.b;
            long j2 = snhVar.a;
            long j3 = this.m;
            long j4 = (j - j2) - j3;
            if (!afxw.e(this.o).g || j4 <= 0) {
                acjbVarD.aa(j2, j, ((yvs) smrVar.d(sih.class)).a, this.r);
                if (j4 < 0) {
                    long j5 = -j4;
                    List list2 = this.d;
                    int size = list2.size();
                    while (true) {
                        size--;
                        if (j5 <= 0 || size < 0) {
                            break;
                        }
                        slb slbVar2 = (slb) list2.get(size);
                        long millis = TimeUnit.SECONDS.toMillis(slbVar2.a());
                        if (j5 >= millis) {
                            String str2 = slbVar2.o;
                            acjd acjdVarC = acjbVarD.c(str2);
                            if (acjdVarC instanceof aciw) {
                                aciw aciwVar2 = (aciw) acjdVarC;
                                if (aciwVar2.j()) {
                                    aciwVar2.i(0L);
                                } else {
                                    acjbVarD.d(str2);
                                }
                            } else {
                                acjbVarD.d(str2);
                            }
                        } else {
                            aciw aciwVar3 = this.r[size];
                            if (aciwVar3 != null) {
                                aciwVar3.i(millis - j5);
                            }
                        }
                        j5 -= millis;
                    }
                }
            } else {
                acjbVarD.aa(j2, j2 + j3, ((yvs) smrVar.d(sih.class)).a, this.r);
            }
            this.k.execute(afwl.i(new rxn(acjbVarD, 0)));
        } catch (Throwable th) {
            this.k.execute(afwl.i(new rxn(acjbVarD, 0)));
            throw th;
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rxw
    public final void t() {
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

    @Override // defpackage.rst
    public final /* synthetic */ void P(long j, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rxw
    public final void w(sas sasVar, int i) {
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

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
