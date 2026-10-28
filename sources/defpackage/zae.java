package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zae implements yzm {
    public final Handler a;
    public final zlg b;
    public final zjr c;
    final Surface e;
    int f;
    public volatile zcf g;
    public volatile boolean i;
    public int j;
    public int k;
    public Surface l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final zle r;
    public final aerz s;
    private volatile boolean t;
    private yxf u;
    public final AtomicInteger h = new AtomicInteger();
    public final bwn d = new bwn();

    public zae(Handler handler, zlg zlgVar, zle zleVar, SurfaceTexture surfaceTexture, zjr zjrVar) {
        this.a = handler;
        this.b = zlgVar;
        this.r = zleVar;
        this.c = zjrVar;
        this.s = new aerz(surfaceTexture);
        this.e = new Surface(surfaceTexture);
    }

    @Override // defpackage.yzm
    public final Surface a() {
        return this.e;
    }

    @Override // defpackage.yzm
    public final ctm b() {
        return new ctm() { // from class: zad
            @Override // defpackage.ctm
            public final void c(long j, long j2, bse bseVar, MediaFormat mediaFormat) {
                this.a.d.e(j2, Long.valueOf(j));
            }
        };
    }

    @Override // defpackage.yzm
    public final void c(Surface surface) {
        zjr zjrVar = this.c;
        if (!zjrVar.bB() || surface != null) {
            zjr zjrVar2 = this.c;
            int iIncrementAndGet = zjrVar2.bB() ? this.h.incrementAndGet() : 0;
            if (zjrVar2.bB() && surface != null) {
                this.i = true;
                this.t = false;
            }
            qd qdVar = new qd(this, iIncrementAndGet, surface, 14);
            boolean zBA = zjrVar2.bA();
            Handler handler = this.a;
            if (zBA) {
                handler.postAtFrontOfQueue(qdVar);
                return;
            } else {
                handler.post(qdVar);
                return;
            }
        }
        if (this.i) {
            this.i = false;
            this.t = true;
            int iIncrementAndGet2 = this.h.incrementAndGet();
            if (Looper.myLooper() != null) {
                if (Looper.myLooper() == this.a.getLooper()) {
                    g(iIncrementAndGet2);
                    return;
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (!this.a.postAtFrontOfQueue(new qd(this, iIncrementAndGet2, countDownLatch, 13, (byte[]) null))) {
                this.t = false;
                zhr.d(zhq.RENDER, "Render thread looper quitting; skipped teardown wait.");
                return;
            }
            try {
                if (countDownLatch.await(zjrVar.i.d(59, 45841178L), TimeUnit.MILLISECONDS)) {
                    return;
                }
                i(new TimeoutException("Timed out waiting for surface teardown."));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                i(e);
            }
        }
    }

    @Override // defpackage.yzm
    public final void d(zcf zcfVar) {
        this.a.post(new yts(this, zcfVar, 18));
    }

    @Override // defpackage.yzm
    public final void e(int i, int i2) {
        this.a.post(new yuj(this, i, i2, 2));
    }

    @Override // defpackage.yzm
    public final boolean f() {
        return this.g != null && this.b.d(this.g.y);
    }

    public final void g(int i) {
        try {
            if (i == this.h.get()) {
                this.t = false;
                this.i = false;
                if (this.l != null) {
                    this.s.c();
                    this.l = null;
                    this.o = true;
                    this.r.c(null);
                }
            }
        } catch (Exception e) {
            i(e);
        }
    }

    public final void h() {
        Surface surface;
        Surface surface2;
        zjr zjrVar = this.c;
        if ((zjrVar.bB() && this.t) || this.l == null) {
            return;
        }
        if (!zjrVar.bA() || (surface2 = this.l) == null || surface2.isValid()) {
            zle zleVar = this.r;
            if (zleVar.a == null) {
                zleVar.b();
            }
            if (zleVar.b == null) {
                zleVar.f();
                zleVar.a();
                this.p = true;
            }
            if (this.o) {
                this.o = false;
                aerz aerzVar = this.s;
                aerzVar.c();
                zleVar.c(this.l);
                zleVar.d();
                int iB = this.f;
                if (iB == 0) {
                    iB = yya.b();
                    this.f = iB;
                }
                if (!aerzVar.a) {
                    ((SurfaceTexture) aerzVar.b).attachToGLContext(iB);
                    aerzVar.a = true;
                }
            }
            if (this.p) {
                this.p = false;
                this.b.b();
            }
            if (!(zjrVar.bB() && this.t) && this.m && this.k > 0 && this.j > 0 && this.g != null) {
                zcf zcfVar = this.g;
                this.m = false;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.s.b;
                surfaceTexture.updateTexImage();
                Long l = (Long) this.d.d(surfaceTexture.getTimestamp());
                if (l != null) {
                    yxd yxdVarA = zcfVar.ae.a(l.longValue());
                    yxf yxfVarD = yxdVarA.d();
                    zlf zlfVarA = this.b.a(yxfVarD);
                    if (this.q || this.u != yxfVarD) {
                        this.q = false;
                        long jLongValue = l.longValue();
                        if (this.g != null) {
                            this.g.Z.l("gvs", String.format(Locale.US, "m.%s;s.%d", yno.cF(ahbt.b(jLongValue).toMillis()), Integer.valueOf(yxfVarD.g)));
                        }
                    }
                    if (this.n || this.u != yxfVarD) {
                        this.n = false;
                        this.u = yxfVarD;
                        zlfVarA.b(this.k, this.j);
                    }
                    surfaceTexture.getTransformMatrix(zlfVarA.d());
                    zlfVarA.a(yxdVarA, this.f);
                    if (zjrVar.bB() && (this.t || this.l == null)) {
                        return;
                    }
                    if (!zjrVar.bA() || ((surface = this.l) != null && surface.isValid())) {
                        zleVar.e();
                    }
                }
            }
        }
    }

    public final void i(Exception exc) {
        if (this.g != null) {
            ywn ywnVar = this.g.Z;
            zhv zhvVar = new zhv("render");
            zhvVar.d();
            zhvVar.c = exc.getMessage();
            zhvVar.d = exc;
            ywnVar.k(zhvVar.a());
        }
        zhr.a(zhq.RENDER, exc);
    }
}
