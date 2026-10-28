package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ied {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController");
    private idz A;
    private iea B;
    private final ycp C;
    private final vxz D;
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final Executor f;
    public final Executor g;
    public final aunn h;
    public final aerv i;
    public final awmd j;
    public final iee l;
    public ListenableFuture n;
    public ListenableFuture o;
    public ListenableFuture p;
    public iec q;
    public final aunn r;
    public final vxz s;
    private final aunn t;
    private final hwv u;
    private final aunn v;
    private final ScheduledExecutorService w;
    private final avlh x;
    private final aunn y;
    private final aunn z;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final awkx k = new awkx();

    public ied(aunn aunnVar, avlh avlhVar, hwv hwvVar, aunn aunnVar2, ycp ycpVar, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, aunn aunnVar8, aerv aervVar, awmd awmdVar, iee ieeVar, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, vxz vxzVar, vxz vxzVar2) {
        this.b = aunnVar;
        this.x = avlhVar;
        this.u = hwvVar;
        this.t = aunnVar2;
        this.C = ycpVar;
        this.c = aunnVar3;
        this.v = aunnVar4;
        this.d = aunnVar5;
        this.e = aunnVar7;
        this.f = executor;
        this.g = executor2;
        this.w = scheduledExecutorService;
        this.h = aunnVar8;
        this.i = aervVar;
        this.j = awmdVar;
        this.l = ieeVar;
        this.y = aunnVar9;
        this.s = vxzVar;
        this.D = vxzVar2;
        this.z = aunnVar11;
        this.r = aunnVar6;
        avlhVar.i(new abwr(1)).x(new hgu(18)).al(new icy(this, 3), new hyx(16));
        ((agrc) ((agrc) a.c().i(agso.a, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "<init>", 189, "QueueRestorationController.java")).t("Registering controller for EventBus");
        ((tbt) aunnVar10.io()).f(this);
    }

    public static final long k(wgi wgiVar) {
        Optional optionalB = hna.B(fhz.ah(wgiVar.a));
        if (!optionalB.isPresent() || (((anvl) optionalB.get()).b & 4) == 0) {
            return -1L;
        }
        anvm anvmVar = ((anvl) optionalB.get()).d;
        if (anvmVar == null) {
            anvmVar = anvm.a;
        }
        aijp aijpVar = anvmVar.c;
        if (aijpVar == null) {
            aijpVar = aijp.a;
        }
        return aijpVar.b;
    }

    public static final long l(wgi wgiVar) {
        ajwo ajwoVar = wgiVar.d;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                arij arijVar = (arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                if ((arijVar.b & SemanticState.Hidden) != 0) {
                    return (long) arijVar.k;
                }
            }
        }
        return 0L;
    }

    public static final boolean m(wgi wgiVar) {
        aouj aoujVarAb;
        if (wgiVar == null || (aoujVarAb = fhz.ab(wgiVar.a)) == null) {
            return true;
        }
        return aoujVarAb.g.isEmpty();
    }

    public final avlh a() {
        return this.k.N();
    }

    public final avlh b() {
        return ((icq) this.h.io()).f.y(new ibj(this, 4));
    }

    public final void c() {
        this.n = null;
        this.A = null;
        this.o = null;
        this.B = null;
        this.p = null;
        this.q = null;
    }

    public final void d(wgi wgiVar) {
        Optional optionalB = hna.B(fhz.ah(wgiVar.a));
        if (optionalB.isPresent()) {
            anvm anvmVar = ((anvl) optionalB.get()).d;
            if (anvmVar == null) {
                anvmVar = anvm.a;
            }
            if ((anvmVar.b & 2) != 0) {
                anvm anvmVar2 = ((anvl) optionalB.get()).d;
                if (anvmVar2 == null) {
                    anvmVar2 = anvm.a;
                }
                ajwo ajwoVar = anvmVar2.d;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                Optional optionalB2 = ((heg) this.y.io()).b();
                hun hunVar = new hun(ajwoVar, 17);
                if (true == optionalB2.isPresent()) {
                    Object obj = optionalB2.get();
                    Object obj2 = hunVar.a;
                    ((agrc) ((agrc) a.c().i(agso.a, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "handleOnQueueRestoredCommand", 650, "QueueRestorationController.java")).t("Command and router are present, handling onQueueRestoredCommand.");
                    ((vxe) obj).a((ajwo) obj2);
                }
            }
        }
    }

    public final void e(ieg iegVar, boolean z) {
        int i;
        agrx agrxVar = agso.a;
        if (iegVar != null) {
            iegVar.a.isEmpty();
        } else {
            iegVar = null;
        }
        ieg iegVar2 = iegVar;
        if (!z) {
            this.i.d("RESTORE_LOCAL", iegVar2 == null);
            if (iegVar2 == null || iegVar2.a.isEmpty()) {
                ((icq) this.h.io()).i();
            }
        }
        icq icqVar = (icq) this.h.io();
        if (z) {
            i = 17;
        } else if (iegVar2 == null) {
            i = 16;
        } else {
            i = iegVar2.a.isEmpty() ? 15 : 13;
        }
        icqVar.q(i, 2);
        awkx awkxVar = this.k;
        if (iegVar2 != null) {
            awkxVar.kk(new idb(false, false, iegVar2, null, false));
        } else {
            awkxVar.kk(new idb(false, false, null, null, false));
        }
        c();
    }

    /* JADX WARN: Type inference failed for: r5v49, types: [abke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v63, types: [hyz, java.lang.Object] */
    public final void f(ieg iegVar, ieb iebVar, boolean z) {
        String strConcat;
        acjx acjxVarAe;
        acjx acjxVarAe2;
        acjx acjxVarAe3;
        if (iegVar != null) {
            agke agkeVar = iegVar.a;
            if (!agkeVar.isEmpty() && j(false)) {
                ieb iebVar2 = ieb.a;
                agrc agrcVar = (agrc) ((agrc) a.c().i(agso.a, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "restoreLocalQueue", 501, "QueueRestorationController.java");
                if (agkeVar.isEmpty()) {
                    strConcat = "MusicPlaybackQueueState {\nQueue size: EMPTY ".concat(String.valueOf(String.format("queueSavedTimestamp: %d ", Long.valueOf(iegVar.A))));
                } else {
                    String str = String.format("Queue size: %d ", Integer.valueOf(agkeVar.size()));
                    String str2 = String.format("Autonav size: %d ", Integer.valueOf(iegVar.b.size()));
                    String str3 = String.format("Playback position: %d ", Integer.valueOf(iegVar.d));
                    String str4 = String.format("Timestamp: %d ", Long.valueOf(iegVar.c));
                    String str5 = String.format("queueSavedTimestamp: %d ", Long.valueOf(iegVar.A));
                    aobx aobxVar = iegVar.j;
                    String str6 = String.format("hasNextContinuation: %b ", Boolean.valueOf((aobxVar == null || (aobxVar.b & 1) == 0) ? false : true));
                    aobz aobzVar = iegVar.l;
                    String str7 = String.format("hasNextRadioContinuation: %b ", Boolean.valueOf((aobzVar == null || (aobzVar.b & 1) == 0) ? false : true));
                    Optional optional = iegVar.g;
                    strConcat = "MusicPlaybackQueueState {\n" + str + str2 + str3 + str4 + str5 + str6 + str7 + String.format("playbackContentMode: %d", Integer.valueOf(optional.isEmpty() ? -1 : ((ibh) optional.get()).g)) + "\n}";
                }
                agrcVar.w("Restoration successful. Replacing queue contents. %s", strConcat);
                awmd awmdVar = this.j;
                idy idyVar = (idy) awmdVar.io();
                aigj aigjVar = iegVar.o;
                if (aigjVar != null) {
                    idyVar.h.D(aigjVar.G(), amae.a);
                }
                agke agkeVar2 = iegVar.n;
                int i = ((agpi) agkeVar2).d;
                for (int i2 = 0; i2 < i; i2++) {
                    idyVar.h.D(((aigj) agkeVar2.get(i2)).G(), amae.a);
                }
                agke agkeVar3 = iegVar.p;
                int i3 = ((agpi) agkeVar3).d;
                for (int i4 = 0; i4 < i3; i4++) {
                    idyVar.h.D(((aigj) agkeVar3.get(i4)).G(), alss.a);
                }
                vxz vxzVar = this.s;
                if (vxzVar.l(15, 45640979L, false)) {
                    ((icq) this.h.io()).k(iegVar);
                }
                Optional optionalB = iegVar.b();
                if (this.D.l(186, 45721426L, false) && optionalB.isPresent()) {
                    acgv acgvVar = new acgv(iegVar.b().get().t(), Duration.ofMillis(iegVar.c).toSeconds(), iegVar.A);
                    ieq ieqVar = (ieq) this.z.io();
                    String str8 = acgvVar.a;
                    if (str8.length() != 0 && !awrc.c(ieqVar.h, acgvVar)) {
                        ieqVar.h = acgvVar;
                        int i5 = 6;
                        int i6 = 7;
                        ((abvn) ieqVar.b.io()).Q().P().H(new ibj(new hhn(13), i5)).i(new iek()).H(new ibj(iem.a, i6)).T(new hhw(new hol(str8, i5), 11)).az().al(new ibr(new hol(ieqVar, i6), 20), new ifo(ien.a, 1));
                    }
                }
                ((abjp) this.c.io()).u(agkeVar, iegVar.b, iegVar.d, iebVar != iebVar2 ? new abkb(Long.valueOf(iegVar.c)) : new abkc(Long.valueOf(iegVar.c)));
                icj icjVar = (icj) this.v.io();
                icjVar.n = iegVar.f;
                icjVar.f.kk(Boolean.valueOf(iegVar.e));
                icjVar.t = iegVar.s;
                icjVar.u = iegVar.t;
                icjVar.x = iegVar.u;
                icjVar.r = iegVar.w;
                icjVar.s = iegVar.x;
                ((awku) icjVar.D.a).kk(iegVar.v);
                icx icxVar = icjVar.l;
                if (!icxVar.b.get()) {
                    icxVar.c.lock();
                    try {
                        icxVar.d = iegVar.z;
                        icxVar.c.unlock();
                    } catch (Throwable th) {
                        icxVar.c.unlock();
                        throw th;
                    }
                }
                icjVar.B.i(iegVar.y.c);
                if (icjVar.o != null) {
                    agke agkeVar4 = iegVar.m;
                    int i7 = ((agpi) agkeVar4).d;
                    for (int i8 = 0; i8 < i7; i8++) {
                        icjVar.o.a((byte[]) agkeVar4.get(i8));
                    }
                }
                aobx aobxVar2 = iegVar.j;
                if (aobxVar2 != null && (acjxVarAe3 = aawb.ae(aobxVar2)) != null) {
                    icjVar.d.put(acjw.b, acjxVarAe3);
                }
                aobz aobzVar2 = iegVar.l;
                if (aobzVar2 != null && (acjxVarAe2 = aawb.ae(aobzVar2)) != null) {
                    icjVar.d.put(acjw.h, acjxVarAe2);
                }
                aoyh aoyhVar = iegVar.k;
                if (aoyhVar != null && (acjxVarAe = aawb.ae(aoyhVar)) != null) {
                    icjVar.d.put(acjw.c, acjxVarAe);
                }
                icl iclVar = icjVar.b;
                Map map = icjVar.d;
                iclVar.b = map;
                icjVar.B(map);
                if (iegVar.f && iegVar.b.isEmpty()) {
                    icjVar.t(iegVar.a.size());
                } else {
                    icjVar.s();
                }
                if (icjVar.F()) {
                    Optional optionalB2 = iegVar.b();
                    if (true == optionalB2.isPresent()) {
                        optionalB2 = Optional.ofNullable(optionalB2.get().n());
                    }
                    if (true == optionalB2.isPresent()) {
                        optionalB2 = Optional.ofNullable(((abnl) optionalB2.get()).b);
                    }
                    if (true == optionalB2.isPresent()) {
                        optionalB2 = Optional.ofNullable(Boolean.valueOf(gzj.U((ajwo) optionalB2.get())));
                    }
                    boolean zBooleanValue = ((Boolean) optionalB2.orElse(Boolean.FALSE)).booleanValue();
                    icjVar.C(icjVar.u, zBooleanValue);
                    icjVar.z(icjVar.x, zBooleanValue);
                }
                ((idy) awmdVar.io()).c.p(iegVar.o);
                if (!vxzVar.l(15, 45640979L, false)) {
                    ((icq) this.h.io()).k(iegVar);
                }
                ((abvk) this.b.io()).am();
                e(iegVar, false);
                if (!z) {
                    ahno.at(((jnm) this.d.io()).d(this.g), new hfb(this, 10), this.f);
                }
                ahno.at(((idk) this.t.io()).g(), new hfb(this, 9), this.f);
                return;
            }
        }
        if (iegVar == null) {
            ((agrc) ((agrc) a.c().i(agso.a, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "restoreLocalQueue", 485, "QueueRestorationController.java")).t("Succeeded in fetching persisted queue but state was null");
            e(null, false);
            return;
        }
        boolean zIsEmpty = iegVar.a.isEmpty();
        agrf agrfVar = a;
        if (zIsEmpty) {
            ((agrc) ((agrc) agrfVar.c().i(agso.a, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "restoreLocalQueue", 488, "QueueRestorationController.java")).t("Succeeded in fetching persisted queue but queue was empty");
            e(iegVar, false);
        } else {
            ((agrc) ((agrc) agrfVar.c().i(agso.a, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "restoreLocalQueue", 493, "QueueRestorationController.java")).t("Succeeded in fetching persisted queue but shouldRestoreQueue() is false");
            e(null, true);
        }
    }

    public final boolean g() {
        ListenableFuture listenableFuture = this.n;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return true;
        }
        ListenableFuture listenableFuture2 = this.o;
        if (listenableFuture2 != null && !listenableFuture2.isDone()) {
            return true;
        }
        ListenableFuture listenableFuture3 = this.p;
        return (listenableFuture3 == null || listenableFuture3.isDone()) ? false : true;
    }

    public final boolean h() {
        return i(ieb.a, false);
    }

    @tcc
    void handleDismissWatchEvent(gse gseVar) {
        agrx agrxVar = agso.a;
        this.m.set(true);
    }

    public final boolean i(ieb iebVar, boolean z) {
        ListenableFuture listenableFutureU;
        agrf agrfVar = a;
        agru agruVarC = agrfVar.c();
        agrx agrxVar = agso.a;
        ((agrc) ((agrc) agruVarC.i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "restoreInternal", 288, "QueueRestorationController.java")).w("restore(%s)", iebVar);
        if (!j(false)) {
            ((abvk) this.b.io()).U();
            this.k.kk(new idb(false, true, null, null, false));
            return false;
        }
        int i = 1;
        if (g()) {
            ((agrc) ((agrc) agrfVar.c().i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "restoreInternal", 297, "QueueRestorationController.java")).t("Queue is already being restored.");
            idz idzVar = this.A;
            if (idzVar != null) {
                idzVar.a = iebVar;
            } else {
                iea ieaVar = this.B;
                if (ieaVar != null) {
                    ieaVar.a = iebVar;
                }
            }
        } else {
            awkx awkxVar = this.k;
            awkxVar.kk(new idb(true, false, null, null, false));
            aunn aunnVar = this.h;
            ((icq) aunnVar.io()).o();
            if (this.m.get()) {
                ((agrc) ((agrc) agrfVar.c().i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "restoreInternal", 312, "QueueRestorationController.java")).t("Queue is dismissed, skipping restoration and emitting empty queue.");
                awkxVar.kk(new idb(false, false, null, null, false));
                ((icq) aunnVar.io()).i();
                ((icq) aunnVar.io()).q(2, 2);
            } else if (z) {
                ((agrc) ((agrc) agrfVar.c().i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "restoreQueuesInParallel", 359, "QueueRestorationController.java")).t("Restoring both queues in parallel.");
                Duration durationOfMillis = Duration.ofMillis(this.s.c(3, 45736842L, 0L));
                if (durationOfMillis.isZero()) {
                    ((agrc) ((agrc) agrfVar.c().i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "fetchServerQueueWithoutTimeout", 354, "QueueRestorationController.java")).t("parallel restoration: fetching server queue without timeout");
                    listenableFutureU = ((jnm) this.d.io()).d(this.g);
                } else {
                    ((agrc) ((agrc) agrfVar.c().i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "fetchServerQueueWithTimeout", 343, "QueueRestorationController.java")).v("parallel restoration: fetching server queue with timeout %s milliseconds", durationOfMillis.toMillis());
                    listenableFutureU = ahng.u(((jnm) this.d.io()).d(this.g), durationOfMillis.toMillis(), TimeUnit.MILLISECONDS, this.w);
                }
                ListenableFuture listenableFutureF = ((idk) this.t.io()).f(iebVar);
                iea ieaVar2 = new iea(this, iebVar, listenableFutureU, listenableFutureF);
                this.B = ieaVar2;
                ListenableFuture listenableFutureK = new ahud(new ahek(false, agke.p(new ListenableFuture[]{listenableFutureU, listenableFutureF})), (byte[]) null).k(this.B, this.f);
                this.o = listenableFutureK;
                aadl aadlVar = new aadl(ieaVar2, i);
                Executor executor = taf.a;
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                taa taaVar = new taa(taf.c, null, aadlVar);
                long j = afwl.a;
                listenableFutureK.addListener(new ahei(listenableFutureK, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
                ((icq) aunnVar.io()).q(3, 2);
                ((icq) aunnVar.io()).q(8, 2);
            } else {
                this.n = ((idk) this.t.io()).f(iebVar);
                idz idzVar2 = new idz(this, iebVar);
                this.A = idzVar2;
                ListenableFuture listenableFuture = this.n;
                Executor executor2 = this.f;
                long j2 = afwl.a;
                listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), idzVar2, 0)), executor2);
                ((icq) aunnVar.io()).q(3, 2);
            }
        }
        return true;
    }

    public final boolean j(boolean z) {
        aunn aunnVar = this.b;
        return ((z ? ((abvk) aunnVar.io()).ac() : ((abvk) aunnVar.io()).U()) || this.u.b() || this.C.e != null) ? false : true;
    }
}
