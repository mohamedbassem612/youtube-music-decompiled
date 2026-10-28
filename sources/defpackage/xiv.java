package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xiv implements xir, xih {
    private static final agrf i = agrf.h("com/google/android/libraries/youtube/logging/latency/LoggingThreadLatencyActionLogger");
    public final Optional a;
    public final Executor b;
    public final xja c;
    public final String d;
    public boolean e;
    public final ArrayList f;
    final agfr g;
    public final int h;
    private final mbc j;
    private final xej k;
    private final tqj l;
    private final awmd m;
    private final boolean n;
    private boolean o;
    private final ConcurrentHashMap p;

    public xiv(mbc mbcVar, Executor executor, xej xejVar, xja xjaVar, tqj tqjVar, awmd awmdVar, int i2, String str, boolean z) {
        Optional.empty();
        this.e = false;
        this.o = false;
        this.p = new ConcurrentHashMap();
        this.f = new ArrayList();
        this.j = mbcVar;
        this.b = executor;
        this.k = xejVar;
        this.c = xjaVar;
        this.l = tqjVar;
        this.m = awmdVar;
        this.n = z;
        this.h = i2;
        this.d = str;
        if (z) {
            this.g = aguu.al(new tar(xejVar, 11));
        } else {
            this.g = aguu.al(new wkw(xejVar, 15));
        }
        this.a = Optional.empty();
    }

    private final xie r(long j, ajij ajijVar) {
        return this.k.d((xid) this.g.io(), j, ajijVar);
    }

    private final void s(String str, ajij ajijVar) {
        if (this.n || this.h != 42) {
            return;
        }
        tqj tqjVar = this.l;
        int i2 = tqr.a;
        if (tqjVar.k(1073829998) && tqjVar.k(1073830120)) {
            String str2 = "Non-automated Logger used for LatencyActionReelWatch during " + str + ": source=" + ajijVar.toString() + " isPageSystem=false";
            ((agrc) ((agrc) ((agrc) ((agrc) i.c()).g(5, TimeUnit.SECONDS)).l(agsi.FULL)).k("com/google/android/libraries/youtube/logging/latency/LoggingThreadLatencyActionLogger", "enforceAutomatedLoggerForReelWatchLogging", 313, "LoggingThreadLatencyActionLogger.java")).E("Non-automated Logger used for LatencyActionReelWatch during %s: source=%s isPageSystem=%s", str, ajijVar, Boolean.FALSE);
            u(str2, 8);
        }
    }

    private final void t(String str, long j, boolean z, ajij ajijVar) {
        if (!z || ((Boolean) this.p.putIfAbsent(str, Boolean.TRUE)) == null) {
            s("logTick", ajijVar);
            this.b.execute(afwl.i(new dzn((Object) this, str, r(j, ajijVar), 11)));
        }
    }

    private final void u(String str, int i2) {
        zvl zvlVar = (zvl) this.m.io();
        if (zvlVar != null) {
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 13;
            aihf aihfVarCreateBuilder = aokx.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aokx aokxVar = (aokx) aihfVarCreateBuilder.instance;
            aokxVar.c = i2 - 1;
            aokxVar.b |= 1;
            zvjVarA.e((aokx) aihfVarCreateBuilder.build());
            zvjVarA.d(str);
            zvjVarA.f(new Throwable(str));
            zvlVar.a(zvjVarA.a());
        }
    }

    @Override // defpackage.xih
    public final void a(amiu amiuVar, ajij ajijVar) {
        i(amiuVar, this.j.f().toEpochMilli(), ajijVar);
    }

    @Override // defpackage.xih
    public final void b(ajij ajijVar) {
        c(this.j.f().toEpochMilli(), ajijVar);
    }

    @Override // defpackage.xih
    public final void c(long j, ajij ajijVar) {
        s("logBaseline", ajijVar);
        if (this.n && this.h == 42 && ajijVar != ajij.AUTOMATED_LOG_EVENT_SOURCE_PAGE_SYSTEM && ajijVar != ajij.AUTOMATED_LOG_EVENT_SOURCE_ELEMENTS) {
            tqj tqjVar = this.l;
            int i2 = tqr.a;
            if (tqjVar.k(1073829998) && tqjVar.k(1073830120)) {
                String strCs = a.cs(ajijVar, "Non-Automated baseline for LatencyActionReelWatch (missed requestPage): source=", " isPageSystem=true");
                ((agrc) ((agrc) ((agrc) ((agrc) i.c()).g(5, TimeUnit.SECONDS)).l(agsi.FULL)).k("com/google/android/libraries/youtube/logging/latency/LoggingThreadLatencyActionLogger", "enforceAutomatedBaselineForReelWatchLogging", 341, "LoggingThreadLatencyActionLogger.java")).C("Non-Automated baseline for LatencyActionReelWatch (missed requestPage): source=%s isPageSystem=%s", ajijVar, true);
                u(strCs, 9);
            }
        }
        this.b.execute(afwl.i(new wdd(this, r(j, ajijVar), 9, (byte[]) null)));
    }

    @Override // defpackage.xih
    public final void d(String str, ajij ajijVar) {
        this.b.execute(afwl.i(new vwh(this, str, r(this.j.f().toEpochMilli(), ajijVar), 18)));
    }

    @Override // defpackage.xih
    public final void e(tau tauVar, ajij ajijVar) {
        t(tauVar.du, this.j.f().toEpochMilli(), false, ajijVar);
    }

    @Override // defpackage.xir
    public final void f(tau tauVar) {
        t(tauVar.du, this.j.f().toEpochMilli(), false, ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    @Override // defpackage.xir
    public final void g(tau tauVar, long j) {
        t(tauVar.du, j, false, ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    @Override // defpackage.zwx
    public final void h(amiu amiuVar) {
        i(amiuVar, this.j.f().toEpochMilli(), ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    public final void i(amiu amiuVar, long j, ajij ajijVar) {
        this.b.execute(afwl.i(new vwh(this, amiuVar, r(j, ajijVar), 20)));
    }

    public final void j(xie xieVar) {
        if (this.o) {
            return;
        }
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        int i2 = this.h;
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiuVar.f = i2 - 1;
        amiuVar.b |= 4;
        String str = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
        amiuVar2.b |= 8;
        amiuVar2.g = str;
        this.c.a((amiu) aihfVarCreateBuilder.build(), xieVar);
        this.o = true;
    }

    @Override // defpackage.zwx
    public final void k() {
        b(ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    @Override // defpackage.zwx
    public final void l(long j) {
        c(j, ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    @Override // defpackage.zwx
    public final void m(String str) {
        d(str, ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    @Override // defpackage.zwx
    @Deprecated
    public final void n(String str) {
        t(str, this.j.f().toEpochMilli(), false, ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    @Override // defpackage.zwx
    @Deprecated
    public final void o(String str, long j) {
        t(str, j, false, ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    @Override // defpackage.zwx
    @Deprecated
    public final void p(String str, long j, boolean z) {
        t(str, j, z, ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    @Override // defpackage.zwx
    public final int q() {
        return this.h;
    }
}
