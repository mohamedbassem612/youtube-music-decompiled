package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gdj implements gdi {
    private final String a;
    private final String b;

    public gdj(String str, String str2) {
        this.a = kro.aR(str) ? null : str.trim();
        this.b = kro.aR(str2) ? null : str2.trim();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.gdi
    public final void a(String str, Map map) throws Throwable {
        IOException e;
        MalformedURLException e2;
        String str2 = this.a;
        boolean zAR = kro.aR(str2);
        String strAQ = kro.aQ(str, map);
        String property = System.getProperty("http.agent");
        if (!zAR) {
            String str3 = this.b;
            if (!kro.aR(str3)) {
                property = String.format("%s %s/%s", property, str2, str3);
            }
        }
        ?? r3 = 0;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strAQ).openConnection();
                try {
                    httpURLConnection.setRequestProperty("User-Agent", property);
                    httpURLConnection.getResponseCode();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (MalformedURLException e3) {
                    e2 = e3;
                    kro.aS(a.ce(strAQ, "wrong url format: "));
                    throw new gdh(e2.getMessage());
                } catch (IOException e4) {
                    e = e4;
                    kro.aS("IO error");
                    throw new gdh(e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                r3 = str2;
                if (r3 != 0) {
                    r3.disconnect();
                }
                throw th;
            }
        } catch (MalformedURLException e5) {
            e2 = e5;
        } catch (IOException e6) {
            e = e6;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.disconnect();
            }
            throw th;
        }
    }
}
