package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tsq implements tab {
    private final /* synthetic */ int $cid;

    public /* synthetic */ tsq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "speakSilence", (char) 232, "TextToSpeechController.java")).t("Failed to play silent utterance");
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "stop", (char) 154, "TextToSpeechController.java")).t("Failed to stop TTS");
                break;
            case 2:
                a((Throwable) obj);
                break;
            case 3:
                zvp.a(zvn.a, zvm.M, "[ShortsCreation][Android][Effect] Failed to update xeno effects state data store. Error = ".concat(String.valueOf(((Throwable) obj).getMessage())));
                break;
            case 4:
                zvp.a(zvn.a, zvm.M, "[ShortsCreation][Android][Effect] Failed to clear xeno effects state data store.");
                break;
            case 5:
                ((agrc) ((agrc) vhd.a.b()).k("com/google/android/libraries/youtube/creation/videoeffects/fragment/RecentStickerTracker", "writeRecentStickersToDataStore", 139, "RecentStickerTracker.java")).t("Error saving recent stickers to PDS");
                break;
            case 6:
                Log.e(vjq.h, "Unable to get the StateEvent for the rendered Short");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) vkl.Q.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/AddTextController", "updateSavedTextPreferences", (char) 840, "AddTextController.java")).t("Error saving sticker text style");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) vkl.Q.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/AddTextController", "init", (char) 336, "AddTextController.java")).t("Error getting ToolbeltStateManager data.");
                break;
            case 9:
                twu.c(6, "Failed to save EngagementPanelControllerInitializer state.", (Throwable) obj);
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) wiu.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/innertube/model/media/PlayerConfigModel$PlayerConfigSupplier", "set", (char) 2221, "PlayerConfigModel.java")).t("Failed to save player config proto.");
                break;
            case 11:
                wll.h("Failed to get account config controller", (Throwable) obj);
                break;
            case 12:
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) wtj.c.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/innertube/services/resolveurl/ResolveUrlService$ResolveUrlServiceRequester", "transformResponse", (char) 253, "ResolveUrlService.java")).t("Failed to save the attribution data.");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) xgf.m.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/logging/interaction/DefaultLayersInteractionLogger", "getNextVeCounter", (char) 157, "DefaultLayersInteractionLogger.java")).t("Failed to updated the client side ve counter");
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) xnp.i.b().i(agso.a, "MDX.devicemanager")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/devicemanagement/MdxDeviceStore", "updateDeviceInfo", (char) 289, "MdxDeviceStore.java")).t("Error saving devices to storage.");
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) xnp.i.b().i(agso.a, "MDX.devicemanager")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/devicemanagement/MdxDeviceStore", "updateSessionStatus", (char) 347, "MdxDeviceStore.java")).t("Error saving sessions to storage.");
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) xoq.a.b().i(agso.a, "Handoff.HandoffEndpointResolver")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/handoff/HandoffEndpointResolver", "resolve", '#', "HandoffEndpointResolver.java")).t("Fail to send HandoffService request: ");
                break;
            case 18:
                ((agrc) ((agrc) ((agrc) xto.e.c()).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/mediaroute/devicepicker/MdxDeviceManagerImpl", "disconnectRoute", (char) 286, "MdxDeviceManagerImpl.java")).t("disconnectRoute failure: ");
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) xwe.a.b().i(agso.a, "MDX.MdxModule")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/module/MdxSharedModule$SharedModule", "provideRemoteId", (char) 324, "MdxSharedModule.java")).t("Error while attempting to store the remoteId.");
                break;
            default:
                ((agrc) ((agrc) ((agrc) xwe.a.b().i(agso.a, "MDX.MdxModule")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/module/MdxSharedModule$SharedModule", "provideRemoteId", (char) 303, "MdxSharedModule.java")).t("Error while attempting to store the remoteId.");
                break;
        }
    }

    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j(th)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "speakSilence", (char) 232, "TextToSpeechController.java")).t("Failed to play silent utterance");
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) tsr.a.b()).j(th)).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "stop", (char) 154, "TextToSpeechController.java")).t("Failed to stop TTS");
                break;
            case 2:
                uql.g("Failed to construct text sticker", th);
                break;
            case 3:
                zvp.a(zvn.a, zvm.M, "[ShortsCreation][Android][Effect] Failed to update xeno effects state data store. Error = ".concat(String.valueOf(th.getMessage())));
                break;
            case 4:
                zvp.a(zvn.a, zvm.M, "[ShortsCreation][Android][Effect] Failed to clear xeno effects state data store.");
                break;
            case 5:
                ((agrc) ((agrc) vhd.a.b()).k("com/google/android/libraries/youtube/creation/videoeffects/fragment/RecentStickerTracker", "writeRecentStickersToDataStore", 139, "RecentStickerTracker.java")).t("Error saving recent stickers to PDS");
                break;
            case 6:
                Log.e(vjq.h, "Unable to get the StateEvent for the rendered Short");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) vkl.Q.b()).j(th)).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/AddTextController", "updateSavedTextPreferences", (char) 840, "AddTextController.java")).t("Error saving sticker text style");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) vkl.Q.b()).j(th)).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/AddTextController", "init", (char) 336, "AddTextController.java")).t("Error getting ToolbeltStateManager data.");
                break;
            case 9:
                twu.c(6, "Failed to save EngagementPanelControllerInitializer state.", th);
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) wiu.a.b()).j(th)).k("com/google/android/libraries/youtube/innertube/model/media/PlayerConfigModel$PlayerConfigSupplier", "set", (char) 2221, "PlayerConfigModel.java")).t("Failed to save player config proto.");
                break;
            case 11:
                wll.h("Failed to get account config controller", th);
                break;
            case 12:
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) wtj.c.b()).j(th)).k("com/google/android/libraries/youtube/innertube/services/resolveurl/ResolveUrlService$ResolveUrlServiceRequester", "transformResponse", (char) 253, "ResolveUrlService.java")).t("Failed to save the attribution data.");
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) xgf.m.b()).j(th)).k("com/google/android/libraries/youtube/logging/interaction/DefaultLayersInteractionLogger", "getNextVeCounter", (char) 157, "DefaultLayersInteractionLogger.java")).t("Failed to updated the client side ve counter");
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) xnp.i.b().i(agso.a, "MDX.devicemanager")).j(th)).k("com/google/android/libraries/youtube/mdx/devicemanagement/MdxDeviceStore", "updateDeviceInfo", (char) 289, "MdxDeviceStore.java")).t("Error saving devices to storage.");
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) xnp.i.b().i(agso.a, "MDX.devicemanager")).j(th)).k("com/google/android/libraries/youtube/mdx/devicemanagement/MdxDeviceStore", "updateSessionStatus", (char) 347, "MdxDeviceStore.java")).t("Error saving sessions to storage.");
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) xoq.a.b().i(agso.a, "Handoff.HandoffEndpointResolver")).j(th)).k("com/google/android/libraries/youtube/mdx/handoff/HandoffEndpointResolver", "resolve", '#', "HandoffEndpointResolver.java")).t("Fail to send HandoffService request: ");
                break;
            case 18:
                ((agrc) ((agrc) ((agrc) xto.e.c()).j(th)).k("com/google/android/libraries/youtube/mdx/mediaroute/devicepicker/MdxDeviceManagerImpl", "disconnectRoute", (char) 286, "MdxDeviceManagerImpl.java")).t("disconnectRoute failure: ");
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) xwe.a.b().i(agso.a, "MDX.MdxModule")).j(th)).k("com/google/android/libraries/youtube/mdx/module/MdxSharedModule$SharedModule", "provideRemoteId", (char) 324, "MdxSharedModule.java")).t("Error while attempting to store the remoteId.");
                break;
            default:
                ((agrc) ((agrc) ((agrc) xwe.a.b().i(agso.a, "MDX.MdxModule")).j(th)).k("com/google/android/libraries/youtube/mdx/module/MdxSharedModule$SharedModule", "provideRemoteId", (char) 303, "MdxSharedModule.java")).t("Error while attempting to store the remoteId.");
                break;
        }
    }
}
