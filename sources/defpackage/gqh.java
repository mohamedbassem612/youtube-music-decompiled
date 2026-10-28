package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqh implements wnf {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/browse/PersistentBrowseService");
    public final aunn b;
    public final tbt c;
    public final ScheduledExecutorService d;
    public final woh e;
    public final wom f;
    public final aerv g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final vxz i;
    public final jnm j;
    private final Executor k;
    private final Executor l;
    private final tqj m;
    private final xeu n;
    private final mbc o;
    private final hdr p;
    private final hut r;
    private final awkv s;

    public gqh(wom womVar, hut hutVar, tbt tbtVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Executor executor2, tqj tqjVar, woh wohVar, xeu xeuVar, mbc mbcVar, hdr hdrVar, jnm jnmVar, aunn aunnVar, vxz vxzVar, aerv aervVar, awkv awkvVar) {
        this.f = womVar;
        this.r = hutVar;
        this.c = tbtVar;
        this.k = executor;
        this.e = wohVar;
        this.d = scheduledExecutorService;
        this.l = executor2;
        this.m = tqjVar;
        this.n = xeuVar;
        this.o = mbcVar;
        this.p = hdrVar;
        this.j = jnmVar;
        this.b = aunnVar;
        this.i = vxzVar;
        this.g = aervVar;
        this.s = awkvVar;
    }

    public static final Optional j(wfy wfyVar) {
        wgd wgdVarH;
        return (wfyVar.f().isEmpty() || (wgdVarH = ((aftj) wfyVar.f().get(0)).h()) == null) ? Optional.empty() : Collection.EL.stream(wgdVarH.a()).filter(new gqn(1)).findFirst();
    }

    private final Executor k() {
        int i = tqr.a;
        return this.m.k(1073830338) ? this.l : this.d;
    }

    private static boolean l(woo wooVar) {
        return !TextUtils.isEmpty(wooVar.i);
    }

    private static final boolean m(woo wooVar) {
        return !TextUtils.isEmpty(wooVar.a) && TextUtils.isEmpty(wooVar.c) && wooVar.d == null && wooVar.D == null;
    }

    private static final boolean n(String str) {
        return !ahno.aa(str) && str.equals("MUSIC_HOME_CLIENT_AWARE_CONTINUATION_TOKEN_INSERT_DOWNLOADS_SHELF");
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return ape.f(new dzm(this, wluVar, wneVar, 2));
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        if (n(((almb) ((aihh) wluVar.a()).instance).h)) {
            this.r.c(wluVar, wneVar, zzaVar);
        } else {
            i(wluVar, wneVar, new rqd(zzaVar, 1), false);
        }
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return ape.f(new dzm(this, wluVar, wneVar, 2));
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, xir] */
    public final gnq e(woo wooVar, wfy wfyVar, gnl gnlVar) {
        gqh gqhVar;
        woo wooVar2;
        wfy wfyVar2;
        boolean z;
        almd almdVar;
        Optional optional = gnlVar.b;
        if (optional.isPresent()) {
            optional.get().f(tau.BROWSE_RESPONSE_RECEIVED);
        } else {
            this.c.c(new ham());
        }
        if (!wooVar.x() || (!(m(wooVar) || l(wooVar)) || (almdVar = wfyVar.a) == null)) {
            gqhVar = this;
            wooVar2 = wooVar;
            wfyVar2 = wfyVar;
            z = false;
        } else {
            z = !TextUtils.isEmpty(gzj.a(wooVar)) && (almdVar.o > 0 || almdVar.p > 0) && this.e.i();
            gqhVar = this;
            wooVar2 = wooVar;
            wfyVar2 = wfyVar;
            this.d.submit(new gqc(gqhVar, wfyVar2, wooVar2, z, 0));
        }
        if (gqhVar.i.l(25, 45731046L, false)) {
            Optional optionalJ = j(wfyVar2);
            if (!optionalJ.isEmpty()) {
                gqhVar.g.b("AUTOLOAD_AVAILABLE");
                woo wooVarA = gqhVar.a((acjx) optionalJ.get());
                gzj.a(wooVarA);
                gqhVar.i(wooVarA, new gqg(), new gtg(gqhVar, 1), true);
            }
            if (!z) {
            }
        }
        mbc mbcVar = gqhVar.o;
        gnm gnmVarA = gnn.a();
        gnmVarA.c(mbcVar.f().toEpochMilli());
        gnmVarA.f(z);
        return new gnq(wfyVar2, gnmVarA.a());
    }

    @Override // defpackage.wnf
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final woo a(acjx acjxVar) {
        return n(acjxVar.c()) ? this.r.a(acjxVar) : this.f.a(acjxVar);
    }

    public final ListenableFuture g(woo wooVar, gnl gnlVar, Optional optional, Runnable runnable) {
        wooVar.getClass();
        int i = 1;
        hql hqlVar = new hql(this, wooVar, optional, gnlVar, i);
        Executor executorK = k();
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), hqlVar, 1));
        executorK.execute(ahfoVar);
        this.c.c(new hah(wooVar));
        return afxd.f(ahfoVar).h(new afgt(this, gnlVar, runnable, wooVar, i), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Type inference failed for: r15v43, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, xir] */
    public final Optional h(woo wooVar, Optional optional, Optional optional2) {
        int i;
        int i2;
        long j;
        if (!wooVar.w() || (!m(wooVar) && !l(wooVar))) {
            return Optional.empty();
        }
        Optional optionalEmpty = Optional.empty();
        String strA = gzj.a(wooVar);
        tbt tbtVar = this.c;
        tbtVar.c(new haf());
        if (optional2.isPresent()) {
            optional2.get().f(tau.PERSISTENT_BROWSE_CACHE_READ_START);
        }
        axnp axnpVarK = this.e.k(strA);
        tbtVar.c(new hae());
        if (optional2.isPresent()) {
            optional2.get().f(tau.PERSISTENT_BROWSE_CACHE_READ_END);
        }
        this.s.kk(new gmu(wooVar.a, axnpVarK.c()));
        int i3 = 1;
        if (axnpVarK.d()) {
            wfy wfyVar = new wfy((almd) axnpVarK.b);
            long j2 = axnpVarK.a;
            gnm gnmVarA = gnn.a();
            gnmVarA.c(j2);
            gnmVarA.e(true);
            gnmVarA.g(vwn.STALE == axnpVarK.c());
            gnn gnnVarA = gnmVarA.a();
            optional.isPresent();
            Optional optionalOf = Optional.of(new gnq(wfyVar, gnnVarA));
            hdr hdrVar = this.p;
            alop alopVar = wfyVar.a.c;
            if (alopVar == null) {
                alopVar = alop.a;
            }
            hdrVar.b(alopVar);
            optionalEmpty = optionalOf;
        }
        aihf aihfVarCreateBuilder = antm.a.createBuilder();
        String str = wooVar.a;
        int iHashCode = str.hashCode();
        if (iHashCode != -925259494) {
            if (iHashCode == 229913784 && str.equals("FEmusic_home")) {
                i = 2;
            } else {
                i = 1;
            }
        } else if (str.equals("FEmusic_library_landing")) {
            i = 3;
        } else {
            i = 1;
        }
        aihfVarCreateBuilder.copyOnWrite();
        antm antmVar = (antm) aihfVarCreateBuilder.instance;
        antmVar.d = i - 1;
        antmVar.b |= 2;
        int i4 = wooVar.H;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        if (i5 != 6) {
            i2 = i5 != 7 ? 1 : 4;
        } else {
            i2 = 2;
        }
        aihfVarCreateBuilder.copyOnWrite();
        antm antmVar2 = (antm) aihfVarCreateBuilder.instance;
        antmVar2.c = i2 - 1;
        antmVar2.b |= 1;
        int iOrdinal = axnpVarK.c().ordinal();
        if (iOrdinal == 1) {
            i3 = 3;
        } else if (iOrdinal == 2) {
            i3 = 4;
        } else if (iOrdinal == 3) {
            i3 = 5;
        } else if (iOrdinal == 4) {
            i3 = 2;
        }
        aihfVarCreateBuilder.copyOnWrite();
        antm antmVar3 = (antm) aihfVarCreateBuilder.instance;
        antmVar3.e = i3 - 1;
        antmVar3.b |= 4;
        if (axnpVarK.c() == vwn.AVAILABLE || axnpVarK.c() == vwn.STALE || axnpVarK.c() == vwn.EXPIRED) {
            Object obj = axnpVarK.b;
            long j3 = axnpVarK.a;
            almd almdVar = (almd) obj;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long j4 = j3 / 1000;
            long j5 = 0;
            if (j4 > 0 && almdVar != null) {
                mbc mbcVar = this.o;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                long epochMilli = mbcVar.f().toEpochMilli() / 1000;
                int i6 = almdVar.p;
                if (i6 > 0) {
                    int i7 = almdVar.o;
                    long j6 = i7 == 0 ? 0L : j4 + ((long) i7);
                    long j7 = j6 == 0 ? 0L : j6 - epochMilli;
                    long j8 = j6 == 0 ? 0L : j6 + ((long) i6);
                    j = j8 != 0 ? j8 - epochMilli : 0L;
                    j5 = j7;
                } else {
                    int i8 = almdVar.o;
                    long j9 = i8 == 0 ? 0L : j4 + ((long) i8);
                    j = j9 == 0 ? 0L : j9 - epochMilli;
                }
                aihfVarCreateBuilder.copyOnWrite();
                antm antmVar4 = (antm) aihfVarCreateBuilder.instance;
                antmVar4.b |= 8;
                antmVar4.f = (int) j5;
                aihfVarCreateBuilder.copyOnWrite();
                antm antmVar5 = (antm) aihfVarCreateBuilder.instance;
                antmVar5.b |= 16;
                antmVar5.g = (int) j;
            }
        }
        xeu xeuVar = this.n;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_PERSISTENT_CACHE_CHECKED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            antm antmVar6 = (antm) aihfVarCreateBuilder.build();
            antmVar6.getClass();
            alouVar.d = antmVar6;
            alouVar.c = 154;
            xeuVar.b((alou) alosVar.build());
        }
        if (!optionalEmpty.isPresent()) {
            return optionalEmpty;
        }
        this.d.execute(new br(this, ((gnq) optionalEmpty.get()).a, 20, (byte[]) null));
        return optionalEmpty;
    }

    public final void i(wlu wluVar, final wne wneVar, zza zzaVar, final boolean z) {
        final woo wooVar = (woo) wluVar;
        fzs fzsVar = new fzs(this, wooVar, 2);
        Executor executorK = k();
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), fzsVar, 1));
        executorK.execute(ahfoVar);
        afxd.f(ahfoVar).h(new ahcy() { // from class: gqf
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                wne wneVar2 = wneVar;
                if (zIsPresent) {
                    wneVar2.b(((gnq) optional.get()).a);
                    return new aher((gnq) optional.get());
                }
                boolean z2 = z;
                woo wooVar2 = wooVar;
                gqh gqhVar = this.a;
                vxz vxzVar = gqhVar.i;
                String strA = gzj.a(wooVar2);
                if (!vxzVar.l(25, 45731046L, false)) {
                    if (z2) {
                        gqhVar.g.b("REQUEST_SENT");
                    }
                    return afxd.f(ape.f(new dzm(gqhVar.f, wooVar2, wneVar2, 2))).g(new gqa(gqhVar, wooVar2, 2), gqhVar.d);
                }
                ConcurrentHashMap concurrentHashMap = gqhVar.h;
                synchronized (concurrentHashMap) {
                    if (concurrentHashMap.containsKey(strA)) {
                        return (ListenableFuture) concurrentHashMap.get(strA);
                    }
                    if (z2) {
                        gqhVar.g.b("REQUEST_SENT");
                    }
                    afxd afxdVarF = afxd.f(ape.f(new dzm(gqhVar.f, wooVar2, wneVar2, 2)));
                    gqa gqaVar = new gqa(gqhVar, wooVar2, 0);
                    ScheduledExecutorService scheduledExecutorService = gqhVar.d;
                    afxd afxdVarC = afxdVarF.g(gqaVar, scheduledExecutorService).c(Throwable.class, new gqb(gqhVar, strA, 0), scheduledExecutorService);
                    concurrentHashMap.put(strA, afxdVarC);
                    return afxdVarC;
                }
            }
        }, this.d).i(new iin(zzaVar, 1), this.k);
    }
}
