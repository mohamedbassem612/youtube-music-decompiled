package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.ProtocolException;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abti implements HttpRequestInterceptor {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/player/proxy/SignatureInterceptor");
    private final Mac b;

    public abti() throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKey secretKeyGenerateKey = KeyGenerator.getInstance("HmacSHA1").generateKey();
        Mac mac = Mac.getInstance("HmacSHA1");
        this.b = mac;
        mac.init(secretKeyGenerateKey);
    }

    public final synchronized String a(Uri uri) {
        String queryParameter;
        String queryParameter2 = uri.getQueryParameter("sparams");
        if (!TextUtils.isEmpty(queryParameter2)) {
            String encodedPath = uri.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                this.b.update(encodedPath.getBytes());
            }
            Mac mac = this.b;
            mac.update("sparams".getBytes());
            mac.update(queryParameter2.getBytes());
            for (String str : queryParameter2.split(",")) {
                if (!TextUtils.isEmpty(str) && (queryParameter = uri.getQueryParameter(str)) != null) {
                    mac.update(str.getBytes());
                    mac.update(queryParameter.getBytes());
                }
            }
            return Base64.encodeToString(mac.doFinal(), 10);
        }
        return null;
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public final void process(HttpRequest httpRequest, HttpContext httpContext) throws ProtocolException {
        Uri uri = Uri.parse(httpRequest.getRequestLine().getUri());
        String strA = a(uri);
        if (strA == null || !strA.equals(uri.getQueryParameter("sig"))) {
            ProtocolException protocolException = new ProtocolException("URL not signed correctly");
            ((agrc) ((agrc) ((agrc) a.b()).j(protocolException)).k("com/google/android/libraries/youtube/player/proxy/SignatureInterceptor", "process", 'D', "SignatureInterceptor.java")).t("URL not signed correctly");
            throw protocolException;
        }
    }
}
