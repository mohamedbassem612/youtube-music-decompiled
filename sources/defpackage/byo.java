package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class byo extends bxw implements byw {
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final agex f;
    private final boolean g;
    private byi h;
    private HttpURLConnection i;
    private InputStream j;
    private boolean k;
    private int l;
    private long m;
    private long n;
    private final cso o;
    private final cso p;

    public byo(String str, int i, int i2, boolean z, cso csoVar, agex agexVar, boolean z2) {
        super(true);
        this.e = str;
        this.c = i;
        this.d = i2;
        this.b = z;
        this.o = csoVar;
        this.f = agexVar;
        this.p = new cso((char[]) null);
        this.g = z2;
    }

    private final HttpURLConnection n(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.c);
        httpURLConnection.setReadTimeout(this.d);
        HashMap map2 = new HashMap();
        map2.putAll(this.o.e());
        map2.putAll(this.p.e());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strC = byx.c(j, j2);
        if (strC != null) {
            httpURLConnection.setRequestProperty("Range", strC);
        }
        String str = this.e;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(byi.e(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    private final URL o(URL url, String str, byi byiVar) throws byt {
        if (str == null) {
            throw new byt("Null location redirect", byiVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new byt("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), byiVar, 2001, 1);
            }
            if (protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.b) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e) {
                    throw new byt(e, byiVar, 2001, 1);
                }
            }
            throw new byt("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ')', byiVar, 2001, 1);
        } catch (MalformedURLException e2) {
            throw new byt(e2, byiVar, 2001, 1);
        }
    }

    private final void p() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                bvx.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:8:0x0016, B:9:0x001c, B:12:0x0028), top: B:18:0x0004 }] */
    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws byt {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.m;
            if (j != -1) {
                long j2 = j - this.n;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.j;
                    int i4 = bwp.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.n += (long) i3;
                        g(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.j;
                int i5 = bwp.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.n += (long) i3;
                    g(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            byi byiVar = this.h;
            int i6 = bwp.a;
            throw byt.jD(e, byiVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01f6 A[Catch: IOException -> 0x0220, TRY_ENTER, TryCatch #2 {IOException -> 0x0220, blocks: (B:3:0x0010, B:5:0x001a, B:7:0x0023, B:51:0x00ba, B:17:0x0064, B:128:0x01f6, B:43:0x00a3, B:48:0x00b1, B:132:0x0209, B:133:0x021f, B:6:0x001f), top: B:140:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00b9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x005c A[Catch: IOException -> 0x0205, TRY_LEAVE, TryCatch #1 {IOException -> 0x0205, blocks: (B:10:0x0045, B:12:0x0049, B:13:0x0056, B:15:0x005c), top: B:138:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    @Override // defpackage.bye
    public final long b(byi byiVar) throws byt {
        int i;
        long j;
        byo byoVar;
        HttpURLConnection httpURLConnectionN;
        int responseCode;
        String headerField;
        HttpURLConnection httpURLConnectionN2;
        URL urlO;
        long j2;
        byo byoVar2 = this;
        byoVar2.h = byiVar;
        long j3 = 0;
        byoVar2.n = 0L;
        byoVar2.m = 0L;
        i(byiVar);
        int i2 = 1;
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            URL url = new URL(byiVar.a.toString());
            int i3 = byiVar.d;
            byte[] bArr = byiVar.e;
            long j4 = byiVar.h;
            long j5 = byiVar.i;
            boolean zF = byiVar.f(1);
            int i4 = 0;
            if (byoVar2.b) {
                while (true) {
                    i = i4 + 1;
                    if (i4 <= 20) {
                        throw new byt(new NoRouteToHostException(a.bR(i, "Too many redirects: ")), byiVar, 2001, 1);
                    }
                    j = j3;
                    byoVar = this;
                    httpURLConnectionN = byoVar.n(url, i3, bArr, j4, j5, zF, false, byiVar.f);
                    responseCode = httpURLConnectionN.getResponseCode();
                    headerField = httpURLConnectionN.getHeaderField("Location");
                    if (i3 != i2) {
                        if (i3 != 3) {
                            int i5 = 2;
                            if (i3 == 2) {
                                break;
                                break;
                            }
                        } else if (responseCode == 300) {
                            if (responseCode != 301) {
                            }
                            httpURLConnectionN.disconnect();
                            urlO = byoVar.o(url, headerField, byiVar);
                        } else {
                            httpURLConnectionN.disconnect();
                            urlO = byoVar.o(url, headerField, byiVar);
                        }
                        url = urlO;
                        i4 = i;
                        j3 = j;
                        i2 = 1;
                    } else {
                        if (responseCode != 300) {
                            if (responseCode != 301) {
                            }
                        }
                        httpURLConnectionN.disconnect();
                        urlO = byoVar.o(url, headerField, byiVar);
                        url = urlO;
                        i4 = i;
                        j3 = j;
                        i2 = 1;
                    }
                }
                httpURLConnectionN2 = httpURLConnectionN;
            } else {
                try {
                    if (byoVar2.g) {
                        while (true) {
                            i = i4 + 1;
                            if (i4 <= 20) {
                                throw new byt(new NoRouteToHostException(a.bR(i, "Too many redirects: ")), byiVar, 2001, 1);
                            }
                            j = j3;
                            byoVar = this;
                            httpURLConnectionN = byoVar.n(url, i3, bArr, j4, j5, zF, false, byiVar.f);
                            responseCode = httpURLConnectionN.getResponseCode();
                            headerField = httpURLConnectionN.getHeaderField("Location");
                            if (i3 != i2) {
                                if (i3 != 3) {
                                    int i6 = 2;
                                    if (i3 == 2 || !(responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303)) {
                                        break;
                                    }
                                    httpURLConnectionN.disconnect();
                                    if (!byoVar.g || responseCode != 302) {
                                        bArr = null;
                                        i6 = 1;
                                    }
                                    urlO = byoVar.o(url, headerField, byiVar);
                                    i3 = i6;
                                } else if (responseCode == 300) {
                                    httpURLConnectionN.disconnect();
                                    urlO = byoVar.o(url, headerField, byiVar);
                                } else if (responseCode != 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308) {
                                    httpURLConnectionN.disconnect();
                                    urlO = byoVar.o(url, headerField, byiVar);
                                } else {
                                    int i7 = 2;
                                    if (i3 == 2) {
                                        break;
                                        break;
                                    }
                                }
                                url = urlO;
                                i4 = i;
                                j3 = j;
                                i2 = 1;
                            } else {
                                if (responseCode != 300) {
                                    if (responseCode != 301) {
                                    }
                                }
                                httpURLConnectionN.disconnect();
                                urlO = byoVar.o(url, headerField, byiVar);
                                url = urlO;
                                i4 = i;
                                j3 = j;
                                i2 = 1;
                            }
                        }
                        httpURLConnectionN2 = httpURLConnectionN;
                    } else {
                        httpURLConnectionN2 = byoVar2.n(url, i3, bArr, j4, j5, zF, true, byiVar.f);
                        byoVar = this;
                        j = 0;
                    }
                } catch (IOException e) {
                    e = e;
                    byoVar2 = this;
                    byoVar2.p();
                    throw byt.jD(e, byiVar, 1);
                }
            }
            byoVar.i = httpURLConnectionN2;
            byoVar.l = httpURLConnectionN2.getResponseCode();
            httpURLConnectionN2.getResponseMessage();
            int i8 = byoVar.l;
            if (i8 < 200 || i8 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionN2.getHeaderFields();
                if (byoVar.l == 416) {
                    if (byiVar.h == byx.b(httpURLConnectionN2.getHeaderField("Content-Range"))) {
                        byoVar.k = true;
                        j(byiVar);
                        long j6 = byiVar.i;
                        return j6 != -1 ? j6 : j;
                    }
                }
                InputStream errorStream = httpURLConnectionN2.getErrorStream();
                try {
                    if (errorStream != null) {
                        agyi.b(errorStream);
                    } else {
                        int i9 = bwp.a;
                    }
                } catch (IOException unused) {
                    int i10 = bwp.a;
                }
                byoVar.p();
                throw new byv(byoVar.l, byoVar.l == 416 ? new byf(2008) : null, headerFields, byiVar);
            }
            String contentType = httpURLConnectionN2.getContentType();
            agex agexVar = byoVar.f;
            if (agexVar != null && !agexVar.a(contentType)) {
                byoVar.p();
                throw new byu(contentType, byiVar);
            }
            if (byoVar.l != 206) {
                j2 = byiVar.h;
                if (j2 == j) {
                    j2 = j;
                }
            } else {
                j2 = j;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionN2.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                byoVar.m = byiVar.i;
            } else {
                long j7 = byiVar.i;
                if (j7 != -1) {
                    byoVar.m = j7;
                } else {
                    long jA = byx.a(httpURLConnectionN2.getHeaderField("Content-Length"), httpURLConnectionN2.getHeaderField("Content-Range"));
                    byoVar.m = jA != -1 ? jA - j2 : -1L;
                }
            }
            try {
                byoVar.j = httpURLConnectionN2.getInputStream();
                if (zEqualsIgnoreCase) {
                    byoVar.j = new GZIPInputStream(byoVar.j);
                }
                byoVar.k = true;
                j(byiVar);
                if (j2 != j) {
                    try {
                        byte[] bArr2 = new byte[SemanticState.Obscured];
                        while (j2 > j) {
                            int iMin = (int) Math.min(j2, 4096L);
                            InputStream inputStream = byoVar.j;
                            int i11 = bwp.a;
                            int i12 = inputStream.read(bArr2, 0, iMin);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new byt(new InterruptedIOException(), byiVar, 2000, 1);
                            }
                            if (i12 == -1) {
                                throw new byt(byiVar, 2008, 1);
                            }
                            j2 -= (long) i12;
                            byoVar.g(i12);
                        }
                    } catch (IOException e2) {
                        byoVar.p();
                        if (e2 instanceof byt) {
                            throw ((byt) e2);
                        }
                        throw new byt(e2, byiVar, 2000, 1);
                    }
                }
                return byoVar.m;
            } catch (IOException e3) {
                byoVar.p();
                throw new byt(e3, byiVar, 2000, 1);
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    @Override // defpackage.bye
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        byi byiVar = this.h;
        if (byiVar != null) {
            return byiVar.a;
        }
        return null;
    }

    @Override // defpackage.bxw, defpackage.bye
    public final Map d() {
        HttpURLConnection httpURLConnection = this.i;
        return httpURLConnection == null ? agpn.b : new byn(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.bye
    public final void f() {
        try {
            InputStream inputStream = this.j;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    byi byiVar = this.h;
                    int i = bwp.a;
                    throw new byt(e, byiVar, 2000, 3);
                }
            }
            this.j = null;
            p();
            if (this.k) {
                this.k = false;
                h();
            }
            this.i = null;
            this.h = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.j = null;
            p();
            if (this.k) {
                this.k = false;
                h();
            }
            this.i = null;
            this.h = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // defpackage.byw
    public final int k() {
        int i;
        if (this.i == null || (i = this.l) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.byw
    public final void l() {
        this.p.f();
    }

    @Override // defpackage.byw
    public final void m(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.p.g(str, str2);
    }
}
