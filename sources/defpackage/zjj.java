package defpackage;

import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zjj implements zjd {
    public final xir b;
    public final Executor c;
    public final Executor d;
    public final zjr e;
    public final ConcurrentHashMap f;
    private final mbc g;
    private final awmd h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final HashSet j = new HashSet();

    public zjj(xir xirVar, mbc mbcVar, zjr zjrVar, ScheduledExecutorService scheduledExecutorService, awmd awmdVar) {
        zkf.d(xirVar);
        this.b = xirVar;
        this.g = mbcVar;
        this.e = zjrVar;
        this.c = scheduledExecutorService;
        this.h = awmdVar;
        this.d = zjrVar.el() ? new ahfg(scheduledExecutorService) : null;
        this.f = new ConcurrentHashMap();
    }

    private final void aV(final xir xirVar, final tas tasVar) {
        Executor executor;
        if (ahno.aa(tasVar.d)) {
            return;
        }
        mbc mbcVar = this.g;
        final long epochMilli = mbcVar.f().toEpochMilli();
        zjr zjrVar = this.e;
        final long jB = mbcVar.b();
        if (!zjrVar.dq()) {
            if (!zjrVar.i.m(20, 45373068L) || zjrVar.n.l(28, 45381277L, false)) {
                aU(xirVar, tasVar, epochMilli, jB);
                return;
            } else {
                final int i = 0;
                this.c.execute(afwl.i(new Runnable(this) { // from class: zji
                    public final /* synthetic */ zjj a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = i;
                        long j = jB;
                        long j2 = epochMilli;
                        tas tasVar2 = tasVar;
                        xir xirVar2 = xirVar;
                        zjj zjjVar = this.a;
                        if (i2 != 0) {
                            zjjVar.aU(xirVar2, tasVar2, j2, j);
                        } else {
                            zjjVar.aU(xirVar2, tasVar2, j2, j);
                        }
                    }
                }));
                return;
            }
        }
        if (this.i.compareAndSet(false, aW(tasVar.d))) {
            this.f.put(tasVar.d, Pair.create(tasVar, Pair.create(Long.valueOf(epochMilli), Long.valueOf(jB))));
            if (aW(tasVar.d)) {
                this.c.execute(afwl.i(new zdv(this, 9)));
                return;
            }
            return;
        }
        Executor executor2 = this.c;
        if (zjrVar.el() && (executor = this.d) != null) {
            executor2 = executor;
        }
        final int i2 = 1;
        executor2.execute(afwl.i(new Runnable(this) { // from class: zji
            public final /* synthetic */ zjj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                long j = jB;
                long j2 = epochMilli;
                tas tasVar2 = tasVar;
                xir xirVar2 = xirVar;
                zjj zjjVar = this.a;
                if (i3 != 0) {
                    zjjVar.aU(xirVar2, tasVar2, j2, j);
                } else {
                    zjjVar.aU(xirVar2, tasVar2, j2, j);
                }
            }
        }));
    }

    private final boolean aW(String str) {
        return this.e.j.h(1, 45618271L).b.contains(str);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void A() {
        yno.bc(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void B() {
        yno.bd(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void C() {
        yno.be(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void D() {
        yno.bf(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void E() {
        yno.bg(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void F() {
        yno.bh(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void G() {
        yno.bi(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void H() {
        yno.bj(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void I() {
        yno.bk(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void J() {
        yno.bl(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void K() {
        yno.bm(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void L() {
        yno.bn(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void M() {
        yno.bo(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void N() {
        yno.bp(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void O() {
        yno.bq(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void P() {
        yno.br(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void Q() {
        yno.bs(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void R() {
        yno.bt(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void S() {
        yno.bu(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void T() {
        yno.bv(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void U() {
        yno.bw(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void V() {
        yno.bx(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void W() {
        yno.by(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void X() {
        yno.bz(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void Y() {
        yno.bA(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void Z() {
        yno.bB(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void a() {
        yno.aB(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aA(int i, boolean z) {
        yno.cc(this, i, z);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aB() {
        yno.cd(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aC() {
        yno.ce(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aD() {
        yno.cf(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aE() {
        yno.cg(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aF() {
        yno.ch(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aG() {
        yno.ci(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aH() {
        yno.cj(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aI() {
        yno.ck(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aJ() {
        yno.cl(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aK() {
        yno.cm(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aL() {
        yno.cn(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aM() {
        yno.co(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aN() {
        yno.cp(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aO() {
        yno.cq(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aP() {
        yno.cr(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aQ(tas tasVar) {
        yno.cs(this, tasVar);
    }

    @Override // defpackage.zjd
    public final void aR(yjs yjsVar) {
        aV(this.b, yjsVar);
    }

    @Override // defpackage.zjd
    public final void aS(ynp ynpVar) {
        if (this.e.ff()) {
            ((rnj) this.h.io()).f(ynpVar.d);
        }
        xir xirVar = this.b;
        aV(xirVar, ynpVar);
        if (ynpVar.g() || this.j.add(ynpVar.d)) {
            ynpVar.a(xirVar);
        }
    }

    public final void aT() {
        if (this.e.dq()) {
            this.i.set(true);
        }
    }

    public final void aU(xir xirVar, tas tasVar, long j, long j2) {
        if (tasVar.f()) {
            j -= j2 - tasVar.d();
        }
        boolean z = false;
        if (!(tasVar instanceof yjs) && this.e.j.m(103, 45407621L)) {
            z = true;
        }
        xirVar.p(tasVar.d, j, z);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aa(String str) {
        yno.bC(this, str);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ab() {
        yno.bD(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ac() {
        yno.bE(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ad() {
        yno.bF(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ae() {
        yno.bG(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void af() {
        yno.bH(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ag() {
        yno.bI(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ah() {
        yno.bJ(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ai() {
        yno.bK(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aj() {
        yno.bL(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ak() {
        yno.bM(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void al() {
        yno.bN(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void am() {
        yno.bO(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void an() {
        yno.bP(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ao() {
        yno.bQ(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ap() {
        yno.bR(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aq() {
        yno.bS(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ar() {
        yno.bT(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void as(boolean z, boolean z2) {
        yno.bU(this, z, z2);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void at(long j, long j2) {
        yno.bV(this, j, j2);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void au() {
        yno.bW(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void av(long j, long j2) {
        yno.bX(this, j, j2);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void aw() {
        yno.bY(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ax() {
        yno.bZ(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void ay() {
        yno.ca(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void az() {
        yno.cb(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void b(long j, long j2) {
        yno.aC(this, j, j2);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void c() {
        yno.aD(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void d() {
        yno.aE(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void e() {
        yno.aF(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void f() {
        yno.aG(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void g(int i, boolean z) {
        yno.aH(this, i, z);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void h() {
        yno.aI(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void i() {
        yno.aJ(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void j() {
        yno.aK(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void k(ajvs ajvsVar) {
        yno.aL(this, ajvsVar);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void l(ajvt ajvtVar) {
        yno.aM(this, ajvtVar);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void m() {
        yno.aN(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void n() {
        yno.aO(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void o() {
        yno.aP(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void p() {
        yno.aQ(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void q() {
        yno.aR(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void r() {
        yno.aS(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void s() {
        yno.aT(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void t() {
        yno.aU(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void u() {
        yno.aV(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void v() {
        yno.aW(this);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void w(boolean z, boolean z2) {
        yno.aX(this, z, z2);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void x(long j) {
        yno.aY(this, j);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void y(boolean z) {
        yno.ba(this, z);
    }

    @Override // defpackage.zjd
    public final /* synthetic */ void z() {
        yno.bb(this);
    }
}
