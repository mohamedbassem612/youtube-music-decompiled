package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.video.mediaengine.effects.skia.SkiaLayerLruCache;
import com.google.research.aimatter.drishti.DrishtiCache;
import com.google.research.aimatter.drishti.DrishtiLruCache;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdr implements rda, req, rdh, qun, rdn, rcy {
    public static final rbm I = new rbm("rdr");
    public static final Duration a = Duration.ofSeconds(5);
    public static final Duration b = Duration.ofSeconds(3);
    static final Duration c = Duration.ofMillis(500);
    public rja A;
    public boolean B;
    public boolean C;
    public Optional D;
    public Instant E;
    public Instant F;
    public Surface G;
    public DrishtiCache H;
    public ijt J;
    public final ahgb K;
    private final Optional L;
    private Optional M;
    private boolean N;
    private final Optional O;
    private final Optional P;
    private DrishtiLruCache Q;
    private SkiaLayerLruCache R;
    private rhh S;
    public final rde d;
    public final rdt e;
    public final rdl f;
    public final rdj g;
    public final ReentrantLock h;
    public final rdo i;
    public final AtomicReference j;
    public final rdb k;
    public final Context l;
    public final Handler m;
    public final qyo n;
    public final ahbw o;
    public final qum p;
    public volatile qyt q;
    public Size r;
    public Size s;
    public rcz t;
    public qzf u;
    public rfn v;
    public rbo w;
    public rdi x;
    public rjb y;
    public rek z;

    public rdr(quc qucVar, Surface surface, Size size, Optional optional, Context context, qum qumVar, Optional optional2, qua quaVar, Optional optional3, ahgb ahgbVar) {
        ahbv ahbvVar = ahbv.INSTANCE;
        this.d = new rde();
        this.e = new rdt();
        this.f = new rdl();
        this.g = new rdj();
        this.h = new ReentrantLock(true);
        this.j = new AtomicReference();
        this.B = false;
        this.C = false;
        this.N = false;
        this.D = Optional.empty();
        this.E = null;
        this.F = null;
        this.G = surface;
        this.r = size;
        this.M = optional;
        this.l = context;
        this.p = qumVar;
        this.L = optional2;
        this.q = qyu.a(quaVar);
        this.n = new qyo(qucVar, this.q);
        this.m = new Handler(Looper.myLooper());
        Optional optionalOfNullable = Optional.ofNullable(null);
        if (true == optionalOfNullable.isPresent()) {
            jsk jskVar = (jsk) optionalOfNullable.get();
            sry sryVarA = quo.a();
            sryVarA.a = jskVar;
            sryVarA.b = Optional.ofNullable(null);
            optionalOfNullable = Optional.ofNullable(sryVarA.e());
        }
        this.O = optionalOfNullable;
        this.P = optional3;
        this.y = quaVar.n ? new rjb(false) : rjb.a;
        this.K = ahgbVar;
        this.o = ahbvVar;
        F();
        this.k = new rdb(this);
        this.i = new rdo(this.q, this);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0366  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    private final void O(Optional optional) {
        int i;
        int i2;
        boolean z;
        rdr rdrVar = this;
        if (rdrVar.B) {
            return;
        }
        rdo rdoVar = rdrVar.i;
        synchronized (rdoVar.a) {
            rdoVar.f = true;
            i = 0;
            rdoVar.g = false;
            i2 = 3;
            rdoVar.f(3);
        }
        rjb rjbVar = rdrVar.y;
        synchronized (rjbVar.b) {
            z = rjbVar.c;
        }
        if (z && rdrVar.q.a.n) {
            rdrVar.y = rdrVar.q.a.n ? new rjb(false) : rjb.a;
        }
        if (rdrVar.v == null) {
            try {
                EGLContext eGLContext = (EGLContext) Optional.ofNullable(null).orElse(rdrVar.q.a.m ? null : EGL14.eglGetCurrentContext());
                boolean z2 = rdrVar.q.a.s;
                qyt qytVar = rdrVar.q;
                rdrVar.v = z2 ? new rfn(eGLContext, true, qytVar) : new rfn(eGLContext, false, qytVar);
            } catch (bvn e) {
                rbc rbcVar = new rbc(I, rbd.e);
                rbcVar.a = e;
                rbcVar.c();
                rbcVar.a("Failed to initialize GlResourceManager", new Object[0]);
                return;
            }
        }
        rdi rdiVar = rdrVar.x;
        if (rdiVar == null) {
            try {
                boolean z3 = rdrVar.q.a.s;
                rfn rfnVar = rdrVar.v;
                try {
                    rdiVar = new rdi(z3 ? rfnVar.b() : rfnVar.a, rdrVar.G, rdrVar.r, rdrVar.l, rdrVar, rdrVar.q.a.s);
                    rdrVar = rdrVar;
                    rdiVar.setUncaughtExceptionHandler(new rdf(i));
                    rdiVar.setName("FrameRendererThread");
                    rdiVar.start();
                    try {
                        if (rdiVar.h()) {
                            rdrVar.x = rdiVar;
                        } else {
                            rbc rbcVar2 = new rbc(rdi.k, rbd.e);
                            rbcVar2.a = new IllegalStateException("Wait until ready failed .");
                            rbcVar2.c();
                            rbcVar2.a("Failed to initialize Frame Renderer Thread.", new Object[0]);
                            rdiVar = null;
                            rdrVar.x = rdiVar;
                        }
                    } catch (InterruptedException e2) {
                        rbc rbcVar3 = new rbc(rdi.k, rbd.e);
                        rbcVar3.a = e2;
                        rbcVar3.c();
                        rbcVar3.a("Thread interrupted while waiting for the frame renderer thread to be ready.", new Object[0]);
                    }
                } catch (bvn e3) {
                    e = e3;
                    rdrVar = rdrVar;
                    rbc rbcVar4 = new rbc(I, rbd.d);
                    rbcVar4.a = e;
                    rbcVar4.c();
                    rbcVar4.a("Failed to create frame renderer thread.", new Object[0]);
                }
            } catch (bvn e4) {
                e = e4;
                rbc rbcVar5 = new rbc(I, rbd.d);
                rbcVar5.a = e;
                rbcVar5.c();
                rbcVar5.a("Failed to create frame renderer thread.", new Object[0]);
            }
            e = e4;
            rbc rbcVar6 = new rbc(I, rbd.d);
            rbcVar6.a = e;
            rbcVar6.c();
            rbcVar6.a("Failed to create frame renderer thread.", new Object[0]);
            if (rdrVar.q.a.s) {
            }
            rdrVar.v.e();
            rdrVar.v = null;
        }
        if (rdiVar != null) {
            rbj rbjVar = new rbj(rdrVar, 7);
            if (true == optional.isPresent()) {
                ((rdr) rbjVar.a).g.c((Duration) optional.get());
            }
            if (rdrVar.u == null) {
                int i3 = qzf.f;
                qyu.a(qua.a());
                Context context = rdrVar.l;
                qyt qytVar2 = rdrVar.q;
                rjb rjbVar2 = rdrVar.y;
                rjbVar2.getClass();
                rdrVar.u = new qzf(context, rdrVar, qytVar2, rjbVar2);
            }
            if (rdrVar.H == null) {
                rdrVar.H = new DrishtiCache();
            }
            if (rdrVar.S == null) {
                rdrVar.S = new rhh(Optional.ofNullable(null), Optional.ofNullable(null));
            }
            if (rdrVar.Q == null) {
                rdrVar.Q = new DrishtiLruCache();
            }
            if (rdrVar.R == null) {
                long jNativeCreateCache = SkiaLayerLruCache.nativeCreateCache(rdrVar.q.i);
                rdrVar.R = new SkiaLayerLruCache(jNativeCreateCache, new AtomicBoolean(jNativeCreateCache != 0));
            }
            int i4 = 13;
            if (rdrVar.D.isEmpty()) {
                ahgb ahgbVar = rdrVar.K;
                hlx hlxVar = new hlx(ahgbVar, i4);
                Optional optional2 = (Optional) ahgbVar.c;
                optional2.isPresent();
                Object obj = hlxVar.a;
                Object obj2 = optional2.get();
                ahgb ahgbVar2 = (ahgb) obj;
                apsd apsdVar = (apsd) rbh.b.b(ahgbVar2.e);
                Optional optionalOf = Optional.of((apsc) rbh.a.b(ahgbVar2.d));
                aihf aihfVarCreateBuilder = aske.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aske askeVar = (aske) aihfVarCreateBuilder.instance;
                askeVar.c = ((anck) ahgbVar2.b).h;
                askeVar.b |= 1;
                rdrVar.D = Optional.ofNullable(((aczl) obj2).p(apsdVar, optionalOf, (Optional) ahgbVar2.a, (aske) aihfVarCreateBuilder.build()));
            }
            if (rdrVar.w == null) {
                rdrVar.w = new rbo(rdrVar.D, rdrVar.q, rbo.a);
            }
            if (rdrVar.t == null) {
                rcz rczVar = new rcz(rjo.a(rdrVar.n.c), rdrVar.l, rdrVar.g, rdrVar, rdrVar.q, rdrVar.O, rdrVar.P, this, this, rdrVar.y);
                rdrVar.t = rczVar;
                rczVar.n = new tld("ME:AudioApplication", 0);
                rczVar.n.l(new rcu(rczVar, 2));
            }
            if (rdrVar.A == null) {
                try {
                    rja rjaVar = new rja(rdrVar.v.b(), rja.a);
                    riy riyVar = rjaVar.b;
                    riyVar.setUncaughtExceptionHandler(new rdf(i2));
                    riyVar.start();
                    try {
                        if (!riyVar.h()) {
                            throw new IllegalStateException("Failed to initialize Engine Thread.");
                        }
                        rdrVar.A = rjaVar;
                        rjaVar.c();
                    } catch (InterruptedException e5) {
                        rbc rbcVar7 = new rbc(rja.d, rbd.e);
                        rbcVar7.a = e5;
                        rbcVar7.c();
                        rbcVar7.a("Interrupted while waiting for GlThread to become ready.", new Object[0]);
                        throw new IllegalStateException("Failed to initialize Engine Thread.", e5);
                    }
                } catch (bvn e6) {
                    tge tgeVarA = quk.a();
                    tgeVarA.b = e6;
                    tgeVarA.e = "Failed to initialize EngineThreadManager";
                    tgeVarA.c = new quf(4);
                    rdrVar.D(tgeVarA.e());
                    throw new IllegalStateException("Failed to initialize EngineThreadManager", e6);
                }
            }
            if (rdrVar.z == null) {
                uze uzeVar = new uze(null);
                uzeVar.b = rdrVar;
                uzeVar.c = new rdy(rdrVar);
                uzeVar.a = rdrVar.n.c;
                uzeVar.d = (Duration) optional.orElse(Duration.ZERO);
                rek rekVar = new rek(uzeVar);
                rekVar.j((Duration) uzeVar.d);
                rekVar.k((Duration) uzeVar.d);
                if (((rdr) uzeVar.b).q.a.I && a.y((Duration) uzeVar.d)) {
                    rekVar.iz((Duration) uzeVar.d);
                } else {
                    ((rih) rekVar.i).b((Duration) uzeVar.d);
                    rekVar.c.submit(new rcu(rekVar, i4));
                    rekVar.h();
                }
                rdrVar.z = rekVar;
            }
            if (rdrVar.J == null) {
                rdrVar.J = new ijt((char[]) null);
            }
            rdrVar.B = true;
            rde rdeVar = rdrVar.d;
            synchronized (rdeVar.b) {
                rdeVar.d = false;
                rdeVar.b();
            }
            rdt rdtVar = rdrVar.e;
            synchronized (rdtVar.b) {
                rdtVar.d = false;
            }
            rdrVar.k.a();
            return;
        }
        if (rdrVar.q.a.s) {
            rdrVar.v.e();
            rdrVar.v = null;
        }
    }

    public final void A(final Consumer consumer) {
        C(new Runnable() { // from class: rdq
            @Override // java.lang.Runnable
            public final void run() {
                consumer.r(this.a.p);
            }
        });
    }

    public final void B() {
        O(Optional.empty());
    }

    public final void C(Runnable runnable) {
        Handler handler = this.m;
        if (handler.getLooper().isCurrentThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final void D(quk qukVar) {
        agke agkeVarQ;
        qyt qytVar = this.q;
        qud qudVar = qukVar.d;
        if (qudVar instanceof quf) {
            if (((quf) qudVar).a == 4) {
                return;
            }
        } else if (qudVar instanceof quh) {
            if (((quh) qudVar).b == 4) {
                return;
            }
        } else if (qudVar instanceof quj) {
            if (((quj) qudVar).a == 4) {
                return;
            }
        } else if ((qudVar instanceof qui) && ((qui) qudVar).a() == 4) {
            return;
        }
        tge tgeVar = new tge(qukVar);
        tgeVar.a = 2;
        quk qukVarE = tgeVar.e();
        qyo qyoVar = this.n;
        qud qudVar2 = qukVarE.d;
        quc qucVar = qyoVar.c;
        byte[] bArr = null;
        int i = 14;
        if (qudVar2 instanceof quh) {
            quh quhVar = (quh) qudVar2;
            Optional optionalFindFirst = Collection.EL.stream(qucVar.c()).filter(new jmy(quhVar, 9)).filter(new jor(18)).findFirst();
            agkeVarQ = (optionalFindFirst.isEmpty() || !(optionalFindFirst.get() instanceof rcj)) ? agke.q(qukVarE) : (agke) Collection.EL.stream(((rcj) optionalFindFirst.get()).w()).map(new hph(qukVarE, quhVar, i, bArr)).collect(aghu.a);
        } else {
            agkeVarQ = agke.q(qukVarE);
        }
        int size = agkeVarQ.size();
        for (int i2 = 0; i2 < size; i2++) {
            quk qukVar2 = (quk) agkeVarQ.get(i2);
            rbc rbcVar = new rbc(I, rbd.d);
            rbcVar.c();
            rbcVar.a = new Exception((String) Optional.ofNullable(qukVar.b).orElse("No error message"), qukVar.c);
            rbcVar.a("Player error", new Object[0]);
            A(new rcp(qukVar, 6));
            C(new plj(this, qukVar2, 14, null));
        }
    }

    public final void E(Duration duration) {
        A(new hfo(this, duration, 19, null));
    }

    public final void F() {
        Size size = (Size) this.M.orElse(this.r);
        this.s = new Size(size.getWidth() / this.q.g, size.getHeight() / this.q.g);
    }

    public final void G() {
        I();
        rde rdeVar = this.d;
        synchronized (rdeVar.b) {
            rdeVar.d = true;
            rdeVar.b();
        }
        rdt rdtVar = this.e;
        synchronized (rdtVar.b) {
            rdtVar.d = true;
            zhk zhkVar = rdtVar.c.b;
            if (zhkVar != null) {
                zhkVar.h();
            }
            rdtVar.c = new rds(null, null);
        }
        try {
            rdl rdlVar = this.f;
            rdlVar.a(rdk.b, new fxv(11));
            rdlVar.a(rdk.a, new fxv(12));
            ahex ahexVar = rdlVar.a;
            ahexVar.getClass();
            rjs.b(ahexVar, "engine tasks thread");
            Iterable$EL.forEach(rdlVar.b.values(), new hgi(11));
            rdlVar.a = null;
        } catch (InterruptedException e) {
            rbc rbcVar = new rbc(I, rbd.c);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Interrupted while waiting for operations to complete.", new Object[0]);
        }
        if (!this.q.a.v) {
            this.y.j();
        }
        this.i.c(new rdm(1, false));
        rdb rdbVar = this.k;
        if (rdbVar.b) {
            rdbVar.b = false;
            rdbVar.a.removeFrameCallback(rdbVar);
        }
        this.B = false;
        this.N = false;
        rcz rczVar = this.t;
        if (rczVar != null) {
            try {
                rczVar.close();
                this.t = null;
            } catch (InterruptedException e2) {
                throw new IllegalStateException("Error closing audioPlayer", e2);
            }
        }
        rek rekVar = this.z;
        if (rekVar != null) {
            try {
                rekVar.close();
                this.z = null;
            } catch (Exception e3) {
                throw new IllegalStateException("Error closing compositionRenderer", e3);
            }
        }
        rja rjaVar = this.A;
        if (rjaVar != null) {
            try {
                riy riyVar = rjaVar.b;
                Looper looper = riyVar.n;
                if (looper != null) {
                    rjs.a(riyVar, looper);
                } else {
                    rbc rbcVar2 = new rbc(rja.d, rbd.d);
                    rbcVar2.c();
                    rbcVar2.a("Engine thread is not running. Cannot stop it.", new Object[0]);
                }
            } catch (InterruptedException e4) {
                rbc rbcVar3 = new rbc(rja.d, rbd.d);
                rbcVar3.a = e4;
                rbcVar3.c();
                rbcVar3.a("Interrupted while waiting for engine thread to finish.", new Object[0]);
            }
            this.A = null;
        }
        rdi rdiVar = this.x;
        if (rdiVar != null) {
            try {
                Looper looper2 = rdiVar.n;
                if (looper2 != null) {
                    rjs.a(rdiVar, looper2);
                } else {
                    rbc rbcVar4 = new rbc(I, rbd.e);
                    rbcVar4.c();
                    rbcVar4.a("Frame renderer thread looper is already null.", new Object[0]);
                }
            } catch (InterruptedException e5) {
                rbc rbcVar5 = new rbc(I, rbd.d);
                rbcVar5.a = e5;
                rbcVar5.c();
                rbcVar5.a("Interrupted while waiting for frame renderer thread to finish.", new Object[0]);
            }
            this.x = null;
        }
        if (this.q.a.v) {
            this.y.j();
        }
        DrishtiCache drishtiCache = this.H;
        if (drishtiCache != null) {
            if (drishtiCache.b.compareAndSet(true, false)) {
                drishtiCache.nativeReleaseCache(drishtiCache.a);
            }
            this.H = null;
        }
        DrishtiLruCache drishtiLruCache = this.Q;
        if (drishtiLruCache != null) {
            if (drishtiLruCache.b.compareAndSet(true, false)) {
                drishtiLruCache.nativeReleaseLruCache(drishtiLruCache.a);
            }
            this.Q = null;
        }
        SkiaLayerLruCache skiaLayerLruCache = this.R;
        if (skiaLayerLruCache != null) {
            if (skiaLayerLruCache.b.compareAndSet(true, false)) {
                SkiaLayerLruCache.nativeReleaseCache(skiaLayerLruCache.a);
            }
            this.R = null;
        }
        rhh rhhVar = this.S;
        if (rhhVar != null) {
            synchronized (rhhVar.a) {
                atwd atwdVar = rhhVar.d;
                if (atwdVar != null) {
                    atwdVar.b.writeLock().lock();
                    try {
                        long j = atwdVar.a;
                        if (j != 0) {
                            atwd.nativeDestroyHandle(j);
                        }
                        atwdVar.a = 0L;
                        atwdVar.b.writeLock().unlock();
                    } catch (Throwable th) {
                        atwdVar.b.writeLock().unlock();
                        throw th;
                    }
                }
                atwc atwcVar = rhhVar.e;
                if (atwcVar != null) {
                    atwcVar.e.writeLock().lock();
                    try {
                        long j2 = atwcVar.d;
                        if (j2 != 0) {
                            atwc.nativeDestroyHandle(j2);
                        }
                        atwcVar.d = 0L;
                        atwcVar.e.writeLock().unlock();
                    } catch (Throwable th2) {
                        atwcVar.e.writeLock().unlock();
                        throw th2;
                    }
                }
            }
            this.S = null;
        }
        if (this.u != null) {
            this.u = null;
        }
        rfn rfnVar = this.v;
        if (rfnVar != null) {
            rfnVar.e();
            this.v = null;
        }
        this.J = null;
        this.w = null;
        this.g.c(Duration.ZERO);
        this.E = null;
    }

    public final void H() {
        if (this.f.b() || this.w == null) {
            return;
        }
        rdo rdoVar = this.i;
        if (rdoVar.a().a() && !this.w.h()) {
            this.w.f(Duration.ofMillis(Instant.now().toEpochMilli()), this.g.a());
        }
        if (!rdoVar.a().a || rdoVar.a().b == 4) {
            this.w.g(this.n.b, this.g.a());
        }
    }

    public final void I() {
        ahno.O(this.m.getLooper().isCurrentThread());
    }

    public final boolean J() {
        return this.i.a().a;
    }

    @Override // defpackage.req
    public final Optional M() {
        Optional optional = this.D;
        hlx hlxVar = new hlx(this, 14);
        if (true != optional.isPresent()) {
            return optional;
        }
        Object obj = optional.get();
        Object obj2 = hlxVar.a;
        Optional optionalA = ((rbs) obj).a();
        ahgb ahgbVar = ((rdr) obj2).K;
        hqb hqbVar = new hqb(ahgbVar, optionalA, 4);
        Optional optional2 = (Optional) ahgbVar.c;
        optional2.isPresent();
        Object obj3 = hqbVar.a;
        Object obj4 = hqbVar.b;
        ahgb ahgbVar2 = (ahgb) obj3;
        Object obj5 = ahgbVar2.e;
        Object obj6 = optional2.get();
        return Optional.ofNullable(((aczl) obj6).q((apsd) rbh.b.b(obj5), Optional.of((apsc) rbh.a.b(ahgbVar2.d)), (Optional) obj4));
    }

    public final void N(Optional optional, Optional optional2) {
        I();
        O(optional2);
        this.k.a();
        if (!this.B) {
            ahng.m(new IllegalStateException("Failed to initialize resources"));
            return;
        }
        tld tldVarA = this.n.a();
        Object obj = tldVarA.a;
        if (!this.N && this.q.a.M) {
            this.N = true;
            Optional optional3 = this.D;
            hqc hqcVar = new hqc(this, obj, 18, null);
            if (true == optional3.isPresent()) {
                ((rbs) optional3.get()).b(rbk.a((quc) hqcVar.a, ((rdr) hqcVar.b).l));
            }
        }
        if (true == optional2.isPresent()) {
            optional2 = Optional.ofNullable(nrb.f((Duration) optional2.get()));
        }
        Optional optional4 = optional2;
        rbj rbjVar = new rbj(this.j, 8);
        if (true == optional4.isPresent()) {
            ((AtomicReference) rbjVar.a).set((Duration) optional4.get());
        }
        this.f.a(optional4.isPresent() ? rdk.c : rdk.b, afwl.j(new hlm(this, tldVarA, optional, optional4, 9, null)));
    }

    @Override // defpackage.qug
    public final void a(quk qukVar) {
        D(qukVar);
    }

    @Override // defpackage.qun
    public final void b() {
        I();
        this.i.d(false);
        this.E = null;
    }

    @Override // defpackage.qun
    public final void c() {
        I();
        B();
        this.i.d(true);
        this.k.a();
    }

    @Override // defpackage.qun
    public final void d(Optional optional) {
        I();
        this.h.lock();
        try {
            this.M = optional;
            F();
            g();
        } finally {
            this.h.unlock();
        }
    }

    @Override // defpackage.qun
    public final void e() {
        G();
        Optional optional = this.D;
        if (optional != null) {
            if (true == optional.isPresent()) {
                ((rbs) optional.get()).i();
            }
            this.D = Optional.empty();
        }
    }

    @Override // defpackage.qun
    public final void f(Duration duration) {
        I();
        O(Optional.of(duration));
        if (!this.B) {
            ahng.m(new IllegalStateException("Failed to initialize resources."));
            return;
        }
        this.k.a();
        Duration durationE = nrb.e(duration);
        this.j.set(durationE);
        this.f.a(rdk.a, afwl.j(new jkb(this, durationE, 16)));
    }

    @Override // defpackage.qun
    public final void g() {
        N(Optional.empty(), Optional.empty());
    }

    @Override // defpackage.qyx
    public final qzf h() {
        return this.u;
    }

    @Override // defpackage.qyx
    public final DrishtiCache i() {
        return this.H;
    }

    @Override // defpackage.qyx
    public final Optional j() {
        return Optional.ofNullable(this.Q);
    }

    @Override // defpackage.qyx
    public final Optional k() {
        return Optional.ofNullable(this.R);
    }

    @Override // defpackage.rda
    public final void l(final long j) {
        if (this.B) {
            Duration duration = Duration.ZERO;
            Runnable runnable = new Runnable() { // from class: rdp
                /* JADX WARN: Code duplicated, block: B:46:0x014e A[Catch: all -> 0x0207, TryCatch #0 {, blocks: (B:40:0x012d, B:42:0x0131, B:44:0x014c, B:46:0x014e, B:48:0x0156, B:50:0x0158, B:51:0x015d), top: B:94:0x012d }] */
                /* JADX WARN: Code duplicated, block: B:48:0x0156 A[Catch: all -> 0x0207, DONT_GENERATE, TryCatch #0 {, blocks: (B:40:0x012d, B:42:0x0131, B:44:0x014c, B:46:0x014e, B:48:0x0156, B:50:0x0158, B:51:0x015d), top: B:94:0x012d }] */
                /* JADX WARN: Code duplicated, block: B:50:0x0158 A[Catch: all -> 0x0207, TryCatch #0 {, blocks: (B:40:0x012d, B:42:0x0131, B:44:0x014c, B:46:0x014e, B:48:0x0156, B:50:0x0158, B:51:0x015d), top: B:94:0x012d }] */
                @Override // java.lang.Runnable
                public final void run() {
                    rep repVarIw;
                    rdr rdrVar = this.a;
                    qyo qyoVar = rdrVar.n;
                    rdj rdjVar = rdrVar.g;
                    boolean zF = rdjVar.f();
                    Comparable comparableF = afyd.f(rdjVar.a(), qyoVar.c.iu());
                    if (qyoVar.c.f().isZero()) {
                        rdi rdiVar = rdrVar.x;
                        rdiVar.f(new rcu(rdiVar, 7));
                        rdrVar.E((Duration) comparableF);
                        repVarIw = ren.c;
                    } else {
                        long j2 = j;
                        Comparable comparableF2 = afyd.f(comparableF, qyoVar.c.f().minus(rek.a));
                        rdrVar.H();
                        repVarIw = rdrVar.z.iw((Duration) comparableF2);
                        ren renVar = (ren) repVarIw;
                        rel relVar = renVar.d;
                        int iOrdinal = relVar.ordinal();
                        if (iOrdinal == 0) {
                            rdrVar.F = null;
                            final rdi rdiVar2 = rdrVar.x;
                            final rfs rfsVarA = renVar.a();
                            if (rfsVarA.z() && !rdiVar2.f(new Runnable() { // from class: rdg
                                /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.Map] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    rdi rdiVar3 = rdiVar2;
                                    rfs rfsVar = rfsVarA;
                                    try {
                                        ahno.O(rdiVar3.m.getLooper().isCurrentThread());
                                        if (!Objects.equals(rdiVar3.h, rfsVar)) {
                                            rdiVar3.h = rfsVar;
                                            int i = 5;
                                            if (!rdiVar3.e()) {
                                                try {
                                                    bvo.n();
                                                    float[] fArr = rdiVar3.i;
                                                    Matrix.setIdentityM(fArr, 0);
                                                    int i2 = rdiVar3.j;
                                                    rdiVar3.f.f("uTransformationMatrix", fArr);
                                                    rdiVar3.f.i();
                                                    rdiVar3.f.h("uTexSampler", rfsVar.getTextureName(), 0);
                                                    rdiVar3.f.j(bvo.l());
                                                    rdiVar3.f.d();
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    EGLExt.eglPresentationTimeANDROID(rdiVar3.d, rdiVar3.b, System.nanoTime());
                                                    EGL14.eglSwapBuffers(rdiVar3.d, rdiVar3.b);
                                                } catch (bvn e) {
                                                    e = e;
                                                    rbc rbcVar = new rbc(rdi.k, rbd.e);
                                                    rbcVar.a = e;
                                                    rbcVar.c();
                                                    rbcVar.a("Error while rendering the frame onto the output surface. FrameBuffer: %d, outputWidth: %d, outputHeight: %d", Integer.valueOf(rdiVar3.o), Integer.valueOf(rdiVar3.c.getWidth()), Integer.valueOf(rdiVar3.c.getHeight()));
                                                } catch (RuntimeException e2) {
                                                    e = e2;
                                                    rbc rbcVar2 = new rbc(rdi.k, rbd.e);
                                                    rbcVar2.a = e;
                                                    rbcVar2.c();
                                                    rbcVar2.a("Error while rendering the frame onto the output surface. FrameBuffer: %d, outputWidth: %d, outputHeight: %d", Integer.valueOf(rdiVar3.o), Integer.valueOf(rdiVar3.c.getWidth()), Integer.valueOf(rdiVar3.c.getHeight()));
                                                }
                                            }
                                            rdh rdhVar = rdiVar3.a;
                                            ijt ijtVar = ((rdr) rdhVar).J;
                                            Bitmap bitmap = null;
                                            if (ijtVar != null) {
                                                ArrayList arrayList = new ArrayList();
                                                ?? r0 = ijtVar.a;
                                                agqr it = ahng.ae(r0.keySet(), (Set) Collection.EL.stream(rfsVar.i()).map(new rcs(i)).collect(aghu.b)).f().iterator();
                                                while (it.hasNext()) {
                                                    UUID uuid = (UUID) it.next();
                                                    arrayList.add(new rfp(uuid, null));
                                                    r0.remove(uuid);
                                                }
                                                agke agkeVarI = rfsVar.i();
                                                int size = agkeVarI.size();
                                                for (int i3 = 0; i3 < size; i3++) {
                                                    rfp rfpVar = (rfp) agkeVarI.get(i3);
                                                    UUID uuid2 = rfpVar.a;
                                                    Object obj = r0.get(uuid2);
                                                    awme awmeVar = rfpVar.b;
                                                    if (!Objects.equals(obj, awmeVar)) {
                                                        r0.put(uuid2, awmeVar);
                                                        arrayList.add(rfpVar);
                                                    }
                                                }
                                                Iterable$EL.forEach(agke.n(arrayList), new rcp(rdhVar, i));
                                            }
                                            rdt rdtVar = ((rdr) rdhVar).e;
                                            synchronized (rdtVar.b) {
                                                if (rdtVar.c.b != null) {
                                                    try {
                                                        int i4 = rgi.a;
                                                        int[] iArr = new int[1];
                                                        GLES20.glGenFramebuffers(1, iArr, 0);
                                                        rgi.c("glGenFramebuffers");
                                                        GLES20.glBindFramebuffer(36160, iArr[0]);
                                                        rgi.c("glBindFramebuffer");
                                                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, rfsVar.getTextureName(), 0);
                                                        rgi.c("glFramebufferTexture2D");
                                                        int width = rfsVar.getWidth();
                                                        int height = rfsVar.getHeight();
                                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((width * height) << 2);
                                                        GLES20.glReadPixels(0, 0, width, height, 6408, 5121, byteBufferAllocate);
                                                        rgi.c("glReadPixels");
                                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                                                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                                                        GLES20.glBindFramebuffer(36160, 0);
                                                        rgi.c("glBindFramebuffer");
                                                        GLES20.glDeleteFramebuffers(1, iArr, 0);
                                                        rgi.c("glDeleteFramebuffer");
                                                        try {
                                                            android.graphics.Matrix matrix = new android.graphics.Matrix();
                                                            matrix.postScale(1.0f, -1.0f);
                                                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, false);
                                                            bitmapCreateBitmap.recycle();
                                                            bitmap = bitmapCreateBitmap2;
                                                            zhk zhkVar = rdtVar.c.b;
                                                            zhkVar.getClass();
                                                            zhkVar.h();
                                                            rdtVar.c = new rds(bitmap, zhkVar);
                                                        } catch (Throwable th) {
                                                            bitmapCreateBitmap.recycle();
                                                            throw th;
                                                        }
                                                    } catch (bvn e3) {
                                                        rbc rbcVar3 = new rbc(rdt.e, rbd.c);
                                                        rbcVar3.c();
                                                        rbcVar3.a = e3;
                                                        rbcVar3.a("Failed to generate thumbnail.", new Object[0]);
                                                    }
                                                }
                                            }
                                            ((rdr) rdhVar).A(new hgi(12));
                                        }
                                        rfsVar.release();
                                    } catch (Throwable th2) {
                                        rfsVar.release();
                                        throw th2;
                                    }
                                }
                            })) {
                                rfsVarA.release();
                            }
                            Duration duration2 = (Duration) comparableF;
                            rdrVar.E(duration2);
                            rde rdeVar = rdrVar.d;
                            if (!rdeVar.d()) {
                                rdrVar.w.d(duration2, qyoVar.b);
                            }
                            synchronized (rdeVar.b) {
                                rdeVar.c = true;
                                rdeVar.b();
                            }
                            rdo rdoVar = rdrVar.i;
                            synchronized (rdoVar.a) {
                                if (rdoVar.d) {
                                    rdn rdnVar = rdoVar.c;
                                    if (((rdr) rdnVar).z.f.c(((rdr) rdnVar).g.a()) >= rdoVar.b.c) {
                                        rdoVar.d = true;
                                        if (rdoVar.e.b == 4) {
                                            rdoVar.g = true;
                                            rdoVar.b();
                                        }
                                    }
                                } else {
                                    rdoVar.d = true;
                                    if (rdoVar.e.b == 4) {
                                        rdoVar.g = true;
                                        rdoVar.b();
                                    }
                                }
                            }
                            if (rdrVar.i.a().a()) {
                                rdrVar.w.b(Duration.ofNanos(j2), duration2, renVar.a().j());
                            }
                        } else {
                            if (iOrdinal == 1) {
                                throw new UnsupportedOperationException("Instruction based rendering is not supported yet.");
                            }
                            if (iOrdinal == 2) {
                                Duration durationOfNanos = Duration.ofNanos(j2);
                                if (rdrVar.d.d()) {
                                    if (rdrVar.F == null) {
                                        rdrVar.F = Instant.now();
                                    }
                                    Duration durationBetween = Duration.between(rdrVar.F, Instant.now());
                                    durationBetween.getClass();
                                    if (aext.i(rdr.c, durationBetween)) {
                                        rdrVar.i.e();
                                        rdrVar.w.c(durationOfNanos, (Duration) comparableF, true);
                                        rdrVar.F = null;
                                    } else {
                                        rdrVar.w.c(durationOfNanos, (Duration) comparableF, false);
                                    }
                                } else {
                                    rdrVar.i.e();
                                    rdrVar.w.c(durationOfNanos, (Duration) comparableF, true);
                                }
                            } else if (iOrdinal == 3 || iOrdinal == 4) {
                                rbc rbcVar = new rbc(rdr.I, rbd.e);
                                rbcVar.c();
                                rbcVar.a("MCR %s status received at %dms this should never happen", relVar.name(), Long.valueOf(((Duration) comparableF).toMillis()));
                            }
                        }
                    }
                    if (rdrVar.J() && ((ren) repVarIw).c()) {
                        Instant instant = rdrVar.E;
                        if (instant == null) {
                            rdrVar.E = Instant.now();
                        } else {
                            Duration durationBetween2 = Duration.between(instant, Instant.now());
                            durationBetween2.getClass();
                            Duration duration3 = rdr.b;
                            if (aext.i(duration3, durationBetween2)) {
                                rbc rbcVar2 = new rbc(rdr.I, rbd.d);
                                rbcVar2.c();
                                rbcVar2.a("Video playback seems to be frozen. Did not render a frame in %s.", duration3);
                                rdrVar.E = null;
                            }
                        }
                    } else {
                        rdrVar.E = null;
                    }
                    if (((ren) repVarIw).c() || !zF) {
                        return;
                    }
                    if (rdrVar.C) {
                        if (!rdrVar.i.a().a || rdrVar.f.c()) {
                            return;
                        }
                        rdrVar.f(Duration.ZERO);
                        return;
                    }
                    rdo rdoVar2 = rdrVar.i;
                    synchronized (rdoVar2.a) {
                        rdoVar2.d = true;
                        rdoVar2.f(4);
                    }
                    rdrVar.g.c(rdrVar.n.c.iu());
                }
            };
            boolean zTryLock = false;
            try {
                try {
                    zTryLock = this.h.tryLock(duration.toMillis(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    rbc rbcVar = new rbc(I, rbd.d);
                    rbcVar.a = e;
                    rbcVar.c();
                    rbcVar.a("Interrupted while acquiring renderLock", new Object[0]);
                }
                if (zTryLock) {
                    runnable.run();
                    this.h.unlock();
                }
            } catch (Throwable th) {
                if (zTryLock) {
                    this.h.unlock();
                }
                throw th;
            }
        }
    }

    @Override // defpackage.req
    public final Context m() {
        return this.l;
    }

    @Override // defpackage.req
    public final Size n() {
        return this.s;
    }

    @Override // defpackage.req
    public final Size o() {
        return this.r;
    }

    @Override // defpackage.req
    public final qyt p() {
        return this.q;
    }

    @Override // defpackage.req
    public final rfn q() {
        return this.v;
    }

    @Override // defpackage.req
    public final rhh r() {
        rhh rhhVar = this.S;
        rhhVar.getClass();
        return rhhVar;
    }

    @Override // defpackage.req
    public final rjb s() {
        return this.y;
    }

    @Override // defpackage.req
    public final rjc t() {
        rja rjaVar = this.A;
        rjaVar.getClass();
        return new riz(rjaVar.b);
    }

    @Override // defpackage.req
    public final /* synthetic */ ahxp u() {
        return this.v.a;
    }

    public final Duration v(Duration duration) {
        return (Duration) afyd.f(duration, this.n.c.iu());
    }

    @Override // defpackage.req
    public final /* synthetic */ Duration w() {
        return ahbt.b(33333L);
    }

    @Override // defpackage.req
    public final Optional x() {
        return this.P;
    }

    @Override // defpackage.req
    public final Optional y() {
        return this.L;
    }

    @Override // defpackage.req
    public final Optional z() {
        return this.O;
    }

    @Override // defpackage.req
    public final void K() {
    }

    @Override // defpackage.req
    public final /* synthetic */ void L() {
    }
}
