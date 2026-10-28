package defpackage;

import com.google.research.xeno.effect.AssetDownloader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zxb implements tng {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zxb(String str, AssetDownloader.DownloadCallback downloadCallback, int i) {
        this.$cid = i;
        this.b = str;
        this.a = downloadCallback;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.research.xeno.effect.AssetDownloader$DownloadCallback, java.lang.Object] */
    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        tnm tnmVar;
        if (this.$cid == 0) {
            Object obj = this.b;
            Object obj2 = this.a;
            ((zxc) obj2).b.execute(afwl.i(new yag(obj2, obj, toeVar, 12, (int[]) null)));
        } else {
            agrf agrfVar = uzb.a;
            ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/SwazzleRemoteAssetConfig", "createDownloadRequest", 112, "SwazzleRemoteAssetConfig.java")).w("Error fetching asset: %s", this.b);
            if (toeVar != null && (tnmVar = toeVar.b) != null) {
                ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/SwazzleRemoteAssetConfig", "createDownloadRequest", 114, "SwazzleRemoteAssetConfig.java")).u("Response status code: %d", tnmVar.d);
            }
            this.a.onCompletion(null, toeVar.getMessage());
        }
    }

    public /* synthetic */ zxb(zxc zxcVar, aihf aihfVar, int i) {
        this.$cid = i;
        this.a = zxcVar;
        this.b = aihfVar;
    }
}
