package defpackage;

import com.google.android.apps.youtube.proto.streaming.BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig;
import com.google.android.libraries.youtube.media.interfaces.NetFetchCallbacks;
import com.google.android.libraries.youtube.media.interfaces.NetFetchTask;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.QoeErrorDetail;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ype extends NetFetchTask {
    final ahnz A;
    public final hed B;
    private final xeu C;
    private final ScheduledExecutorService D;
    public final CronetEngine a;
    public final ywn b;
    public final yup c;
    public final zjx d;
    public final tgv e;
    final awmd f;
    public final ypm g;
    public ypj h;
    public final Executor i;
    public final mbc j;
    public final boolean k;
    public final zjr l;
    public final NetFetchCallbacks m;
    public final ypd n;
    public final ypb p;
    public final tlk q;
    public long r;
    public long s;
    public volatile UrlRequest v;
    public byi w;
    public boolean x;
    public final tfq y;
    public final vxz z;
    public final AtomicBoolean o = new AtomicBoolean(false);
    private final AtomicBoolean E = new AtomicBoolean(false);
    private final AtomicBoolean F = new AtomicBoolean(false);
    public final AtomicBoolean t = new AtomicBoolean(false);
    public final AtomicBoolean u = new AtomicBoolean(false);

    public ype(hed hedVar, zjr zjrVar, tfq tfqVar, yup yupVar, zjx zjxVar, tgv tgvVar, awmd awmdVar, ahnz ahnzVar, hed hedVar2, hed hedVar3, Executor executor, ScheduledExecutorService scheduledExecutorService, mbc mbcVar, xeu xeuVar, vxz vxzVar, String str, ypb ypbVar, ywn ywnVar, NetFetchCallbacks netFetchCallbacks) {
        CronetEngine cronetEngineY = hedVar.y(zjrVar.eE());
        zkf.d(cronetEngineY);
        this.a = cronetEngineY;
        this.b = ywnVar;
        this.l = zjrVar;
        this.C = xeuVar;
        this.m = netFetchCallbacks;
        this.c = yupVar;
        this.d = zjxVar;
        this.y = tfqVar;
        this.e = tgvVar;
        this.f = awmdVar;
        this.A = ahnzVar;
        ypm ypmVarW = null;
        if (hedVar2 != null && str != null) {
            ypmVarW = hedVar2.w(str);
        }
        this.g = ypmVarW;
        this.i = executor;
        this.D = scheduledExecutorService;
        this.B = hedVar3;
        this.j = mbcVar;
        this.z = vxzVar;
        this.n = new ypd(this);
        this.p = ypbVar;
        this.q = new tlk(scheduledExecutorService, ypbVar.a, ypbVar.b);
        this.k = zjrVar.j.m(113, 45414836L);
    }

    public static ArrayList a(byi byiVar) {
        ArrayList arrayList = new ArrayList();
        if (byiVar != null) {
            String host = byiVar.a.getHost();
            if (host != null) {
                arrayList.add(new QoeErrorDetail("shost", host));
            }
            arrayList.add(new QoeErrorDetail("src", "platypus"));
        }
        return arrayList;
    }

    public final void b(QoeError qoeError, boolean z) {
        if (e() && !d() && c() == z) {
            if (this.t.get() && !this.u.getAndSet(true)) {
                this.c.n();
                this.d.b(null, null, true);
                this.e.b();
            }
            synchronized (zik.class) {
                if (c() == z && this.F.compareAndSet(false, true)) {
                    this.m.onDone(qoeError, z);
                }
            }
        }
    }

    final boolean c() {
        return this.E.get();
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchTask
    public final void cancel() {
        try {
            if (!e() || d() || this.E.getAndSet(true)) {
                return;
            }
            if (this.v != null) {
                this.v.cancel();
            }
            this.D.submit(afwl.i(new ygz(this, 4)));
            ypj ypjVar = this.h;
            if (ypjVar != null) {
                ypjVar.d(this.j.b());
            }
        } catch (Throwable th) {
            yno.Q(this.C, th, "net fetch task cancelled");
            if (!this.l.dU()) {
                throw th;
            }
        }
    }

    final boolean d() {
        return this.F.get();
    }

    final boolean e() {
        return this.o.get();
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchTask
    public final void onPauseBandwidthSamplingHint(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig) {
        try {
            if (this.k) {
                this.c.r(bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);
            }
        } catch (Throwable th) {
            yno.Q(this.C, th, "net fetch task onPauseBandwidthSamplingHint");
            if (!this.l.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchTask
    public final void onStartBandwidthSamplingHint(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig) {
        try {
            if (this.k) {
                this.c.s(bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);
            }
        } catch (Throwable th) {
            yno.Q(this.C, th, "net fetch task onStartBandwidthSamplingHint");
            if (!this.l.dU()) {
                throw th;
            }
        }
    }
}
