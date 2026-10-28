package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahuo extends UrlRequest.Callback {
    public final SettableFuture a;
    final ahuu b;
    private final Executor e;
    public final ahub d = new ahub();
    public final List c = new ArrayList();

    public ahuo(SettableFuture settableFuture, Executor executor, ahuu ahuuVar) {
        this.a = settableFuture;
        this.e = executor;
        this.b = ahuuVar;
    }

    public static final aglz b(Map map) {
        agkf agkfVar = new agkf();
        for (Map.Entry entry : map.entrySet()) {
            for (String str : (List) entry.getValue()) {
                String str2 = (String) entry.getKey();
                ahno.K(agdk.a.l(str2), "Only ASCII header keys are permitted: %s", str2);
                agkfVar.b(new ahur(str2.toLowerCase(Locale.US)), str);
            }
        }
        return agkfVar.a();
    }

    public final int a(UrlResponseInfo urlResponseInfo) {
        if ("head".equalsIgnoreCase(this.b.g)) {
            return 1;
        }
        Map allHeaders = urlResponseInfo.getAllHeaders();
        if (!allHeaders.containsKey("content-length")) {
            return 32768;
        }
        int i = Integer.parseInt((String) ((List) allHeaders.get("content-length")).get(0));
        return allHeaders.containsKey("content-encoding") ? Math.max(Math.min(i << 1, 32768), 1) : 1 + i;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.e.execute(new afjc(this, 12, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.e.execute(new agrq(this, cronetException, 10, (char[]) null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.d.a(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
        } else {
            urlRequest.read(ByteBuffer.allocateDirect(32768));
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.b.e) {
            this.c.add(str);
            urlRequest.followRedirect();
            return;
        }
        SettableFuture settableFuture = this.a;
        ahuy ahuyVar = new ahuy();
        ahuyVar.a(b(urlResponseInfo.getAllHeaders()));
        ahuyVar.b(ByteBuffer.allocateDirect(0));
        ahuyVar.d = urlResponseInfo.getHttpStatusCode();
        settableFuture.set(new aami(ahuyVar));
        urlRequest.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(a(urlResponseInfo));
        this.d.a(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.e.execute(new agrq(this, urlResponseInfo, 9, (char[]) null));
    }
}
