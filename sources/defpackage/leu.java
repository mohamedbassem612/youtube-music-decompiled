package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class leu implements Runnable {
    public final let a;
    public final String b;
    final /* synthetic */ lev c;
    private final URL d;
    private final byte[] e;
    private final Map f;

    public leu(lev levVar, String str, URL url, byte[] bArr, Map map, let letVar) {
        this.c = levVar;
        kro.i(str);
        kro.l(url);
        this.d = url;
        this.e = bArr;
        this.a = letVar;
        this.b = str;
        this.f = map;
    }

    private final void a(int i, Exception exc, byte[] bArr) {
        this.c.aU().j(new ikm(this, i, exc, bArr, 3));
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        IOException e;
        byte[] bArrAz;
        this.c.M();
        try {
            URLConnection uRLConnectionOpenConnection = this.d.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.f;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.e;
                    if (bArr != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            lcx lcxVar = this.c.aT().k;
                            int length = byteArray.length;
                            lcxVar.b("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(byteArray);
                                outputStream.close();
                            } catch (IOException e2) {
                                e = e2;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e3) {
                                        this.c.aT().c.c("Error closing HTTP compressed POST connection output stream. appId", lcz.a(this.b), e3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                a(0, e, null);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e4) {
                                        this.c.aT().c.c("Error closing HTTP compressed POST connection output stream. appId", lcz.a(this.b), e4);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                a(0, null, null);
                                throw th;
                            }
                        } catch (IOException e5) {
                            this.c.aT().c.b("Failed to gzip post request content", e5);
                            throw e5;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    httpURLConnection.getHeaderFields();
                    if (responseCode == 204) {
                        bArrAz = lev.a;
                        responseCode = 204;
                    } else {
                        bArrAz = lbd.az(httpURLConnection);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    a(responseCode, null, bArrAz);
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                }
            } catch (IOException e6) {
                e = e6;
                outputStream = null;
            }
        } catch (IOException e7) {
            e = e7;
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
