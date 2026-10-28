package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tkr extends tlj {
    private final Optional A;
    private final Optional B;
    private final Optional C;
    private volatile transient toh D;
    private volatile transient boolean E;
    private volatile transient ExecutorService F;
    private volatile transient ExecutorService G;
    public final awmd a;
    public final awmd b;
    public final tao c;
    public final mbc d;
    public final ScheduledExecutorService e;
    public final tfx f;
    public final Executor g;
    public final tmo h;
    public final Optional i;
    public final boolean j;
    public final Executor k;
    public final awmd l;
    public final tgv m;
    public final tqj n;
    public volatile transient boolean o;
    public volatile transient boolean p;
    public final vxz q;
    public final vwt r;
    private final ajcb s;
    private final tgl t;
    private final int u;
    private final String v;
    private final long w;
    private final tli x;
    private final tli y;
    private final Optional z;

    public tkr(awmd awmdVar, awmd awmdVar2, tao taoVar, mbc mbcVar, ajcb ajcbVar, ScheduledExecutorService scheduledExecutorService, tfx tfxVar, Executor executor, tgl tglVar, tmo tmoVar, Optional optional, int i, String str, long j, boolean z, Executor executor2, tli tliVar, tli tliVar2, Optional optional2, Optional optional3, Optional optional4, Optional optional5, awmd awmdVar3, tgv tgvVar, tqj tqjVar, vxz vxzVar, vwt vwtVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = taoVar;
        this.d = mbcVar;
        this.s = ajcbVar;
        this.e = scheduledExecutorService;
        this.f = tfxVar;
        this.g = executor;
        this.t = tglVar;
        this.h = tmoVar;
        this.i = optional;
        this.u = i;
        this.v = str;
        this.w = j;
        this.j = z;
        this.k = executor2;
        this.x = tliVar;
        this.y = tliVar2;
        this.z = optional2;
        this.A = optional3;
        this.B = optional4;
        this.C = optional5;
        this.l = awmdVar3;
        this.m = tgvVar;
        this.n = tqjVar;
        this.q = vxzVar;
        this.r = vwtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r0v17 */
    @Override // defpackage.tlj
    public final ExecutorService A() {
        int i;
        ?? threadPoolExecutor;
        if (this.F == null) {
            synchronized (this) {
                if (this.F == null) {
                    ajcb ajcbVar = ((tkx) this.x).a;
                    Optional optional = this.z;
                    if (optional.isPresent()) {
                        threadPoolExecutor = optional.get();
                    } else {
                        int i2 = this.u;
                        if (i2 == 1) {
                            i2 = 1;
                            i = 1;
                        } else {
                            i = ajcbVar.h;
                        }
                        threadPoolExecutor = new ThreadPoolExecutor(i, i2 == 1 ? 1 : ajcbVar.i, i2 == 1 ? 0L : ajcbVar.e, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new szw(10, "cronet-".concat(this.v)));
                    }
                    this.F = threadPoolExecutor;
                    if (this.F == null) {
                        throw new NullPointerException("normalExecutor() cannot return null");
                    }
                }
            }
        }
        return this.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    @Override // defpackage.tlj
    public final ExecutorService B() {
        ?? A;
        if (this.G == null) {
            synchronized (this) {
                if (this.G == null) {
                    ajcb ajcbVar = ((tkx) this.y).a;
                    Optional optional = this.A;
                    if (optional.isPresent()) {
                        A = optional.get();
                    } else {
                        A = (this.u == 1 || !ajcbVar.d) ? A() : new ThreadPoolExecutor(ajcbVar.f, ajcbVar.g, ajcbVar.e, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new szw(0, "cronetPrio-".concat(this.v)));
                    }
                    this.G = A;
                    if (this.G == null) {
                        throw new NullPointerException("priorityExecutor() cannot return null");
                    }
                }
            }
        }
        return this.G;
    }

    @Override // defpackage.tlj
    public final vxz C() {
        return this.q;
    }

    @Override // defpackage.tlj
    public final vwt E() {
        return this.r;
    }

    @Override // defpackage.ths
    public final tao a() {
        return this.c;
    }

    @Override // defpackage.ths
    public final awmd b() {
        return this.a;
    }

    @Override // defpackage.ths
    public final awmd c() {
        return this.b;
    }

    @Override // defpackage.tlj
    public final int d() {
        return this.u;
    }

    @Override // defpackage.tlj
    public final long e() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        tfx tfxVar;
        Executor executor;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tlj) {
            tlj tljVar = (tlj) obj;
            if (this.a.equals(tljVar.b()) && this.b.equals(tljVar.c()) && this.c.equals(tljVar.a()) && this.d.equals(tljVar.f()) && this.s.equals(tljVar.n()) && this.e.equals(tljVar.w()) && ((tfxVar = this.f) != null ? tfxVar.equals(tljVar.g()) : tljVar.g() == null) && ((executor = this.g) != null ? executor.equals(tljVar.v()) : tljVar.v() == null) && this.t.equals(tljVar.h()) && this.h.equals(tljVar.l()) && this.i.equals(tljVar.o())) {
                tljVar.D();
                if (this.u == tljVar.d() && this.v.equals(tljVar.t()) && this.w == tljVar.e() && this.j == tljVar.y() && this.k.equals(tljVar.u()) && this.x.equals(tljVar.j()) && this.y.equals(tljVar.k()) && this.z.equals(tljVar.q()) && this.A.equals(tljVar.s()) && this.B.equals(tljVar.p()) && this.C.equals(tljVar.r()) && this.l.equals(tljVar.x()) && this.m.equals(tljVar.i()) && this.n.equals(tljVar.m()) && this.q.equals(tljVar.C()) && this.r.equals(tljVar.E())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.tlj
    public final mbc f() {
        return this.d;
    }

    @Override // defpackage.tlj
    public final tfx g() {
        return this.f;
    }

    @Override // defpackage.tlj
    public final tgl h() {
        return this.t;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.e.hashCode();
        tfx tfxVar = this.f;
        int iHashCode2 = ((iHashCode * 1000003) ^ (tfxVar == null ? 0 : tfxVar.hashCode())) * 1000003;
        Executor executor = this.g;
        return ((((((((((((((((((((((((((((((((((((((iHashCode2 ^ (executor != null ? executor.hashCode() : 0)) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * (-721379959)) ^ this.u) * 1000003) ^ this.v.hashCode()) * 1000003) ^ ((int) this.w)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.x.hashCode()) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003) ^ this.B.hashCode()) * 1000003) ^ this.C.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode();
    }

    @Override // defpackage.tlj
    public final tgv i() {
        return this.m;
    }

    @Override // defpackage.tlj
    public final tli j() {
        return this.x;
    }

    @Override // defpackage.tlj
    public final tli k() {
        return this.y;
    }

    @Override // defpackage.tlj
    public final tmo l() {
        return this.h;
    }

    @Override // defpackage.tlj
    public final tqj m() {
        return this.n;
    }

    @Override // defpackage.tlj
    public final ajcb n() {
        return this.s;
    }

    @Override // defpackage.tlj
    public final Optional o() {
        return this.i;
    }

    @Override // defpackage.tlj
    public final Optional p() {
        return this.B;
    }

    @Override // defpackage.tlj
    public final Optional q() {
        return this.z;
    }

    @Override // defpackage.tlj
    public final Optional r() {
        return this.C;
    }

    @Override // defpackage.tlj
    public final Optional s() {
        return this.A;
    }

    @Override // defpackage.tlj
    public final String t() {
        return this.v;
    }

    public final String toString() {
        vwt vwtVar = this.r;
        vxz vxzVar = this.q;
        tqj tqjVar = this.n;
        tgv tgvVar = this.m;
        awmd awmdVar = this.l;
        Optional optional = this.C;
        Optional optional2 = this.B;
        Optional optional3 = this.A;
        Optional optional4 = this.z;
        tli tliVar = this.y;
        tli tliVar2 = this.x;
        Executor executor = this.k;
        Optional optional5 = this.i;
        tmo tmoVar = this.h;
        tgl tglVar = this.t;
        Executor executor2 = this.g;
        tfx tfxVar = this.f;
        ScheduledExecutorService scheduledExecutorService = this.e;
        ajcb ajcbVar = this.s;
        mbc mbcVar = this.d;
        tao taoVar = this.c;
        awmd awmdVar2 = this.b;
        return "CronetRequestQueueConfig{cronetEngineProvider=" + this.a.toString() + ", headerDecoratorProvider=" + awmdVar2.toString() + ", commonConfigs=" + taoVar.toString() + ", clock=" + mbcVar.toString() + ", androidCrolleyConfig=" + ajcbVar.toString() + ", timeoutExecutor=" + scheduledExecutorService.toString() + ", requestFinishedListener=" + String.valueOf(tfxVar) + ", requestFinishedListenerExecutor=" + String.valueOf(executor2) + ", volleyNetworkConfig=" + tglVar.toString() + ", cache=" + tmoVar.toString() + ", cacheEventLogger=" + optional5.toString() + ", requestLogger=null, threadPoolSize=" + this.u + ", threadPoolTag=" + this.v + ", connectionTimeout=" + this.w + ", shouldIgnoreReadTimeout=" + this.j + ", deliveryExecutor=" + executor.toString() + ", normalExecutorGenerator=" + tliVar2.toString() + ", priorityExecutorGenerator=" + tliVar.toString() + ", normalExecutorOverride=" + optional4.toString() + ", priorityExecutorOverride=" + optional3.toString() + ", normalCoroutineScope=" + optional2.toString() + ", priorityCoroutineScope=" + optional.toString() + ", requestCompletionListenerProvider=" + awmdVar.toString() + ", networkRequestTracker=" + tgvVar.toString() + ", bootstrapStore=" + tqjVar.toString() + ", mobileFrameworksFlags=" + vxzVar.toString() + ", promiseKeeper=" + String.valueOf(vwtVar) + '}';
    }

    @Override // defpackage.tlj
    public final Executor u() {
        return this.k;
    }

    @Override // defpackage.tlj
    public final Executor v() {
        return this.g;
    }

    @Override // defpackage.tlj
    public final ScheduledExecutorService w() {
        return this.e;
    }

    @Override // defpackage.tlj
    public final awmd x() {
        return this.l;
    }

    @Override // defpackage.tlj
    public final boolean y() {
        return this.j;
    }

    @Override // defpackage.tlj
    public final toh z() {
        if (!this.E) {
            synchronized (this) {
                if (!this.E) {
                    this.D = this.t.a.d ? new toh() : null;
                    this.E = true;
                }
            }
        }
        return this.D;
    }

    @Override // defpackage.tlj
    public final void D() {
    }
}
