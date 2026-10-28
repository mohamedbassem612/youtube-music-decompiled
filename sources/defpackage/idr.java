package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class idr implements tbj, abjj, icf, acdp, idk {
    private static final long J;
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/queue/persistence/PersistentMusicPlaybackQueueControllerImpl");
    static final long b;
    static final long c;
    public final int B;
    public ieg C;
    public final vxz D;
    public final vxz E;
    public final jnj F;
    public final isi G;
    public final hwz H;
    public final hwz I;
    private final aunn K;
    private final avlh L;
    private final abvn M;
    private final aunn P;
    private final aunn Q;
    private final hpy R;
    private avmn T;
    private avmn U;
    private avmn V;
    private avmn W;
    private avmn X;
    private boolean Y;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final icj g;
    public final acdq h;
    public final aunn i;
    public final Context j;
    public final ScheduledExecutorService k;
    public final ids l;
    public final ibg m;
    public avmn q;
    public Future r;
    public Future s;
    public Future t;
    public Future u;
    public Future v;
    public String w;
    public String x;
    public aigj y;
    public ajwo z;
    public final afx n = new afx(0);
    public final CopyOnWriteArraySet o = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet p = new CopyOnWriteArraySet();
    private final awkx O = new awkx();
    private final avmm N = new avmm();
    private final Handler S = new Handler(Looper.getMainLooper());
    public anvl A = anvl.a;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = 5000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        c = 5000L;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        J = 3000L;
    }

    public idr(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, icj icjVar, aunn aunnVar4, aunn aunnVar5, avlh avlhVar, Context context, jnj jnjVar, vxz vxzVar, vxz vxzVar2, abvn abvnVar, ScheduledExecutorService scheduledExecutorService, hwz hwzVar, aunn aunnVar6, aunn aunnVar7, ids idsVar, hwz hwzVar2, ibg ibgVar, acdq acdqVar, int i, hpy hpyVar, isi isiVar) {
        this.d = aunnVar;
        this.e = aunnVar2;
        this.f = aunnVar3;
        this.g = icjVar;
        this.K = aunnVar4;
        this.i = aunnVar5;
        this.L = avlhVar;
        this.j = context;
        this.F = jnjVar;
        this.D = vxzVar;
        this.E = vxzVar2;
        this.M = abvnVar;
        this.k = scheduledExecutorService;
        this.I = hwzVar;
        this.P = aunnVar6;
        this.Q = aunnVar7;
        this.l = idsVar;
        this.H = hwzVar2;
        this.m = ibgVar;
        this.h = acdqVar;
        this.B = i;
        this.R = hpyVar;
        this.G = isiVar;
        agrx agrxVar = agso.a;
    }

    private final void A() {
        avmn avmnVar = this.W;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.W);
        }
        Future future = this.t;
        if (future == null || future.isDone()) {
            return;
        }
        this.t.cancel(false);
    }

    private final void B() {
        if (E()) {
            return;
        }
        this.V = this.L.T(new hxe(9)).az().i(new abwr(1)).al(new ibr(this, 15), new ido(0));
    }

    private final void C() {
        avmn avmnVar = this.X;
        if (avmnVar == null || avmnVar.f()) {
            Future future = this.u;
            if (future == null || future.isDone()) {
                agrx agrxVar = agso.a;
                this.X = y(b, this.P).ag(new ibr(this, 9), new ido(0));
            }
        }
    }

    private final void D() {
        A();
        this.W = y(c, this.Q).ag(new ibr(this, 14), new ido(0));
    }

    private final boolean E() {
        avmn avmnVar = this.V;
        return (avmnVar == null || avmnVar.f()) ? false : true;
    }

    static boolean x(abke abkeVar) {
        ajwo ajwoVar;
        if (abkeVar.n() == null || (ajwoVar = abkeVar.n().b) == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ish.a);
        ajwoVar.c(aihlVarCheckIsLite);
        return ajwoVar.j.n(aihlVarCheckIsLite.d);
    }

    private final avlr y(long j, aunn aunnVar) {
        return avlr.ac(j, TimeUnit.MILLISECONDS, (avmb) this.P.io()).O((avmb) aunnVar.io());
    }

    private final void z() {
        if (E()) {
            awka.f((AtomicReference) this.V);
        }
        if (w()) {
            avnr.b((AtomicReference) this.q);
        }
        if (v()) {
            this.r.cancel(false);
        }
    }

    @Override // defpackage.icf
    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.n.add(bArr);
        }
    }

    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        B();
    }

    @Override // defpackage.idk
    public final ListenableFuture f(ieb iebVar) {
        ListenableFuture listenableFutureA = this.l.a();
        idm idmVar = new idm(this, iebVar, 0);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), idmVar, 1);
        int i = ahcs.c;
        ScheduledExecutorService scheduledExecutorService = this.k;
        ahcq ahcqVar = new ahcq(listenableFutureA, ahdbVar);
        listenableFutureA.addListener(ahcqVar, MoreExecutors.c(scheduledExecutorService, ahcqVar));
        hvf hvfVar = new hvf(this, 2);
        Executor executor = taf.a;
        ahcqVar.addListener(new ahei(ahcqVar, new afwj(afty.c(false), new taa(hvfVar, null, taf.b), 0)), MoreExecutors.directExecutor());
        return ahcqVar;
    }

    @Override // defpackage.idk
    public final ListenableFuture g() {
        hwz hwzVar = this.H;
        ListenableFuture listenableFutureE = ahcs.e(((qrx) hwzVar.b).c(), afwl.a(new iat(hwzVar, 11)), MoreExecutors.directExecutor());
        return ahng.h(listenableFutureE).a(afwl.j(new huo(listenableFutureE, 2)), MoreExecutors.directExecutor());
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if ((i & 1248) != 0) {
            agrx agrxVar = agso.a;
            D();
        }
    }

    @Override // defpackage.idk
    public final avlh h() {
        return this.O.P();
    }

    @Override // defpackage.abjj
    public final void ho(int i, int i2) {
        agrx agrxVar = agso.a;
        if (this.D.l(183, 45682757L, false)) {
            this.l.c();
        }
        icj icjVar = this.g;
        int iHc = icjVar.hc(1);
        int iHc2 = icjVar.hc(0);
        if (iHc <= 0) {
            iHc2 = -1;
        }
        this.l.f(i2, iHc2);
    }

    @Override // defpackage.idk
    public final void i() {
        agrx agrxVar = agso.a;
        this.n.clear();
        j();
        this.z = null;
        z();
        A();
        o();
        Future future = this.v;
        if (future != null) {
            future.cancel(false);
        }
        this.l.b();
        this.A = anvl.a;
        this.O.kk(new idc());
        this.C = null;
    }

    @Override // defpackage.idk
    public final void j() {
        this.o.clear();
        this.p.clear();
        this.y = null;
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        B();
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        B();
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
        B();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01b4 A[EDGE_INSN: B:31:0x01b4->B:25:0x01b4 BREAK  A[LOOP:0: B:20:0x018d->B:24:0x01b1]] */
    /* JADX WARN: Code duplicated, block: B:27:0x01c8  */
    @Override // defpackage.idk
    public final void l() {
        acfw acfwVarH;
        agrx agrxVar = agso.a;
        if (!this.Y) {
            int i = 1;
            this.Y = true;
            avmm avmmVar = this.N;
            int i2 = 10;
            int i3 = 0;
            if (avmmVar.a() == 0) {
                abvn abvnVar = this.M;
                int i4 = 8;
                int i5 = 6;
                int i6 = 7;
                avmmVar.e(((avlh) abvnVar.r().n).H(new hpr(i4)).p().i(new abwr(i)).al(new ibr(this, i5), new ido(i3)), abvnVar.N().al(new ibr(this, i6), new ido(i3)), abvnVar.P().x(new hxe(i5)).i(new abwr(i)).al(new ibr(this, i4), new ido(i3)), abvnVar.P().x(new hxe(i6)).i(new abwr(i)).al(new ibr(this, i2), new ido(i3)));
                if (this.F.n()) {
                    avmmVar.c(abvnVar.H().H(new hpr(9)).x(new hxe(i4)).L((avmb) this.Q.io()).ak(new ibr(this, 11)));
                }
            }
            aunn aunnVar = this.d;
            ((abjp) aunnVar.io()).q(this);
            ((abjp) aunnVar.io()).b.hK(this);
            this.g.o = this;
            avmn avmnVar = this.T;
            if (avmnVar != null && !avmnVar.f()) {
                awka.f((AtomicReference) this.T);
            }
            this.T = this.I.h().i(new abwr(i)).al(new ibr(this, 12), new ido(i3));
            this.h.w(this);
            this.U = this.G.e().H(new hpr(i2)).L((avmb) this.Q.io()).ak(new ibr(this, 13));
            if (!((abjp) aunnVar.io()).b.isEmpty()) {
                if (this.C != null) {
                    List listO = ((abjp) aunnVar.io()).o(0);
                    if (listO.size() == this.C.a.size()) {
                        while (true) {
                            if (i3 < listO.size()) {
                                if (!((hyz) listO.get(i3)).t().equals(((hyz) this.C.a.get(i3)).t())) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        B();
                        D();
                        acfwVarH = ((abvk) this.K.io()).h();
                        if (acfwVarH != null) {
                            this.l.i(acfwVarH.a());
                        }
                    } else {
                        B();
                        D();
                        acfwVarH = ((abvk) this.K.io()).h();
                        if (acfwVarH != null) {
                            this.l.i(acfwVarH.a());
                        }
                    }
                } else {
                    B();
                    D();
                    acfwVarH = ((abvk) this.K.io()).h();
                    if (acfwVarH != null) {
                        this.l.i(acfwVarH.a());
                    }
                }
            }
        }
        this.C = null;
    }

    @Override // defpackage.idk
    public final void m() {
        if (!this.Y) {
            agrx agrxVar = agso.a;
            return;
        }
        agrx agrxVar2 = agso.a;
        this.N.b();
        aunn aunnVar = this.d;
        ((abjp) aunnVar.io()).t(this);
        ((abjp) aunnVar.io()).b.n(this);
        this.g.o = null;
        avmn avmnVar = this.U;
        if (avmnVar != null && !avmnVar.f()) {
            awka.f((AtomicReference) this.U);
        }
        avmn avmnVar2 = this.T;
        if (avmnVar2 != null && !avmnVar2.f()) {
            awka.f((AtomicReference) this.T);
        }
        z();
        o();
        u();
        this.Y = false;
        this.C = null;
    }

    public final ListenableFuture n(List list) {
        if (list == null) {
            return new aher(new ArrayList());
        }
        ArrayList arrayListR = aguu.r(new agln(list, new idn(0)));
        int i = 6;
        ListenableFuture listenableFutureB = this.R.b((List) Collection.EL.stream(arrayListR).filter(new gqn(i)).map(new hds(19)).collect(Collectors.toCollection(new idl(2))));
        hys hysVar = new hys(3);
        ScheduledExecutorService scheduledExecutorService = this.k;
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), hysVar);
        int i2 = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureB, afwiVar);
        listenableFutureB.addListener(ahcrVar, MoreExecutors.c(scheduledExecutorService, ahcrVar));
        ahcr ahcrVar2 = new ahcr(ahcrVar, new afwi(afty.c(false), new gqq(arrayListR, i)));
        ahcrVar.addListener(ahcrVar2, MoreExecutors.c(scheduledExecutorService, ahcrVar2));
        return ahcrVar2;
    }

    public final void o() {
        Future future = this.s;
        if (future == null || future.isDone()) {
            return;
        }
        this.s.cancel(false);
    }

    public final void p(aigj aigjVar) {
        this.y = aigjVar;
        if (this.D.l(183, 45682757L, false) || E() || w() || v()) {
            return;
        }
        t();
    }

    public final void q(aigj aigjVar) {
        this.p.add(aigjVar);
        C();
    }

    public final void r(aigj aigjVar) {
        this.o.add(aigjVar);
        C();
    }

    public final void s() {
        Handler handler = this.S;
        handler.removeCallbacksAndMessages(null);
        acfw acfwVarH = ((abvk) this.K.io()).h();
        if (acfwVarH != null) {
            this.l.i(acfwVarH.a());
            handler.postDelayed(new hgx(this, 18), J);
        }
    }

    public final void t() {
        agrx agrxVar = agso.a;
        this.q = y(b, this.Q).ag(new avni() { // from class: idp
            @Override // defpackage.avni
            public final void a(Object obj) {
                iej iejVarA;
                idr idrVar = this.a;
                if (nsj.g(idrVar.j)) {
                    ((agrc) ((agrc) idr.a.c().i(agso.a, "PersistentQueueCtlrImpl")).k("com/google/android/apps/youtube/music/player/queue/persistence/PersistentMusicPlaybackQueueControllerImpl", "saveQueueSnapshot", 556, "PersistentMusicPlaybackQueueControllerImpl.java")).t("WARNING device is low on memory. Was going to save the queue but decided not to.");
                    return;
                }
                ScheduledExecutorService scheduledExecutorService = idrVar.k;
                agrx agrxVar2 = agso.a;
                taq.d();
                iei ieiVar = new iei();
                agke agkeVar = agpi.a;
                ieiVar.c = agke.n(agkeVar);
                ieiVar.e = agke.n(agkeVar);
                aunn aunnVar = idrVar.d;
                List listN = ((abjp) aunnVar.io()).n();
                int size = listN.size();
                List list = (List) Collection.EL.stream(listN).filter(new hud(11)).collect(aghu.a);
                int size2 = list.size();
                if (size != size2) {
                    ((agrc) ((agrc) idr.a.b().i(agrxVar2, "PersistentQueueCtlrImpl")).k("com/google/android/apps/youtube/music/player/queue/persistence/PersistentMusicPlaybackQueueControllerImpl", "createQueueSnapshot", 995, "PersistentMusicPlaybackQueueControllerImpl.java")).u("Encountered %d nulls in queue while creating snapshot.", size - size2);
                }
                if (list.isEmpty()) {
                    ieiVar.f(agkeVar);
                    ieiVar.d(-1);
                    ieiVar.b(-1);
                    ieiVar.c(false);
                    ieiVar.a = null;
                    ieiVar.b = null;
                    ieiVar.g(agkeVar);
                    ieiVar.d = null;
                    ieiVar.e(aimm.a);
                    iejVarA = ieiVar.a();
                } else {
                    int iA = ((abjp) aunnVar.io()).a();
                    if (iA > list.size()) {
                        iA = list.size() - 1;
                        list.size();
                        list.size();
                    }
                    int iMin = Math.min(((abjp) aunnVar.io()).d(0).size(), list.size());
                    boolean zIsEmpty = ((abjp) aunnVar.io()).d(1).isEmpty();
                    ieiVar.f(list);
                    ieiVar.d(iA);
                    ieiVar.b(true != zIsEmpty ? iMin : -1);
                    ieiVar.c(((ycp) idrVar.i.io()).e == null && idrVar.g.G());
                    ieiVar.a = idrVar.w;
                    ieiVar.b = idrVar.x;
                    ArrayList arrayList = new ArrayList();
                    afx afxVar = idrVar.n;
                    if (!afxVar.isEmpty()) {
                        afw afwVar = new afw(afxVar);
                        while (afwVar.hasNext()) {
                            arrayList.add(Base64.encodeToString((byte[]) afwVar.next(), 0));
                        }
                    }
                    ieiVar.g(arrayList);
                    ieiVar.d = idrVar.y;
                    ieiVar.f = idrVar.z;
                    ieiVar.g = idrVar.A;
                    icj icjVar = idrVar.g;
                    Optional optional = icjVar.t;
                    if (optional == null) {
                        throw new NullPointerException("Null musicQueueHeaderRenderer");
                    }
                    ieiVar.h = optional;
                    Optional optionalH = icjVar.h();
                    if (optionalH == null) {
                        throw new NullPointerException("Null queueSubHeaderChipCloudRenderer");
                    }
                    ieiVar.i = optionalH;
                    Optional optionalF = icjVar.f();
                    if (optionalF == null) {
                        throw new NullPointerException("Null autoplaySubHeaderChipCloudRenderer");
                    }
                    ieiVar.j = optionalF;
                    ieiVar.k = ((jij) idrVar.e.io()).j();
                    Optional optional2 = icjVar.r;
                    if (optional2 == null) {
                        throw new NullPointerException("Null shuffleCommand");
                    }
                    ieiVar.l = optional2;
                    Optional optional3 = icjVar.s;
                    if (optional3 == null) {
                        throw new NullPointerException("Null unshuffleCommand");
                    }
                    ieiVar.m = optional3;
                    ieiVar.e(isi.d(idrVar.G.j()));
                    Optional optionalA = ((icx) idrVar.f.io()).a();
                    if (optionalA == null) {
                        throw new NullPointerException("Null responsiveSignals");
                    }
                    ieiVar.n = optionalA;
                    iejVarA = ieiVar.a();
                }
                idrVar.r = scheduledExecutorService.submit(afwl.i(new hhy(idrVar, iejVarA, 6)));
            }
        }, new ido(0));
    }

    public final void u() {
        this.S.removeCallbacksAndMessages(null);
    }

    public final boolean v() {
        Future future = this.r;
        return (future == null || future.isDone()) ? false : true;
    }

    public final boolean w() {
        avmn avmnVar = this.q;
        return (avmnVar == null || avmnVar.f()) ? false : true;
    }
}
