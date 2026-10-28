package defpackage;

import com.google.research.xeno.effect.AssetDownloader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uyw implements AssetDownloader.DownloadCallback {
    @Override // com.google.research.xeno.effect.AssetDownloader.DownloadCallback
    public final void onCompletion(String str, String str2) {
        agrf agrfVar = uzb.a;
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/SwazzleRemoteAssetConfig", "get", 53, "SwazzleRemoteAssetConfig.java")).w("Asset fetched: %s", str);
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/SwazzleRemoteAssetConfig", "get", 54, "SwazzleRemoteAssetConfig.java")).w("Asset error: %s", str2);
    }
}
