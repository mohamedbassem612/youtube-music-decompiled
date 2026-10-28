package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avhb extends avax implements auzz {
    static final Logger a = Logger.getLogger(avhb.class.getName());
    static final Status b = Status.m.withDescription("Channel shutdownNow invoked");
    static final Status c = Status.m.withDescription("Channel shutdown invoked");
    static final Status d = Status.m.withDescription("Subchannel shutdown invoked");
    public static final avhk e = new avhk(null, new HashMap(), new HashMap(), null, null, null);
    public static final auzx f = new avgi();
    public static final avam g = new avhx();
    public static final auyt h = new avgl();
    public final aver A;
    public final avha B;
    public final AtomicBoolean C;
    public boolean D;
    public boolean E;
    public volatile boolean F;
    public final avdk G;
    public final avdm H;
    public final auys I;
    public final auzw J;
    public final avgy K;
    public avhk L;
    public boolean M;
    public final boolean N;
    public final long O;
    public final long P;
    public final boolean Q;
    final avft R;
    public final avgm S;
    public final avbj T;
    public int U;
    public final avgj V;
    public final axst W;
    private final avki X;
    private final avbu Y;
    private final avbo Z;
    private final avav aa;
    private final aviq ab;
    private final avhw ac;
    private final avgq ad;
    private final avgq ae;
    private final long af;
    private final auyr ag;
    private final CountDownLatch ah;
    private final avhl ai;
    private final avis aj;
    private final avjt ak;
    public final avaa i;
    public final String j;
    public final avdz k;
    public final avgz l;
    public final Executor m;
    public final avkd n;
    final avcj o;
    public final auzl p;
    public final aveg q;
    public final List r;
    public final String s;
    public avbt t;
    public boolean u;
    public avgs v;
    public boolean w;
    public final Set x;
    public Collection y;
    public final Object z;

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean, int] */
    public avhb(avhf avhfVar, avdz avdzVar, avki avkiVar, avbu avbuVar, avhw avhwVar, agfr agfrVar, List list, avkd avkdVar) {
        avcj avcjVar = new avcj(new avgk(this, 0));
        this.o = avcjVar;
        this.q = new aveg();
        this.x = new HashSet(16, 0.75f);
        this.z = new Object();
        this.B = new avha(this);
        this.C = new AtomicBoolean(false);
        this.ah = new CountDownLatch(1);
        this.U = 1;
        this.L = e;
        this.M = false;
        this.W = new axst();
        atxy atxyVar = auzi.c;
        avgp avgpVar = new avgp(this);
        this.ai = avgpVar;
        this.R = new avgr(this);
        this.S = new avgm(this);
        avjt avjtVar = avhfVar.G;
        avjtVar.getClass();
        this.ak = avjtVar;
        String str = avhfVar.m;
        str.getClass();
        this.j = str;
        avaa avaaVarB = avaa.b("Channel", str);
        this.i = avaaVarB;
        avkdVar.getClass();
        this.n = avkdVar;
        avhw avhwVar2 = avhfVar.h;
        avhwVar2.getClass();
        this.ac = avhwVar2;
        ?? A = avhwVar2.a();
        A.getClass();
        this.m = A;
        aviq aviqVar = new aviq(avdzVar);
        this.ab = aviqVar;
        avhw avhwVar3 = avhfVar.i;
        avhwVar3.getClass();
        avgq avgqVar = new avgq(avhwVar3);
        this.ae = avgqVar;
        avdj avdjVar = new avdj(aviqVar, avgqVar);
        this.k = avdjVar;
        avgz avgzVar = new avgz(avdjVar.a());
        this.l = avgzVar;
        avdm avdmVar = new avdm(avaaVarB, avkdVar.a(), "Channel for '" + str + '\'');
        this.H = avdmVar;
        avdl avdlVar = new avdl(avdmVar, avkdVar);
        this.I = avdlVar;
        avca avcaVar = avfp.j;
        boolean z = avhfVar.w;
        this.Q = z;
        avdg avdgVar = new avdg(avaw.b(), avhfVar.o);
        this.aa = avdgVar;
        this.X = avkiVar;
        this.Y = avbuVar;
        avbs avbsVar = new avbs(z, avhfVar.s, avhfVar.t, avdgVar);
        avhu avhuVar = new avhu(avhfVar.E, avbi.a());
        this.T = avhuVar;
        avbm avbmVar = new avbm();
        avbmVar.a = 443;
        avcaVar.getClass();
        avbmVar.b = avcaVar;
        avbmVar.c = avcjVar;
        avbmVar.e = avgzVar;
        avbmVar.d = avbsVar;
        avbmVar.f = avdlVar;
        avbmVar.g = avgqVar;
        avbmVar.h = avhuVar;
        avbmVar.i = avhfVar.k;
        avjtVar.getClass();
        avbo avboVar = new avbo(avbmVar);
        this.Z = avboVar;
        this.t = n(avkiVar, avbuVar, avboVar);
        this.ad = new avgq(avhwVar);
        aver averVar = new aver(A, avcjVar);
        this.A = averVar;
        averVar.f = avgpVar;
        averVar.c = new avep(avgpVar, 0);
        averVar.d = new avep(avgpVar, 2);
        averVar.e = new avep(avgpVar, 3);
        boolean z2 = avhfVar.y;
        this.N = z2;
        avgy avgyVar = new avgy(this, this.t.a());
        this.K = avgyVar;
        this.ag = atxy.o(avgyVar, list);
        this.r = new ArrayList(avhfVar.l);
        agfrVar.getClass();
        long j = avhfVar.r;
        if (j == -1) {
            this.af = -1L;
        } else {
            ahno.J(((j > avhf.d ? 1 : (j == avhf.d ? 0 : -1)) ^ (-1)) >>> 31, "invalid idleTimeoutMillis %s", j);
            this.af = avhfVar.r;
        }
        this.aj = new avis(new avep(this, 20), avcjVar, avdjVar.a(), new agfp());
        auzl auzlVar = avhfVar.p;
        auzlVar.getClass();
        this.p = auzlVar;
        avhfVar.q.getClass();
        this.s = avhfVar.n;
        this.P = avhfVar.u;
        this.O = avhfVar.v;
        avgj avgjVar = new avgj(avkdVar);
        this.V = avgjVar;
        this.G = avgjVar.a();
        auzw auzwVar = avhfVar.x;
        auzwVar.getClass();
        this.J = auzwVar;
        auzw.a(auzwVar.b, this);
        if (z2) {
            return;
        }
        this.M = true;
    }

    static avbt n(avki avkiVar, avbu avbuVar, avbo avboVar) {
        avbt avbtVarA = avkiVar.a(avbuVar, avboVar);
        if (avbtVarA == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(avkiVar))));
        }
        ScheduledExecutorService scheduledExecutorService = avboVar.d;
        if (scheduledExecutorService != null) {
            return new avjl(avbtVarA, new avdh(scheduledExecutorService, avboVar.b));
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    @Override // defpackage.auyr
    public final auyt a(avbh avbhVar, auyq auyqVar) {
        return this.ag.a(avbhVar, auyqVar);
    }

    @Override // defpackage.auyr
    public final String b() {
        return this.ag.b();
    }

    @Override // defpackage.avae
    public final avaa c() {
        return this.i;
    }

    public final Executor f(auyq auyqVar) {
        Executor executor = auyqVar.c;
        return executor == null ? this.m : executor;
    }

    public final void g(boolean z) {
        ScheduledFuture scheduledFuture;
        avis avisVar = this.aj;
        avisVar.e = false;
        if (!z || (scheduledFuture = avisVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        avisVar.f = null;
    }

    final void h() {
        this.o.c();
        if (this.C.get() || this.w) {
            return;
        }
        if (this.R.a.isEmpty()) {
            k();
        } else {
            g(false);
        }
        if (this.v == null) {
            this.I.a(2, "Exiting idle mode");
            avgs avgsVar = new avgs(this);
            avgsVar.a = new avdf((avdg) this.aa, avgsVar);
            this.v = avgsVar;
            this.q.a(auzd.a);
            this.t.d(new avgt(this, avgsVar, this.t));
            this.u = true;
        }
    }

    public final void i() {
        if (this.D) {
            for (avge avgeVar : this.x) {
                Status status = b;
                avgeVar.f(status);
                avgeVar.g.execute(new aves(avgeVar, status, 8));
            }
        }
    }

    public final void j() {
        if (!this.F && this.C.get() && this.x.isEmpty()) {
            this.I.a(2, "Terminated");
            auzw.b(this.J.b, this);
            this.ac.b(this.m);
            this.ad.b();
            this.ae.b();
            this.k.close();
            this.F = true;
            this.ah.countDown();
        }
    }

    public final void k() {
        long j = this.af;
        if (j != -1) {
            avis avisVar = this.aj;
            long nanos = TimeUnit.MILLISECONDS.toNanos(j);
            long jA = avisVar.a() + nanos;
            avisVar.e = true;
            if (jA - avisVar.d < 0 || avisVar.f == null) {
                ScheduledFuture scheduledFuture = avisVar.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                avisVar.f = avisVar.a.schedule(new avgv(avisVar, 11), nanos, TimeUnit.NANOSECONDS);
            }
            avisVar.d = jA;
        }
    }

    public final void l(boolean z) {
        this.o.c();
        if (z) {
            ahno.P(this.u, "nameResolver is not started");
            ahno.P(this.v != null, "lbHelper is null");
        }
        avbt avbtVar = this.t;
        if (avbtVar != null) {
            avbtVar.c();
            this.u = false;
            if (z) {
                this.t = n(this.X, this.Y, this.Z);
            } else {
                this.t = null;
            }
        }
        avgs avgsVar = this.v;
        if (avgsVar != null) {
            avgsVar.a.c();
            this.v = null;
        }
    }

    public final void m(avar avarVar) {
        this.A.d(avarVar);
    }

    @Override // defpackage.avax
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void d() {
        this.I.a(1, "shutdown() called");
        if (this.C.compareAndSet(false, true)) {
            avcj avcjVar = this.o;
            avcjVar.execute(new avep(this, 18));
            avgy avgyVar = this.K;
            avgyVar.c.o.execute(new avgv(avgyVar, 0));
            avcjVar.execute(new avep(this, 17));
        }
    }

    @Override // defpackage.avax
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void e() {
        this.I.a(1, "shutdownNow() called");
        d();
        avgy avgyVar = this.K;
        avgyVar.c.o.execute(new avgv(avgyVar, 2));
        this.o.execute(new avep(this, 19));
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.f("logId", this.i.a);
        ageuVarAc.b("target", this.j);
        return ageuVarAc.toString();
    }
}
