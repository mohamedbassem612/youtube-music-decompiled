package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyu {
    public static final /* synthetic */ int a = 0;
    private static final agfr b = aguu.al(new jxp(19));

    public static Uri a(String str) {
        return new Uri.Builder().scheme("file").path(str).build();
    }

    public static Uri b(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static Uri c(String str) {
        Uri uri = Uri.parse(k(str));
        if (uri.isAbsolute()) {
            return uri;
        }
        throw new MalformedURLException("Uri must have an absolute scheme");
    }

    public static Uri d(String str) {
        if (str == null) {
            return null;
        }
        Uri uri = Uri.parse(str);
        if (TextUtils.isEmpty(uri.getScheme())) {
            return uri.buildUpon().scheme("https").build();
        }
        if (str.contains("://") || !str.contains(":")) {
            return uri;
        }
        if (!str.startsWith("//")) {
            str = "//".concat(str);
        }
        return Uri.parse("https:".concat(str));
    }

    public static Uri e(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("v");
            return (host == null || !host.contains("youtube.com") || TextUtils.isEmpty(queryParameter)) ? uri : new Uri.Builder().scheme(uri.getScheme()).authority("youtu.be").appendPath(queryParameter).build();
        } catch (UnsupportedOperationException unused) {
            return uri;
        }
    }

    public static boolean f(Uri uri) {
        return "file".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean g(Uri uri) {
        uri.getClass();
        return "https".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean h(String str) {
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073830510)) {
                str.getClass();
                return str.length() > 5 && str.charAt(5) == ':' && str.regionMatches(true, 0, "https", 0, 5);
            }
        }
        Uri uri = Uri.parse(str);
        uri.getClass();
        return "https".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean i(Uri uri) {
        return "127.0.0.1".equals(uri.getHost()) || "localhost".equals(uri.getHost());
    }

    public static boolean j(String str) {
        if (str == null) {
            return false;
        }
        return ((Pattern) b.io()).matcher(str).find();
    }

    private static String k(String str) {
        try {
            new URI(str);
            return str;
        } catch (URISyntaxException unused) {
            Uri uri = Uri.parse(str);
            try {
                try {
                    String strEncode = Uri.encode(uri.getEncodedAuthority(), "%,;:$&+=@[]");
                    String strEncode2 = Uri.encode(uri.getEncodedPath(), "%,;:$&+=/@");
                    String string = uri.buildUpon().encodedAuthority(strEncode).encodedPath(strEncode2).encodedQuery(Uri.encode(uri.getEncodedQuery(), "%,;:$&+=/[]@?")).build().toString();
                    new URI(string);
                    return string;
                } catch (URISyntaxException unused2) {
                    String strEncode3 = Uri.encode(uri.getEncodedAuthority(), ",;:$&+=@[]");
                    String strEncode4 = Uri.encode(uri.getEncodedPath(), ",;:$&+=/@");
                    String string2 = uri.buildUpon().encodedAuthority(strEncode3).encodedPath(strEncode4).encodedQuery(Uri.encode(uri.getEncodedQuery(), ",;:$&+=/@[]?")).build().toString();
                    new URI(string2);
                    return string2;
                }
            } catch (URISyntaxException unused3) {
                return Uri.encode(str, ":/");
            }
        }
    }
}
