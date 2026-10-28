package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yqk implements Runnable {
    private final zgy a;
    private final Uri b;
    private final wis c;
    private final zjr d;

    public yqk(zgy zgyVar, Uri uri, wis wisVar, zjr zjrVar) {
        zkf.d(zgyVar);
        this.a = zgyVar;
        zkf.d(uri);
        this.b = uri;
        this.c = wisVar;
        this.d = zjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String authority;
        Uri uri = this.b;
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("owc", "yes").appendQueryParameter("pvi", "0").appendQueryParameter("pai", "0");
        if (this.c.io().aS() && (authority = uri.getAuthority()) != null) {
            builderAppendQueryParameter = builderAppendQueryParameter.authority(yti.a(authority));
        }
        byi byiVar = new byi(builderAppendQueryParameter.build(), 0L, -1L, null);
        if (this.d.cI()) {
            byh byhVar = new byh(byiVar);
            ypp yppVarA = ypq.a();
            yppVarA.j(tok.MEDIA_ONESIE_CONTROLLER);
            byhVar.k = yppVarA.a();
            byiVar = byhVar.a();
        }
        bye byeVarA = this.a.a();
        try {
            byeVarA.b(byiVar);
        } catch (IOException unused) {
        } finally {
            aua.d(byeVarA);
        }
    }
}
