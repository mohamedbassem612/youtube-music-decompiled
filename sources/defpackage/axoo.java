package defpackage;

import java.util.Collection;
import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axoo extends RequestFinishedInfo {
    public final RequestFinishedInfo.Metrics a;
    private final String b;
    private final Collection c;
    private final int d;
    private final UrlResponseInfo e;
    private final CronetException f;

    public axoo(String str, Collection collection, RequestFinishedInfo.Metrics metrics, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.b = str;
        this.c = collection;
        this.a = metrics;
        this.d = i;
        this.e = urlResponseInfo;
        this.f = cronetException;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final Collection getAnnotations() {
        Collection collection = this.c;
        return collection == null ? Collections.EMPTY_LIST : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final CronetException getException() {
        return this.f;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final int getFinishedReason() {
        return this.d;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public RequestFinishedInfo.Metrics getMetrics() {
        return this.a;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final UrlResponseInfo getResponseInfo() {
        return this.e;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final String getUrl() {
        return this.b;
    }
}
