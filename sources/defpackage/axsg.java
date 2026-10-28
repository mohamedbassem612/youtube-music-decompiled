package defpackage;

import android.net.TrafficStats;
import android.os.Build;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axsg extends HttpURLConnection {
    public final axsl a;
    public UrlRequest b;
    public final axsi c;
    public axsj d;
    public UrlResponseInfo e;
    public IOException f;
    public boolean g;
    private final CronetEngine h;
    private final List i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private boolean n;
    private List o;
    private Map p;

    public axsg(URL url, CronetEngine cronetEngine) {
        super(url);
        new axjt("CronetHttpURLConnection#CronetHttpURLConnection", 0);
        this.h = cronetEngine;
        this.a = new axsl();
        this.c = new axsi(this);
        this.i = new ArrayList();
    }

    private final int g(String str) {
        int i = 0;
        while (true) {
            List list = this.i;
            if (i >= list.size()) {
                return -1;
            }
            if (((String) ((Pair) list.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
            i++;
        }
    }

    private final List h() {
        List list = this.o;
        if (list != null) {
            return list;
        }
        this.o = new ArrayList();
        for (Map.Entry entry : this.e.getAllHeadersAsList()) {
            if (!((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                this.o.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.o);
        this.o = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private final Map.Entry i(int i) {
        try {
            k();
            List listH = h();
            if (i < listH.size()) {
                return (Map.Entry) listH.get(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    private final Map j() {
        Map map = this.p;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : h()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), DesugarCollections.unmodifiableList(arrayList));
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(treeMap);
        this.p = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }

    private final void k() throws IOException {
        new axjt("CronetHttpURLConnection#getResponse", 0);
        axsj axsjVar = this.d;
        if (axsjVar != null) {
            axsjVar.b();
            this.d.close();
        }
        if (!this.n) {
            m();
            this.a.a(0);
        }
        if (!this.n) {
            throw new IllegalStateException("No response.");
        }
        IOException iOException = this.f;
        if (iOException != null) {
            throw iOException;
        }
        if (this.e == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    private final void l(String str, String str2, boolean z) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int iG = g(str);
        if (iG >= 0) {
            if (!z) {
                throw new UnsupportedOperationException(a.bT(str, "Cannot add multiple headers of the same key, ", ". crbug.com/432719."));
            }
            this.i.remove(iG);
        }
        this.i.add(Pair.create(str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    private final void m() {
        if (this.connected) {
            return;
        }
        axsj axsjVar = this.d;
        if (axsjVar == null || axsjVar.c()) {
            new axjt("CronetHttpURLConnection#startRequest", 0);
            CronetEngine cronetEngine = this.h;
            String string = getURL().toString();
            axsf axsfVar = new axsf(this);
            axsl axslVar = this.a;
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) cronetEngine.newUrlRequestBuilder(string, axsfVar, axslVar);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = "POST";
                }
                axsj axsjVar2 = this.d;
                if (axsjVar2 != null) {
                    builder.setUploadDataProvider(axsjVar2.a(), (Executor) axslVar);
                    if (getRequestProperty("Content-Length") == null && !n()) {
                        l("Content-Length", Long.toString(this.d.a().getLength()), false);
                    }
                } else if (getRequestProperty("Content-Length") == null) {
                    l("Content-Length", "0", false);
                }
                if (getRequestProperty("Content-Type") == null) {
                    l("Content-Type", "application/x-www-form-urlencoded", false);
                }
            }
            for (Pair pair : this.i) {
                builder.addHeader((String) pair.first, (String) pair.second);
            }
            if (!getUseCaches()) {
                builder.disableCache();
            }
            builder.setHttpMethod(this.method);
            if (this.j) {
                builder.setTrafficStatsTag(this.k);
            } else {
                int threadStatsTag = TrafficStats.getThreadStatsTag();
                if (threadStatsTag != -1) {
                    this.k = threadStatsTag;
                    this.j = true;
                }
                if (this.j) {
                    builder.setTrafficStatsTag(this.k);
                }
            }
            if (this.l) {
                builder.setTrafficStatsUid(this.m);
            } else if (Build.VERSION.SDK_INT >= 28) {
                int threadStatsUid = TrafficStats.getThreadStatsUid();
                if (threadStatsUid != -1) {
                    this.m = threadStatsUid;
                    this.l = true;
                }
                if (this.l) {
                    builder.setTrafficStatsUid(this.m);
                }
            }
            ExperimentalUrlRequest experimentalUrlRequestBuild = builder.build();
            this.b = experimentalUrlRequestBuild;
            experimentalUrlRequestBuild.start();
            this.connected = true;
        }
    }

    private final boolean n() {
        return this.chunkLength > 0;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        l(str, str2, false);
    }

    public final void b(int i) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
        }
        this.j = true;
        this.k = i;
    }

    @Override // java.net.URLConnection
    public final void connect() throws ProtocolException {
        getOutputStream();
        m();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.connected) {
            this.b.cancel();
        }
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            k();
            if (this.e.getHttpStatusCode() >= 400) {
                return this.c;
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            k();
            Map mapJ = j();
            if (mapJ.containsKey(str)) {
                List list = (List) mapJ.get(str);
                return (String) list.get(list.size() - 1);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map.Entry entryI = i(i);
        if (entryI == null) {
            return null;
        }
        return (String) entryI.getKey();
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            k();
            return j();
        } catch (IOException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        k();
        if (!this.instanceFollowRedirects && this.g) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.e.getHttpStatusCode() < 400) {
            return this.c;
        }
        throw new FileNotFoundException(this.url.toString());
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws ProtocolException {
        if (this.d == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (n()) {
                this.d = new axsc(this.chunkLength, this.a);
                m();
            } else {
                long j = this.fixedContentLength;
                if (this.fixedContentLengthLong != -1) {
                    j = this.fixedContentLengthLong;
                }
                if (j != -1) {
                    this.d = new axse(j, this.a);
                    m();
                } else {
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.d = new axsa(this);
                    } else {
                        this.d = new axsa(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.d;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair pair : this.i) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, DesugarCollections.unmodifiableList(arrayList));
        }
        return DesugarCollections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        int iG = g(str);
        if (iG >= 0) {
            return (String) ((Pair) this.i.get(iG)).second;
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() throws IOException {
        k();
        return this.e.getHttpStatusCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() throws IOException {
        k();
        return this.e.getHttpStatusText();
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        l(str, str2, true);
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return false;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry entryI = i(i);
        if (entryI == null) {
            return null;
        }
        return (String) entryI.getValue();
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
    }
}
