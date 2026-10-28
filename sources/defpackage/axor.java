package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axor extends UrlResponseInfo {
    public final int a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final String f;
    private final String g;
    private final AtomicLong h;
    private final axoq i;

    public axor(List list, int i, String str, List list2, boolean z, String str2, String str3, long j, boolean z2) {
        this.e = DesugarCollections.unmodifiableList(list);
        this.a = i;
        this.f = str;
        this.i = new axoq(DesugarCollections.unmodifiableList(list2));
        this.b = z;
        this.c = str2;
        this.g = str3;
        this.h = new AtomicLong(j);
        this.d = z2;
    }

    public final void a(long j) {
        this.h.set(j);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        axoq axoqVar = this.i;
        Map map = axoqVar.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : axoqVar.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), DesugarCollections.unmodifiableList(arrayList));
        }
        axoqVar.b = DesugarCollections.unmodifiableMap(treeMap);
        return axoqVar.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.i.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.f;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.g;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.h.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        List list = this.e;
        return (String) list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.e;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), getUrl(), this.e.toString(), Integer.valueOf(this.a), this.f, getAllHeadersAsList().toString(), Boolean.valueOf(this.b), this.c, this.g, Long.valueOf(this.h.get()));
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return this.b;
    }
}
