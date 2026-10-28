package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iul implements tab {
    private final /* synthetic */ int $cid;

    public /* synthetic */ iul(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "detectMissingTracksAndRemoveIfAny", (char) 1076, "DefaultSideloadedStore.java")).t("Failed to remove tracks from internal db");
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "removeMissingTracksFromInternalDb", (char) 1119, "DefaultSideloadedStore.java")).t("Failed to remove tracks from internal db");
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "getAllPlaylists", (char) 365, "DefaultSideloadedStore.java")).t("Failed to log getAllPlaylists for legacy DB");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) ixd.i.b().i(agso.a, "PlaceholderDownloadCtlr")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/ui/components/carousel/MusicPlaceholderDownloadsCarouselShelfController", "setUpAdapter", (char) 172, "MusicPlaceholderDownloadsCarouselShelfController.java")).t("Failed to create carousel shelf renderer from downloaded content.");
                break;
            case 4:
                zvp.b(zvn.a, zvm.f, "Failed to store: codecNeedsSetOutputSurfaceWorkaround.", (Throwable) obj);
                break;
            case 5:
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) rky.f.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/account/command/SignInCommand", "handleAccountConfig", (char) 296, "SignInCommand.java")).t("Failed to get or create accountId");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) roe.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/account/inlineauth/ModalFirstTimeUnicornPasswordInlineAuthPresenter", "onPasswordVerifySuccess", (char) 591, "ModalFirstTimeUnicornPasswordInlineAuthPresenter.java")).t("Failed to store last password update timestamp for child");
                break;
            case 8:
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) rpw.c.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/account/signin/flow/DefaultIncognitoController", "exitIncognito", 'z', "DefaultIncognitoController.java")).t("Error exiting incognito");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) rpw.c.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/account/signin/flow/DefaultIncognitoController", "logExitIncognitoEventForSignedInIdentity", (char) 305, "DefaultIncognitoController.java")).t("Failed to clear the store.");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) rqa.n.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/account/signin/flow/DefaultSignInController", "logLoggedIn", (char) 544, "DefaultSignInController.java")).t("Failed to clear the store.");
                break;
            case 12:
                axfd.R((Throwable) obj);
                break;
            case 13:
                a((Throwable) obj);
                break;
            case 14:
                a((Throwable) obj);
                break;
            case 15:
                a((Throwable) obj);
                break;
            case 16:
                twu.c(6, "Error while updating ads schema", (Throwable) obj);
                break;
            case 17:
                sny.b((Throwable) obj);
                break;
            case 18:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "speakTextUseTts", (char) 297, "TextToSpeechController.java")).t("Failed to speak text");
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "setLanguage", (char) 253, "TextToSpeechController.java")).t("Failed to set TTS language");
                break;
            default:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "onInit", (char) 336, "TextToSpeechController.java")).t("Failed to finish TTS initialization");
                break;
        }
    }

    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).j(th)).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "detectMissingTracksAndRemoveIfAny", (char) 1076, "DefaultSideloadedStore.java")).t("Failed to remove tracks from internal db");
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).j(th)).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "removeMissingTracksFromInternalDb", (char) 1119, "DefaultSideloadedStore.java")).t("Failed to remove tracks from internal db");
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).j(th)).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "getAllPlaylists", (char) 365, "DefaultSideloadedStore.java")).t("Failed to log getAllPlaylists for legacy DB");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) ixd.i.b().i(agso.a, "PlaceholderDownloadCtlr")).j(th)).k("com/google/android/apps/youtube/music/ui/components/carousel/MusicPlaceholderDownloadsCarouselShelfController", "setUpAdapter", (char) 172, "MusicPlaceholderDownloadsCarouselShelfController.java")).t("Failed to create carousel shelf renderer from downloaded content.");
                break;
            case 4:
                zvp.b(zvn.a, zvm.f, "Failed to store: codecNeedsSetOutputSurfaceWorkaround.", th);
                break;
            case 5:
            case 8:
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) rky.f.b()).j(th)).k("com/google/android/libraries/youtube/account/command/SignInCommand", "handleAccountConfig", (char) 296, "SignInCommand.java")).t("Failed to get or create accountId");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) roe.a.b()).j(th)).k("com/google/android/libraries/youtube/account/inlineauth/ModalFirstTimeUnicornPasswordInlineAuthPresenter", "onPasswordVerifySuccess", (char) 591, "ModalFirstTimeUnicornPasswordInlineAuthPresenter.java")).t("Failed to store last password update timestamp for child");
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) rpw.c.b()).j(th)).k("com/google/android/libraries/youtube/account/signin/flow/DefaultIncognitoController", "exitIncognito", 'z', "DefaultIncognitoController.java")).t("Error exiting incognito");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) rpw.c.b()).j(th)).k("com/google/android/libraries/youtube/account/signin/flow/DefaultIncognitoController", "logExitIncognitoEventForSignedInIdentity", (char) 305, "DefaultIncognitoController.java")).t("Failed to clear the store.");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) rqa.n.b()).j(th)).k("com/google/android/libraries/youtube/account/signin/flow/DefaultSignInController", "logLoggedIn", (char) 544, "DefaultSignInController.java")).t("Failed to clear the store.");
                break;
            case 12:
                axfd.R(th);
                break;
            case 13:
                rmp.n(null, "Failed to activate DurationAfterLayoutExitedTrigger. ".concat(String.valueOf(th.getMessage())));
                break;
            case 14:
                if (!(th instanceof CancellationException)) {
                    rmp.n(null, "Failed to activate DynamicDurationAfterCacheMissTrigger. ".concat(String.valueOf(th.getMessage())));
                }
                break;
            case 15:
                rmp.n(null, "Failed to activate LayoutExitedAfterTimeoutTrigger. ".concat(String.valueOf(th.getMessage())));
                break;
            case 16:
                twu.c(6, "Error while updating ads schema", th);
                break;
            case 17:
                sny.b(th);
                break;
            case 18:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j(th)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "speakTextUseTts", (char) 297, "TextToSpeechController.java")).t("Failed to speak text");
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j(th)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "setLanguage", (char) 253, "TextToSpeechController.java")).t("Failed to set TTS language");
                break;
            default:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j(th)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "onInit", (char) 336, "TextToSpeechController.java")).t("Failed to finish TTS initialization");
                break;
        }
    }
}
