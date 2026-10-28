package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.media.interfaces.HttpHeader;
import com.google.android.libraries.youtube.media.interfaces.HttpMethod;
import com.google.android.libraries.youtube.media.interfaces.HttpRequest;
import com.google.android.libraries.youtube.media.interfaces.NetFetch;
import com.google.android.libraries.youtube.media.interfaces.NetFetchCallbacks;
import com.google.android.libraries.youtube.media.interfaces.NetFetchTask;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ypf extends NetFetch {
    private final String a;
    private final ypb b;
    private final xeu c;
    private final ywn d;
    private final hhb e;

    public ypf(String str, ypb ypbVar, xeu xeuVar, ywn ywnVar, hhb hhbVar) {
        this.a = str;
        this.b = ypbVar;
        this.c = xeuVar;
        this.d = ywnVar;
        this.e = hhbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x016e A[Catch: all -> 0x01fb, TryCatch #0 {all -> 0x01fb, blocks: (B:3:0x0002, B:5:0x008e, B:7:0x0094, B:9:0x009d, B:11:0x00bd, B:12:0x00d1, B:13:0x00dc, B:14:0x00df, B:60:0x01f6, B:61:0x01f9, B:23:0x00fa, B:25:0x0103, B:27:0x010a, B:28:0x0116, B:30:0x0124, B:31:0x012e, B:33:0x013b, B:34:0x0142, B:35:0x015c, B:36:0x015f, B:58:0x01f2, B:59:0x01f5, B:39:0x0166, B:41:0x016e, B:42:0x017d, B:44:0x0187, B:46:0x018b, B:47:0x01a2, B:49:0x01c1, B:51:0x01cb, B:53:0x01d3, B:55:0x01db, B:56:0x01de, B:57:0x01f1), top: B:66:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0187 A[Catch: all -> 0x01fb, TryCatch #0 {all -> 0x01fb, blocks: (B:3:0x0002, B:5:0x008e, B:7:0x0094, B:9:0x009d, B:11:0x00bd, B:12:0x00d1, B:13:0x00dc, B:14:0x00df, B:60:0x01f6, B:61:0x01f9, B:23:0x00fa, B:25:0x0103, B:27:0x010a, B:28:0x0116, B:30:0x0124, B:31:0x012e, B:33:0x013b, B:34:0x0142, B:35:0x015c, B:36:0x015f, B:58:0x01f2, B:59:0x01f5, B:39:0x0166, B:41:0x016e, B:42:0x017d, B:44:0x0187, B:46:0x018b, B:47:0x01a2, B:49:0x01c1, B:51:0x01cb, B:53:0x01d3, B:55:0x01db, B:56:0x01de, B:57:0x01f1), top: B:66:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01c1 A[Catch: all -> 0x01fb, TryCatch #0 {all -> 0x01fb, blocks: (B:3:0x0002, B:5:0x008e, B:7:0x0094, B:9:0x009d, B:11:0x00bd, B:12:0x00d1, B:13:0x00dc, B:14:0x00df, B:60:0x01f6, B:61:0x01f9, B:23:0x00fa, B:25:0x0103, B:27:0x010a, B:28:0x0116, B:30:0x0124, B:31:0x012e, B:33:0x013b, B:34:0x0142, B:35:0x015c, B:36:0x015f, B:58:0x01f2, B:59:0x01f5, B:39:0x0166, B:41:0x016e, B:42:0x017d, B:44:0x0187, B:46:0x018b, B:47:0x01a2, B:49:0x01c1, B:51:0x01cb, B:53:0x01d3, B:55:0x01db, B:56:0x01de, B:57:0x01f1), top: B:66:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d3 A[Catch: all -> 0x01fb, TryCatch #0 {all -> 0x01fb, blocks: (B:3:0x0002, B:5:0x008e, B:7:0x0094, B:9:0x009d, B:11:0x00bd, B:12:0x00d1, B:13:0x00dc, B:14:0x00df, B:60:0x01f6, B:61:0x01f9, B:23:0x00fa, B:25:0x0103, B:27:0x010a, B:28:0x0116, B:30:0x0124, B:31:0x012e, B:33:0x013b, B:34:0x0142, B:35:0x015c, B:36:0x015f, B:58:0x01f2, B:59:0x01f5, B:39:0x0166, B:41:0x016e, B:42:0x017d, B:44:0x0187, B:46:0x018b, B:47:0x01a2, B:49:0x01c1, B:51:0x01cb, B:53:0x01d3, B:55:0x01db, B:56:0x01de, B:57:0x01f1), top: B:66:0x0002 }] */
    @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
    public final NetFetchTask startFetchTask(HttpRequest httpRequest, NetFetchCallbacks netFetchCallbacks) {
        String str;
        ypm ypmVar;
        String host;
        ahnz ahnzVar;
        try {
            zkf.d(netFetchCallbacks);
            hhb hhbVar = this.e;
            String str2 = this.a;
            ypb ypbVar = this.b;
            ywn ywnVar = this.d;
            ght ghtVar = ((ghs) hhbVar.a).a;
            ype ypeVar = new ype(ghtVar.gB(), (zjr) ghtVar.gI.io(), (tfq) ghtVar.cd.io(), ghtVar.ax(), (zjx) ghtVar.hs.io(), ghtVar.Y(), ghtVar.hc, (ahnz) ghtVar.iv.io(), (hed) ghtVar.hx.io(), ghtVar.gj(), (Executor) ghtVar.hd.io(), (ScheduledExecutorService) ghtVar.u.io(), (mbc) ghtVar.l.io(), (xeu) ghtVar.aZ.io(), (vxz) ghtVar.aL.io(), str2, ypbVar, ywnVar, netFetchCallbacks);
            if (!ypeVar.c() && !ypeVar.d()) {
                int i = 1;
                if (!ypeVar.o.getAndSet(true)) {
                    ypeVar.x = httpRequest.getFollowRedirects();
                    CronetEngine cronetEngine = ypeVar.a;
                    String uri = httpRequest.getUri();
                    ypd ypdVar = ypeVar.n;
                    Executor executor = ypeVar.i;
                    UrlRequest.Builder builderNewUrlRequestBuilder = cronetEngine.newUrlRequestBuilder(uri, ypdVar, executor);
                    ArrayList headers = httpRequest.getHeaders();
                    int size = headers.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        HttpHeader httpHeader = (HttpHeader) headers.get(i2);
                        builderNewUrlRequestBuilder.addHeader(httpHeader.getKey(), httpHeader.getValue());
                    }
                    HttpMethod method = httpRequest.getMethod();
                    HttpMethod httpMethod = HttpMethod.DELETE;
                    switch (method) {
                        case DELETE:
                            str = "DELETE";
                            break;
                        case GET:
                            str = "GET";
                            break;
                        case HEAD:
                            str = "HEAD";
                            break;
                        case OPTIONS:
                            str = "OPTIONS";
                            break;
                        case PATCH:
                            str = "PATCH";
                            break;
                        case POST:
                            str = "POST";
                            break;
                        case PUT:
                            str = "PUT";
                            break;
                        case TRACE:
                            str = "TRACE";
                            break;
                        default:
                            throw new RuntimeException(null, null);
                    }
                    builderNewUrlRequestBuilder.setHttpMethod(str);
                    if (httpRequest.getBody() != null && httpRequest.getBody().length > 0) {
                        builderNewUrlRequestBuilder.setUploadDataProvider(new ypo(httpRequest.getBody()), executor);
                    }
                    zjr zjrVar = ypeVar.l;
                    vxz vxzVar = zjrVar.l;
                    if (vxzVar.m(5, 45623383L)) {
                        builderNewUrlRequestBuilder.setRequestFinishedListener(new ypc(executor, ypeVar.d));
                    }
                    vxz vxzVar2 = ypeVar.z;
                    if (vxzVar2.m(14, 45627566L)) {
                        builderNewUrlRequestBuilder.setTrafficStatsTag(tok.PLATYPUS_ASYNC_NET_FETCH_TASK.az);
                    }
                    ypeVar.v = builderNewUrlRequestBuilder.build();
                    byh byhVar = new byh();
                    byhVar.b(httpRequest.getUri());
                    HttpMethod method2 = httpRequest.getMethod();
                    switch (method2) {
                        case DELETE:
                        case OPTIONS:
                        case PATCH:
                        case PUT:
                        case TRACE:
                            throw new IllegalArgumentException("Unsupported http method: ".concat(String.valueOf(String.valueOf(method2))));
                        case GET:
                            byhVar.d = i;
                            if (vxzVar2.m(14, 45627566L)) {
                                ypp yppVarA = ypq.a();
                                yppVarA.j(tok.PLATYPUS_ASYNC_NET_FETCH_TASK);
                                byhVar.k = yppVarA.a();
                            }
                            ypeVar.w = byhVar.a();
                            ypmVar = ypeVar.g;
                            if (ypmVar != null && ypeVar.h == null) {
                                ypeVar.h = new ypj(ypeVar.w, ypeVar.j.b(), ypmVar, ypeVar.c, ypeVar.B, zjrVar.dk());
                            }
                            ypeVar.q.i(new ypa(ypeVar, 0));
                            ypeVar.v.start();
                            ypeVar.c.o();
                            if (vxzVar.m(16, 45646927L) && (host = ypeVar.w.a.getHost()) != null) {
                                ahnzVar = ypeVar.A;
                                if (!TextUtils.isEmpty(host) && host.endsWith(".googlevideo.com")) {
                                    ahnzVar.a = host;
                                }
                            }
                            break;
                        case HEAD:
                            i = 3;
                            byhVar.d = i;
                            if (vxzVar2.m(14, 45627566L)) {
                                ypp yppVarA2 = ypq.a();
                                yppVarA2.j(tok.PLATYPUS_ASYNC_NET_FETCH_TASK);
                                byhVar.k = yppVarA2.a();
                            }
                            ypeVar.w = byhVar.a();
                            ypmVar = ypeVar.g;
                            if (ypmVar != null) {
                                ypeVar.h = new ypj(ypeVar.w, ypeVar.j.b(), ypmVar, ypeVar.c, ypeVar.B, zjrVar.dk());
                            }
                            ypeVar.q.i(new ypa(ypeVar, 0));
                            ypeVar.v.start();
                            ypeVar.c.o();
                            if (vxzVar.m(16, 45646927L)) {
                                ahnzVar = ypeVar.A;
                                if (!TextUtils.isEmpty(host)) {
                                    ahnzVar.a = host;
                                }
                            }
                            break;
                        case POST:
                            i = 2;
                            byhVar.d = i;
                            if (vxzVar2.m(14, 45627566L)) {
                                ypp yppVarA3 = ypq.a();
                                yppVarA3.j(tok.PLATYPUS_ASYNC_NET_FETCH_TASK);
                                byhVar.k = yppVarA3.a();
                            }
                            ypeVar.w = byhVar.a();
                            ypmVar = ypeVar.g;
                            if (ypmVar != null) {
                                ypeVar.h = new ypj(ypeVar.w, ypeVar.j.b(), ypmVar, ypeVar.c, ypeVar.B, zjrVar.dk());
                            }
                            ypeVar.q.i(new ypa(ypeVar, 0));
                            ypeVar.v.start();
                            ypeVar.c.o();
                            if (vxzVar.m(16, 45646927L)) {
                                ahnzVar = ypeVar.A;
                                if (!TextUtils.isEmpty(host)) {
                                    ahnzVar.a = host;
                                }
                            }
                            break;
                        default:
                            throw new RuntimeException(null, null);
                    }
                }
            }
            return ypeVar;
        } catch (Throwable th) {
            yno.Q(this.c, th, "network fetcher startFetchTask");
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
    public final void onDefaultNetworkAvailable() {
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
    public final void onDefaultNetworkUnavailable() {
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
    public final void onDefaultNetworkChange(int i) {
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
    public final void onProxySettingsChange(String str, int i) {
    }
}
