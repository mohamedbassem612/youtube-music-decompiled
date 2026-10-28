package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abwu implements tab {
    private final /* synthetic */ int $cid;

    public /* synthetic */ abwu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) abww.q.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "handleSignOutEvent", (char) 379, "PlayerSettingsStore.java")).t("Failed to set caption preferences");
                break;
            case 1:
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) abww.q.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "handleSignInEvent", (char) 394, "PlayerSettingsStore.java")).t("Failed to set caption preferences");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) abww.q.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "maybeSyncCaptionsSettings", (char) 307, "PlayerSettingsStore.java")).t("Failed to sync captions settings");
                break;
            case 4:
                zvp.a(zvn.a, zvm.f, "Failed to update Volume Normalization preference.");
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) abww.q.c()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "setDefaultLoudnessTargetEnabledPreference", (char) 430, "PlayerSettingsStore.java")).t("Failed to update Default Loudness Target Enabled preference.");
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) abww.q.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "maybeSetVolumeNormalizationPreference", (char) 457, "PlayerSettingsStore.java")).t("Failed to read MediaSchema from SettingsStore");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) abzq.e.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/stats/attestation/AttestationDelayedEventDispatcher", "dispatchEvents", '|', "AttestationDelayedEventDispatcher.java")).t("Request failed for attestation challenge");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) acag.v.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/subtitles/CaptionController", "beginMonitoring", (char) 263, "CaptionController.java")).t("Failed to initialize Captions settings with OS settings.");
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) acag.v.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/subtitles/CaptionController", "setLanguagePreference", (char) 997, "CaptionController.java")).t("Failed to set caption preferences");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) acag.v.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/subtitles/CaptionController", "beginMonitoring", (char) 255, "CaptionController.java")).t("Failed to set caption preferences");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) acmk.a.c()).j((Throwable) obj)).k("com/google/android/libraries/youtube/reel/internal/endpoint/AbstractReelWatchCommand", "handlePositiveButtonClick", (char) 341, "AbstractReelWatchCommand.java")).t("disconnectRoute failure: ");
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) actr.a.c()).j((Throwable) obj)).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "startNewScreenForFirstSequenceVideo", (char) 358, "ReelPlaybackController.java")).t("Seedless sequence player future failed.");
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) aeba.c.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/rendering/ui/frequencycap/FrequencyCapController", "didShow", 'f', "FrequencyCapController.java")).t("Failed to store impression records.");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) aebx.g.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/rendering/ui/permissions/PermissionManager", "recordPermissions", (char) 362, "PermissionManager.java")).t("PermissionManager: failed to record permissions");
                break;
            case 15:
                aejo.f((Throwable) obj);
                break;
            case 16:
                aejo.g((Throwable) obj);
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) aepd.f.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/suggest/fetcher/DefaultSuggestFetcher", "fetchZeroPrefixBackground", 'u', "DefaultSuggestFetcher.java")).t("fetchZeroPrefixBackground Error:");
                break;
            default:
                ((agrc) ((agrc) ((agrc) aeqt.b.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/systemhealth/jank/PrimesJankCapturer", "stopWithTraceCollectionControl", (char) 198, "PrimesJankCapturer.java")).t("Error stopping jank measurement for scroll");
                break;
        }
    }

    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) abww.q.b()).j(th)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "handleSignOutEvent", (char) 379, "PlayerSettingsStore.java")).t("Failed to set caption preferences");
                break;
            case 1:
            case 17:
            case 18:
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) abww.q.b()).j(th)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "handleSignInEvent", (char) 394, "PlayerSettingsStore.java")).t("Failed to set caption preferences");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) abww.q.b()).j(th)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "maybeSyncCaptionsSettings", (char) 307, "PlayerSettingsStore.java")).t("Failed to sync captions settings");
                break;
            case 4:
                zvp.a(zvn.a, zvm.f, "Failed to update Volume Normalization preference.");
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) abww.q.c()).j(th)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "setDefaultLoudnessTargetEnabledPreference", (char) 430, "PlayerSettingsStore.java")).t("Failed to update Default Loudness Target Enabled preference.");
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) abww.q.b()).j(th)).k("com/google/android/libraries/youtube/player/settings/PlayerSettingsStore", "maybeSetVolumeNormalizationPreference", (char) 457, "PlayerSettingsStore.java")).t("Failed to read MediaSchema from SettingsStore");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) abzq.e.b()).j(th)).k("com/google/android/libraries/youtube/player/stats/attestation/AttestationDelayedEventDispatcher", "dispatchEvents", '|', "AttestationDelayedEventDispatcher.java")).t("Request failed for attestation challenge");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) acag.v.b()).j(th)).k("com/google/android/libraries/youtube/player/subtitles/CaptionController", "beginMonitoring", (char) 263, "CaptionController.java")).t("Failed to initialize Captions settings with OS settings.");
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) acag.v.b()).j(th)).k("com/google/android/libraries/youtube/player/subtitles/CaptionController", "setLanguagePreference", (char) 997, "CaptionController.java")).t("Failed to set caption preferences");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) acag.v.b()).j(th)).k("com/google/android/libraries/youtube/player/subtitles/CaptionController", "beginMonitoring", (char) 255, "CaptionController.java")).t("Failed to set caption preferences");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) acmk.a.c()).j(th)).k("com/google/android/libraries/youtube/reel/internal/endpoint/AbstractReelWatchCommand", "handlePositiveButtonClick", (char) 341, "AbstractReelWatchCommand.java")).t("disconnectRoute failure: ");
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) actr.a.c()).j(th)).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController", "startNewScreenForFirstSequenceVideo", (char) 358, "ReelPlaybackController.java")).t("Seedless sequence player future failed.");
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) aeba.c.b()).j(th)).k("com/google/android/libraries/youtube/rendering/ui/frequencycap/FrequencyCapController", "didShow", 'f', "FrequencyCapController.java")).t("Failed to store impression records.");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) aebx.g.b()).j(th)).k("com/google/android/libraries/youtube/rendering/ui/permissions/PermissionManager", "recordPermissions", (char) 362, "PermissionManager.java")).t("PermissionManager: failed to record permissions");
                break;
            case 15:
                aejo.f(th);
                break;
            case 16:
                aejo.g(th);
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) aepd.f.b()).j(th)).k("com/google/android/libraries/youtube/suggest/fetcher/DefaultSuggestFetcher", "fetchZeroPrefixBackground", 'u', "DefaultSuggestFetcher.java")).t("fetchZeroPrefixBackground Error:");
                break;
            default:
                ((agrc) ((agrc) ((agrc) aeqt.b.b()).j(th)).k("com/google/android/libraries/youtube/systemhealth/jank/PrimesJankCapturer", "stopWithTraceCollectionControl", (char) 198, "PrimesJankCapturer.java")).t("Error stopping jank measurement for scroll");
                break;
        }
    }
}
