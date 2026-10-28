package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aenl implements aenu {
    public static final xjb a = new xjb();
    public final awmd b;
    public final int c;
    private final awmd d;
    private final tqj e;
    private final awmd f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final aenm j;
    private volatile aenr k;
    private final AtomicReference l;
    private final Map m;
    private final Map n;
    private volatile awml o;

    public aenl(awmd awmdVar, awmd awmdVar2, tqj tqjVar, awmd awmdVar3) {
        this.d = awmdVar;
        this.b = awmdVar2;
        this.e = tqjVar;
        this.f = awmdVar3;
        int i = tqr.a;
        boolean zK = tqjVar.k(1073829246);
        this.g = zK;
        this.h = zK && tqjVar.k(1073829793);
        tqjVar.k(1073830121);
        this.i = tqjVar.k(1073830415);
        int iA = tqjVar.a(1074288557);
        this.c = iA <= 0 ? 200 : iA;
        this.j = new aenm(tqjVar);
        this.l = new AtomicReference(null);
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new aenk(this, 0));
        mapSynchronizedMap.getClass();
        this.m = mapSynchronizedMap;
        Map mapSynchronizedMap2 = DesugarCollections.synchronizedMap(new aenk(this, 1, null));
        mapSynchronizedMap2.getClass();
        this.n = mapSynchronizedMap2;
        this.o = new awml("", aoar.a);
    }

    private final void q(aenr aenrVar) {
        String str = aenrVar.c.c;
        if (str == null || !awrc.c(this.o.a, str)) {
            return;
        }
        aenrVar.c.e = ((aoar) this.o.b).c;
        aenrVar.c.h = Integer.valueOf(((aoar) this.o.b).d);
        this.o = new awml("", aoar.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x003a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0061  */
    private final void r(aenr aenrVar, aeno aenoVar) {
        aenr aenrVar2;
        aeno aenoVar2;
        if (this.i) {
            if (!aenrVar.h.get() && aenrVar.g && !aenrVar.f) {
                aeno aenoVar3 = aenrVar.c;
                String str = aenoVar3.d;
                if (str == null || awrc.v(str)) {
                    str = null;
                }
                String str2 = aenoVar.e;
                if (str2 == null) {
                    aenrVar2 = this.k;
                    if (aenrVar2 == null) {
                        str2 = null;
                    } else {
                        if (true == awrc.c(aenrVar2, aenrVar)) {
                            aenrVar2 = null;
                        }
                        if (aenrVar2 != null || (aenoVar2 = aenrVar2.c) == null || (str2 = aenoVar2.d) == null || awrc.v(str2)) {
                            str2 = null;
                        }
                    }
                } else {
                    if (true == awrc.v(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        aenrVar2 = this.k;
                        if (aenrVar2 == null) {
                            str2 = null;
                        } else {
                            if (true == awrc.c(aenrVar2, aenrVar)) {
                                aenrVar2 = null;
                            }
                            if (aenrVar2 != null) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                        }
                    }
                }
                if (str == null) {
                    str = aenoVar3.f;
                    if (str != null) {
                        boolean zV = awrc.v(str);
                        Boolean.valueOf(!zV).getClass();
                        if (zV) {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                }
                aenoVar3.f = str;
                aenoVar3.d = null;
                aenoVar3.e = str2;
                Integer num = aenoVar.h;
                if (num != null) {
                    aenoVar3.h = Integer.valueOf(num.intValue());
                }
                Integer num2 = aenoVar.i;
                if (num2 != null) {
                    aenoVar3.i = Integer.valueOf(num2.intValue());
                }
                aenrVar.d = new awmp(new acoo(aenrVar, 15));
                aenrVar.a().G();
            }
            q(aenrVar);
        }
    }

    private static final boolean s(aeno aenoVar) {
        return aenoVar.m == 3 || aenoVar.a == 41;
    }

    private final void t(String str) {
        Set set;
        Map map = this.n;
        aenr aenrVar = (aenr) map.remove(str);
        if (aenrVar == null || (set = aenrVar.e) == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }

    private final void u(String str) {
    }

    @Override // defpackage.aenu
    public final aenr a(aeno aenoVar) {
        Integer num;
        String str;
        aenr aenrVar;
        String string = aenoVar.c;
        if (string != null) {
            synchronized (this.n) {
                aenr aenrVarC = c(string);
                if (aenrVarC != null) {
                    str = aenrVarC.c.d;
                    if (str == null) {
                        str = aenoVar.d;
                    }
                    if (str == null || awrc.v(str)) {
                        num = null;
                    } else {
                        num = aenrVarC.c.h;
                        t(string);
                        u(string);
                    }
                } else {
                    num = null;
                    str = null;
                }
            }
        } else {
            num = null;
            str = null;
        }
        if (string == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        }
        if (str == null) {
            str = aenoVar.f;
        }
        if (num == null) {
            num = aenoVar.h;
        }
        final aeno aenoVarB = aeno.b(aenoVar, string, str, num, 8019);
        String str2 = aenoVarB.c;
        if (str2 == null) {
            throw new IllegalStateException("Page id must always be set by createPageContext");
        }
        Map map = this.n;
        synchronized (map) {
            Object aenrVar2 = map.get(str2);
            if (aenrVar2 == null) {
                aenrVar2 = new aenr(str2, this.d, new awmd() { // from class: aenj
                    @Override // defpackage.awmd, defpackage.awmc
                    public final Object io() {
                        aeno aenoVar2 = aenoVarB;
                        if (aenoVar2.m == 3) {
                            aenl aenlVar = this.a;
                            if (aenlVar.o() && aenlVar.m()) {
                                int iK = atqp.K(aenoVar2.a);
                                if (iK == 0) {
                                    iK = 188;
                                }
                                return ((xit) aenlVar.b.io()).m(iK);
                            }
                        }
                        return aenl.a;
                    }
                }, aenoVarB);
                map.put(str2, aenrVar2);
            }
            aenrVar = (aenr) aenrVar2;
        }
        aenrVar.c.d = aenrVar.a().i();
        if (s(aenoVarB)) {
            a.av(this.l, null, aenrVar);
        }
        return aenrVar;
    }

    @Override // defpackage.aenu
    public final aenr b(aeno aenoVar) {
        aenr aenrVarC;
        String str = aenoVar.c;
        return (!this.i || str == null || (aenrVarC = c(str)) == null || !(s(aenrVarC.c) || s(aenoVar))) ? a(aenoVar) : aenrVarC;
    }

    @Override // defpackage.aenu
    public final aenr c(String str) {
        str.getClass();
        return (aenr) this.n.get(str);
    }

    @Override // defpackage.aenu
    public final /* synthetic */ aenr d(aeno aenoVar) {
        return aewo.r(this, aenoVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    @Override // defpackage.aenu
    public final aenr e(aeno aenoVar, Long l) {
        tre treVar;
        long millis;
        aenr aenrVarB = b(aenoVar);
        r(aenrVarB, aenoVar);
        long j = -1;
        if (l() && s(aenoVar) && (treVar = (tre) this.f.io()) != null) {
            int i = tqr.a;
            tqj tqjVar = treVar.c;
            if (tqjVar.k(1073829102)) {
                trd trdVar = treVar.h;
                if ((trd.j(trdVar.a(SemanticState.Hidden)) || trd.j(trdVar.a(260))) && !trdVar.k() && trdVar.d.compareAndSet(false, true)) {
                    trd trdVar2 = treVar.h;
                    boolean zK = tqjVar.k(1073829102);
                    if (trd.m(trdVar2.a(264))) {
                        Duration durationA = treVar.g.a();
                        if (zK || trdVar2.b() == 0) {
                            millis = durationA.toMillis();
                        } else {
                            millis = -1;
                        }
                    } else {
                        trh trhVarC = trdVar2.c(2);
                        long jA = ahbt.a(treVar.g.c());
                        if (trhVarC == null || !(zK || trdVar2.b() == 0)) {
                            millis = -1;
                        } else {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            long j2 = trhVarC.a + jA;
                            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                            millis = j2 / 1000;
                        }
                    }
                    if (millis > 0) {
                        j = millis;
                    }
                }
            }
        }
        if (j > 0) {
            l = Long.valueOf(j);
        }
        xie xieVarF = l != null ? aenrVarB.a().F(l.longValue(), ajij.AUTOMATED_LOG_EVENT_SOURCE_PAGE_SYSTEM) : aenrVarB.a().E(ajij.AUTOMATED_LOG_EVENT_SOURCE_PAGE_SYSTEM);
        if (aenrVarB.d()) {
            aenm.b(aenrVarB, xieVarF);
        }
        return aenrVarB;
    }

    @Override // defpackage.aenu
    public final agfr f(String str) {
        str.getClass();
        return new cmw(this, str, 15, null);
    }

    @Override // defpackage.aenu
    public final void g(String str) {
        str.getClass();
        aenr aenrVarC = c(str);
        if (aenrVarC != null) {
            a.av(this.l, aenrVarC, null);
            h(new aens(aenrVarC.c, aent.CLOSED), aenrVarC);
            h(new aens(aenrVarC.c, aent.DESTROYED), aenrVarC);
            t(str);
            u(str);
        }
    }

    @Override // defpackage.aenu
    public final void h(aens aensVar, aenr aenrVar) {
        int iOrdinal;
        aent aentVar = aensVar.b;
        if (aentVar == aent.CREATED) {
            aenrVar = a(aensVar.a);
            q(aenrVar);
        } else if (aenrVar == null) {
            String str = aensVar.a.c;
            aenrVar = str != null ? c(str) : null;
        }
        if (aenrVar == null || (iOrdinal = aentVar.ordinal()) == 0) {
            return;
        }
        if (iOrdinal == 1) {
            r(aenrVar, aensVar.a);
            if (aenrVar.d()) {
                aenm.b(aenrVar, null);
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            synchronized (this.n) {
                aenrVar.f = true;
                aenrVar.g = true;
                boolean z = this.i && aenrVar.c.d == null;
                if (!awrc.c(this.k, aenrVar) || z) {
                    this.j.a(aenrVar, true);
                    this.k = aenrVar;
                    String str2 = aenrVar.c.c;
                    if (str2 != null) {
                        u(str2);
                    }
                    aenrVar.c.d = aenrVar.a().i();
                } else {
                    this.j.a(aenrVar, false);
                }
            }
            return;
        }
        if (iOrdinal == 3) {
            aenrVar.f = false;
            xfq xfqVarA = aenrVar.a();
            ajij ajijVar = aenm.a;
            xfqVarA.J(ajijVar);
            aenrVar.b().e(tau.VISIBILITY_CHANGED, ajijVar);
            return;
        }
        if (iOrdinal == 4) {
            aenrVar.f = false;
            aenrVar.h.set(false);
            xfq xfqVarA2 = aenrVar.a();
            ajij ajijVar2 = aenm.a;
            xfqVarA2.H(ajijVar2);
            aenrVar.b().e(tau.ACTION_ABANDONED, ajijVar2);
            return;
        }
        if (iOrdinal != 5) {
            throw new awmj();
        }
        if (!this.h) {
            aenrVar.a().I(aenm.a);
        }
        if (!this.g) {
            String str3 = aenrVar.c.c;
            if (str3 == null) {
                str3 = "";
            }
            t(str3);
        }
        String str4 = aenrVar.c.c;
        if (str4 != null) {
            u(str4);
        }
    }

    @Override // defpackage.aenu
    public final void i(String str, aeno aenoVar) {
        aenr aenrVarC = c(str);
        if (aenrVarC != null) {
            String str2 = aenoVar.c;
            if (str2 == null) {
                throw new IllegalStateException("Real page ID must be set in navigationInfo for navigationSuccess");
            }
            aenrVarC.a = str2;
            aenrVarC.c = aenoVar;
            Set set = aenrVarC.e;
            set.add(str);
            set.add(str2);
            Map map = this.n;
            synchronized (map) {
                map.put(str2, aenrVarC);
            }
        }
    }

    @Override // defpackage.aenu
    public final void j(String str, aoar aoarVar) {
        str.getClass();
        aoarVar.getClass();
        this.o = new awml(str, aoarVar);
    }

    @Override // defpackage.aenu
    public final void k(String str, int i) {
        str.getClass();
        aenr aenrVarC = c(str);
        if (aenrVarC != null) {
            aenrVarC.c(i);
        }
    }

    @Override // defpackage.aenu
    public final boolean l() {
        int i = tqr.a;
        return this.e.k(1073829102);
    }

    @Override // defpackage.aenu
    public final boolean m() {
        int i = tqr.a;
        return this.e.k(1073829998);
    }

    @Override // defpackage.aenu
    public final void n(String str, int i, Integer num) {
        aeno aenoVar;
        str.getClass();
        aenr aenrVarC = c(str);
        if (aenrVarC != null) {
            aenr aenrVar = this.k;
            String str2 = null;
            if (aenrVar != null && (aenoVar = aenrVar.c) != null) {
                str2 = aenoVar.d;
            }
            aeno aenoVar2 = aenrVarC.c;
            aenoVar2.e = str2;
            aenoVar2.h = num;
        }
    }

    @Override // defpackage.aenu
    public final boolean o() {
        int i = tqr.a;
        return this.e.l(1074615367, 18);
    }

    @Override // defpackage.aenu
    public final aenr p(String str, Long l) {
        return e(aewo.v(41, null, null, null, 3, 14).a(new acsc(str, 10)), l);
    }
}
