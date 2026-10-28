package defpackage;

import android.net.Network;
import android.net.http.HttpEngine;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Callback;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axlw extends axmw {
    public static final /* synthetic */ int b = 0;
    private static boolean c;
    private static boolean d;
    public final HttpEngine a;
    private final Map e = DesugarCollections.synchronizedMap(new HashMap());

    public axlw(HttpEngine httpEngine) {
        this.a = httpEngine;
    }

    private static final Network d(long j) {
        if (j == -1) {
            return null;
        }
        return Network.fromNetworkHandle(j);
    }

    @Override // defpackage.axmw
    public final ExperimentalBidirectionalStream a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j) {
        axlr axlrVar = new axlr(callback);
        android.net.http.BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = this.a.newBidirectionalStreamBuilder(str, executor, axlrVar);
        builderNewBidirectionalStreamBuilder.setHttpMethod(str2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builderNewBidirectionalStreamBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        builderNewBidirectionalStreamBuilder.setPriority(i);
        builderNewBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(z);
        if (z2) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(i2);
        }
        if (z3) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(i3);
        }
        axls axlsVar = new axls(builderNewBidirectionalStreamBuilder.build(), this, str, collection);
        axlrVar.a = axlsVar;
        return axlsVar;
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.e.put(listener, new axow(listener));
    }

    @Override // defpackage.axmw
    public final ExperimentalUrlRequest b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) {
        axmf axmfVar = new axmf(callback);
        android.net.http.UrlRequest.Builder builderNewUrlRequestBuilder = this.a.newUrlRequestBuilder(str, executor, axmfVar);
        builderNewUrlRequestBuilder.setPriority(i);
        if (z) {
            builderNewUrlRequestBuilder.setCacheDisabled(true);
        }
        if (z3) {
            builderNewUrlRequestBuilder.setDirectExecutorAllowed(true);
        }
        if (z4) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z5) {
            builderNewUrlRequestBuilder.setTrafficStatsUid(i3);
        }
        builderNewUrlRequestBuilder.bindToNetwork(d(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i5);
            builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new axmb(uploadDataProvider), executor2);
        }
        axmh axmhVar = new axmh(builderNewUrlRequestBuilder.build(), this, str, collection, listener);
        axmfVar.b = axmhVar;
        return axmhVar;
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.a.bindToNetwork(d(j));
    }

    final void c(RequestFinishedInfo requestFinishedInfo, axow axowVar) {
        ArrayList arrayList = new ArrayList();
        Map map = this.e;
        synchronized (map) {
            arrayList.addAll(map.values());
        }
        if (axowVar != null) {
            arrayList.add(axowVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            axow axowVar2 = (axow) arrayList.get(i);
            try {
                axowVar2.getExecutor().execute(new aves((Object) axowVar2, (Object) requestFinishedInfo, 19, (byte[]) null));
            } catch (RejectedExecutionException e) {
                Log.e("cn_HttpEngineWrapper", "Exception posting task to executor", e);
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.a.createUrlStreamHandlerFactory();
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        if (!d) {
            d = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return HttpEngine.getVersionString();
    }

    @Override // defpackage.axmw, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new axmj(str, callback, executor, this);
    }

    @Override // defpackage.axmw, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new axop(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return openConnection(url);
        }
        throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.e.remove(listener);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        if (c) {
            return;
        }
        c = true;
    }

    @Override // defpackage.axmw, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new axmj(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return (URLConnection) Callback.Helper.a(new axmd(this, url, 1), IOException.class);
    }
}
