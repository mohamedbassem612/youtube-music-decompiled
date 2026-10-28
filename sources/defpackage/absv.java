package defpackage;

import android.net.Uri;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class absv implements HttpRequestHandler {
    protected abstract void a(Uri uri, Header header, HttpResponse httpResponse);

    @Override // org.apache.http.protocol.HttpRequestHandler
    public final void handle(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException {
        try {
            String method = httpRequest.getRequestLine().getMethod();
            if (!tym.aF(1).equalsIgnoreCase(method)) {
                throw new MethodNotSupportedException(a.ce(method, "Method not supported: "));
            }
            a(Uri.parse(httpRequest.getRequestLine().getUri()), httpRequest.getLastHeader("Range"), httpResponse);
        } catch (RuntimeException e) {
            throw new HttpException("Internal error while handling request.", e);
        }
    }
}
