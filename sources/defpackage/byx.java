package defpackage;

import android.text.TextUtils;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byx {
    private static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String str, String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                bvx.c("HttpUtil", a.bU((byte) 93, str, "Unexpected Content-Length ["));
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j2 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j3 = (j2 - Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j3;
            }
            if (j == j3) {
                return j;
            }
            bvx.e("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + ']');
            return Math.max(j, j3);
        } catch (NumberFormatException unused2) {
            bvx.c("HttpUtil", a.bU((byte) 93, str2, "Unexpected Content-Range ["));
            return j;
        }
    }

    public static long b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = b.matcher(str);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                return Long.parseLong(strGroup);
            }
        }
        return -1L;
    }

    public static String c(long j, long j2) {
        if (j == 0) {
            if (j2 == -1) {
                return null;
            }
            j = 0;
        }
        StringBuilder sb = new StringBuilder("bytes=");
        sb.append(j);
        sb.append('-');
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static void d(String str, Map map, CookieHandler cookieHandler) {
        if (cookieHandler != null) {
            try {
                cookieHandler.put(new URI(str), map);
            } catch (Exception e) {
                bvx.f("HttpUtil", "Failed to store cookies in CookieHandler", e);
            }
        }
    }
}
