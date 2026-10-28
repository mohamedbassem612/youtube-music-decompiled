package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class igt implements twi {
    private final /* synthetic */ int $cid;

    public /* synthetic */ igt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) igw.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/player/watchcontroller/MusicActivityWatchController", "startPlayback", (char) 356, "MusicActivityWatchController.java")).t("Failed to get don't play nma videos");
                break;
            case 1:
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) ijl.ar.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/playlist/PlaylistDetailPageFragment", "requestHashtagSuggestions", (char) 477, "PlaylistDetailPageFragment.java")).t("Error fetching proactive hashtag suggestions.");
                break;
            case 3:
                break;
            case 4:
                agrf agrfVar = iog.a;
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) ipb.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/fragment/DataSavingSettingsFragmentPeer", "logDontPlayPodcastVideoSettingClick", (char) 299, "DataSavingSettingsFragmentPeer.java")).t("Failed to get don't play podcast video setting");
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) ipo.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/fragment/PlaybackSettingsFragmentPeer", "setupCrossfadePreferences", (char) 349, "PlaybackSettingsFragmentPeer.java")).t("Failed to create crossfade preferences.");
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) iqp.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/DataSavingSettingsHelper", "setupDontPlayNmaVideosPreference", 'C', "DataSavingSettingsHelper.java")).t("Failed to get DataSavingPrefsStore");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) iqp.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/DataSavingSettingsHelper", "setupDontPlayNmaVideosPreference", 'P', "DataSavingSettingsHelper.java")).t("Failed to get don't play nma setting.");
                break;
            case 11:
                ((agrc) ((agrc) iqr.a.c()).k("com/google/android/apps/youtube/music/settings/utils/MusicBrowserConsentSettingsUtil", "setUpConsentPreference", 70, "MusicBrowserConsentSettingsUtil.java")).t("Failed to get MusicBrowserClientsPrefsStore consent state during consent preference setup.");
                break;
            case 12:
                ((agrc) ((agrc) iqr.a.c()).k("com/google/android/apps/youtube/music/settings/utils/MusicBrowserConsentSettingsUtil", "setUpConsentPreference", 89, "MusicBrowserConsentSettingsUtil.java")).t("Failed to get MusicBrowserClientsPrefsStore during consent preference update.");
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) iqv.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/MusicPlaybackPrefsStoreHelper", "addCallback", (char) 187, "MusicPlaybackPrefsStoreHelper.java")).t("Failed to get MusicPlaybackPrefsStore.");
                break;
            case 14:
                iqn iqnVar = (iqn) obj;
                if (iqnVar != null) {
                    ((ayq) iqnVar.d.io()).j(new iqi(4));
                }
                break;
            case 15:
                iqn iqnVar2 = (iqn) obj;
                if (iqnVar2 != null) {
                    ((ayq) iqnVar2.d.io()).j(new iqi(5));
                }
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) ira.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/OfflineSettingsHelper", "toggleRecentMusic", (char) 358, "OfflineSettingsHelper.java")).t("Failure to update enableSmartDownloadRecentMusic");
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) ira.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/OfflineSettingsHelper", "turnOffSmartDownloads", (char) 343, "OfflineSettingsHelper.java")).t("Failure to get MusicDownloadsPrefsStore.");
                break;
            case 18:
                iqk iqkVar = (iqk) obj;
                if (iqkVar != null) {
                    ((ayq) iqkVar.a.io()).j(new iqh(Instant.now().getEpochSecond(), 1));
                }
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) ira.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/OfflineSettingsHelper", "setupRecentMusicPreference", (char) 174, "OfflineSettingsHelper.java")).t("Failure to get MusicDownloadsPrefsStore.");
                break;
            default:
                ((agrc) ((agrc) ((agrc) ira.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/utils/OfflineSettingsHelper", "setupRecentMusicPreference", (char) 206, "OfflineSettingsHelper.java")).t("Failure to get enableSmartDownloadRecentMusic.");
                break;
        }
    }
}
