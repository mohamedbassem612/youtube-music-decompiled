package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.MediaHeaderOuterClass$MediaHeader;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.RequestIdentifierOuterClass$RequestIdentifier;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.android.libraries.youtube.media.interfaces.BufferState;
import com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import com.google.protos.youtube.api.innertube.MediaSource$MediaSourceInfo;
import defpackage.abxv;
import defpackage.agdf;
import defpackage.agev;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.aiow;
import defpackage.axo;
import defpackage.brv;
import defpackage.bse;
import defpackage.bwb;
import defpackage.bwp;
import defpackage.cdv;
import defpackage.cwi;
import defpackage.elr;
import defpackage.jqz;
import defpackage.xeu;
import defpackage.yno;
import defpackage.ywx;
import defpackage.zhq;
import defpackage.zic;
import defpackage.zik;
import defpackage.zjr;
import defpackage.zkf;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaSegmentHolder {
    public final boolean B;
    public final boolean C;
    final boolean F;
    protected volatile MediaPushReceiverImpl G;
    public volatile FormatIdOuterClass$FormatId H;
    protected boolean I;
    public final abxv J;
    private final long K;
    private volatile LiveEofListener a;
    final jqz b;
    final axo c;
    final zjr d;
    protected final StartPositionTracker e;
    protected volatile MsiCache f;
    final String h;
    volatile long i;
    volatile boolean n;
    volatile long p;
    volatile long t;
    protected Throwable w;
    public volatile FormatInitializationMetadataListener x;
    protected volatile boolean g = false;
    public volatile RequestIdentifierOuterClass$RequestIdentifier j = null;
    protected final Map k = new ConcurrentHashMap();
    public volatile FormatInitializationMetadataOuterClass$FormatInitializationMetadata l = null;
    protected final Map m = new HashMap();
    protected volatile boolean o = false;
    volatile long q = Long.MAX_VALUE;
    volatile long r = -1;
    volatile long s = -1;
    protected volatile long u = -1;
    protected final Object v = new Object();
    volatile long y = -9223372036854775807L;
    final List A = new CopyOnWriteArrayList();
    protected int D = 0;
    volatile agev E = agdf.a;
    final List z = new ArrayList();

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    public interface FormatInitializationMetadataListener {
        void z(jqz jqzVar);
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    public interface LiveEofListener {
        void A();

        void l(long j, long j2);
    }

    /* JADX INFO: compiled from: PG */
    public final class MsiCache {
        final MediaSource$MediaSourceInfo a;

        public MsiCache(MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo) {
            this.a = mediaSource$MediaSourceInfo;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class SegmentPushAction {
        static final SegmentPushAction a = new SegmentPushAction(true, null);
        static final SegmentPushAction b = new SegmentPushAction(false, null);
        final boolean c;
        final BufferedMediaSegment d;

        public SegmentPushAction(boolean z, BufferedMediaSegment bufferedMediaSegment) {
            this.c = z;
            this.d = bufferedMediaSegment;
        }
    }

    public MediaSegmentHolder(jqz jqzVar, axo axoVar, long j, String str, abxv abxvVar, zjr zjrVar, StartPositionTracker startPositionTracker, Long l) {
        this.t = -1L;
        this.b = jqzVar;
        this.c = axoVar;
        this.i = j;
        this.h = str;
        this.J = abxvVar;
        this.B = zjrVar.j.m(138, 45427330L);
        this.C = zjrVar.j.m(142, 45427861L);
        this.F = zjrVar.l.m(6, 45624008L);
        this.d = zjrVar;
        this.e = startPositionTracker;
        long jD = zjrVar.l.d(1, 45680864L);
        this.K = jD <= 0 ? 5L : jD;
        if (l != null) {
            this.t = l.longValue();
        }
    }

    private final void d() {
        if (this.a == null || !this.n) {
            return;
        }
        this.a.A();
    }

    static String u(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        return formatIdOuterClass$FormatId.c + '.' + formatIdOuterClass$FormatId.e + '.' + formatIdOuterClass$FormatId.d;
    }

    protected final void A() throws PlatypusException {
        if (this.D < this.K) {
            return;
        }
        PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.f);
        platypusExceptionBuilder.b("c", "repeated_sabr_mismatch");
        throw platypusExceptionBuilder.a();
    }

    protected final void B() {
        if (this.a == null || this.r == -1) {
            return;
        }
        this.a.l(this.r, this.s);
    }

    public void C(ywx ywxVar, BufferedMediaSegment bufferedMediaSegment) {
        if (ywxVar.a.equals("http://youtube.com/streaming/metadata/segment/102015")) {
            Long lC = ywxVar.c("Ingestion-Walltime-Us");
            if (lC != null) {
                this.y = lC.longValue() - bufferedMediaSegment.e();
            }
            if ("T".equals(ywxVar.d("Stream-Finished"))) {
                long j = bufferedMediaSegment.b;
                F(j);
                this.r = j;
                this.s = bufferedMediaSegment.e();
                B();
            }
        }
    }

    final void D() {
        if (this.n) {
            return;
        }
        this.n = true;
        d();
    }

    public final void E(LiveEofListener liveEofListener) {
        this.a = liveEofListener;
        d();
        B();
    }

    public void F(long j) {
        boolean z;
        if (this.u == -1) {
            this.u = j;
            synchronized (this) {
                int iM = m(j);
                z = false;
                if (iM >= 0 && ((BufferedMediaSegment) this.z.get(iM)).j) {
                    z = true;
                }
            }
            if (z) {
                D();
            }
        }
    }

    public void G(long j) {
        boolean z;
        this.t = j;
        if (this.t != -1) {
            synchronized (this) {
                int iM = m(j);
                z = false;
                if (iM >= 0 && ((BufferedMediaSegment) this.z.get(iM)).j) {
                    z = true;
                }
            }
            if (z) {
                D();
            }
        }
    }

    final void J() {
        List list = this.z;
        this.q = list.isEmpty() ? Long.MAX_VALUE : ((BufferedMediaSegment) list.get(0)).d();
    }

    public synchronized void a() {
        this.z.clear();
        this.n = false;
        this.p = 0L;
        J();
    }

    public void b(BufferedMediaSegment bufferedMediaSegment, long j, long j2) {
        bufferedMediaSegment.g(j, j2);
        this.p = bufferedMediaSegment.e() + bufferedMediaSegment.c();
    }

    public abstract void e(bwb bwbVar, int i, int i2);

    public abstract void f(long j, int i, int i2, int i3, cwi cwiVar);

    public abstract void h(bse bseVar);

    public abstract void i(long j);

    public synchronized boolean j(BufferedMediaSegment bufferedMediaSegment, int i, boolean z) {
        y(i);
        return true;
    }

    public abstract boolean k(long j);

    public abstract int l(brv brvVar, int i, boolean z);

    final int m(long j) {
        MediaSegmentHolder$$ExternalSyntheticLambda2 mediaSegmentHolder$$ExternalSyntheticLambda2 = new MediaSegmentHolder$$ExternalSyntheticLambda2();
        List list = this.z;
        int iAm = bwp.am(aguu.u(list, mediaSegmentHolder$$ExternalSyntheticLambda2), Long.valueOf(j));
        if (iAm < 0 || iAm >= list.size() || ((BufferedMediaSegment) list.get(iAm)).b != j) {
            return -1;
        }
        return iAm;
    }

    final int n(long j) {
        MediaSegmentHolder$$ExternalSyntheticLambda1 mediaSegmentHolder$$ExternalSyntheticLambda1 = new MediaSegmentHolder$$ExternalSyntheticLambda1();
        List list = this.z;
        int iAm = bwp.am(aguu.u(list, mediaSegmentHolder$$ExternalSyntheticLambda1), Long.valueOf(j));
        if (iAm >= 0 && iAm < list.size()) {
            BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) list.get(iAm);
            if (bufferedMediaSegment.e() <= j && j < bufferedMediaSegment.d()) {
                return iAm;
            }
        }
        return -1;
    }

    public synchronized long o(long j, cdv cdvVar) {
        int iN = n(j);
        if (iN >= 0) {
            List list = this.z;
            BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) list.get(iN);
            long jE = bufferedMediaSegment.e();
            long jE2 = bufferedMediaSegment.e();
            int i = iN + 1;
            if (i < list.size()) {
                jE2 = ((BufferedMediaSegment) list.get(i)).e();
            }
            j = cdvVar.a(j, jE, jE2);
        }
        return j;
    }

    final FormatInitializationMetadataOuterClass$FormatInitializationMetadata p(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        return (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) this.k.get(u(formatIdOuterClass$FormatId));
    }

    public synchronized BufferState q() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z;
        Object objC;
        Double dValueOf;
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        Utils.a(this.z, arrayList, arrayList2, this.d);
        arrayList3 = new ArrayList(this.A);
        z = this.n;
        objC = null;
        dValueOf = this.y == -9223372036854775807L ? null : Double.valueOf(this.y / 1000000.0d);
        if (this.F && this.E.g()) {
            objC = this.E.c();
        }
        return new BufferState(arrayList3, arrayList, arrayList2, z, dValueOf, (Integer) objC);
    }

    protected synchronized BufferedMediaSegment r(MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader, MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo) {
        BufferedMediaSegment bufferedMediaSegment;
        List list = this.z;
        if (!list.isEmpty()) {
            BufferedMediaSegment bufferedMediaSegment2 = (BufferedMediaSegment) aguu.K(list);
            if (!bufferedMediaSegment2.j || bufferedMediaSegment2.b + 1 != mediaHeaderOuterClass$MediaHeader.g) {
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.d);
                platypusExceptionBuilder.b("c", "wrongseg");
                platypusExceptionBuilder.b("rcv", Long.toString(mediaHeaderOuterClass$MediaHeader.g));
                platypusExceptionBuilder.b("have", Long.toString(bufferedMediaSegment2.b));
                FormatIdOuterClass$FormatId defaultInstance = mediaHeaderOuterClass$MediaHeader.h;
                if (defaultInstance == null) {
                    defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                }
                platypusExceptionBuilder.c("itag", defaultInstance.c);
                platypusExceptionBuilder.c("pItag", bufferedMediaSegment2.a.c);
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
                I(bufferedMediaSegment2, zic.b(j, defaultInstance3.e));
            }
        }
        bufferedMediaSegment = new BufferedMediaSegment(mediaHeaderOuterClass$MediaHeader, this.j, mediaSource$MediaSourceInfo);
        list.add(bufferedMediaSegment);
        J();
        return bufferedMediaSegment;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0151 A[Catch: all -> 0x01c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:9:0x0027, B:14:0x004c, B:18:0x0078, B:21:0x00a2, B:23:0x00bb, B:25:0x00c1, B:27:0x00c5, B:30:0x00c9, B:32:0x00d2, B:33:0x0107, B:38:0x0112, B:40:0x0116, B:42:0x011e, B:44:0x0122, B:46:0x012a, B:48:0x0138, B:51:0x0151, B:54:0x015b, B:56:0x0161, B:62:0x017e, B:65:0x019e, B:59:0x017a), top: B:72:0x0001 }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    protected synchronized SegmentPushAction s(long j, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, long j2, long j3) {
        SegmentPushAction segmentPushAction;
        SegmentPushAction segmentPushAction2;
        List list = this.z;
        if (list.isEmpty()) {
            segmentPushAction = SegmentPushAction.b;
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
                    return SegmentPushAction.a;
                }
            } else {
                if (j < j4) {
                    this.D++;
                    Utils.QoeErrorBuilder qoeErrorBuilder2 = new Utils.QoeErrorBuilder("sabr.mismatch");
                    qoeErrorBuilder2.b("rcv", Long.valueOf(j));
                    qoeErrorBuilder2.b("min", Long.valueOf(j4));
                    qoeErrorBuilder2.a(this.c);
                    A();
                    return SegmentPushAction.a;
                }
                if (j > j6) {
                    this.D++;
                    Utils.QoeErrorBuilder qoeErrorBuilder3 = new Utils.QoeErrorBuilder("sabr.mismatch");
                    qoeErrorBuilder3.b("rcv", Long.valueOf(j));
                    qoeErrorBuilder3.b("max", Long.valueOf(j5));
                    qoeErrorBuilder3.a(this.c);
                    A();
                    return SegmentPushAction.a;
                }
                int iM = m(j);
                zkf.c((iM ^ (-1)) >>> 31);
                BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) list.get(iM);
                if (zic.g(bufferedMediaSegment.a, formatIdOuterClass$FormatId) && bufferedMediaSegment.c == j2) {
                    if (bufferedMediaSegment.j) {
                        return SegmentPushAction.a;
                    }
                    if (j3 > bufferedMediaSegment.a()) {
                        Utils.QoeErrorBuilder qoeErrorBuilder4 = new Utils.QoeErrorBuilder("sabr.badpartialsegment");
                        qoeErrorBuilder4.b("c", "badoffset");
                        qoeErrorBuilder4.b("rcv", Long.valueOf(j));
                        qoeErrorBuilder4.b("buffered", Integer.valueOf(bufferedMediaSegment.a()));
                        qoeErrorBuilder4.b("offset", Long.valueOf(j3));
                        qoeErrorBuilder4.a(this.c);
                        segmentPushAction2 = SegmentPushAction.a;
                    } else {
                        segmentPushAction2 = new SegmentPushAction(false, bufferedMediaSegment);
                    }
                    return segmentPushAction2;
                }
                if (j3 > 0) {
                    Utils.QoeErrorBuilder qoeErrorBuilder5 = new Utils.QoeErrorBuilder("sabr.badpartialsegment");
                    qoeErrorBuilder5.b("c", "nomatch");
                    qoeErrorBuilder5.b("rcv", Long.valueOf(j));
                    qoeErrorBuilder5.a(this.c);
                    segmentPushAction = SegmentPushAction.a;
                } else if (!bufferedMediaSegment.j) {
                    Utils.QoeErrorBuilder qoeErrorBuilder6 = new Utils.QoeErrorBuilder("sabr.switchforce");
                    qoeErrorBuilder6.b("rcv", Long.valueOf(j));
                    qoeErrorBuilder6.a(this.c);
                    ahno.O(j(bufferedMediaSegment, iM, true));
                    segmentPushAction = SegmentPushAction.b;
                } else if (this.d.aK() && this.I) {
                    if (iM < list.size() - 1) {
                        int i = iM + 1;
                        if (j((BufferedMediaSegment) list.get(i), i, false)) {
                            y(iM);
                            H();
                            segmentPushAction = SegmentPushAction.b;
                        } else {
                            Utils.QoeErrorBuilder qoeErrorBuilder7 = new Utils.QoeErrorBuilder("sabr.switchfail");
                            qoeErrorBuilder7.b("rcv", Long.valueOf(j));
                            qoeErrorBuilder7.a(this.c);
                            segmentPushAction = SegmentPushAction.a;
                        }
                    } else {
                        y(iM);
                        H();
                        segmentPushAction = SegmentPushAction.b;
                    }
                } else if (!j(bufferedMediaSegment, iM, false)) {
                    Utils.QoeErrorBuilder qoeErrorBuilder8 = new Utils.QoeErrorBuilder("sabr.switchfail");
                    qoeErrorBuilder8.b("rcv", Long.valueOf(j));
                    qoeErrorBuilder8.a(this.c);
                    segmentPushAction = SegmentPushAction.a;
                }
            }
            segmentPushAction = SegmentPushAction.b;
        }
        return segmentPushAction;
    }

    public synchronized MediaSource$MediaSourceInfo t(long j) {
        MsiCache msiCache = this.f;
        for (BufferedMediaSegment bufferedMediaSegment : this.z) {
            if (bufferedMediaSegment.b == j) {
                return bufferedMediaSegment.g;
            }
        }
        if (!this.d.at() || j != 0 || msiCache == null) {
            return null;
        }
        return msiCache.a;
    }

    public synchronized void v(long j) {
        int iN = n(j);
        if (iN < 0 || iN >= this.z.size() - 1) {
            return;
        }
        x(iN + 1);
    }

    public synchronized void w() {
        a();
        MediaPushReceiverImpl mediaPushReceiverImpl = this.G;
        if (mediaPushReceiverImpl != null) {
            mediaPushReceiverImpl.b = true;
            MediaParser.MediaParserInterface mediaParserInterface = mediaPushReceiverImpl.c;
            if (mediaParserInterface != null && mediaParserInterface.l() != null) {
                mediaPushReceiverImpl.d = true;
                mediaParserInterface.m();
            }
        }
    }

    public synchronized void x(int i) {
        MediaPushReceiverImpl mediaPushReceiverImpl;
        MediaParser.MediaParserInterface mediaParserInterface;
        BufferedMediaSegment bufferedMediaSegmentL;
        BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) this.z.get(i);
        if (j(bufferedMediaSegment, i, true) && (mediaPushReceiverImpl = this.G) != null && (mediaParserInterface = mediaPushReceiverImpl.c) != null && (bufferedMediaSegmentL = mediaParserInterface.l()) != null) {
            if (bufferedMediaSegmentL.b >= bufferedMediaSegment.b) {
                mediaPushReceiverImpl.d = true;
                mediaParserInterface.m();
            }
        }
    }

    protected final void y(int i) {
        ahno.F(i >= 0 && i < this.z.size());
        List list = this.z;
        list.subList(i, list.size()).clear();
        this.n = false;
        if (list.isEmpty()) {
            this.p = 0L;
        } else {
            BufferedMediaSegment bufferedMediaSegment = (BufferedMediaSegment) aguu.K(list);
            this.p = bufferedMediaSegment.e() + bufferedMediaSegment.c();
        }
        J();
    }

    public synchronized void z(long j) {
        int iM = m(j);
        if (iM < 0) {
            return;
        }
        x(iM);
    }

    public void H() {
    }

    public void c() {
    }

    /* JADX INFO: compiled from: PG */
    public class MediaPushReceiverImpl extends MediaPushReceiver {
        final String a;
        private final Supplier f;
        private final xeu g;
        private final String h;
        private final MediaSource$MediaSourceInfo m;
        private boolean i = true;
        protected volatile boolean b = false;
        private MediaHeaderOuterClass$MediaHeader j = null;
        protected volatile MediaParser.MediaParserInterface c = null;
        private long k = 0;
        private long l = 0;
        protected volatile boolean d = false;
        private String n = "";
        private FormatIdOuterClass$FormatId o = null;

        public MediaPushReceiverImpl(String str, Supplier supplier, xeu xeuVar, String str2, MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo) {
            this.a = str;
            this.f = supplier;
            this.g = xeuVar;
            this.h = str2;
            this.m = mediaSource$MediaSourceInfo;
        }

        private final void a(Throwable th, String str) {
            yno.Q(this.g, th, str);
            MediaSegmentHolder mediaSegmentHolder = MediaSegmentHolder.this;
            if (mediaSegmentHolder.d.ax()) {
                synchronized (mediaSegmentHolder.v) {
                    if (mediaSegmentHolder.w == null) {
                        mediaSegmentHolder.w = th;
                    }
                }
            }
            ((axo) this.f.get()).accept(th instanceof PlatypusException ? (PlatypusException) th : new PlatypusException(PlatypusException.ErrorType.c, th));
        }

        private final void b() {
            String str;
            MediaSegmentHolder mediaSegmentHolder = MediaSegmentHolder.this;
            if (mediaSegmentHolder.o) {
                return;
            }
            mediaSegmentHolder.o = true;
            try {
                if (this.d) {
                    return;
                }
                zkf.c(this.l == 0);
                this.c.n();
                if (this.j.f) {
                    synchronized (mediaSegmentHolder) {
                        try {
                            final FormatIdOuterClass$FormatId defaultInstance = this.j.h;
                            if (defaultInstance == null) {
                                defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                            }
                            List list = mediaSegmentHolder.A;
                            if (Collection.EL.stream(list).noneMatch(new Predicate() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder$MediaPushReceiverImpl$$ExternalSyntheticLambda0
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* JADX INFO: renamed from: negate */
                                public final /* synthetic */ Predicate mo841negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    return zic.g((FormatIdOuterClass$FormatId) obj, defaultInstance);
                                }
                            })) {
                                FormatIdOuterClass$FormatId defaultInstance2 = this.j.h;
                                if (defaultInstance2 == null) {
                                    defaultInstance2 = FormatIdOuterClass$FormatId.getDefaultInstance();
                                }
                                list.add(defaultInstance2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    elr elrVarJ = elr.J(this.c.h());
                    if (elrVarJ != null) {
                        String str2 = this.h;
                        FormatIdOuterClass$FormatId defaultInstance3 = this.j.h;
                        int i = (defaultInstance3 == null ? FormatIdOuterClass$FormatId.getDefaultInstance() : defaultInstance3).c;
                        String str3 = (defaultInstance3 == null ? FormatIdOuterClass$FormatId.getDefaultInstance() : defaultInstance3).e;
                        if (defaultInstance3 == null) {
                            defaultInstance3 = FormatIdOuterClass$FormatId.getDefaultInstance();
                        }
                        String strBu = zik.bu(str2, i, str3, defaultInstance3.d);
                        abxv abxvVar = MediaSegmentHolder.this.J;
                        if (abxvVar.B(strBu) == null) {
                            abxvVar.C(strBu, elrVarJ);
                            return;
                        }
                        return;
                    }
                    return;
                }
                MediaSegmentHolder mediaSegmentHolder2 = MediaSegmentHolder.this;
                FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) mediaSegmentHolder2.k.get(this.n);
                if (formatInitializationMetadataOuterClass$FormatInitializationMetadata != null && (formatInitializationMetadataOuterClass$FormatInitializationMetadata.b & 8) != 0 && formatInitializationMetadataOuterClass$FormatInitializationMetadata.e == this.j.g) {
                    mediaSegmentHolder2.n = true;
                }
                if (mediaSegmentHolder2.B && (str = this.h) != null) {
                    FormatIdOuterClass$FormatId defaultInstance4 = this.j.h;
                    if (defaultInstance4 == null) {
                        defaultInstance4 = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    int i2 = defaultInstance4.c;
                    FormatIdOuterClass$FormatId defaultInstance5 = this.j.h;
                    String str4 = (defaultInstance5 == null ? FormatIdOuterClass$FormatId.getDefaultInstance() : defaultInstance5).e;
                    if (defaultInstance5 == null) {
                        defaultInstance5 = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    elr elrVarB = mediaSegmentHolder2.J.B(zik.bu(str, i2, str4, defaultInstance5.d));
                    if (elrVarB != null && elrVarB.E() == this.j.g) {
                        mediaSegmentHolder2.n = true;
                    }
                }
                if (mediaSegmentHolder2.t != -1 && mediaSegmentHolder2.t == this.j.g) {
                    mediaSegmentHolder2.D();
                } else if (mediaSegmentHolder2.u == this.j.g) {
                    mediaSegmentHolder2.D();
                }
            } catch (Throwable th2) {
                a(th2, "MediaPushReceiverImpl.pushSegmentCompleted");
            }
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public final void pushFormatInitializationMetadata(FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata) {
            try {
                MediaSegmentHolder mediaSegmentHolder = MediaSegmentHolder.this;
                Map map = mediaSegmentHolder.k;
                FormatIdOuterClass$FormatId defaultInstance = formatInitializationMetadataOuterClass$FormatInitializationMetadata.d;
                if (defaultInstance == null) {
                    defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                }
                map.put(MediaSegmentHolder.u(defaultInstance), formatInitializationMetadataOuterClass$FormatInitializationMetadata);
                if (mediaSegmentHolder.l == null) {
                    mediaSegmentHolder.l = formatInitializationMetadataOuterClass$FormatInitializationMetadata;
                }
                FormatInitializationMetadataListener formatInitializationMetadataListener = mediaSegmentHolder.x;
                if (formatInitializationMetadataListener != null) {
                    formatInitializationMetadataListener.z(mediaSegmentHolder.b);
                }
            } catch (Throwable th) {
                a(th, "MediaPushReceiverImpl.pushFormatInitializationMetadata");
            }
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public final void pushSegmentCompleted() {
            b();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public final void pushSegmentData(ByteBuffer byteBuffer) {
            try {
                if (this.d) {
                    return;
                }
                long j = this.k;
                this.k = ((long) byteBuffer.remaining()) + j;
                long j2 = this.l;
                long jRemaining = byteBuffer.remaining();
                long j3 = this.l;
                if (j2 >= jRemaining) {
                    this.l = j3 - ((long) byteBuffer.remaining());
                    return;
                }
                if (j3 != 0) {
                    byteBuffer.position(byteBuffer.position() + ((int) this.l));
                    j += this.l;
                    this.l = 0L;
                }
                if (byteBuffer.remaining() <= 0 || !this.c.q(byteBuffer, j)) {
                    return;
                }
                b();
            } catch (Throwable th) {
                this.d = true;
                a(th, "MediaPushReceiverImpl.pushSegmentData");
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0152 A[Catch: all -> 0x01da, TryCatch #2 {all -> 0x01da, blocks: (B:27:0x005b, B:29:0x0067, B:31:0x006b, B:33:0x006e, B:35:0x0079, B:36:0x007d, B:38:0x0081, B:41:0x008f, B:43:0x0098, B:45:0x009c, B:47:0x00a4, B:48:0x00a6, B:53:0x00ac, B:56:0x00af, B:57:0x00b5, B:66:0x00c1, B:69:0x00c4, B:71:0x00c8, B:77:0x00f1, B:80:0x0103, B:81:0x0121, B:83:0x0125, B:85:0x0129, B:86:0x012e, B:90:0x013a, B:92:0x013e, B:93:0x0140, B:95:0x0146, B:97:0x014a, B:98:0x014c, B:100:0x0152, B:102:0x0163, B:103:0x017d, B:104:0x017e, B:106:0x0182, B:108:0x0188, B:109:0x018c, B:111:0x019b, B:112:0x019e, B:114:0x01a2, B:115:0x01ad, B:117:0x01b3, B:118:0x01b9, B:120:0x01c5, B:122:0x01c9, B:123:0x01cd, B:73:0x00d4, B:75:0x00e4, B:76:0x00ef, B:40:0x0087, B:58:0x00b6, B:60:0x00ba, B:61:0x00bc, B:63:0x00be, B:49:0x00a7, B:50:0x00a9), top: B:130:0x005b, inners: #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:102:0x0163 A[Catch: all -> 0x01da, TryCatch #2 {all -> 0x01da, blocks: (B:27:0x005b, B:29:0x0067, B:31:0x006b, B:33:0x006e, B:35:0x0079, B:36:0x007d, B:38:0x0081, B:41:0x008f, B:43:0x0098, B:45:0x009c, B:47:0x00a4, B:48:0x00a6, B:53:0x00ac, B:56:0x00af, B:57:0x00b5, B:66:0x00c1, B:69:0x00c4, B:71:0x00c8, B:77:0x00f1, B:80:0x0103, B:81:0x0121, B:83:0x0125, B:85:0x0129, B:86:0x012e, B:90:0x013a, B:92:0x013e, B:93:0x0140, B:95:0x0146, B:97:0x014a, B:98:0x014c, B:100:0x0152, B:102:0x0163, B:103:0x017d, B:104:0x017e, B:106:0x0182, B:108:0x0188, B:109:0x018c, B:111:0x019b, B:112:0x019e, B:114:0x01a2, B:115:0x01ad, B:117:0x01b3, B:118:0x01b9, B:120:0x01c5, B:122:0x01c9, B:123:0x01cd, B:73:0x00d4, B:75:0x00e4, B:76:0x00ef, B:40:0x0087, B:58:0x00b6, B:60:0x00ba, B:61:0x00bc, B:63:0x00be, B:49:0x00a7, B:50:0x00a9), top: B:130:0x005b, inners: #1, #3 }] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public final void startPushSegment(MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader) {
            MediaSegmentHolder mediaSegmentHolder = MediaSegmentHolder.this;
            if (!mediaSegmentHolder.g && !mediaHeaderOuterClass$MediaHeader.f) {
                TimeRangeOuterClass$TimeRange defaultInstance = mediaHeaderOuterClass$MediaHeader.i;
                if (defaultInstance == null) {
                    defaultInstance = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                }
                StartPositionTracker startPositionTracker = mediaSegmentHolder.e;
                jqz jqzVar = mediaSegmentHolder.b;
                long jB = zic.b(defaultInstance.c, defaultInstance.e);
                synchronized (startPositionTracker) {
                    Map map = startPositionTracker.a;
                    if (!map.containsKey(jqzVar)) {
                        map.put(jqzVar, Long.valueOf(jB));
                        startPositionTracker.a();
                    }
                }
                MediaSegmentHolder.this.g = true;
            }
            MediaSegmentHolder mediaSegmentHolder2 = MediaSegmentHolder.this;
            mediaSegmentHolder2.o = false;
            zhq zhqVar = zhq.ABR;
            mediaSegmentHolder2.b.name();
            long j = mediaHeaderOuterClass$MediaHeader.g;
            FormatIdOuterClass$FormatId defaultInstance2 = mediaHeaderOuterClass$MediaHeader.h;
            if (defaultInstance2 == null) {
                defaultInstance2 = FormatIdOuterClass$FormatId.getDefaultInstance();
            }
            int i = defaultInstance2.c;
            try {
                this.j = mediaHeaderOuterClass$MediaHeader;
                this.l = 0L;
                this.d = false;
                if (this.b && !mediaHeaderOuterClass$MediaHeader.f) {
                    this.d = true;
                    return;
                }
                this.k = mediaHeaderOuterClass$MediaHeader.d + mediaHeaderOuterClass$MediaHeader.k;
                final FormatIdOuterClass$FormatId defaultInstance3 = mediaHeaderOuterClass$MediaHeader.h;
                if (defaultInstance3 == null) {
                    defaultInstance3 = FormatIdOuterClass$FormatId.getDefaultInstance();
                }
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = this.o;
                if (formatIdOuterClass$FormatId == null || !zic.g(formatIdOuterClass$FormatId, defaultInstance3)) {
                    this.n = MediaSegmentHolder.u(defaultInstance3);
                    this.o = defaultInstance3;
                }
                BufferedMediaSegment bufferedMediaSegmentR = null;
                bufferedMediaSegmentR = null;
                if (mediaSegmentHolder2.d.ax()) {
                    if (mediaSegmentHolder2.H != null && !zic.g(mediaSegmentHolder2.H, defaultInstance3)) {
                        synchronized (mediaSegmentHolder2.v) {
                            try {
                                mediaSegmentHolder2.w = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    MediaSegmentHolder mediaSegmentHolder3 = MediaSegmentHolder.this;
                    mediaSegmentHolder3.H = defaultInstance3;
                    synchronized (mediaSegmentHolder3.v) {
                        try {
                            if (mediaSegmentHolder3.w != null) {
                                this.d = true;
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (this.c == null || !zic.g(this.c.i(), defaultInstance3)) {
                    String str = this.a;
                    String str2 = this.n;
                    MediaSegmentHolder mediaSegmentHolder4 = MediaSegmentHolder.this;
                    Map map2 = mediaSegmentHolder4.m;
                    MediaParser.MediaParserInterface mediaParserInterface = (MediaParser.MediaParserInterface) map2.get(str2);
                    if (mediaParserInterface == null) {
                        MediaParser.MediaParsersImplementation mediaParsersImplementation = new MediaParser.MediaParsersImplementation(mediaSegmentHolder4, defaultInstance3, str, mediaSegmentHolder4.d);
                        map2.put(str2, mediaParsersImplementation);
                        mediaParserInterface = mediaParsersImplementation;
                    }
                    this.c = mediaParserInterface;
                }
                MediaSegmentHolder mediaSegmentHolder5 = MediaSegmentHolder.this;
                FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) mediaSegmentHolder5.k.get(this.n);
                boolean z = mediaSegmentHolder5.C;
                if (z && formatInitializationMetadataOuterClass$FormatInitializationMetadata == null) {
                    Utils.QoeErrorBuilder qoeErrorBuilder = new Utils.QoeErrorBuilder("sabr.uninitializedformat");
                    qoeErrorBuilder.b("c", "MissingFormatInitializationMetadata");
                    qoeErrorBuilder.b("itag", Integer.valueOf(defaultInstance3.c));
                    qoeErrorBuilder.a(mediaSegmentHolder5.c);
                }
                if (mediaHeaderOuterClass$MediaHeader.f) {
                    MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo = this.m;
                    mediaSegmentHolder5.f = mediaSource$MediaSourceInfo != null ? new MsiCache(mediaSource$MediaSourceInfo) : null;
                    this.c.p();
                    return;
                }
                if (z) {
                    if (formatInitializationMetadataOuterClass$FormatInitializationMetadata != null) {
                        aiow aiowVar = formatInitializationMetadataOuterClass$FormatInitializationMetadata.g;
                        if (aiowVar == null) {
                            aiowVar = aiow.a;
                        }
                        if (aiowVar.c == 0) {
                            aiow aiowVar2 = formatInitializationMetadataOuterClass$FormatInitializationMetadata.g;
                            if (aiowVar2 == null) {
                                aiowVar2 = aiow.a;
                            }
                            if (aiowVar2.d != 0) {
                                if (Collection.EL.stream(mediaSegmentHolder5.A).noneMatch(new Predicate() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder$$ExternalSyntheticLambda0
                                    public final /* synthetic */ Predicate and(Predicate predicate) {
                                        return Predicate$CC.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* JADX INFO: renamed from: negate */
                                    public final /* synthetic */ Predicate mo841negate() {
                                        return Predicate$CC.$default$negate(this);
                                    }

                                    public final /* synthetic */ Predicate or(Predicate predicate) {
                                        return Predicate$CC.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        return zic.g((FormatIdOuterClass$FormatId) obj, defaultInstance3);
                                    }
                                })) {
                                    PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.c);
                                    platypusExceptionBuilder.b("c", "MissingInitSegment");
                                    platypusExceptionBuilder.c("itag", defaultInstance3.c);
                                    throw platypusExceptionBuilder.a();
                                }
                            }
                        } else if (Collection.EL.stream(mediaSegmentHolder5.A).noneMatch(new Predicate() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder$$ExternalSyntheticLambda0
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* JADX INFO: renamed from: negate */
                            public final /* synthetic */ Predicate mo841negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return zic.g((FormatIdOuterClass$FormatId) obj, defaultInstance3);
                            }
                        })) {
                            PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder2 = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.c);
                            platypusExceptionBuilder2.b("c", "MissingInitSegment");
                            platypusExceptionBuilder2.c("itag", defaultInstance3.c);
                            throw platypusExceptionBuilder2.a();
                        }
                    } else if (Collection.EL.stream(mediaSegmentHolder5.A).noneMatch(new Predicate() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder$$ExternalSyntheticLambda0
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public final /* synthetic */ Predicate mo841negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return zic.g((FormatIdOuterClass$FormatId) obj, defaultInstance3);
                        }
                    })) {
                        PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder3 = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.c);
                        platypusExceptionBuilder3.b("c", "MissingInitSegment");
                        platypusExceptionBuilder3.c("itag", defaultInstance3.c);
                        throw platypusExceptionBuilder3.a();
                    }
                }
                if (this.i) {
                    long j2 = mediaHeaderOuterClass$MediaHeader.g;
                    FormatIdOuterClass$FormatId defaultInstance4 = mediaHeaderOuterClass$MediaHeader.h;
                    if (defaultInstance4 == null) {
                        defaultInstance4 = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    SegmentPushAction segmentPushActionS = mediaSegmentHolder5.s(j2, defaultInstance4, mediaHeaderOuterClass$MediaHeader.j, mediaHeaderOuterClass$MediaHeader.k);
                    if (segmentPushActionS.c) {
                        this.d = true;
                        return;
                    }
                    BufferedMediaSegment bufferedMediaSegment = segmentPushActionS.d;
                    if (bufferedMediaSegment != null) {
                        this.l = ((long) bufferedMediaSegment.a()) - mediaHeaderOuterClass$MediaHeader.k;
                        bufferedMediaSegmentR = bufferedMediaSegment;
                    }
                    mediaSegmentHolder5.D = 0;
                    this.i = false;
                }
                if (bufferedMediaSegmentR == null) {
                    bufferedMediaSegmentR = mediaSegmentHolder5.r(mediaHeaderOuterClass$MediaHeader, this.m);
                }
                mediaSegmentHolder5.c();
                this.c.o(bufferedMediaSegmentR);
                if (mediaSegmentHolder5.F) {
                    FormatIdOuterClass$FormatId defaultInstance5 = mediaHeaderOuterClass$MediaHeader.h;
                    if (defaultInstance5 == null) {
                        defaultInstance5 = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    mediaSegmentHolder5.E = agev.i(Integer.valueOf(defaultInstance5.c));
                }
            } catch (Throwable th3) {
                this.d = true;
                a(th3, "MediaPushReceiverImpl.startPushSegment");
            }
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public final void donePushing(QoeError qoeError, boolean z) {
        }
    }

    protected void I(BufferedMediaSegment bufferedMediaSegment, long j) {
    }
}
