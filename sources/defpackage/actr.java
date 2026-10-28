package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class actr implements actu {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController");
    public final acrz b;
    public final actv c;
    public final Executor d;
    public final acsv e;
    public final acul f;
    public final avmm g = new avmm();
    public volatile actp h;
    public final hno i;
    private final acts j;
    private final Executor k;

    public actr(acrz acrzVar, actv actvVar, Executor executor, hno hnoVar, acts actsVar, acsv acsvVar, acul aculVar, Executor executor2) {
        actvVar.getClass();
        this.c = actvVar;
        executor.getClass();
        this.d = executor;
        this.b = acrzVar;
        this.i = hnoVar;
        this.j = actsVar;
        this.e = acsvVar;
        this.f = aculVar;
        this.k = executor2;
        if (hnoVar.bd()) {
            this.h = g(actvVar, acrzVar, executor, hnoVar, acsvVar);
        }
    }

    public static actp g(actv actvVar, acrz acrzVar, Executor executor, hno hnoVar, acsv acsvVar) {
        return new actp(actvVar, acrzVar, executor, new HashSet(), hnoVar, acsvVar);
    }

    public final void a() {
        ajwo ajwoVar;
        if (this.h != null) {
            actp actpVar = this.h;
            actpVar.e = true;
            Set<actq> set = actpVar.c;
            for (actq actqVar : set) {
                if (!((vxz) actqVar.d.i).l(200, 45761386L, false) || (ajwoVar = actqVar.a) == null || !aecm.az(ajwoVar)) {
                    actqVar.b = true;
                }
            }
            set.clear();
            if (this.i.bd()) {
                return;
            }
            this.h = null;
        }
    }

    public final void c(Optional optional, ajwo ajwoVar, final String str) {
        final ListenableFuture listenableFutureA;
        afuu afuuVarC = afwt.c(91, "ReelPlaybackController.onNewScreen");
        try {
            hno hnoVar = this.i;
            if (!((vxz) hnoVar.i).l(193, 45758736L, false)) {
                a();
            }
            actv actvVar = this.c;
            actvVar.E(new acsl());
            if (optional.isEmpty()) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "onNewScreen", 276, "ReelPlaybackController.java")).t("No reel navigator.");
            } else if (str == null) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "onNewScreen", 280, "ReelPlaybackController.java")).t("No cpn.");
            } else {
                final long jB = ((acqz) optional.get()).b(ajwoVar);
                if (jB == Long.MIN_VALUE) {
                    ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "onNewScreen", 285, "ReelPlaybackController.java")).t("No reel watch endpoint.");
                } else if (hnoVar.aJ() && aecm.as(ajwoVar) && (listenableFutureA = this.f.a()) != null) {
                    final acqz acqzVar = (acqz) optional.get();
                    taf.i(listenableFutureA, this.k, new abwu(12), new tae() { // from class: acto
                        @Override // defpackage.tae, defpackage.twi
                        public final void a(Object obj) {
                            actr actrVar = this.a;
                            if (actrVar.f.a() == listenableFutureA) {
                                String str2 = str;
                                acqz acqzVar2 = acqzVar;
                                hqd hqdVar = new hqd((Object) actrVar, (Object) acqzVar2, str2, 7);
                                acqh acqhVar = acqzVar2.ag;
                                if (acqhVar != null) {
                                    long j = jB;
                                    ajwo ajwoVarO = acqhVar.O(j);
                                    if (ajwoVarO == null && acqzVar2.b.i(new acqp(acqzVar2, hqdVar, j))) {
                                        return;
                                    }
                                    hqdVar.b(Optional.ofNullable(ajwoVarO));
                                }
                            }
                        }
                    }, new abmn(8));
                } else {
                    Object obj = optional.get();
                    acrz acrzVar = this.b;
                    Executor executor = this.d;
                    this.h = new actp(str, jB, actvVar, (acqz) obj, acrzVar, executor, new HashSet(), hnoVar, ajwoVar, this.e);
                    if (hnoVar.aq()) {
                        byte[] bArr = null;
                        taf.g(ahno.aq(new wan(this, ajwoVar, 6, bArr), executor), new xwl(this, str, 14, bArr));
                    } else {
                        actp actpVar = this.h;
                        actpVar.getClass();
                        acrzVar.j(ajwoVar, str, actpVar, zzd.a);
                    }
                    actvVar.E(new acsr(ajwoVar));
                }
            }
            afuuVarC.close();
        } catch (Throwable th) {
            try {
                afuuVarC.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void d(Optional optional, ajwo ajwoVar, String str) {
        if (optional.isEmpty()) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "onReloadReelItemWatch", 395, "ReelPlaybackController.java")).t("No reel navigator.");
            return;
        }
        if (str == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "onReloadReelItemWatch", 399, "ReelPlaybackController.java")).t("No cpn.");
            return;
        }
        long jB = ((acqz) optional.get()).b(ajwoVar);
        if (jB == Long.MIN_VALUE) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "onReloadReelItemWatch", 405, "ReelPlaybackController.java")).t("No reel watch endpoint.");
            return;
        }
        actv actvVar = this.c;
        Object obj = optional.get();
        acrz acrzVar = this.b;
        this.h = new actp(str, jB, actvVar, (acqz) obj, acrzVar, this.d, new HashSet(), this.i, ajwoVar, this.e);
        actp actpVar = this.h;
        actpVar.getClass();
        acuv acuvVarD = acrzVar.d(ajwoVar);
        if (acuvVarD != null) {
            acrzVar.i(acuvVarD.Y());
            acrzVar.j(ajwoVar, str, actpVar, zzd.a);
        }
    }

    public final void e() {
        actv actvVar = this.c;
        actvVar.z(this);
        this.g.c(actvVar.a.ag(new acte(this, 5), new acrr(2)));
    }

    public final void f(ajwo ajwoVar) {
        actp actpVar = this.h;
        if (actpVar != null) {
            actpVar.d(ajwoVar);
        }
    }

    @Override // defpackage.actu
    public final void l(acsu acsuVar) {
        boolean z;
        if (acsuVar instanceof acss) {
            acss acssVar = (acss) acsuVar;
            ajwo ajwoVar = acssVar.a;
            wjf wjfVar = acssVar.b;
            boolean z2 = acssVar.c;
            hno hnoVar = this.i;
            if (hnoVar.bd() && hnoVar.aI()) {
                actp actpVar = this.h;
                if (actpVar == null) {
                    this.j.f(19, "Sequencer ReelPlaybackController cannot trigger GetReelItemWatch prefetch due to invalid command or handler. Command is null?false, currentHandler is null?true");
                    ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "onSequencerPlayerResponsePrefetchSabr", 191, "ReelPlaybackController.java")).w("%s", "Sequencer ReelPlaybackController cannot trigger GetReelItemWatch prefetch due to invalid command or handler. Command is null?false, currentHandler is null?true");
                    return;
                } else {
                    if (hnoVar.aO()) {
                        return;
                    }
                    actpVar.d(ajwoVar);
                    return;
                }
            }
            actp actpVar2 = this.h;
            if (actpVar2 != null) {
                acqz acqzVar = actpVar2.f;
                z = false;
                if (acqzVar != null) {
                    long jB = acqzVar.b(ajwoVar);
                    if ((!hnoVar.aY() || jB <= actpVar2.a + 1 || !((vxz) hnoVar.k).l(42, 45656750L, false) || hnoVar.aI()) && !hnoVar.aO()) {
                        actpVar2.d(ajwoVar);
                        return;
                    }
                    return;
                }
            } else {
                z = true;
            }
            String str = "ReelPlaybackController cannot trigger GetReelItemWatch prefetch due to invalid command or handler. Command is null?false, currentHandler is null?" + z;
            this.j.f(19, str);
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "onSequencerPlayerResponsePrefetch", 230, "ReelPlaybackController.java")).w("%s", str);
        }
    }
}
