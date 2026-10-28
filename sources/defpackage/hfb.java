package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfb implements aheh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public hfb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Object, xyf] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, wer] */
    @Override // defpackage.aheh
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
            case 1:
            case 19:
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) hgf.a.c().i(agso.a, "MediaSessionRestoreCtlr")).j(th)).k("com/google/android/apps/youtube/music/mediabrowser/MediaSessionRestorationController$RestorationCallback", "onFailure", 'i', "MediaSessionRestorationController.java")).t("Restoration failed");
                ((hgf) this.a).g = null;
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) hnt.a.b().i(agso.a, "AutoOfflineToggleCtlr")).j(th)).k("com/google/android/apps/youtube/music/offline/autooffline/AutoOfflineToggleController$1$1", "onFailure", (char) 186, "AutoOfflineToggleController.java")).t("Failure to get hasShownSmartDownloadEduShelf.");
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) hnt.a.b().i(agso.a, "AutoOfflineToggleCtlr")).j(th)).k("com/google/android/apps/youtube/music/offline/autooffline/AutoOfflineToggleController$1", "onFailure", (char) 195, "AutoOfflineToggleController.java")).t("Failure to get MusicDownloadsPrefsStore.");
                break;
            case 5:
                hqg.o(this.a);
                break;
            case 6:
                ((agrc) ((agrc) huf.a.b().i(agso.a, "Offline")).k("com/google/android/apps/youtube/music/offline/orchestration/MusicPlaylistDownloadController$1", "onFailure", 264, "MusicPlaylistDownloadController.java")).t("Couldn't fetch music library entity.");
                break;
            case 7:
                ((agrc) ((agrc) huf.a.b().i(agso.a, "Offline")).k("com/google/android/apps/youtube/music/offline/orchestration/MusicPlaylistDownloadController$2", "onFailure", 308, "MusicPlaylistDownloadController.java")).t("Couldn't fetch music library entity.");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) hur.a.b().i(agso.a, "OfflineBrowsePageGenSvc")).j(th)).k("com/google/android/apps/youtube/music/offline/service/OfflineBrowsePageGenerationService$1", "onFailure", (char) 584, "OfflineBrowsePageGenerationService.java")).t("Failed generating offline browse page");
                this.a.jj(new toe(th));
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) ied.a.c().i(agso.a, "QueueRestorationCtlr")).j(th)).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController$QueueEmlResponsesRestorationFutureCallback", "onFailure", (char) 691, "QueueRestorationController.java")).t("Failed to fetch watch page.");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) ied.a.c().i(agso.a, "QueueRestorationCtlr")).j(th)).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController$ServerQueueFetchCallback", "onFailure", (char) 857, "QueueRestorationController.java")).t("Server queue failed to fetch.");
                ied iedVar = (ied) this.a;
                iedVar.i.d("RESTORE", true);
                ((isi) iedVar.e.io()).h();
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) iet.a.c().i(agso.a, "QueuePlaylistRefresh")).j(th)).k("com/google/android/apps/youtube/music/player/queue/playlistrefresh/QueuePlaylistRefreshController$PollingCallback", "onFailure", (char) 205, "QueuePlaylistRefreshController.java")).t("Playlist update failed.");
                break;
            case 12:
                this.a.a();
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) iew.a.c()).j(th)).k("com/google/android/apps/youtube/music/player/queue/requester/OnlineQueueItemRequester$MusicQueueResponseFutureCallback", "onFailure", (char) 288, "OnlineQueueItemRequester.java")).t("Failed to fetch queue items via MusicQueue response");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) iew.a.c()).j(th)).k("com/google/android/apps/youtube/music/player/queue/requester/OnlineQueueItemRequester$WatchNextResponseFutureCallback", "onFailure", (char) 301, "OnlineQueueItemRequester.java")).t("Failed to fetch queue items via WatchNext response");
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) igr.a.b()).j(th)).k("com/google/android/apps/youtube/music/player/streamwifionly/StreamWifiOnlyController$1", "onFailure", (char) 320, "StreamWifiOnlyController.java")).t("Failed to decide allowing offline playback");
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) iqv.a.b()).j(th)).k("com/google/android/apps/youtube/music/settings/utils/MusicPlaybackPrefsStoreHelper$1", "onFailure", (char) 179, "MusicPlaybackPrefsStoreHelper.java")).t("Failed to get MusicPlaybackPrefsStore.");
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) jkc.a.b().i(agso.a, "TastebuilderSearch")).j(th)).k("com/google/android/apps/youtube/music/userengagement/presenters/TastebuilderSearchPresenter$1", "onFailure", (char) 162, "TastebuilderSearchPresenter.java")).t("Error fetching tastebuilder search suggestions");
                break;
            case 18:
                ((agsj) ((agsj) ((agsj) joz.a.c()).j(th)).k("com/google/android/apps/youtube/music/watchpage/presenter/WatchPagePresenter$1", "onFailure", 652, "WatchPagePresenter.java")).t("Failed to register PersistentEntityStoreBlock.");
                break;
            default:
                oiw oiwVar = ((oog) this.a).a.c;
                if (oiwVar == null) {
                    oiwVar = oiw.a;
                }
                onb.g(th, "%s: Unable to increment LoggingStateStore network usage for %s", "NetworkUsageMonitor", oiwVar.c);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r10v20, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r9v6, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v70, types: [java.lang.Object, xyf] */
    /* JADX WARN: Type inference failed for: r9v83, types: [java.lang.Object, twi] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        int i = 9;
        int i2 = 1;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    Object obj2 = this.a;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
                    hfc hfcVar = (hfc) obj2;
                    ajwo ajwoVar = hfcVar.d;
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amla.b);
                        ajwoVar.c(aihlVarCheckIsLite2);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                        amlh amlhVar = ((amla) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).g;
                        if (amlhVar == null) {
                            amlhVar = amlh.a;
                        }
                        if (fhz.w(amlhVar)) {
                            hfcVar.c.b("LM");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    jan janVar = (jan) this.a;
                    ((aacm) janVar.d.io()).d(((aanb) janVar.g.io()).b().s(), 3600L);
                    return;
                }
                return;
            case 2:
                Optional optional = (Optional) obj;
                hgf hgfVar = (hgf) this.a;
                if (hgfVar.b.a()) {
                    agrx agrxVar = agso.a;
                    return;
                }
                hge hgeVar = new hge(this, i3);
                if (true == optional.isPresent()) {
                    Object obj3 = optional.get();
                    hgf hgfVar2 = (hgf) ((hfb) hgeVar.a).a;
                    ((hwm) hgfVar2.e.io()).c((aima) obj3);
                    ((aceo) hgfVar2.d.io()).i();
                }
                hgfVar.g = null;
                return;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                taf.j(((ayq) ((iqk) this.a).a.io()).j(new iqi(i3)), new ihw(i));
                return;
            case 4:
                iqk iqkVar = (iqk) obj;
                ahno.at(iqkVar.b(), new hfb(iqkVar, 3), ((hnt) this.a).d);
                return;
            case 5:
                hqg.o(this.a);
                return;
            case 6:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return;
                }
                annv annvVar = (annv) optional2.get();
                Collection.EL.stream(annvVar.e()).forEach(new hsk(this, 7));
                Collection.EL.stream(annvVar.g()).forEach(new hsk(this, 8));
                return;
            case 7:
                Optional optional3 = (Optional) obj;
                if (optional3.isEmpty()) {
                    return;
                }
                annv annvVar2 = (annv) optional3.get();
                Collection.EL.stream(annvVar2.j()).forEach(new hsk(this, i));
                Collection.EL.stream(annvVar2.i()).forEach(new hsk(this, 10));
                return;
            case 8:
                this.a.a((iti) obj);
                return;
            case 9:
                ailx ailxVar = (ailx) obj;
                if (ailxVar.c.isEmpty() && ailxVar.b.isEmpty()) {
                    agrx agrxVar2 = agso.a;
                    return;
                }
                awmd awmdVar = ((ied) this.a).j;
                idy idyVar = (idy) awmdVar.io();
                Iterator it = ailxVar.b.iterator();
                while (it.hasNext()) {
                }
                Iterator it2 = ailxVar.c.iterator();
                while (it2.hasNext()) {
                }
                idy idyVar2 = (idy) awmdVar.io();
                Iterator it3 = ailxVar.b.iterator();
                while (it3.hasNext()) {
                    idyVar2.c.r((aigj) it3.next());
                }
                Iterator it4 = ailxVar.c.iterator();
                while (it4.hasNext()) {
                    idyVar2.c.q((aigj) it4.next());
                }
                agrx agrxVar3 = agso.a;
                return;
            case 10:
                wgi wgiVar = (wgi) obj;
                agrx agrxVar4 = agso.a;
                ied iedVar = (ied) this.a;
                iedVar.i.d("RESTORE", false);
                if (iedVar.s.l(SemanticState.Focused, 45835360L, false)) {
                    ((jij) iedVar.r.io()).k(wgiVar);
                    return;
                }
                return;
            case 11:
                alws alwsVar = (alws) obj;
                agrx agrxVar5 = agso.a;
                int i4 = alwsVar.b;
                if ((i4 & 4) != 0) {
                    abjp abjpVar = (abjp) ((iet) this.a).b.io();
                    ajwo ajwoVar2 = alwsVar.e;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    abjl abjlVarH = abjpVar.h();
                    if (!(abjlVarH instanceof icj)) {
                        ((agrc) ((agrc) abjp.a.c()).k("com/google/android/libraries/youtube/player/features/queue/PlaybackQueueManager", "requestPlaylistRefresh", 392, "PlaybackQueueManager.java")).t("Trying to call requestPlaylistRefresh on an incompatible queue.");
                        return;
                    }
                    icj icjVar = (icj) abjlVarH;
                    if (!gzj.W(ajwoVar2)) {
                        ((agrc) ((agrc) icj.a.c()).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue", "requestPlaylistRefresh", 1083, "MusicPlaybackQueue.java")).t("Playlist refresh command does not have a playable extension.");
                        return;
                    }
                    icd icdVar = new icd(icjVar, icjVar.g());
                    axfd axfdVar = icjVar.C;
                    abnk abnkVar = new abnk();
                    abnkVar.a = ajwoVar2;
                    abnkVar.d((aigj) icjVar.D.j().orElse(null));
                    ahno.at(axfdVar.q(abnkVar.a(), null), icdVar, MoreExecutors.directExecutor());
                    return;
                }
                if ((i4 & 2) != 0) {
                    aowh aowhVar = alwsVar.d;
                    if (aowhVar == null) {
                        aowhVar = aowh.a;
                    }
                    Object obj4 = this.a;
                    if ((aowhVar.b & 1) == 0) {
                        ((agrc) ((agrc) iet.a.c().i(agrxVar5, "QueuePlaylistRefresh")).k("com/google/android/apps/youtube/music/player/queue/playlistrefresh/QueuePlaylistRefreshController", "schedulePollingRequest", 141, "QueuePlaylistRefreshController.java")).t("PollPlaylistFreshnessContinuationData was missing a TimedContinuation");
                        return;
                    }
                    aqmx aqmxVar = aowhVar.c;
                    if (aqmxVar == null) {
                        aqmxVar = aqmx.a;
                    }
                    int i5 = aqmxVar.b;
                    if ((i5 & 1) == 0 || (i5 & 2) == 0) {
                        return;
                    }
                    iet ietVar = (iet) obj4;
                    ietVar.b();
                    int i6 = aqmxVar.c;
                    String str = aqmxVar.d;
                    wsy wsyVarA = ietVar.a();
                    ietVar.g = avlr.ac(i6, TimeUnit.MILLISECONDS, ietVar.c).O(ietVar.d).af(new gkr(obj4, new wsx(wsyVarA.b, wsyVarA.e.hw(), null, 0, Optional.empty(), str), 12));
                    return;
                }
                return;
            case 12:
                List list = (List) obj;
                if (list != null) {
                    this.a.b(list);
                    return;
                }
                return;
            case 13:
                iew iewVar = (iew) this.a;
                alss alssVar = (alss) obj;
                ((awku) iewVar.g.io()).kk(new icw(null, alssVar));
                jij jijVar = (jij) iewVar.e.io();
                if ((alssVar.b & SemanticState.Focused) != 0) {
                    ((awku) jijVar.a).kk(Optional.of(alssVar.g));
                }
                if ((alssVar.b & 32) != 0) {
                    vxe vxeVar = iewVar.f;
                    ajwm ajwmVar = alssVar.f;
                    if (ajwmVar == null) {
                        ajwmVar = ajwm.a;
                    }
                    vxeVar.b(ajwmVar.c);
                    return;
                }
                return;
            case 14:
                ((jij) ((iew) this.a).e.io()).k((wgi) obj);
                return;
            case 15:
                if (Objects.equals((Boolean) obj, Boolean.TRUE)) {
                    return;
                }
                igr igrVar = (igr) this.a;
                igrVar.d.aq(false, 35);
                igrVar.h = true;
                Iterator it5 = igrVar.e.iterator();
                while (it5.hasNext()) {
                    ((igq) it5.next()).q();
                }
                return;
            case 16:
                this.a.a((iqn) obj);
                return;
            case 17:
                alxg alxgVar = (alxg) obj;
                if (alxgVar != null) {
                    jku.a(new jmi(this, alxgVar, i2), ((jkc) this.a).b);
                    return;
                }
                return;
            case 18:
                ((joz) this.a).an.b((afzm) obj);
                return;
            case 19:
                kkp kkpVar = (kkp) obj;
                WeakHashMap weakHashMap = kkf.b;
                synchronized (weakHashMap) {
                    Map.EL.putIfAbsent(weakHashMap, Integer.valueOf(((kkf) this.a).c.hashCode()), kkpVar);
                    break;
                }
                return;
            default:
                oiw oiwVar = ((oog) this.a).a.c;
                if (oiwVar == null) {
                    oiwVar = oiw.a;
                }
                String str2 = oiwVar.c;
                int i7 = onb.a;
                return;
        }
    }
}
