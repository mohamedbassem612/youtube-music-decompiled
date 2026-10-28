package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class absw implements HttpResponseInterceptor {
    @Override // org.apache.http.HttpResponseInterceptor
    public final void process(HttpResponse httpResponse, HttpContext httpContext) {
        httpResponse.setHeader("Connection", "Close");
    }
}
