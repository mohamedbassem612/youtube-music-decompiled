package defpackage;

import com.google.android.apps.youtube.proto.streaming.BufferedRangeOuterClass$BufferedRange;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.android.libraries.youtube.media.interfaces.FormatInitializationMetadataReceiver;
import com.google.android.libraries.youtube.media.interfaces.MediaCache;
import com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.QoeErrorDetail;
import com.google.android.libraries.youtube.media.interfaces.TimeInterval;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yhq extends MediaCache implements yhm {
    public final String a;
    public final ywn b;
    public final yhf c;
    public final PlaybackControllerWrapper f;
    public final abxv g;
    private final Key h;
    private final ScheduledExecutorService i;
    private final zjr j;
    private final xeu k;
    private final yfg l;
    private final boolean m;
    private final yhl n;
    private final boolean o;
    private final boolean p;
    private final ablj s;
    public final AtomicBoolean e = new AtomicBoolean(false);
    private boolean r = false;
    final AtomicReference d = new AtomicReference();
    private final AtomicReference q = new AtomicReference(StatusOr.fromValue(new ArrayList()));

    public yhq(ablj abljVar, Key key, ScheduledExecutorService scheduledExecutorService, zjr zjrVar, xeu xeuVar, abxv abxvVar, PlaybackControllerWrapper playbackControllerWrapper, String str, ywn ywnVar, yhl yhlVar, yhf yhfVar, yfg yfgVar) {
        this.s = abljVar;
        this.h = key;
        this.i = scheduledExecutorService;
        this.j = zjrVar;
        this.k = xeuVar;
        this.g = abxvVar;
        this.f = playbackControllerWrapper;
        this.a = str;
        this.b = ywnVar;
        this.n = yhlVar;
        this.c = yhfVar;
        this.l = yfgVar;
        this.m = zjrVar.j.m(136, 45427014L);
        this.o = zjrVar.l.m(22, 45665418L);
        this.p = zjrVar.j.m(310, 45741673L);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044 A[Catch: RuntimeException -> 0x0059, all -> 0x0079, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0059, blocks: (B:3:0x0006, B:5:0x000e, B:6:0x0029, B:8:0x002d, B:10:0x0034, B:11:0x0044), top: B:23:0x0006, outer: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v9 */
    final StatusOr a() {
        afvx afvxVarAd = tym.ad(trx.PLATYPUS_GET_CACHED_BUFFERED_RANGES_ONLINE);
        try {
            try {
                jsk jskVarB = this.s.b();
                if (jskVarB == null) {
                    ywn ywnVar = this.b;
                    zhv zhvVar = new zhv("cache");
                    zhvVar.c = "op.get_buffered_ranges;c.no_cache";
                    ywnVar.k(zhvVar.a());
                    this = StatusOr.fromStatus(Status.l);
                } else if (jskVarB instanceof ygu) {
                    ygu yguVar = (ygu) jskVarB;
                    if (this.o) {
                        this = StatusOr.fromValue(new ArrayList(yguVar.v(this.a)));
                    } else {
                        this = StatusOr.fromValue(zik.bY(new agqj(jskVarB), 2, this.a, this.g, this.j));
                    }
                } else {
                    this = StatusOr.fromValue(zik.bY(new agqj(jskVarB), 2, this.a, this.g, this.j));
                }
            } catch (RuntimeException e) {
                ywn ywnVar2 = this.b;
                zhv zhvVar2 = new zhv("cache.exception");
                zhvVar2.d = e;
                zhvVar2.d();
                ywnVar2.k(zhvVar2.a());
                this = StatusOr.fromStatus(Status.l);
            }
            afvxVarAd.close();
            return this;
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized void b() {
        this.e.set(true);
    }

    public final synchronized void c(String str, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, int i, TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange) {
        if (!this.e.get()) {
            AtomicReference atomicReference = this.q;
            ArrayList arrayList = (ArrayList) ((StatusOr) atomicReference.get()).value;
            if (this.m && str.equals(this.a) && arrayList != null) {
                long j = i;
                if (timeRangeOuterClass$TimeRange.e != 1000000) {
                    aihf builder = timeRangeOuterClass$TimeRange.toBuilder();
                    long jB = zic.b(timeRangeOuterClass$TimeRange.d, timeRangeOuterClass$TimeRange.e);
                    builder.copyOnWrite();
                    TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange2 = (TimeRangeOuterClass$TimeRange) builder.instance;
                    timeRangeOuterClass$TimeRange2.b |= 2;
                    timeRangeOuterClass$TimeRange2.d = jB;
                    builder.copyOnWrite();
                    TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange3 = (TimeRangeOuterClass$TimeRange) builder.instance;
                    timeRangeOuterClass$TimeRange3.b |= 4;
                    timeRangeOuterClass$TimeRange3.e = 1000000;
                    timeRangeOuterClass$TimeRange = (TimeRangeOuterClass$TimeRange) builder.build();
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange = (BufferedRangeOuterClass$BufferedRange) arrayList.get(i2);
                    FormatIdOuterClass$FormatId defaultInstance = bufferedRangeOuterClass$BufferedRange.c;
                    if (defaultInstance == null) {
                        defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    if (defaultInstance.equals(formatIdOuterClass$FormatId)) {
                        long j2 = bufferedRangeOuterClass$BufferedRange.d;
                        if (j2 == i + 1) {
                            aihf builder2 = bufferedRangeOuterClass$BufferedRange.toBuilder();
                            builder2.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange2 = (BufferedRangeOuterClass$BufferedRange) builder2.instance;
                            bufferedRangeOuterClass$BufferedRange2.b |= 8;
                            bufferedRangeOuterClass$BufferedRange2.d = j;
                            TimeRangeOuterClass$TimeRange defaultInstance2 = bufferedRangeOuterClass$BufferedRange.f;
                            if (defaultInstance2 == null) {
                                defaultInstance2 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                            }
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRangeBs = zik.bs(timeRangeOuterClass$TimeRange, defaultInstance2);
                            builder2.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange3 = (BufferedRangeOuterClass$BufferedRange) builder2.instance;
                            timeRangeOuterClass$TimeRangeBs.getClass();
                            bufferedRangeOuterClass$BufferedRange3.f = timeRangeOuterClass$TimeRangeBs;
                            bufferedRangeOuterClass$BufferedRange3.b |= 32;
                            arrayList.set(i2, (BufferedRangeOuterClass$BufferedRange) builder2.build());
                            atomicReference.set(StatusOr.fromValue(arrayList));
                            return;
                        }
                        long j3 = bufferedRangeOuterClass$BufferedRange.e;
                        if (j3 == i - 1) {
                            aihf builder3 = bufferedRangeOuterClass$BufferedRange.toBuilder();
                            builder3.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange4 = (BufferedRangeOuterClass$BufferedRange) builder3.instance;
                            bufferedRangeOuterClass$BufferedRange4.b |= 16;
                            bufferedRangeOuterClass$BufferedRange4.e = j;
                            TimeRangeOuterClass$TimeRange defaultInstance3 = bufferedRangeOuterClass$BufferedRange.f;
                            if (defaultInstance3 == null) {
                                defaultInstance3 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                            }
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRangeBs2 = zik.bs(timeRangeOuterClass$TimeRange, defaultInstance3);
                            builder3.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange5 = (BufferedRangeOuterClass$BufferedRange) builder3.instance;
                            timeRangeOuterClass$TimeRangeBs2.getClass();
                            bufferedRangeOuterClass$BufferedRange5.f = timeRangeOuterClass$TimeRangeBs2;
                            bufferedRangeOuterClass$BufferedRange5.b |= 32;
                            arrayList.set(i2, (BufferedRangeOuterClass$BufferedRange) builder3.build());
                            atomicReference.set(StatusOr.fromValue(arrayList));
                            return;
                        }
                        if (j >= j2 && j <= j3) {
                            ywn ywnVar = this.b;
                            zhv zhvVar = new zhv("cache");
                            zhvVar.c = a.bR(i, "c.committed_segment_already_cached;seg.");
                            ywnVar.k(zhvVar.a());
                            return;
                        }
                    }
                }
                aihf aihfVarCreateBuilder = BufferedRangeOuterClass$BufferedRange.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange6 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                formatIdOuterClass$FormatId.getClass();
                bufferedRangeOuterClass$BufferedRange6.c = formatIdOuterClass$FormatId;
                bufferedRangeOuterClass$BufferedRange6.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange7 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                bufferedRangeOuterClass$BufferedRange7.b |= 8;
                bufferedRangeOuterClass$BufferedRange7.d = j;
                aihfVarCreateBuilder.copyOnWrite();
                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange8 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                bufferedRangeOuterClass$BufferedRange8.b |= 16;
                bufferedRangeOuterClass$BufferedRange8.e = j;
                aihfVarCreateBuilder.copyOnWrite();
                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange9 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                bufferedRangeOuterClass$BufferedRange9.g = 1;
                bufferedRangeOuterClass$BufferedRange9.b |= 64;
                aihfVarCreateBuilder.copyOnWrite();
                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange10 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.instance;
                timeRangeOuterClass$TimeRange.getClass();
                bufferedRangeOuterClass$BufferedRange10.f = timeRangeOuterClass$TimeRange;
                bufferedRangeOuterClass$BufferedRange10.b |= 32;
                arrayList.add((BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder.build());
                atomicReference.set(StatusOr.fromValue(arrayList));
            }
        }
    }

    @Override // defpackage.yhm
    public final Map d(List list) {
        return yno.a(list, getCachedBufferedRanges(), 2);
    }

    @Override // defpackage.yhm
    public final yno e(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        AtomicBoolean atomicBoolean = this.e;
        jsk jskVarB = this.s.b();
        return yno.n(atomicBoolean.get(), this.a, formatIdOuterClass$FormatId, jskVarB != null ? new agqj(jskVarB) : agpr.a, this.f, this.g);
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaCache
    public final synchronized StatusOr getCachedBufferedRanges() {
        try {
            if (this.e.get()) {
                ywn ywnVar = this.b;
                zhv zhvVar = new zhv("cache");
                zhvVar.c = "op.get_cached_buffered_ranges;c.cache_closed";
                ywnVar.k(zhvVar.a());
                return StatusOr.fromStatus(Status.l);
            }
            if (this.p) {
                jsk jskVarB = this.s.b();
                if (!(jskVarB instanceof ygu) || !((ygu) jskVarB).z()) {
                    return StatusOr.fromStatus(Status.i);
                }
            }
            if (!this.m) {
                return a();
            }
            if (this.r) {
                AtomicReference atomicReference = this.q;
                if (((StatusOr) atomicReference.get()).hasValue) {
                    return (StatusOr) atomicReference.get();
                }
            }
            this.r = true;
            StatusOr statusOrA = a();
            this.q.set(statusOrA);
            return statusOrA;
        } catch (Throwable th) {
            if (this.j.dU()) {
                return StatusOr.fromStatus(Status.l);
            }
            yno.Q(this.k, th, "Failed to get buffered range");
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaCache
    public final StatusOr startRead(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, TimeInterval timeInterval, MediaPushReceiver mediaPushReceiver, boolean z, boolean z2) {
        StatusOr statusOrFromValue;
        zhq zhqVar = zhq.ABR;
        int i = formatIdOuterClass$FormatId.c;
        try {
            if (this.e.get()) {
                ywn ywnVar = this.b;
                zhv zhvVar = new zhv("cache");
                zhvVar.c = "op.read;c.cache_closed";
                ywnVar.k(zhvVar.a());
                statusOrFromValue = StatusOr.fromStatus(Status.l);
            } else {
                zkf.d(mediaPushReceiver);
                jsk jskVarB = this.s.b();
                if (jskVarB == null) {
                    this.b.k(zhz.d(new QoeError("cache", new ArrayList(agke.r(new QoeErrorDetail("op", "read"), new QoeErrorDetail("c", "nullcache")))), false));
                    statusOrFromValue = StatusOr.fromStatus(Status.l);
                } else {
                    yhg yhgVar = new yhg(this.j, this.g, this.f, false);
                    this.d.set(yhgVar);
                    this.i.execute(afwl.i(new yhr(this, yhgVar, mediaPushReceiver, jskVarB, formatIdOuterClass$FormatId, timeInterval, z, z2, 1)));
                    statusOrFromValue = StatusOr.fromValue(new yhp(yhgVar));
                }
            }
            return statusOrFromValue;
        } catch (Throwable th) {
            if (this.j.dU()) {
                return StatusOr.fromStatus(Status.l);
            }
            yno.Q(this.k, th, "Failed to start read");
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaCache
    public final void startReadFormatInitializationMetadatas(ArrayList arrayList, FormatInitializationMetadataReceiver formatInitializationMetadataReceiver) throws Throwable {
        yhq yhqVar;
        Throwable th;
        try {
            if (this.e.get()) {
                try {
                    ywn ywnVar = this.b;
                    zhv zhvVar = new zhv("cache");
                    zhvVar.c = "op.read_format_initialization_metadatas;c.cache_closed";
                    ywnVar.k(zhvVar.a());
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    yhqVar = this;
                }
            } else {
                zkf.d(formatInitializationMetadataReceiver);
                jsk jskVarB = this.s.b();
                yhqVar = this;
                try {
                    this.i.execute(afwl.i(new xhv(yhqVar, jskVarB, arrayList, formatInitializationMetadataReceiver, 4)));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            yhqVar = this;
        }
        th = th;
        if (yhqVar.j.dU()) {
            return;
        }
        yno.Q(yhqVar.k, th, "Failed to start read FormatInitializationMetadatas");
        throw th;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaCache
    public final StatusOr startWrite() {
        try {
            if (!this.e.get()) {
                return StatusOr.fromValue(new yhj(this.i, this.s.b(), this.h, this.j, this.g, this.a, this.b, this.k, this.n, this.m ? new ydm(this) : null));
            }
            ywn ywnVar = this.b;
            zhv zhvVar = new zhv("cache");
            zhvVar.c = "op.write;c.cache_closed";
            ywnVar.k(zhvVar.a());
            return StatusOr.fromStatus(Status.l);
        } catch (Throwable th) {
            if (this.j.dU()) {
                return StatusOr.fromStatus(Status.l);
            }
            yno.Q(this.k, th, "Failed to start write");
            throw th;
        }
    }
}
