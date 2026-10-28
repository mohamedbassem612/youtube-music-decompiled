package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ldd implements Runnable {
    final /* synthetic */ lde a;
    private final URL b;
    private final byte[] c;
    private final ldb d;
    private final String e;
    private final Map f;

    public ldd(lde ldeVar, String str, URL url, byte[] bArr, Map map, ldb ldbVar) {
        this.a = ldeVar;
        kro.i(str);
        kro.l(url);
        this.b = url;
        this.c = bArr;
        this.d = ldbVar;
        this.e = str;
        this.f = map;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        int i2;
        HttpURLConnection httpURLConnection2;
        Map<String, List<String>> map2;
        IOException iOException;
        ?? r0;
        byte[] bArr;
        IOException iOException2;
        int i3;
        Map<String, List<String>> headerFields;
        lde ldeVar = this.a;
        ldeVar.M();
        int responseCode = 0;
        OutputStream outputStream = null;
        try {
            URLConnection uRLConnectionOpenConnection = this.b.openConnection();
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
                Map map3 = this.f;
                if (map3 != null) {
                    for (Map.Entry entry : map3.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr2 = this.c;
                if (bArr2 != null) {
                    byte[] bArrN = ldeVar.u().N(bArr2);
                    lcx lcxVar = ldeVar.aT().k;
                    int length = bArrN.length;
                    lcxVar.b("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrN);
                        outputStream2.close();
                        responseCode = httpURLConnection.getResponseCode();
                        headerFields = httpURLConnection.getHeaderFields();
                        try {
                            byte[] bArrAz = lbd.az(httpURLConnection);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            iOException2 = null;
                            map2 = headerFields;
                            bArr = bArrAz;
                            i3 = responseCode;
                        } catch (IOException e) {
                            map2 = headerFields;
                            httpURLConnection2 = httpURLConnection;
                            i2 = responseCode;
                            iOException = e;
                            r0 = 0;
                            if (r0 != 0) {
                                try {
                                    r0.close();
                                } catch (IOException e2) {
                                    this.a.aT().c.c("Error closing HTTP compressed POST connection output stream. appId", lcz.a(this.e), e2);
                                }
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            bArr = null;
                            i3 = i2;
                            iOException2 = iOException;
                        } catch (Throwable th) {
                            th = th;
                            i = responseCode;
                            map = headerFields;
                            Throwable th2 = th;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e3) {
                                    this.a.aT().c.c("Error closing HTTP compressed POST connection output stream. appId", lcz.a(this.e), e3);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.a.aU().j(new ldc(this.e, this.d, i, null, null, map));
                            throw th2;
                        }
                    } catch (IOException e4) {
                        iOException = e4;
                        r0 = outputStream2;
                        httpURLConnection2 = httpURLConnection;
                        i2 = 0;
                        map2 = null;
                        if (r0 != 0) {
                            r0.close();
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        bArr = null;
                        i3 = i2;
                        iOException2 = iOException;
                        this.a.aU().j(new ldc(this.e, this.d, i3, iOException2, bArr, map2));
                    } catch (Throwable th3) {
                        th = th3;
                        i = 0;
                        map = null;
                        outputStream = outputStream2;
                        Throwable th4 = th;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.a.aU().j(new ldc(this.e, this.d, i, null, null, map));
                        throw th4;
                    }
                } else {
                    responseCode = httpURLConnection.getResponseCode();
                    headerFields = httpURLConnection.getHeaderFields();
                    byte[] bArrAz2 = lbd.az(httpURLConnection);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    iOException2 = null;
                    map2 = headerFields;
                    bArr = bArrAz2;
                    i3 = responseCode;
                }
            } catch (IOException e5) {
                e = e5;
                map2 = null;
                httpURLConnection2 = httpURLConnection;
                i2 = responseCode;
                iOException = e;
                r0 = map2;
                if (r0 != 0) {
                    r0.close();
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                bArr = null;
                i3 = i2;
                iOException2 = iOException;
                this.a.aU().j(new ldc(this.e, this.d, i3, iOException2, bArr, map2));
            } catch (Throwable th5) {
                th = th5;
                i = responseCode;
                map = null;
            }
            this.a.aU().j(new ldc(this.e, this.d, i3, iOException2, bArr, map2));
        } catch (IOException e6) {
            e = e6;
            i2 = 0;
            httpURLConnection2 = null;
            map2 = null;
        } catch (Throwable th6) {
            th = th6;
            i = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}
