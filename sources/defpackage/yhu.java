package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.libraries.youtube.media.interfaces.FormatInitializationMetadataReceiver;
import com.google.android.libraries.youtube.media.interfaces.MediaCache;
import com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver;
import com.google.android.libraries.youtube.media.interfaces.TimeInterval;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yhu extends MediaCache implements jsj, yhm {
    public final yfp a;
    public final String b;
    public final ywn c;
    public final yhf d;
    public volatile boolean f;
    public final PlaybackControllerWrapper h;
    public final abxv i;
    private final ahey j;
    private final zjr k;
    private final xeu l;
    private boolean m;
    public final AtomicBoolean g = new AtomicBoolean(false);
    private final AtomicBoolean n = new AtomicBoolean(true);
    private final AtomicReference o = new AtomicReference(new ArrayList());
    final AtomicReference e = new AtomicReference();

    public yhu(yfp yfpVar, ahey aheyVar, zjr zjrVar, xeu xeuVar, abxv abxvVar, PlaybackControllerWrapper playbackControllerWrapper, String str, ywn ywnVar, yhf yhfVar) {
        this.a = yfpVar;
        this.j = aheyVar;
        this.k = zjrVar;
        this.l = xeuVar;
        this.i = abxvVar;
        this.h = playbackControllerWrapper;
        this.b = str;
        this.c = ywnVar;
        this.d = yhfVar;
        if (zjrVar.l.m(12, 45637824L)) {
            aheyVar.execute(afwl.i(new ygz(this, 3)));
        }
    }

    @Override // defpackage.jsj
    public final void a(jsk jskVar, jsp jspVar) {
        if (this.g.get()) {
            return;
        }
        String str = jspVar.a;
        if (zik.bx(str).equals(this.b)) {
            this.n.set(true);
        }
    }

    @Override // defpackage.jsj
    public final void c(jsp jspVar) {
        if (this.g.get() || !zik.bx(jspVar.a).equals(this.b)) {
            return;
        }
        this.n.set(true);
    }

    @Override // defpackage.yhm
    public final Map d(List list) {
        return yno.a(list, getCachedBufferedRanges(), 3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.yhm
    public final yno e(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        AtomicBoolean atomicBoolean = this.g;
        ?? Io = this.a.io();
        return yno.n(atomicBoolean.get(), this.b, formatIdOuterClass$FormatId, Io != 0 ? agkz.n(Io) : agpr.a, this.h, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v0, types: [jsj, yhu] */
    public final synchronized StatusOr f() {
        afvx afvxVarAd;
        StatusOr statusOrFromStatus;
        List listB;
        ?? Io;
        boolean z;
        try {
            try {
                afvxVarAd = tym.ad(trx.PLATYPUS_GET_CACHED_BUFFERED_RANGES_OFFLINE);
                try {
                    if (this.g.get()) {
                        ywn ywnVar = this.c;
                        zhv zhvVar = new zhv("offline.cache");
                        zhvVar.c = "op.get_cached_buffered_ranges;c.cache_closed";
                        zhvVar.e = false;
                        ywnVar.k(zhvVar.a());
                        statusOrFromStatus = StatusOr.fromStatus(Status.l);
                    } else {
                        zjr zjrVar = this.k;
                        boolean z2 = zjrVar.W().l;
                        yfp yfpVar = this.a;
                        if (z2) {
                            Io = yfpVar.io();
                        } else {
                            listB = yfpVar.b();
                            if (listB == null) {
                                Io = listB;
                                ywn ywnVar2 = this.c;
                                zhv zhvVar2 = new zhv("offline.cache");
                                zhvVar2.c = "op.get_cached_buffered_ranges;c.caches_not_ready";
                                zhvVar2.e = false;
                                ywnVar2.k(zhvVar2.a());
                                statusOrFromStatus = StatusOr.fromStatus(Status.l);
                            }
                        }
                        Io = listB;
                        agkz agkzVarN = agkz.n(Io);
                        if (agkzVarN.isEmpty()) {
                            ywn ywnVar3 = this.c;
                            zhv zhvVar3 = new zhv("offline.cache");
                            zhvVar3.c = "op.get_cached_buffered_ranges;c.no_caches";
                            zhvVar3.e = false;
                            ywnVar3.k(zhvVar3.a());
                            statusOrFromStatus = StatusOr.fromStatus(Status.l);
                        } else {
                            if (!this.f && !this.m) {
                                agqr it = agkzVarN.iterator();
                                loop0: while (true) {
                                    z = true;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break loop0;
                                        }
                                        jsk jskVar = (jsk) it.next();
                                        if (!z || !jskVar.n(this)) {
                                            z = false;
                                        }
                                    }
                                }
                                this.f = z;
                                if (!z) {
                                    h(agkzVarN);
                                    this.m = true;
                                }
                            }
                            if (this.n.getAndSet(this.m)) {
                                this.o.set(zik.bY(agkzVarN, 3, this.b, this.i, zjrVar));
                            }
                            statusOrFromStatus = StatusOr.fromValue((ArrayList) this.o.get());
                        }
                    }
                } catch (RuntimeException e) {
                    ywn ywnVar4 = this.c;
                    zhv zhvVar4 = new zhv("offline.cache.exception");
                    zhvVar4.d = e;
                    zhvVar4.d();
                    ywnVar4.k(zhvVar4.a());
                    statusOrFromStatus = StatusOr.fromStatus(Status.l);
                }
                afvxVarAd.close();
            } catch (Throwable th) {
                try {
                    afvxVarAd.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return statusOrFromStatus;
    }

    public final synchronized void g() {
        if (!this.g.getAndSet(true)) {
            yno.S(this.j, new ygz(this, 2), 0L, this.c, null, "Failed to remove cache listeners");
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaCache
    public final synchronized StatusOr getCachedBufferedRanges() {
        try {
        } catch (Throwable th) {
            if (this.k.dU()) {
                return StatusOr.fromStatus(Status.l);
            }
            yno.Q(this.l, th, "Failed to get buffered range");
            throw th;
        }
        return f();
    }

    public final void h(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((jsk) it.next()).p(this);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // com.google.android.libraries.youtube.media.interfaces.MediaCache
    public final StatusOr startRead(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, TimeInterval timeInterval, MediaPushReceiver mediaPushReceiver, boolean z, boolean z2) {
        StatusOr statusOrFromValue;
        zhq zhqVar = zhq.ABR;
        int i = formatIdOuterClass$FormatId.c;
        try {
            if (this.g.get()) {
                ywn ywnVar = this.c;
                zhv zhvVar = new zhv("offline.cache");
                zhvVar.c = "op.read;c.cache_closed";
                zhvVar.e = false;
                ywnVar.k(zhvVar.a());
                statusOrFromValue = StatusOr.fromStatus(Status.l);
            } else {
                zkf.d(mediaPushReceiver);
                ?? Io = this.a.io();
                if (Io.isEmpty()) {
                    ywn ywnVar2 = this.c;
                    zhv zhvVar2 = new zhv("offline.cache");
                    zhvVar2.c = "op.read;c.no_caches";
                    zhvVar2.e = false;
                    ywnVar2.k(zhvVar2.a());
                    statusOrFromValue = StatusOr.fromStatus(Status.l);
                } else {
                    yhg yhgVar = new yhg(this.k, this.i, this.h, true);
                    this.e.set(yhgVar);
                    this.j.execute(afwl.i(new yhr(this, yhgVar, mediaPushReceiver, (List) Io, formatIdOuterClass$FormatId, timeInterval, z, z2, 0)));
                    statusOrFromValue = StatusOr.fromValue(new yht(yhgVar));
                }
            }
            return statusOrFromValue;
        } catch (Throwable th) {
            if (this.k.dU()) {
                return StatusOr.fromStatus(Status.l);
            }
            yno.Q(this.l, th, "Failed to start read");
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaCache
    public final void startReadFormatInitializationMetadatas(ArrayList arrayList, FormatInitializationMetadataReceiver formatInitializationMetadataReceiver) throws Throwable {
        yhu yhuVar;
        Throwable th;
        try {
            if (this.g.get()) {
                try {
                    ywn ywnVar = this.c;
                    zhv zhvVar = new zhv("offline.cache");
                    zhvVar.c = "op.read_format_initialization_metadatas;c.cache_closed";
                    zhvVar.e = false;
                    ywnVar.k(zhvVar.a());
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    yhuVar = this;
                }
            } else {
                zkf.d(formatInitializationMetadataReceiver);
                yhuVar = this;
                try {
                    this.j.execute(afwl.i(new yag((Object) yhuVar, (Object) arrayList, (Object) formatInitializationMetadataReceiver, 3, (char[]) null)));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            yhuVar = this;
        }
        th = th;
        if (yhuVar.k.dU()) {
            return;
        }
        yno.Q(yhuVar.l, th, "Failed to start read FormatInitializationMetadatas");
        throw th;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaCache
    public final StatusOr startWrite() {
        return StatusOr.fromStatus(Status.k);
    }

    @Override // defpackage.jsj
    public final void b(jsk jskVar, jsp jspVar, jsp jspVar2) {
    }
}
