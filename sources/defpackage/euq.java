package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class euq implements euh {
    private final eyl a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public euq(eyl eylVar, int i) {
        this.a = eylVar;
        this.b = i;
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private final InputStream e(URL url, int i, URL url2, Map map) throws eti {
        if (i >= 5) {
            throw new eti("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new eti("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iB = b(this.c);
                int i3 = iB / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new ffh(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new eti("Failed to obtain InputStream", b(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iB == -1) {
                        throw new eti("Http request failed", -1, null);
                    }
                    try {
                        throw new eti(this.c.getResponseMessage(), iB, null);
                    } catch (IOException e2) {
                        throw new eti("Failed to get a response message", iB, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new eti("Received empty or null redirect url", iB, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    d();
                    return e(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new eti("Bad redirect url: ".concat(String.valueOf(headerField)), iB, e3);
                }
            } catch (IOException e4) {
                throw new eti("Failed to connect or obtain data", b(this.c), e4);
            }
        } catch (IOException e5) {
            throw new eti("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.euh
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.euh
    public final void d() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        double d = ffn.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            eyl eylVar = this.a;
            if (eylVar.b == null) {
                eylVar.b = new URL(eylVar.c());
            }
            eugVar.b(e(eylVar.b, 0, null, eylVar.d()));
        } catch (IOException e) {
            eugVar.e(e);
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return 2;
    }

    @Override // defpackage.euh
    public final void gI() {
        this.e = true;
    }
}
