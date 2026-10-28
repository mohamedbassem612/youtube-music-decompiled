package defpackage;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class him {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemData");
    public static final Set b = atqq.aS(new amzw[]{amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED, amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED_CHILDREN, amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_LOCAL_CONTENT_PARENT, amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SETTINGS, amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED});
    public final znf c;
    public amzx e;
    public List f;
    public Instant g;
    public amzl h;
    public jrf j;
    private final zne k;
    private final ConcurrentMap l;
    private MediaBrowserCompat$MediaItem m;
    private aigj o;
    private him p;
    public final ReentrantLock d = new ReentrantLock();
    private final Set n = new LinkedHashSet();
    public final hil i = new hil();

    public him(znf znfVar, zne zneVar, ConcurrentMap concurrentMap) {
        this.c = znfVar;
        this.k = zneVar;
        this.l = concurrentMap;
    }

    private final znf w() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            amzx amzxVar = this.e;
            znf znfVar = null;
            String str = amzxVar != null ? amzxVar.r : null;
            if (str != null && str.length() != 0) {
                znf znfVar2 = znf.a;
                Object objAh = yno.ah(str);
                if (objAh instanceof awmm) {
                    ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemData", "loggingParentMediaId$<anonymous>", 169, "MediaItemData.kt")).w("invalid loggingParentMediaItemId: %s", str);
                } else {
                    atqp.j(objAh);
                    znfVar = (znf) objAh;
                }
            }
            return znfVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final him a() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            him himVarB = b();
            if (himVarB == null) {
                reentrantLock.lock();
                try {
                    himVarB = this.p;
                    reentrantLock.unlock();
                } finally {
                    reentrantLock.unlock();
                }
            }
            return himVarB;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final him b() {
        him himVar;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (w() == null) {
                himVar = null;
            } else {
                him himVar2 = (him) this.l.get(w());
                if (himVar2 == null) {
                    ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemData", "loggingParentOrNull$<anonymous>", 184, "MediaItemData.kt")).w("loggingParent cannot be found: %s", w());
                }
                himVar = himVar2;
            }
            return himVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final xgt c() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            return (xgt) this.i.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final xgt d() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            return (xgt) this.i.b;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final xgz e() {
        aigj aigjVarH = h();
        if (aigjVarH == null || aigjVarH.E()) {
            return null;
        }
        return new xgj(aigjVarH, (amud) null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xgz] */
    public final xgz f() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            return this.i.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final xhc g() {
        int i;
        znf znfVar = this.c;
        zne zneVar = this.k;
        if (!yno.aj(znfVar, zneVar) && a() != null) {
            if (znfVar.e() || znfVar.g() == 5) {
                return xhb.a(3854);
            }
            if (znfVar.f()) {
                return xhb.a(6827);
            }
            if (znfVar.g() != 4) {
                return null;
            }
            return xhb.a(96367);
        }
        if (awrc.c(zneVar, zlw.a)) {
            i = 61635;
        } else if (awrc.c(zneVar, zmc.a)) {
            i = 62274;
        } else if (awrc.c(zneVar, zmd.a)) {
            i = 161670;
        } else if (awrc.c(zneVar, znd.a)) {
            i = 133818;
        } else {
            i = awrc.c(zneVar, zna.a) ? 76256 : 320464;
        }
        return xhb.a(i);
    }

    public final aigj h() {
        aigj aigjVar;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            aigj aigjVar2 = this.o;
            if (aigjVar2 == null || !aext.y(aigjVar2)) {
                amzx amzxVar = this.e;
                aigjVar2 = null;
                if (amzxVar != null && (aigjVar = amzxVar.q) != null && aext.y(aigjVar)) {
                    aigjVar2 = aigjVar;
                }
            }
            return aigjVar2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ajva i() {
        aigj aigjVarH = h();
        if (aigjVarH == null || aigjVarH.E()) {
            return null;
        }
        aihf aihfVarCreateBuilder = ajva.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihf aihfVarCreateBuilder2 = ajvc.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        ajvc ajvcVar = (ajvc) aihfVarCreateBuilder2.instance;
        ajvcVar.b |= 1;
        ajvcVar.c = aigjVarH;
        aihn aihnVarBuild = aihfVarCreateBuilder2.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        ajva ajvaVar = (ajva) aihfVarCreateBuilder.instance;
        ajvaVar.c = (ajvc) aihnVarBuild;
        ajvaVar.b |= SemanticState.ReadOnly;
        aihn aihnVarBuild2 = aihfVarCreateBuilder.build();
        aihnVarBuild2.getClass();
        return (ajva) aihnVarBuild2;
    }

    public final Boolean j() {
        Boolean boolValueOf;
        boolean zB;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            amzx amzxVar = this.e;
            if (amzxVar == null || (amzxVar.b & SemanticState.Focused) == 0) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = this.m;
                if (mediaBrowserCompat$MediaItem != null) {
                    zB = mediaBrowserCompat$MediaItem.b();
                } else {
                    boolValueOf = null;
                }
                return boolValueOf;
            }
            zB = amzxVar.l;
            boolValueOf = Boolean.valueOf(zB);
            return boolValueOf;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final Object k(aunn aunnVar, zne zneVar, mbc mbcVar, Set set, MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
        Duration durationPlus;
        zneVar.getClass();
        if (awrc.c(j(), Boolean.FALSE)) {
            return atqp.i(new hju(this.c));
        }
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            List list = this.f;
            reentrantLock.unlock();
            if (list == null) {
                return atqp.i(new hjq(this.c));
            }
            ReentrantLock reentrantLock2 = this.d;
            reentrantLock2.lock();
            try {
                Instant instant = this.g;
                reentrantLock2.unlock();
                if (instant != null) {
                    ReentrantLock reentrantLock3 = this.d;
                    reentrantLock3.lock();
                    try {
                        amzl amzlVar = this.h;
                        reentrantLock3.unlock();
                        if (amzlVar == null || (amzlVar.b & 1) == 0) {
                            durationPlus = null;
                        } else {
                            Duration durationOfSeconds = Duration.ofSeconds(amzlVar.c);
                            durationOfSeconds.getClass();
                            if ((amzlVar.b & 2) != 0) {
                                durationPlus = durationOfSeconds.plus(Duration.ofSeconds(amzlVar.d));
                            } else {
                                durationPlus = null;
                            }
                        }
                        if (durationPlus != null) {
                            Duration durationBetween = Duration.between(instant, mbcVar.f());
                            durationBetween.getClass();
                            if (durationBetween.compareTo(durationPlus) > 0) {
                                return atqp.i(new hjp(this.c));
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock3.unlock();
                        throw th;
                    }
                }
                awoa awoaVar = new awoa(10);
                if (this.c.e() && mediaBrowserCompat$MediaItem != null) {
                    awoaVar.add(mediaBrowserCompat$MediaItem);
                }
                ListIterator listIterator = ((awoa) list).listIterator(0);
                while (listIterator.hasNext()) {
                    Object objL = ((him) listIterator.next()).l(aunnVar, zneVar, set);
                    if (true == (objL instanceof awmm)) {
                        objL = null;
                    }
                    MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) objL;
                    if (mediaBrowserCompat$MediaItem2 != null) {
                        awoaVar.add(mediaBrowserCompat$MediaItem2);
                    }
                }
                return awoaVar.f();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final Object l(aunn aunnVar, zne zneVar, Set set) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = this.m;
            reentrantLock.unlock();
            if (mediaBrowserCompat$MediaItem2 != null) {
                return mediaBrowserCompat$MediaItem2;
            }
            ReentrantLock reentrantLock2 = this.d;
            reentrantLock2.lock();
            try {
                amzx amzxVar = this.e;
                reentrantLock2.unlock();
                if (amzxVar == null) {
                    return atqp.i(new hjt(this.c));
                }
                Object objIo = aunnVar.io();
                objIo.getClass();
                hin hinVar = (hin) objIo;
                if (set == null) {
                    try {
                        set = b;
                    } catch (IllegalArgumentException e) {
                        ((agrc) ((agrc) a.b()).j(e).k("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemData$Companion", "createMediaCompatMediaItem", 843, "MediaItemData.kt")).t("Failed to create MediaCompatMediaItem");
                        mediaBrowserCompat$MediaItem = null;
                    }
                }
                mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) hinVar.i(amzxVar, set, zneVar).orElse(null);
                if (mediaBrowserCompat$MediaItem == null) {
                    return atqp.i(new hjs(this.c));
                }
                ReentrantLock reentrantLock3 = this.d;
                reentrantLock3.lock();
                try {
                    this.m = mediaBrowserCompat$MediaItem;
                    return mediaBrowserCompat$MediaItem;
                } finally {
                    reentrantLock3.unlock();
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final List m() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            return this.f;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void n(List list, amzl amzlVar, mbc mbcVar, aunn aunnVar) {
        list.getClass();
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            List listC = hmy.C(list, this.l, this.k, mbcVar, aunnVar);
            ListIterator listIterator = ((awoa) listC).listIterator(0);
            while (listIterator.hasNext()) {
                ((him) listIterator.next()).q(this);
            }
            boolean zF = hmy.F(this.f, listC);
            this.f = listC;
            this.g = mbcVar.f();
            this.h = amzlVar;
            reentrantLock.unlock();
            if (zF) {
                p(aunnVar);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void o(List list, mbc mbcVar, aunn aunnVar) {
        list.getClass();
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            awoa awoaVar = new awoa(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) it.next();
                znf znfVarB = hmy.B(mediaBrowserCompat$MediaItem.a());
                if (znfVarB != null) {
                    him himVarD = hmy.D(znfVarB, this.k, this.l);
                    mediaBrowserCompat$MediaItem.getClass();
                    ReentrantLock reentrantLock2 = himVarD.d;
                    reentrantLock2.lock();
                    try {
                        if (!awrc.c(hmy.B(mediaBrowserCompat$MediaItem.a()), himVarD.c)) {
                            throw new IllegalStateException("MediaId mismatch when setting MediaCompatMediaItem.");
                        }
                        himVarD.m = mediaBrowserCompat$MediaItem;
                        himVarD.e = null;
                        reentrantLock2.unlock();
                        himVarD.q(this);
                        awoaVar.add(himVarD);
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
            }
            List listF = awoaVar.f();
            boolean zF = hmy.F(this.f, listF);
            this.f = listF;
            this.g = mbcVar.f();
            this.h = null;
            reentrantLock.unlock();
            if (zF) {
                p(aunnVar);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void p(aunn aunnVar) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            boolean zIsEmpty = this.n.isEmpty();
            reentrantLock.unlock();
            if (zIsEmpty) {
                return;
            }
            ((isw) aunnVar.io()).h(this.c);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void q(him himVar) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.p = himVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void r(aigj aigjVar) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.o = aigjVar;
            this.j = null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void s(amzx amzxVar, mbc mbcVar) {
        amzxVar.getClass();
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (!awrc.c(hmy.G(amzxVar), this.c)) {
                throw new IllegalStateException("MediaId mismatch when setting MbfeItem.");
            }
            this.e = amzxVar;
            mbcVar.f();
            this.m = null;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    public final boolean t(mbc mbcVar) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            Instant instant = this.g;
            boolean z = true;
            if (this.f != null && instant != null) {
                reentrantLock.lock();
                try {
                    amzl amzlVar = this.h;
                    Duration durationOfSeconds = null;
                    if (amzlVar != null && (amzlVar.b & 1) != 0) {
                        durationOfSeconds = Duration.ofSeconds(amzlVar.c);
                    }
                    reentrantLock.unlock();
                    if (durationOfSeconds != null) {
                        Duration durationBetween = Duration.between(instant, mbcVar.f());
                        durationBetween.getClass();
                        if (durationBetween.compareTo(durationOfSeconds) <= 0) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final String toString() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            return "MediaItemData(mediaId=" + this.c + ", mbfeItem=" + this.e + ", mediaCompatMediaItem=" + this.m + ", children=" + this.f + ", childrenRecipients=" + this.n + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean u(zne zneVar) {
        return awrc.c(this.k, zneVar) && yno.aj(this.c, zneVar);
    }

    public final void v(zng zngVar) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.n.add(zngVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
