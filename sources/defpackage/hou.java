package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hou implements tab {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hou(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) how.a.b().i(agso.a, "DownloadsFaultHandler")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/compat/DownloadedEntityFaultHandler", "fetchAndCommit", (char) 192, "DownloadedEntityFaultHandler.java")).t("Failed EntityStore commit");
                break;
            case 1:
                hoo.b((Throwable) obj);
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) hsd.a.b().i(agso.a, "LegacyCascadeMusicPlayl")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "updateContainerDownloadMetadataEntity", (char) 1271, "LegacyCascadeMusicPlaylistEntityController.java")).t("Failed to update out of date playlist");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) hsd.a.b().i(agso.a, "LegacyCascadeMusicPlayl")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "maybeScheduleNextSyncNoLaterThan", (char) 450, "LegacyCascadeMusicPlaylistEntityController.java")).t("Failed to retrieve prefs store for next playlist sync.");
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) hsz.c.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/logging/MusicSmartDownloadsSyncTimesLogger", "logNextSyncTime", 'O', "MusicSmartDownloadsSyncTimesLogger.java")).t("Failed to log next sync time");
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) hsz.c.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/logging/MusicSmartDownloadsSyncTimesLogger", "logLastSyncTime", '<', "MusicSmartDownloadsSyncTimesLogger.java")).t("Failed to log last sync time");
                break;
            case 6:
                long j = hvh.a;
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) hvo.i.b().i(agso.a, "OnboardingHelper")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/onboarding/OnboardingHelper", "setHasSeenNotificationsPrompt", (char) 349, "OnboardingHelper.java")).t("Failed to set notifications seen flag.");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) hvv.a.b().i(agso.a, "ConnectionPendingDlgCtlr")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/player/ConnectionPendingDialogFragmentController$PendingDialogSession", "handleMdxChanges", (char) 315, "ConnectionPendingDialogFragmentController.java")).t("Failed to begin pending cast playback.");
                break;
            case 9:
                hxa.a((Throwable) obj);
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) hyo.a.b().i(agso.a, "PlaybackRateSelector")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/player/controls/PlaybackRateSelectionController$1", "onPlaybackRate", '_', "PlaybackRateSelectionController.java")).t("Failed to update non-music audio playback rate.");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) hyo.a.b().i(agso.a, "PlaybackRateSelector")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/player/controls/PlaybackRateSelectionController$1", "onTrimSilence", 'i', "PlaybackRateSelectionController.java")).t("Failed to update stored trim silence enabled value.");
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) iai.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/player/offline/MusicOfflinePlaybackPositionTrackingReporter", "storeLastPlaybackPosition", 'X', "MusicOfflinePlaybackPositionTrackingReporter.java")).t("Failed to determine if video is eligible for resumption during reporting.");
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) ibs.c.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/player/playbackrate/RecentlySelectedPlaybackRateChangeMonitor", "handleSkipSilenceStateChangedEvent", 'g', "RecentlySelectedPlaybackRateChangeMonitor.java")).t("Failed to persist skip silence state");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) ibs.c.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/player/playbackrate/RecentlySelectedPlaybackRateChangeMonitor", "handlePlaybackRateChangedEvent", 'Z', "RecentlySelectedPlaybackRateChangeMonitor.java")).t("Failed to persist recently selected playback rate");
                break;
            case 15:
                break;
            case 16:
                idx.j((Throwable) obj, "updatePersistentQueue");
                break;
            case 17:
                idx.j((Throwable) obj, "storeVideoList");
                break;
            case 18:
                idx.j((Throwable) obj, "storeDismissedQueue");
                break;
            case 19:
                idx.j((Throwable) obj, "storePersistentQueue");
                break;
            default:
                idx.j((Throwable) obj, "clearVideoList");
                break;
        }
    }

    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) how.a.b().i(agso.a, "DownloadsFaultHandler")).j(th)).k("com/google/android/apps/youtube/music/offline/compat/DownloadedEntityFaultHandler", "fetchAndCommit", (char) 192, "DownloadedEntityFaultHandler.java")).t("Failed EntityStore commit");
                break;
            case 1:
                hoo.b(th);
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) hsd.a.b().i(agso.a, "LegacyCascadeMusicPlayl")).j(th)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "updateContainerDownloadMetadataEntity", (char) 1271, "LegacyCascadeMusicPlaylistEntityController.java")).t("Failed to update out of date playlist");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) hsd.a.b().i(agso.a, "LegacyCascadeMusicPlayl")).j(th)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "maybeScheduleNextSyncNoLaterThan", (char) 450, "LegacyCascadeMusicPlaylistEntityController.java")).t("Failed to retrieve prefs store for next playlist sync.");
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) hsz.c.b()).j(th)).k("com/google/android/apps/youtube/music/offline/logging/MusicSmartDownloadsSyncTimesLogger", "logNextSyncTime", 'O', "MusicSmartDownloadsSyncTimesLogger.java")).t("Failed to log next sync time");
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) hsz.c.b()).j(th)).k("com/google/android/apps/youtube/music/offline/logging/MusicSmartDownloadsSyncTimesLogger", "logLastSyncTime", '<', "MusicSmartDownloadsSyncTimesLogger.java")).t("Failed to log last sync time");
                break;
            case 6:
                long j = hvh.a;
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) hvo.i.b().i(agso.a, "OnboardingHelper")).j(th)).k("com/google/android/apps/youtube/music/onboarding/OnboardingHelper", "setHasSeenNotificationsPrompt", (char) 349, "OnboardingHelper.java")).t("Failed to set notifications seen flag.");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) hvv.a.b().i(agso.a, "ConnectionPendingDlgCtlr")).j(th)).k("com/google/android/apps/youtube/music/player/ConnectionPendingDialogFragmentController$PendingDialogSession", "handleMdxChanges", (char) 315, "ConnectionPendingDialogFragmentController.java")).t("Failed to begin pending cast playback.");
                break;
            case 9:
                hxa.a(th);
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) hyo.a.b().i(agso.a, "PlaybackRateSelector")).j(th)).k("com/google/android/apps/youtube/music/player/controls/PlaybackRateSelectionController$1", "onPlaybackRate", '_', "PlaybackRateSelectionController.java")).t("Failed to update non-music audio playback rate.");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) hyo.a.b().i(agso.a, "PlaybackRateSelector")).j(th)).k("com/google/android/apps/youtube/music/player/controls/PlaybackRateSelectionController$1", "onTrimSilence", 'i', "PlaybackRateSelectionController.java")).t("Failed to update stored trim silence enabled value.");
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) iai.a.c()).j(th)).k("com/google/android/apps/youtube/music/player/offline/MusicOfflinePlaybackPositionTrackingReporter", "storeLastPlaybackPosition", 'X', "MusicOfflinePlaybackPositionTrackingReporter.java")).t("Failed to determine if video is eligible for resumption during reporting.");
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) ibs.c.c()).j(th)).k("com/google/android/apps/youtube/music/player/playbackrate/RecentlySelectedPlaybackRateChangeMonitor", "handleSkipSilenceStateChangedEvent", 'g', "RecentlySelectedPlaybackRateChangeMonitor.java")).t("Failed to persist skip silence state");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) ibs.c.c()).j(th)).k("com/google/android/apps/youtube/music/player/playbackrate/RecentlySelectedPlaybackRateChangeMonitor", "handlePlaybackRateChangedEvent", 'Z', "RecentlySelectedPlaybackRateChangeMonitor.java")).t("Failed to persist recently selected playback rate");
                break;
            case 15:
                break;
            case 16:
                idx.j(th, "updatePersistentQueue");
                break;
            case 17:
                idx.j(th, "storeVideoList");
                break;
            case 18:
                idx.j(th, "storeDismissedQueue");
                break;
            case 19:
                idx.j(th, "storePersistentQueue");
                break;
            default:
                idx.j(th, "clearVideoList");
                break;
        }
    }
}
