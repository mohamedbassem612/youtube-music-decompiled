package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import com.google.research.xeno.effect.AssetDownloader;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hqd implements aheh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public hqd(AssetDownloader.DownloadCallback downloadCallback, Uri uri, String str, int i) {
        this.$cid = i;
        this.a = downloadCallback;
        this.c = uri;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r9v14, types: [com.google.research.xeno.effect.AssetDownloader$DownloadCallback, java.lang.Object] */
    @Override // defpackage.aheh
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                String str = ((aahm) this.b).a;
                ?? r0 = this.a;
                ((hqg) this.c).m(r0, str);
                hqg.o(r0);
                break;
            case 1:
                Object obj = this.b;
                ?? r1 = this.a;
                ((hqg) this.c).g(r1, (aamj) obj);
                hqg.o(r1);
                break;
            case 2:
                Object obj2 = this.b;
                ((hsn) this.c).e(this.a, (allr) obj2, agpn.b);
                break;
            case 3:
                try {
                    ((hvb) this.a).a((aofh) this.b, agpi.a);
                } catch (aaob e) {
                    ((agrc) ((agrc) ((agrc) hvb.a.b().i(agso.a, "Offline")).j(e)).k("com/google/android/apps/youtube/music/offline/sync/implementation/MusicPlaylistSyncTask$1", "onFailure", 255, "MusicPlaylistSyncTask.java")).w("Couldn't refresh playlist through orchestration: %s", ((huu) this.c).a);
                    return;
                }
                break;
            case 4:
                onb.g(th, "%s: Download Future failed", "DownloaderImp");
                ((syn) ((syn) this.b).c).r(((oka) this.c).a);
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) uyk.a.b()).j(th)).k("com/google/android/libraries/youtube/creation/effects/innertube/DataPushRemoteAssetConfig$DataPushAssetDownloader$1", "onFailure", 152, "DataPushRemoteAssetConfig.java")).w("DataPush download failed %s.", this.b);
                this.a.onCompletion(null, th.getMessage());
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) xxd.a.b().i(agso.a, "MDX.player.director")).j(th)).k("com/google/android/libraries/youtube/mdx/player/MdxDirector$2", "onFailure", (char) 1469, "MdxDirector.java")).t("Failed to get ad player response");
                ((xxd) this.a).v((xyw) this.b, null, (smk) this.c);
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) actr.a.c()).j(th)).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackController$1", "onFailure", (char) 377, "ReelPlaybackController.java")).t("Failed to get the first seedless sequence video.");
                break;
            default:
                WebView webView = ((aehd) this.a).i;
                if (webView != null) {
                    webView.loadUrl((String) this.b);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r5v23, types: [com.google.research.xeno.effect.AssetDownloader$DownloadCallback, java.lang.Object] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        switch (this.$cid) {
            case 0:
                String str = ((aahm) this.b).a;
                ?? r0 = this.a;
                ((hqg) this.c).m(r0, str);
                hqg.o(r0);
                break;
            case 1:
                Object obj2 = this.b;
                ?? r1 = this.a;
                ((hqg) this.c).g(r1, (aamj) obj2);
                hqg.o(r1);
                break;
            case 2:
                agkj agkjVar = (agkj) Collection.EL.stream((List) obj).collect(aghu.a(new hrn(9), new hrn(10)));
                Object obj3 = this.b;
                ((hsn) this.c).e(this.a, (allr) obj3, agkjVar);
                break;
            case 3:
                agke agkeVar = (agke) obj;
                try {
                    ((hvb) this.a).a((aofh) this.b, agkeVar);
                } catch (aaob e) {
                    ((agrc) ((agrc) ((agrc) hvb.a.b().i(agso.a, "Offline")).j(e)).k("com/google/android/apps/youtube/music/offline/sync/implementation/MusicPlaylistSyncTask$1", "onSuccess", 244, "MusicPlaylistSyncTask.java")).w("Couldn't refresh playlist through orchestration: %s", ((huu) this.c).a);
                    return;
                }
                break;
            case 4:
                ((syn) ((syn) this.b).c).r(((oka) this.c).a);
                break;
            case 5:
                this.a.onCompletion(((Uri) this.c).getPath(), null);
                break;
            case 6:
                Object obj4 = this.c;
                Object obj5 = this.b;
                ((xxd) this.a).v((xyw) obj5, (wjf) obj, (smk) obj4);
                break;
            case 7:
                Optional optional = (Optional) obj;
                hmr hmrVar = new hmr(this, (acqz) this.c, (String) this.b, 7);
                if (true == optional.isPresent()) {
                    Object obj6 = optional.get();
                    Object obj7 = hmrVar.b;
                    Object obj8 = hmrVar.a;
                    Object obj9 = hmrVar.c;
                    Optional optionalOf = Optional.of(obj8);
                    ((actr) ((hqd) obj7).a).c(optionalOf, (ajwo) obj6, (String) obj9);
                }
                break;
            default:
                aehd aehdVar = (aehd) this.a;
                ((aegh) aehdVar.a.io()).p((aegg) obj, aehdVar.m, (dvo) this.c);
                aehdVar.f((String) this.b);
                break;
        }
    }

    public hqd(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }

    public hqd(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj2;
        this.c = obj3;
        this.a = obj;
    }

    public hqd(Object obj, Object obj2, String str, int i) {
        this.$cid = i;
        this.c = obj2;
        this.b = str;
        this.a = obj;
    }

    public hqd(syn synVar, oob oobVar, oka okaVar, int i) {
        this.$cid = i;
        this.a = oobVar;
        this.c = okaVar;
        this.b = synVar;
    }
}
