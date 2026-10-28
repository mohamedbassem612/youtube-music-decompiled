package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abhe implements accz, tdi {
    public final abmt a;
    public final avmm b;
    public String c;
    public acca d;
    public boolean e;
    public boolean g;
    public String h;
    public abgz i;
    public abgy j;
    public abha k;
    public final acdf l;
    private final acda m;
    private final boolean n;
    private final List o;
    private final Map p;
    private avmn q;
    private final vxu r;

    public abhe(acdf acdfVar, acaq acaqVar, acda acdaVar, acag acagVar, Executor executor, vxu vxuVar, boolean z, abmt abmtVar, aunn aunnVar, vwt vwtVar, List list) {
        this.b = new avmm();
        acdfVar.getClass();
        this.l = acdfVar;
        acdaVar.getClass();
        this.m = acdaVar;
        this.r = vxuVar;
        this.n = z;
        acaqVar.getClass();
        executor.getClass();
        this.j = new abgy(acaqVar, acagVar, executor, this, new hyl(acdfVar, 6));
        this.i = new abgz(acagVar, this, new hyl(acdfVar, 7));
        this.k = this.j;
        this.a = abmtVar;
        int iC = (int) abmtVar.r.c(3, 45818238L, 0L);
        if (iC > 0) {
            this.p = new abhc(((int) Math.ceil(iC / 0.75f)) + 1, iC);
        } else {
            this.p = new HashMap();
        }
        this.o = new ArrayList(((agpi) list).d);
        if (aunnVar != null && vwtVar != null && abmtVar.M()) {
            this.q = vwtVar.A().r().af(new mnt(this, aunnVar, 20));
        }
        tqj tqjVar = abmtVar.b;
        int i = tqr.a;
        if (tqjVar.l(1074419667, 1)) {
            return;
        }
        acdaVar.e(this);
        acdfVar.l(acdaVar.b());
        acdfVar.g(acdaVar.a());
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            aunn aunnVar2 = (aunn) agqsVarListIterator.next();
            abhd abhdVar = new abhd(this, (abhq) aunnVar2.io());
            this.o.add(abhdVar);
            ((abhq) aunnVar2.io()).s(abhdVar);
        }
    }

    private final void o(abvn abvnVar, agjz agjzVar) {
        int i = 16;
        avlh avlhVarH = abvnVar.C().i(new abwr(1)).u(new abgd(this, i)).H(new xee(i));
        int i2 = 17;
        agjzVar.h(avlhVarH.y(new xee(i2)).ak(new abgd(this, i2)));
    }

    private static final avlh p(abvn abvnVar) {
        return abvnVar.M(new aawe(16), new aawe(19)).i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(0));
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        taq.g(this);
    }

    @Override // defpackage.accz
    public final void b(float f) {
        this.l.g(f);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.a;
    }

    public final agkj d() {
        return agkj.h(this.p);
    }

    public final void e() {
        acdf acdfVar = this.l;
        acdfVar.f();
        acdfVar.setVisibility(4);
        this.d = null;
    }

    public final void f() {
        if (this.e) {
            return;
        }
        j();
    }

    public final void g(aazj aazjVar) {
        abob abobVar = aazjVar.a;
        if (abobVar == abob.f || abobVar == abob.e) {
            this.h = aazjVar.h;
        } else {
            this.h = aazjVar.g;
            wjf wjfVar = aazjVar.b;
            if (wjfVar != null) {
                this.c = wjfVar.G();
            }
        }
        acfw acfwVar = aazjVar.f;
        if (acfwVar == null || acfwVar.c() == null || acfwVar.g() == null) {
            return;
        }
        n(acfwVar.c().G(), acfwVar.g());
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        taq.h(this);
    }

    final void h(aazk aazkVar) {
        this.k.e(aazkVar);
    }

    @tcc
    public void handlePlayerGeometryEvent(aaxo aaxoVar) {
        boolean z = this.e;
        boolean z2 = aaxoVar.a == abnr.REMOTE;
        this.e = z2;
        if (z || !z2) {
            return;
        }
        this.l.f();
    }

    @tcc
    public void handleSubtitleTrackChangedEvent(aazb aazbVar) {
        if (!this.e) {
            k(aazbVar.b);
        }
        acca accaVar = aazbVar.b;
        if (accaVar != null) {
            yyk yykVar = new yyk(this, 16);
            Optional optional = accaVar.o;
            if (true == optional.isPresent()) {
                Object obj = optional.get();
                Object obj2 = yykVar.a;
                acbk acbkVar = (acbk) obj;
                double d = acbkVar.c;
                acdf acdfVar = ((abhe) obj2).l;
                acdfVar.i(d);
                acdfVar.h(acbkVar.d);
                acdfVar.j(acbkVar.a);
                acdfVar.k(acbkVar.b);
            }
        }
    }

    @tcc
    public void handleVideoStageEvent(aazj aazjVar) {
        if (this.a.bx(8L)) {
            return;
        }
        afvn afvnVarB = aawb.b(aazjVar, "StOP");
        try {
            g(aazjVar);
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @tcc
    public void handleVideoTimeEvent(aazk aazkVar) {
        if (this.a.bB(1L)) {
            return;
        }
        h(aazkVar);
    }

    public final void i() {
        List<abhd> list = this.o;
        for (abhd abhdVar : list) {
            abhdVar.a.t(abhdVar);
        }
        list.clear();
        this.k.g();
        this.m.f(this);
    }

    public final void j() {
        e();
        this.k.g();
        this.p.clear();
        this.c = null;
    }

    @Override // defpackage.accz
    public final void jN(accp accpVar) {
        this.l.l(accpVar);
    }

    public final void k(acca accaVar) {
        if (accaVar == null || !accaVar.e()) {
            this.k.h(accaVar);
            this.d = accaVar;
        }
    }

    public final avmn[] l(abvn abvnVar) {
        return this.a.M() ? new avmn[0] : m(abvnVar);
    }

    public final avmn[] m(abvn abvnVar) {
        ajdr ajdrVar;
        aoqb aoqbVarCn = abmt.cn(this.r);
        if (aoqbVarCn != null) {
            ajdrVar = aoqbVarCn.g;
            if (ajdrVar == null) {
                ajdrVar = ajdr.a;
            }
        } else {
            ajdrVar = null;
        }
        int i = 14;
        int i2 = 3;
        int i3 = 0;
        int i4 = 8;
        int i5 = 1;
        if (ajdrVar == null || !ajdrVar.b) {
            avlh avlhVarI = ((avlh) abvnVar.r().a).i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i5));
            if (abvnVar.g().bx(8L)) {
                avlhVarI = avlhVarI.x(new yqz(9));
            }
            agjz agjzVar = new agjz(4);
            agjzVar.j(Arrays.asList(avlhVarI.al(new aawl(new abhb(this, i5), "StOP", 1), new abeq(i4)), ((avlh) abvnVar.r().i).i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i5)).al(new aawl(new abhb(this, i3), "SOP", 2), new abeq(i4)), abvnVar.ao().b().i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i3)).al(new abgd(this, i), new abeq(i4)), abvnVar.M(new aawe(17), new aawe(18)).i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i5)).al(new abgd(this, 15), new abeq(i4)), ((avlh) abvnVar.r().q).ak(new abgd(this, 18)), abvnVar.M(new aawe(16), new aawe(20)).i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i5)).al(new abgd(this, 19), new abeq(i4))));
            agjzVar.h(p(abvnVar).al(new abgd(this, 20), new abeq(i4)));
            o(abvnVar, agjzVar);
            return (avmn[]) agjzVar.g().toArray(new avmn[0]);
        }
        agjz agjzVar2 = new agjz(4);
        avmn[] avmnVarArr = new avmn[6];
        avmnVarArr[0] = abvnVar.C().p().W(new vvb(new abfb(i2), 7)).i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i5)).al(new abid(this, i5), new abeq(i4));
        avmnVarArr[1] = ((avlh) (this.a.cg() ? abvnVar.r().t : abvnVar.r().i)).i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i5)).al(new aawl(new abhb(this, i3), "SOP", 2), new abeq(i4));
        avmnVarArr[2] = abvnVar.ao().b().i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i3)).al(new abgd(this, i), new abeq(i4));
        avmnVarArr[3] = abvnVar.M(new aawe(17), new aawe(18)).i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i5)).al(new abgd(this, 15), new abeq(i4));
        int i6 = 20;
        avmnVarArr[4] = ((avlh) abvnVar.r().q).ak(new abae(this, i6));
        avmnVarArr[5] = abvnVar.M(new aawe(16), new aawe(i6)).i(aawb.y(abvnVar.X(), 524288L)).i(new abwr(i5)).al(new abgd(this, 19), new abeq(i4));
        agjzVar2.j(Arrays.asList(avmnVarArr));
        agjzVar2.h(p(abvnVar).al(new abgd(this, 20), new abeq(i4)));
        o(abvnVar, agjzVar2);
        return (avmn[]) agjzVar2.g().toArray(new avmn[0]);
    }

    public final void n(String str, acga acgaVar) {
        String str2;
        if (this.a.r.l(45, 45835080L, false) && (str2 = this.c) != null && !str2.equals(str)) {
            this.p.get(str2);
        }
        this.p.put(str, acgaVar);
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        if (this.n) {
            j();
        }
        i();
        Object obj = this.q;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.q = null;
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }

    public abhe(acdf acdfVar, acaq acaqVar, acda acdaVar, acag acagVar, Executor executor, vxu vxuVar, abmt abmtVar, aunn aunnVar, vwt vwtVar) {
        this(acdfVar, acaqVar, acdaVar, acagVar, executor, vxuVar, abmtVar.bD(), abmtVar, aunnVar, vwtVar, agpi.a);
    }
}
