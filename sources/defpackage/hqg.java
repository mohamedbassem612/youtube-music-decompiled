package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqg {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/compat/legacy/OfflineStoreObserver");
    public static final agkz b = agkz.q(aaia.class, aahm.class);
    public final awmd c;
    public final awmd d;
    public final awkv e;
    public final aauk f;
    public final wbz g;
    public final awmd h;
    public final Executor i;
    private final awkv j;
    private final awmd k;
    private final awmd l;
    private final awmd m;
    private final awmd n;
    private final zwb o;
    private final awmd p;
    private final awmd q;
    private final Map r;
    private final Map s;
    private final awmd t;
    private final Executor u;
    private final avmm v;

    public hqg(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, wbz wbzVar, zwb zwbVar, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, Map map, Map map2, Executor executor, Executor executor2, aauk aaukVar) {
        awkx awkxVar = new awkx();
        this.j = awkxVar;
        this.e = new awkx().aI();
        this.v = new avmm();
        this.c = awmdVar;
        this.d = awmdVar2;
        this.t = awmdVar3;
        this.k = awmdVar4;
        this.l = awmdVar5;
        this.m = awmdVar6;
        this.n = awmdVar7;
        this.g = wbzVar;
        this.o = zwbVar;
        this.p = awmdVar8;
        this.q = awmdVar9;
        this.h = awmdVar10;
        this.r = map;
        this.s = map2;
        this.i = executor;
        this.u = executor2;
        this.f = aaukVar;
        awkxVar.aI().N().L((avmb) awmdVar3.io()).D(new hbz(6)).z(new hbz(7), Alert.DURATION_SHOW_INDEFINITELY).z(new hbz(8), Alert.DURATION_SHOW_INDEFINITELY).al(new hjd(this, 17), new hpw(2));
    }

    public static final void o(wer werVar) {
        werVar.b().k(new hmd(9)).s().D();
    }

    private final void p(String str) {
        this.j.kk(ayq.F(str, aahv.class, new hgx(this, 9)));
    }

    public final ListenableFuture a(wer werVar) {
        return ahno.ar(((jan) this.k.io()).j(kro.aq()), new gqa(this, werVar, 12), this.i);
    }

    public final Optional b() {
        zwb zwbVar = this.o;
        if (!zwbVar.u()) {
            return Optional.empty();
        }
        Optional optionalOfNullable = Optional.ofNullable(this.g.e(zwbVar.e()));
        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((wby) optionalOfNullable.get()).e()) : optionalOfNullable;
    }

    public final Optional c(String str) {
        return Optional.ofNullable(((aanb) this.p.io()).b().i().a(str));
    }

    public final Optional d(String str) {
        return Optional.ofNullable(((aanb) this.p.io()).b().l().a(str));
    }

    public final void e(int i) {
        avmn avmnVarAl;
        Map map = this.r;
        Integer numValueOf = Integer.valueOf(i);
        aahd aahdVar = (aahd) map.get(numValueOf);
        if (aahdVar != null) {
            zwb zwbVar = this.o;
            Map map2 = this.s;
            zwa zwaVarE = zwbVar.e();
            long jLongValue = 500;
            if (map2.containsKey(numValueOf) && map2.get(numValueOf) != null) {
                jLongValue = ((Long) map2.get(numValueOf)).longValue();
            }
            avmm avmmVar = this.v;
            avlh avlhVarG = aahdVar.c(zwaVarE).g(avla.c);
            boolean zL = this.f.b.l(236, 45844922L, false);
            awmd awmdVar = this.t;
            if (zL) {
                avmnVarAl = avlhVarG.L((avmb) awmdVar.io()).al(new gkr(this, zwaVarE, 11), new hpw(2));
            } else {
                avlh avlhVarD = avlhVarG.L((avmb) awmdVar.io()).D(new hbz(9));
                int i2 = 1;
                avmnVarAl = avlhVarD.z(new vxy(jLongValue, i2), Alert.DURATION_SHOW_INDEFINITELY).al(new jbq(this, zwaVarE, i2), new hpw(2));
            }
            avmmVar.c(avmnVarAl);
        }
    }

    public final void f(wer werVar, weh... wehVarArr) {
        werVar.h(Arrays.asList(wehVarArr));
        for (weh wehVar : wehVarArr) {
            ahno.F(hpv.a.containsValue(wehVar.getClass()));
            awkv awkvVar = this.e;
            aaun aaunVar = new aaun();
            aaunVar.d(wehVar.b());
            aaunVar.b = wehVar;
            awkvVar.kk(aaunVar.b());
        }
    }

    public final void g(wer werVar, aamj aamjVar) {
        if (((hlz) this.q.io()).k(aamjVar.a)) {
            awmd awmdVar = this.m;
            f(werVar, ((hef) awmdVar.io()).g(aamjVar), ((hef) awmdVar.io()).e(aamjVar));
        } else {
            awmd awmdVar2 = this.n;
            f(werVar, ((jnm) awmdVar2.io()).v(aamjVar), ((jnm) awmdVar2.io()).t(aamjVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, wer] */
    public final void h(wer werVar) {
        try {
            Optional optional = (Optional) ((jan) this.k.io()).j(kro.aq()).get();
            gtr gtrVar = new gtr(this, werVar, 18);
            if (true == optional.isPresent()) {
                Object obj = optional.get();
                ((hqg) gtrVar.a).f(gtrVar.b, (weh) obj);
            }
        } catch (InterruptedException | ExecutionException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/apps/youtube/music/offline/compat/legacy/OfflineStoreObserver", "addOrUpdateLibraryEntity", (char) 545, "OfflineStoreObserver.java")).t("Failed to fetch updated downloads library Entity");
        }
    }

    @tcc
    public void handleOfflinePlaylistAddEvent(aahj aahjVar) {
        this.j.kk(ayq.F(aahjVar.a, aahj.class, new hqa(this, aahjVar, 0)));
    }

    @tcc
    public void handleOfflinePlaylistDeleteEvent(aahm aahmVar) {
        this.j.kk(ayq.F(aahmVar.a, aahm.class, new hqa(this, aahmVar, 9)));
    }

    @tcc
    public void handleOfflinePlaylistProgressEvent(aaho aahoVar) {
        if (this.f.m()) {
            return;
        }
        this.j.kk(ayq.F(aahoVar.a.a(), aaho.class, new hqa(this, aahoVar, 6)));
    }

    @tcc
    public void handleOfflinePlaylistRequestSourceChangedEvent(aahp aahpVar) {
        this.j.kk(ayq.F(aahpVar.a, aahp.class, new hqa(this, aahpVar, 8)));
    }

    @tcc
    public void handleOfflinePlaylistSyncEvent(aahr aahrVar) {
        this.j.kk(ayq.F(aahrVar.a.a(), aahr.class, new hqa(this, aahrVar, 1)));
    }

    @tcc
    public void handleOfflineSingleVideoAddEvent(aaht aahtVar) {
        this.j.kk(ayq.G(aahtVar.a.b(), aaht.class, new hqa(this, aahtVar, 3)));
    }

    @tcc
    protected void handleOfflineSingleVideosUpdateEvent(aahv aahvVar) {
        p("PPSV");
        p("PPSE");
    }

    @tcc
    public void handleOfflineVideoCompleteEvent(aahz aahzVar) {
        if (this.f.m()) {
            return;
        }
        this.j.kk(ayq.G(aahzVar.a.b(), aahz.class, new hqa(this, aahzVar, 5)));
    }

    @tcc
    public void handleOfflineVideoDeleteEvent(aaia aaiaVar) {
        this.j.kk(ayq.G(aaiaVar.a, aaia.class, new hqa(this, aaiaVar, 4)));
    }

    @tcc
    public void handleOfflineVideoStatusUpdateEvent(aaif aaifVar) {
        if (this.f.m()) {
            return;
        }
        this.j.kk(ayq.G(aaifVar.a.b(), aaif.class, new hqa(this, aaifVar, 2)));
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        this.v.b();
        l();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        this.v.b();
    }

    public final void i(wer werVar, aamt aamtVar) {
        if (this.f.m()) {
            awmd awmdVar = this.l;
            f(werVar, ((jnm) awmdVar.io()).o(aamtVar), ((jnm) awmdVar.io()).m(aamtVar));
            return;
        }
        awmd awmdVar2 = this.l;
        f(werVar, ((jnm) awmdVar2.io()).o(aamtVar), ((jnm) awmdVar2.io()).m(aamtVar), ((jnm) awmdVar2.io()).r(aamtVar), ((jnm) awmdVar2.io()).s(aamtVar), ((jnm) awmdVar2.io()).q(aamtVar));
        aams aamsVar = aamtVar.m;
        if (aamsVar != null) {
            f(werVar, ((jnm) awmdVar2.io()).p(aamsVar));
        }
    }

    public final void j(hpz hpzVar, Class cls, Runnable runnable) {
        this.j.kk(new ayq(hpzVar, cls, runnable));
    }

    public final void k(zwa zwaVar, aahb aahbVar) {
        weo weoVarB = aahbVar.b();
        if (weoVarB == null) {
            aahd aahdVar = (aahd) this.r.get(Integer.valueOf(aahbVar.a()));
            aahdVar.getClass();
            ahno.at(aahdVar.b(zwaVar, aahbVar.d()), new hqf(this, zwaVar, aahbVar), this.u);
            return;
        }
        Optional optionalB = b();
        gtr gtrVar = new gtr(this, weoVarB, 11);
        if (true == optionalB.isPresent()) {
            Object obj = optionalB.get();
            Object obj2 = gtrVar.a;
            wer werVar = (wer) obj;
            weo weoVar = (weo) gtrVar.b;
            weh wehVar = weoVar.c;
            if (wehVar != null) {
                ((hqg) obj2).f(werVar, wehVar);
            } else {
                weh wehVar2 = weoVar.b;
                if (wehVar2 != null) {
                    ((hqg) obj2).n(werVar, wehVar2.b());
                }
            }
            o(werVar);
        }
    }

    public final void l() {
        if (this.f.m()) {
            Executor executor = this.i;
            executor.execute(afwl.i(new gky(this, 13)));
            executor.execute(afwl.i(new gky(this, 14)));
            executor.execute(afwl.i(new gky(this, 15)));
            executor.execute(afwl.i(new gky(this, 16)));
        }
        this.i.execute(afwl.i(new gky(this, 17)));
    }

    public final void m(wer werVar, String str) {
        n(werVar, kro.am(str), kro.an(str), kro.ay(str), kro.az(str));
    }

    public final void n(wer werVar, String... strArr) {
        for (String str : strArr) {
            ahno.F(hpv.a.containsKey(Integer.valueOf(wfs.b(str))));
            werVar.j(str);
            awkv awkvVar = this.e;
            aaun aaunVar = new aaun();
            aaunVar.d(str);
            aaunVar.b = null;
            awkvVar.kk(aaunVar.b());
        }
    }
}
