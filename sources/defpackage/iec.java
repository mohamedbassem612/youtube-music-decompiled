package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iec implements aheh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    private final long b;

    public iec(Object obj, long j, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = j;
    }

    private final void c(wgi wgiVar, boolean z) {
        int i;
        ((agrc) ((agrc) ied.a.c().i(agso.a, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController$WarmStartResumeQueueCallback", "onWarmStartResumeQueueFinished", 811, "QueueRestorationController.java")).D("onWarmStartResumeQueueFinished(hasServerResponse: %b, abandoned: %b)", wgiVar != null, z);
        if (!z) {
            ((ied) this.a).i.d("RESTORE", wgiVar == null);
        }
        ied iedVar = (ied) this.a;
        icq icqVar = (icq) iedVar.h.io();
        if (z) {
            i = 17;
        } else if (wgiVar != null) {
            i = icqVar.p(wgiVar) ? 15 : 14;
        } else {
            i = 16;
            wgiVar = null;
        }
        wgi wgiVar2 = wgiVar;
        icqVar.q(i, 3);
        if (wgiVar2 != null && !z) {
            iedVar.k.kk(new idb(false, false, null, wgiVar2, iedVar.s.l(134, 45849000L, false)));
        }
        iedVar.c();
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        if (this.$cid != 0) {
            ico icoVar = (ico) this.a;
            icoVar.i.d("PROMOTE_FROM_AUTOPLAY", true);
            icoVar.m.g(abkh.g);
            return;
        }
        ((agrc) ((agrc) ((agrc) ied.a.c().i(agso.a, "QueueRestorationCtlr")).j(th)).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController$WarmStartResumeQueueCallback", "onFailure", (char) 798, "QueueRestorationController.java")).t("Warm start resume queue failed to fetch a queue from the server.");
        boolean z = th instanceof CancellationException;
        ((icq) ((ied) this.a).h.io()).l(null, z, true);
        c(null, z);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [hyz, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        ico icoVar;
        Optional optionalEmpty;
        hzg hzgVar;
        if (this.$cid == 0) {
            wgi wgiVar = (wgi) obj;
            Object obj2 = this.a;
            agrx agrxVar = agso.a;
            ied iedVar = (ied) obj2;
            aunn aunnVar = iedVar.h;
            ((icq) aunnVar.io()).l(wgiVar, false, true);
            if (!iedVar.j(true)) {
                ((agrc) ((agrc) ied.a.c().i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController$WarmStartResumeQueueCallback", "onSuccess", 757, "QueueRestorationController.java")).t("shouldRestoreQueue() is false after warm-start resume queue was fetched.");
                c(wgiVar, true);
                return;
            }
            if (iedVar.s.l(134, 45849000L, false) && ied.m(wgiVar)) {
                ((agrc) ((agrc) ied.a.c().i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController$WarmStartResumeQueueCallback", "onSuccess", 764, "QueueRestorationController.java")).t("Server queue has a non-null response but is empty.");
                c(wgiVar, true);
                return;
            }
            long jK = ied.k(wgiVar);
            long seconds = Duration.ofMillis(this.b).toSeconds();
            if (seconds > jK) {
                ((agrc) ((agrc) ied.a.c().i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController$WarmStartResumeQueueCallback", "onSuccess", 772, "QueueRestorationController.java")).z("Abandoning warm-start resumption. Last interaction timestamp is newer than server queue last watch timestamp. lastInteractionSeconds: %d, serverQueueLastWatchSeconds: %d", seconds, jK);
                c(wgiVar, true);
                return;
            }
            ((abjp) iedVar.c.io()).z(wgiVar, true, new abkc(Long.valueOf(TimeUnit.SECONDS.toMillis(ied.l(wgiVar)))));
            icq icqVar = (icq) aunnVar.io();
            icqVar.q = true;
            abea abeaVar = icqVar.a;
            ajwo ajwoVar = wgiVar.d;
            abeaVar.k(ajwoVar);
            icqVar.m(new icp(agke.q(wgiVar.d()), ajwoVar), "");
            iedVar.d(wgiVar);
            c(wgiVar, false);
            return;
        }
        List list = ((iex) obj).a;
        if (list.isEmpty()) {
            return;
        }
        hyz hyzVar = (hyz) list.get(0);
        Object obj3 = this.a;
        long j = this.b;
        agrx agrxVar2 = agso.a;
        hyzVar.s();
        int i = 0;
        while (true) {
            icoVar = (ico) obj3;
            abjp abjpVar = icoVar.c;
            if (i >= abjpVar.d(0).size()) {
                optionalEmpty = Optional.empty();
                break;
            }
            hyz hyzVar2 = (hyz) abjpVar.d(0).get(i);
            if (hyzVar2.m() == j) {
                optionalEmpty = Optional.of(hyzVar2);
                break;
            }
            i++;
        }
        if (optionalEmpty.isPresent()) {
            ?? r3 = optionalEmpty.get();
            if (r3 instanceof hzf) {
                hzf hzfVar = (hzf) r3;
                if (hyzVar instanceof hzf) {
                    hzfVar.u(((hzf) hyzVar).a);
                } else if (r3 instanceof hzg) {
                    hzgVar = (hzg) r3;
                    if (hyzVar instanceof hzg) {
                        hzgVar.x(((hzg) hyzVar).a);
                    }
                }
            } else if (r3 instanceof hzg) {
                hzgVar = (hzg) r3;
                if (hyzVar instanceof hzg) {
                    hzgVar.x(((hzg) hyzVar).a);
                }
            }
            if (!icoVar.f.o(r3)) {
                ((agrc) ((agrc) ico.a.c().i(agrxVar2, "PlaybackQueueOpsManager")).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueOperationsManager", "updateAutoplayItem", 524, "MusicPlaybackQueueOperationsManager.java")).v("Failed to update queue UI adapter with newly updated autoplay item uid = %d", j);
            }
        }
        icoVar.i.d("PROMOTE_FROM_AUTOPLAY", false);
        icoVar.m.k();
    }
}
