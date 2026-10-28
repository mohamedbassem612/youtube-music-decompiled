package org.chromium.net.impl;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class CronetMetrics extends RequestFinishedInfo.Metrics {
    public final boolean a;
    public final Long b;
    public final Long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;
    private final long o;
    private final long p;
    private final Long q;
    private final Long r;

    public CronetMetrics(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
        this.k = j8;
        this.l = j9;
        this.m = j10;
        this.n = j11;
        this.o = j12;
        this.p = j13;
        this.a = z;
        this.b = Long.valueOf(j14);
        this.c = Long.valueOf(j15);
        if (j == -1 || j12 == -1) {
            this.q = null;
        } else {
            this.q = Long.valueOf(j12 - j);
        }
        if (j == -1 || j13 == -1) {
            this.r = null;
        } else {
            this.r = Long.valueOf(j13 - j);
        }
    }

    private static Date f(long j) {
        if (j == -1) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return new Date(j / 1000);
    }

    public final long a() {
        long j = this.g;
        if (j == -1) {
            return -1L;
        }
        long j2 = this.h;
        if (j2 != -1) {
            return j2 - j;
        }
        return -1L;
    }

    public final long b() {
        long j = this.e;
        if (j == -1) {
            return -1L;
        }
        long j2 = this.f;
        if (j2 != -1) {
            return j2 - j;
        }
        return -1L;
    }

    public final long c() {
        long j = this.i;
        if (j == -1) {
            return -1L;
        }
        long j2 = this.j;
        if (j2 != -1) {
            return j2 - j;
        }
        return -1L;
    }

    public final long d() {
        long j = this.d;
        if (j == -1) {
            return -1L;
        }
        long j2 = this.o;
        if (j2 != -1) {
            return j2 - j;
        }
        return -1L;
    }

    public final long e() {
        long j = this.d;
        if (j == -1) {
            return -1L;
        }
        long j2 = this.k;
        if (j2 != -1) {
            return j2 - j;
        }
        return -1L;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectEnd() {
        return f(this.h);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectStart() {
        return f(this.g);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsEnd() {
        return f(this.f);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsStart() {
        return f(this.e);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushEnd() {
        return f(this.n);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushStart() {
        return f(this.m);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getReceivedByteCount() {
        return this.c;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestEnd() {
        return f(this.p);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestStart() {
        return f(this.d);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getResponseStart() {
        return f(this.o);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingEnd() {
        return f(this.l);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingStart() {
        return f(this.k);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getSentByteCount() {
        return this.b;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final boolean getSocketReused() {
        return this.a;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslEnd() {
        return f(this.j);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslStart() {
        return f(this.i);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTotalTimeMs() {
        Long l = this.r;
        if (l == null) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return Long.valueOf(l.longValue() / 1000);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTtfbMs() {
        Long l = this.q;
        if (l == null) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return Long.valueOf(l.longValue() / 1000);
    }
}
