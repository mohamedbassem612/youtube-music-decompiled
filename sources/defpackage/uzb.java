package defpackage;

import com.google.research.xeno.effect.AssetDownloader;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzb {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/SwazzleRemoteAssetConfig");

    public static tns a(File file, String str, AssetDownloader.DownloadCallback downloadCallback, vxz vxzVar) {
        uza uzaVar = new uza(str, new zxb(str, downloadCallback, 1), file, downloadCallback);
        if (vxzVar.m(14, 45627566L)) {
            uzaVar.B(tok.CREATION_SWAZZLE_EFFECT_REQUEST);
        }
        return uzaVar;
    }
}
