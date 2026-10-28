package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aape extends absv {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/player/OfflineRequestHandler");
    private final mbc b;
    private final zgy c;

    public aape(mbc mbcVar, zgy zgyVar) {
        mbcVar.getClass();
        this.b = mbcVar;
        zgyVar.getClass();
        this.c = zgyVar;
    }

    @Override // defpackage.absv
    protected final void a(Uri uri, Header header, HttpResponse httpResponse) {
        abst abstVarA = abst.a(uri);
        if (abstVarA == null || uri.getQueryParameter("e") == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        String queryParameter = uri.getQueryParameter("e");
        if ((TextUtils.isEmpty(queryParameter) ? 0L : Long.parseLong(queryParameter)) < this.b.b()) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/offline/player/OfflineRequestHandler", "handle", 50, "OfflineRequestHandler.java")).t("Offline URL has expired. Not allowed to access content.");
            httpResponse.setStatusCode(403);
            return;
        }
        absu absuVarA = absu.a(header, abstVarA.d);
        zgy zgyVar = this.c;
        long j = absuVarA.a;
        long j2 = absuVarA.b;
        long j3 = abstVarA.e;
        String strBu = zik.bu(abstVarA.a, abstVarA.b, abstVarA.c, j3);
        bye byeVarA = zgyVar.a();
        byi byiVar = new byi(Uri.EMPTY, j, (j2 - j) + 1, strBu);
        try {
            try {
                byeVarA.b(byiVar);
                try {
                    byeVarA.f();
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/youtube/offline/player/OfflineRequestHandler", "handle", 'O', "OfflineRequestHandler.java")).t("IOException trying to close offline data source");
                }
                if (absuVarA.b(httpResponse)) {
                    httpResponse.setEntity(new absx(byeVarA, byiVar));
                }
            } catch (IOException unused) {
                ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/offline/player/OfflineRequestHandler", "handle", 69, "OfflineRequestHandler.java")).t("Offlined video not found on disk.");
                httpResponse.setStatusCode(404);
                try {
                    byeVarA.f();
                } catch (IOException e2) {
                    ((agrc) ((agrc) ((agrc) a.c()).j(e2)).k("com/google/android/libraries/youtube/offline/player/OfflineRequestHandler", "handle", 'O', "OfflineRequestHandler.java")).t("IOException trying to close offline data source");
                }
            }
        } catch (Throwable th) {
            try {
                byeVarA.f();
                throw th;
            } catch (IOException e3) {
                ((agrc) ((agrc) ((agrc) a.c()).j(e3)).k("com/google/android/libraries/youtube/offline/player/OfflineRequestHandler", "handle", 'O', "OfflineRequestHandler.java")).t("IOException trying to close offline data source");
                throw th;
            }
        }
    }
}
