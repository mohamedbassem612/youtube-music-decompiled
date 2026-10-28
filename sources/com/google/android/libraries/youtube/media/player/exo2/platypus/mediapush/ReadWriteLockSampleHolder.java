package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.apps.youtube.proto.MediaHeaderOuterClass$MediaHeader;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.android.libraries.youtube.media.interfaces.BufferState;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import com.google.protos.youtube.api.innertube.MediaSource$MediaSourceInfo;
import defpackage.aae;
import defpackage.abxv;
import defpackage.afwl;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.axo;
import defpackage.brv;
import defpackage.bse;
import defpackage.bwb;
import defpackage.ccu;
import defpackage.cdv;
import defpackage.cjt;
import defpackage.cjz;
import defpackage.con;
import defpackage.cra;
import defpackage.cwi;
import defpackage.jqz;
import defpackage.ywx;
import defpackage.zhq;
import defpackage.zic;
import defpackage.zjr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ReadWriteLockSampleHolder extends SampleHolder {
    protected final ReentrantReadWriteLock.ReadLock K;
    protected final ReentrantReadWriteLock.WriteLock L;
    protected final ReentrantReadWriteLock a;

    public ReadWriteLockSampleHolder(jqz jqzVar, cra craVar, cjz cjzVar, aae aaeVar, axo axoVar, MediaParser.Factory factory, long j, long j2, String str, abxv abxvVar, zjr zjrVar, Supplier supplier, ScheduledExecutorService scheduledExecutorService, StartPositionTracker startPositionTracker, Long l, boolean z) {
        super(jqzVar, craVar, cjzVar, aaeVar, axoVar, j, j2, str, abxvVar, zjrVar, supplier, scheduledExecutorService, startPositionTracker, l, z);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.K = reentrantReadWriteLock.readLock();
        this.L = reentrantReadWriteLock.writeLock();
    }

    private final void Y() {
        this.Q = false;
        this.R = false;
        ScheduledFuture scheduledFuture = this.S;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.S = null;
        }
    }

    private final void Z(long j) {
        this.P = j;
        this.M.f = j;
        if (this.i <= 0 || j < this.i - 10000) {
            return;
        }
        this.n = true;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void C(ywx ywxVar, BufferedMediaSegment bufferedMediaSegment) {
        this.L.lock();
        try {
            super.C(ywxVar, bufferedMediaSegment);
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void F(long j) {
        if (this.u == -1) {
            this.u = j;
            this.L.lock();
            try {
                int iM = m(j);
                boolean z = false;
                if (iM >= 0 && ((BufferedMediaSegment) this.z.get(iM)).j) {
                    z = true;
                }
                this.L.unlock();
                if (z) {
                    D();
                }
            } catch (Throwable th) {
                this.L.unlock();
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void G(long j) {
        this.t = j;
        if (this.t != -1) {
            this.L.lock();
            try {
                int iM = m(j);
                boolean z = false;
                if (iM >= 0 && ((BufferedMediaSegment) this.z.get(iM)).j) {
                    z = true;
                }
                this.L.unlock();
                if (z) {
                    D();
                }
            } catch (Throwable th) {
                this.L.unlock();
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void H() {
        this.L.lock();
        try {
            this.M.B();
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final long K() {
        this.K.lock();
        try {
            return this.M.n();
        } finally {
            this.K.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final long L() {
        ReentrantReadWriteLock.ReadLock readLock = this.K;
        readLock.lock();
        try {
            return this.M.q();
        } finally {
            readLock.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final void M(long j) {
        if (j >= this.q) {
            ReentrantReadWriteLock.WriteLock writeLock = this.L;
            writeLock.lock();
            try {
                con conVar = this.M;
                int iN = n(Math.min(j, conVar.p()));
                if (iN <= 0) {
                    writeLock.unlock();
                    return;
                }
                List list = this.z;
                conVar.I(S((BufferedMediaSegment) list.get(iN)), false);
                list.subList(0, iN).clear();
                J();
                this.L.unlock();
            } catch (Throwable th) {
                this.L.unlock();
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final void N() throws cjt {
        Throwable th;
        if (!this.d.ax()) {
            this.M.v();
            return;
        }
        this.L.lock();
        try {
            synchronized (this.v) {
                th = this.w;
            }
            if (th == null) {
                if (this.Q || this.R) {
                    Y();
                }
            } else if (!X()) {
                if (!W()) {
                    throw new IOException("Deferred parse error", th);
                }
                if (this.p - this.M.p() <= 120000 && !this.Q) {
                    this.Q = true;
                    this.S = this.V.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.ReadWriteLockSampleHolder$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.R = true;
                        }
                    }), 30L, TimeUnit.SECONDS);
                }
                if (this.R) {
                    throw new IOException("Deferred parse error", th);
                }
            }
            this.L.unlock();
        } catch (Throwable th2) {
            this.L.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final void O() {
        this.L.lock();
        try {
            this.M.w();
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final void P() {
        this.L.lock();
        try {
            if (this.z.isEmpty()) {
                this.n = false;
                this.p = 0L;
                J();
            } else {
                y(0);
            }
            this.M.x();
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final void Q(long j) {
        this.L.lock();
        try {
            Z(j);
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final boolean R() {
        ReentrantReadWriteLock.ReadLock readLock = this.K;
        readLock.lock();
        try {
            return this.M.F(this.n);
        } finally {
            readLock.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void a() {
        this.L.lock();
        try {
            if (this.d.ax()) {
                synchronized (this.v) {
                    try {
                        this.w = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Y();
            }
            zhq zhqVar = zhq.ABR;
            this.b.name();
            String str = this.h;
            if (this.z.isEmpty()) {
                this.n = false;
                this.p = 0L;
                J();
            } else {
                y(0);
            }
            this.M.y(true);
            Z(this.P);
            this.L.unlock();
        } catch (Throwable th2) {
            this.L.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void b(BufferedMediaSegment bufferedMediaSegment, long j, long j2) {
        this.L.lock();
        try {
            super.b(bufferedMediaSegment, j, j2);
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final int d(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
        String str;
        ReentrantReadWriteLock.ReadLock readLock = this.K;
        readLock.lock();
        try {
            con conVar = this.M;
            long jQ = conVar.q();
            int iL = conVar.l(ccuVar, decoderInputBuffer, i, this.n);
            if (iL == -5) {
                readLock.lock();
                try {
                    int iM = m(jQ);
                    if (iM == -1) {
                        readLock.unlock();
                        str = null;
                    } else {
                        str = ((BufferedMediaSegment) this.z.get(iM)).f;
                        this.K.unlock();
                    }
                    if (str != null) {
                        this.N = str;
                    } else if (this.j != null) {
                        str = this.j.b;
                        this.N = str;
                    }
                } catch (Throwable th) {
                    this.K.unlock();
                    throw th;
                }
            }
            readLock.unlock();
            return iL;
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void e(bwb bwbVar, int i, int i2) {
        this.L.lock();
        try {
            this.M.d(bwbVar, i, i2);
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void f(long j, int i, int i2, int i3, cwi cwiVar) {
        this.L.lock();
        try {
            this.M.e(j, i, i2, i3, cwiVar);
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder
    public final int g(long j) {
        ReentrantReadWriteLock.ReadLock readLock = this.K;
        readLock.lock();
        try {
            con conVar = this.M;
            int iJ = conVar.j(j, this.n);
            conVar.A(iJ);
            return iJ;
        } finally {
            readLock.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void h(bse bseVar) {
        this.L.lock();
        try {
            con conVar = this.M;
            if (!bseVar.equals(conVar.r())) {
                conVar.b(bseVar);
            }
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void i(long j) {
        this.L.lock();
        try {
            this.M.i = j;
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final boolean j(BufferedMediaSegment bufferedMediaSegment, int i, boolean z) {
        ahno.F(i >= 0 && i < this.z.size());
        ReentrantReadWriteLock.WriteLock writeLock = this.L;
        writeLock.lock();
        try {
            if (bufferedMediaSegment.k()) {
                long jS = S(bufferedMediaSegment);
                con conVar = this.M;
                if (jS > conVar.p()) {
                    conVar.t(jS);
                } else {
                    if (!z) {
                        writeLock.unlock();
                        return false;
                    }
                    long jP = conVar.p();
                    conVar.G(conVar.e);
                    conVar.t(jS);
                    conVar.G(conVar.k());
                    conVar.f = jP;
                }
            }
            y(i);
            this.L.unlock();
            return true;
        } catch (Throwable th) {
            this.L.unlock();
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final boolean k(long j) {
        boolean zH = false;
        if (j != Long.MAX_VALUE) {
            this.L.lock();
            try {
                if (this.d.ax()) {
                    synchronized (this.v) {
                        try {
                            this.w = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Y();
                }
                zH = this.M.H(j, false);
                zhq zhqVar = zhq.ABR;
                this.b.name();
                String str = this.h;
                Z(j);
                this.L.unlock();
            } catch (Throwable th2) {
                this.L.unlock();
                throw th2;
            }
        }
        return zH;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder, com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final int l(brv brvVar, int i, boolean z) {
        this.L.lock();
        try {
            return this.M.g(brvVar, i, z);
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final long o(long j, cdv cdvVar) {
        ReentrantReadWriteLock.ReadLock readLock = this.K;
        readLock.lock();
        try {
            int iN = n(j);
            if (iN < 0) {
                readLock.unlock();
            } else {
                List list = this.z;
                BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) list.get(iN);
                long jE = bufferedMediaSegment.e();
                long jE2 = bufferedMediaSegment.e();
                int i = iN + 1;
                if (i < list.size()) {
                    jE2 = ((BufferedMediaSegment) list.get(i)).e();
                }
                j = cdvVar.a(j, jE, jE2);
                this.K.unlock();
            }
            return j;
        } catch (Throwable th) {
            this.K.unlock();
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final BufferState q() {
        this.K.lock();
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Utils.a(this.z, arrayList, arrayList2, this.d);
            ArrayList arrayList3 = new ArrayList(this.A);
            boolean z = this.n;
            Object objC = null;
            Double dValueOf = this.y == -9223372036854775807L ? null : Double.valueOf(this.y / 1000000.0d);
            if (this.F && this.E.g()) {
                objC = this.E.c();
            }
            return new BufferState(arrayList3, arrayList, arrayList2, z, dValueOf, (Integer) objC);
        } finally {
            this.K.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    protected final BufferedMediaSegment r(MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader, MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo) {
        this.L.lock();
        try {
            List list = this.z;
            if (!list.isEmpty()) {
                BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) aguu.K(list);
                if (!bufferedMediaSegment.j || bufferedMediaSegment.b + 1 != mediaHeaderOuterClass$MediaHeader.g) {
                    PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.d);
                    platypusExceptionBuilder.b("c", "wrongseg");
                    platypusExceptionBuilder.b("rcv", Long.toString(mediaHeaderOuterClass$MediaHeader.g));
                    platypusExceptionBuilder.b("have", Long.toString(bufferedMediaSegment.b));
                    FormatIdOuterClass$FormatId defaultInstance = mediaHeaderOuterClass$MediaHeader.h;
                    if (defaultInstance == null) {
                        defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    platypusExceptionBuilder.c("itag", defaultInstance.c);
                    platypusExceptionBuilder.c("pItag", bufferedMediaSegment.a.c);
                    throw platypusExceptionBuilder.a();
                }
                zjr zjrVar = this.d;
                if (zjrVar != null && zjrVar.dV()) {
                    TimeRangeOuterClass$TimeRange defaultInstance2 = mediaHeaderOuterClass$MediaHeader.i;
                    if (defaultInstance2 == null) {
                        defaultInstance2 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                    }
                    long j = defaultInstance2.c;
                    TimeRangeOuterClass$TimeRange defaultInstance3 = mediaHeaderOuterClass$MediaHeader.i;
                    if (defaultInstance3 == null) {
                        defaultInstance3 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                    }
                    I(bufferedMediaSegment, zic.b(j, defaultInstance3.e));
                }
            }
            BufferedMediaSegment bufferedMediaSegment2 = new BufferedMediaSegment(mediaHeaderOuterClass$MediaHeader, this.j, mediaSource$MediaSourceInfo);
            list.add(bufferedMediaSegment2);
            J();
            this.L.unlock();
            return bufferedMediaSegment2;
        } catch (Throwable th) {
            this.L.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0170 A[Catch: all -> 0x01b6, TryCatch #0 {all -> 0x01b6, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0013, B:11:0x0037, B:12:0x0051, B:16:0x005e, B:18:0x0086, B:19:0x00ac, B:21:0x00c7, B:23:0x00cd, B:25:0x00d1, B:26:0x00d5, B:28:0x00de, B:29:0x010e, B:32:0x011a, B:33:0x0134, B:35:0x0138, B:38:0x0142, B:40:0x0146, B:42:0x014e, B:44:0x015c, B:45:0x0170, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:50:0x0196), top: B:56:0x0007 }] */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    protected final MediaSegmentHolder.SegmentPushAction s(long j, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, long j2, long j3) {
        MediaSegmentHolder.SegmentPushAction segmentPushAction;
        this.L.lock();
        try {
            List list = this.z;
            if (list.isEmpty()) {
                segmentPushAction = MediaSegmentHolder.SegmentPushAction.b;
            } else {
                long j4 = ((BufferedMediaSegment) list.get(0)).b;
                long j5 = ((BufferedMediaSegment) aguu.K(list)).b;
                long j6 = 1 + j5;
                if (j == j6) {
                    if (j3 > 0) {
                        Utils.QoeErrorBuilder qoeErrorBuilder = new Utils.QoeErrorBuilder("sabr.badpartialsegment");
                        qoeErrorBuilder.b("c", "unexpectedoffset");
                        qoeErrorBuilder.b("rcv", Long.valueOf(j));
                        qoeErrorBuilder.a(this.c);
                        segmentPushAction = MediaSegmentHolder.SegmentPushAction.a;
                    } else {
                        segmentPushAction = MediaSegmentHolder.SegmentPushAction.b;
                    }
                } else if (j < j4) {
                    this.D++;
                    Utils.QoeErrorBuilder qoeErrorBuilder2 = new Utils.QoeErrorBuilder("sabr.mismatch");
                    qoeErrorBuilder2.b("rcv", Long.valueOf(j));
                    qoeErrorBuilder2.b("min", Long.valueOf(j4));
                    qoeErrorBuilder2.a(this.c);
                    A();
                    segmentPushAction = MediaSegmentHolder.SegmentPushAction.a;
                } else if (j > j6) {
                    this.D++;
                    Utils.QoeErrorBuilder qoeErrorBuilder3 = new Utils.QoeErrorBuilder("sabr.mismatch");
                    qoeErrorBuilder3.b("rcv", Long.valueOf(j));
                    qoeErrorBuilder3.b("max", Long.valueOf(j5));
                    qoeErrorBuilder3.a(this.c);
                    A();
                    segmentPushAction = MediaSegmentHolder.SegmentPushAction.a;
                } else {
                    int iM = m(j);
                    ahno.O((iM ^ (-1)) >>> 31);
                    BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) list.get(iM);
                    if (zic.g(bufferedMediaSegment.a, formatIdOuterClass$FormatId) && bufferedMediaSegment.c == j2) {
                        if (bufferedMediaSegment.j) {
                            segmentPushAction = MediaSegmentHolder.SegmentPushAction.a;
                        } else if (j3 > bufferedMediaSegment.a()) {
                            Utils.QoeErrorBuilder qoeErrorBuilder4 = new Utils.QoeErrorBuilder("sabr.badpartialsegment");
                            qoeErrorBuilder4.b("c", "badoffset");
                            qoeErrorBuilder4.b("rcv", Long.valueOf(j));
                            qoeErrorBuilder4.b("buffered", Integer.valueOf(bufferedMediaSegment.a()));
                            qoeErrorBuilder4.b("offset", Long.valueOf(j3));
                            qoeErrorBuilder4.a(this.c);
                            segmentPushAction = MediaSegmentHolder.SegmentPushAction.a;
                        } else {
                            segmentPushAction = new MediaSegmentHolder.SegmentPushAction(false, bufferedMediaSegment);
                        }
                    } else if (j3 > 0) {
                        Utils.QoeErrorBuilder qoeErrorBuilder5 = new Utils.QoeErrorBuilder("sabr.badpartialsegment");
                        qoeErrorBuilder5.b("c", "nomatch");
                        qoeErrorBuilder5.b("rcv", Long.valueOf(j));
                        qoeErrorBuilder5.a(this.c);
                        segmentPushAction = MediaSegmentHolder.SegmentPushAction.a;
                    } else if (!bufferedMediaSegment.j) {
                        Utils.QoeErrorBuilder qoeErrorBuilder6 = new Utils.QoeErrorBuilder("sabr.switchforce");
                        qoeErrorBuilder6.b("rcv", Long.valueOf(j));
                        qoeErrorBuilder6.a(this.c);
                        ahno.O(j(bufferedMediaSegment, iM, true));
                        segmentPushAction = MediaSegmentHolder.SegmentPushAction.b;
                    } else if (this.d.aK() && this.I) {
                        if (iM < list.size() - 1) {
                            int i = iM + 1;
                            if (j((BufferedMediaSegment) list.get(i), i, false)) {
                                y(iM);
                                H();
                                segmentPushAction = MediaSegmentHolder.SegmentPushAction.b;
                            } else {
                                Utils.QoeErrorBuilder qoeErrorBuilder7 = new Utils.QoeErrorBuilder("sabr.switchfail");
                                qoeErrorBuilder7.b("rcv", Long.valueOf(j));
                                qoeErrorBuilder7.a(this.c);
                                segmentPushAction = MediaSegmentHolder.SegmentPushAction.a;
                            }
                        } else {
                            y(iM);
                            H();
                            segmentPushAction = MediaSegmentHolder.SegmentPushAction.b;
                        }
                    } else if (j(bufferedMediaSegment, iM, false)) {
                        segmentPushAction = MediaSegmentHolder.SegmentPushAction.b;
                    } else {
                        Utils.QoeErrorBuilder qoeErrorBuilder8 = new Utils.QoeErrorBuilder("sabr.switchfail");
                        qoeErrorBuilder8.b("rcv", Long.valueOf(j));
                        qoeErrorBuilder8.a(this.c);
                        segmentPushAction = MediaSegmentHolder.SegmentPushAction.a;
                    }
                }
            }
            return segmentPushAction;
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final MediaSource$MediaSourceInfo t(long j) {
        ReentrantReadWriteLock.ReadLock readLock = this.K;
        readLock.lock();
        try {
            for (BufferedMediaSegment bufferedMediaSegment : this.z) {
                if (bufferedMediaSegment.b == j) {
                    MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo = bufferedMediaSegment.g;
                    readLock.unlock();
                    return mediaSource$MediaSourceInfo;
                }
            }
            if (!this.d.at() || j != 0) {
                readLock.unlock();
                return null;
            }
            MediaSegmentHolder.MsiCache msiCache = this.f;
            MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo2 = msiCache != null ? msiCache.a : null;
            this.K.unlock();
            return mediaSource$MediaSourceInfo2;
        } catch (Throwable th) {
            this.K.unlock();
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void v(long j) {
        this.L.lock();
        try {
            int iN = n(j);
            if (iN >= 0) {
                x(iN + 1);
            }
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void w() {
        this.L.lock();
        try {
            super.w();
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void x(int i) {
        MediaSegmentHolder.MediaPushReceiverImpl mediaPushReceiverImpl;
        MediaParser.MediaParserInterface mediaParserInterface;
        BufferedMediaSegment bufferedMediaSegmentL;
        this.L.lock();
        try {
            List list = this.z;
            if (i < list.size()) {
                BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) list.get(i);
                if (j(bufferedMediaSegment, i, true) && (mediaPushReceiverImpl = this.G) != null && (mediaParserInterface = mediaPushReceiverImpl.c) != null && (bufferedMediaSegmentL = mediaParserInterface.l()) != null && bufferedMediaSegmentL.b >= bufferedMediaSegment.b) {
                    mediaPushReceiverImpl.d = true;
                    mediaParserInterface.m();
                }
            }
        } finally {
            this.L.unlock();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void z(long j) {
        this.L.lock();
        try {
            int iM = m(j);
            if (iM >= 0) {
                x(iM);
            }
        } finally {
            this.L.unlock();
        }
    }
}
