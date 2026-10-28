package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xwk implements tab {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xwk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) xwm.a.b().i(agso.a, "MDX.remote")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/pairing/MdxCloudScreenStorage", "add", (char) 131, "MdxCloudScreenStorage.java")).t("Error saving sessions to storage.");
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) xxd.a.b().i(agso.a, "MDX.player.director")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedPlayPause", (char) 948, "MdxDirector.java")).t("RCI play/pause command failed.");
                break;
            case 3:
                agrx agrxVar = agso.a;
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) xxd.a.b().i(agso.a, "MDX.player.director")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedSetPlayback", (char) 804, "MdxDirector.java")).t("RCI set playback command failed.");
                break;
            case 5:
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) yck.a.b().i(agso.a, "MDX.SessionInfoStorage")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorage", "saveSessionInfo", (char) 134, "MdxSessionInfoStorage.java")).t("Failed to save session info");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) yck.a.b().i(agso.a, "MDX.SessionInfoStorage")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorage", "clearStorage", (char) 156, "MdxSessionInfoStorage.java")).t("Failed to clear storage");
                break;
            case 8:
                zvp.h(zvn.a, zvm.f, "Failed to persist persisted bandwidth samples.", 0.01d);
                break;
            case 9:
                zvp.b(zvn.a, zvm.f, "Failed to store: codecNeedsSetOutputSurfaceWorkaround.", (Throwable) obj);
                break;
            case 10:
                zvp.b(zvn.a, zvm.f, "Failed to store: codecNeedsSetOutputSurfaceWorkaround.", (Throwable) obj);
                break;
            case 11:
                zhr.c(zhq.CACHE, (Throwable) obj, "Fails to save the supported profile to disk.", new Object[0]);
                break;
            case 12:
                zhr.c(zhq.CACHE, (Throwable) obj, "Fails to save the media codec info to disk.", new Object[0]);
                break;
            case 13:
                zvp.a(zvn.a, zvm.f, "Failed to update manual video quality selection.");
                break;
            case 14:
                zvp.a(zvn.a, zvm.f, "Failed to store last playback start time.");
                break;
            case 15:
                zvp.a(zvn.a, zvm.f, "Failed to wipe manual format selection info.");
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "afterTextChanged", (char) 268, "SuggestEditWatcher.java")).t("Error measuring EditText");
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "afterTextChanged", (char) 285, "SuggestEditWatcher.java")).t("Error deleting span");
                break;
            case 18:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "afterTextChanged", (char) 299, "SuggestEditWatcher.java")).t("Error deleting span");
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "afterTextChanged", (char) 375, "SuggestEditWatcher.java")).t("Error measuring EditText");
                break;
            default:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "createBottomSheetController", (char) 649, "SuggestEditWatcher.java")).t("Error calling handleTextChanged");
                break;
        }
    }

    @Override // defpackage.tab
    public final void b(Throwable th) {
        switch (this.$cid) {
            case 0:
            case 5:
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) xwm.a.b().i(agso.a, "MDX.remote")).j(th)).k("com/google/android/libraries/youtube/mdx/pairing/MdxCloudScreenStorage", "add", (char) 131, "MdxCloudScreenStorage.java")).t("Error saving sessions to storage.");
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) xxd.a.b().i(agso.a, "MDX.player.director")).j(th)).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedPlayPause", (char) 948, "MdxDirector.java")).t("RCI play/pause command failed.");
                break;
            case 3:
                agrx agrxVar = agso.a;
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) xxd.a.b().i(agso.a, "MDX.player.director")).j(th)).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedSetPlayback", (char) 804, "MdxDirector.java")).t("RCI set playback command failed.");
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) yck.a.b().i(agso.a, "MDX.SessionInfoStorage")).j(th)).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorage", "saveSessionInfo", (char) 134, "MdxSessionInfoStorage.java")).t("Failed to save session info");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) yck.a.b().i(agso.a, "MDX.SessionInfoStorage")).j(th)).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionInfoStorage", "clearStorage", (char) 156, "MdxSessionInfoStorage.java")).t("Failed to clear storage");
                break;
            case 8:
                zvp.h(zvn.a, zvm.f, "Failed to persist persisted bandwidth samples.", 0.01d);
                break;
            case 9:
                zvp.b(zvn.a, zvm.f, "Failed to store: codecNeedsSetOutputSurfaceWorkaround.", th);
                break;
            case 10:
                zvp.b(zvn.a, zvm.f, "Failed to store: codecNeedsSetOutputSurfaceWorkaround.", th);
                break;
            case 11:
                zhr.c(zhq.CACHE, th, "Fails to save the supported profile to disk.", new Object[0]);
                break;
            case 12:
                zhr.c(zhq.CACHE, th, "Fails to save the media codec info to disk.", new Object[0]);
                break;
            case 13:
                zvp.a(zvn.a, zvm.f, "Failed to update manual video quality selection.");
                break;
            case 14:
                zvp.a(zvn.a, zvm.f, "Failed to store last playback start time.");
                break;
            case 15:
                zvp.a(zvn.a, zvm.f, "Failed to wipe manual format selection info.");
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j(th)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "afterTextChanged", (char) 268, "SuggestEditWatcher.java")).t("Error measuring EditText");
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j(th)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "afterTextChanged", (char) 285, "SuggestEditWatcher.java")).t("Error deleting span");
                break;
            case 18:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j(th)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "afterTextChanged", (char) 299, "SuggestEditWatcher.java")).t("Error deleting span");
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j(th)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "afterTextChanged", (char) 375, "SuggestEditWatcher.java")).t("Error measuring EditText");
                break;
            default:
                ((agrc) ((agrc) ((agrc) zpb.n.b()).j(th)).k("com/google/android/libraries/youtube/metadataeditor/elements/SuggestEditWatcher", "createBottomSheetController", (char) 649, "SuggestEditWatcher.java")).t("Error calling handleTextChanged");
                break;
        }
    }
}
