package defpackage;

import j$.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vqe implements avni {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vqe(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) vqg.p.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/engagementpanel/SyncContentPillController", "updateSyncMode", (char) 365, "SyncContentPillController.java")).t("Error updating entity with sync mode");
                break;
            case 1:
                Throwable th = (Throwable) obj;
                zvp.b(zvn.b, zvm.M, "Caught error handling EditorCompositionContext in ShortsVideoEffectsController", th);
                ((agrc) ((agrc) ((agrc) umf.b.b()).j(th)).k("com/google/android/libraries/youtube/creation/editor/ShortsVideoEffectsController", "onResume", (char) 153, "ShortsVideoEffectsController.java")).w("%s", "Caught error handling EditorCompositionContext in ShortsVideoEffectsController");
                break;
            case 2:
                agew agewVar = (agew) obj;
                vob vobVar = (vob) agewVar.a;
                if (vobVar != ((vob) agewVar.b)) {
                    vobVar.x();
                } else {
                    vobVar.y();
                }
                break;
            case 3:
                zvr zvrVar = zvp.a;
                tzk.a((Throwable) obj);
                break;
            case 4:
                ((vor) obj).t();
                break;
            case 5:
                ((Boolean) obj).booleanValue();
                break;
            case 6:
                tzk.a((Throwable) obj);
                break;
            case 7:
                tzk.a((Throwable) obj);
                break;
            case 8:
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) wsl.c.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/innertube/services/playlistedit/PlaylistEditService", "sendPlaylistEventsForRequest", (char) 141, "PlaylistEditService.java")).t("Error updating entity store.");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) wsl.c.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/innertube/services/playlistedit/PlaylistEditService", "sendPlaylistEventsForRequest", (char) 172, "PlaylistEditService.java")).t("Error updating entity store.");
                break;
            case 11:
                tzk.a((Throwable) obj);
                break;
            case 12:
                Throwable th2 = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) wwn.a.b()).j(th2)).k("com/google/android/libraries/youtube/livechat/controller/LiveChatController", "onVideoTimeEventError", (char) 1093, "LiveChatController.java")).t("LiveChatController: VideoTimeEvent subscription failed; chat replay will no longer sync to the video position.");
                tzk.a(th2);
                break;
            case 13:
                zvp.b(zvn.b, zvm.E, "Exception while subscribing to likeStateEntity. Might be cause from an account switching", (Throwable) obj);
                break;
            case 14:
                zvp.b(zvn.b, zvm.E, "Exception while subscribing to likeCountEntity. Might be cause from an account switching", (Throwable) obj);
                break;
            case 15:
                akja akjaVar = (akja) obj;
                long j = xjp.a;
                xjp.a = akjaVar.d;
                xjp.b = (Set) Collection.EL.stream(akjaVar.e).map(new xjh(4)).collect(aghu.b);
                break;
            case 16:
                twu.c(6, "Failed to install sampling config", (Throwable) obj);
                break;
            case 17:
                xos xosVar = (xos) obj;
                xosVar.c.f.h(xosVar);
                awlx awlxVar = xosVar.a;
                Boolean bool = Boolean.FALSE;
                awlxVar.ki(bool);
                xosVar.b.ki(bool);
                break;
            case 18:
                ((agrc) ((agrc) xot.a.b().i(agso.a, "Handoff.HandoffGateCommandResolver")).k("com/google/android/libraries/youtube/mdx/handoff/HandoffGateCommandResolver", "resolve", 132, "HandoffGateCommandResolver.java")).t("Gate checks timed out.");
                break;
            case 19:
                tzk.a((Throwable) obj);
                break;
            default:
                ((agrc) ((agrc) ((agrc) xrn.a.b().i(agso.a, "MDX.MediaRouteButtonController")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteButtonController", "onStart", (char) 378, "MediaRouteButtonController.java")).t("Received error observing isCastingEnabled.");
                break;
        }
    }
}
