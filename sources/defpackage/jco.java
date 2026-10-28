package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jco implements twi {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jco(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) jcp.a.b()).k("com/google/android/apps/youtube/music/ui/presenter/MenuItemPresenter", "maybeModifyModelForDownloadActionsAsync", 380, "MenuItemPresenter.java")).t("Failed to modify offline video menu item");
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) ivn.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/signin/SignInFragment", "onCreateView", (char) 192, "SignInFragment.java")).t("Error saving skip sign in key");
                break;
            case 2:
                ((agrc) ((agrc) jcp.a.b()).k("com/google/android/apps/youtube/music/ui/presenter/MenuItemPresenter", "maybeModifyModelForDownloadActionsAsync", 400, "MenuItemPresenter.java")).t("Failed to modify offline playlist menu item");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) jgd.c.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/ui/presenter/OfflineVideoFadeAndDisplayStatePresenter", "presentMusicTrackEntity", 'a', "OfflineVideoFadeAndDisplayStatePresenter.java")).t("Failure to get playback data entity.");
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) jgy.c.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/ui/presenter/VideoOfflineBadgePresenter", "presentMusicTrackEntity", 'x', "VideoOfflineBadgePresenter.java")).t("Failure to get playback data entity.");
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) svl.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/commerce/payment/controller/GooglePaymentBillingController", "launchBillingFlow", (char) 206, "GooglePaymentBillingController.java")).t("Failed to read fake buy flag.");
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                Log.e("MediaGenInputViewPeer", "Failed to get MediaGenImageEditorSchema from ProtoDataStore", (Throwable) obj);
                break;
            case 14:
                Log.e("MediaGenInputViewPeer", "Failed to update mediagen ai edit disclaimer", (Throwable) obj);
                break;
            case 15:
                break;
            case 16:
                ((agrc) ((agrc) vhd.a.b()).k("com/google/android/libraries/youtube/creation/videoeffects/fragment/RecentStickerTracker", "addRecentSticker", 53, "RecentStickerTracker.java")).t("Failure adding recent sticker to PDS");
                break;
            case 17:
                ((agrc) ((agrc) vhe.a.b()).k("com/google/android/libraries/youtube/creation/videoeffects/fragment/RecentlyUsedStickerPagePresenter", "present", 61, "RecentlyUsedStickerPagePresenter.java")).t("Error presenting recent stickers");
                break;
            case 18:
                break;
            case 19:
                twu.c(6, "Failed to restore engagement panel state.", (Throwable) obj);
                break;
            default:
                break;
        }
    }
}
