package defpackage;

import com.google.research.xeno.effect.RemoteAssetManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uya implements RemoteAssetManager.FetchCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ uyb b;

    public uya(uyb uybVar, String str) {
        this.a = str;
        this.b = uybVar;
    }

    @Override // com.google.research.xeno.effect.RemoteAssetManager.FetchCallback
    public final void onCompletion(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                ((agrc) ((agrc) uyb.a.b()).k("com/google/android/libraries/youtube/creation/effects/deprecated/picker/StaticThumbnailProvider$1", "onCompletion", 140, "StaticThumbnailProvider.java")).B("Thumbnail fetch failed for remote url: %s. Error: %s", this.a, str2);
            }
        } else {
            uyb uybVar = this.b;
            if (uybVar.e) {
                return;
            }
            uybVar.b(str);
        }
    }
}
