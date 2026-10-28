package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yrv implements yrx {
    private static final long k;
    private final abxv A;
    private final ci B;
    public final awmd a;
    public final vyo b;
    public final mbc c;
    public final zjr d;
    public final zgm e;
    public final vxu f;
    public final yql g;
    public final hed h;
    public final hed i;
    public final zik j;
    private final ScheduledExecutorService l;
    private final zjk m;
    private yqs p;
    private wlo q;
    private String r;
    private long s;
    private String t;
    private final Map u;
    private final int v;
    private int w;
    private final vxz x;
    private final vxz y;
    private final rnj z;
    private final Object o = new Object();
    private final Handler n = new Handler(Looper.getMainLooper());

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k = 10000L;
    }

    public yrv(awmd awmdVar, ScheduledExecutorService scheduledExecutorService, zjk zjkVar, abxv abxvVar, vyo vyoVar, vxu vxuVar, mbc mbcVar, ci ciVar, yql yqlVar, hed hedVar, hed hedVar2, zik zikVar, zgm zgmVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, zjr zjrVar, rnj rnjVar) {
        this.a = awmdVar;
        this.l = scheduledExecutorService;
        this.m = zjkVar;
        this.A = abxvVar;
        this.b = vyoVar;
        this.f = vxuVar;
        this.c = mbcVar;
        this.B = ciVar;
        this.g = yqlVar;
        this.h = hedVar;
        this.i = hedVar2;
        this.j = zikVar;
        this.e = zgmVar;
        this.x = vxzVar;
        this.y = vxzVar2;
        int iC = (int) vxzVar3.c(4, 45377389L, 0L);
        this.v = iC;
        int i = zic.a;
        this.u = new zib(iC, iC);
        this.d = zjrVar;
        this.z = rnjVar;
    }

    public static boolean e(yqs yqsVar) {
        ListenableFuture listenableFuture = ((yqo) yqsVar).h;
        if (listenableFuture.isDone()) {
            try {
                ahng.v(listenableFuture);
            } catch (CancellationException | ExecutionException unused) {
                return true;
            }
        }
        return false;
    }

    private final void h(xir xirVar, int i) {
        if (j(i)) {
            if (xirVar != null) {
                xirVar.f(tau.ONESIE_CACHE_HIT);
            }
            this.z.g(243);
        }
    }

    private final void i(xir xirVar, int i) {
        if (j(i)) {
            if (xirVar != null) {
                xirVar.f(tau.ONESIE_CACHE_MISS_KEY);
            }
            this.z.g(246);
        }
    }

    private static final boolean j(int i) {
        return (i == 2 || i == 3 || i == 4) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    @Override // defpackage.yrx
    public final yqs a(wlo wloVar, yrr yrrVar, tgg tggVar, xir xirVar, boolean z) throws Throwable {
        zjd zjdVar;
        wlo wloVar2;
        yrv yrvVar;
        yqs yqsVar;
        yqs yqsVar2;
        wlo wloVar3;
        xsc xscVar;
        Object obj;
        ytf ytfVar;
        String str;
        yru yruVar;
        yrr yrrVar2 = yrrVar;
        zhq zhqVar = zhq.ABR;
        int i = typ.a;
        yru yruVar2 = null;
        if (yrrVar2.x == 0) {
            throw null;
        }
        String str2 = yrrVar2.b;
        zjd zjdVarB = b(xirVar);
        zjdVarB.L();
        boolean zC = yrrVar2.c();
        zgm zgmVar = this.e;
        zgmVar.d(yrrVar2);
        Object obj2 = this.B.a;
        abzv abzvVar = new abzv();
        ytf ytfVar2 = new ytf(zgmVar, str2, this.h, this.d);
        d(xirVar, ytfVar2);
        try {
            xpl xplVarC = yti.c(this.b, this.f, this.c);
            if (yrrVar2.h == null) {
                c(tggVar, yrrVar2.b, wloVar, new IllegalStateException("onesie request without video id"));
                return new yqr();
            }
            xsc xscVar2 = new xsc(xplVarC);
            String str3 = yrrVar2.b;
            Object obj3 = this.o;
            synchronized (obj3) {
                try {
                    try {
                        if (this.v > 0) {
                            if (str3 != null) {
                                yruVar2 = (yru) this.u.get(str3);
                            } else {
                                str3 = null;
                            }
                            if (yruVar2 != null) {
                                yrv yrvVar2 = yruVar2.e;
                                zjr zjrVar = yrvVar2.d;
                                if (zjrVar.fE() && e(yruVar2.a)) {
                                    yruVar = yruVar2;
                                    xscVar = xscVar2;
                                    obj = obj3;
                                    ytfVar = ytfVar2;
                                    zjdVar = zjdVarB;
                                    wloVar2 = wloVar;
                                    str = str3;
                                } else {
                                    zjdVar = zjdVarB;
                                    yruVar = yruVar2;
                                    str = str3;
                                    obj = obj3;
                                    xscVar = xscVar2;
                                    ytfVar = ytfVar2;
                                    wloVar2 = wloVar;
                                    if (yrvVar2.f(yruVar2.b, wloVar, yruVar2.d, yruVar2.f, yruVar2.c, yrrVar2.h, zjrVar, xirVar, yrrVar2.x)) {
                                        yqs yqsVar3 = yruVar.a;
                                        yqsVar2 = yqsVar3;
                                        yrvVar = this;
                                    }
                                }
                                yruVar.a.c();
                            } else {
                                xplVarC = xplVarC;
                                xscVar = xscVar2;
                                obj = obj3;
                                ytfVar = ytfVar2;
                                zjdVar = zjdVarB;
                                wloVar2 = wloVar;
                                str = str3;
                                if (str != null && j(yrrVar2.x)) {
                                    if (xirVar != null) {
                                        xirVar.f(tau.ONESIE_CACHE_MISS_CPN);
                                    }
                                    this.z.g(244);
                                }
                            }
                            zjd zjdVar2 = zjdVar;
                            yqs yqsVarA = this.g.a(yrrVar2, ytfVar, xscVar, zjdVar2, wloVar2, xplVarC, new yrs(wloVar2));
                            yrrVar2 = yrrVar2;
                            zjdVar = zjdVar2;
                            if (str != null) {
                                this.u.put(str, new yru(this, yqsVarA, wloVar, yrrVar2.x, yrrVar2.h));
                            }
                            wloVar2 = wloVar;
                            yrvVar = this;
                            yqsVar2 = yqsVarA;
                        } else {
                            zjdVar = zjdVarB;
                            if (TextUtils.equals(this.r, str3)) {
                                if (str3 == null) {
                                    wloVar2 = wloVar;
                                    yrvVar = this;
                                    str3 = null;
                                } else if (this.p != null) {
                                    zjr zjrVar2 = this.d;
                                    if ((zjrVar2.fE() && e(this.p)) || (wloVar3 = this.q) == null) {
                                        wloVar2 = wloVar;
                                        yrvVar = this;
                                    } else {
                                        wloVar2 = wloVar;
                                        yrvVar = this;
                                        if (f(wloVar3, wloVar2, this.s, this.w, this.t, yrrVar2.h, zjrVar2, xirVar, yrrVar2.x)) {
                                            yqsVar = yrvVar.p;
                                        }
                                    }
                                } else {
                                    wloVar2 = wloVar;
                                    yrvVar = this;
                                }
                                wlo wloVar4 = wloVar2;
                                yqs yqsVarA2 = yrvVar.g.a(yrrVar2, ytfVar2, xscVar2, zjdVar, wloVar4, xplVarC, new yrs(wloVar2));
                                yrrVar2 = yrrVar2;
                                zjdVar = zjdVar;
                                wloVar2 = wloVar4;
                                yrvVar.p = yqsVarA2;
                                yrvVar.r = str3;
                                yrvVar.q = wloVar2;
                                yrvVar.s = yrvVar.c.b();
                                yrvVar.w = yrrVar2.x;
                                yrvVar.t = yrrVar2.h;
                                yqsVar = yrvVar.p;
                            } else {
                                wloVar2 = wloVar;
                                yrvVar = this;
                                wlo wloVar5 = wloVar2;
                                yqs yqsVarA3 = yrvVar.g.a(yrrVar2, ytfVar2, xscVar2, zjdVar, wloVar5, xplVarC, new yrs(wloVar2));
                                yrrVar2 = yrrVar2;
                                zjdVar = zjdVar;
                                wloVar2 = wloVar5;
                                yrvVar.p = yqsVarA3;
                                yrvVar.r = str3;
                                yrvVar.q = wloVar2;
                                yrvVar.s = yrvVar.c.b();
                                yrvVar.w = yrrVar2.x;
                                yrvVar.t = yrrVar2.h;
                                yqsVar = yrvVar.p;
                            }
                            yqsVar2 = yqsVar;
                        }
                        if (z) {
                            yrvVar.g(tggVar, yrrVar2, wloVar2, yqsVar2);
                            return yqsVar2;
                        }
                        yrvVar.l.execute(afwl.i(new aads(this, tggVar, yrrVar2, wloVar2, yqsVar2, abzvVar, zjdVar, 1)));
                        return yqsVar2;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (ytg e) {
            int i2 = e.a;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                ytfVar2.e("unavailable.hotconfig", e);
            } else if (i3 == 1) {
                ytfVar2.e("unavailable.keyexpired", e);
            }
            if (zC) {
                c(tggVar, yrrVar2.b, wloVar, e);
            }
            return new yqr();
        }
    }

    public final zjd b(xir xirVar) {
        zjk zjkVar = this.m;
        zjd zjdVar = zjkVar;
        if (xirVar != null && !(xirVar instanceof xjb)) {
            zjj zjjVarG = this.A.g(xirVar);
            if (this.d.ee()) {
                zjdVar = zjkVar;
                zjjVarG.aT();
            }
            zjdVar = zjkVar;
            yno.aZ(zjjVarG);
            zjdVar = zjjVarG;
        }
        zjdVar = zjkVar;
        return zjdVar;
    }

    public final void c(tgg tggVar, String str, wlo wloVar, Exception exc) {
        zjr zjrVar = this.d;
        if (zjrVar.cM()) {
            return;
        }
        new ytf(this.e, str, this.h, zjrVar).e("innertube.fallback", exc);
        tggVar.b(wloVar);
    }

    public final void d(xir xirVar, ytf ytfVar) {
        if (this.d.j.m(97, 45401432L)) {
            if (xirVar == null || (xirVar instanceof xjb)) {
                ytfVar.e("invalid.parameter", new Exception("latencyActionLogger.".concat(xirVar == null ? "null" : "noop")));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    public final boolean f(wlo wloVar, wlo wloVar2, long j, int i, String str, String str2, zjr zjrVar, xir xirVar, int i2) {
        boolean zG;
        boolean zEquals;
        boolean zEquals2 = false;
        if (this.c.b() - j <= k) {
            tqj tqjVar = zjrVar.v;
            int i3 = tqr.a;
            int iA = tqjVar.a(1073961224);
            if (i != 4) {
                if (i == 2 ? !(i != 3 || (iA & 4) == 0) : (iA & 2) != 0) {
                    if (tqjVar.k(1073830862)) {
                        zwa zwaVarQ = wloVar.Q();
                        zwa zwaVarQ2 = wloVar2.Q();
                        zG = zwaVarQ.g();
                        boolean zG2 = zwaVarQ2.g();
                        zEquals = Objects.equals(zwaVarQ, zwaVarQ2);
                        if (zG && zG2) {
                            zEquals2 = true;
                        }
                        if (zEquals && !zEquals2) {
                            zhq zhqVar = zhq.ABR;
                        }
                    }
                    zEquals2 = TextUtils.equals(str, str2);
                    if (zEquals2) {
                        zhq zhqVar2 = zhq.ABR;
                        h(xirVar, i2);
                    } else {
                        zhq zhqVar3 = zhq.ABR;
                        i(xirVar, i2);
                    }
                }
            } else if ((iA & 1) == 0) {
                i = 4;
                if (i == 2) {
                }
            } else {
                if (tqjVar.k(1073830862)) {
                    zwa zwaVarQ3 = wloVar.Q();
                    zwa zwaVarQ4 = wloVar2.Q();
                    zG = zwaVarQ3.g();
                    boolean zG3 = zwaVarQ4.g();
                    zEquals = Objects.equals(zwaVarQ3, zwaVarQ4);
                    if (zG) {
                        zEquals2 = true;
                    }
                    if (zEquals) {
                    }
                }
                zEquals2 = TextUtils.equals(str, str2);
                if (zEquals2) {
                    zhq zhqVar4 = zhq.ABR;
                    i(xirVar, i2);
                } else {
                    zhq zhqVar5 = zhq.ABR;
                    h(xirVar, i2);
                }
            }
            zEquals2 = wloVar.q().equals(wloVar2.q());
            if (zEquals2) {
                h(xirVar, i2);
            } else {
                i(xirVar, i2);
            }
        } else if (j(i2)) {
            if (xirVar != null) {
                xirVar.f(tau.ONESIE_CACHE_MISS_TIMEOUT);
            }
            this.z.g(245);
        }
        return zEquals2;
    }

    public final void g(tgg tggVar, yrr yrrVar, wlo wloVar, yqs yqsVar) {
        int i;
        boolean z;
        zgm zgmVar = this.e;
        String str = yrrVar.b;
        hed hedVar = this.i;
        zjr zjrVar = this.d;
        hedVar.x(ywl.C(zgmVar, str, zjrVar), str);
        yqo yqoVar = (yqo) yqsVar;
        yqoVar.i();
        boolean zL = this.y.l(17, 45358592L, false);
        int i2 = yrrVar.x;
        if (i2 == 0) {
            throw null;
        }
        if (i2 != 4) {
            if (i2 != 2) {
                i = i2;
                z = zL;
            } else {
                if (!zL) {
                    return;
                }
                z = true;
                i = 2;
            }
            if (tggVar != null) {
                ahng.x(yqoVar.h, afwl.g(new yrt(this, wloVar, yrrVar, z, tggVar)), MoreExecutors.directExecutor());
            }
            if ((i == 2 && z) || zjrVar.aC() || zjrVar.j.m(207, 45631634L) || this.x.m(1, 45353838L) || zhl.bM(this.b)) {
                return;
            }
            if (zjrVar.Y().j) {
                this.n.post(new xoy(this, yrrVar, 17, null));
            } else {
                ((ytv) this.a.io()).F(yrrVar);
            }
        }
    }
}
