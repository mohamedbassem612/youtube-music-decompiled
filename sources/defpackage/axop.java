package defpackage;

import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.base.AndroidInfo;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axop extends ExperimentalUrlRequest.Builder {
    private final axmw a;
    private final String b;
    private final UrlRequest.Callback c;
    private final Executor d;
    private String e;
    private boolean g;
    private boolean h;
    private Collection j;
    private UploadDataProvider k;
    private Executor l;
    private boolean m;
    private boolean n;
    private int o;
    private boolean p;
    private int q;
    private RequestFinishedInfo.Listener r;
    private byte[] s;
    private ByteBuffer t;
    private final ArrayList f = new ArrayList();
    private int i = 3;
    private String u = "";
    private long v = -1;
    private int w = 0;

    public axop(String str, UrlRequest.Callback callback, Executor executor, axmw axmwVar) {
        str.getClass();
        this.b = str;
        callback.getClass();
        this.c = callback;
        executor.getClass();
        this.d = executor;
        this.a = axmwVar;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if ("Accept-Encoding".equalsIgnoreCase(str)) {
            return;
        }
        this.f.add(new AbstractMap.SimpleEntry(str, str2));
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        b(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder allowDirectExecutor() {
        c();
        return this;
    }

    public final void b(Object obj) {
        obj.getClass();
        if (this.j == null) {
            this.j = new ArrayList();
        }
        this.j.add(obj);
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder bindToNetwork(long j) {
        this.v = j;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest build() {
        int i = this.i;
        Collection collection = this.j;
        boolean z = this.g;
        boolean z2 = this.h;
        boolean z3 = this.m;
        boolean z4 = this.n;
        int i2 = this.o;
        boolean z5 = this.p;
        int i3 = this.q;
        RequestFinishedInfo.Listener listener = this.r;
        int i4 = this.w;
        long j = this.v;
        String str = this.e;
        if (str == null) {
            str = "GET";
        }
        String str2 = str;
        UploadDataProvider uploadDataProvider = this.k;
        Executor executor = this.l;
        byte[] bArr = this.s;
        ByteBuffer byteBuffer = this.t;
        String str3 = this.u;
        return this.a.b(this.b, this.c, this.d, i, collection, z, z2, z3, z4, i2, z5, i3, listener, i4, j, str2, this.f, uploadDataProvider, executor, bArr, byteBuffer, str3);
    }

    public final void c() {
        this.m = true;
    }

    public final void d() {
        this.g = true;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder disableCache() {
        d();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder disableConnectionMigration() {
        this.h = true;
        return this;
    }

    public final void e(int i) {
        this.n = true;
        this.o = i;
    }

    public final void f(int i) {
        this.p = true;
        this.q = i;
    }

    public final void g(UploadDataProvider uploadDataProvider, Executor executor) {
        uploadDataProvider.getClass();
        this.k = uploadDataProvider;
        executor.getClass();
        this.l = executor;
        if (this.e == null) {
            this.e = "POST";
        }
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        str.getClass();
        this.e = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setIdempotency(int i) {
        this.w = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setPriority(int i) {
        this.i = i;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setRawCompressionDictionary(byte[] bArr, ByteBuffer byteBuffer, String str) {
        bArr.getClass();
        this.s = bArr;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("SHA-256 hashes are supposed to be 32 bytes");
        }
        byteBuffer.getClass();
        this.t = byteBuffer;
        AndroidInfo.i(byteBuffer);
        str.getClass();
        this.u = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        e(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        f(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        g(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder setPriority(int i) {
        this.i = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder addRequestAnnotation(Object obj) {
        b(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder allowDirectExecutor() {
        c();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder disableCache() {
        d();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setTrafficStatsTag(int i) {
        e(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setTrafficStatsUid(int i) {
        f(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        g(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setHttpMethod(String str) {
        setHttpMethod(str);
        return this;
    }
}
