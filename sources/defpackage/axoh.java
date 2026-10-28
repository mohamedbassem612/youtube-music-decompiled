package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.AndroidInfo;
import org.chromium.base.Callback2;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axoh extends ExperimentalUrlRequest {
    public static final String a = "axoh";
    public final axof b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public final axox j;
    public final Executor k;
    public String m;
    public ReadableByteChannel n;
    public axor o;
    public String p;
    public HttpURLConnection q;
    public final axnv r;
    public final int s;
    public final axnk t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public axoa y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    public axoh(axnv axnvVar, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        axox axoxVar;
        new axjt("Cronet JavaUrlRequest#JavaUrlRequest", 0);
        this.h = z;
        this.b = new axof(this, callback, executor2);
        final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
        this.c = new axog(new Executor() { // from class: axob
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                String str4 = axoh.a;
                final int i3 = threadStatsTag;
                final boolean z4 = z3;
                final int i4 = i2;
                executor.execute(new Runnable() { // from class: axoc
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str5 = axoh.a;
                        int threadStatsTag2 = TrafficStats.getThreadStatsTag();
                        TrafficStats.setThreadStatsTag(i3);
                        Runnable runnable2 = runnable;
                        boolean z5 = z4;
                        if (z5) {
                            ThreadStatsUid.set(i4);
                        }
                        try {
                            runnable2.run();
                        } finally {
                            if (z5) {
                                ThreadStatsUid.clear();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag2);
                        }
                    }
                });
            }
        });
        this.r = axnvVar;
        this.s = axnvVar.a;
        this.t = axnvVar.b;
        this.m = str;
        this.d = str2;
        this.u = j;
        if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException("Invalid http method ".concat(str3));
        }
        this.i = str3;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i3);
            String str4 = (String) entry.getKey();
            for (int i4 = 0; i4 < str4.length(); i4++) {
                char cCharAt = str4.charAt(i4);
                if (cCharAt != ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                    switch (cCharAt) {
                        case '\'':
                        case '(':
                        case ')':
                            break;
                        default:
                            switch (cCharAt) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(cCharAt) && !Character.isWhitespace(cCharAt)) {
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
            }
            if (((String) entry.getValue()).contains("\r\n")) {
                throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
            }
            this.e.put((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider == null) {
            axoxVar = null;
        } else {
            if (!this.e.containsKey("Content-Type")) {
                throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
            }
            axoxVar = new axox(uploadDataProvider);
        }
        this.j = axoxVar;
        this.k = (executor3 == null || this.h) ? executor3 : new wh(executor3, 5);
    }

    public final void a() {
        d(new axms(this, 14), "closeResponseChannel");
    }

    public final void b(CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.g;
            i = atomicInteger.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        f();
        e();
        axof axofVar = this.b;
        axor axorVar = this.o;
        axofVar.d.a();
        atvv atvvVar = new atvv(axofVar, (UrlResponseInfo) axorVar, cronetException, 10);
        try {
            axofVar.b(atvvVar, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = axofVar.c;
            if (executor != null) {
                new axjt("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed", 0);
                executor.execute(new axmt(atvvVar, 14));
            }
        }
    }

    public final void c(Throwable th) {
        b(new axml("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f();
            e();
            axof axofVar = this.b;
            axor axorVar = this.o;
            axofVar.d.a();
            axofVar.b(new axmt(axofVar, axorVar, 16), "onCanceled");
        }
    }

    public final void d(Runnable runnable, String str) {
        new axjt("Cronet JavaUrlRequest#executeOnExecutor ".concat(str), 0);
        this.c.execute(new axmt(str, runnable, 11));
    }

    public final void e() {
        axox axoxVar = this.j;
        if (axoxVar == null || !this.z.compareAndSet(false, true)) {
            return;
        }
        try {
            this.k.execute(new axmt(this, (axoi) new axnx(axoxVar, 3), 8));
        } catch (RejectedExecutionException e) {
            Log.e("cn_".concat(String.valueOf(a)), "Exception when closing uploadDataProvider", e);
        }
    }

    public final void f() {
        d(new axms(this, 12), "fireDisconnect");
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        j(3, 1, new axms(this, 16, null));
    }

    public final void g() {
        this.l = 13;
        d(new axmt(this, (axoi) new axnx(this, 4), 7), "fireGetHeaders");
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(a.bR(i, "Switch is exhaustive: "));
        }
        this.b.b(new aesl((Object) new VersionSafeCallbacks$UrlRequestStatusListener(statusListener), i2, 7), "sendStatus");
    }

    public final void h() {
        d(new axmt(this, (axoi) new axnx(this, 2), 7), "fireOpenConnection");
    }

    public final void i(String str, Exception exc) {
        Log.e("cn_".concat(String.valueOf(a)), a.bT(str, "Exception in ", " method"), exc);
        this.x = true;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.g;
        if (atomicInteger.compareAndSet(i, i2)) {
            new axjt("Cronet JavaUrlRequest#transitionStates " + Callback2.JniHelper.b(i) + " -> " + Callback2.JniHelper.b(i2), 0);
            runnable.run();
            return;
        }
        int i3 = atomicInteger.get();
        if (i3 == 8 || i3 == 6) {
            return;
        }
        throw new IllegalStateException("Invalid state transition - expected " + Callback2.JniHelper.b(i) + " but was " + Callback2.JniHelper.b(i3));
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(final ByteBuffer byteBuffer) {
        AndroidInfo.i(byteBuffer);
        AndroidInfo.j(byteBuffer);
        j(4, 5, new axmt(this, new axoi() { // from class: axod
            @Override // defpackage.axoi
            public final void a() throws IOException {
                int i;
                axoh axohVar = this.a;
                ReadableByteChannel readableByteChannel = axohVar.n;
                ByteBuffer byteBuffer2 = byteBuffer;
                int i2 = 1;
                if (readableByteChannel != null) {
                    axohVar.v++;
                    i = readableByteChannel.read(byteBuffer2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    axof axofVar = axohVar.b;
                    axofVar.a(new axoe(axofVar, axohVar.o, byteBuffer2, i2), "onReadCompleted");
                    return;
                }
                ReadableByteChannel readableByteChannel2 = axohVar.n;
                if (readableByteChannel2 != null) {
                    readableByteChannel2.close();
                }
                if (axohVar.g.compareAndSet(5, 7)) {
                    axohVar.f();
                    axof axofVar2 = axohVar.b;
                    axofVar2.b(new axmt(axofVar2, axohVar.o, 13), "onSucceeded");
                }
            }
        }, 12));
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.r.c.incrementAndGet();
        j(0, 1, new axms(this, 13));
    }
}
