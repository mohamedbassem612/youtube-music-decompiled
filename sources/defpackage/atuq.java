package defpackage;

import com.google.research.xeno.effect.AssetDownloader;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atuq implements AssetDownloader {
    public final List a;
    private final ExecutorService b;

    public atuq() {
        List list = Collections.EMPTY_LIST;
        ahfi ahfiVar = new ahfi();
        ahfiVar.c("xeno-http-asset-downloader-thread-%d");
        this.b = Executors.newFixedThreadPool(10, ahfi.a(ahfiVar));
        this.a = list;
    }

    @Override // com.google.research.xeno.effect.AssetDownloader
    public final void downloadAsset(String str, AssetDownloader.DownloadCallback downloadCallback) {
        try {
            this.b.execute(new adab(this, str, downloadCallback, 20));
        } catch (RejectedExecutionException unused) {
            downloadCallback.onCompletion(null, "Asset downloader has been released");
        }
    }
}
