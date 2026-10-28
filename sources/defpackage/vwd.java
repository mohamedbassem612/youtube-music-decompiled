package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vwd {
    public static final Duration a = Duration.ofSeconds(5);
    public final ahey b;
    public final mbc c;
    public final awmd d;
    public final awmd e;
    public volatile long g;
    public final xpl j;
    private final awmd k;
    private final awmd l;
    private final awmd m;
    private final awmd n;
    private final awmd o;
    private final awmd p;
    private final awmd q;
    private final awmd r;
    public volatile int i = 2;
    public volatile String f = "";
    volatile Future h = aher.a;

    public vwd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, ahey aheyVar, awmd awmdVar4, mbc mbcVar, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, Optional optional, awmd awmdVar10, awmd awmdVar11) {
        this.k = awmdVar;
        this.l = awmdVar2;
        this.m = awmdVar3;
        this.b = aheyVar;
        this.n = awmdVar4;
        this.c = mbcVar;
        this.d = awmdVar5;
        this.o = awmdVar6;
        this.p = awmdVar7;
        this.q = awmdVar8;
        this.j = new xpl((ek) awmdVar9.io());
        optional.isPresent();
        this.r = awmdVar10;
        this.e = awmdVar11;
    }

    public static final void e(String str) {
        yno.eL("[RealTimeAttestation] ".concat(str));
    }

    public static final void f(String str, Throwable th) {
        yno.eL("[RealTimeAttestation] " + str + " Error: " + String.valueOf(th));
    }

    public final synchronized ListenableFuture a() {
        if (!((tfq) this.n.io()).i() && !c()) {
            this.i = 4;
            return ahng.m(new Exception("The device is offline"));
        }
        awmd awmdVar = this.l;
        zwa zwaVarHw = ((zwh) awmdVar.io()).hw();
        awmd awmdVar2 = this.r;
        ahfi ahfiVarB = wlt.b(120000L);
        ahfiVarB.a = new hyl((vyo) awmdVar2.io(), 5);
        ahfiVarB.i(new bym(20));
        wlt wltVarG = ahfiVarB.g();
        awmd awmdVar3 = this.k;
        wof wofVar = (wof) awmdVar3.io();
        wod wodVar = new wod(wofVar.b, ((zwh) awmdVar.io()).hw(), ((ci) this.m.io()).aD(zwaVarHw), zwaVarHw.m(), Optional.empty(), true);
        wodVar.b = ajgq.ENGAGEMENT_TYPE_UNBOUND;
        return afxd.f(((wof) awmdVar3.io()).b(wodVar, this.b, wltVarG)).h(new uzh(this, 8), MoreExecutors.directExecutor()).c(Throwable.class, new uzh(this, 9), MoreExecutors.directExecutor());
    }

    public final void b(long j) {
        this.h.cancel(false);
        tqj tqjVar = (tqj) this.q.io();
        int i = tqr.a;
        boolean zK = tqjVar.k(1073820280);
        ahey aheyVar = this.b;
        if (zK) {
            this.h = aheo.p(aheyVar.schedule(new tpo(10), j, TimeUnit.SECONDS)).r(new uzh(this, 10), MoreExecutors.directExecutor());
        } else {
            this.h = afxd.f(aheyVar.schedule(new tpo(11), j, TimeUnit.SECONDS)).h(new uzh(this, 11), MoreExecutors.directExecutor());
        }
    }

    public final boolean c() {
        awmd awmdVar = this.q;
        tqj tqjVar = (tqj) awmdVar.io();
        int i = tqr.a;
        return tqjVar.k(1073808352) ? ((tqj) awmdVar.io()).k(69172) : ((vxz) this.p.io()).m(13, 45417830L);
    }

    public final void d(int i) {
        yno.eW(i, (dov) this.d.io());
    }

    public final void g() {
        ((vxz) this.o.io()).l(143, 45800999L, false);
    }
}
