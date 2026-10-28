package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hht {
    public final ReentrantLock b;
    private final aunn d;
    private final aunn e;
    public static final hmy c = new hmy();
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger");

    public hht(aunn aunnVar, aunn aunnVar2) {
        aunnVar.getClass();
        aunnVar2.getClass();
        this.d = aunnVar;
        this.e = aunnVar2;
        this.b = new ReentrantLock();
    }

    private final xgv j() {
        Object objIo = this.d.io();
        objIo.getClass();
        return (xgv) objIo;
    }

    private final void k(him himVar, him himVar2) {
        znf znfVar = himVar.c;
        if (awrc.c(znfVar, himVar2.c)) {
            return;
        }
        him himVarA = himVar.a();
        if (himVarA == null) {
            ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "logImpressionsToAncestor", 516, "InteractionLogger.kt")).w("Needed logging parent for mediaItemData: %s", znfVar);
        } else {
            k(himVarA, himVar2);
            d(himVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [xgz] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v3, types: [xgv] */
    private final void l(him himVar, xgz xgzVar, xgt xgtVar, int i) {
        xgz xgzVarF;
        ReentrantLock reentrantLock = himVar.d;
        reentrantLock.lock();
        try {
            jrf jrfVar = himVar.j;
            Object obj = null;
            if (jrfVar == null) {
                aigj aigjVarH = himVar.h();
                byte[] bArrG = aigjVarH != null ? aigjVarH.G() : null;
                if (bArrG == null || bArrG.length == 0) {
                    jrfVar = null;
                } else {
                    try {
                        jrfVar = (jrf) aihn.parseFrom(jrf.a, bArrG, ExtensionRegistryLite.getGeneratedRegistry());
                        jrfVar.getClass();
                        himVar.j = jrfVar;
                    } catch (aiik unused) {
                        ((agrc) him.a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemData", "getTrackingProto", 586, "MediaItemData.kt")).t("Failed to parse trackingParams.");
                        jrfVar = null;
                    }
                }
            }
            xhc xhcVarB = jrfVar == null ? null : xhb.b(jrfVar.c);
            if (xhcVarB == null) {
                xhcVarB = xhb.b(59815);
            }
            xgx xgxVar = new xgx(xgtVar, xhcVarB, i, false, himVar.e(), himVar.i());
            hil hilVar = himVar.i;
            hilVar.a = xgxVar;
            hilVar.b = xgtVar;
            reentrantLock.unlock();
            him himVarB = himVar.b();
            ?? r13 = xgzVar;
            if (himVarB != null) {
                if (hmy.N(xgtVar, himVarB.c())) {
                    ReentrantLock reentrantLock2 = himVarB.d;
                    reentrantLock2.lock();
                    try {
                        Object obj2 = himVarB.i.d;
                        reentrantLock2.unlock();
                        if (obj2 != null) {
                            obj = obj2;
                        } else if (hmy.N(xgtVar, himVarB.d()) || (xgzVarF = himVarB.f()) == null) {
                            ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "getVeContainerIfOnSameScreen", 498, "InteractionLogger.kt")).w("Invalid VE: %s", himVarB.c);
                        } else {
                            obj = xgzVarF;
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                } else if (hmy.N(xgtVar, himVarB.d())) {
                    ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "getVeContainerIfOnSameScreen", 498, "InteractionLogger.kt")).w("Invalid VE: %s", himVarB.c);
                } else {
                    ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "getVeContainerIfOnSameScreen", 498, "InteractionLogger.kt")).w("Invalid VE: %s", himVarB.c);
                }
                if (obj != null) {
                    r13 = obj;
                } else {
                    ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "getParentVeContainerIfOnSameScreen", 471, "InteractionLogger.kt")).w("Invalid logging parent: %s", himVarB.c);
                    r13 = xgzVar;
                }
            }
            j().e(xgxVar, r13);
            himVar.getClass();
            if (himVar.g() == null) {
                List listM = himVar.m();
                if (listM == null) {
                    listM = awno.a;
                }
                Iterator it = listM.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    l((him) it.next(), xgxVar, xgtVar, i2);
                    i2++;
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final xgt a() {
        return j().a();
    }

    public final ajwo b(hjy hjyVar, him himVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ajwo ajwoVarA = himVar.c.a();
            if (ajwoVarA == null) {
                ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "createInitiatePlaybackCommand$<anonymous>", SemanticState.Focused, "InteractionLogger.kt")).t("createInitiatePlaybackCommand: command is null.");
                ajwoVarA = null;
            } else {
                if (!f(himVar)) {
                    e(himVar, hjyVar.d);
                }
                xgz xgzVarF = himVar.f();
                if (xgzVarF == null) {
                    ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "createInitiatePlaybackCommand$<anonymous>", 140, "InteractionLogger.kt")).t("createInitiatePlaybackCommand: veContainer is null");
                } else {
                    i(xgzVarF, true);
                    ajwoVarA = hmy.L(himVar.d(), xgzVarF, ajwoVarA, true);
                }
            }
            return ajwoVarA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(him himVar, String str) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            xgz xgzVarF = himVar.f();
            if (xgzVarF == null) {
                ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "logPlaybackStarted$<anonymous>", 167, "InteractionLogger.kt")).t("logPlaybackStarted: clickedVe is null");
                j().r(str);
            } else {
                j().s(xgzVarF, str);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(him himVar) {
        xgt xgtVarA = a();
        String str = xgtVarA != null ? xgtVarA.a : null;
        xgt xgtVarD = himVar.d();
        if (!awrc.c(str, xgtVarD != null ? xgtVarD.a : null)) {
            ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "logShown", 529, "InteractionLogger.kt")).t("Screen mismatch when logging shown.");
            return;
        }
        xgz xgzVarF = himVar.f();
        if (xgzVarF == null) {
            ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "logShown", 535, "InteractionLogger.kt")).t("veContainer is null when logging shown.");
        } else {
            znf znfVar = himVar.c;
            j().w(xgzVarF, null);
        }
    }

    public final void e(him himVar, zne zneVar) {
        xgt xgtVarD = himVar.d();
        if (xgtVarD == null) {
            ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "showScreenAndLogImpressions", 201, "InteractionLogger.kt")).w("Screen show request for null veScreen: %s", himVar.c);
        }
        hmy hmyVar = c;
        if (hmy.N(a(), xgtVarD)) {
            ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "showScreenAndLogImpressions", 205, "InteractionLogger.kt")).w("Screen show request for current screen: %s", himVar.c);
            return;
        }
        him himVarK = hmyVar.K(himVar);
        xhc xhcVarG = himVarK != null ? himVarK.g() : null;
        if (xhcVarG == null) {
            ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "showScreenAndLogImpressions", 214, "InteractionLogger.kt")).w("Missing root page for mediaItemData: %s", himVar.c);
            return;
        }
        ajwo ajwoVarL = hmy.L(null, null, null, false);
        List listM = himVarK.m();
        if (listM == null) {
            listM = awno.a;
        }
        h(xhcVarG, ajwoVarL, himVarK, listM, zneVar);
        a();
        k(himVar, himVarK);
    }

    public final boolean f(him himVar) {
        return hmy.N(a(), himVar.d());
    }

    public final void g(him himVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            xgz xgzVarF = himVar.f();
            if (!f(himVar) || xgzVarF == null) {
                ((agrc) a.c().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "logClickForMediaItemData$<anonymous>", 185, "InteractionLogger.kt")).t("logClickForMediaItemData invalid.");
            } else {
                i(xgzVarF, false);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void h(xhc xhcVar, ajwo ajwoVar, him himVar, List list, zne zneVar) {
        j().u();
        xgt xgtVarD = j().D(xhcVar, xgu.e, ajwoVar);
        xgtVarD.getClass();
        ReentrantLock reentrantLock = himVar.d;
        reentrantLock.lock();
        try {
            xhc xhcVarG = himVar.g();
            if (xhcVarG == null) {
                ((agrc) him.a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemData", "createScreenRootVe$<anonymous>", 237, "MediaItemData.kt")).w("createScreenRootVe for null pageVeType: %s", himVar.c);
            }
            xhc xhcVarB = xhcVarG;
            if (xhcVarB == null) {
                xhcVarB = xhb.b(320464);
            }
            xgx xgxVar = new xgx(xgtVarD, xhcVarB, 0, false, himVar.e(), himVar.i());
            hil hilVar = himVar.i;
            hilVar.c = xgtVarD;
            hilVar.d = xgxVar;
            reentrantLock.unlock();
            j().d(xgxVar);
            j().v();
            j().w(xgxVar, null);
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                l((him) it.next(), xgxVar, xgtVarD, i);
                i++;
            }
            String str = xgtVarD.a;
            str.getClass();
            aihf aihfVarCreateBuilder = ambu.a.createBuilder();
            aihf aihfVarCreateBuilder2 = ambv.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            afyd.u(zneVar.i(), aihfVarCreateBuilder2);
            ambv ambvVarT = afyd.t(aihfVarCreateBuilder2);
            aihfVarCreateBuilder.copyOnWrite();
            ambu ambuVar = (ambu) aihfVarCreateBuilder.instance;
            ambuVar.c = ambvVarT;
            ambuVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            ambu ambuVar2 = (ambu) aihfVarCreateBuilder.instance;
            ambuVar2.b |= 4;
            ambuVar2.e = str;
            aihfVarCreateBuilder.getClass();
            xff xffVarA = ((xeu) this.e.io()).a(aihfVarCreateBuilder, alot.INTEGRATION_ATTRIBUTION_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void i(xgz xgzVar, boolean z) {
        j().Y(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgzVar, z);
    }
}
