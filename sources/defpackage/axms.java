package defpackage;

import android.os.Process;
import android.util.Log;
import j$.time.Duration;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.channels.ReadableByteChannel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.net.AndroidNetworkLibrary;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class axms implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ axms(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17, types: [org.chromium.net.impl.CronetBidirectionalStream] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Map allHeaders;
        boolean z;
        int i;
        long j;
        long j2;
        long jMax;
        long j3;
        long jMax2;
        int i2;
        int i3;
        int i4;
        int i5;
        Map allHeaders2;
        String str2;
        boolean z2;
        int i6;
        long j4;
        long j5;
        long length;
        long j6;
        long j7;
        int i7;
        int i8;
        switch (this.$cid) {
            case 0:
                CronetBidirectionalStream cronetBidirectionalStream = (CronetBidirectionalStream) this.a;
                int iA = cronetBidirectionalStream.a();
                boolean z3 = cronetBidirectionalStream.q;
                boolean z4 = cronetBidirectionalStream.r;
                axor axorVar = cronetBidirectionalStream.u;
                Boolean boolValueOf = axorVar != null ? Boolean.valueOf(axorVar.d) : null;
                axor axorVar2 = cronetBidirectionalStream.u;
                if (axorVar2 != null) {
                    allHeaders = axorVar2.getAllHeaders();
                    axor axorVar3 = cronetBidirectionalStream.u;
                    str = axorVar3.c;
                    int i9 = axorVar3.a;
                    z = axorVar3.b;
                    i = i9;
                } else {
                    str = "";
                    allHeaders = Collections.EMPTY_MAP;
                    z = false;
                    i = 0;
                }
                String str3 = str;
                long jLongValue = cronetBidirectionalStream.p.b.longValue();
                if (z && jLongValue == 0) {
                    j = 0;
                    j2 = 0;
                    jMax = 0;
                } else {
                    long length2 = 0;
                    for (String str4 : cronetBidirectionalStream.e) {
                        if (str4 != null) {
                            length2 += (long) str4.length();
                        }
                    }
                    j = 0;
                    j2 = length2;
                    jMax = Math.max(0L, jLongValue - length2);
                }
                long jLongValue2 = cronetBidirectionalStream.p.c.longValue();
                if (z && jLongValue2 == j) {
                    j3 = j;
                    jMax2 = j3;
                } else {
                    long jE = AndroidNetworkLibrary.e(allHeaders);
                    j3 = jE;
                    jMax2 = Math.max(j, jLongValue2 - jE);
                }
                Duration durationOfSeconds = (cronetBidirectionalStream.p.getRequestStart() == null || cronetBidirectionalStream.p.getRequestEnd() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(cronetBidirectionalStream.p.getRequestEnd().getTime() - cronetBidirectionalStream.p.getRequestStart().getTime());
                CronetException cronetException = cronetBidirectionalStream.i;
                if (cronetException instanceof axol) {
                    i2 = ((axol) cronetException).b;
                    i5 = 2;
                    i3 = 0;
                    i4 = 0;
                } else if (cronetException instanceof axon) {
                    axon axonVar = (axon) cronetException;
                    int cronetInternalErrorCode = axonVar.getCronetInternalErrorCode();
                    int i10 = axonVar.a;
                    i4 = axonVar.b;
                    i3 = i10;
                    i2 = cronetInternalErrorCode;
                    i5 = 2;
                } else {
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = cronetException != null ? 3 : 1;
                }
                CronetUrlRequestContext cronetUrlRequestContext = cronetBidirectionalStream.b;
                cronetBidirectionalStream.h.g(cronetUrlRequestContext.e, new axni(j2, jMax, j3, jMax2, i, durationOfSeconds, str3, z3, z4, AndroidNetworkLibrary.f(iA), cronetBidirectionalStream.j, cronetBidirectionalStream.k, cronetBidirectionalStream.l, true, cronetBidirectionalStream.m, Process.myUid(), i2, i3, i4, i5, cronetBidirectionalStream.p.a, axok.q, cronetBidirectionalStream.p.b(), cronetBidirectionalStream.p.c(), cronetBidirectionalStream.p.a(), cronetBidirectionalStream.p.e(), cronetBidirectionalStream.p.d(), boolValueOf, cronetBidirectionalStream.g));
                cronetUrlRequestContext.e();
                return;
            case 1:
                Object obj = this.a;
                CronetBidirectionalStream cronetBidirectionalStream2 = (CronetBidirectionalStream) obj;
                cronetBidirectionalStream2.c.onFailed((BidirectionalStream) obj, cronetBidirectionalStream2.u, cronetBidirectionalStream2.i);
                return;
            case 2:
                Object obj2 = this.a;
                CronetBidirectionalStream cronetBidirectionalStream3 = (CronetBidirectionalStream) obj2;
                cronetBidirectionalStream3.c.onCanceled((BidirectionalStream) obj2, cronetBidirectionalStream3.u);
                return;
            case 3:
                Object obj3 = this.a;
                CronetBidirectionalStream cronetBidirectionalStream4 = (CronetBidirectionalStream) obj3;
                cronetBidirectionalStream4.c.onSucceeded((BidirectionalStream) obj3, cronetBidirectionalStream4.u);
                return;
            case 4:
                ?? r1 = this.a;
                try {
                    try {
                        ((CronetBidirectionalStream) r1).a.run();
                    } finally {
                        ((CronetBidirectionalStream) r1).v.b();
                    }
                    break;
                } catch (Exception e) {
                    String strB = ((CronetBidirectionalStream) r1).b();
                    ((CronetBidirectionalStream) r1).m = true;
                    Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), a.bT(strB, "Exception in ", " method"), e);
                }
                return;
            case 5:
                Object obj4 = this.a;
                synchronized (((CronetBidirectionalStream) obj4).n) {
                    if (((CronetBidirectionalStream) obj4).g()) {
                        return;
                    }
                    ((CronetBidirectionalStream) obj4).s = 2;
                    try {
                        ((CronetBidirectionalStream) obj4).c.onResponseHeadersReceived((BidirectionalStream) obj4, ((CronetBidirectionalStream) obj4).u);
                        return;
                    } catch (Exception e2) {
                        ((CronetBidirectionalStream) this.a).e(e2);
                        return;
                    }
                }
            case 6:
                Object obj5 = this.a;
                synchronized (((CronetUploadDataStream) obj5).h) {
                    if (((CronetUploadDataStream) obj5).i == 0) {
                        return;
                    }
                    ((CronetUploadDataStream) obj5).b(3);
                    ((CronetUploadDataStream) obj5).j = 1;
                    try {
                        ((CronetUploadDataStream) obj5).a();
                        ((CronetUploadDataStream) obj5).b.rewind((UploadDataSink) obj5);
                        return;
                    } catch (Exception e3) {
                        ((CronetUploadDataStream) this.a).c(e3);
                        return;
                    }
                }
            case 7:
                new axjt("CronetUrlRequest#getStatus running callback", 0);
                ((VersionSafeCallbacks$UrlRequestStatusListener) this.a).onStatus(-1);
                return;
            case 8:
                try {
                    Object obj6 = this.a;
                    ((CronetUrlRequest) obj6).f.onCanceled((UrlRequest) obj6, ((CronetUrlRequest) obj6).h);
                    break;
                } catch (Exception e4) {
                    ((CronetUrlRequest) this.a).d("onCanceled", e4);
                }
                ((CronetUrlRequest) this.a).c();
                return;
            case 9:
                new axjt("CronetUrlRequest#onNativeAdapterDestroyed running callback", 0);
                try {
                    Object obj7 = this.a;
                    ((CronetUrlRequest) obj7).f.onFailed((UrlRequest) obj7, ((CronetUrlRequest) obj7).h, ((CronetUrlRequest) obj7).i);
                    break;
                } catch (Exception e5) {
                    ((CronetUrlRequest) this.a).d("onFailed", e5);
                }
                ((CronetUrlRequest) this.a).c();
                return;
            case 10:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(0);
                this.a.run();
                return;
            case 11:
                ((axoa) this.a).g++;
                return;
            case 12:
                axoh axohVar = (axoh) this.a;
                axoa axoaVar = axohVar.y;
                if (axoaVar != null) {
                    try {
                        axoaVar.e();
                    } catch (IOException e6) {
                        Log.e("cn_".concat(String.valueOf(axoh.a)), "Exception when closing OutputChannel", e6);
                    }
                    break;
                }
                HttpURLConnection httpURLConnection = axohVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    axohVar.q = null;
                    return;
                }
                return;
            case 13:
                axoh axohVar2 = (axoh) this.a;
                axohVar2.f.add(axohVar2.m);
                axohVar2.h();
                return;
            case 14:
                axoh axohVar3 = (axoh) this.a;
                ReadableByteChannel readableByteChannel = axohVar3.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                        break;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    axohVar3.n = null;
                    return;
                }
                return;
            case 15:
                ((axoh) this.a).w++;
                return;
            case 16:
                axoh axohVar4 = (axoh) this.a;
                axohVar4.m = axohVar4.p;
                axohVar4.p = null;
                axohVar4.h();
                return;
            case 17:
                Object obj8 = this.a;
                try {
                    axoh axohVar5 = ((axof) obj8).d;
                    axnk axnkVar = axohVar5.t;
                    long j8 = axohVar5.s;
                    axor axorVar4 = axohVar5.o;
                    if (axorVar4 != null) {
                        allHeaders2 = axorVar4.getAllHeaders();
                        axor axorVar5 = axohVar5.o;
                        str2 = axorVar5.c;
                        int i11 = axorVar5.a;
                        z2 = axorVar5.b;
                        i6 = i11;
                    } else {
                        allHeaders2 = Collections.EMPTY_MAP;
                        str2 = "";
                        z2 = false;
                        i6 = 0;
                    }
                    String str5 = str2;
                    if (z2) {
                        j4 = 0;
                        j5 = 0;
                    } else {
                        long length3 = 0;
                        for (Map.Entry entry : axohVar5.e.entrySet()) {
                            String str6 = (String) entry.getKey();
                            if (str6 != null) {
                                length3 += (long) str6.length();
                            }
                            String str7 = (String) entry.getValue();
                            if (str7 != null) {
                                length3 += (long) str7.length();
                            }
                        }
                        j4 = length3;
                        j5 = -1;
                    }
                    if (!z2) {
                        if (allHeaders2 == null) {
                            length = 0;
                        } else {
                            length = 0;
                            for (Map.Entry entry2 : allHeaders2.entrySet()) {
                                String str8 = (String) entry2.getKey();
                                if (str8 != null) {
                                    length += (long) str8.length();
                                }
                                if (entry2.getValue() != null) {
                                    for (String str9 : (List) entry2.getValue()) {
                                        if (str9 != null) {
                                            length += (long) str9.length();
                                        }
                                    }
                                }
                            }
                        }
                        j6 = 0;
                        if (allHeaders2.containsKey("Content-Length")) {
                            try {
                                j7 = Long.parseLong((String) ((List) allHeaders2.get("Content-Length")).get(0));
                            } catch (NumberFormatException unused) {
                                j7 = 0;
                            }
                        } else {
                            j7 = -1;
                        }
                        i7 = 3;
                        break;
                    } else {
                        j7 = 0;
                        i7 = 3;
                        length = 0;
                        j6 = 0;
                    }
                    Duration durationOfSeconds2 = Duration.ofSeconds(j6);
                    axoh axohVar6 = ((axof) obj8).d;
                    int i12 = axohVar6.g.get();
                    if (i12 == 6) {
                        i8 = 2;
                    } else if (i12 == 7) {
                        i8 = 1;
                    } else {
                        if (i12 != 8) {
                            throw new IllegalStateException(a.bP(i12, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                        }
                        i8 = i7;
                    }
                    int i13 = axohVar6.w;
                    int i14 = axohVar6.v;
                    axoa axoaVar2 = axohVar6.y;
                    axnkVar.g(j8, new axni(j4, j5, length, j7, i6, durationOfSeconds2, str5, false, false, i8, i13, i14, axoaVar2 != null ? axoaVar2.g : 0, false, axohVar6.x, Process.myUid(), 0, 0, 0, 1, false, axnh.CRONET_SOURCE_FALLBACK, -1L, -1L, -1L, -1L, -1L, null, false));
                    return;
                } catch (RuntimeException unused2) {
                    String str10 = axoh.a;
                    return;
                }
            default:
                ((axog) this.a).a();
                return;
        }
    }

    public axms(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
