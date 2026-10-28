package org.chromium.net.impl;

import android.os.Process;
import android.util.Log;
import defpackage.a;
import defpackage.aesl;
import defpackage.afii;
import defpackage.ahvk;
import defpackage.atvv;
import defpackage.axjt;
import defpackage.axkv;
import defpackage.axml;
import defpackage.axms;
import defpackage.axmz;
import defpackage.axni;
import defpackage.axnk;
import defpackage.axnn;
import defpackage.axok;
import defpackage.axol;
import defpackage.axon;
import defpackage.axoo;
import defpackage.axor;
import defpackage.axow;
import defpackage.axoy;
import internal.J.N;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.AndroidInfo;
import org.chromium.net.AndroidNetworkLibrary;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class CronetUrlRequest extends ExperimentalUrlRequest {
    private final byte[] A;
    private final ByteBuffer B;
    private final String C;
    private final long D;
    private final axnk E;
    private int F;
    private CronetMetrics G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private boolean L;
    private axnn M;
    public long a;
    public boolean b;
    public boolean c;
    public final Object d = new Object();
    public final CronetUrlRequestContext e;
    public final axoy f;
    public final CronetUploadDataStream g;
    public axor h;
    public CronetException i;
    private final boolean j;
    private boolean k;
    private final Executor l;
    private final List m;
    private final String n;
    private final int o;
    private final int p;
    private final String q;
    private final List r;
    private final Collection s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final int w;
    private final boolean x;
    private final int y;
    private final axow z;

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    public CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, UrlRequest.Callback callback, Executor executor, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) {
        int i5;
        ArrayList arrayList2 = new ArrayList();
        this.m = arrayList2;
        str3.getClass();
        this.j = z3;
        this.e = cronetUrlRequestContext;
        this.E = cronetUrlRequestContext.f;
        this.n = str;
        arrayList2.add(str);
        int i6 = 2;
        if (i == 0) {
            i5 = 1;
        } else if (i != 1) {
            i5 = 3;
            if (i != 2) {
                i5 = (i == 3 || i != 4) ? 4 : 5;
            }
        } else {
            i5 = 2;
        }
        this.o = i5;
        this.f = new axoy(callback);
        this.l = executor;
        this.s = collection;
        this.t = z;
        this.u = z2;
        this.v = z4;
        this.w = i2;
        this.x = z5;
        this.y = i3;
        this.z = listener != null ? new axow(listener) : null;
        this.A = bArr;
        this.B = byteBuffer;
        this.C = str3;
        if (i4 == 0) {
            i6 = 0;
        } else if (i4 == 1) {
            i6 = 1;
        } else if (i4 != 2) {
            i6 = 0;
        }
        this.p = i6;
        this.D = j;
        this.q = str2;
        this.r = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.g = uploadDataProvider != null ? new CronetUploadDataStream(uploadDataProvider, executor2, this) : null;
    }

    private final axor i(int i, String str, String[] strArr, boolean z, String str2, String str3, long j, boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new axor(new ArrayList(this.m), i, str, arrayList, z, str2, str3, j, z2);
    }

    private final void j(CronetException cronetException) {
        synchronized (this.d) {
            if (h()) {
                return;
            }
            this.i = cronetException;
            b(1);
        }
    }

    private final void k(Runnable runnable, String str) {
        new axjt("CronetUrlRequest#postTaskToExecutor ".concat(str), 0);
        try {
            this.l.execute(new afii(str, runnable, 10));
        } catch (RejectedExecutionException e) {
            Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception posting task to executor", e);
            j(new axmz("Exception posting task to executor", e));
        }
    }

    private final void onCanceled() {
        if (this.G == null) {
            this.G = new CronetMetrics(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, 0L, 0L);
        }
        k(new axms(this, 8, null), "onCanceled");
    }

    private final void onError(int i, int i2, int i3, int i4, String str, long j) {
        axor axorVar = this.h;
        if (axorVar != null) {
            axorVar.a(j);
        }
        if (i == 10 || i3 != 0) {
            j(new axon("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2, i3, i4));
            return;
        }
        switch (i) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            default:
                Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), a.bR(i, "Unknown error code: "));
                break;
        }
        j(new axol("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2));
    }

    private final void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, boolean z2, boolean z3) {
        if (this.G != null) {
            throw new IllegalStateException("Metrics collection should only happen once.");
        }
        this.G = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
        this.H = z2;
        this.I = z3;
    }

    private final void onNativeAdapterDestroyed() {
        new axjt("CronetUrlRequest#onNativeAdapterDestroyed", 0);
        synchronized (this.d) {
            if (this.i == null) {
                return;
            }
            if (this.G == null) {
                this.G = new CronetMetrics(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, 0L, 0L);
            }
            axms axmsVar = new axms(this, 9, null);
            new axjt("CronetUrlRequest#onNativeAdapterDestroyed scheduling callback", 0);
            try {
                this.l.execute(axmsVar);
            } catch (RejectedExecutionException e) {
                Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception posting task to executor", e);
            }
        }
    }

    private final void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.h.a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            j(new axmz("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.M == null) {
            this.M = new axnn(this, 0);
        }
        axnn axnnVar = this.M;
        axnnVar.a = byteBuffer;
        k(axnnVar, "onReadCompleted");
    }

    private final void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        List list = this.m;
        axor axorVarI = i(i, str2, strArr, z, str3, str4, j, false);
        list.add(str);
        k(new atvv(this, axorVarI, str, 6), "onRedirectReceived");
    }

    private final void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j, boolean z2) {
        this.h = i(i, str, strArr, z, str2, str3, j, z2);
        k(new ahvk(this, 6, null), "onResponseStarted");
    }

    private final void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        k(new aesl(versionSafeCallbacks$UrlRequestStatusListener, i, 6), "onStatus");
    }

    private final void onSucceeded(long j) {
        this.h.a(j);
        k(new ahvk(this, 7, null), "onSucceeded");
    }

    public final void a() {
        if (this.j) {
            return;
        }
        if (Thread.currentThread() == this.e.d) {
            throw new InlineExecutionProhibitedException();
        }
    }

    public final void b(int i) {
        this.F = i;
        if (this.a != 0) {
            this.e.d();
            N.M4znfYdB(this.a, i == 2);
            this.a = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144 A[Catch: RuntimeException -> 0x0197, all -> 0x01cd, TryCatch #0 {RuntimeException -> 0x0197, blocks: (B:5:0x0011, B:7:0x001b, B:9:0x0023, B:11:0x0029, B:13:0x003d, B:34:0x00a4, B:40:0x00c0, B:42:0x00c8, B:44:0x00d0, B:46:0x00ef, B:48:0x00f6, B:57:0x0125, B:61:0x014c, B:60:0x0144, B:50:0x0103, B:52:0x0107, B:45:0x00eb, B:39:0x00b6, B:18:0x0054, B:33:0x009b, B:22:0x005d, B:23:0x0063, B:25:0x0069, B:27:0x0077, B:29:0x0083, B:31:0x008b, B:12:0x0037), top: B:73:0x0011, outer: #1 }] */
    public final void c() {
        Map allHeaders;
        String str;
        boolean z;
        int i;
        long length;
        boolean z2;
        long jMax;
        long j;
        long jE;
        long jMax2;
        int i2;
        int i3;
        int i4;
        int i5;
        CronetUploadDataStream cronetUploadDataStream;
        int i6;
        axkv axkvVar = new axkv(new ahvk(this, 4));
        try {
            if (this.G == null) {
                throw new IllegalStateException("The metrics should have been initialized.");
            }
            try {
                axnk axnkVar = this.E;
                long j2 = this.e.e;
                axor axorVar = this.h;
                Boolean boolValueOf = axorVar != null ? Boolean.valueOf(axorVar.d) : null;
                axor axorVar2 = this.h;
                if (axorVar2 != null) {
                    allHeaders = axorVar2.getAllHeaders();
                    axor axorVar3 = this.h;
                    str = axorVar3.c;
                    int i7 = axorVar3.a;
                    z = axorVar3.b;
                    i = i7;
                } else {
                    allHeaders = Collections.EMPTY_MAP;
                    str = "";
                    z = false;
                    i = 0;
                }
                String str2 = str;
                long jLongValue = this.G.b.longValue();
                if (z && jLongValue == 0) {
                    z2 = z;
                    j = 0;
                    jMax = 0;
                } else {
                    List<Map.Entry> list = this.r;
                    if (list == null) {
                        length = 0;
                    } else {
                        length = 0;
                        for (Map.Entry entry : list) {
                            String str3 = (String) entry.getKey();
                            if (str3 != null) {
                                length += (long) str3.length();
                            }
                            if (((String) entry.getValue()) != null) {
                                length += (long) ((String) entry.getValue()).length();
                            }
                            z = z;
                        }
                    }
                    z2 = z;
                    jMax = Math.max(0L, jLongValue - length);
                    j = length;
                }
                long jLongValue2 = this.G.c.longValue();
                if (z2 && jLongValue2 == 0) {
                    jMax2 = 0;
                    jE = 0;
                } else {
                    jE = AndroidNetworkLibrary.e(allHeaders);
                    jMax2 = Math.max(0L, jLongValue2 - jE);
                }
                Duration durationOfSeconds = (this.G.getRequestStart() == null || this.G.getRequestEnd() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.G.getRequestEnd().getTime() - this.G.getRequestStart().getTime());
                CronetException cronetException = this.i;
                if (!(cronetException instanceof axol)) {
                    if (cronetException instanceof axon) {
                        axon axonVar = (axon) cronetException;
                        int cronetInternalErrorCode = axonVar.getCronetInternalErrorCode();
                        int i8 = axonVar.a;
                        i5 = axonVar.b;
                        i3 = cronetInternalErrorCode;
                        i4 = i8;
                    } else {
                        i2 = cronetException != null ? 3 : 1;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    }
                    boolean z3 = this.H;
                    boolean z4 = this.I;
                    int iF = AndroidNetworkLibrary.f(this.F);
                    int i9 = this.K;
                    int i10 = this.J;
                    cronetUploadDataStream = this.g;
                    if (cronetUploadDataStream == null) {
                        i6 = 0;
                    } else {
                        i6 = cronetUploadDataStream.f.get();
                    }
                    axnkVar.g(j2, new axni(j, jMax, jE, jMax2, i, durationOfSeconds, str2, z3, z4, iF, i9, i10, i6, false, this.L, Process.myUid(), i3, i4, i5, i2, this.G.a, axok.q, this.G.b(), this.G.c(), this.G.a(), this.G.e(), this.G.d(), boolValueOf, false));
                    this.e.g(new axoo(this.n, this.s, this.G, this.F, this.h, this.i), axkvVar, this.z);
                    axkvVar.b();
                }
                i3 = ((axol) cronetException).b;
                i4 = 0;
                i5 = 0;
                i2 = 2;
                boolean z5 = this.H;
                boolean z6 = this.I;
                int iF2 = AndroidNetworkLibrary.f(this.F);
                int i11 = this.K;
                int i12 = this.J;
                cronetUploadDataStream = this.g;
                if (cronetUploadDataStream == null) {
                    i6 = 0;
                } else {
                    i6 = cronetUploadDataStream.f.get();
                }
                axnkVar.g(j2, new axni(j, jMax, jE, jMax2, i, durationOfSeconds, str2, z5, z6, iF2, i11, i12, i6, false, this.L, Process.myUid(), i3, i4, i5, i2, this.G.a, axok.q, this.G.b(), this.G.c(), this.G.a(), this.G.e(), this.G.d(), boolValueOf, false));
            } catch (RuntimeException e) {
                Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Error while trying to log CronetTrafficInfo: ", e);
            }
            this.e.g(new axoo(this.n, this.s, this.G, this.F, this.h, this.i), axkvVar, this.z);
            axkvVar.b();
        } catch (Throwable th) {
            axkvVar.b();
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        new axjt("CronetUrlRequest#cancel", 0);
        synchronized (this.d) {
            if (h() || !this.k) {
                return;
            }
            b(2);
        }
    }

    public final void d(String str, Exception exc) {
        this.L = true;
        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), a.bT(str, "Exception in ", " method"), exc);
    }

    public final void e(Exception exc) {
        this.K++;
        axml axmlVar = new axml("Exception received from UrlRequest.Callback", exc);
        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception in CalledByNative method", exc);
        j(axmlVar);
    }

    final void f(Throwable th) {
        axml axmlVar = new axml("Exception received from UploadDataProvider", th);
        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception in upload method", th);
        j(axmlVar);
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        new axjt("CronetUrlRequest#followRedirect", 0);
        synchronized (this.d) {
            if (!this.b) {
                throw new IllegalStateException("No redirect to follow.");
            }
            this.b = false;
            if (h()) {
                return;
            }
            N.Mhp54Oqs(this.a);
        }
    }

    public final void g() {
        N.MabZ5m6r(this.a);
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(statusListener);
        synchronized (this.d) {
            long j = this.a;
            if (j != 0) {
                N.MgIIMpT9(j, versionSafeCallbacks$UrlRequestStatusListener);
            } else {
                k(new axms(versionSafeCallbacks$UrlRequestStatusListener, 7, null), "getStatus");
            }
        }
    }

    public final boolean h() {
        return this.k && this.a == 0;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        boolean zH;
        synchronized (this.d) {
            zH = h();
        }
        return zH;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        new axjt("CronetUrlRequest#read", 0);
        AndroidInfo.j(byteBuffer);
        AndroidInfo.i(byteBuffer);
        synchronized (this.d) {
            if (!this.c) {
                throw new IllegalStateException("Unexpected read attempt.");
            }
            this.c = false;
            if (h()) {
                return;
            }
            if (N.MfCxA8r3(this.a, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                this.J++;
            } else {
                this.c = true;
                throw new IllegalArgumentException("Unable to call native read");
            }
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() throws Throwable {
        int i;
        new axjt("CronetUrlRequest#start", 0);
        Object obj = this.d;
        synchronized (obj) {
            try {
                try {
                    try {
                        synchronized (obj) {
                            try {
                                if (this.k || h()) {
                                    throw new IllegalStateException("Request is already started.");
                                }
                                try {
                                    CronetUrlRequestContext cronetUrlRequestContext = this.e;
                                    try {
                                        long jC = cronetUrlRequestContext.c();
                                        try {
                                            String str = this.n;
                                            try {
                                                int i2 = this.o;
                                                try {
                                                    boolean z = this.t;
                                                    try {
                                                        boolean z2 = this.u;
                                                        try {
                                                            boolean z3 = this.v;
                                                            try {
                                                                int i3 = this.w;
                                                                try {
                                                                    boolean z4 = this.x;
                                                                    try {
                                                                        int i4 = this.y;
                                                                        try {
                                                                            int i5 = this.p;
                                                                            try {
                                                                                byte[] bArr = this.A;
                                                                                ByteBuffer byteBuffer = this.B;
                                                                                try {
                                                                                    i = 1;
                                                                                    try {
                                                                                        this.a = N.MuOIsMvf(this, jC, str, i2, z, z2, z3, i3, z4, i4, i5, bArr, byteBuffer, byteBuffer != null ? byteBuffer.position() : 0, byteBuffer != null ? byteBuffer.limit() : 0, this.C, this.D);
                                                                                        cronetUrlRequestContext.f();
                                                                                        long j = this.a;
                                                                                        String str2 = this.q;
                                                                                        if (!N.M51RPBJe(j, str2)) {
                                                                                            throw new IllegalArgumentException(a.ce(str2, "Invalid http method "));
                                                                                        }
                                                                                        boolean z5 = false;
                                                                                        for (Map.Entry entry : this.r) {
                                                                                            if (((String) entry.getKey()).equalsIgnoreCase("Content-Type") && !((String) entry.getValue()).isEmpty()) {
                                                                                                z5 = true;
                                                                                            }
                                                                                            if (!N.MvHusd1J(this.a, (String) entry.getKey(), (String) entry.getValue())) {
                                                                                                throw new IllegalArgumentException("Invalid header with headername: " + ((String) entry.getKey()));
                                                                                            }
                                                                                        }
                                                                                        CronetUploadDataStream cronetUploadDataStream = this.g;
                                                                                        if (cronetUploadDataStream == null) {
                                                                                            this.k = true;
                                                                                            g();
                                                                                        } else {
                                                                                            if (!z5) {
                                                                                                throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                                                                                            }
                                                                                            this.k = true;
                                                                                            cronetUploadDataStream.d(new ahvk(this, 5, null), "CronetUrlRequest#start");
                                                                                        }
                                                                                    } catch (RuntimeException e) {
                                                                                        e = e;
                                                                                        b(i);
                                                                                        this.e.e();
                                                                                        throw e;
                                                                                    }
                                                                                } catch (RuntimeException e2) {
                                                                                    e = e2;
                                                                                    i = 1;
                                                                                    b(i);
                                                                                    this.e.e();
                                                                                    throw e;
                                                                                }
                                                                            } catch (RuntimeException e3) {
                                                                                e = e3;
                                                                            }
                                                                        } catch (RuntimeException e4) {
                                                                            e = e4;
                                                                            i = 1;
                                                                        }
                                                                    } catch (RuntimeException e5) {
                                                                        e = e5;
                                                                        i = 1;
                                                                    }
                                                                } catch (RuntimeException e6) {
                                                                    e = e6;
                                                                    i = 1;
                                                                }
                                                            } catch (RuntimeException e7) {
                                                                e = e7;
                                                                i = 1;
                                                            }
                                                        } catch (RuntimeException e8) {
                                                            e = e8;
                                                            i = 1;
                                                        }
                                                    } catch (RuntimeException e9) {
                                                        e = e9;
                                                        i = 1;
                                                    }
                                                } catch (RuntimeException e10) {
                                                    e = e10;
                                                    i = 1;
                                                }
                                            } catch (RuntimeException e11) {
                                                e = e11;
                                                i = 1;
                                            }
                                        } catch (RuntimeException e12) {
                                            e = e12;
                                            i = 1;
                                        }
                                    } catch (RuntimeException e13) {
                                        e = e13;
                                        i = 1;
                                    }
                                } catch (RuntimeException e14) {
                                    e = e14;
                                    i = 1;
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }
}
