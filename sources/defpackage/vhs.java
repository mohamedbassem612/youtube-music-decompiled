package defpackage;

import com.google.research.xeno.effect.AssetDownloader;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhs implements AssetDownloader.DownloadCallback {
    final /* synthetic */ awuc a;
    final /* synthetic */ String b;

    public vhs(awuc awucVar, String str) {
        this.a = awucVar;
        this.b = str;
    }

    @Override // com.google.research.xeno.effect.AssetDownloader.DownloadCallback
    public final void onCompletion(String str, String str2) {
        awuc awucVar = this.a;
        if (str != null) {
            awucVar.resumeWith(str);
            return;
        }
        awucVar.resumeWith(atqp.i(new IOException("Failed to download asset from " + this.b + ": " + str2)));
    }
}
