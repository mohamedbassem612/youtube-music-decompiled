package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rif implements rhw {
    private static final rbm x = new rbm("rif");
    private final rjc b;
    private final Context c;
    private final UUID d;
    private final qug e;
    private final qua f;
    private final rih g;
    private rfn i;
    private Optional j;
    public final boolean l;
    public ListenableFuture m;
    public rgf n;
    public rft p;
    private Size q;
    private Size r;
    private Size s;
    private Size t;
    private rfs u;
    private final int w;
    public final Object k = new Object();
    private final AtomicBoolean a = new AtomicBoolean(false);
    private Semaphore h = new Semaphore(1);
    protected boolean o = false;
    private boolean v = false;

    public rif(Context context, UUID uuid, Size size, int i, Optional optional, rih rihVar, rjc rjcVar, qua quaVar, boolean z, qug qugVar) {
        this.c = context;
        this.d = uuid;
        this.q = size;
        this.w = i;
        this.j = optional;
        this.g = rihVar;
        this.b = rjcVar;
        this.f = quaVar;
        this.l = z;
        this.e = qugVar;
    }

    private final void j() {
        Size sizeB = this.r;
        if (sizeB != null) {
            if (this.j.isPresent()) {
                sizeB = rgi.b(new Size(this.r.getWidth(), this.r.getHeight()), (RectF) this.j.get());
            }
            Size size = this.q;
            if (size != null) {
                qua quaVar = this.f;
                boolean z = quaVar.C;
                this.s = z ? nrb.h(sizeB, size, this.w, quaVar.P) : nrb.g(sizeB, size);
                Size size2 = this.r;
                this.t = z ? nrb.h(size2, this.q, this.w, quaVar.P) : nrb.g(size2, this.q);
            }
        }
    }

    @Override // defpackage.rib
    public final Optional a() {
        Optional optionalOfNullable = Optional.ofNullable(this.g);
        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((rih) optionalOfNullable.get()).a()) : optionalOfNullable;
    }

    @Override // defpackage.rib
    public final void c(rfs rfsVar) {
        synchronized (this) {
            this.u = rfsVar;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.a.set(false);
        synchronized (this.k) {
            this.p = null;
        }
        synchronized (this) {
            this.o = true;
        }
        ListenableFuture listenableFuture = this.m;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        rjc rjcVar = this.b;
        rjcVar.e(new rhl(this, 4));
        rjcVar.b();
    }

    @Override // defpackage.rhw
    public final void d(Semaphore semaphore) {
        if (this.a.get()) {
            throw new IllegalStateException("Trying to set the backpressure semaphore after starting.");
        }
        this.h = semaphore;
    }

    @Override // defpackage.rib
    public final void e(rft rftVar) {
        synchronized (this.k) {
            this.p = rftVar;
        }
    }

    @Override // defpackage.rib
    public boolean g() {
        rih rihVar = this.g;
        return rihVar != null && rihVar.i();
    }

    public synchronized void h(Duration duration) {
        rih rihVar = this.g;
        if (rihVar != null) {
            rihVar.b(duration);
        }
        this.v = false;
    }

    public synchronized void i(Duration duration) {
        rih rihVar = this.g;
        if (rihVar != null) {
            rihVar.g(duration);
        }
        this.v = false;
    }

    @Override // defpackage.rib
    public final void iF(long j) {
        rih rihVar = this.g;
        if (rihVar != null) {
            rihVar.e(j);
        }
    }

    protected ListenableFuture k(Context context) {
        return aher.a;
    }

    public final synchronized Size o() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[Catch: all -> 0x00d3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x000a, B:10:0x000e, B:12:0x0019, B:14:0x001f, B:16:0x0027, B:18:0x003c, B:19:0x0040, B:21:0x0044, B:23:0x0055, B:24:0x0073, B:26:0x0077, B:22:0x0050, B:37:0x0085, B:39:0x00a5, B:40:0x00ae), top: B:50:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00ce, please report this as an issue */
    public final synchronized rfs p() {
        Throwable e;
        rfq rfqVarA;
        Optional optionalOfNullable;
        rfs rfsVar = this.u;
        if (rfsVar != null) {
            this.u = null;
            return rfsVar;
        }
        if (!this.v) {
            ListenableFuture listenableFuture = this.m;
            listenableFuture.getClass();
            if (listenableFuture.isDone() && !g() && this.h.tryAcquire()) {
                rgf rgfVar = this.n;
                rgfVar.getClass();
                rgfVar.d(this.s.getWidth(), this.s.getHeight());
                try {
                    rfqVarA = rgfVar.a();
                    try {
                        rih rihVar = this.g;
                        if (rihVar != null) {
                            rfqVarA.a(ahbt.a(rihVar.a()));
                        } else {
                            rfqVarA.a(0L);
                        }
                        this.b.a().g(rfqVarA.getTextureName(), rfqVarA.getWidth(), rfqVarA.getHeight());
                        rgi.e(0);
                        rgi.g();
                        f(rfqVarA);
                        rih rihVar2 = this.g;
                        if (rihVar2 != null) {
                            rihVar2.f();
                        }
                        return rfqVarA;
                    } catch (bvn e2) {
                        e = e2;
                        rbc rbcVar = new rbc(x, rbd.e);
                        rbcVar.a = e;
                        rbcVar.c();
                        rbcVar.a("Failed to generate a texture in the source.", new Object[0]);
                        optionalOfNullable = Optional.ofNullable(rfqVarA);
                        if (true == optionalOfNullable.isPresent()) {
                            ((rfs) optionalOfNullable.get()).release();
                        }
                        this.h.release();
                        qug qugVar = this.e;
                        tge tgeVarA = quk.a();
                        tgeVarA.b = e;
                        tgeVarA.c = new quh(this.d, 4);
                        qugVar.a(tgeVarA.e());
                        return null;
                    } catch (RuntimeException e3) {
                        e = e3;
                        rbc rbcVar2 = new rbc(x, rbd.e);
                        rbcVar2.a = e;
                        rbcVar2.c();
                        rbcVar2.a("Failed to generate a texture in the source.", new Object[0]);
                        optionalOfNullable = Optional.ofNullable(rfqVarA);
                        if (true == optionalOfNullable.isPresent()) {
                            ((rfs) optionalOfNullable.get()).release();
                        }
                        this.h.release();
                        qug qugVar2 = this.e;
                        tge tgeVarA2 = quk.a();
                        tgeVarA2.b = e;
                        tgeVarA2.c = new quh(this.d, 4);
                        qugVar2.a(tgeVarA2.e());
                        return null;
                    }
                } catch (bvn | RuntimeException e4) {
                    e = e4;
                    rfqVarA = null;
                }
            }
        }
        return null;
    }

    protected final synchronized Optional q() {
        return this.j;
    }

    public final synchronized void r() {
        this.v = true;
    }

    public final void s(rfn rfnVar) {
        this.i = rfnVar;
        this.m = k(this.c);
    }

    public final synchronized void t(Size size) {
        this.r = size;
        j();
    }

    public final synchronized void u(Size size) {
        this.q = size;
        j();
    }

    public final synchronized void v(Optional optional) {
        this.j = optional;
        if (this.r != null) {
            j();
        }
    }

    public final synchronized void w() {
        if (this.m == null || this.o) {
            rbc rbcVar = new rbc(x, rbd.a);
            rbcVar.c();
            rbcVar.a("Calling start() %s. Ignoring.", this.m == null ? "before prepare() was called" : "after source was closed");
            return;
        }
        this.a.set(true);
        this.v = false;
        if (this.n != null) {
            throw new IllegalStateException("Trying to call start() multiple times.");
        }
        rfn rfnVar = this.i;
        rfnVar.getClass();
        rjc rjcVar = this.b;
        Handler handler = rjcVar.a().m;
        handler.getClass();
        this.n = rfnVar.c(handler, 0, 0);
        rjcVar.d(new rhl(this, 5));
    }

    protected void f(rfs rfsVar) {
    }
}
