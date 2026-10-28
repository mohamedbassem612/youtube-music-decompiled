package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ztb implements tab {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ztb(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                twu.c(6, "Failed to update delayed event PDS", (Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            case 2:
                twu.c(6, "Failed to update DelayedEventMetricsStore", (Throwable) obj);
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) zyc.b.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/net/request/LogcatNetworkLogger", "onCacheHit", 'o', "LogcatNetworkLogger.java")).t("There was an error.");
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) aabu.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/notification/push/util/NotificationUtils", "maybeSaveLastChangedTime", (char) 128, "NotificationUtils.java")).t("Failed to save enabledness changed timestamp");
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) aabu.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/notification/push/util/NotificationUtils", "invalidateRegistration", (char) 152, "NotificationUtils.java")).t("Failed to invalidate gcm registration timestamp");
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) aaqg.h.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/offline/settings/DefaultOfflineSettings", "setNextAutoOfflineTimeMillis", (char) 159, "DefaultOfflineSettings.java")).t("[Offline] Failed to set next auto offline time millis at.");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) aaqg.h.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/offline/settings/DefaultOfflineSettings", "setHasTransfersForOfflineStore", (char) 173, "DefaultOfflineSettings.java")).t("[Offline] Failed to set hasTransfersForOffline.");
                break;
            case 8:
                a((Throwable) obj);
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) aarj.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController", "cleanUpVideoPlaybackPositions", (char) 156, "DefaultOfflineVideoPlaybackPositionSyncController.java")).t("[Offline] Error clean up offline playback position data");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) aarj.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController", "removeSingleVideoPlaybackPosition", (char) 177, "DefaultOfflineVideoPlaybackPositionSyncController.java")).t("[Offline] Error remove single offline playback position data");
                break;
            case 11:
                zvp.b(zvn.b, zvm.C, "Some error occurred when evicting player response", (Throwable) obj);
                break;
            case 12:
                zvp.b(zvn.b, zvm.C, "Some error occurred when putting a player response into cache", (Throwable) obj);
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) abib.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/features/playbackposition/PlaybackPositionStartupController", "handlePesUpdate", (char) 254, "PlaybackPositionStartupController.java")).t("Error syncing PES update to IMES for VPPE.");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) abib.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/features/playbackposition/PlaybackPositionStartupController", "handlePesUpdate", (char) 261, "PlaybackPositionStartupController.java")).t("Error syncing PES update to IMES for VPPE.");
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) abmo.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/internal/queue/LegacyQueueController", "fetchAndQueueNextVideo", (char) 183, "LegacyQueueController.java")).t("Prefetch was unsuccessful");
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) absl.d.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/playability/PlayabilityUtil", "saveAdultConfirmationForUser", 'K', "PlayabilityUtil.java")).t("Failed to store adult playability.");
                break;
            case 17:
                agke agkeVar = abvs.a;
                ((Throwable) obj).getMessage();
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
    }

    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                twu.c(6, "Failed to update delayed event PDS", th);
                break;
            case 1:
                if (!(th instanceof toe)) {
                    new toe(th);
                }
                break;
            case 2:
                twu.c(6, "Failed to update DelayedEventMetricsStore", th);
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) zyc.b.b()).j(th)).k("com/google/android/libraries/youtube/net/request/LogcatNetworkLogger", "onCacheHit", 'o', "LogcatNetworkLogger.java")).t("There was an error.");
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) aabu.a.b()).j(th)).k("com/google/android/libraries/youtube/notification/push/util/NotificationUtils", "maybeSaveLastChangedTime", (char) 128, "NotificationUtils.java")).t("Failed to save enabledness changed timestamp");
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) aabu.a.b()).j(th)).k("com/google/android/libraries/youtube/notification/push/util/NotificationUtils", "invalidateRegistration", (char) 152, "NotificationUtils.java")).t("Failed to invalidate gcm registration timestamp");
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) aaqg.h.b()).j(th)).k("com/google/android/libraries/youtube/offline/settings/DefaultOfflineSettings", "setNextAutoOfflineTimeMillis", (char) 159, "DefaultOfflineSettings.java")).t("[Offline] Failed to set next auto offline time millis at.");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) aaqg.h.b()).j(th)).k("com/google/android/libraries/youtube/offline/settings/DefaultOfflineSettings", "setHasTransfersForOfflineStore", (char) 173, "DefaultOfflineSettings.java")).t("[Offline] Failed to set hasTransfersForOffline.");
                break;
            case 8:
                ((agrc) ((agrc) aarj.a.b()).k("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController", "onErrorSyncResponse", 218, "DefaultOfflineVideoPlaybackPositionSyncController.java")).w("[Offline] OfflineVideoPlaybackPositionSyncService request failed: %s", (th instanceof toe ? (toe) th : new toe(th)).getMessage());
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) aarj.a.b()).j(th)).k("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController", "cleanUpVideoPlaybackPositions", (char) 156, "DefaultOfflineVideoPlaybackPositionSyncController.java")).t("[Offline] Error clean up offline playback position data");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) aarj.a.b()).j(th)).k("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController", "removeSingleVideoPlaybackPosition", (char) 177, "DefaultOfflineVideoPlaybackPositionSyncController.java")).t("[Offline] Error remove single offline playback position data");
                break;
            case 11:
                zvp.b(zvn.b, zvm.C, "Some error occurred when evicting player response", th);
                break;
            case 12:
                zvp.b(zvn.b, zvm.C, "Some error occurred when putting a player response into cache", th);
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) abib.a.b()).j(th)).k("com/google/android/libraries/youtube/player/features/playbackposition/PlaybackPositionStartupController", "handlePesUpdate", (char) 254, "PlaybackPositionStartupController.java")).t("Error syncing PES update to IMES for VPPE.");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) abib.a.b()).j(th)).k("com/google/android/libraries/youtube/player/features/playbackposition/PlaybackPositionStartupController", "handlePesUpdate", (char) 261, "PlaybackPositionStartupController.java")).t("Error syncing PES update to IMES for VPPE.");
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) abmo.a.b()).j(th)).k("com/google/android/libraries/youtube/player/internal/queue/LegacyQueueController", "fetchAndQueueNextVideo", (char) 183, "LegacyQueueController.java")).t("Prefetch was unsuccessful");
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) absl.d.b()).j(th)).k("com/google/android/libraries/youtube/player/playability/PlayabilityUtil", "saveAdultConfirmationForUser", 'K', "PlayabilityUtil.java")).t("Failed to store adult playability.");
                break;
            case 17:
                agke agkeVar = abvs.a;
                th.getMessage();
                break;
        }
    }
}
