package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.media.interfaces.BufferManager;
import com.google.android.libraries.youtube.media.interfaces.HttpHeader;
import com.google.android.libraries.youtube.media.interfaces.HttpMethod;
import com.google.android.libraries.youtube.media.interfaces.HttpRequest;
import com.google.android.libraries.youtube.media.interfaces.MediaCache;
import com.google.android.libraries.youtube.media.interfaces.NetFetch;
import com.google.android.libraries.youtube.media.interfaces.NetFetchCallbacks;
import com.google.android.libraries.youtube.media.interfaces.OnesieFetcher;
import com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector;
import com.google.android.libraries.youtube.media.interfaces.OnesieRetryConfig;
import com.google.android.libraries.youtube.media.interfaces.OnesieVideoData;
import com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks;
import com.google.android.libraries.youtube.media.interfaces.PlatypusOnesie;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.SharedBandwidthSampleTracker;
import com.google.android.libraries.youtube.media.player.exo2.platypus.EnvoyNetFetchProvider;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlatypusNativeLoader;
import com.google.android.libraries.youtube.media.player.exo2.platypus.SharedBandwidthSampleTrackerWrapper;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl$$ExternalSyntheticLambda3;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl$$ExternalSyntheticLambda5;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser$Factory$$ExternalSyntheticLambda0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yqo extends PlatformOnesieCallbacks implements yqs {
    private final boolean A;
    private final List B;
    private final yqm C;
    private final yqw D;
    private final tns E;
    private ysz G;
    private Uri I;
    private final ahey L;
    private final yqh M;
    private final xpl N;
    private final ahnz O;
    private final afip P;
    private final wjr Q;
    private final xsc R;
    public final yrr a;
    public final byr b;
    public final avmb c;
    public final ahey d;
    public final zjr e;
    public final boolean f;
    public final yqy g;
    public final ListenableFuture h;
    public final yho i;
    public final mbc k;
    public avls m;
    public final ytf n;
    public final zjd o;
    public final xeu p;
    public final ahey q;
    public final aaok r;
    public final abxv s;
    public final axfd t;
    private final Executor u;
    private final wis v;
    private final yqg w;
    private final zgy x;
    private final vyo y;
    private final boolean z;
    private final AtomicBoolean F = new AtomicBoolean(false);
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicLong l = new AtomicLong(0);
    private final AtomicBoolean H = new AtomicBoolean(false);
    private volatile boolean J = false;
    private volatile boolean K = false;

    public yqo(yrr yrrVar, yrj yrjVar, byr byrVar, Executor executor, avmb avmbVar, ahey aheyVar, wis wisVar, yqg yqgVar, zgy zgyVar, axfd axfdVar, vyo vyoVar, zjr zjrVar, ahnz ahnzVar, yqy yqyVar, afip afipVar, wjr wjrVar, ytf ytfVar, zjd zjdVar, aaok aaokVar, mbc mbcVar, yqw yqwVar, yho yhoVar, xsc xscVar, tns tnsVar, xeu xeuVar, abxv abxvVar, ahey aheyVar2, ahey aheyVar3, xpl xplVar, yqh yqhVar) {
        boolean z = false;
        this.a = yrrVar;
        zkf.d(yrjVar);
        zkf.d(byrVar);
        this.b = byrVar;
        zkf.d(executor);
        this.u = executor;
        this.c = avmbVar;
        zkf.d(aheyVar);
        this.d = aheyVar;
        this.v = wisVar;
        this.w = yqgVar;
        zkf.d(zgyVar);
        this.x = zgyVar;
        zkf.d(vyoVar);
        this.y = vyoVar;
        this.B = new ArrayList();
        zkf.d(zjrVar);
        this.e = zjrVar;
        this.z = zjrVar.dR();
        boolean zM = zjrVar.l.m(43, 45691346L);
        this.A = zM;
        if (zM && zjrVar.l.m(42, 45691335L)) {
            z = true;
        }
        this.f = z;
        this.t = axfdVar;
        this.O = ahnzVar;
        this.g = yqyVar;
        this.P = afipVar;
        this.n = ytfVar;
        this.o = zjdVar;
        yqm yqmVar = new yqm();
        this.C = yqmVar;
        this.h = ape.f(new sdf(yqmVar, 10));
        this.r = aaokVar;
        this.Q = wjrVar;
        this.k = mbcVar;
        this.D = yqwVar;
        this.i = yhoVar;
        this.R = xscVar;
        this.E = tnsVar;
        this.p = xeuVar;
        this.s = abxvVar;
        this.q = aheyVar2;
        this.L = aheyVar3;
        this.N = xplVar;
        this.M = yqhVar;
    }

    private final aojp j() {
        alik alikVarB = this.y.b();
        if (alikVarB == null) {
            return aojp.a;
        }
        anew anewVar = alikVarB.j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        aojp aojpVar = anewVar.c;
        return aojpVar == null ? aojp.a : aojpVar;
    }

    private final void k(Exception exc) {
        if (this.M.c()) {
            synchronized (this) {
                if (this.J) {
                    return;
                }
            }
        }
        avls avlsVar = this.m;
        if (avlsVar != null) {
            try {
                if (((awbk) avlsVar).a.f() || ((awbk) avlsVar).d) {
                    return;
                }
                if (exc == null) {
                    exc = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (awkh.e(((awbk) avlsVar).b, exc)) {
                    ((awbk) avlsVar).d = true;
                    ((awbk) avlsVar).h();
                }
            } catch (RuntimeException e) {
                this.n.e("rx", e);
            }
        }
    }

    private final void l() {
        this.j.set(true);
        zjr zjrVar = this.e;
        if (zjrVar.aH()) {
            this.n.f("ocpfc", "1");
        }
        zjd zjdVar = this.o;
        zjdVar.Y();
        avls avlsVar = this.m;
        if (avlsVar != null && !((awbk) avlsVar).a.f()) {
            awbk awbkVar = (awbk) this.m;
            if (!awbkVar.a.f() && !awbkVar.d) {
                awbkVar.d = true;
                awbkVar.h();
            }
        }
        if (!n() && this.a.a().equals(jrp.ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE)) {
            this.K = true;
            zjdVar.X();
            zjdVar.K();
            IllegalStateException illegalStateException = new IllegalStateException("finished without player response");
            this.n.e("response.noplayerresponse", illegalStateException);
            this.C.a(illegalStateException);
            zhq zhqVar = zhq.ABR;
        }
        this.n.b(zjrVar);
        if (this.K) {
            zjdVar.U();
            zhq zhqVar2 = zhq.ABR;
        } else {
            if (this.J) {
                return;
            }
            zjdVar.S();
            zhq zhqVar3 = zhq.ABR;
        }
    }

    private final void m() {
        if (this.A) {
            l();
        } else {
            synchronized (this) {
                l();
            }
        }
    }

    private final boolean n() {
        return this.H.get();
    }

    private final synchronized void o(Uri uri) {
        zjr zjrVar = this.e;
        ahey aheyVar = zjrVar.j.l(140, 45427748L, false) ? this.L : this.d;
        for (int i = 0; i < 2; i++) {
            this.B.add(aheyVar.schedule(new yqk(this.x, uri, this.v, zjrVar), 50L, TimeUnit.MILLISECONDS));
        }
    }

    @Override // defpackage.yqs
    public final ListenableFuture a() {
        return this.h;
    }

    @Override // defpackage.yqs
    public final avlr b() {
        return avlr.o(new tuf(this, 3)).O(this.c).D(new xdx(9), false, Alert.DURATION_SHOW_INDEFINITELY).D(new ugm(this, 20), false, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.yqs
    public final void c() {
        zjr zjrVar = this.e;
        if (zjrVar.bK() && this.j.get()) {
            return;
        }
        if (!zjrVar.j.m(254, 45664989L) || (!this.j.get() && !this.J)) {
            k(new CancellationException("Onesie request cancelled"));
        }
        this.o.W();
        d();
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final BufferManager createBufferManager(String str) {
        try {
            yrr yrrVar = this.a;
            ytf ytfVar = this.n;
            MediaParser$Factory$$ExternalSyntheticLambda0 mediaParser$Factory$$ExternalSyntheticLambda0 = new MediaParser$Factory$$ExternalSyntheticLambda0();
            dwv dwvVar = new dwv(this, 4);
            xeu xeuVar = this.p;
            zjr zjrVar = this.e;
            abxv abxvVar = this.s;
            ahey aheyVar = this.d;
            Optional optionalOfNullable = Optional.ofNullable(yrrVar.j);
            BufferManagerImpl$$ExternalSyntheticLambda3 bufferManagerImpl$$ExternalSyntheticLambda3 = new BufferManagerImpl$$ExternalSyntheticLambda3(str, yrrVar);
            if (true == optionalOfNullable.isPresent()) {
                if (true != bufferManagerImpl$$ExternalSyntheticLambda3.a.equals(bufferManagerImpl$$ExternalSyntheticLambda3.b.h)) {
                    optionalOfNullable = Optional.empty();
                }
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(Long.valueOf(Math.max(ahbt.a((Duration) optionalOfNullable.get()), 0L)));
            }
            return new BufferManagerImpl(null, new aae(), new BufferManagerImpl$$ExternalSyntheticLambda5(ytfVar), mediaParser$Factory$$ExternalSyntheticLambda0, ((Long) optionalOfNullable.orElse(0L)).longValue(), 0L, dwvVar, str, null, xeuVar, zjrVar, abxvVar, aheyVar, null, null, false);
        } catch (Throwable th) {
            g(th);
            return null;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final MediaCache createCache(String str) {
        try {
            return this.i.a(str, this.e.l.m(44, 45701814L) ? ywn.b : this.n.a(), null);
        } catch (Throwable th) {
            g(th);
            return null;
        }
    }

    public final synchronized void d() {
        if (!this.J) {
            zjr zjrVar = this.e;
            if ((!zjrVar.j.l(10, 45363312L, false) && !zjrVar.bK()) || !this.j.get()) {
                this.j.set(true);
                this.J = true;
                if (zjrVar.aH()) {
                    this.n.f("occr", "1");
                }
                this.n.b(zjrVar);
                String str = this.a.h;
                if (str != null) {
                    this.g.f(str);
                }
                ysz yszVar = this.G;
                if (yszVar != null) {
                    yszVar.a();
                    this.G = null;
                }
                if (!n()) {
                    this.o.X();
                    this.C.a.c();
                }
                List list = this.B;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                list.clear();
                this.o.T();
                zhq zhqVar = zhq.ABR;
            }
        }
    }

    public final void e(yqq yqqVar) {
        try {
            if (this.H.getAndSet(true)) {
                yti.b("Multiple player responses received.");
            } else {
                this.o.R();
                if (this.m != null) {
                    this.n.f("pr_em", "1");
                    this.m.c(yqqVar);
                } else {
                    Executor executor = this.u;
                    if (this.M.c()) {
                        afxd.f(yqqVar.d()).h(new uzh(this, 18), MoreExecutors.directExecutor()).i(this.C, MoreExecutors.directExecutor());
                    } else {
                        afxd.f(yqqVar.d()).h(new uzh(this, 17), executor).i(this.C, MoreExecutors.directExecutor());
                    }
                }
            }
        } catch (RuntimeException e) {
            h(e);
        }
    }

    public final void f(QoeError qoeError) {
        if (this.e.l.m(40, 45688400L)) {
            m();
            return;
        }
        if (qoeError == null) {
            m();
            return;
        }
        zjd zjdVar = this.o;
        zjdVar.Y();
        this.K = true;
        zhz zhzVarD = zhz.d(qoeError, false);
        this.n.c(zhzVarD);
        zjdVar.K();
        zhr.b(zhq.ONESIE, "%s error occurred during Onesie request.", qoeError.getCode());
        k(new IOException(zhzVarD.toString()));
        d();
    }

    public final void g(Throwable th) {
        zhv zhvVar = new zhv("player.exception");
        zhvVar.c = "c.platform_onesie_callbacks_error";
        zhvVar.d = th;
        zhz zhzVarA = zhvVar.a();
        ytf ytfVar = this.n;
        ytfVar.c(zhzVarA);
        if (th instanceof Exception) {
            try {
                yno.S(this.q, new xoy(this, (Exception) th, 14), 0L, ytfVar.a(), this.p, "Failed to call OnesieController.onError.");
            } catch (Throwable th2) {
                zhr.a(zhq.PLATYPUS, "All attempts to handle OnesieException failed: ".concat(th2.toString()));
            }
        }
    }

    public final synchronized void h(Exception exc) {
        this.K = true;
        if ((exc instanceof ypv) && ((ypv) exc).a == 5) {
            Throwable cause = exc.getCause();
            boolean z = cause instanceof IOException;
            ytf ytfVar = this.n;
            if (z) {
                ytfVar.d((IOException) cause);
            } else {
                ytfVar.e("net", exc);
            }
        } else {
            if (exc instanceof yst) {
                int i = ((yst) exc).a;
            }
            this.n.e("response.parse", exc);
        }
        this.o.K();
        zhr.c(zhq.ONESIE, exc, "%s error occurred during Onesie request. Details: %s", "Fatal", exc.toString());
        if ((exc.getCause() instanceof byt) && (exc.getCause().getCause() instanceof SocketTimeoutException)) {
            this.n.a().l("oentp", "1");
        }
        k(exc);
        if (this.M.c()) {
            this.C.a(exc);
        }
        d();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0268  */
    /* JADX WARN: Code duplicated, block: B:110:0x0282 A[Catch: all -> 0x03a1, RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03a1, blocks: (B:35:0x00a1, B:39:0x00ba, B:41:0x00c8, B:103:0x0253, B:105:0x025b, B:110:0x0282, B:112:0x0295, B:121:0x02c1, B:152:0x034e, B:162:0x0388, B:165:0x0396, B:166:0x039c, B:156:0x035d, B:158:0x0363, B:124:0x02c7, B:126:0x02cb, B:128:0x02d8, B:129:0x02e1, B:130:0x02e7, B:132:0x02ed, B:137:0x0303, B:138:0x0307, B:135:0x02f9, B:141:0x030f, B:143:0x0322, B:144:0x0327, B:146:0x032d, B:118:0x02ad, B:43:0x00d4, B:45:0x00e2, B:49:0x00f6, B:51:0x0106, B:53:0x010a, B:54:0x010c, B:56:0x0123, B:58:0x0129, B:60:0x012d, B:61:0x012f, B:62:0x0141, B:64:0x0147, B:66:0x014b, B:67:0x014d, B:68:0x015f, B:70:0x0165, B:72:0x0169, B:73:0x016b, B:74:0x017d, B:76:0x018b, B:79:0x0191, B:81:0x01a7, B:83:0x01be, B:87:0x01c6, B:89:0x01d2, B:91:0x01e1, B:92:0x01e7, B:93:0x01eb, B:95:0x01f1, B:96:0x01ff, B:88:0x01d0, B:97:0x0225), top: B:311:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02be  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02c7 A[Catch: all -> 0x03a1, RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, TryCatch #0 {all -> 0x03a1, blocks: (B:35:0x00a1, B:39:0x00ba, B:41:0x00c8, B:103:0x0253, B:105:0x025b, B:110:0x0282, B:112:0x0295, B:121:0x02c1, B:152:0x034e, B:162:0x0388, B:165:0x0396, B:166:0x039c, B:156:0x035d, B:158:0x0363, B:124:0x02c7, B:126:0x02cb, B:128:0x02d8, B:129:0x02e1, B:130:0x02e7, B:132:0x02ed, B:137:0x0303, B:138:0x0307, B:135:0x02f9, B:141:0x030f, B:143:0x0322, B:144:0x0327, B:146:0x032d, B:118:0x02ad, B:43:0x00d4, B:45:0x00e2, B:49:0x00f6, B:51:0x0106, B:53:0x010a, B:54:0x010c, B:56:0x0123, B:58:0x0129, B:60:0x012d, B:61:0x012f, B:62:0x0141, B:64:0x0147, B:66:0x014b, B:67:0x014d, B:68:0x015f, B:70:0x0165, B:72:0x0169, B:73:0x016b, B:74:0x017d, B:76:0x018b, B:79:0x0191, B:81:0x01a7, B:83:0x01be, B:87:0x01c6, B:89:0x01d2, B:91:0x01e1, B:92:0x01e7, B:93:0x01eb, B:95:0x01f1, B:96:0x01ff, B:88:0x01d0, B:97:0x0225), top: B:311:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x030f A[Catch: all -> 0x03a1, RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, TryCatch #0 {all -> 0x03a1, blocks: (B:35:0x00a1, B:39:0x00ba, B:41:0x00c8, B:103:0x0253, B:105:0x025b, B:110:0x0282, B:112:0x0295, B:121:0x02c1, B:152:0x034e, B:162:0x0388, B:165:0x0396, B:166:0x039c, B:156:0x035d, B:158:0x0363, B:124:0x02c7, B:126:0x02cb, B:128:0x02d8, B:129:0x02e1, B:130:0x02e7, B:132:0x02ed, B:137:0x0303, B:138:0x0307, B:135:0x02f9, B:141:0x030f, B:143:0x0322, B:144:0x0327, B:146:0x032d, B:118:0x02ad, B:43:0x00d4, B:45:0x00e2, B:49:0x00f6, B:51:0x0106, B:53:0x010a, B:54:0x010c, B:56:0x0123, B:58:0x0129, B:60:0x012d, B:61:0x012f, B:62:0x0141, B:64:0x0147, B:66:0x014b, B:67:0x014d, B:68:0x015f, B:70:0x0165, B:72:0x0169, B:73:0x016b, B:74:0x017d, B:76:0x018b, B:79:0x0191, B:81:0x01a7, B:83:0x01be, B:87:0x01c6, B:89:0x01d2, B:91:0x01e1, B:92:0x01e7, B:93:0x01eb, B:95:0x01f1, B:96:0x01ff, B:88:0x01d0, B:97:0x0225), top: B:311:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0322 A[Catch: all -> 0x03a1, RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, TryCatch #0 {all -> 0x03a1, blocks: (B:35:0x00a1, B:39:0x00ba, B:41:0x00c8, B:103:0x0253, B:105:0x025b, B:110:0x0282, B:112:0x0295, B:121:0x02c1, B:152:0x034e, B:162:0x0388, B:165:0x0396, B:166:0x039c, B:156:0x035d, B:158:0x0363, B:124:0x02c7, B:126:0x02cb, B:128:0x02d8, B:129:0x02e1, B:130:0x02e7, B:132:0x02ed, B:137:0x0303, B:138:0x0307, B:135:0x02f9, B:141:0x030f, B:143:0x0322, B:144:0x0327, B:146:0x032d, B:118:0x02ad, B:43:0x00d4, B:45:0x00e2, B:49:0x00f6, B:51:0x0106, B:53:0x010a, B:54:0x010c, B:56:0x0123, B:58:0x0129, B:60:0x012d, B:61:0x012f, B:62:0x0141, B:64:0x0147, B:66:0x014b, B:67:0x014d, B:68:0x015f, B:70:0x0165, B:72:0x0169, B:73:0x016b, B:74:0x017d, B:76:0x018b, B:79:0x0191, B:81:0x01a7, B:83:0x01be, B:87:0x01c6, B:89:0x01d2, B:91:0x01e1, B:92:0x01e7, B:93:0x01eb, B:95:0x01f1, B:96:0x01ff, B:88:0x01d0, B:97:0x0225), top: B:311:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x032d A[Catch: all -> 0x03a1, RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, TRY_LEAVE, TryCatch #0 {all -> 0x03a1, blocks: (B:35:0x00a1, B:39:0x00ba, B:41:0x00c8, B:103:0x0253, B:105:0x025b, B:110:0x0282, B:112:0x0295, B:121:0x02c1, B:152:0x034e, B:162:0x0388, B:165:0x0396, B:166:0x039c, B:156:0x035d, B:158:0x0363, B:124:0x02c7, B:126:0x02cb, B:128:0x02d8, B:129:0x02e1, B:130:0x02e7, B:132:0x02ed, B:137:0x0303, B:138:0x0307, B:135:0x02f9, B:141:0x030f, B:143:0x0322, B:144:0x0327, B:146:0x032d, B:118:0x02ad, B:43:0x00d4, B:45:0x00e2, B:49:0x00f6, B:51:0x0106, B:53:0x010a, B:54:0x010c, B:56:0x0123, B:58:0x0129, B:60:0x012d, B:61:0x012f, B:62:0x0141, B:64:0x0147, B:66:0x014b, B:67:0x014d, B:68:0x015f, B:70:0x0165, B:72:0x0169, B:73:0x016b, B:74:0x017d, B:76:0x018b, B:79:0x0191, B:81:0x01a7, B:83:0x01be, B:87:0x01c6, B:89:0x01d2, B:91:0x01e1, B:92:0x01e7, B:93:0x01eb, B:95:0x01f1, B:96:0x01ff, B:88:0x01d0, B:97:0x0225), top: B:311:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x033e  */
    /* JADX WARN: Code duplicated, block: B:152:0x034e A[Catch: all -> 0x03a1, RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03a1, blocks: (B:35:0x00a1, B:39:0x00ba, B:41:0x00c8, B:103:0x0253, B:105:0x025b, B:110:0x0282, B:112:0x0295, B:121:0x02c1, B:152:0x034e, B:162:0x0388, B:165:0x0396, B:166:0x039c, B:156:0x035d, B:158:0x0363, B:124:0x02c7, B:126:0x02cb, B:128:0x02d8, B:129:0x02e1, B:130:0x02e7, B:132:0x02ed, B:137:0x0303, B:138:0x0307, B:135:0x02f9, B:141:0x030f, B:143:0x0322, B:144:0x0327, B:146:0x032d, B:118:0x02ad, B:43:0x00d4, B:45:0x00e2, B:49:0x00f6, B:51:0x0106, B:53:0x010a, B:54:0x010c, B:56:0x0123, B:58:0x0129, B:60:0x012d, B:61:0x012f, B:62:0x0141, B:64:0x0147, B:66:0x014b, B:67:0x014d, B:68:0x015f, B:70:0x0165, B:72:0x0169, B:73:0x016b, B:74:0x017d, B:76:0x018b, B:79:0x0191, B:81:0x01a7, B:83:0x01be, B:87:0x01c6, B:89:0x01d2, B:91:0x01e1, B:92:0x01e7, B:93:0x01eb, B:95:0x01f1, B:96:0x01ff, B:88:0x01d0, B:97:0x0225), top: B:311:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0357 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0363 A[Catch: all -> 0x03a1, RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, TryCatch #0 {all -> 0x03a1, blocks: (B:35:0x00a1, B:39:0x00ba, B:41:0x00c8, B:103:0x0253, B:105:0x025b, B:110:0x0282, B:112:0x0295, B:121:0x02c1, B:152:0x034e, B:162:0x0388, B:165:0x0396, B:166:0x039c, B:156:0x035d, B:158:0x0363, B:124:0x02c7, B:126:0x02cb, B:128:0x02d8, B:129:0x02e1, B:130:0x02e7, B:132:0x02ed, B:137:0x0303, B:138:0x0307, B:135:0x02f9, B:141:0x030f, B:143:0x0322, B:144:0x0327, B:146:0x032d, B:118:0x02ad, B:43:0x00d4, B:45:0x00e2, B:49:0x00f6, B:51:0x0106, B:53:0x010a, B:54:0x010c, B:56:0x0123, B:58:0x0129, B:60:0x012d, B:61:0x012f, B:62:0x0141, B:64:0x0147, B:66:0x014b, B:67:0x014d, B:68:0x015f, B:70:0x0165, B:72:0x0169, B:73:0x016b, B:74:0x017d, B:76:0x018b, B:79:0x0191, B:81:0x01a7, B:83:0x01be, B:87:0x01c6, B:89:0x01d2, B:91:0x01e1, B:92:0x01e7, B:93:0x01eb, B:95:0x01f1, B:96:0x01ff, B:88:0x01d0, B:97:0x0225), top: B:311:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0388 A[Catch: all -> 0x03a1, RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, TryCatch #0 {all -> 0x03a1, blocks: (B:35:0x00a1, B:39:0x00ba, B:41:0x00c8, B:103:0x0253, B:105:0x025b, B:110:0x0282, B:112:0x0295, B:121:0x02c1, B:152:0x034e, B:162:0x0388, B:165:0x0396, B:166:0x039c, B:156:0x035d, B:158:0x0363, B:124:0x02c7, B:126:0x02cb, B:128:0x02d8, B:129:0x02e1, B:130:0x02e7, B:132:0x02ed, B:137:0x0303, B:138:0x0307, B:135:0x02f9, B:141:0x030f, B:143:0x0322, B:144:0x0327, B:146:0x032d, B:118:0x02ad, B:43:0x00d4, B:45:0x00e2, B:49:0x00f6, B:51:0x0106, B:53:0x010a, B:54:0x010c, B:56:0x0123, B:58:0x0129, B:60:0x012d, B:61:0x012f, B:62:0x0141, B:64:0x0147, B:66:0x014b, B:67:0x014d, B:68:0x015f, B:70:0x0165, B:72:0x0169, B:73:0x016b, B:74:0x017d, B:76:0x018b, B:79:0x0191, B:81:0x01a7, B:83:0x01be, B:87:0x01c6, B:89:0x01d2, B:91:0x01e1, B:92:0x01e7, B:93:0x01eb, B:95:0x01f1, B:96:0x01ff, B:88:0x01d0, B:97:0x0225), top: B:311:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x03bb A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x03df A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03e7 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0408 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, LOOP:0: B:178:0x0406->B:179:0x0408, LOOP_END, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0435  */
    /* JADX WARN: Code duplicated, block: B:183:0x043d A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0447  */
    /* JADX WARN: Code duplicated, block: B:187:0x0453 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x045e A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x046d A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0478 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x048e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x04a6 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x04c3 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TRY_LEAVE, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0508  */
    /* JADX WARN: Code duplicated, block: B:215:0x0553 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:230:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:233:0x05e5 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x05f6 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x060d A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0610  */
    /* JADX WARN: Code duplicated, block: B:239:0x0616 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x0619 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x0670 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x067e  */
    /* JADX WARN: Code duplicated, block: B:249:0x0681 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0693 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:268:0x0754  */
    /* JADX WARN: Code duplicated, block: B:272:0x0761 A[Catch: all -> 0x07d3, TryCatch #10 {all -> 0x07d3, blocks: (B:270:0x0758, B:272:0x0761, B:274:0x0777), top: B:319:0x0758 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x0776  */
    /* JADX WARN: Code duplicated, block: B:281:0x07b7 A[Catch: RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, all -> 0x080b, TryCatch #4 {all -> 0x080b, blocks: (B:4:0x000b, B:7:0x001b, B:10:0x0035, B:20:0x0052, B:23:0x006a, B:30:0x0089, B:101:0x023f, B:108:0x0269, B:150:0x0346, B:170:0x03a6, B:172:0x03bb, B:173:0x03d4, B:175:0x03df, B:177:0x03e7, B:179:0x0408, B:180:0x0429, B:183:0x043d, B:185:0x044d, B:187:0x0453, B:189:0x045e, B:190:0x0467, B:192:0x046d, B:193:0x0474, B:195:0x0478, B:196:0x047f, B:199:0x0490, B:200:0x0499, B:202:0x04a6, B:203:0x04bd, B:205:0x04c3, B:213:0x054d, B:215:0x0553, B:217:0x0557, B:223:0x056d, B:225:0x0577, B:226:0x05bf, B:227:0x05c7, B:231:0x05db, B:233:0x05e5, B:242:0x062f, B:244:0x0670, B:249:0x0681, B:253:0x06cc, B:279:0x07b3, B:281:0x07b7, B:282:0x07cd, B:278:0x0797, B:287:0x07d7, B:304:0x07ec, B:252:0x0693, B:234:0x05f6, B:236:0x060d, B:241:0x061b, B:239:0x0616, B:240:0x0619, B:208:0x050e, B:212:0x0526, B:211:0x0522, B:154:0x0357, B:100:0x023b, B:29:0x0085), top: B:315:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:316:0x06da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x06d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0758 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0295 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0225 A[Catch: all -> 0x03a1, RuntimeException -> 0x07e7, tmg -> 0x07e9, yrp -> 0x07eb, TRY_LEAVE, TryCatch #0 {all -> 0x03a1, blocks: (B:35:0x00a1, B:39:0x00ba, B:41:0x00c8, B:103:0x0253, B:105:0x025b, B:110:0x0282, B:112:0x0295, B:121:0x02c1, B:152:0x034e, B:162:0x0388, B:165:0x0396, B:166:0x039c, B:156:0x035d, B:158:0x0363, B:124:0x02c7, B:126:0x02cb, B:128:0x02d8, B:129:0x02e1, B:130:0x02e7, B:132:0x02ed, B:137:0x0303, B:138:0x0307, B:135:0x02f9, B:141:0x030f, B:143:0x0322, B:144:0x0327, B:146:0x032d, B:118:0x02ad, B:43:0x00d4, B:45:0x00e2, B:49:0x00f6, B:51:0x0106, B:53:0x010a, B:54:0x010c, B:56:0x0123, B:58:0x0129, B:60:0x012d, B:61:0x012f, B:62:0x0141, B:64:0x0147, B:66:0x014b, B:67:0x014d, B:68:0x015f, B:70:0x0165, B:72:0x0169, B:73:0x016b, B:74:0x017d, B:76:0x018b, B:79:0x0191, B:81:0x01a7, B:83:0x01be, B:87:0x01c6, B:89:0x01d2, B:91:0x01e1, B:92:0x01e7, B:93:0x01eb, B:95:0x01f1, B:96:0x01ff, B:88:0x01d0, B:97:0x0225), top: B:311:0x00a1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r14v12, types: [byw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r1v19, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v39 */
    public final void i() {
        boolean z;
        yqg yqgVar;
        yqw yqwVar;
        int i;
        wiu wiuVar;
        ?? r19;
        yqw yqwVar2;
        boolean zA;
        String str;
        boolean zA2;
        tyt tytVar;
        String authority;
        String str2;
        String str3;
        zjr zjrVar;
        wiu wiuVar2;
        String str4;
        yqh yqhVar;
        ?? r0;
        zjr zjrVar2;
        boolean z2;
        ?? r10;
        Optional optionalOfNullable;
        Double d;
        yth ythVar;
        boolean z3;
        int i2;
        int i3;
        Uri uriA;
        ListenableFuture listenableFutureM;
        yqn yqnVar;
        yrr yrrVar;
        oqe oqeVar;
        boolean z4;
        String str5;
        zjd zjdVar;
        long jC;
        Executor executor;
        ysw ysnVar;
        afip afipVar;
        String str6;
        zjr zjrVar3;
        xpl xplVar;
        ytk ytkVar;
        ywn ywnVarC;
        ytl ytlVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str7;
        NetFetch ypfVar;
        ytb ytbVar;
        yqo yqoVar;
        ysz ytcVar;
        SharedBandwidthSampleTracker sharedBandwidthSampleTracker;
        NetFetch netFetchA;
        byte[] bArrK;
        StringBuilder sb;
        int length;
        int i4;
        ?? A;
        vyq vyqVar;
        String strE;
        Iterable aihxVar;
        yqo yqoVar2 = this;
        try {
            if (yqoVar2.F.getAndSet(true)) {
                return;
            }
            try {
                try {
                    yqoVar2.o.Z();
                    yqg yqgVar2 = yqoVar2.w;
                    if (yqgVar2 != null) {
                        try {
                            yqgVar2.f(yqoVar2.a.a);
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            yqoVar2.K = z;
                            yqoVar2.o.K();
                            yqoVar2.k(new IllegalStateException("Something went wrong with sending the Onesie request"));
                            zhq zhqVar = zhq.ABR;
                            yqoVar2.d();
                            throw th;
                        }
                    }
                    yrr yrrVar2 = yqoVar2.a;
                    Uri uriBuild = yrrVar2.a;
                    String str8 = yrrVar2.b;
                    if (!TextUtils.isEmpty(str8)) {
                        uriBuild = uriBuild.buildUpon().appendQueryParameter("cpn", str8).build();
                    }
                    yqoVar2.I = uriBuild;
                    yth ythVarD = ((yrrVar2.r || !(yqoVar2.j().j || yrrVar2.e())) && yqgVar2 != null) ? yqgVar2.d() : null;
                    yqw yqwVar3 = yqoVar2.D;
                    Uri uri = yqoVar2.I;
                    Object obj5 = yqoVar2.O.a;
                    aigj aigjVar = yqoVar2.j().i;
                    aojo aojoVar = yqoVar2.j().h;
                    if (aojoVar == null) {
                        aojoVar = aojo.a;
                    }
                    aiie<String> aiieVar = aojoVar.f;
                    tns tnsVar = yqoVar2.E;
                    xsc xscVar = yqoVar2.R;
                    jrt jrtVarS = yqoVar2.j().o ? yqoVar2.Q.s(yrrVar2.h) : jrt.getDefaultInstance();
                    yqh yqhVar2 = yqoVar2.M;
                    boolean z5 = yqoVar2.z;
                    wiu wiuVarIo = yqwVar3.b.io();
                    tfq tfqVar = yqwVar3.g;
                    try {
                        if (wiuVarIo != null && tfqVar != null) {
                            yqwVar = yqwVar3;
                            i = 2;
                            try {
                                long jZ = wiuVarIo.z();
                                yqgVar = yqgVar2;
                                List listU = wiuVarIo.U();
                                if (listU.isEmpty()) {
                                    aiieVar = aiieVar;
                                    xscVar = xscVar;
                                    wiuVar = yrrVar2.g;
                                } else if (jZ != Long.MAX_VALUE) {
                                    Integer numValueOf = Integer.valueOf(tfqVar.a());
                                    if (listU.contains(numValueOf)) {
                                        wiu wiuVar3 = yrrVar2.g;
                                        if ((wiuVar3.U().contains(numValueOf) ? wiuVar3.z() : Long.MAX_VALUE) <= jZ) {
                                            r19 = obj5;
                                            aiieVar = aiieVar;
                                            xscVar = xscVar;
                                            yqwVar2 = yqwVar;
                                            wiuVar = wiuVar3;
                                        } else {
                                            aihf aihfVarCreateBuilder = aoqd.a.createBuilder();
                                            aoqd aoqdVar = yrrVar2.f;
                                            if ((aoqdVar.b & 2) != 0) {
                                                akwm akwmVar = aoqdVar.f;
                                                if (akwmVar == null) {
                                                    akwmVar = akwm.b;
                                                }
                                                aihfVarCreateBuilder.copyOnWrite();
                                                aoqd aoqdVar2 = (aoqd) aihfVarCreateBuilder.instance;
                                                akwmVar.getClass();
                                                aoqdVar2.f = akwmVar;
                                                aoqdVar2.b |= 2;
                                            }
                                            if ((aoqdVar.c & SemanticState.Focused) != 0) {
                                                aqdd aqddVar = aoqdVar.z;
                                                if (aqddVar == null) {
                                                    aqddVar = aqdd.a;
                                                }
                                                aihfVarCreateBuilder.copyOnWrite();
                                                aoqd aoqdVar3 = (aoqd) aihfVarCreateBuilder.instance;
                                                aqddVar.getClass();
                                                aoqdVar3.z = aqddVar;
                                                aoqdVar3.c |= SemanticState.Focused;
                                            }
                                            if ((aoqdVar.b & SemanticState.Multiline) != 0) {
                                                ajci ajciVar = aoqdVar.l;
                                                if (ajciVar == null) {
                                                    ajciVar = ajci.a;
                                                }
                                                aihfVarCreateBuilder.copyOnWrite();
                                                aoqd aoqdVar4 = (aoqd) aihfVarCreateBuilder.instance;
                                                ajciVar.getClass();
                                                aoqdVar4.l = ajciVar;
                                                aoqdVar4.b |= SemanticState.Multiline;
                                            }
                                            if ((aoqdVar.b & 16384) != 0) {
                                                aobg aobgVar = aoqdVar.m;
                                                if (aobgVar == null) {
                                                    aobgVar = aobg.a;
                                                }
                                                aihfVarCreateBuilder.copyOnWrite();
                                                aoqd aoqdVar5 = (aoqd) aihfVarCreateBuilder.instance;
                                                aobgVar.getClass();
                                                aoqdVar5.m = aobgVar;
                                                aoqdVar5.b |= 16384;
                                            }
                                            akjx akjxVar = akjx.b;
                                            aihf aihfVarCreateBuilder2 = akjxVar.createBuilder();
                                            if ((aoqdVar.c & 32) != 0) {
                                                akjx akjxVar2 = aoqdVar.x;
                                                if (akjxVar2 == null) {
                                                    akjxVar2 = akjxVar;
                                                }
                                                boolean z6 = akjxVar2.f;
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                akjx akjxVar3 = (akjx) aihfVarCreateBuilder2.instance;
                                                akjxVar3.c |= 4;
                                                akjxVar3.f = z6;
                                            }
                                            aihfVarCreateBuilder2.copyOnWrite();
                                            akjx akjxVar4 = (akjx) aihfVarCreateBuilder2.instance;
                                            akjxVar4.c |= 1;
                                            akjxVar4.d = jZ;
                                            aoqd aoqdVar6 = wiuVarIo.d;
                                            if ((aoqdVar6.c & 32) != 0) {
                                                akjx akjxVar5 = aoqdVar6.x;
                                                aihxVar = new aihx((akjxVar5 == null ? akjxVar : akjxVar5).e, akjx.a);
                                            } else {
                                                aihxVar = agpi.a;
                                            }
                                            aihfVarCreateBuilder2.copyOnWrite();
                                            akjx akjxVar6 = (akjx) aihfVarCreateBuilder2.instance;
                                            aihv aihvVar = akjxVar6.e;
                                            if (!aihvVar.c()) {
                                                akjxVar6.e = aihn.mutableCopy(aihvVar);
                                            }
                                            Iterator it = aihxVar.iterator();
                                            while (it.hasNext()) {
                                                akjxVar6.e.h(((anil) it.next()).n);
                                            }
                                            aihfVarCreateBuilder.copyOnWrite();
                                            aoqd aoqdVar7 = (aoqd) aihfVarCreateBuilder.instance;
                                            akjx akjxVar7 = (akjx) aihfVarCreateBuilder2.build();
                                            akjxVar7.getClass();
                                            aoqdVar7.x = akjxVar7;
                                            aoqdVar7.c |= 32;
                                            wiuVar = new wiu((aoqd) aihfVarCreateBuilder.build());
                                        }
                                    } else {
                                        wiuVar = yrrVar2.g;
                                        aiieVar = aiieVar;
                                        xscVar = xscVar;
                                    }
                                } else {
                                    aiieVar = aiieVar;
                                    xscVar = xscVar;
                                    wiuVar = yrrVar2.g;
                                }
                                zA = ((yrn) yqwVar2.d.io()).a();
                                str = yrrVar2.h;
                                if (TextUtils.isEmpty(str) && yqwVar2.c.cc()) {
                                    zA2 = ((yrk) yqwVar2.e.io()).a(str, zA);
                                } else {
                                    zA2 = false;
                                }
                                tytVar = new tyt(uri);
                                authority = uri.getAuthority();
                                str2 = yrrVar2.s;
                                str3 = yrrVar2.t;
                                zjrVar = yqwVar2.c;
                                if (!zjrVar.db()) {
                                    wiuVar2 = wiuVar;
                                    str4 = authority;
                                    yqhVar = yqhVar2;
                                    if (zjrVar.i.m(102, 45621285L)) {
                                        try {
                                            vyqVar = (vyq) ahng.v(hed.C());
                                        } catch (RuntimeException | ExecutionException e) {
                                            ((agrc) ((agrc) ((agrc) yqw.a.b()).j(e)).k("com/google/android/libraries/youtube/media/onesie/OnesieRequestPreparer", "modifyUriWithPreferredHost", (char) 416, "OnesieRequestPreparer.java")).t("Failed to get the value of the InnerTubeBackend.");
                                            vyqVar = null;
                                        }
                                    } else {
                                        vyqVar = null;
                                    }
                                    if (vyqVar != null || (r0 = vyqVar.i) == 0) {
                                        if (ythVarD == null && (r0 = ythVarD.a) != 0) {
                                            agkz agkzVar = yti.a;
                                            tytVar.e("por", "yes");
                                            int i5 = ythVarD.b;
                                            if (i5 > 0) {
                                                tytVar.e("ohrtt", Integer.toString(i5));
                                            }
                                            Uri uri2 = ythVarD.c;
                                            for (String str9 : aiieVar) {
                                                String queryParameter = uri2 == null ? null : uri2.getQueryParameter(str9);
                                                if (queryParameter == null) {
                                                    tytVar.h(str9);
                                                } else {
                                                    tytVar.e(str9, queryParameter);
                                                }
                                                uri2 = uri2;
                                            }
                                        } else if (yqgVar != null) {
                                            tytVar.e("cbd", Long.toString(yqgVar.a()));
                                            strE = yqgVar.e();
                                            if (strE != null) {
                                                tytVar.e("csr", strE);
                                            }
                                            if (!TextUtils.isEmpty(r19)) {
                                                tytVar.e("por", "yes");
                                                tytVar.e("plh", "yes");
                                                r0 = r19;
                                            }
                                        }
                                    }
                                    zjrVar2 = yqwVar2.c;
                                    if ((!zjrVar2.db() || ahno.aa((String) r0)) && !ahno.aa(str2)) {
                                        if (!ahno.aa(str3)) {
                                            tytVar = new tyt(Uri.parse(String.valueOf(tytVar.a().toString()).concat(String.valueOf(str3))));
                                        }
                                        z2 = true;
                                        r10 = str2;
                                    } else {
                                        r10 = r0;
                                        z2 = false;
                                    }
                                    if (r10 != 0) {
                                        if (yqwVar2.b.io().aS() && !z2) {
                                            A = yti.a((String) r10);
                                        }
                                        A = r10;
                                        A = r10;
                                        tytVar.a = (String) A;
                                    }
                                    tytVar.e("opr", "1");
                                    optionalOfNullable = Optional.ofNullable(yrrVar2.j);
                                    if (true == optionalOfNullable.isPresent()) {
                                        optionalOfNullable = Optional.ofNullable(Double.valueOf(((Duration) optionalOfNullable.get()).toMillis() / 1000.0d));
                                    }
                                    d = (Double) optionalOfNullable.orElse(null);
                                    if (yrrVar2.r) {
                                        if (TextUtils.isEmpty(yrrVar2.h)) {
                                            ythVar = ythVarD;
                                            z3 = zA2;
                                        } else {
                                            String str10 = yrrVar2.h;
                                            agkz agkzVar2 = yti.a;
                                            typ.f(str10);
                                            bArrK = agyg.e.k(agdv.b.j(str10));
                                            sb = new StringBuilder();
                                            length = bArrK.length;
                                            i4 = 0;
                                            while (i4 < length) {
                                                sb.append(String.format("%02x", Byte.valueOf(bArrK[i4])));
                                                i4++;
                                                ythVarD = ythVarD;
                                                zA2 = zA2;
                                            }
                                            ythVar = ythVarD;
                                            z3 = zA2;
                                            tytVar.e("id", sb.toString());
                                        }
                                        if (d != null) {
                                            tytVar.e("osts", d.toString());
                                        }
                                    } else {
                                        zA = zA;
                                        ythVar = ythVarD;
                                        z3 = zA2;
                                    }
                                    i2 = yrrVar2.o;
                                    i3 = yrrVar2.n;
                                    if (i2 >= 0) {
                                        tytVar.e("oad", Integer.toString(i2));
                                    }
                                    if (i3 >= 0) {
                                        tytVar.e("ovd", Integer.toString(i3));
                                    }
                                    if (yrrVar2.e()) {
                                        tytVar.e("opf", "1");
                                    }
                                    if (yrrVar2.i) {
                                        tytVar.e("oplid", "1");
                                    }
                                    if (zjrVar2.i.l(245, 45714895L, false) && d != null) {
                                        tytVar.e("osts", d.toString());
                                    }
                                    if (zjrVar2.j.m(224, 45642230L)) {
                                        tytVar.e("rn", String.valueOf(ypz.c(yrrVar2.b, zjrVar2.eA()).a()));
                                    }
                                    uriA = tytVar.a();
                                    if (z5) {
                                        byte[] byteArray = ((jqy) yqwVar2.a(aigjVar, yrrVar2, tnsVar, xscVar, wiuVar2, jrtVarS, zA, z3, yqhVar).build()).toByteArray();
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(new HttpHeader("Content-Type", "application/x-protobuf"));
                                        yqnVar = new yqn(new HttpRequest(uriA.toString(), arrayList, byteArray, HttpMethod.POST, false), null, !ahno.aa(uriA.getAuthority()));
                                    } else {
                                        try {
                                            listenableFutureM = ahng.n(((jqy) yqwVar2.a(aigjVar, yrrVar2, tnsVar, xscVar, wiuVar2, jrtVarS, zA, z3, yqhVar).build()).toByteArray());
                                        } catch (Exception e2) {
                                            listenableFutureM = ahng.m(e2);
                                        }
                                        yqnVar = new yqn(null, ahcs.e(listenableFutureM, afwl.a(new tvm(yqwVar2, uriA, 18, null)), MoreExecutors.directExecutor()), !ahno.aa(uriA.getAuthority()));
                                    }
                                    yrrVar = yqoVar2.a;
                                    if (!yrrVar.r && !yqnVar.c) {
                                        ytf ytfVar = yqoVar2.n;
                                        yqg yqgVar3 = yqoVar2.w;
                                        String strCa = a.ca(ythVar != null ? "0" : "1", yqgVar3 != null ? "0" : "1", "b.null:", ";p.null:");
                                        if (yqgVar3 != null) {
                                            String strE2 = yqgVar3.e();
                                            long jA = yqgVar3.a();
                                            mbc mbcVar = yqoVar2.k;
                                            strCa = strCa + ";sr:" + strE2 + ";bd." + jA + ";st." + (mbcVar.b() - yqgVar3.c()) + ";ct." + (mbcVar.b() - yqgVar3.b());
                                        }
                                        ytfVar.e("unavailable.host", new MalformedURLException(strCa));
                                        yqoVar2.K = true;
                                        yqoVar2.o.K();
                                        yqoVar2.k(new IllegalStateException("Something went wrong with sending the Onesie request"));
                                        zhq zhqVar2 = zhq.ABR;
                                        yqoVar2.d();
                                        return;
                                    }
                                    oqeVar = new oqe(yqoVar2, 15);
                                    ytf ytfVar2 = yqoVar2.n;
                                    z4 = yqoVar2.z;
                                    if (z4) {
                                        str5 = "2";
                                    } else {
                                        str5 = "1";
                                    }
                                    ytfVar2.f("plat_one", str5);
                                    zjdVar = yqoVar2.o;
                                    zjdVar.V();
                                    if (z4) {
                                        HttpRequest httpRequest = yqnVar.a;
                                        zkf.d(httpRequest);
                                        ysnVar = new yso(new ysv(httpRequest));
                                    } else {
                                        jC = yqoVar2.e.j.c(25, 45424427L, 0L);
                                        if (jC == 1) {
                                            executor = yqoVar2.L;
                                        } else if (jC == 2) {
                                            executor = yqoVar2.d;
                                        } else {
                                            executor = yqoVar2.u;
                                        }
                                        ysnVar = new ysn(new ysu(oqeVar, executor, new yre(zjdVar, new dwv(yqoVar2, 3))));
                                    }
                                    afipVar = yqoVar2.P;
                                    str6 = yrrVar.b;
                                    zjrVar3 = yqoVar2.e;
                                    xplVar = yqoVar2.N;
                                    Object obj6 = afipVar.d;
                                    ytkVar = new ytk(zjdVar, (xeu) obj6, zjrVar3);
                                    ywnVarC = ywl.C((zgm) afipVar.h, str6, zjrVar3);
                                    ytlVar = new ytl(ywnVarC, (xeu) obj6, zjrVar3);
                                    obj = afipVar.b;
                                    obj2 = afipVar.g;
                                    str6.getClass();
                                    obj2.getClass();
                                    Object obj7 = ((abxv) obj).c;
                                    obj3 = ((abxv) obj).a;
                                    if (((zhl) obj3).dS() || !((zhl) obj3).Q().f) {
                                        obj4 = null;
                                    } else {
                                        obj4 = obj7;
                                    }
                                    if (obj4 != null || (netFetchA = ((EnvoyNetFetchProvider) obj4).a((com.google.android.libraries.youtube.media.interfaces.Executor) obj2)) == null) {
                                        str7 = str6;
                                        ypfVar = new ypf(str6, new ypb(((zhl) obj3).q(), ((zhl) obj3).r(), ((zhl) obj3).dR()), (xeu) ((abxv) obj).b, ywnVarC, (hhb) ((abxv) obj).d);
                                    } else {
                                        str7 = str6;
                                        ypfVar = netFetchA;
                                    }
                                    if (ysnVar.b() == i) {
                                        try {
                                            ytbVar = new ytb(yqoVar2);
                                            synchronized (zik.class) {
                                                PlatypusNativeLoader.a();
                                                akxc akxcVarT = zjrVar3.T();
                                                OnesieFetcher onesieFetcherStartOnesieFetch = PlatypusOnesie.startOnesieFetch(ytbVar, ytkVar, ytlVar, ypfVar, str7, zjrVar3.W(), zjrVar3.V(), (byte[]) xplVar.b, (com.google.android.libraries.youtube.media.interfaces.Executor) obj2, ysnVar.c().a, new OnesieRetryConfig(akxcVarT.c, akxcVarT.e, akxcVarT.d, akxcVarT.f, zjrVar3.K()));
                                            }
                                            yqoVar = this;
                                            ytcVar = new ytc(onesieFetcherStartOnesieFetch, (avlh) afipVar.e, (avlh) afipVar.a, (avmb) afipVar.f, zjrVar3.N(), ytbVar);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z = true;
                                            yqoVar2 = this;
                                            yqoVar2.K = z;
                                            yqoVar2.o.K();
                                            yqoVar2.k(new IllegalStateException("Something went wrong with sending the Onesie request"));
                                            zhq zhqVar3 = zhq.ABR;
                                            yqoVar2.d();
                                            throw th;
                                        }
                                    } else {
                                        try {
                                            try {
                                                synchronized (zik.class) {
                                                    try {
                                                        PlatypusNativeLoader.a();
                                                        if (zjrVar3.bW()) {
                                                            ?? r1 = afipVar.c;
                                                            ((SharedBandwidthSampleTrackerWrapper) r1.io()).a();
                                                            sharedBandwidthSampleTracker = ((SharedBandwidthSampleTrackerWrapper) r1.io()).a;
                                                        } else {
                                                            sharedBandwidthSampleTracker = null;
                                                        }
                                                        yqoVar = this;
                                                        NetFetchCallbacks netFetchCallbacks = PlatypusOnesie.createOnesieResponseHandler(yqoVar, ytkVar, ytlVar, ypfVar, str7, zjrVar3.W(), zjrVar3.V(), (byte[]) xplVar.b, sharedBandwidthSampleTracker, null).getNetFetchCallbacks();
                                                        ysu ysuVarA = ysnVar.a();
                                                        ytcVar = new ysy(ysuVarA.a.io(), ysuVarA.b, ysuVarA.c, zjrVar3, new yss(netFetchCallbacks));
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            yqoVar2 = this;
                                            z = true;
                                            yqoVar2.K = z;
                                            yqoVar2.o.K();
                                            yqoVar2.k(new IllegalStateException("Something went wrong with sending the Onesie request"));
                                            zhq zhqVar4 = zhq.ABR;
                                            yqoVar2.d();
                                            throw th;
                                        }
                                    }
                                    yqoVar.G = ytcVar;
                                    if (!z4) {
                                        ListenableFuture listenableFuture = yqnVar.b;
                                        zkf.d(listenableFuture);
                                        ysz yszVar = yqoVar.G;
                                        zkf.d(yszVar);
                                        yszVar.getClass();
                                        taf.g(listenableFuture, new yqj(yszVar, 0));
                                    }
                                    yqoVar.o(yqoVar.I);
                                    return;
                                }
                                wiuVar2 = wiuVar;
                                str4 = authority;
                                yqhVar = yqhVar2;
                                r0 = str4;
                                zjrVar2 = yqwVar2.c;
                                if (zjrVar2.db()) {
                                    if (!ahno.aa(str3)) {
                                        tytVar = new tyt(Uri.parse(String.valueOf(tytVar.a().toString()).concat(String.valueOf(str3))));
                                    }
                                    z2 = true;
                                    r10 = str2;
                                } else {
                                    if (!ahno.aa(str3)) {
                                        tytVar = new tyt(Uri.parse(String.valueOf(tytVar.a().toString()).concat(String.valueOf(str3))));
                                    }
                                    z2 = true;
                                    r10 = str2;
                                }
                                if (r10 != 0) {
                                    if (yqwVar2.b.io().aS()) {
                                        A = yti.a((String) r10);
                                    }
                                    A = r10;
                                    A = r10;
                                    tytVar.a = (String) A;
                                }
                                tytVar.e("opr", "1");
                                optionalOfNullable = Optional.ofNullable(yrrVar2.j);
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(Double.valueOf(((Duration) optionalOfNullable.get()).toMillis() / 1000.0d));
                                }
                                d = (Double) optionalOfNullable.orElse(null);
                                if (yrrVar2.r) {
                                    if (TextUtils.isEmpty(yrrVar2.h)) {
                                        String str11 = yrrVar2.h;
                                        agkz agkzVar3 = yti.a;
                                        typ.f(str11);
                                        bArrK = agyg.e.k(agdv.b.j(str11));
                                        sb = new StringBuilder();
                                        length = bArrK.length;
                                        i4 = 0;
                                        while (i4 < length) {
                                            sb.append(String.format("%02x", Byte.valueOf(bArrK[i4])));
                                            i4++;
                                            ythVarD = ythVarD;
                                            zA2 = zA2;
                                        }
                                        ythVar = ythVarD;
                                        z3 = zA2;
                                        tytVar.e("id", sb.toString());
                                    } else {
                                        ythVar = ythVarD;
                                        z3 = zA2;
                                    }
                                    if (d != null) {
                                        tytVar.e("osts", d.toString());
                                    }
                                } else {
                                    zA = zA;
                                    ythVar = ythVarD;
                                    z3 = zA2;
                                }
                                i2 = yrrVar2.o;
                                i3 = yrrVar2.n;
                                if (i2 >= 0) {
                                    tytVar.e("oad", Integer.toString(i2));
                                }
                                if (i3 >= 0) {
                                    tytVar.e("ovd", Integer.toString(i3));
                                }
                                if (yrrVar2.e()) {
                                    tytVar.e("opf", "1");
                                }
                                if (yrrVar2.i) {
                                    tytVar.e("oplid", "1");
                                }
                                if (zjrVar2.i.l(245, 45714895L, false)) {
                                    tytVar.e("osts", d.toString());
                                }
                                if (zjrVar2.j.m(224, 45642230L)) {
                                    tytVar.e("rn", String.valueOf(ypz.c(yrrVar2.b, zjrVar2.eA()).a()));
                                }
                                uriA = tytVar.a();
                                if (z5) {
                                    byte[] byteArray2 = ((jqy) yqwVar2.a(aigjVar, yrrVar2, tnsVar, xscVar, wiuVar2, jrtVarS, zA, z3, yqhVar).build()).toByteArray();
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(new HttpHeader("Content-Type", "application/x-protobuf"));
                                    yqnVar = new yqn(new HttpRequest(uriA.toString(), arrayList2, byteArray2, HttpMethod.POST, false), null, !ahno.aa(uriA.getAuthority()));
                                } else {
                                    listenableFutureM = ahng.n(((jqy) yqwVar2.a(aigjVar, yrrVar2, tnsVar, xscVar, wiuVar2, jrtVarS, zA, z3, yqhVar).build()).toByteArray());
                                    yqnVar = new yqn(null, ahcs.e(listenableFutureM, afwl.a(new tvm(yqwVar2, uriA, 18, null)), MoreExecutors.directExecutor()), !ahno.aa(uriA.getAuthority()));
                                }
                                yrrVar = yqoVar2.a;
                                if (!yrrVar.r) {
                                }
                                oqeVar = new oqe(yqoVar2, 15);
                                ytf ytfVar3 = yqoVar2.n;
                                z4 = yqoVar2.z;
                                if (z4) {
                                    str5 = "2";
                                } else {
                                    str5 = "1";
                                }
                                ytfVar3.f("plat_one", str5);
                                zjdVar = yqoVar2.o;
                                zjdVar.V();
                                if (z4) {
                                    HttpRequest httpRequest2 = yqnVar.a;
                                    zkf.d(httpRequest2);
                                    ysnVar = new yso(new ysv(httpRequest2));
                                } else {
                                    jC = yqoVar2.e.j.c(25, 45424427L, 0L);
                                    if (jC == 1) {
                                        executor = yqoVar2.L;
                                    } else if (jC == 2) {
                                        executor = yqoVar2.d;
                                    } else {
                                        executor = yqoVar2.u;
                                    }
                                    ysnVar = new ysn(new ysu(oqeVar, executor, new yre(zjdVar, new dwv(yqoVar2, 3))));
                                }
                                afipVar = yqoVar2.P;
                                str6 = yrrVar.b;
                                zjrVar3 = yqoVar2.e;
                                xplVar = yqoVar2.N;
                                Object obj8 = afipVar.d;
                                ytkVar = new ytk(zjdVar, (xeu) obj8, zjrVar3);
                                ywnVarC = ywl.C((zgm) afipVar.h, str6, zjrVar3);
                                ytlVar = new ytl(ywnVarC, (xeu) obj8, zjrVar3);
                                obj = afipVar.b;
                                obj2 = afipVar.g;
                                str6.getClass();
                                obj2.getClass();
                                Object obj9 = ((abxv) obj).c;
                                obj3 = ((abxv) obj).a;
                                if (((zhl) obj3).dS()) {
                                    obj4 = null;
                                } else {
                                    obj4 = null;
                                }
                                if (obj4 != null) {
                                    str7 = str6;
                                    ypfVar = new ypf(str6, new ypb(((zhl) obj3).q(), ((zhl) obj3).r(), ((zhl) obj3).dR()), (xeu) ((abxv) obj).b, ywnVarC, (hhb) ((abxv) obj).d);
                                } else {
                                    str7 = str6;
                                    ypfVar = new ypf(str6, new ypb(((zhl) obj3).q(), ((zhl) obj3).r(), ((zhl) obj3).dR()), (xeu) ((abxv) obj).b, ywnVarC, (hhb) ((abxv) obj).d);
                                }
                                if (ysnVar.b() == i) {
                                    ytbVar = new ytb(yqoVar2);
                                    synchronized (zik.class) {
                                        PlatypusNativeLoader.a();
                                        akxc akxcVarT2 = zjrVar3.T();
                                        OnesieFetcher onesieFetcherStartOnesieFetch2 = PlatypusOnesie.startOnesieFetch(ytbVar, ytkVar, ytlVar, ypfVar, str7, zjrVar3.W(), zjrVar3.V(), (byte[]) xplVar.b, (com.google.android.libraries.youtube.media.interfaces.Executor) obj2, ysnVar.c().a, new OnesieRetryConfig(akxcVarT2.c, akxcVarT2.e, akxcVarT2.d, akxcVarT2.f, zjrVar3.K()));
                                        yqoVar = this;
                                        ytcVar = new ytc(onesieFetcherStartOnesieFetch2, (avlh) afipVar.e, (avlh) afipVar.a, (avmb) afipVar.f, zjrVar3.N(), ytbVar);
                                    }
                                } else {
                                    synchronized (zik.class) {
                                        PlatypusNativeLoader.a();
                                        if (zjrVar3.bW()) {
                                            ?? r2 = afipVar.c;
                                            ((SharedBandwidthSampleTrackerWrapper) r2.io()).a();
                                            sharedBandwidthSampleTracker = ((SharedBandwidthSampleTrackerWrapper) r2.io()).a;
                                        } else {
                                            sharedBandwidthSampleTracker = null;
                                        }
                                        yqoVar = this;
                                        NetFetchCallbacks netFetchCallbacks2 = PlatypusOnesie.createOnesieResponseHandler(yqoVar, ytkVar, ytlVar, ypfVar, str7, zjrVar3.W(), zjrVar3.V(), (byte[]) xplVar.b, sharedBandwidthSampleTracker, null).getNetFetchCallbacks();
                                        ysu ysuVarA2 = ysnVar.a();
                                        ytcVar = new ysy(ysuVarA2.a.io(), ysuVarA2.b, ysuVarA2.c, zjrVar3, new yss(netFetchCallbacks2));
                                    }
                                }
                                yqoVar.G = ytcVar;
                                if (!z4) {
                                    ListenableFuture listenableFuture2 = yqnVar.b;
                                    zkf.d(listenableFuture2);
                                    ysz yszVar2 = yqoVar.G;
                                    zkf.d(yszVar2);
                                    yszVar2.getClass();
                                    taf.g(listenableFuture2, new yqj(yszVar2, 0));
                                }
                                yqoVar.o(yqoVar.I);
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                z = true;
                                yqoVar2.K = z;
                                yqoVar2.o.K();
                                yqoVar2.k(new IllegalStateException("Something went wrong with sending the Onesie request"));
                                zhq zhqVar5 = zhq.ABR;
                                yqoVar2.d();
                                throw th;
                            }
                        }
                        yqgVar = yqgVar2;
                        aiieVar = aiieVar;
                        xscVar = xscVar;
                        yqwVar = yqwVar3;
                        i = 2;
                        wiuVar = yrrVar2.g;
                        if (!zjrVar.db()) {
                            wiuVar2 = wiuVar;
                            str4 = authority;
                            yqhVar = yqhVar2;
                            if (zjrVar.i.m(102, 45621285L)) {
                                vyqVar = (vyq) ahng.v(hed.C());
                            } else {
                                vyqVar = null;
                            }
                            if (vyqVar != null) {
                                if (ythVarD == null) {
                                    if (yqgVar != null) {
                                        tytVar.e("cbd", Long.toString(yqgVar.a()));
                                        strE = yqgVar.e();
                                        if (strE != null) {
                                            tytVar.e("csr", strE);
                                        }
                                        if (!TextUtils.isEmpty(r19)) {
                                            tytVar.e("por", "yes");
                                            tytVar.e("plh", "yes");
                                            r0 = r19;
                                        }
                                    }
                                } else if (yqgVar != null) {
                                    tytVar.e("cbd", Long.toString(yqgVar.a()));
                                    strE = yqgVar.e();
                                    if (strE != null) {
                                        tytVar.e("csr", strE);
                                    }
                                    if (!TextUtils.isEmpty(r19)) {
                                        tytVar.e("por", "yes");
                                        tytVar.e("plh", "yes");
                                        r0 = r19;
                                    }
                                }
                            } else if (ythVarD == null) {
                                if (yqgVar != null) {
                                    tytVar.e("cbd", Long.toString(yqgVar.a()));
                                    strE = yqgVar.e();
                                    if (strE != null) {
                                        tytVar.e("csr", strE);
                                    }
                                    if (!TextUtils.isEmpty(r19)) {
                                        tytVar.e("por", "yes");
                                        tytVar.e("plh", "yes");
                                        r0 = r19;
                                    }
                                }
                            } else if (yqgVar != null) {
                                tytVar.e("cbd", Long.toString(yqgVar.a()));
                                strE = yqgVar.e();
                                if (strE != null) {
                                    tytVar.e("csr", strE);
                                }
                                if (!TextUtils.isEmpty(r19)) {
                                    tytVar.e("por", "yes");
                                    tytVar.e("plh", "yes");
                                    r0 = r19;
                                }
                            }
                            zjrVar2 = yqwVar2.c;
                            if (zjrVar2.db()) {
                                if (!ahno.aa(str3)) {
                                    tytVar = new tyt(Uri.parse(String.valueOf(tytVar.a().toString()).concat(String.valueOf(str3))));
                                }
                                z2 = true;
                                r10 = str2;
                            } else {
                                if (!ahno.aa(str3)) {
                                    tytVar = new tyt(Uri.parse(String.valueOf(tytVar.a().toString()).concat(String.valueOf(str3))));
                                }
                                z2 = true;
                                r10 = str2;
                            }
                            if (r10 != 0) {
                                if (yqwVar2.b.io().aS()) {
                                    A = yti.a((String) r10);
                                }
                                A = r10;
                                A = r10;
                                tytVar.a = (String) A;
                            }
                            tytVar.e("opr", "1");
                            optionalOfNullable = Optional.ofNullable(yrrVar2.j);
                            if (true == optionalOfNullable.isPresent()) {
                                optionalOfNullable = Optional.ofNullable(Double.valueOf(((Duration) optionalOfNullable.get()).toMillis() / 1000.0d));
                            }
                            d = (Double) optionalOfNullable.orElse(null);
                            if (yrrVar2.r) {
                                if (TextUtils.isEmpty(yrrVar2.h)) {
                                    String str12 = yrrVar2.h;
                                    agkz agkzVar4 = yti.a;
                                    typ.f(str12);
                                    bArrK = agyg.e.k(agdv.b.j(str12));
                                    sb = new StringBuilder();
                                    length = bArrK.length;
                                    i4 = 0;
                                    while (i4 < length) {
                                        sb.append(String.format("%02x", Byte.valueOf(bArrK[i4])));
                                        i4++;
                                        ythVarD = ythVarD;
                                        zA2 = zA2;
                                    }
                                    ythVar = ythVarD;
                                    z3 = zA2;
                                    tytVar.e("id", sb.toString());
                                } else {
                                    ythVar = ythVarD;
                                    z3 = zA2;
                                }
                                if (d != null) {
                                    tytVar.e("osts", d.toString());
                                }
                            } else {
                                zA = zA;
                                ythVar = ythVarD;
                                z3 = zA2;
                            }
                            i2 = yrrVar2.o;
                            i3 = yrrVar2.n;
                            if (i2 >= 0) {
                                tytVar.e("oad", Integer.toString(i2));
                            }
                            if (i3 >= 0) {
                                tytVar.e("ovd", Integer.toString(i3));
                            }
                            if (yrrVar2.e()) {
                                tytVar.e("opf", "1");
                            }
                            if (yrrVar2.i) {
                                tytVar.e("oplid", "1");
                            }
                            if (zjrVar2.i.l(245, 45714895L, false)) {
                                tytVar.e("osts", d.toString());
                            }
                            if (zjrVar2.j.m(224, 45642230L)) {
                                tytVar.e("rn", String.valueOf(ypz.c(yrrVar2.b, zjrVar2.eA()).a()));
                            }
                            uriA = tytVar.a();
                            if (z5) {
                                byte[] byteArray3 = ((jqy) yqwVar2.a(aigjVar, yrrVar2, tnsVar, xscVar, wiuVar2, jrtVarS, zA, z3, yqhVar).build()).toByteArray();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(new HttpHeader("Content-Type", "application/x-protobuf"));
                                yqnVar = new yqn(new HttpRequest(uriA.toString(), arrayList3, byteArray3, HttpMethod.POST, false), null, !ahno.aa(uriA.getAuthority()));
                            } else {
                                listenableFutureM = ahng.n(((jqy) yqwVar2.a(aigjVar, yrrVar2, tnsVar, xscVar, wiuVar2, jrtVarS, zA, z3, yqhVar).build()).toByteArray());
                                yqnVar = new yqn(null, ahcs.e(listenableFutureM, afwl.a(new tvm(yqwVar2, uriA, 18, null)), MoreExecutors.directExecutor()), !ahno.aa(uriA.getAuthority()));
                            }
                            yrrVar = yqoVar2.a;
                            if (!yrrVar.r) {
                            }
                            oqeVar = new oqe(yqoVar2, 15);
                            ytf ytfVar4 = yqoVar2.n;
                            z4 = yqoVar2.z;
                            if (z4) {
                                str5 = "2";
                            } else {
                                str5 = "1";
                            }
                            ytfVar4.f("plat_one", str5);
                            zjdVar = yqoVar2.o;
                            zjdVar.V();
                            if (z4) {
                                HttpRequest httpRequest3 = yqnVar.a;
                                zkf.d(httpRequest3);
                                ysnVar = new yso(new ysv(httpRequest3));
                            } else {
                                jC = yqoVar2.e.j.c(25, 45424427L, 0L);
                                if (jC == 1) {
                                    executor = yqoVar2.L;
                                } else if (jC == 2) {
                                    executor = yqoVar2.d;
                                } else {
                                    executor = yqoVar2.u;
                                }
                                ysnVar = new ysn(new ysu(oqeVar, executor, new yre(zjdVar, new dwv(yqoVar2, 3))));
                            }
                            afipVar = yqoVar2.P;
                            str6 = yrrVar.b;
                            zjrVar3 = yqoVar2.e;
                            xplVar = yqoVar2.N;
                            Object obj10 = afipVar.d;
                            ytkVar = new ytk(zjdVar, (xeu) obj10, zjrVar3);
                            ywnVarC = ywl.C((zgm) afipVar.h, str6, zjrVar3);
                            ytlVar = new ytl(ywnVarC, (xeu) obj10, zjrVar3);
                            obj = afipVar.b;
                            obj2 = afipVar.g;
                            str6.getClass();
                            obj2.getClass();
                            Object obj11 = ((abxv) obj).c;
                            obj3 = ((abxv) obj).a;
                            if (((zhl) obj3).dS()) {
                                obj4 = null;
                            } else {
                                obj4 = null;
                            }
                            if (obj4 != null) {
                                str7 = str6;
                                ypfVar = new ypf(str6, new ypb(((zhl) obj3).q(), ((zhl) obj3).r(), ((zhl) obj3).dR()), (xeu) ((abxv) obj).b, ywnVarC, (hhb) ((abxv) obj).d);
                            } else {
                                str7 = str6;
                                ypfVar = new ypf(str6, new ypb(((zhl) obj3).q(), ((zhl) obj3).r(), ((zhl) obj3).dR()), (xeu) ((abxv) obj).b, ywnVarC, (hhb) ((abxv) obj).d);
                            }
                            if (ysnVar.b() == i) {
                                ytbVar = new ytb(yqoVar2);
                                synchronized (zik.class) {
                                    PlatypusNativeLoader.a();
                                    akxc akxcVarT3 = zjrVar3.T();
                                    OnesieFetcher onesieFetcherStartOnesieFetch3 = PlatypusOnesie.startOnesieFetch(ytbVar, ytkVar, ytlVar, ypfVar, str7, zjrVar3.W(), zjrVar3.V(), (byte[]) xplVar.b, (com.google.android.libraries.youtube.media.interfaces.Executor) obj2, ysnVar.c().a, new OnesieRetryConfig(akxcVarT3.c, akxcVarT3.e, akxcVarT3.d, akxcVarT3.f, zjrVar3.K()));
                                    yqoVar = this;
                                    ytcVar = new ytc(onesieFetcherStartOnesieFetch3, (avlh) afipVar.e, (avlh) afipVar.a, (avmb) afipVar.f, zjrVar3.N(), ytbVar);
                                }
                            } else {
                                synchronized (zik.class) {
                                    PlatypusNativeLoader.a();
                                    if (zjrVar3.bW()) {
                                        ?? r3 = afipVar.c;
                                        ((SharedBandwidthSampleTrackerWrapper) r3.io()).a();
                                        sharedBandwidthSampleTracker = ((SharedBandwidthSampleTrackerWrapper) r3.io()).a;
                                    } else {
                                        sharedBandwidthSampleTracker = null;
                                    }
                                    yqoVar = this;
                                    NetFetchCallbacks netFetchCallbacks3 = PlatypusOnesie.createOnesieResponseHandler(yqoVar, ytkVar, ytlVar, ypfVar, str7, zjrVar3.W(), zjrVar3.V(), (byte[]) xplVar.b, sharedBandwidthSampleTracker, null).getNetFetchCallbacks();
                                    ysu ysuVarA3 = ysnVar.a();
                                    ytcVar = new ysy(ysuVarA3.a.io(), ysuVarA3.b, ysuVarA3.c, zjrVar3, new yss(netFetchCallbacks3));
                                }
                            }
                            yqoVar.G = ytcVar;
                            if (!z4) {
                                ListenableFuture listenableFuture3 = yqnVar.b;
                                zkf.d(listenableFuture3);
                                ysz yszVar3 = yqoVar.G;
                                zkf.d(yszVar3);
                                yszVar3.getClass();
                                taf.g(listenableFuture3, new yqj(yszVar3, 0));
                            }
                            yqoVar.o(yqoVar.I);
                            return;
                        }
                        wiuVar2 = wiuVar;
                        str4 = authority;
                        yqhVar = yqhVar2;
                        if (ysnVar.b() == i) {
                            ytbVar = new ytb(yqoVar2);
                            synchronized (zik.class) {
                                PlatypusNativeLoader.a();
                                akxc akxcVarT4 = zjrVar3.T();
                                OnesieFetcher onesieFetcherStartOnesieFetch4 = PlatypusOnesie.startOnesieFetch(ytbVar, ytkVar, ytlVar, ypfVar, str7, zjrVar3.W(), zjrVar3.V(), (byte[]) xplVar.b, (com.google.android.libraries.youtube.media.interfaces.Executor) obj2, ysnVar.c().a, new OnesieRetryConfig(akxcVarT4.c, akxcVarT4.e, akxcVarT4.d, akxcVarT4.f, zjrVar3.K()));
                                yqoVar = this;
                                ytcVar = new ytc(onesieFetcherStartOnesieFetch4, (avlh) afipVar.e, (avlh) afipVar.a, (avmb) afipVar.f, zjrVar3.N(), ytbVar);
                            }
                        } else {
                            synchronized (zik.class) {
                                PlatypusNativeLoader.a();
                                if (zjrVar3.bW()) {
                                    ?? r4 = afipVar.c;
                                    ((SharedBandwidthSampleTrackerWrapper) r4.io()).a();
                                    sharedBandwidthSampleTracker = ((SharedBandwidthSampleTrackerWrapper) r4.io()).a;
                                } else {
                                    sharedBandwidthSampleTracker = null;
                                }
                                yqoVar = this;
                                NetFetchCallbacks netFetchCallbacks4 = PlatypusOnesie.createOnesieResponseHandler(yqoVar, ytkVar, ytlVar, ypfVar, str7, zjrVar3.W(), zjrVar3.V(), (byte[]) xplVar.b, sharedBandwidthSampleTracker, null).getNetFetchCallbacks();
                                ysu ysuVarA4 = ysnVar.a();
                                ytcVar = new ysy(ysuVarA4.a.io(), ysuVarA4.b, ysuVarA4.c, zjrVar3, new yss(netFetchCallbacks4));
                            }
                        }
                        yqoVar.G = ytcVar;
                        if (!z4) {
                            ListenableFuture listenableFuture4 = yqnVar.b;
                            zkf.d(listenableFuture4);
                            ysz yszVar4 = yqoVar.G;
                            zkf.d(yszVar4);
                            yszVar4.getClass();
                            taf.g(listenableFuture4, new yqj(yszVar4, 0));
                        }
                        yqoVar.o(yqoVar.I);
                        return;
                    } catch (RuntimeException | tmg | yrp e3) {
                        e = e3;
                        yqoVar2 = this;
                        yqoVar2.n.e("player.exception", e);
                        yqoVar2.K = true;
                        yqoVar2.o.K();
                        yqoVar2.k(new IllegalStateException("Something went wrong with sending the Onesie request"));
                        zhq zhqVar6 = zhq.ABR;
                        yqoVar2.d();
                        return;
                    }
                    yqwVar2 = yqwVar;
                    r19 = obj5;
                    zA = ((yrn) yqwVar2.d.io()).a();
                    str = yrrVar2.h;
                    if (TextUtils.isEmpty(str)) {
                        zA2 = false;
                    } else {
                        zA2 = false;
                    }
                    tytVar = new tyt(uri);
                    authority = uri.getAuthority();
                    str2 = yrrVar2.s;
                    str3 = yrrVar2.t;
                    zjrVar = yqwVar2.c;
                    r0 = str4;
                    zjrVar2 = yqwVar2.c;
                    if (zjrVar2.db()) {
                        if (!ahno.aa(str3)) {
                            tytVar = new tyt(Uri.parse(String.valueOf(tytVar.a().toString()).concat(String.valueOf(str3))));
                        }
                        z2 = true;
                        r10 = str2;
                    } else {
                        if (!ahno.aa(str3)) {
                            tytVar = new tyt(Uri.parse(String.valueOf(tytVar.a().toString()).concat(String.valueOf(str3))));
                        }
                        z2 = true;
                        r10 = str2;
                    }
                    if (r10 != 0) {
                        if (yqwVar2.b.io().aS()) {
                            A = yti.a((String) r10);
                        }
                        A = r10;
                        A = r10;
                        tytVar.a = (String) A;
                    }
                    tytVar.e("opr", "1");
                    optionalOfNullable = Optional.ofNullable(yrrVar2.j);
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable(Double.valueOf(((Duration) optionalOfNullable.get()).toMillis() / 1000.0d));
                    }
                    d = (Double) optionalOfNullable.orElse(null);
                    if (yrrVar2.r) {
                        if (TextUtils.isEmpty(yrrVar2.h)) {
                            String str13 = yrrVar2.h;
                            agkz agkzVar5 = yti.a;
                            typ.f(str13);
                            bArrK = agyg.e.k(agdv.b.j(str13));
                            sb = new StringBuilder();
                            length = bArrK.length;
                            i4 = 0;
                            while (i4 < length) {
                                sb.append(String.format("%02x", Byte.valueOf(bArrK[i4])));
                                i4++;
                                ythVarD = ythVarD;
                                zA2 = zA2;
                            }
                            ythVar = ythVarD;
                            z3 = zA2;
                            tytVar.e("id", sb.toString());
                        } else {
                            ythVar = ythVarD;
                            z3 = zA2;
                        }
                        if (d != null) {
                            tytVar.e("osts", d.toString());
                        }
                    } else {
                        zA = zA;
                        ythVar = ythVarD;
                        z3 = zA2;
                    }
                    i2 = yrrVar2.o;
                    i3 = yrrVar2.n;
                    if (i2 >= 0) {
                        tytVar.e("oad", Integer.toString(i2));
                    }
                    if (i3 >= 0) {
                        tytVar.e("ovd", Integer.toString(i3));
                    }
                    if (yrrVar2.e()) {
                        tytVar.e("opf", "1");
                    }
                    if (yrrVar2.i) {
                        tytVar.e("oplid", "1");
                    }
                    if (zjrVar2.i.l(245, 45714895L, false)) {
                        tytVar.e("osts", d.toString());
                    }
                    if (zjrVar2.j.m(224, 45642230L)) {
                        tytVar.e("rn", String.valueOf(ypz.c(yrrVar2.b, zjrVar2.eA()).a()));
                    }
                    uriA = tytVar.a();
                    if (z5) {
                        byte[] byteArray4 = ((jqy) yqwVar2.a(aigjVar, yrrVar2, tnsVar, xscVar, wiuVar2, jrtVarS, zA, z3, yqhVar).build()).toByteArray();
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new HttpHeader("Content-Type", "application/x-protobuf"));
                        yqnVar = new yqn(new HttpRequest(uriA.toString(), arrayList4, byteArray4, HttpMethod.POST, false), null, !ahno.aa(uriA.getAuthority()));
                    } else {
                        listenableFutureM = ahng.n(((jqy) yqwVar2.a(aigjVar, yrrVar2, tnsVar, xscVar, wiuVar2, jrtVarS, zA, z3, yqhVar).build()).toByteArray());
                        yqnVar = new yqn(null, ahcs.e(listenableFutureM, afwl.a(new tvm(yqwVar2, uriA, 18, null)), MoreExecutors.directExecutor()), !ahno.aa(uriA.getAuthority()));
                    }
                    yrrVar = yqoVar2.a;
                    if (!yrrVar.r) {
                    }
                    oqeVar = new oqe(yqoVar2, 15);
                    ytf ytfVar5 = yqoVar2.n;
                    z4 = yqoVar2.z;
                    if (z4) {
                        str5 = "2";
                    } else {
                        str5 = "1";
                    }
                    ytfVar5.f("plat_one", str5);
                    zjdVar = yqoVar2.o;
                    zjdVar.V();
                    if (z4) {
                        HttpRequest httpRequest4 = yqnVar.a;
                        zkf.d(httpRequest4);
                        ysnVar = new yso(new ysv(httpRequest4));
                    } else {
                        jC = yqoVar2.e.j.c(25, 45424427L, 0L);
                        if (jC == 1) {
                            executor = yqoVar2.L;
                        } else if (jC == 2) {
                            executor = yqoVar2.d;
                        } else {
                            executor = yqoVar2.u;
                        }
                        ysnVar = new ysn(new ysu(oqeVar, executor, new yre(zjdVar, new dwv(yqoVar2, 3))));
                    }
                    afipVar = yqoVar2.P;
                    str6 = yrrVar.b;
                    zjrVar3 = yqoVar2.e;
                    xplVar = yqoVar2.N;
                    Object obj12 = afipVar.d;
                    ytkVar = new ytk(zjdVar, (xeu) obj12, zjrVar3);
                    ywnVarC = ywl.C((zgm) afipVar.h, str6, zjrVar3);
                    ytlVar = new ytl(ywnVarC, (xeu) obj12, zjrVar3);
                    obj = afipVar.b;
                    obj2 = afipVar.g;
                    str6.getClass();
                    obj2.getClass();
                    Object obj13 = ((abxv) obj).c;
                    obj3 = ((abxv) obj).a;
                    if (((zhl) obj3).dS()) {
                        obj4 = null;
                    } else {
                        obj4 = null;
                    }
                    if (obj4 != null) {
                        str7 = str6;
                        ypfVar = new ypf(str6, new ypb(((zhl) obj3).q(), ((zhl) obj3).r(), ((zhl) obj3).dR()), (xeu) ((abxv) obj).b, ywnVarC, (hhb) ((abxv) obj).d);
                    } else {
                        str7 = str6;
                        ypfVar = new ypf(str6, new ypb(((zhl) obj3).q(), ((zhl) obj3).r(), ((zhl) obj3).dR()), (xeu) ((abxv) obj).b, ywnVarC, (hhb) ((abxv) obj).d);
                    }
                } catch (RuntimeException e4) {
                    e = e4;
                }
            } catch (tmg e5) {
                e = e5;
            } catch (yrp e6) {
                e = e6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void onDecryptedPlayerResponseBytes(ByteBuffer byteBuffer) {
        try {
            yqq yqqVarG = this.r.g(byteBuffer);
            if (this.e.l.m(41, 45691318L)) {
                e(yqqVarG);
            } else {
                yno.S(this.q, new xoy(this, yqqVarG, 16), 0L, this.n.a(), this.p, "Failed to deliver player response.");
            }
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void onDecryptedStreamingWatchBytes(ByteBuffer byteBuffer) {
        try {
            avls avlsVar = this.m;
            if (avlsVar != null) {
                avlsVar.c(this.r.g(byteBuffer));
            }
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void onOnesieRequestDone(QoeError qoeError) {
        try {
            if (this.f) {
                f(qoeError);
            } else {
                yno.S(this.q, new xoy(this, qoeError, 15, null), 0L, this.n.a(), this.p, "Failed to call onOnesieRequestDoneInternal.");
            }
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void setOnesieResponseSelector(String str, OnesieResponseSelector onesieResponseSelector) {
        try {
            yqy yqyVar = this.g;
            onesieResponseSelector.getClass();
            yqyVar.g(str, new yrf(new ysi(onesieResponseSelector), this, str));
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlatformOnesieCallbacks
    public final void setOnesieVideoData(String str, OnesieVideoData onesieVideoData) {
        if (onesieVideoData == null) {
            h(new IOException("OnesieVideoData is null."));
            return;
        }
        try {
            this.g.g(str, new yrf(new ysj(onesieVideoData), this, str));
        } catch (Throwable th) {
            g(th);
        }
    }
}
