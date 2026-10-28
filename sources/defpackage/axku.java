package defpackage;

import android.net.ProxyInfo;
import android.net.Uri;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axku {
    public static final axku a = new axku("", 0, "", new String[0]);
    public final String b;
    public final int c;
    public final String d;
    public final String[] e;

    public axku(String str, int i, String str2, String[] strArr) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = strArr;
    }

    public static axku a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return null;
        }
        String host = proxyInfo.getHost();
        if (host == null) {
            host = "";
        }
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        return new axku(host, proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
    }

    public final String toString() {
        String str = this.b;
        if (!str.equals("localhost") && !str.isEmpty()) {
            str = "<redacted>";
        }
        return String.format(Locale.US, "ProxyConfig [mHost=\"%s\", mPort=%d, mPacUrl=%s]", str, Integer.valueOf(this.c), this.d == null ? "null" : "\"<redacted>\"");
    }
}
