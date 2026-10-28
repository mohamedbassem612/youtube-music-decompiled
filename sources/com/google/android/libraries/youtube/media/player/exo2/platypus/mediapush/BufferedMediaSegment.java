package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import com.google.android.apps.youtube.proto.MediaHeaderOuterClass$MediaHeader;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.RequestIdentifierOuterClass$RequestIdentifier;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.protos.youtube.api.innertube.MediaSource$MediaSourceInfo;
import defpackage.ahno;
import defpackage.aihf;
import defpackage.zic;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class BufferedMediaSegment {
    final FormatIdOuterClass$FormatId a;
    final long b;
    final long c;
    final long d;
    public final String f;
    public final MediaSource$MediaSourceInfo g;
    private volatile TimeRangeOuterClass$TimeRange l;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    private final List k = new ArrayList();
    public volatile long h = -9223372036854775807L;
    private volatile long m = -9223372036854775807L;
    private final AtomicLong n = new AtomicLong(0);
    public final AtomicInteger i = new AtomicInteger(0);
    private final AtomicInteger o = new AtomicInteger(0);
    public volatile boolean j = false;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes3.dex */
    final class BufferedSample {
        final int a;
        final long b;
        final long c;

        public BufferedSample(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public BufferedMediaSegment(MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader, RequestIdentifierOuterClass$RequestIdentifier requestIdentifierOuterClass$RequestIdentifier, MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo) {
        ahno.O(!mediaHeaderOuterClass$MediaHeader.f);
        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = mediaHeaderOuterClass$MediaHeader.h;
        this.a = formatIdOuterClass$FormatId == null ? FormatIdOuterClass$FormatId.getDefaultInstance() : formatIdOuterClass$FormatId;
        this.b = mediaHeaderOuterClass$MediaHeader.g;
        this.c = mediaHeaderOuterClass$MediaHeader.j;
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange = mediaHeaderOuterClass$MediaHeader.i;
        this.l = timeRangeOuterClass$TimeRange == null ? TimeRangeOuterClass$TimeRange.getDefaultInstance() : timeRangeOuterClass$TimeRange;
        this.d = mediaHeaderOuterClass$MediaHeader.e;
        this.f = requestIdentifierOuterClass$RequestIdentifier != null ? requestIdentifierOuterClass$RequestIdentifier.b : null;
        this.g = mediaSource$MediaSourceInfo;
    }

    public final int a() {
        return this.i.get();
    }

    final long b() {
        return e() + c();
    }

    final long c() {
        long j = this.n.get();
        if (j > 0) {
            return j;
        }
        long j2 = this.o.get();
        if (this.m != -9223372036854775807L && this.h != -9223372036854775807L && j2 != 0) {
            if (this.j && (this.l.b & 2) != 0) {
                return zic.b(this.l.d, this.l.e);
            }
            if (j2 != 1) {
                return (this.m - this.h) + ((this.m - this.h) / (j2 - 1));
            }
        }
        return 0L;
    }

    final long d() {
        return (this.l.b & 2) != 0 ? zic.b(this.l.c + this.l.d, this.l.e) : e() + c();
    }

    final long e() {
        return zic.b(this.l.c, this.l.e);
    }

    final TimeRangeOuterClass$TimeRange f() {
        if ((this.l.b & 2) != 0) {
            return this.l;
        }
        aihf aihfVarCreateBuilder = TimeRangeOuterClass$TimeRange.a.createBuilder();
        long jE = e();
        aihfVarCreateBuilder.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
        timeRangeOuterClass$TimeRange.b |= 1;
        timeRangeOuterClass$TimeRange.c = jE;
        long jC = c();
        aihfVarCreateBuilder.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange2 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
        timeRangeOuterClass$TimeRange2.b |= 2;
        timeRangeOuterClass$TimeRange2.d = jC;
        aihfVarCreateBuilder.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange3 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
        timeRangeOuterClass$TimeRange3.b |= 4;
        timeRangeOuterClass$TimeRange3.e = 1000000;
        return (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.build();
    }

    final void g(long j, long j2) {
        ahno.O(!this.j);
        this.n.addAndGet(j2);
        this.o.incrementAndGet();
        if (this.h == -9223372036854775807L || j < this.h) {
            this.h = j;
        }
        if (this.m == -9223372036854775807L || j > this.m) {
            this.m = j;
        }
    }

    final synchronized void h(long j, long j2, int i) {
        g(j, j2);
        if (i != -1) {
            this.k.add(new BufferedSample(i, j, j2));
        }
    }

    final void i(long j) {
        this.n.set(j);
        if ((this.l.b & 2) == 0 || this.l.e <= 0) {
            return;
        }
        double d = this.l.e;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long jRound = Math.round((j * d) / 1000000.0d);
        aihf builder = this.l.toBuilder();
        builder.copyOnWrite();
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange = (TimeRangeOuterClass$TimeRange) builder.instance;
        timeRangeOuterClass$TimeRange.b |= 2;
        timeRangeOuterClass$TimeRange.d = jRound;
        this.l = (TimeRangeOuterClass$TimeRange) builder.build();
    }

    final synchronized void j(int i, long j) {
        int i2 = 0;
        while (true) {
            List<BufferedSample> list = this.k;
            if (i2 >= list.size()) {
                break;
            }
            if (((BufferedSample) list.get(i2)).a == i) {
                list.subList(i2, list.size()).clear();
                this.o.set(list.size());
                long j2 = -9223372036854775807L;
                long j3 = -9223372036854775807L;
                for (BufferedSample bufferedSample : list) {
                    if (j2 == -9223372036854775807L || bufferedSample.b < j2) {
                        j2 = bufferedSample.b;
                    }
                    if (j3 == -9223372036854775807L || bufferedSample.b > j3) {
                        j3 = bufferedSample.b;
                    }
                }
                this.h = j2;
                this.m = j3;
                break;
            }
            i2++;
        }
        i(j);
    }

    public final boolean k() {
        return this.o.get() > 0;
    }

    final synchronized int l(long j) {
        for (BufferedSample bufferedSample : this.k) {
            long j2 = (-1000) + j;
            long j3 = bufferedSample.b;
            if (j3 < j2) {
                if (j3 + bufferedSample.c <= 1000 + j) {
                    continue;
                }
            }
            int i = bufferedSample.a;
            if (i != -1) {
                return i;
            }
        }
        return -1;
    }
}
