package defpackage;

import android.util.Log;
import android.widget.Toast;
import com.google.android.apps.youtube.music.R;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class roc implements tab {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ roc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            case 2:
                a((Throwable) obj);
                break;
            case 3:
                a((Throwable) obj);
                break;
            case 4:
                a((Throwable) obj);
                break;
            case 5:
                a((Throwable) obj);
                break;
            case 6:
                a((Throwable) obj);
                break;
            case 7:
                a((Throwable) obj);
                break;
            case 8:
                a((Throwable) obj);
                break;
            case 9:
                a((Throwable) obj);
                break;
            case 10:
                a((Throwable) obj);
                break;
            case 11:
                a((Throwable) obj);
                break;
            case 12:
                a((Throwable) obj);
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
                a((Throwable) obj);
                break;
            case 17:
                a((Throwable) obj);
                break;
            case 18:
                a((Throwable) obj);
                break;
            case 19:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, suw] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, tns] */
    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        toe toeVar;
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) roe.a.b()).j(th)).k("com/google/android/libraries/youtube/account/inlineauth/ModalFirstTimeUnicornPasswordInlineAuthPresenter", "sendSignInNotificationFeedback", (char) 720, "ModalFirstTimeUnicornPasswordInlineAuthPresenter.java")).t("Failed to get delegated unicorn sign in email sent status");
                ((roe) this.a).o.set(false);
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) roe.a.b()).j(th)).k("com/google/android/libraries/youtube/account/inlineauth/ModalFirstTimeUnicornPasswordInlineAuthPresenter", "sendSignInNotificationFeedback", (char) 736, "ModalFirstTimeUnicornPasswordInlineAuthPresenter.java")).t("Failed to send sign-in notification feedback");
                ((roe) this.a).o.set(false);
                break;
            case 2:
                ((rom) this.a).b.j(1);
                break;
            case 3:
                this.a.jj((toe) th);
                break;
            case 4:
                swe sweVar = (swe) this.a;
                arox aroxVar = (arox) sweVar.h;
                if (!aroxVar.i) {
                    ((sud) sweVar.a).i();
                }
                ?? r0 = sweVar.e;
                r0.d(r0.b(th));
                ?? r1 = sweVar.g;
                if (r1 != 0) {
                    if (th != null) {
                    } else {
                        new toe();
                    }
                    r1.a();
                }
                sweVar.a(4);
                ?? r12 = sweVar.f;
                ajwn ajwnVar = aroxVar.k;
                if (ajwnVar == null) {
                    ajwnVar = ajwn.a;
                }
                nsh.f(r12, ajwnVar);
                break;
            case 5:
                sve sveVar = (sve) this.a;
                ((sud) sveVar.f).i();
                sveVar.e.e(th);
                break;
            case 6:
                ?? r13 = this.a;
                if (!r13.D()) {
                    if (th != null) {
                        toeVar = th instanceof toe ? (toe) th : null;
                        if (toeVar == null) {
                            toeVar = new toe(th);
                        }
                    } else {
                        toeVar = new toe("Unknown error");
                    }
                    r13.y(toeVar);
                }
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) uql.a.b()).j(th)).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController", "deleteSticker", (char) 929, "MediaEngineEffectsController.java")).w("Failed to delete the asset %s", ((File) this.a).getAbsolutePath());
                break;
            case 8:
                if (th == null) {
                    zvp.a(zvn.b, zvm.M, "[ShortsCreation][Android][Effect]Failed to retrieve effect asset.");
                } else {
                    zvp.b(zvn.b, zvm.M, "[ShortsCreation][Android][Effect]Failed to retrieve effect asset.", th);
                }
                ((yhi) this.a).d(th);
                break;
            case 9:
                yno.fO(((vbk) this.a).b, "XenoAssetRetrieverImpl parallelDataFetching failed: ", th);
                ((agrc) ((agrc) ((agrc) vbk.a.b()).j(th)).k("com/google/android/libraries/youtube/creation/effects/selection/innertube/XenoAssetRetrieverImpl", "retrieveXenoAssets", '|', "XenoAssetRetrieverImpl.java")).t("XenoAssetRetrieverImpl parallelDataFetching failed");
                break;
            case 10:
                yno.fO(((vbk) this.a).b, "XenoAssetRetrieverImpl getAsset failed: ", th);
                ((agrc) ((agrc) ((agrc) vbk.a.b()).j(th)).k("com/google/android/libraries/youtube/creation/effects/selection/innertube/XenoAssetRetrieverImpl", "retrieveXenoAssets", (char) 131, "XenoAssetRetrieverImpl.java")).t("XenoAssetRetrieverImpl getAsset failed");
                break;
            case 11:
                ((vcl) this.a).g("[MediaGeneration][Android] Failed to retrieve prompts.");
                break;
            case 12:
                ((vcl) this.a).h("aa");
                break;
            case 13:
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                zvjVarA.j = 16;
                zvjVarA.d("[ShortsCreation][Android][Camera]Failed to load green screen media thumbnail");
                zvjVarA.f(th);
                ((vda) this.a).m.a(zvjVarA.a());
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) vhc.p.b()).j(th)).k("com/google/android/libraries/youtube/creation/videoeffects/fragment/MultiPageStickerCatalogFragment", "onStickerError", (char) 529, "MultiPageStickerCatalogFragment.java")).t("Failed to get multi page sticker");
                cf activity = ((vhc) this.a).getActivity();
                if (activity != null) {
                    Toast.makeText(activity, R.string.common_error_generic_user_friendly, 1).show();
                }
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) vhi.a.b()).j(th)).k("com/google/android/libraries/youtube/creation/videoeffects/fragment/StickerClickHandler", "deleteTextAssetFile", 110, "StickerClickHandler.java")).w("Failed to delete text asset: %s", this.a);
                break;
            case 16:
                Log.w(vjh.a, "finalize edit is unsuccessful because of exception");
                zvp.b(zvn.b, zvm.m, "InteractiveStickerCreation [BaseInteractiveStickerController] finalizeEdit failed", th);
                ((vjj) this.a).h(th);
                break;
            case 17:
                Log.w(vjh.a, "finalize edit is unsuccessful because of exception");
                zvp.b(zvn.b, zvm.m, "InteractiveStickerCreation [BaseInteractiveStickerController] finalizeEdit failed", th);
                ((vjj) this.a).h(th);
                break;
            case 18:
                ((vta) this.a).g(th);
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) vwb.a.b()).j(th)).k("com/google/android/libraries/youtube/innertube/attestation/DelayedAttestationChallengeController", "sendAttestationChallengeServiceRequest", 'd', "DelayedAttestationChallengeController.java")).t("Request to get attestation challenge failed.");
                yno.eX(2, ((vwb) this.a).g, yno.eJ(th));
                break;
            default:
                ((agrc) ((agrc) ((agrc) vwb.a.b()).j(th)).k("com/google/android/libraries/youtube/innertube/attestation/DelayedAttestationChallengeController", "sendLogAttestationServiceRequest", (char) 175, "DelayedAttestationChallengeController.java")).t("LogAttestationRequest failed with error.");
                yno.eW(7, ((vwb) this.a).g);
                break;
        }
    }
}
