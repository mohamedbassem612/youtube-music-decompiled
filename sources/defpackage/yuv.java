package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.proto.streaming.BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yuv extends yuw {
    long b;
    final agfp c;
    int d;
    private final yuz f;
    private final zjr g;
    private wiu j;
    private final Object h = new Object();
    final AtomicReference a = new AtomicReference(yvb.k);
    int e = 0;
    private boolean k = true;
    private boolean l = false;
    private volatile long i = -1;
    private final ci m = new ci((char[]) null);

    public yuv(mbc mbcVar, wiu wiuVar, zjr zjrVar, yuz yuzVar) {
        this.j = wiuVar;
        this.g = zjrVar;
        this.f = yuzVar;
        this.c = new agfp(new yut(mbcVar));
    }

    private final synchronized void q(int i, long j) throws Throwable {
        try {
            try {
                yvb yvbVar = (yvb) this.a.get();
                long j2 = (j * 8000) / ((long) i);
                yvbVar.e(j2);
                y(yvbVar);
                v(i, this.b, this.i);
                yuz yuzVar = this.f;
                if (yuzVar != null) {
                    yuzVar.a(this.b, j2);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void u() {
        zjr zjrVar;
        tqj tqjVar;
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        yvb yvbVar = yvb.k;
        if (obj != yvbVar || (zjrVar = this.g) == null || (tqjVar = zjrVar.v) == null) {
            return;
        }
        int i = tqr.a;
        if (tqjVar.l(1074093018, 4)) {
            synchronized (this.h) {
                if (atomicReference.get() == yvbVar) {
                    wiu wiuVar = this.j;
                    if (wiuVar == null) {
                        wiuVar = wiu.c;
                    }
                    j(wiuVar);
                }
            }
        }
    }

    private final void v(int i, long j, long j2) {
        this.m.A(i, j, j2);
    }

    private final synchronized void w() {
        if (this.k) {
            this.k = false;
            agfp agfpVar = this.c;
            if (agfpVar.a) {
                agfpVar.f();
            }
        }
    }

    private final synchronized void x() {
        if (!this.k || !this.c.a) {
            this.k = true;
            agfp agfpVar = this.c;
            if (!agfpVar.a) {
                agfpVar.e();
            }
        }
    }

    private final synchronized void y(yvb yvbVar) {
        float fC = yvbVar.c();
        this.i = Float.isNaN(fC) ? -1L : (long) fC;
    }

    @Override // defpackage.crd
    public final long e() {
        u();
        return this.i;
    }

    @Override // defpackage.crd
    public final void g(Handler handler, crc crcVar) {
        this.m.z(handler, crcVar);
    }

    @Override // defpackage.crd
    public final void h(crc crcVar) {
        this.m.B(crcVar);
    }

    @Override // defpackage.yuw
    public final void i(wiu wiuVar) {
        this.j = wiuVar;
        this.e = wiuVar.k();
        j(this.j);
    }

    final void j(wiu wiuVar) {
        yvb yuxVar;
        int i;
        aoxz aoxzVarA;
        yvb yvbVar = (yvb) this.a.get();
        if (yvbVar != null) {
            if (wiuVar != null) {
                aoqd aoqdVar = wiuVar.d;
                aoxzVarA = aoxz.PREDICTOR_TYPE_NEAREST_RANK;
                if ((aoqdVar.b & 2) != 0) {
                    akwm akwmVar = aoqdVar.f;
                    if (akwmVar == null) {
                        akwmVar = akwm.b;
                    }
                    aoxzVarA = aoxz.a(akwmVar.ad);
                    if (aoxzVarA == null) {
                        aoxzVarA = aoxz.PREDICTOR_TYPE_UNKNOWN;
                    }
                }
            } else {
                aoxzVarA = aoxz.PREDICTOR_TYPE_NEAREST_RANK;
            }
            int i2 = yuu.a[aoxzVarA.ordinal()];
            if (yux.class.isInstance(yvbVar)) {
                yvbVar.f(wiuVar);
                return;
            }
        }
        if (yvbVar == null || !(yvbVar instanceof yux)) {
            akwm akwmVar2 = wiuVar.d.f;
            if (akwmVar2 == null) {
                akwmVar2 = akwm.b;
            }
            int i3 = akwmVar2.af;
            if (i3 == 0) {
                i3 = 12;
            }
            yuxVar = new yux(i3, wiuVar.e(0.5f), wiuVar.f(1.0f));
        } else {
            yuxVar = yvbVar;
        }
        if (yuxVar != yvbVar) {
            yuz yuzVar = this.f;
            if (yuzVar != null) {
                ArrayList arrayList = new ArrayList();
                if (yuzVar.b()) {
                    int iA = yuzVar.d.a();
                    synchronized (yuzVar) {
                        for (zif zifVar : (ArrayDeque) yuzVar.b.io()) {
                            if (iA == 2 || (i = zifVar.c) == 0 || i == iA) {
                                arrayList.add(Long.valueOf(zifVar.b));
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        yuxVar.e(((Long) it.next()).longValue());
                    }
                    y(yuxVar);
                }
            }
            this.a.set(yuxVar);
        }
    }

    @Override // defpackage.yuw
    public final aoxz k() {
        u();
        return ((yvb) this.a.get()).d();
    }

    @Override // defpackage.yuw
    public final synchronized void l(long j) throws Throwable {
        Throwable th;
        try {
            try {
                j(this.j);
                yvb yvbVar = (yvb) this.a.get();
                yvbVar.e(j);
                y(yvbVar);
                yuz yuzVar = this.f;
                if (yuzVar != null) {
                    try {
                        yuzVar.a(1L, j);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                v(0, 0L, this.i);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // defpackage.yuw
    public final synchronized void m(int i) {
        if (this.k) {
            this.b += (long) i;
        }
    }

    @Override // defpackage.yuw
    public final synchronized void n() {
        ahno.O(this.d > 0);
        agfp agfpVar = this.c;
        int iA = (int) agfpVar.a(TimeUnit.MILLISECONDS);
        if (iA > 0) {
            long j = this.b;
            if (j >= this.e) {
                q(iA, j);
            }
        }
        int i = this.d - 1;
        this.d = i;
        if (i > 0) {
            agfpVar.d();
            if (this.k) {
                agfpVar.e();
            }
        }
        this.b = 0L;
    }

    @Override // defpackage.yuw
    public final synchronized void p(boolean z) {
        wiu wiuVar = this.j;
        if (wiuVar != null) {
            this.e = wiuVar.k();
        }
        if (this.d == 0) {
            this.l = z;
            this.c.d();
            if (this.l) {
                w();
            }
        } else {
            boolean z2 = false;
            if (z && this.l) {
                z2 = true;
            }
            this.l = z2;
        }
        if (!this.l) {
            x();
        }
        this.d++;
    }

    @Override // defpackage.yuw
    public final synchronized void r(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig) {
        int i;
        if (this.l && ((i = bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig.b) == 0 || (i & 1) != 0)) {
            w();
        }
    }

    @Override // defpackage.yuw
    public final synchronized void s(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig) {
        int i;
        if (this.l && ((i = bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig.b) == 0 || (i & 1) != 0)) {
            x();
        }
    }

    @Override // defpackage.yuw
    public final synchronized void t() {
    }

    @Override // defpackage.crd
    public final bzg f() {
        return this;
    }

    @Override // defpackage.yuw
    public final void o() {
    }
}
