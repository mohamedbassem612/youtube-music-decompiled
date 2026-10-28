package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agnb implements agmt {
    private final /* synthetic */ int $cid;
    public static final agnb f = new agnb(5);
    public static final agnb e = new agnb(4);
    public static final agnb d = new agnb(3);
    public static final agnb c = new agnb(2);
    public static final agnb b = new agnb(1);
    public static final agnb a = new agnb(0);

    public agnb(int i) {
        this.$cid = i;
    }

    public static final agnd g(Object obj, int i, agnd agndVar) {
        return agndVar == null ? new agnd(obj, i) : new agnc(obj, i, agndVar);
    }

    public static final agna h(Object obj, int i, agna agnaVar) {
        return agnaVar == null ? new agna(obj, i) : new agmz(obj, i, agnaVar);
    }

    public static final agnf i(Object obj, int i, agnf agnfVar) {
        return agnfVar == null ? new agnf(obj, i) : new agne(obj, i, agnfVar);
    }

    public static final agnk j(agnl agnlVar, Object obj, int i, agnk agnkVar) {
        ReferenceQueue referenceQueue = agnlVar.g;
        return agnkVar == null ? new agnk(referenceQueue, obj, i) : new agnj(referenceQueue, obj, i, agnkVar);
    }

    public static final agnn k(agno agnoVar, Object obj, int i, agnn agnnVar) {
        ReferenceQueue referenceQueue = agnoVar.g;
        return agnnVar == null ? new agnn(referenceQueue, obj, i) : new agnm(referenceQueue, obj, i, agnnVar);
    }

    public static final agnq l(agnr agnrVar, Object obj, int i, agnq agnqVar) {
        ReferenceQueue referenceQueue = agnrVar.g;
        return agnqVar == null ? new agnq(referenceQueue, obj, i) : new agnp(referenceQueue, obj, i, agnqVar);
    }

    @Override // defpackage.agmt
    public final /* synthetic */ agms a(agmw agmwVar, agms agmsVar, agms agmsVar2) {
        int i = this.$cid;
        if (i == 0) {
            agnd agndVar = (agnd) agmsVar;
            agnd agndVarG = g(agndVar.a, agndVar.b, (agnd) agmsVar2);
            agndVarG.c = agndVar.c;
            return agndVarG;
        }
        if (i == 1) {
            agna agnaVar = (agna) agmsVar;
            return h(agnaVar.a, agnaVar.b, (agna) agmsVar2);
        }
        if (i == 2) {
            agng agngVar = (agng) agmwVar;
            agnf agnfVar = (agnf) agmsVar;
            agnf agnfVar2 = (agnf) agmsVar2;
            if (agmw.m(agnfVar)) {
                return null;
            }
            agnf agnfVarI = i(agnfVar.a, agnfVar.b, agnfVar2);
            agnfVarI.c = agnfVar.c.b(agngVar.g, agnfVarI);
            return agnfVarI;
        }
        if (i == 3) {
            agnl agnlVar = (agnl) agmwVar;
            agnk agnkVar = (agnk) agmsVar;
            agnk agnkVar2 = (agnk) agmsVar2;
            Object obj = agnkVar.get();
            if (obj != null) {
                return j(agnlVar, obj, agnkVar.a, agnkVar2);
            }
            return null;
        }
        if (i == 4) {
            agno agnoVar = (agno) agmwVar;
            agnn agnnVar = (agnn) agmsVar;
            agnn agnnVar2 = (agnn) agmsVar2;
            Object obj2 = agnnVar.get();
            if (obj2 == null) {
                return null;
            }
            agnn agnnVarK = k(agnoVar, obj2, agnnVar.a, agnnVar2);
            agnnVarK.b = agnnVar.b;
            return agnnVarK;
        }
        agnr agnrVar = (agnr) agmwVar;
        agnq agnqVar = (agnq) agmsVar;
        agnq agnqVar2 = (agnq) agmsVar2;
        Object obj3 = agnqVar.get();
        if (obj3 == null || agmw.m(agnqVar)) {
            return null;
        }
        agnq agnqVarL = l(agnrVar, obj3, agnqVar.a, agnqVar2);
        agnqVarL.b = agnqVar.b.b(agnrVar.h, agnqVarL);
        return agnqVarL;
    }

    @Override // defpackage.agmt
    public final /* synthetic */ agms b(agmw agmwVar, Object obj, int i, agms agmsVar) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return g(obj, i, (agnd) agmsVar);
        }
        if (i2 == 1) {
            return h(obj, i, (agna) agmsVar);
        }
        if (i2 == 2) {
            return i(obj, i, (agnf) agmsVar);
        }
        if (i2 != 3) {
            return i2 != 4 ? l((agnr) agmwVar, obj, i, (agnq) agmsVar) : k((agno) agmwVar, obj, i, (agnn) agmsVar);
        }
        return j((agnl) agmwVar, obj, i, (agnk) agmsVar);
    }

    @Override // defpackage.agmt
    public final /* synthetic */ agmw c(agnw agnwVar, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return new agmw(agnwVar, i, (char[]) null);
        }
        if (i2 == 1) {
            return new agmw(agnwVar, i, (byte[]) null);
        }
        if (i2 == 2) {
            return new agng(agnwVar, i);
        }
        if (i2 != 3) {
            return i2 != 4 ? new agnr(agnwVar, i) : new agno(agnwVar, i);
        }
        return new agnl(agnwVar, i);
    }

    @Override // defpackage.agmt
    public final agmy d() {
        int i = this.$cid;
        if (i == 0 || i == 1 || i == 2) {
            return agmy.a;
        }
        if (i != 3) {
        }
        return agmy.b;
    }

    @Override // defpackage.agmt
    public final agmy e() {
        int i = this.$cid;
        return (i == 0 || i == 1 || (i != 2 && (i == 3 || i == 4))) ? agmy.a : agmy.b;
    }

    @Override // defpackage.agmt
    public final /* synthetic */ void f(agmw agmwVar, agms agmsVar, Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((agnd) agmsVar).c = obj;
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            agnf agnfVar = (agnf) agmsVar;
            agnt agntVar = agnfVar.c;
            agnfVar.c = new agnu(((agng) agmwVar).g, obj, agnfVar);
            agntVar.clear();
            return;
        }
        if (i == 3) {
        } else if (i == 4) {
            ((agnn) agmsVar).b = obj;
        } else {
            agnq agnqVar = (agnq) agmsVar;
            agnt agntVar2 = agnqVar.b;
            agnqVar.b = new agnu(((agnr) agmwVar).h, obj, agnqVar);
            agntVar2.clear();
        }
    }
}
