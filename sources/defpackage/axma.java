package defpackage;

import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetMetrics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axma extends axoo {
    private static boolean b;

    static void a(axlw axlwVar, String str, Collection collection, axow axowVar, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        axlwVar.c(new axma(str, collection, new CronetMetrics(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, 0L, 0L), i, urlResponseInfo, cronetException), axowVar);
    }

    @Override // defpackage.axoo, org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!b) {
            b = true;
        }
        return this.a;
    }
}
