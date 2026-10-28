package org.chromium.net.impl;

import android.util.Log;
import defpackage.a;
import defpackage.afii;
import defpackage.ahvk;
import defpackage.axjt;
import defpackage.axms;
import defpackage.axox;
import internal.J.N;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class CronetUploadDataStream extends UploadDataSink {
    public static final String a = "CronetUploadDataStream";
    public final axox b;
    public final CronetUrlRequest c;
    public long d;
    public long e;
    public ByteBuffer g;
    public long i;
    private final Executor k;
    private long l;
    private boolean n;
    public final AtomicInteger f = new AtomicInteger();
    private final Runnable m = new ahvk(this, 2, null);
    public final Object h = new Object();
    public int j = 3;

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.k = executor;
        this.b = new axox(uploadDataProvider);
        this.c = cronetUrlRequest;
    }

    private final void e() {
        synchronized (this.h) {
            if (this.j == 0) {
                this.n = true;
                return;
            }
            long j = this.i;
            if (j == 0) {
                return;
            }
            N.MMW1G0N1(j);
            this.i = 0L;
            d(new ahvk(this, 3, null), "destroyAdapter");
        }
    }

    private final void f() {
        synchronized (this.h) {
            if (this.j == 0) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
            if (this.n) {
                e();
            }
        }
    }

    public final void a() {
        this.c.a();
    }

    public final void b(int i) {
        int i2 = this.j;
        if (i2 != i) {
            throw new IllegalStateException(a.bQ(i2, i, "Expected ", ", but was "));
        }
    }

    public final void c(Throwable th) {
        int i;
        synchronized (this.h) {
            i = this.j;
            if (i == 3) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.", th);
            }
            this.j = 3;
            this.g = null;
            f();
        }
        if (i == 2) {
            try {
                this.b.close();
            } catch (Exception e) {
                Log.e("cn_".concat(String.valueOf(a)), "Failure closing data provider", e);
            }
        }
        this.c.f(th);
    }

    final void d(Runnable runnable, String str) {
        new axjt("CronetUploadDataStream#postTaskToExecutor ".concat(str), 0);
        try {
            this.k.execute(new afii(str, runnable, 9));
        } catch (Throwable th) {
            this.c.f(th);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        new axjt("CronetUploadDataStream#onReadError", 0);
        synchronized (this.h) {
            b(0);
            c(exc);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        new axjt("CronetUploadDataStream#onReadSucceeded", 0);
        synchronized (this.h) {
            b(0);
            if (this.l != this.g.limit()) {
                throw new IllegalStateException("ByteBuffer limit changed");
            }
            if (z && this.d >= 0) {
                throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
            }
            int iPosition = this.g.position();
            if (iPosition == 0) {
                if (!z) {
                    c(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                    return;
                }
                iPosition = 0;
            }
            long j = this.e - ((long) iPosition);
            this.e = j;
            if (j < 0) {
                long j2 = this.d;
                if (j2 >= 0) {
                    throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(j2 - j), Long.valueOf(this.d)));
                }
            }
            this.g = null;
            this.j = 3;
            f();
            long j3 = this.i;
            if (j3 == 0) {
                return;
            }
            N.MpWH3VIr(j3, iPosition, z);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        new axjt("CronetUploadDataStream#onRewindError", 0);
        synchronized (this.h) {
            b(1);
            c(exc);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        new axjt("CronetUploadDataStream#onRewindSucceeded", 0);
        synchronized (this.h) {
            b(1);
            this.j = 3;
            this.e = this.d;
            long j = this.i;
            if (j == 0) {
                return;
            }
            N.MFpRjSMv(j);
        }
    }

    final void onUploadDataStreamDestroyed() {
        e();
    }

    final void readData(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        this.l = byteBuffer.limit();
        d(this.m, "readData");
    }

    final void rewind() {
        d(new axms(this, 6, null), "rewind");
    }
}
