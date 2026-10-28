package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cag extends UrlRequest.Callback {
    public volatile boolean a = false;
    final /* synthetic */ cah b;

    public cag(cah cahVar) {
        this.b = cahVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (this.a) {
            return;
        }
        if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
            this.b.h = new UnknownHostException();
        } else {
            this.b.h = cronetException;
        }
        this.b.j.h();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (!this.a) {
            this.b.j.h();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        String strSubstring;
        List<String> list;
        if (this.a) {
            return;
        }
        cah cahVar = this.b;
        cahVar.d.getClass();
        cahVar.e.getClass();
        byi byiVar = cahVar.f;
        byiVar.getClass();
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (byiVar.d == 2) {
            if (httpStatusCode != 307) {
                if (httpStatusCode == 308) {
                    httpStatusCode = 308;
                }
            }
            urlResponseInfo.getHttpStatusText();
            Map allHeaders = urlResponseInfo.getAllHeaders();
            int i = bwp.a;
            cahVar.h = new byv(httpStatusCode, null, allHeaders, byiVar);
            cahVar.j.h();
            return;
        }
        if (cahVar.b) {
            cahVar.r();
        }
        CookieHandler cookieHandler = CookieHandler.getDefault();
        String url = urlResponseInfo.getUrl();
        Map<String, List<String>> allHeaders2 = urlResponseInfo.getAllHeaders();
        byx.d(url, allHeaders2, cookieHandler);
        if (cookieHandler == null) {
            strSubstring = "";
        } else {
            Map<String, List<String>> map = agpn.b;
            try {
                map = cookieHandler.get(new URI(url), allHeaders2);
            } catch (Exception e) {
                bvx.f("HttpUtil", "Failed to read cookies from CookieHandler", e);
            }
            StringBuilder sb = new StringBuilder();
            if (map.containsKey("Cookie") && (list = map.get("Cookie")) != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append("; ");
                }
            }
            String string = sb.toString();
            int length = string.length();
            while (length > 0) {
                int iCodePointBefore = Character.codePointBefore(string, length);
                if (!Character.isWhitespace(iCodePointBefore)) {
                    break;
                } else {
                    length -= Character.charCount(iCodePointBefore);
                }
            }
            strSubstring = string.substring(0, length);
        }
        cah cahVar2 = this.b;
        if (!cahVar2.c || byiVar.d != 2 || httpStatusCode != 302) {
            urlRequest.followRedirect();
            return;
        }
        byi byiVarC = byiVar.c(Uri.parse(str));
        if (!TextUtils.isEmpty(strSubstring)) {
            HashMap map2 = new HashMap();
            map2.putAll(byiVar.f);
            map2.put("Cookie", strSubstring);
            byh byhVar = new byh(byiVarC);
            byhVar.f = map2;
            byiVarC = byhVar.a();
        }
        cahVar2.p();
        try {
            cahVar2.q(byiVarC);
            this.b.d.start();
        } catch (IOException e2) {
            this.b.h = e2;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.a) {
            return;
        }
        byx.d(urlResponseInfo.getUrl(), urlResponseInfo.getAllHeaders(), CookieHandler.getDefault());
        cah cahVar = this.b;
        cahVar.g = urlResponseInfo;
        cahVar.j.h();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (!this.a) {
            cah cahVar = this.b;
            cahVar.i = true;
            cahVar.j.h();
        }
    }
}
