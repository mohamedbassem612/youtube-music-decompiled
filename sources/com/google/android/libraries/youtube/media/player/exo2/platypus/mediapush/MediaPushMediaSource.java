package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimeline;
import com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineFactory;
import defpackage.a;
import defpackage.aghu;
import defpackage.agke;
import defpackage.agpi;
import defpackage.akwm;
import defpackage.appa;
import defpackage.axo;
import defpackage.bse;
import defpackage.bsi;
import defpackage.bss;
import defpackage.btm;
import defpackage.btn;
import defpackage.bto;
import defpackage.bwp;
import defpackage.bzg;
import defpackage.ccu;
import defpackage.ccy;
import defpackage.cdv;
import defpackage.cjt;
import defpackage.cjz;
import defpackage.cmi;
import defpackage.cml;
import defpackage.cnj;
import defpackage.cnk;
import defpackage.cnm;
import defpackage.coo;
import defpackage.cot;
import defpackage.coy;
import defpackage.cqs;
import defpackage.cra;
import defpackage.jqz;
import defpackage.vxz;
import defpackage.ywn;
import defpackage.yxl;
import defpackage.zap;
import defpackage.zbl;
import defpackage.zbx;
import defpackage.zce;
import defpackage.zcf;
import defpackage.zch;
import defpackage.zcp;
import defpackage.zhf;
import defpackage.zhq;
import defpackage.zhv;
import defpackage.zik;
import defpackage.zjd;
import defpackage.zjr;
import defpackage.zkf;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MediaPushMediaSource extends cmi implements cnk, zap {
    private volatile LiveTimeline G;
    public final BufferManagerImpl a;
    public final zjr b;
    public final bss d;
    public volatile long e;
    public volatile btn f;
    public final zcf g;
    public final boolean h;
    public volatile zap i;
    public zch j;
    public volatile LiveTimelineFactory k;
    private final Long n;
    private final Handler o;
    private final cjz p;
    private final boolean r;
    private final long u;
    private final AtomicInteger x;
    public final EarlyClient c = new EarlyClient();
    private final Map q = new EnumMap(jqz.class);
    private final AtomicLong s = new AtomicLong(-9223372036854775807L);
    private final AtomicReference t = new AtomicReference(null);
    private long v = -1;
    private long w = 0;
    private final EnumSet C = EnumSet.allOf(CsiTicks.class);
    private Optional D = Optional.empty();
    private volatile boolean E = false;
    public volatile boolean l = false;
    public volatile boolean m = true;
    private final EnumSet F = EnumSet.noneOf(jqz.class);

    /* JADX INFO: compiled from: PG */
    public interface Client {
        void h(jqz jqzVar, bse bseVar, long j, String str);

        void i();

        void j(long j, long j2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PG */
    final class CsiTicks {
        public static final CsiTicks a;
        public static final CsiTicks b;
        private static final /* synthetic */ CsiTicks[] c;

        static {
            CsiTicks csiTicks = new CsiTicks("AUDIO_FULLY_BUFFERED", 0);
            a = csiTicks;
            CsiTicks csiTicks2 = new CsiTicks("VIDEO_FULLY_BUFFERED", 1);
            b = csiTicks2;
            c = new CsiTicks[]{csiTicks, csiTicks2};
        }

        public static CsiTicks[] values() {
            return (CsiTicks[]) c.clone();
        }
    }

    /* JADX INFO: compiled from: PG */
    final class EarlyClient implements Client {
        public final List a = new ArrayList();
        public volatile Client b = null;

        private final void a(axo axoVar) {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.a.add(axoVar);
                        return;
                    }
                }
            }
            axoVar.accept(this.b);
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource.Client
        public final void h(final jqz jqzVar, final bse bseVar, final long j, final String str) {
            a(new axo() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource$EarlyClient$$ExternalSyntheticLambda0
                @Override // defpackage.axo
                public final void accept(Object obj) {
                    ((MediaPushMediaSource.Client) obj).h(jqzVar, bseVar, j, str);
                }
            });
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource.Client
        public final void i() {
            a(new MediaPushMediaSource$EarlyClient$$ExternalSyntheticLambda1());
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource.Client
        public final void j(long j, long j2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: PG */
    class SampleQueueReader implements coo {
        public final jqz a;
        public final cqs b;
        public volatile cqs c;
        private final SampleHolder e;
        private final boolean f;
        private final boolean g;
        private boolean h = false;
        private boolean i = false;
        private boolean j;

        public SampleQueueReader(jqz jqzVar, cqs cqsVar, boolean z) {
            this.a = jqzVar;
            this.f = jqzVar == jqz.TRACK_TYPE_VIDEO;
            this.g = jqzVar == jqz.TRACK_TYPE_AUDIO;
            this.e = MediaPushMediaSource.this.a.d(jqzVar);
            this.b = cqsVar;
            this.c = MediaPushMediaSource.this.j.a(jqzVar);
            this.j = z;
        }

        private final String e() {
            bse bseVarC;
            String str;
            int iCn;
            cqs cqsVar = this.c;
            return (cqsVar == null || (bseVarC = cqsVar.c()) == null || (str = bseVarC.a) == null || (iCn = zik.cn(str)) == -1) ? "" : a.bR(iCn, ";itag.");
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        private final boolean g() {
            if (this.a == jqz.TRACK_TYPE_VIDEO) {
                MediaPushMediaSource mediaPushMediaSource = MediaPushMediaSource.this;
                if (mediaPushMediaSource.l || mediaPushMediaSource.b.l.m(69, 45792430L)) {
                    if (!this.b.equals(this.c)) {
                        return false;
                    }
                }
            } else if (!this.b.equals(this.c)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.coo
        public final /* synthetic */ int a() {
            return 0;
        }

        @Override // defpackage.coo
        public final int b(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
            int i2;
            if (g()) {
                return -3;
            }
            SampleHolder sampleHolder = this.e;
            long jL = sampleHolder.L();
            int iD = sampleHolder.d(ccuVar, decoderInputBuffer, this.j ? i | 2 : i);
            if (iD == -5 && (i & 1) == 0) {
                this.j = false;
            }
            MediaPushMediaSource mediaPushMediaSource = MediaPushMediaSource.this;
            if (mediaPushMediaSource.h) {
                boolean z = this.f;
                if (z || this.g) {
                    String str = true != z ? "a" : "v";
                    if (iD != -3) {
                        this.h = false;
                    } else if (!this.h && !sampleHolder.R()) {
                        this.h = true;
                        long jH = mediaPushMediaSource.H();
                        long jF = bwp.F(mediaPushMediaSource.gt());
                        mediaPushMediaSource.g.Z.w("rbrd", "track_starved." + str + ";pos." + jH + ";buf_p." + jF + e());
                    }
                    if (!decoderInputBuffer.waitingForKeys) {
                        this.i = false;
                    } else if (!this.i) {
                        this.i = true;
                        mediaPushMediaSource.g.Z.w("rbrd", "track_waiting_keys." + str + e());
                    }
                    i2 = -5;
                } else {
                    i2 = -5;
                    jL = jL;
                }
            } else {
                jL = jL;
                i2 = -5;
            }
            if (iD == i2) {
                EarlyClient earlyClient = mediaPushMediaSource.c;
                jqz jqzVar = this.a;
                Object obj = ccuVar.b;
                zkf.d(obj);
                earlyClient.h(jqzVar, (bse) obj, jL, sampleHolder.N);
            }
            return iD;
        }

        @Override // defpackage.coo
        public final int c(long j) {
            if (g()) {
                return 0;
            }
            return this.e.g(j);
        }

        @Override // defpackage.coo
        public final boolean f() {
            return !g() && this.e.R();
        }

        @Override // defpackage.coo
        public final void gu() throws cjt {
            this.e.N();
        }
    }

    public MediaPushMediaSource(zcf zcfVar, BufferManagerImpl bufferManagerImpl, Handler handler, cjz cjzVar, zjr zjrVar) {
        boolean z = true;
        this.g = zcfVar;
        this.a = bufferManagerImpl;
        this.o = handler;
        this.p = cjzVar;
        this.b = zjrVar;
        this.h = zjrVar.dw();
        if (!zcfVar.A.J() || (zcfVar.e == -1 && zcfVar.f == -1)) {
            z = false;
        }
        this.r = z;
        long jA = zcfVar.a();
        if (jA == zjrVar.v() && z && zcfVar.e != -1) {
            jA = TimeUnit.MILLISECONDS.toMicros(zcfVar.e);
        }
        this.e = jA;
        this.x = new AtomicInteger(0);
        this.j = zch.a;
        akwm akwmVar = zcfVar.y.d.f;
        this.u = bwp.y((akwmVar == null ? akwm.b : akwmVar).aP);
        zce zceVar = new zce(null, zcfVar);
        bsi bsiVar = new bsi();
        bsiVar.b = Uri.EMPTY;
        bsiVar.d = zceVar;
        this.d = bsiVar.a();
        this.n = zjrVar.eK() ? Long.valueOf(zjrVar.v()) : null;
    }

    private final long Q() {
        Long l = this.n;
        return l == null ? this.b.v() : l.longValue();
    }

    private final void R() {
        cnj cnjVar;
        if (this.f == null || !this.E || (cnjVar = (cnj) this.t.getAndSet(null)) == null) {
            return;
        }
        cnjVar.gp(this);
    }

    private final void S(boolean z, long j, long j2) {
        if (z) {
            zjr zjrVar = this.b;
            if (zjrVar.t() > 0) {
                this.x.set(zjrVar.t());
            }
        }
        AtomicInteger atomicInteger = this.x;
        if (atomicInteger.get() > 0) {
            atomicInteger.decrementAndGet();
            zcf zcfVar = this.g;
            String string = (j == Long.MAX_VALUE ? "max" : Long.valueOf(bwp.F(j))).toString();
            Object objValueOf = j2 != Long.MAX_VALUE ? Long.valueOf(bwp.F(j2)) : "max";
            zcfVar.Z.w("mpmsps", string + '.' + objValueOf.toString() + '.' + zhf.d());
        }
    }

    private final boolean T(jqz jqzVar) {
        MediaSegmentHolder mediaSegmentHolderC = this.a.c(jqzVar);
        long jMax = mediaSegmentHolderC.n ? Long.MIN_VALUE : Math.max(0L, mediaSegmentHolderC.p);
        return jMax == Long.MIN_VALUE || jMax - this.w >= this.v;
    }

    private final boolean U(LiveTimeline liveTimeline) {
        return this.g.x.a() - (liveTimeline.m / 1000) >= this.b.F();
    }

    public final long H() {
        long j = this.e;
        if (j == Q()) {
            return Q();
        }
        if (j == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return j / 1000;
    }

    public final synchronized void I(zch zchVar, Client client) {
        zhq zhqVar = zhq.ABR;
        EarlyClient earlyClient = this.c;
        synchronized (earlyClient) {
            try {
                zkf.c(earlyClient.b == null);
                earlyClient.b = client;
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = earlyClient.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((axo) it.next()).accept(client);
        }
        list.clear();
        N(zchVar);
        zcf zcfVar = this.g;
        if (zcfVar.A.J()) {
            zkf.d(zcfVar);
            long j = zcfVar.e;
            long micros = j == -1 ? 0L : TimeUnit.MILLISECONDS.toMicros(j);
            long j2 = zcfVar.f;
            long micros2 = j2 == -1 ? TimeUnit.MILLISECONDS.toMicros(zcfVar.A.h) : TimeUnit.MILLISECONDS.toMicros(j2);
            P(new cot(micros2, micros2 - micros, micros, true, false, this.d));
        } else if (zcfVar.A.D()) {
            P(new zbl(zcfVar.A.H(), this.d));
            this.k = new LiveTimelineFactory(new axo() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource$$ExternalSyntheticLambda2
                @Override // defpackage.axo
                public final void accept(Object obj) {
                    this.a.P((LiveTimeline) obj);
                }
            }, zcfVar.y.aC());
        }
        this.v = bwp.y(zcfVar.y.q());
        this.D = Optional.ofNullable(zcfVar.b.b());
        agke agkeVar = zchVar.d;
        if (!agkeVar.contains(jqz.TRACK_TYPE_AUDIO)) {
            this.C.remove(CsiTicks.a);
        }
        if (!agkeVar.contains(jqz.TRACK_TYPE_VIDEO)) {
            this.C.remove(CsiTicks.b);
        }
    }

    public final void J() {
        LiveTimeline liveTimeline;
        synchronized (this) {
            this.m = true;
            liveTimeline = this.G;
            this.G = null;
        }
        zjr zjrVar = this.b;
        if (zjrVar.bu()) {
            if (liveTimeline == null) {
                zhq zhqVar = zhq.ABR;
                return;
            }
            boolean zU = U(liveTimeline);
            zcf zcfVar = this.g;
            zcfVar.x.a();
            zjrVar.F();
            zhq zhqVar2 = zhq.ABR;
            if (zU) {
                zcfVar.af.af(zcfVar, appa.SEEK_SOURCE_PEG_TO_LIVE);
            } else {
                P(liveTimeline);
            }
        }
    }

    public final void K() {
        zhq zhqVar = zhq.ABR;
        this.l = true;
    }

    public final void L() {
        this.E = true;
        R();
    }

    public final void M(long j) {
        this.s.set(j);
    }

    public final synchronized void N(zch zchVar) {
        this.g.ab = zchVar;
        if (zchVar != this.j) {
            zhq zhqVar = zhq.ABR;
            Collection.EL.stream(zchVar.d).map(new MediaPushMediaSource$$ExternalSyntheticLambda0()).collect(aghu.a);
            for (SampleQueueReader sampleQueueReader : this.q.values()) {
                sampleQueueReader.c = zchVar.a(sampleQueueReader.a);
            }
            this.j = zchVar;
            R();
        }
    }

    public final void O(long j) {
        S(false, this.e, j);
        this.e = j;
    }

    public final void P(btn btnVar) {
        if (btnVar.equals(this.f)) {
            return;
        }
        if (this.b.bu() && (btnVar instanceof LiveTimeline)) {
            LiveTimeline liveTimeline = (LiveTimeline) btnVar;
            synchronized (this) {
                if (!this.m) {
                    this.G = liveTimeline;
                    return;
                }
            }
        }
        zcf zcfVar = this.g;
        if (zcfVar.H.dI() && (this.f instanceof zbl) && (btnVar instanceof LiveTimeline)) {
            LiveTimeline liveTimeline2 = (LiveTimeline) btnVar;
            if (zcfVar.A.H() && this.e != Q() && this.e != Long.MAX_VALUE) {
                long j = liveTimeline2.m;
                if (this.e > j) {
                    ywn ywnVar = zcfVar.Z;
                    zhv zhvVar = new zhv("invalid.parameter");
                    zhvVar.c = "st." + this.e + ";headtime." + j;
                    zhvVar.e = false;
                    ywnVar.k(zhvVar.a());
                    O(Long.MAX_VALUE);
                }
            }
        }
        this.f = btnVar;
        this.o.post(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MediaPushMediaSource mediaPushMediaSource = this.a;
                btn btnVar2 = mediaPushMediaSource.f;
                zkf.d(btnVar2);
                mediaPushMediaSource.z(btnVar2);
            }
        });
        R();
    }

    @Override // defpackage.cnk
    public final long a(long j, cdv cdvVar) {
        vxz vxzVar = this.g.H.j;
        long jO = this.a.b.o(j, cdvVar);
        btn btnVar = this.f;
        return (!vxzVar.m(130, 45425447L) || btnVar == null || btnVar.n() || !(btnVar instanceof LiveTimeline)) ? jO : Math.max(btnVar.e(0, new btm(), 0L).q, jO);
    }

    @Override // defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        if (!this.r) {
            return this;
        }
        zjr zjrVar = this.b;
        zcf zcfVar = this.g;
        long j2 = zcfVar.e;
        boolean zDs = zjrVar.ds();
        long micros = j2 == -1 ? 0L : TimeUnit.MILLISECONDS.toMicros(j2);
        long j3 = zcfVar.f;
        return new cml(this, zDs, micros, j3 == -1 ? Long.MIN_VALUE : TimeUnit.MILLISECONDS.toMicros(j3));
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long d() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final long e() {
        return this.s.getAndSet(-9223372036854775807L);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[PHI: r5 r14
      0x00aa: PHI (r5v1 boolean) = (r5v0 boolean), (r5v4 boolean), (r5v4 boolean), (r5v4 boolean), (r5v4 boolean) binds: [B:25:0x005a, B:35:0x0086, B:41:0x00a2, B:39:0x009e, B:40:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r14v2 long) = (r14v1 long), (r14v1 long), (r14v1 long), (r14v1 long), (r14v5 long) binds: [B:25:0x005a, B:35:0x0086, B:41:0x00a2, B:39:0x009e, B:40:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    @Override // defpackage.cnk
    public final long f(long j) {
        long j2;
        long micros;
        long j3;
        zhq zhqVar = zhq.ABR;
        btn btnVar = this.f;
        boolean z = btnVar instanceof zbl;
        zcf zcfVar = this.g;
        j = 0;
        boolean z2 = false;
        if (z) {
            if (j == 0) {
                j2 = zcfVar.A.z() ? Long.MAX_VALUE : LiveTimeline.d;
                z2 = true;
            } else {
                j = j;
                j2 = j;
                z2 = false;
            }
        } else if (btnVar instanceof LiveTimeline) {
            LiveTimeline liveTimeline = (LiveTimeline) btnVar;
            long j4 = liveTimeline.h == -9223372036854775807L ? liveTimeline.l + liveTimeline.f : liveTimeline.f;
            boolean z3 = j == 0;
            j2 = j == 0 ? j4 : j;
            if (zcfVar.y.aC()) {
                long jB = zcfVar.A.b();
                if (jB > 0) {
                    micros = TimeUnit.MILLISECONDS.toMicros(jB);
                } else {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    micros = 5000000;
                }
                z2 = j2 == j4 || Math.abs(j2 - liveTimeline.g) <= micros;
                if (z2) {
                    zjr zjrVar = this.b;
                    if (zjrVar.bu()) {
                        boolean zU = U(liveTimeline);
                        zcfVar.x.a();
                        long j5 = liveTimeline.m;
                        zjrVar.F();
                        if (true == zU) {
                            j2 = Long.MAX_VALUE;
                        }
                    } else if (j2 == j4) {
                        z2 = z2;
                        j2 = Long.MAX_VALUE;
                    }
                    z2 = z2;
                } else {
                    z2 = z2;
                }
            } else {
                z2 = z2;
            }
            z2 = z3;
        } else {
            j = j;
            j2 = j;
            z2 = false;
        }
        if (z2 || j2 > 100000) {
            j3 = j2;
        } else {
            long jA = this.a.a();
            if (j2 >= jA || jA > 100000) {
                j3 = j2;
            } else {
                j3 = jA;
            }
        }
        long j6 = this.e;
        S(true, this.e, j3);
        this.e = j3;
        this.w = j3;
        EarlyClient earlyClient = this.c;
        long j7 = this.e;
        if (earlyClient.b == null) {
            synchronized (earlyClient) {
                if (earlyClient.b != null) {
                    earlyClient.b.j(j7, j6);
                }
            }
        } else {
            earlyClient.b.j(j7, j6);
        }
        if ((!this.b.bu() || !(btnVar instanceof LiveTimeline) || !z2) && j3 != Long.MAX_VALUE) {
            return j3;
        }
        if (this.k != null) {
            this.k.h = true;
        }
        S(true, j6, j);
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    @Override // defpackage.cnk
    public final synchronized long g(cqs[] cqsVarArr, boolean[] zArr, coo[] cooVarArr, boolean[] zArr2, long j) {
        long j2;
        SampleQueueReader sampleQueueReader;
        zhq zhqVar = zhq.ABR;
        this.w = j;
        EnumSet enumSetNoneOf = EnumSet.noneOf(jqz.class);
        for (int i = 0; i < cqsVarArr.length; i++) {
            cqs cqsVar = cqsVarArr[i];
            jqz jqzVar = null;
            if (cqsVar == null || !zArr[i]) {
                cooVarArr[i] = null;
            }
            if (cqsVar != null) {
                coo cooVar = cooVarArr[i];
                if (cooVar instanceof SampleQueueReader) {
                    sampleQueueReader = (SampleQueueReader) cooVar;
                    zkf.c(sampleQueueReader.b.equals(sampleQueueReader.c) && cqsVar.equals(sampleQueueReader.c));
                } else {
                    switch (i) {
                        case 0:
                        case 3:
                        case 4:
                            jqzVar = jqz.TRACK_TYPE_AUDIO;
                            break;
                        case 1:
                        case 2:
                        case 5:
                        case 6:
                            jqzVar = jqz.TRACK_TYPE_VIDEO;
                            break;
                    }
                    zkf.d(jqzVar);
                    SampleQueueReader sampleQueueReader2 = new SampleQueueReader(jqzVar, cqsVar, this.b.bH());
                    this.q.put(jqzVar, sampleQueueReader2);
                    cooVarArr[i] = sampleQueueReader2;
                    zArr2[i] = true;
                    sampleQueueReader = sampleQueueReader2;
                }
                enumSetNoneOf.add(sampleQueueReader.a);
            }
        }
        if (this.b.bH()) {
            if (!this.m) {
                for (jqz jqzVar2 : this.q.keySet()) {
                    if (!enumSetNoneOf.contains(jqzVar2)) {
                        this.F.add(jqzVar2);
                    }
                }
            }
            Map map = this.q;
            map.keySet().retainAll(enumSetNoneOf);
            EnumSet enumSet = this.F;
            if (!enumSet.isEmpty()) {
                if (j == Q() && this.e != Q()) {
                    j2 = this.e;
                    M(this.e);
                } else if (j <= 100000) {
                    long jA = this.a.a();
                    if (j >= jA || jA > 100000) {
                        j2 = j;
                    } else {
                        j2 = jA;
                    }
                } else {
                    j2 = j;
                }
                for (jqz jqzVar3 : map.keySet()) {
                    if (enumSet.remove(jqzVar3)) {
                        this.a.f(jqzVar3, j2).booleanValue();
                    }
                }
            }
        }
        return j;
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long gt() {
        agke agkeVar;
        EnumSet enumSet = this.C;
        if (!enumSet.isEmpty() && !this.D.isEmpty() && this.v >= 0) {
            CsiTicks csiTicks = CsiTicks.a;
            if (enumSet.contains(csiTicks) && T(jqz.TRACK_TYPE_AUDIO)) {
                enumSet.remove(csiTicks);
                ((zjd) this.D.get()).c();
            }
            CsiTicks csiTicks2 = CsiTicks.b;
            if (enumSet.contains(csiTicks2) && T(jqz.TRACK_TYPE_VIDEO)) {
                enumSet.remove(csiTicks2);
                ((zjd) this.D.get()).aw();
            }
        }
        synchronized (this) {
            agkeVar = this.j.d;
        }
        BufferManagerImpl bufferManagerImpl = this.a;
        if (agkeVar.isEmpty()) {
            return 0L;
        }
        int i = ((agpi) agkeVar).d;
        boolean z = true;
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            MediaSegmentHolder mediaSegmentHolderC = bufferManagerImpl.c((jqz) agkeVar.get(i2));
            jMin = Math.min(jMin, mediaSegmentHolderC.p);
            z &= mediaSegmentHolderC.n;
        }
        if (z) {
            return Long.MIN_VALUE;
        }
        return Math.max(0L, jMin);
    }

    @Override // defpackage.cnk
    public final /* synthetic */ long h(long j) {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final synchronized coy i() {
        ArrayList arrayList;
        zch zchVar = this.j;
        arrayList = new ArrayList();
        zbx zbxVar = zchVar.b;
        if (zbxVar != null) {
            arrayList.add(zbxVar.h());
        }
        zcp zcpVar = zchVar.c;
        if (zcpVar != null) {
            arrayList.add(zcpVar.e());
        }
        return new coy((bto[]) arrayList.toArray(new bto[0]));
    }

    @Override // defpackage.zap
    public final long jE(long j) {
        if (this.i != null) {
            return this.i.jE(j);
        }
        return -1L;
    }

    @Override // defpackage.cno
    public final bss jF() {
        return this.d;
    }

    @Override // defpackage.cmi
    protected final void jH(bzg bzgVar) {
        this.p.e(this.o.getLooper(), r());
        if (this.f != null) {
            z(this.f);
        }
    }

    @Override // defpackage.cmi
    protected final void jI() {
        synchronized (this) {
            this.q.clear();
            this.j = zch.a;
            this.F.clear();
        }
        zjr zjrVar = this.b;
        if (zjrVar.dY() && zjrVar.bH() && !this.m) {
            this.a.i();
        }
    }

    @Override // defpackage.cno
    public final void k(cnk cnkVar) {
        if (this.b.bH() && !this.m) {
            synchronized (this) {
                EnumSet enumSet = this.F;
                enumSet.addAll(this.j.d);
                Map map = this.q;
                enumSet.addAll(map.keySet());
                map.clear();
            }
        }
        zjr zjrVar = this.b;
        if (zjrVar.dY() && (!zjrVar.bH() || this.m)) {
            this.a.i();
        }
        this.c.i();
    }

    @Override // defpackage.cnk
    public final void l(cnj cnjVar, long j) {
        zhq zhqVar = zhq.ABR;
        this.t.set(cnjVar);
        R();
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean o(ccy ccyVar) {
        return false;
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean p() {
        return gt() != Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final void q(long j) {
        if ((this.f instanceof zbl) || (this.f instanceof LiveTimeline)) {
            if (j == LiveTimeline.d || j == Long.MAX_VALUE) {
                return;
            }
            if (this.g.H.j.m(147, 45430057L) && j <= 0) {
                return;
            }
        }
        O(j);
        BufferManagerImpl bufferManagerImpl = this.a;
        long jMax = Math.max(0L, j - this.u);
        bufferManagerImpl.a.M(jMax);
        bufferManagerImpl.b.M(jMax);
        CaptionMediaSegmentHolder captionMediaSegmentHolder = bufferManagerImpl.c;
        if (jMax >= captionMediaSegmentHolder.q) {
            synchronized (captionMediaSegmentHolder) {
                int iN = captionMediaSegmentHolder.n(jMax);
                if (iN > 0) {
                    captionMediaSegmentHolder.z.subList(0, iN).clear();
                    captionMediaSegmentHolder.J();
                }
            }
        }
        yxl yxlVar = captionMediaSegmentHolder.a;
        if (yxlVar != null) {
            yxlVar.bl(Duration.ofMillis(jMax / 1000));
        }
    }

    @Override // defpackage.cnk
    public final void j() {
    }

    @Override // defpackage.cno
    public final void jG() {
    }

    @Override // defpackage.cnk
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.cnk, defpackage.coq
    public final void m(long j) {
    }
}
