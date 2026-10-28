package defpackage;

import android.util.Pair;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acga {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/player/video/cue/CueRangeManager");
    private final Executor b;
    private final acgh c;
    private final acgh d;
    private long i;
    private long j;
    private boolean o;
    private final abmt w;
    private final aunn x;
    private tbl e = null;
    private tbl f = null;
    private long l = Long.MAX_VALUE;
    private final List p = new ArrayList();
    private final List q = new ArrayList();
    private final List r = new ArrayList();
    private final List s = new ArrayList();
    private final ConcurrentLinkedQueue t = new ConcurrentLinkedQueue();
    private final List u = new ArrayList();
    private List v = new ArrayList();
    private long g = Long.MIN_VALUE;
    private long h = Long.MIN_VALUE;
    private boolean k = true;
    private boolean m = true;
    private boolean n = true;

    public acga(Executor executor, abmt abmtVar, aunn aunnVar) {
        this.b = executor;
        this.c = new acgh(abmtVar);
        this.d = new acgh(abmtVar);
        this.w = abmtVar;
        this.x = aunnVar;
    }

    private final tbl A(long j, long j2) {
        return new tbl(this.c.b(j, j2));
    }

    private final tbl B(long j) {
        return new tbl(this.d.a(j));
    }

    private final tbl C(long j, long j2) {
        return new tbl(this.d.b(j, j2));
    }

    private final void D(acfx acfxVar, boolean z, boolean z2, boolean z3, long j) {
        if (!acfxVar.b()) {
            acfxVar.h(z, z2, z3, j);
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.t;
        synchronized (concurrentLinkedQueue) {
            concurrentLinkedQueue.add(new acfy(acfxVar, acgd.a, z, z2, z3, j, null));
        }
    }

    private final void E(acfx acfxVar, boolean z, boolean z2, long j) {
        if (!acfxVar.b()) {
            acfxVar.j(j);
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.t;
        synchronized (concurrentLinkedQueue) {
            concurrentLinkedQueue.add(new acfy(acfxVar, acgd.b, z, z2, false, j, null));
        }
    }

    private final void F(acfx acfxVar, Runnable runnable) {
        acgh acghVar = acfxVar.e ? this.d : this.c;
        acghVar.e(acfxVar);
        runnable.run();
        acghVar.c(acfxVar);
    }

    private final void G(tbl tblVar, long j, long j2, boolean z) {
        while (tblVar.hasNext()) {
            acgc acgcVar = (acgc) tblVar.next();
            acfx acfxVar = (acfx) acgcVar.c;
            boolean zO = acfxVar.o(j);
            boolean zO2 = acfxVar.o(j2);
            long jL = acfxVar.l();
            long jK = acfxVar.k();
            if (zO) {
                acga acgaVar = this;
                boolean z2 = z;
                if (!zO2 && jL != jK) {
                    acgaVar.E(acfxVar, acgaVar.k, true, j);
                }
                z = z2;
                this = acgaVar;
            } else if (zO2) {
                if (jL == jK && acgcVar.a == acgd.b) {
                    this.E(acfxVar, this.k, true, j2);
                } else {
                    acga acgaVar2 = this;
                    long j3 = j2;
                    acgaVar2.D(acfxVar, acgaVar2.k, true, z, j3);
                    this = acgaVar2;
                    j2 = j3;
                }
            }
        }
        this.I();
    }

    private final void H() {
        ahno.O(!this.o);
        List list = this.p;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g((acfx) it.next());
        }
        list.clear();
        List list2 = this.q;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            n((acfx) it2.next());
        }
        list2.clear();
        List<Pair> list3 = this.r;
        for (Pair pair : list3) {
            k((acfx) pair.first, ((Long) pair.second).longValue());
        }
        list3.clear();
        List<Pair> list4 = this.s;
        for (Pair pair2 : list4) {
            i((acfx) pair2.first, (acgb) pair2.second);
        }
        list4.clear();
    }

    private final void I() {
        agjz agjzVar = new agjz(4);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.t;
        synchronized (concurrentLinkedQueue) {
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            for (acfy acfyVar = (acfy) concurrentLinkedQueue.poll(); acfyVar != null; acfyVar = (acfy) concurrentLinkedQueue.poll()) {
                agjzVar.h(acfyVar);
            }
            this.b.execute(afwl.i(new abyz(agjzVar, 6)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    private final void J() {
        for (zdj zdjVar : this.u) {
            acgh<acfx> acghVar = this.c;
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (acfx acfxVar : acghVar) {
                int i = acfxVar.f;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        z = true;
                    }
                }
                arrayList.add(new abht(acfxVar.l(), acfxVar.k()));
            }
            abhu abhuVar = new abhu(z ? abhs.b : abhs.a, arrayList);
            if (!Objects.equals(zdjVar.b, abhuVar)) {
                zdjVar.b = abhuVar;
                ((tce) zdjVar.a.io()).a(abhuVar);
            }
        }
    }

    private final long x(acfx acfxVar) {
        return acfxVar.e ? this.h : this.g;
    }

    private final long y(long j, long j2) {
        tbl tblVar = this.e;
        long j3 = Long.MAX_VALUE;
        if (tblVar != null) {
            long j4 = tblVar.hasNext() ? ((acgc) tblVar.a()).b - j : Long.MAX_VALUE;
            if (j2 != -1) {
                tbl tblVar2 = this.f;
                if (tblVar2 != null && tblVar2.hasNext()) {
                    j3 = ((acgc) tblVar2.a()).b - j2;
                }
                long jMin = Math.min(j4, j3);
                this.l = jMin;
                return jMin;
            }
            j3 = j4;
        }
        this.l = j3;
        return j3;
    }

    private final tbl z(long j) {
        return new tbl(this.c.a(j));
    }

    public final synchronized long a() {
        return this.g;
    }

    public final synchronized long b() {
        if (this.k) {
            return Long.MAX_VALUE;
        }
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [acga] */
    /* JADX WARN: Type inference failed for: r11v2, types: [acga] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [long] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [long] */
    /* JADX WARN: Type inference failed for: r14v9, types: [acga] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [acga] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [acga] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [acga] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [acga] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v2, types: [long] */
    /* JADX WARN: Type inference failed for: r8v3, types: [long] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v2, types: [long] */
    public final synchronized long c(long j, long j2) throws Throwable {
        Throwable th;
        ?? r14;
        long jY;
        ?? r4;
        ?? r8;
        try {
            try {
                ahno.O(!this.o);
                if (this.k) {
                    try {
                        s();
                    } catch (Throwable th2) {
                        th = th2;
                        r14 = this;
                        throw th;
                    }
                }
                jY = Long.MAX_VALUE;
                if (j < this.g || j <= Long.MIN_VALUE || j >= Long.MAX_VALUE) {
                    ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/video/cue/CueRangeManager", "handleProgress", 165, "CueRangeManager.java")).z("CueRangeManager state error: currentPosition=%d lastPositionTracked=%d", j, this.g);
                    this.l = Long.MAX_VALUE;
                } else {
                    if (this.k) {
                        ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/video/cue/CueRangeManager", "handleProgress", 172, "CueRangeManager.java")).t("CueRangeManger state error: isTrackingPaused = true");
                    }
                    this.o = true;
                    if (this.m) {
                        this.e = z(this.g + 1);
                        this.m = false;
                        J();
                    }
                    if (this.n && j2 > 0) {
                        this.f = B(this.h + 1);
                        this.n = false;
                    }
                    tbl tblVar = this.e;
                    if (tblVar != null) {
                        while (tblVar.hasNext() && j >= ((acgc) tblVar.a()).b) {
                            try {
                                acgc acgcVar = (acgc) tblVar.next();
                                acge acgeVar = acgcVar.c;
                                acgd acgdVar = acgcVar.a;
                                acfx acfxVar = (acfx) acgeVar;
                                acgd acgdVar2 = acgd.a;
                                boolean z = this.k;
                                if (acgdVar == acgdVar2) {
                                    r4 = this;
                                    long j3 = j;
                                    try {
                                        r4.D(acfxVar, z, false, false, j3);
                                        this = r4;
                                        j = j3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = th;
                                        r14 = r4;
                                        throw th;
                                    }
                                } else {
                                    ?? r5 = this;
                                    long j4 = j;
                                    r5.E(acfxVar, z, false, j4);
                                    j = j4;
                                    this = r5;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r4 = this;
                                th = th;
                                r14 = r4;
                                throw th;
                            }
                        }
                    }
                    r4 = this;
                    long j5 = j;
                    try {
                        r4.g = j5;
                        tbl tblVar2 = r4.f;
                        r4 = r4;
                        ?? r15 = j2;
                        while (tblVar2 != null && tblVar2.hasNext() && r15 >= ((acgc) tblVar2.a()).b) {
                            acgc acgcVar2 = (acgc) tblVar2.next();
                            acge acgeVar2 = acgcVar2.c;
                            acgd acgdVar3 = acgcVar2.a;
                            acfx acfxVar2 = (acfx) acgeVar2;
                            acgd acgdVar4 = acgd.a;
                            boolean z2 = r4.k;
                            if (acgdVar3 == acgdVar4) {
                                ?? r9 = r15;
                                r4.D(acfxVar2, z2, false, false, r9);
                                r8 = r9;
                            } else {
                                r8 = r15;
                                r4.E(acfxVar2, z2, false, r8);
                                r4 = r4;
                            }
                            r15 = r8;
                            r4 = r4;
                        }
                        ?? r10 = r15;
                        ?? r16 = r4;
                        r16.h = r10;
                        r16.o = false;
                        r16.H();
                        r16.I();
                        jY = r16.y(j5, r10);
                    } catch (Throwable th5) {
                        th = th5;
                        j2 = r4;
                        th = th;
                        r14 = j2;
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                j2 = this;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        return jY;
    }

    public final synchronized long d(long j, boolean z) {
        return e(j, -1L, z);
    }

    public final synchronized long e(long j, long j2, boolean z) throws Throwable {
        Throwable th;
        acga acgaVar;
        long j3;
        long j4;
        try {
            try {
                ahno.O(!this.o);
                if (j <= Long.MIN_VALUE || j >= Long.MAX_VALUE) {
                    ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/video/cue/CueRangeManager", "handleSeek", 281, "CueRangeManager.java")).v("CueRangeManager state error: newPosition=%d", j);
                }
                J();
                if (this.k) {
                    try {
                        j3 = this.i;
                    } catch (Throwable th2) {
                        th = th2;
                        acgaVar = this;
                        throw th;
                    }
                } else {
                    j3 = this.g;
                }
                long j5 = j3;
                this.o = true;
                tbl tblVarA = j > j5 ? A(j5, j) : A(j, j5);
                this.e = tblVarA;
                try {
                    G(tblVarA, j5, j, z);
                    long j6 = this.k ? this.j : this.h;
                    if (j2 > 0) {
                        tbl tblVarC = j2 > j6 ? C(j6, j2) : C(j2, j6);
                        this.f = tblVarC;
                        j4 = j2;
                        G(tblVarC, j6, j4, z);
                    } else {
                        j4 = j2;
                    }
                    if (this.k) {
                        this.i = j;
                        this.j = j4;
                    } else {
                        this.g = j;
                        this.h = j4;
                    }
                    this.e = z(j + 1);
                    if (j2 > 0) {
                        this.f = B(1 + j4);
                        this.n = false;
                    }
                    this.m = false;
                    this.o = false;
                    H();
                } catch (Throwable th3) {
                    th = th3;
                    acgaVar = this;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                acgaVar = this;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return y(j, j4);
    }

    public final Boolean f(Class cls, acfx acfxVar) {
        if (!cls.isInstance(acfxVar)) {
            return Boolean.FALSE;
        }
        if (!this.o) {
            return Boolean.TRUE;
        }
        this.q.add(acfxVar);
        return Boolean.FALSE;
    }

    public final synchronized void g(acfx acfxVar) {
        if (acfxVar != null) {
            h(agke.q(acfxVar));
        }
    }

    public final synchronized void h(List list) {
        acga acgaVar;
        Throwable th;
        try {
            try {
                if (!this.o) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        acfx acfxVar = (acfx) it.next();
                        if (acfxVar.e) {
                            this.d.c(acfxVar);
                            acfxVar.e(this.h);
                            this.n = true;
                        } else {
                            this.c.c(acfxVar);
                            acfxVar.e(this.g);
                            this.m = true;
                        }
                        if (this.w.bS() && acfxVar.o(this.g)) {
                            acgaVar = this;
                            try {
                                Runnable runnableI = afwl.i(new laz(acgaVar, acfxVar, this.x(acfxVar), 14));
                                if (!a.x() || acfxVar.b()) {
                                    acgaVar.b.execute(runnableI);
                                } else {
                                    runnableI.run();
                                }
                                this = acgaVar;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    acga acgaVar2 = this;
                    acgaVar2.J();
                    return;
                }
                this.p.addAll(list);
            } catch (Throwable th3) {
                th = th3;
                acgaVar = this;
            }
        } catch (Throwable th4) {
            th = th4;
            acgaVar = this;
        }
        th = th;
        throw th;
    }

    public final synchronized void i(acfx acfxVar, acgb acgbVar) {
        if (!this.c.f(acfxVar) && !this.d.f(acfxVar)) {
            zvl zvlVar = (zvl) this.x.io();
            zvj zvjVarA = zvk.a();
            zvjVarA.j = 21;
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.f(new IllegalStateException("Calling CueRangeManager#adjustCueRangeBounds with unmanaged CueRange"));
            zvjVarA.d("Calling CueRangeManager#adjustCueRangeBounds with unmanaged CueRange");
            zvlVar.a(zvjVarA.a());
            return;
        }
        if (acfxVar.m().equals(acgbVar)) {
            return;
        }
        if (this.o) {
            this.s.add(Pair.create(acfxVar, acgbVar));
            return;
        }
        long j = acfxVar.e ? this.h : this.g;
        acgb acgbVarM = acfxVar.m();
        F(acfxVar, new abwl(acfxVar, acgbVar, 14, null));
        acfxVar.f(j, acgbVarM, acgbVar);
        if (acfxVar.e) {
            this.n = true;
        } else {
            this.m = true;
        }
        J();
    }

    public final void j(acfx acfxVar) {
        if (acfxVar != null) {
            long jX = x(acfxVar);
            if (acfxVar.d && acfxVar.o(jX)) {
                acfxVar.j(jX);
            }
            if (acfxVar.e) {
                this.n = true;
            } else {
                this.m = true;
            }
        }
    }

    public final synchronized void k(acfx acfxVar, long j) {
        if (acfxVar != null) {
            if (this.c.f(acfxVar)) {
                if (this.o) {
                    this.r.add(new Pair(acfxVar, Long.valueOf(j)));
                    return;
                }
                if (this.g < acfxVar.k()) {
                    int i = 1;
                    if (this.w.g.l(268, 45724942L, false)) {
                        F(acfxVar, new acgm(acfxVar, j, i));
                    } else {
                        acfxVar.i(j);
                    }
                    if (acfxVar.e) {
                        this.n = true;
                    } else {
                        this.m = true;
                    }
                    J();
                }
            }
        }
    }

    public final synchronized void l() {
        d(9223372036854775806L, false);
        this.k = false;
        if (!this.w.S()) {
            r();
            return;
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            a$$ExternalSyntheticApiModelOutline0.m7m(it.next()).r(this);
        }
    }

    public final synchronized void m() {
        if (!this.k) {
            this.k = true;
            this.i = this.g;
            this.j = this.h;
        }
    }

    public final synchronized void n(acfx acfxVar) {
        if (acfxVar != null) {
            if (this.c.f(acfxVar) || this.d.f(acfxVar)) {
                o(agke.q(acfxVar));
            }
        }
    }

    public final synchronized void o(List list) {
        if (this.o) {
            this.q.addAll(list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            acfx acfxVar = (acfx) it.next();
            if (acfxVar.e) {
                this.d.e(acfxVar);
            } else {
                this.c.e(acfxVar);
            }
            j(acfxVar);
        }
        J();
    }

    public final synchronized void p(Class cls) {
        this.c.d(new aaat(this, cls, 14, null), new aasz(this, 10));
        J();
    }

    public final synchronized void q(Class cls, acge acgeVar) {
        this.c.d(new aegm(this, acgeVar, cls, 1), new aasz(this, 10));
        J();
    }

    public final synchronized void r() {
        this.g = Long.MIN_VALUE;
        this.h = Long.MIN_VALUE;
        this.l = Long.MAX_VALUE;
        this.m = true;
        this.n = true;
        m();
        p(acfx.class);
        this.e = z(this.g);
        this.f = B(this.h);
        this.v = new ArrayList();
    }

    public final synchronized void s() throws Throwable {
        try {
            try {
                if (this.k) {
                    this.k = false;
                    long j = this.g;
                    long j2 = this.i;
                    if (j != j2) {
                        e(j2, this.j, false);
                    } else {
                        J();
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void t() {
        this.k = false;
        d(-9223372036854775807L, false);
    }

    public final synchronized boolean u() {
        return this.k;
    }

    public final synchronized void v(zdj zdjVar) {
        List list = this.u;
        if (!list.contains(zdjVar)) {
            list.add(zdjVar);
        }
    }

    public final synchronized void w(zdj zdjVar) {
        this.u.remove(zdjVar);
    }
}
