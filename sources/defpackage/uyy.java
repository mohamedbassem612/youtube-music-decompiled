package defpackage;

import android.content.Context;
import com.google.research.xeno.effect.AssetDownloader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyy implements AssetDownloader {
    final /* synthetic */ tgg a;
    final /* synthetic */ Context b;
    final /* synthetic */ vxz c;
    private final tgg d;

    public uyy(tgg tggVar, Context context, vxz vxzVar) {
        this.a = tggVar;
        this.b = context;
        this.c = vxzVar;
        this.d = tggVar;
    }

    @Override // com.google.research.xeno.effect.AssetDownloader
    public final void downloadAsset(String str, AssetDownloader.DownloadCallback downloadCallback) {
        this.d.b(uzb.a(this.b.getCacheDir(), str, downloadCallback, this.c));
    }
}
