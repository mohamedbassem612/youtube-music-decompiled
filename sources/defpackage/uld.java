package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uld implements ComponentCallbacks2, ulj, ule, uli, ulg, ulf, qum {
    public static final agrf a;
    private static final Comparator w;
    private final zvl A;
    private final Object B;
    private agke C;
    private final HashMap D;
    private boolean E;
    private Surface F;
    private Duration G;
    private boolean H;
    private final aaok I;
    private final qcb J;
    private final xsc K;
    public final Set b = ahng.aj();
    public final Context c;
    public final use d;
    public final Executor e;
    public final awmd f;
    public final awmd g;
    public final vko h;
    public final Object i;
    public final Set j;
    public boolean k;
    public boolean l;
    public boolean m;
    public Duration n;
    public Surface o;
    public Size p;
    public qun q;
    public ulk r;
    public Runnable s;
    public Size t;
    public Optional u;
    public Optional v;
    private final quc x;
    private final awli y;
    private final awlo z;

    static {
        vbw.a();
        a = agrf.h("com/google/android/libraries/youtube/creation/editor/MediaEnginePlaybackController");
        w = Comparator$EL.reversed(Comparator$CC.comparingInt(new ddc(9)));
    }

    public uld(Context context, zvl zvlVar, Executor executor, qcb qcbVar, xsc xscVar, aaok aaokVar, aeda aedaVar, afip afipVar, awmd awmdVar, qcb qcbVar2, awmd awmdVar2, vko vkoVar, utg utgVar) {
        quc qucVar = new quc();
        this.x = qucVar;
        this.y = new awli(Boolean.FALSE);
        this.z = new awlo();
        this.B = new Object();
        this.i = new Object();
        this.C = agpi.a;
        this.D = new HashMap();
        this.j = new HashSet();
        this.k = true;
        this.m = true;
        this.n = Duration.ZERO;
        this.G = null;
        this.H = false;
        Optional.empty();
        this.u = Optional.empty();
        this.v = Optional.empty();
        this.c = aedaVar.e() ? afipVar.b() : context;
        this.A = zvlVar;
        this.e = executor;
        this.J = qcbVar;
        this.K = xscVar;
        this.I = aaokVar;
        this.f = awmdVar;
        this.g = awmdVar2;
        this.h = vkoVar;
        qcb qcbVar3 = new qcb(this);
        ght ghtVar = ((gif) qcbVar2.a).a;
        this.d = new use((Context) ghtVar.v.io(), (zvl) ghtVar.dO.io(), (aaok) ghtVar.a.iz.io(), (Executor) ghtVar.B.io(), (Executor) ghtVar.u.io(), utgVar, qucVar, qcbVar3);
    }

    public final void A() {
        synchronized (this.i) {
            qun qunVar = this.q;
            if (qunVar != null) {
                qunVar.e();
                this.q = null;
            }
        }
    }

    @Override // defpackage.uli
    public final boolean B() {
        Boolean bool = (Boolean) this.y.au();
        bool.getClass();
        return bool.booleanValue();
    }

    public final void C(Optional optional) {
        aaok aaokVar;
        this.A.getClass();
        if (this.q == null) {
            s("update_composition_no_player", null);
            ListenableFuture listenableFuture = aher.a;
            return;
        }
        Optional optionalEmpty = Optional.empty();
        if (this.H && !this.x.c().isEmpty()) {
            this.H = false;
            optionalEmpty = Optional.ofNullable(this.G);
        }
        if (true == optional.isPresent()) {
            optionalEmpty = optional;
        }
        synchronized (this.B) {
            Stream streamSorted = Collection.EL.stream(this.x.c()).filter(new sde(12)).map(new snm(13)).sorted(w);
            Collector collector = aghu.a;
            this.C = (agke) streamSorted.collect(collector);
            this.D.keySet().retainAll((java.util.Collection) Collection.EL.stream(this.C).map(new snm(14)).collect(collector));
        }
        if (optional.isPresent() && (aaokVar = this.I) != null && aaokVar.K()) {
            this.z.kk((Duration) optional.get());
            this.G = (Duration) optional.get();
        }
        boolean zIsEmpty = optionalEmpty.isEmpty();
        qun qunVar = this.q;
        if (zIsEmpty) {
            qunVar.getClass();
            qunVar.g();
        } else {
            qunVar.getClass();
            ((rdr) qunVar).N(Optional.empty(), Optional.of((Duration) optionalEmpty.get()));
        }
    }

    @Override // defpackage.qum
    public final void a(UUID uuid, awme awmeVar) {
        synchronized (this.B) {
            HashMap map = this.D;
            if (awmeVar == null) {
                map.remove(uuid);
            } else {
                Matrix matrix = new Matrix();
                matrix.setValues(new float[]{awmeVar.a, awmeVar.b, awmeVar.c, awmeVar.d, awmeVar.e, awmeVar.f, awmeVar.g, awmeVar.h, awmeVar.i});
                map.put(uuid, matrix);
            }
        }
    }

    @Override // defpackage.qum
    public final void b(quk qukVar) {
        Throwable th = qukVar.c;
        if (th instanceof Exception) {
            qud qudVar = qukVar.d;
            if (qudVar instanceof quh) {
                int i = 10;
                if (Collection.EL.stream(this.x.c()).anyMatch(new sco((quh) qudVar, i))) {
                    Iterable$EL.forEach(this.b, new tsd(qukVar, i));
                    return;
                }
            }
            Iterable$EL.forEach(this.b, new tsd(th, 11));
        }
    }

    @Override // defpackage.qum
    public final void d(Duration duration) {
        this.n = duration;
        if (!this.E) {
            this.E = true;
            Iterable$EL.forEach(this.b, new ulo(1));
        }
        Iterable$EL.forEach(this.b, new tsd(duration, 12));
    }

    @Override // defpackage.qum
    public final void e(int i, boolean z) {
        boolean z2;
        int i2 = 0;
        if (!this.l && z) {
            this.E = false;
        }
        this.l = z;
        awli awliVar = this.y;
        int i3 = 2;
        if (i == 2) {
            if (z) {
                z2 = true;
            }
            awliVar.kk(Boolean.valueOf(z2));
            Iterable$EL.forEach(this.b, new ulc(i3, i2));
        }
        i3 = i;
        z2 = false;
        awliVar.kk(Boolean.valueOf(z2));
        Iterable$EL.forEach(this.b, new ulc(i3, i2));
    }

    @Override // defpackage.uli
    public final long f() {
        return this.n.toMillis();
    }

    @Override // defpackage.uli
    public final long g() {
        return this.x.iu().toMillis();
    }

    @Override // defpackage.uli
    public final avlr l() {
        return this.y.r();
    }

    @Override // defpackage.uli
    public final Optional m(UUID uuid) {
        Size size = this.p;
        return size == null ? Optional.empty() : n(uuid, size);
    }

    @Override // defpackage.uli
    public final Optional n(UUID uuid, Size size) {
        Optional optionalFindFirst;
        synchronized (this.B) {
            optionalFindFirst = p(uuid).findFirst();
            sla slaVar = new sla(size, 7);
            if (true == optionalFindFirst.isPresent()) {
                optionalFindFirst = qub.a((Map.Entry) optionalFindFirst.get(), (Size) slaVar.a);
            }
        }
        return optionalFindFirst;
    }

    @Override // defpackage.uli
    public final Optional o(PointF pointF, Size size) {
        Optional optionalFindFirst;
        synchronized (this.B) {
            optionalFindFirst = Collection.EL.stream(this.C).flatMap(new rhk(this, 20)).filter(new iab(pointF, size, 2)).findFirst();
            sla slaVar = new sla(size, 6);
            if (true == optionalFindFirst.isPresent()) {
                optionalFindFirst = qub.a((Map.Entry) optionalFindFirst.get(), (Size) slaVar.a);
            }
        }
        return optionalFindFirst;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        qun qunVar = this.q;
        if (qunVar != null) {
            boolean z = true;
            if (i == 15) {
                rbc rbcVar = new rbc(rdr.I, rbd.c);
                rbcVar.c();
                rbcVar.a("[MemoryTrim][Player] level: %d", Integer.valueOf(i));
            } else if (i == 10) {
                i = 10;
                rbc rbcVar2 = new rbc(rdr.I, rbd.c);
                rbcVar2.c();
                rbcVar2.a("[MemoryTrim][Player] level: %d", Integer.valueOf(i));
            }
            if (i == 15) {
                rdr rdrVar = (rdr) qunVar;
                qua quaVar = rdrVar.q.a;
                qyq qyqVar = new qyq(qyu.a(quaVar));
                qyqVar.d(2);
                qyqVar.c(5);
                qyqVar.b(5);
                if (!quaVar.l && !quaVar.r) {
                    z = false;
                }
                qyqVar.e(z);
                qyt qytVarA = qyqVar.a();
                if (!rdrVar.B || rdrVar.q.equals(qytVarA)) {
                    return;
                }
                rbc rbcVar3 = new rbc(rdr.I, rbd.c);
                rbcVar3.c();
                rbcVar3.a("[Player] switching to low memory mode", new Object[0]);
                Duration durationA = rdrVar.g.a();
                boolean zJ = rdrVar.J();
                rdrVar.G();
                rdrVar.q = qytVarA;
                rdrVar.F();
                rdrVar.f(durationA);
                if (zJ) {
                    rdrVar.c();
                }
            }
        }
    }

    public final Stream p(UUID uuid) {
        Stream streamOf;
        synchronized (this.B) {
            Matrix matrix = (Matrix) this.D.get(uuid);
            streamOf = matrix == null ? Stream.CC.of((Object[]) new Map.Entry[0]) : Stream.CC.of(new AbstractMap.SimpleImmutableEntry(uuid, matrix));
        }
        return streamOf;
    }

    @Override // defpackage.uli
    public final void q(ulh ulhVar) {
        this.b.add(ulhVar);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, zvl] */
    public final void r() {
        synchronized (this.i) {
            if (this.j.isEmpty()) {
                qun qunVar = this.q;
                if (qunVar != null) {
                    qunVar.e();
                    s("multiple_players", null);
                }
                ulk ulkVar = this.r;
                tzt tztVar = new tzt(ulkVar == null ? audb.MEDIA_ENGINE_CLIENT_SHORTS_CREATION : ulkVar.b, audc.MEDIA_ENGINE_CLIENT_SURFACE_EDITOR, Optional.empty());
                qcb qcbVar = this.J;
                Context context = this.c;
                Surface surface = this.o;
                surface.getClass();
                Size size = this.p;
                size.getClass();
                quc qucVar = this.x;
                Optional optional = this.u;
                Object obj = qcbVar.a;
                boolean z = false;
                new rbc(tzu.d, rbd.a).a("Creating Player with configuration: %s", tztVar);
                rbf rbfVar = rbf.a;
                audb audbVar = tztVar.a;
                rbfVar.c = audbVar;
                audc audcVar = tztVar.b;
                rbfVar.d = audcVar;
                new agjo(16);
                Optional optionalEmpty = Optional.empty();
                qua.a();
                Optional optionalEmpty2 = Optional.empty();
                Optional optionalEmpty3 = Optional.empty();
                qua quaVar = ((tzu) obj).a;
                ahgb ahgbVar = new ahgb(Optional.of((aczl) ((tzu) obj).c.io()), Optional.of(((tzu) obj).b), audbVar, audcVar, anck.MEDIA_ENGINE_SERVICE_TYPE_PLAYER);
                if (optional == null) {
                    optional = optionalEmpty;
                }
                context.getClass();
                if (size.getWidth() > 0 && size.getHeight() > 0) {
                    z = true;
                }
                ahno.P(z, "Output size should be positive.");
                new tzv();
                rdr rdrVar = new rdr(qucVar, surface, size, optionalEmpty3, context, this, optional, quaVar, optionalEmpty2, ahgbVar);
                this.q = rdrVar;
                rdrVar.d(this.v);
                qun qunVar2 = this.q;
                boolean z2 = this.m;
                ((rdr) qunVar2).I();
                ((rdr) qunVar2).C = z2;
                this.G = null;
                this.H = qucVar.c().isEmpty();
                xsc xscVar = this.K;
                rbfVar.b = new udk((xeu) xscVar.c, xscVar.b);
                rbfVar.c = audbVar;
                rbfVar.d = audcVar;
                if (((vxz) this.I.b).m(161, 45545599L)) {
                    Optional.ofNullable(xscVar.a);
                }
                if (!this.n.isZero()) {
                    qun qunVar3 = this.q;
                    qunVar3.getClass();
                    qunVar3.f(this.n);
                }
                if (this.k) {
                    qun qunVar4 = this.q;
                    qunVar4.getClass();
                    qunVar4.c();
                }
            }
        }
    }

    public final void s(String str, Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        zvjVarA.j = 40;
        zvjVarA.d("[ShortsCreation][Android][PlaybackCtrl][ME] ".concat(str));
        if (th != null) {
            zvjVarA.f(th);
        }
        this.A.a(zvjVarA.a());
    }

    public final void t(ajtv ajtvVar, String str, Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtvVar);
        zvjVarA.j = 40;
        zvjVarA.d(str);
        if (th != null) {
            zvjVarA.f(th);
        }
        this.A.a(zvjVarA.a());
        agrf agrfVar = a;
        if (th == null) {
            ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/editor/MediaEnginePlaybackController", "logError", 985, "MediaEnginePlaybackController.java")).w("%s", str);
        } else {
            ((agrc) ((agrc) ((agrc) agrfVar.b()).j(th)).k("com/google/android/libraries/youtube/creation/editor/MediaEnginePlaybackController", "logError", (char) 987, "MediaEnginePlaybackController.java")).w("%s", str);
        }
    }

    @Override // defpackage.ule
    public final void u() {
        qun qunVar = this.q;
        if (qunVar != null) {
            qunVar.b();
        } else {
            s("pause_no_player", null);
        }
        this.k = false;
    }

    @Override // defpackage.ule
    public final void v() {
        qun qunVar = this.q;
        if (qunVar == null) {
            s("play_no_player", null);
        } else {
            qunVar.c();
            this.k = true;
        }
    }

    public final void w() {
        Surface surface = this.F;
        if (surface != null) {
            surface.release();
            this.F = null;
        }
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.uli
    public final void x(ulh ulhVar) {
        this.b.remove(ulhVar);
    }

    @Override // defpackage.ulf
    public final void y(Surface surface, Size size) {
        this.p = size;
        if (this.o == null) {
            this.o = surface;
        } else {
            qun qunVar = this.q;
            if (qunVar != null) {
                rdr rdrVar = (rdr) qunVar;
                rdrVar.I();
                boolean z = false;
                if (size.getWidth() > 0 && size.getHeight() > 0) {
                    z = true;
                }
                ahno.P(z, "Output size should be positive.");
                rdrVar.h.lock();
                try {
                    ((rdr) qunVar).r = size;
                    ((rdr) qunVar).F();
                    rdi rdiVar = ((rdr) qunVar).x;
                    if (rdiVar != null) {
                        rdiVar.f(new plj(rdiVar, size, 12, null));
                    }
                    ((rdr) qunVar).g();
                    rdrVar.h.unlock();
                    this.q.d(this.v);
                    return;
                } catch (Throwable th) {
                    rdrVar.h.unlock();
                    throw th;
                }
            }
        }
        r();
        Runnable runnable = this.s;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.ulf
    public final void z(SurfaceTexture surfaceTexture, Size size) {
        Surface surface = new Surface(surfaceTexture);
        this.F = surface;
        y(surface, size);
    }

    @Override // defpackage.qum
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ulj
    public final ule h() {
        return this;
    }

    @Override // defpackage.ulj
    public final ulf i() {
        return this;
    }

    @Override // defpackage.ulj
    public final ulg j() {
        return this;
    }

    @Override // defpackage.ulj
    public final uli k() {
        return this;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
