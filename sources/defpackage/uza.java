package defpackage;

import com.google.research.xeno.effect.AssetDownloader;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uza extends tmn {
    final /* synthetic */ File l;
    final /* synthetic */ AssetDownloader.DownloadCallback m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uza(String str, tng tngVar, File file, AssetDownloader.DownloadCallback downloadCallback) {
        super(1, str, tngVar);
        this.l = file;
        this.m = downloadCallback;
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        int i = tnmVar.d;
        return i == 200 ? tnx.e(tnmVar.e()) : tnx.d(new toe(a.bR(i, "Invalid status code: ")));
    }

    @Override // defpackage.tns
    public final Class ab() {
        return byte[].class;
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
        new uyz(this.l, (byte[]) obj, this.m).execute(new Void[0]);
    }
}
