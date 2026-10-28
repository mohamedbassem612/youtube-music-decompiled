package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rts implements rsr {
    public final rsq A;
    public final rsq B;
    public final rsq C;
    public final vyo D;
    public final abmt E;
    public yvs G;
    public final Map I;
    public final Map J;
    public Optional K;
    public Boolean L;
    public final agkz N;
    public String O;
    private final List P;
    private final List Q;
    private final List R;
    private final tun S;
    private final boolean T;
    private final vxu U;
    public final rsq a;
    public final rsq b;
    public final rsq c;
    public final rsq d;
    public final rsq e;
    public final rsq f;
    public final rsq g;
    public final rsq h;
    public final rsq i;
    public final rsq j;
    public final rsq k;
    public final rsq l;
    public final rsq m;
    public final rsq n;
    public final rsq o;
    public final rsq p;
    public final rsq q;
    public final rsq r;
    public final ruu s;
    public final rsq t;
    public final rsq u;
    public final rsq v;
    public final rsq w;
    public final rsq x;
    public final rsq y;
    public final rsq z;
    public Boolean M = Boolean.FALSE;
    final CopyOnWriteArrayList F = new CopyOnWriteArrayList();
    public final Map H = new HashMap();

    public rts(rud rudVar, ryr ryrVar, rys rysVar, rtm rtmVar, sbl sblVar, rzi rziVar, sbm sbmVar, run runVar, sbt sbtVar, ruq ruqVar, sbu sbuVar, sbx sbxVar, rza rzaVar, rzc rzcVar, rzb rzbVar, sby sbyVar, sca scaVar, scc sccVar, scv scvVar, ruu ruuVar, sch schVar, sdb sdbVar, rzz rzzVar, rzv rzvVar, rzu rzuVar, rzn rznVar, rze rzeVar, sci sciVar, sbp sbpVar, List list, List list2, List list3, vyo vyoVar, vxu vxuVar, abmt abmtVar, tun tunVar) {
        this.a = rudVar;
        this.b = ryrVar;
        this.c = rysVar;
        this.d = rtmVar;
        this.e = sblVar;
        this.f = rziVar;
        this.g = sbmVar;
        this.h = runVar;
        this.i = sbtVar;
        this.j = ruqVar;
        this.k = sbuVar;
        this.l = sbxVar;
        this.m = rzaVar;
        this.n = rzcVar;
        this.o = rzbVar;
        this.p = sbyVar;
        this.q = scaVar;
        this.r = sccVar;
        this.v = scvVar;
        this.s = ruuVar;
        this.t = schVar;
        this.u = sdbVar;
        this.w = rzzVar;
        this.x = rzvVar;
        this.y = rzuVar;
        this.z = rznVar;
        this.A = rzeVar;
        this.B = sciVar;
        this.C = sbpVar;
        this.P = list;
        this.Q = list2;
        this.R = list3;
        this.D = vyoVar;
        this.U = vxuVar;
        this.E = abmtVar;
        this.S = tunVar;
        boolean z = afxw.e(vyoVar).cw;
        this.T = z;
        agkx agkxVar = new agkx();
        agkxVar.c(sbmVar);
        if (z) {
            agkxVar.c(ryrVar);
        }
        this.N = agkxVar.g();
        this.I = new ConcurrentHashMap();
        this.J = new ConcurrentHashMap();
    }

    public static boolean m(yvs yvsVar, yvs yvsVar2) {
        int i = yvsVar2.b;
        if (i == -1 || yvsVar2.a() == -1) {
            return false;
        }
        if (yvsVar != null && yvsVar2.b(yvsVar)) {
            if (!yvsVar2.b(yvsVar) || yvsVar.b > i) {
                return false;
            }
            if (((i != 0 && i != 1 && i != 2) || Math.abs(yvsVar2.a() - yvsVar.a()) <= 50) && Math.abs(yvsVar2.d - yvsVar.d) <= 50) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rsr
    public final wjf a(String str) {
        return (wjf) this.J.get(str);
    }

    @Override // defpackage.rsr
    public final acfw b(String str) {
        return (acfw) this.I.get(str);
    }

    @Override // defpackage.rsr
    public final Optional c(String str) {
        return Optional.ofNullable((aaxa) this.H.get(str));
    }

    @Override // defpackage.rsr
    public final String d() {
        return this.O;
    }

    @Override // defpackage.rsr
    public final void e(rsq rsqVar) {
        this.F.add(rsqVar);
    }

    @Override // defpackage.rsr
    public final void f() {
        abmt abmtVar = this.E;
        int i = 0;
        if (abmtVar.g.l(334, 45754676L, false) || afxw.e(this.D).aP) {
            this.S.d.ak(new rlb(this, 7));
        }
        Iterator it = this.R.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            abvn abvnVar = (abvn) it.next();
            ((avlh) (abmtVar.ch() ? abvnVar.r().t : abvnVar.r().i)).al(new jqi(this, 18), new jop(4));
            abvnVar.ao().b().ak(new jqi(this, 20));
            ((avlh) (abmtVar.ch() ? abvnVar.r().u : abvnVar.r().n)).al(new rtn(this, 1), new jop(4));
            abvnVar.L().ak(new rtn(this, 0));
            Object obj = abmtVar.ch() ? abvnVar.r().s : abvnVar.r().f;
            aizx aizxVarE = afxw.e(this.D);
            if (aizxVarE == null || !aizxVarE.ap) {
                ((avlh) obj).ak(new aawl(new rtn(this, 2), "BDEA", 0));
            } else {
                ((avlh) obj).x(new sqj(1)).ak(new aawl(new rtn(this, 2), "BDEA", 0));
            }
            abvnVar.P().ak(new rtn(this, 3));
            abvnVar.E().ak(new jqi(this, 19));
            boolean z = taq.bb(this.U).l;
            boolean z2 = this.T && abvnVar.am() != null && abvnVar.am().b == 3;
            if (z || z2) {
                if (abvnVar instanceof gir) {
                    ((abij) ((gir) abvnVar).cK.io()).a().al(new mnt(this, abvnVar, 2), new jop(4));
                }
            }
        }
        for (avlh avlhVar : this.Q) {
            if (abmtVar.ch()) {
                avlh avlhVarS = avlhVar.p().W(new rtq(i)).p().S();
                avlhVarS.ak(new rlb(this, 8));
                avlhVarS.W(new rtq(2)).al(new rtn(this, 5), new jop(4));
                avlhVarS.W(new rtq(3)).ak(new rlb(this, 9));
            } else {
                avlhVar.p().ak(new rtn(this, 6));
                avlhVar.p().W(new igz(18)).al(new rtn(this, 5), new jop(4));
                avlhVar.p().W(new igz(17)).ak(new rtn(this, 4));
                i = 0;
            }
        }
        for (avlh avlhVar2 : this.P) {
            avlhVar2.p().W(new igz(13)).ak(new aawl(new jqi(this, 14), "BDEA", 1));
            avlhVar2.p().W(new igz(14)).ak(new jqi(this, 15));
            avlh avlhVarW = avlhVar2.p().W(new igz(15));
            if (afxw.e(this.D).aQ) {
                avlhVarW.x(new hhw(this, 17)).ak(new rlb(this, 10));
                avlh avlhVarX = avlhVarW.x(new hhw(this, 18));
                rsq rsqVar = this.f;
                rsqVar.getClass();
                avlhVarX.ak(new rlb(rsqVar, 11));
            } else {
                avlhVarW.x(new ifu(this, 3)).ak(new jqi(this, 12));
            }
            avlhVar2.p().ak(new jqi(this, 16));
            avlhVar2.p().W(new vvb(new qmd(2), 7)).ak(new jqi(this, 17));
            avlhVar2.p().W(new igz(16)).x(new jna(10)).ak(new jqi(this, 13));
        }
    }

    @Override // defpackage.rsr
    public final void g(aazp aazpVar) {
        i(new rme(aazpVar, 15), agpr.a);
    }

    @Override // defpackage.rsr
    public final void h(rsq rsqVar) {
        this.F.remove(rsqVar);
    }

    public final void i(Consumer consumer, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            consumer.r((rsq) it.next());
        }
        Iterator it2 = this.F.iterator();
        while (it2.hasNext()) {
            consumer.r((rsq) it2.next());
        }
    }

    public final void j(String str, int i) {
        i(new tso(str, i, 1), agkz.s(this.c, this.i, this.l, this.p));
    }

    public final void k(String str) {
        i(new rme(str, 14), agkz.q(this.a, this.k));
    }

    public final boolean l(aaxa aaxaVar) {
        yvs yvsVar = aaxaVar.a;
        if (yvsVar.b == -1 || yvsVar.a() == -1) {
            return false;
        }
        this.H.put(yvsVar.a, aaxaVar);
        return true;
    }
}
