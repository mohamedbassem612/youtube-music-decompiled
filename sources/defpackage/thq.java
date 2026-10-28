package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class thq extends UrlRequest.Callback {
    public final thx a;
    public boolean b;
    public Object c;
    public boolean d;
    public boolean e;
    private final boolean f;
    private final tht g;
    private tia h;
    private IOException i;

    protected thq(thx thxVar, boolean z, tht thtVar) {
        this.a = thxVar;
        this.f = z;
        this.g = thtVar;
    }

    protected static /* synthetic */ Object b(UrlResponseInfo urlResponseInfo, InputStream inputStream) {
        tgn tgnVar;
        tfz tfzVar = tfz.a;
        vwt vwtVar = new vwt((byte[]) null, (short[]) null);
        vwtVar.w(urlResponseInfo.getAllHeadersAsList());
        tfz tfzVarU = vwtVar.u();
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        String httpStatusText = urlResponseInfo.getHttpStatusText();
        if (httpStatusText == null) {
            throw new NullPointerException("Null reasonPhrase");
        }
        vwt vwtVar2 = new vwt((byte[]) null, (short[]) null);
        vwtVar2.w(urlResponseInfo.getAllHeadersAsList());
        tfz tfzVarU2 = vwtVar2.u();
        String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
        if (negotiatedProtocol == null || negotiatedProtocol.isEmpty()) {
            negotiatedProtocol = "HTTP/1.1";
        }
        String str = negotiatedProtocol;
        if (inputStream != null) {
            String strA = tfzVarU.a("Content-Type");
            String strA2 = tfzVarU.a("content-encoding");
            String strA3 = "-1";
            if ((strA2 == null || "identity".equals(strA2)) && tfzVarU.a("transfer-encoding") == null) {
                strA3 = tfzVarU.a("content-length");
            }
            tgnVar = new tgn(strA, strA3);
            tgnVar.b = inputStream;
        } else {
            tgnVar = tgn.a;
        }
        return new tgo(str, httpStatusCode, httpStatusText, tfzVarU2, tgnVar);
    }

    private final void c(IOException iOException) {
        this.a.a();
        this.d = true;
        this.i = iOException;
        tia tiaVar = this.h;
        if (tiaVar != null) {
            tiaVar.a = null;
        }
    }

    public final void a() {
        IOException iOException = this.i;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a();
        c(this.e ? null : thy.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.a();
        Throwable cause = cronetException.getCause();
        IOException iOException = cronetException;
        if (cause instanceof IOException) {
            iOException = (IOException) cause;
        }
        c(iOException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.a.a();
        if (this.h == null) {
            c(new IOException());
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        try {
            if (!this.f) {
                this.a.a();
                this.c = b(urlResponseInfo, null);
                this.b = true;
                this.e = true;
                urlRequest.cancel();
                return;
            }
            tht thtVar = this.g;
            if (thtVar.c != null) {
                toh.a(str);
            }
            if (thtVar.d.l(119, 45829889L, false) && tyu.j(str)) {
                throw new tog("Open redirect blocked.");
            }
            urlRequest.followRedirect();
        } catch (IOException e) {
            c(e);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a();
        tia tiaVar = new tia(urlRequest, this);
        this.h = tiaVar;
        this.c = b(urlResponseInfo, tiaVar);
        this.b = true;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a();
        c(null);
    }
}
