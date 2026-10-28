package org.chromium.net.impl;

import android.util.Log;
import defpackage.a;
import defpackage.axjt;
import defpackage.axkv;
import defpackage.axmk;
import defpackage.axml;
import defpackage.axms;
import defpackage.axmt;
import defpackage.axmu;
import defpackage.axmv;
import defpackage.axmz;
import defpackage.axnk;
import defpackage.axon;
import defpackage.axoo;
import defpackage.axoq;
import defpackage.axor;
import defpackage.axot;
import defpackage.csd;
import internal.J.N;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.AndroidInfo;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    private final Collection A;
    private final boolean B;
    private final int C;
    private final boolean D;
    private final int E;
    private final ArrayList F;
    private final ArrayDeque G;
    private boolean H;
    private long I;
    private axmu J;
    public Runnable a;
    public final CronetUrlRequestContext b;
    public final axot c;
    public final String d;
    public final String[] e;
    public final long f;
    public final boolean g;
    public final axnk h;
    public CronetException i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean o;
    public CronetMetrics p;
    public boolean q;
    public boolean r;
    public axor u;
    public axkv v;
    private final Executor w;
    private final String x;
    private final int y;
    private final boolean z;
    public final Object n = new Object();
    public int s = 0;
    public int t = 0;

    public CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, BidirectionalStream.Callback callback, Executor executor, String str2, List list, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j, boolean z4) {
        int i4;
        int i5 = 0;
        this.b = cronetUrlRequestContext;
        this.x = str;
        if (i == 0) {
            i4 = 1;
        } else if (i != 1) {
            i4 = 3;
            if (i != 2) {
                if (i == 3) {
                    i4 = 4;
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException("Invalid stream priority.");
                    }
                    i4 = 5;
                }
            }
        } else {
            i4 = 2;
        }
        this.y = i4;
        this.c = new axot(callback);
        this.w = executor;
        this.d = str2;
        String[] strArr = new String[list.size() << 1];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i6 = i5 + 1;
            strArr[i5] = (String) entry.getKey();
            i5 += 2;
            strArr[i6] = (String) entry.getValue();
        }
        this.e = strArr;
        this.z = z;
        this.F = new ArrayList();
        this.G = new ArrayDeque();
        this.A = collection;
        this.B = z2;
        this.C = i2;
        this.D = z3;
        this.E = i3;
        this.f = j;
        this.h = cronetUrlRequestContext.f;
        this.g = z4;
    }

    public static boolean f(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    private static ArrayList h(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length >> 1);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private final void i() {
        new axjt("CronetBidirectionalStream#destroyNativeStreamLocked", 0);
        long j = this.I;
        if (j != 0) {
            N.MS2l1kNx(j);
            if (this.s != 0) {
                this.b.d();
            }
            this.I = 0L;
        }
    }

    private final void j(CronetException cronetException) {
        k(new axmt(this, (Object) cronetException, 2), "failWithException");
    }

    private final void k(Runnable runnable, String str) {
        new axjt("CronetBidirectionalStream#postTaskToExecutor ".concat(String.valueOf(str)), 0);
        try {
            this.w.execute(new axmt(str, runnable, 1));
        } catch (RejectedExecutionException e) {
            Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception posting task to executor", e);
            synchronized (this.n) {
                this.t = 11;
                this.s = 11;
                i();
            }
        }
    }

    private final void l() {
        ArrayDeque arrayDeque = this.G;
        int size = arrayDeque.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) arrayDeque.poll();
            byteBufferArr[i] = byteBuffer;
            iArr[i] = byteBuffer.position();
            iArr2[i] = byteBuffer.limit();
        }
        this.t = 9;
        this.o = true;
        if (N.MwJCBTMQ(this.I, byteBufferArr, iArr, iArr2, this.H && this.F.isEmpty())) {
            return;
        }
        this.t = 8;
        throw new IllegalArgumentException("Unable to call native writev.");
    }

    private final void m() {
        int i = this.s;
        if (i != this.t || (i != 5 && i != 6 && i != 7 && i != 11)) {
            throw new IllegalStateException(String.format("Expected the bidirectional stream to be in a terminal state! readState = %d, writeState = %d", Integer.valueOf(i), Integer.valueOf(this.t)));
        }
    }

    private final void onError(int i, int i2, int i3, int i4, String str, long j) {
        axor axorVar = this.u;
        if (axorVar != null) {
            axorVar.a(j);
        }
        if (i == 10 || i3 != 0) {
            j(new axon("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2, i3, i4));
        } else {
            j(new axmk("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2));
        }
    }

    private final void onNativeStreamAdapterDestroyed(CronetMetrics cronetMetrics, boolean z, boolean z2) {
        if (this.s != 0) {
            m();
            if (this.a == null) {
                if (this.s != 11) {
                    throw new IllegalStateException("Expected a terminal runnable, but found none.");
                }
                return;
            }
            this.p = cronetMetrics;
            if (cronetMetrics == null) {
                this.p = new CronetMetrics(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, 0L, 0L);
            }
            this.q = z;
            this.r = z2;
            k(new axms(this, 4), String.format("executeTerminalCallback[%s]", b()));
            try {
                this.b.g(new axoo(this.x, this.A, this.p, a(), this.u, this.i), this.v, null);
            } finally {
                this.v.b();
            }
        }
    }

    private final void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.u.a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            j(new axmz("ByteBuffer modified externally during read", null));
            return;
        }
        if (i < 0 || (i4 = i2 + i) > i3) {
            j(new axmz("Invalid number of bytes read", null));
            return;
        }
        axmu axmuVar = this.J;
        axmuVar.a = byteBuffer;
        axmuVar.b = i == 0;
        k(axmuVar, "onReadCompleted");
    }

    private final void onResponseHeadersReceived(int i, String str, String[] strArr, long j, String str2, boolean z) {
        try {
            this.u = new axor(Arrays.asList(this.x), i, "", h(strArr), false, str, str2, j, z);
            k(new axms(this, 5, null), "onResponseHeadersReceived");
        } catch (Exception unused) {
            j(new axmz("Cannot prepare ResponseInfo", null));
        }
    }

    private final void onResponseTrailersReceived(String[] strArr) {
        k(new axmt(this, (Object) new axoq(h(strArr)), 0), "onResponseTrailersReceived");
    }

    private final void onStreamReady(boolean z) {
        k(new csd(this, z, 18, null), "onStreamReady");
    }

    private final void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        synchronized (this.n) {
            if (g()) {
                return;
            }
            this.t = 8;
            if (!this.G.isEmpty()) {
                l();
            }
            int i = 0;
            while (true) {
                int length = byteBufferArr.length;
                if (i >= length) {
                    return;
                }
                ByteBuffer byteBuffer = byteBufferArr[i];
                if (byteBuffer.position() != iArr[i] || byteBuffer.limit() != iArr2[i]) {
                    j(new axmz("ByteBuffer modified externally during write", null));
                    return;
                } else {
                    k(new axmv(this, byteBuffer, z && i == length + (-1)), "onWritevCompleted");
                    i++;
                }
            }
        }
    }

    public final int a() {
        m();
        int i = this.s;
        if (i == 5) {
            return 2;
        }
        if (i != 6) {
            if (i == 7) {
                return 0;
            }
            if (i != 11) {
                throw new IllegalStateException(a.bP(i, "Cronet bidirectional stream read state is ", " which is not a valid finished state!"));
            }
        }
        return 1;
    }

    public final String b() {
        m();
        int i = this.s;
        if (i == 5) {
            return "CANCELED";
        }
        if (i == 6) {
            return "ERROR";
        }
        if (i == 7) {
            return "SUCCESS";
        }
        if (i == 11) {
            return "ERROR_POSTING_TO_EXECUTOR";
        }
        throw new IllegalStateException(String.format("Unknown callback type to execute: %d", Integer.valueOf(i)));
    }

    public final void c(CronetException cronetException) {
        this.i = cronetException;
        synchronized (this.n) {
            if (g()) {
                return;
            }
            this.t = 6;
            this.s = 6;
            this.a = new axms(this, 1);
            i();
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        new axjt("CronetBidirectionalStream#cancel", 0);
        synchronized (this.n) {
            if (g() || this.s == 0) {
                return;
            }
            this.t = 5;
            this.s = 5;
            this.a = new axms(this, 2);
            i();
        }
    }

    public final void d() {
        new axjt("CronetBidirectionalStream#maybeOnSucceededOnExecutor", 0);
        synchronized (this.n) {
            if (g()) {
                return;
            }
            if (this.t == 10 && this.s == 4) {
                this.t = 7;
                this.s = 7;
                this.a = new axms(this, 3);
                i();
            }
        }
    }

    public final void e(Exception exc) {
        this.j++;
        axml axmlVar = new axml("CalledByNative method has thrown an exception", exc);
        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception in CalledByNative method", exc);
        c(axmlVar);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        int i;
        new axjt("CronetBidirectionalStream#flush", 0);
        synchronized (this.n) {
            if (g() || !((i = this.t) == 8 || i == 9)) {
                return;
            }
            ArrayList arrayList = this.F;
            if (arrayList.isEmpty() && this.G.isEmpty()) {
                if (!this.o) {
                    this.o = true;
                    N.MGLIR7Sc(this.I);
                    if (!f(this.d)) {
                        this.t = 10;
                    }
                }
                return;
            }
            if (!arrayList.isEmpty()) {
                this.G.addAll(arrayList);
                arrayList.clear();
            }
            if (this.t == 9) {
                return;
            }
            l();
            this.l++;
        }
    }

    public final boolean g() {
        return this.s != 0 && this.I == 0;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        boolean zG;
        synchronized (this.n) {
            zG = g();
        }
        return zG;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        new axjt("CronetBidirectionalStream#read", 0);
        synchronized (this.n) {
            AndroidInfo.j(byteBuffer);
            AndroidInfo.i(byteBuffer);
            if (this.s != 2) {
                throw new IllegalStateException("Unexpected read attempt.");
            }
            if (g()) {
                return;
            }
            if (this.J == null) {
                this.J = new axmu(this);
            }
            this.s = 3;
            if (N.Md_rPmgC(this.I, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                this.k++;
            } else {
                this.s = 2;
                throw new IllegalArgumentException("Unable to call native read");
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        new axjt("CronetBidirectionalStream#start", 0);
        synchronized (this.n) {
            if (this.s != 0) {
                throw new IllegalStateException("Stream is already started.");
            }
            try {
                CronetUrlRequestContext cronetUrlRequestContext = this.b;
                try {
                    long jMqTDYvZd = N.MqTDYvZd(this, cronetUrlRequestContext.c(), !this.z, this.B, this.C, this.D, this.E, this.f);
                    this.I = jMqTDYvZd;
                    String str = this.x;
                    int i = this.y;
                    String str2 = this.d;
                    String[] strArr = this.e;
                    int iMcDUim_I = N.McDUim_I(jMqTDYvZd, str, i, str2, strArr, !f(str2));
                    if (iMcDUim_I == -1) {
                        throw new IllegalArgumentException(a.ce(str2, "Invalid http method "));
                    }
                    if (iMcDUim_I > 0) {
                        throw new IllegalArgumentException("Invalid header with headername: " + strArr[iMcDUim_I - 1]);
                    }
                    cronetUrlRequestContext.f();
                    axkv axkvVar = new axkv(new axms(this, 0));
                    this.v = axkvVar;
                    axkvVar.c();
                    this.t = 1;
                    this.s = 1;
                } catch (RuntimeException e) {
                    e = e;
                    this = this;
                    this.i();
                    throw e;
                }
            } catch (RuntimeException e2) {
                e = e2;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        new axjt("CronetBidirectionalStream#write", 0);
        synchronized (this.n) {
            AndroidInfo.i(byteBuffer);
            if (!byteBuffer.hasRemaining() && !z) {
                throw new IllegalArgumentException("Empty buffer before end of stream.");
            }
            if (this.H) {
                throw new IllegalArgumentException("Write after writing end of stream.");
            }
            if (g()) {
                return;
            }
            this.F.add(byteBuffer);
            if (z) {
                this.H = true;
            }
        }
    }
}
