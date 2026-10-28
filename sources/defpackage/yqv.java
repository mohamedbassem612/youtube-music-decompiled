package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yqv extends RequestFinishedInfo.Listener {
    private final zjk a;
    private final boolean b;
    private final hed c;

    public yqv(Executor executor, hed hedVar, zjk zjkVar, boolean z) {
        super(executor);
        zkf.d(hedVar);
        this.c = hedVar;
        this.a = zjkVar;
        this.b = z;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        UrlResponseInfo responseInfo;
        Uri uri;
        String path;
        zjk zjkVar;
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics == null || (responseInfo = requestFinishedInfo.getResponseInfo()) == null || responseInfo.getHttpStatusCode() < 200 || responseInfo.getHttpStatusCode() >= 300 || (path = (uri = Uri.parse(responseInfo.getUrl())).getPath()) == null || !path.contains("initplayback")) {
            return;
        }
        Date sendingStart = metrics.getSendingStart();
        Date requestStart = metrics.getRequestStart();
        Long ttfbMs = metrics.getTtfbMs();
        if (sendingStart == null || requestStart == null || ttfbMs == null) {
            return;
        }
        long jLongValue = ttfbMs.longValue() - (sendingStart.getTime() - requestStart.getTime());
        this.c.v(uri.getHost(), jLongValue);
        if (!this.b || (zjkVar = this.a) == null || uri.getBooleanQueryParameter("owc", false)) {
            return;
        }
        if (metrics.getSocketReused()) {
            zjkVar.aS(new yla());
        }
        zjkVar.aS(new ykf(jLongValue));
    }
}
