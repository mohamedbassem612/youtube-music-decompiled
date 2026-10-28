package defpackage;

import com.google.android.libraries.blocks.runtime.RuntimeSignal;
import com.google.cardboard.sdk.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gou implements tab {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gou(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
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

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r13v42, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r14v82, types: [java.lang.Object, vxe] */
    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((gms) this.a).j((hej) this.b, th);
                break;
            case 1:
                ((agad) this.b).a((RuntimeSignal) this.a);
                break;
            case 2:
                ((gms) this.a).j((hej) this.b, th);
                break;
            case 3:
                isi isiVar = ((grf) this.a).P;
                if (isiVar != null) {
                    hej hejVar = (hej) this.b;
                    isiVar.n(hejVar.f, hejVar.n);
                }
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) hgk.a.c().i(agso.a, "MusicBrowserCtlr")).j(th)).k("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserController", "onLoadChildren", 649, "MusicBrowserController.java")).w("Failed to query MBS user consent state: %s", this.b);
                ((hjn) this.a).c(null, null);
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) hgk.a.c().i(agso.a, "MusicBrowserCtlr")).j(th)).k("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserController", "onSearch", 781, "MusicBrowserController.java")).w("Failed to query MBS user consent state: %s", this.b);
                ((hjo) this.a).b(null);
                break;
            case 6:
                agrc agrcVar = (agrc) ((agrc) ((agrc) hgs.a.c().i(agso.a, "MediaSessionCallback")).j(th)).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback", "onCommandGetConsentStatus", 329, "MusicMediaSessionCallback.java");
                hgr hgrVar = (hgr) this.a;
                hjy hjyVar = hgrVar.d;
                agrcVar.w("Failed to query MBS user consent state for callingPackage: '%s'", hjyVar.b);
                hgrVar.b(((hgs) this.b).a("error", hjyVar));
                break;
            case 7:
                ((his) this.a).d((amzs) this.b, agpr.a);
                break;
            case 8:
                ((hit) this.a).e((amzv) this.b, agpr.a);
                break;
            case 9:
                ((hit) this.a).e((amzv) this.b, agpr.a);
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) hnl.a.b()).j(th)).k("com/google/android/apps/youtube/music/offline/appsearch/service/DownloadsSearchService", "sendContinuationRequest", (char) 182, "DownloadsSearchService.java")).t("Unable to query for Downloaded content");
                this.b.jj(new toe(th));
                ((hnl) this.a).f(124923);
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) hot.ae.b().i(agso.a, "OfflinePlDetailFragment")).j(th)).k("com/google/android/apps/youtube/music/offline/browse/OfflinePlaylistDetailPageFragment", "initiateBrowseResponseStreamProcessing", (char) 204, "OfflinePlaylistDetailPageFragment.java")).t("Error within onErrorCallback");
                ((hot) this.a).I((Throwable) this.b);
                break;
            case 12:
                taq.z(th);
                ((agrc) ((agrc) icl.a.b().i(agso.a, "PlaybackQueueContReq")).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueContinuationRequester", "sendContinuationRequest", R.styleable.AppCompatTheme_windowNoTitle, "MusicPlaybackQueueContinuationRequester.java")).t("Error sending continuation response.");
                icl iclVar = (icl) this.a;
                if (this.b == iclVar.c) {
                    iclVar.c = null;
                    icj icjVar = iclVar.d;
                    if (icjVar != null) {
                        icjVar.h.kk(Boolean.FALSE);
                    }
                }
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) iqg.a.b()).j(th)).k("com/google/android/apps/youtube/music/settings/store/MusicBrowserClientsPrefsStore", "updateUserConsentStatus", 65, "MusicBrowserClientsPrefsStore.java")).B("Failed to persist MBS consent for packageName: '%s' with consentState: '%s'", this.b, ((ailn) this.a).name());
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) itu.a.b()).j(th)).k("com/google/android/apps/youtube/music/sideloaded/service/SideloadedPlaylistService", "handleUnexpectedEditPlaylistError", (char) 374, "SideloadedPlaylistService.java")).t("Error updating playlists");
                this.b.iT(null, new toe(((itu) this.a).b.getString(com.google.android.apps.youtube.music.R.string.sideloaded_playlist_edit_error)));
                break;
            case 15:
                rjz rjzVar = (rjz) this.a;
                rjx rjxVar = rjzVar.a;
                if (rjxVar != null) {
                    rjxVar.a((String) this.b, 3);
                    rjzVar.b();
                }
                break;
            case 16:
                Object obj = ((xte) this.a).f;
                if (((cc) obj).isAdded()) {
                    ((sud) obj).i();
                }
                yhi yhiVar = (yhi) this.b;
                aldt aldtVar = (aldt) yhiVar.b;
                akal akalVar = aldtVar.c;
                if (akalVar == null) {
                    akalVar = akal.a;
                }
                ajwn ajwnVar = akalVar.d;
                if (ajwnVar == null) {
                    ajwnVar = ajwn.a;
                }
                if ((ajwnVar.b & 4) == 0) {
                    ((stz) yhiVar.a).c.c.c(com.google.android.apps.youtube.music.R.string.payment_error_generic);
                }
                Object obj2 = yhiVar.a;
                akal akalVar2 = aldtVar.c;
                if (akalVar2 == null) {
                    akalVar2 = akal.a;
                }
                ajwn ajwnVar2 = akalVar2.d;
                if (ajwnVar2 == null) {
                    ajwnVar2 = ajwn.a;
                }
                nsh.f(((stz) obj2).c.a, ajwnVar2);
                break;
            case 17:
                sxc sxcVar = (sxc) this.a;
                sud sudVar = sxcVar.a;
                if (sudVar.isAdded()) {
                    sudVar.i();
                }
                akaj akajVar = (akaj) this.b;
                if ((akajVar.c & 16) == 0) {
                    sxcVar.d.e(th);
                } else {
                    ?? r14 = sxcVar.b;
                    ajwo ajwoVar = akajVar.i;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    r14.a(ajwoVar);
                }
                break;
            case 18:
                uxj uxjVar = (uxj) this.b;
                uxjVar.a();
                if (((vxz) uxjVar.o.b).m(147, 45430642L)) {
                    uxjVar.f(null);
                }
                Object obj3 = this.a;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 23;
                zvjVarA.d("[ShortsCreation][Android][GetShortsCreation]Failed to make GetShortsCreation request: ".concat(String.valueOf(th.getMessage())));
                ((uxh) obj3).c.a(zvjVarA.a());
                break;
            case 19:
                Object obj4 = this.b;
                Object obj5 = this.a;
                if (!(th instanceof vct)) {
                    ((vcl) obj5).f(th, "Failed to create user media.", true == ((ascu) obj4).e ? com.google.android.apps.youtube.music.R.string.media_generation_generic_error : 0);
                } else {
                    ((vcl) obj5).f(th, "No post id returned from CreateUserMedia.", true == ((ascu) obj4).e ? com.google.android.apps.youtube.music.R.string.media_generation_input_image_check_failure : 0);
                }
                break;
            default:
                ((wvv) this.a).g.remove(this.b);
                break;
        }
    }

    public /* synthetic */ gou(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
