package defpackage;

import com.google.research.xeno.effect.AssetDownloader;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyx implements AssetDownloader {
    final /* synthetic */ tgg a;
    final /* synthetic */ File b;
    final /* synthetic */ vxz c;
    private final tgg d;

    public uyx(tgg tggVar, File file, vxz vxzVar) {
        this.a = tggVar;
        this.b = file;
        this.c = vxzVar;
        this.d = tggVar;
    }

    @Override // com.google.research.xeno.effect.AssetDownloader
    public final void downloadAsset(String str, AssetDownloader.DownloadCallback downloadCallback) {
        this.d.b(uzb.a(this.b, str, downloadCallback, this.c));
    }
}
