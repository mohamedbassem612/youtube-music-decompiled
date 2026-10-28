package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class glo implements tab {
    private final /* synthetic */ int $cid;

    public /* synthetic */ glo(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) gls.a.b().i(agso.a, "AudioPreview")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "initViews", (char) 492, "AudioPreviewPlayerActivityPeer.java")).t("Failed to get embedded picture using MediaMetadataRetriever");
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) gls.a.b().i(agso.a, "AudioPreview")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "initViews", (char) 471, "AudioPreviewPlayerActivityPeer.java")).t("Failed to get artist metadata using MediaMetadataRetriever");
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) gls.a.b().i(agso.a, "AudioPreview")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "initTitleView", (char) 539, "AudioPreviewPlayerActivityPeer.java")).t("Failed to get title metadata.");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) gpl.U.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/browse/LibraryBrowseFragment", "onLoaded", (char) 787, "LibraryBrowseFragment.java")).t("Error showing library education tooltips");
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) gsz.b.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/command/BrowseMusicLibrarySectionListReloadCommandResolver", "resolve", '>', "BrowseMusicLibrarySectionListReloadCommandResolver.java")).t("Failed to retrieve item view mode");
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) gta.b.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/command/BrowseMusicPodcastShowDownloadsSectionListReloadCommandResolver", "resolve", 'W', "BrowseMusicPodcastShowDownloadsSectionListReloadCommandResolver.java")).t("Failed to retrieve downloaded podcast episode video IDs");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) gty.d.c().i(agso.a, "GetSurveyCommandResolver")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/command/GetSurveyCommandResolver", "resolve", 'F', "GetSurveyCommandResolver.java")).t("getSurveyService onErrorResponse");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) gud.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/command/IterateCommandsCommandResolver", "resolve", 'F', "IterateCommandsCommandResolver.java")).t("getAndUpdate failed unexpectedly.");
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) gvg.b.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/command/MusicRadioBuilderSearchCommandResolver", "resolve", '/', "MusicRadioBuilderSearchCommandResolver.java")).t("Error fetching radio builder search suggestions");
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) gvy.g.b().i(agso.a, "OfflinePlaylistCmd")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/command/OfflinePlaylistCommandResolver", "resolve", 'f', "OfflinePlaylistCommandResolver.java")).t("Failure while executing OfflinePlaylistEndpoint");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) gvy.g.b().i(agso.a, "OfflinePlaylistCmd")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/command/OfflinePlaylistCommandResolver", "updateDialogImpressionCount", (char) 288, "OfflinePlaylistCommandResolver.java")).t("Encountered error while updating the confirmation dialog impression count in PDS");
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) hcw.c.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/feedback/MusicSmartDownloadsSyncTimesFeedbackFiller", "blockingFillFeedbackData", 'W', "MusicSmartDownloadsSyncTimesFeedbackFiller.java")).t("Failed to fill smart downloads sync times PSD.");
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) hfp.d.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/likes/MusicPersistedLikeStatusEntityCleaner", "maybeRemovePersistedLikeStatusEntities", 'e', "MusicPersistedLikeStatusEntityCleaner.java")).t("Failed to get persisted entities when cleaning up persisted like status entity.");
                break;
            case 17:
                Throwable th = (Throwable) obj;
                zvp.a(zvn.b, zvm.n, "MBS onPlayFromSearch SearchMediaItems failed: ".concat(String.valueOf(th != null ? th.getMessage() : "null exception")));
                break;
            case 18:
                ((agrc) ((agrc) ((agrc) hjg.e.b().i(agso.a, "PlaybackRatePlugin")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/mediabrowser/plugins/PlaybackRateMediaSessionActionPlugin", "onAction", (char) 183, "PlaybackRateMediaSessionActionPlugin.java")).t("Failed to update non-music audio playback rate.");
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) hld.b.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/notifications/MusicNotificationStateProvider", "getTimeSinceNotificationsStatusChanged", 'E', "MusicNotificationStateProvider.java")).t("Failed to save enabledness changed timestamp");
                break;
            default:
                ((agrc) ((agrc) ((agrc) hlr.a.b().i(agso.a, "OfflineFeedbackTaskRunn")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/OfflineFeedbackTaskRunner", "runTask", '^', "OfflineFeedbackTaskRunner.java")).t("Failure sending YTM InnerTube feedback");
                break;
        }
    }

    /* JADX WARN: Failed to inline method: hia.k(java.lang.Throwable):void */
    /* JADX WARN: Not passed register '(r1v18 java.lang.Throwable)' in method call: hia.k(java.lang.Throwable):void */
    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) gls.a.b().i(agso.a, "AudioPreview")).j(th)).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "initViews", (char) 492, "AudioPreviewPlayerActivityPeer.java")).t("Failed to get embedded picture using MediaMetadataRetriever");
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) gls.a.b().i(agso.a, "AudioPreview")).j(th)).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "initViews", (char) 471, "AudioPreviewPlayerActivityPeer.java")).t("Failed to get artist metadata using MediaMetadataRetriever");
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) gls.a.b().i(agso.a, "AudioPreview")).j(th)).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "initTitleView", (char) 539, "AudioPreviewPlayerActivityPeer.java")).t("Failed to get title metadata.");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) gpl.U.b()).j(th)).k("com/google/android/apps/youtube/music/browse/LibraryBrowseFragment", "onLoaded", (char) 787, "LibraryBrowseFragment.java")).t("Error showing library education tooltips");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) gsz.b.b()).j(th)).k("com/google/android/apps/youtube/music/command/BrowseMusicLibrarySectionListReloadCommandResolver", "resolve", '>', "BrowseMusicLibrarySectionListReloadCommandResolver.java")).t("Failed to retrieve item view mode");
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) gta.b.b()).j(th)).k("com/google/android/apps/youtube/music/command/BrowseMusicPodcastShowDownloadsSectionListReloadCommandResolver", "resolve", 'W', "BrowseMusicPodcastShowDownloadsSectionListReloadCommandResolver.java")).t("Failed to retrieve downloaded podcast episode video IDs");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) gty.d.c().i(agso.a, "GetSurveyCommandResolver")).j(th)).k("com/google/android/apps/youtube/music/command/GetSurveyCommandResolver", "resolve", 'F', "GetSurveyCommandResolver.java")).t("getSurveyService onErrorResponse");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) gud.a.c()).j(th)).k("com/google/android/apps/youtube/music/command/IterateCommandsCommandResolver", "resolve", 'F', "IterateCommandsCommandResolver.java")).t("getAndUpdate failed unexpectedly.");
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) gvg.b.b()).j(th)).k("com/google/android/apps/youtube/music/command/MusicRadioBuilderSearchCommandResolver", "resolve", '/', "MusicRadioBuilderSearchCommandResolver.java")).t("Error fetching radio builder search suggestions");
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) gvy.g.b().i(agso.a, "OfflinePlaylistCmd")).j(th)).k("com/google/android/apps/youtube/music/command/OfflinePlaylistCommandResolver", "resolve", 'f', "OfflinePlaylistCommandResolver.java")).t("Failure while executing OfflinePlaylistEndpoint");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) gvy.g.b().i(agso.a, "OfflinePlaylistCmd")).j(th)).k("com/google/android/apps/youtube/music/command/OfflinePlaylistCommandResolver", "updateDialogImpressionCount", (char) 288, "OfflinePlaylistCommandResolver.java")).t("Encountered error while updating the confirmation dialog impression count in PDS");
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) hcw.c.b()).j(th)).k("com/google/android/apps/youtube/music/feedback/MusicSmartDownloadsSyncTimesFeedbackFiller", "blockingFillFeedbackData", 'W', "MusicSmartDownloadsSyncTimesFeedbackFiller.java")).t("Failed to fill smart downloads sync times PSD.");
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) hfp.d.c()).j(th)).k("com/google/android/apps/youtube/music/likes/MusicPersistedLikeStatusEntityCleaner", "maybeRemovePersistedLikeStatusEntities", 'e', "MusicPersistedLikeStatusEntityCleaner.java")).t("Failed to get persisted entities when cleaning up persisted like status entity.");
                break;
            case 17:
                hia.k(th);
                break;
            case 18:
                ((agrc) ((agrc) ((agrc) hjg.e.b().i(agso.a, "PlaybackRatePlugin")).j(th)).k("com/google/android/apps/youtube/music/mediabrowser/plugins/PlaybackRateMediaSessionActionPlugin", "onAction", (char) 183, "PlaybackRateMediaSessionActionPlugin.java")).t("Failed to update non-music audio playback rate.");
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) hld.b.c()).j(th)).k("com/google/android/apps/youtube/music/notifications/MusicNotificationStateProvider", "getTimeSinceNotificationsStatusChanged", 'E', "MusicNotificationStateProvider.java")).t("Failed to save enabledness changed timestamp");
                break;
            default:
                ((agrc) ((agrc) ((agrc) hlr.a.b().i(agso.a, "OfflineFeedbackTaskRunn")).j(th)).k("com/google/android/apps/youtube/music/offline/OfflineFeedbackTaskRunner", "runTask", '^', "OfflineFeedbackTaskRunner.java")).t("Failure sending YTM InnerTube feedback");
                break;
        }
    }
}
