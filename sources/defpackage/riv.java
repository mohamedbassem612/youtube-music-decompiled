package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.car.app.model.Alert;
import androidx.media3.exoplayer.ExoPlayer;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class riv implements rhw, btf, rin, rij {
    public final zhk A;
    private final rjb B;
    private boolean C;
    private Instant D;
    private final tld E;
    private final tld F;
    public final Object b = new Object();
    public final Semaphore c = new Semaphore(0);
    public final Context d;
    public final qys e;
    public final ExoPlayer f;
    public final qug g;
    public final rfl h;
    public final Runnable i;
    public ril j;
    public final Size k;
    public final rih l;
    public final rip m;
    public final rbn n;
    public final rbv o;
    public final AtomicBoolean p;
    public final qua q;
    public rfz r;
    public Surface s;
    public rft t;
    public Semaphore u;
    public Runnable v;
    public boolean w;
    public long x;
    public agke y;
    public static final rbm z = new rbm("riv");
    static final Duration a = Duration.ofSeconds(1);

    public riv(Context context, agke agkeVar, Size size, rih rihVar, qys qysVar, rfl rflVar, Optional optional, Optional optional2, rjb rjbVar, qug qugVar, qua quaVar, AtomicBoolean atomicBoolean, boolean z2, Runnable runnable) {
        zhk zhkVar = new zhk(null, null);
        this.A = zhkVar;
        this.n = new rbn();
        this.C = false;
        this.w = false;
        this.x = -1L;
        this.d = context;
        this.k = size;
        this.l = rihVar;
        Uri uriC = ((quz) ((qup) agkeVar.get(0)).b).k.c();
        this.h = rflVar;
        this.e = qysVar;
        this.B = rjbVar;
        this.g = qugVar;
        this.o = new rbv(context);
        this.p = atomicBoolean;
        this.q = quaVar;
        this.i = runnable;
        tld tldVar = new tld(String.format("exoplayer-worker-%s", uriC), 0);
        this.E = tldVar;
        tld tldVar2 = new tld(String.format("exoplayer-playback-%s", uriC), -16);
        this.F = tldVar2;
        zhkVar.h();
        cbt cbtVar = new cbt(context);
        cbtVar.d(tldVar.k());
        cbtVar.f(tldVar2.k());
        cbtVar.h(new riu(this));
        cbb cbbVar = new cbb();
        cbbVar.b(350, 10000, 350, 350);
        cbtVar.c(cbbVar.a());
        cbtVar.g(2000L);
        cbtVar.i(Alert.DURATION_SHOW_INDEFINITELY);
        cbtVar.j(Alert.DURATION_SHOW_INDEFINITELY);
        optional2.isPresent();
        optional2.isPresent();
        byd bydVar = (byd) optional2.orElse(new byj(context));
        cmy cmyVar = optional.isPresent() ? new cmy(new rbx(bydVar, (quo) optional.get(), quaVar), new cve()) : new cmy(bydVar, new cve());
        cmyVar.e(quaVar.U);
        cbtVar.e(cmyVar);
        ExoPlayer exoPlayerA = cbtVar.a();
        this.f = exoPlayerA;
        rip ripVar = new rip(exoPlayerA, this, qugVar, rim.a);
        this.m = ripVar;
        exoPlayerA.y(ripVar);
        exoPlayerA.y(this);
        if (z2) {
            aH();
        }
        D(new rhz(this, agkeVar, 3, null));
    }

    private final long I() {
        return this.q.S.toSeconds() + 5;
    }

    private final void J(tld tldVar, Runnable runnable) {
        Looper looperK = tldVar.k();
        if (looperK == null) {
            rbc rbcVar = new rbc(z, rbd.c);
            rbcVar.c();
            rbcVar.a("Cannot a post a task on a null looper.", new Object[0]);
            return;
        }
        if (Thread.currentThread() == looperK.getThread()) {
            runnable.run();
            return;
        }
        Semaphore semaphore = new Semaphore(0);
        if (!((Handler) tldVar.b).post(new rhz(runnable, semaphore, 6, null))) {
            rbc rbcVar2 = new rbc(z, rbd.c);
            rbcVar2.c();
            rbcVar2.a("Failed to post a task on the looper.", new Object[0]);
            return;
        }
        try {
            if (semaphore.tryAcquire(I(), TimeUnit.SECONDS)) {
                return;
            }
            rbc rbcVar3 = new rbc(z, rbd.c);
            rbcVar3.c();
            rbcVar3.a("Timed out waiting for ExoPlayer task.", new Object[0]);
        } catch (InterruptedException e) {
            rbc rbcVar4 = new rbc(z, rbd.a);
            rbcVar4.a = e;
            rbcVar4.c();
            rbcVar4.a("Interrupted waiting for ExoPlayer task.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.rij
    public final rfx B(int i, long j, Optional optional, bru bruVar) {
        rfx rfxVarA;
        synchronized (this.b) {
            qup qupVar = (qup) this.y.get(i);
            quz quzVar = (quz) qupVar.b;
            long jA = ahbt.a(quzVar.l);
            long jA2 = ahbt.a(qupVar.d);
            long j2 = (long) ((j - jA) / quzVar.n);
            long jD = ast.d(j2, (-1) + jA2);
            if (Math.abs(j2 - jD) > 200000) {
                rbc rbcVar = new rbc(z, rbd.d);
                rbcVar.c();
                rbcVar.d("Frame timestamp too far from the expected segment boundary, unclampedTimestampWithinSegment=%d, segmentSourceStartTimeMicros=%d, segmentDurationMicros=%d, playbackRate=%s", Long.valueOf(j2), 0, Long.valueOf(jA2), Float.valueOf(quzVar.n));
                rbcVar.a("Frame timestamp too far from the expected segment boundary", new Object[0]);
            }
            long jA3 = ahbt.a(qupVar.c) + jD;
            rfw rfwVar = new rfw();
            quz quzVar2 = (quz) ((qup) this.y.get(i)).b;
            rfwVar.b(H(quzVar2.j, new Size(quzVar2.k.b(), quzVar2.k.a()), this.k));
            rfwVar.c(jA3 - ahbt.a(((qup) this.y.get(0)).c));
            rfwVar.b = jA3;
            byte b = rfwVar.h;
            rfwVar.c = j;
            rfwVar.h = (byte) (b | 6);
            UUID uuid = ((qup) this.y.get(i)).a;
            if (uuid == null) {
                throw new NullPointerException("Null referenceId");
            }
            rfwVar.d = uuid;
            rfwVar.e = optional;
            if (bruVar == null) {
                throw new NullPointerException("Null colorInfo");
            }
            rfwVar.f = bruVar;
            rfxVarA = rfwVar.a();
        }
        return rfxVarA;
    }

    public final void C(Runnable runnable) {
        J(this.F, runnable);
    }

    public final void D(Runnable runnable) {
        J(this.E, runnable);
    }

    public final void E() {
        C(new rhl(this.A, 12));
    }

    public final void F(agke agkeVar) {
        C(new rhl(this.A, 12));
        synchronized (this.b) {
            this.y = agkeVar;
        }
        aG(0);
        ((brs) this.f).J((List) Collection.EL.stream(agkeVar).map(new rhk(this, 2)).collect(aghu.a));
        C(new rhl(this.A, 6));
    }

    public final void G(agke agkeVar) {
        D(new rhz(this, agkeVar, 5, null));
    }

    public final Size H(int i, Size size, Size size2) {
        qua quaVar = this.q;
        return quaVar.C ? nrb.h(size, size2, i, quaVar.P) : nrb.g(size, size2);
    }

    @Override // defpackage.rib
    public final /* synthetic */ Optional a() {
        return Optional.empty();
    }

    @Override // defpackage.rin
    public final UUID aD() {
        UUID uuid;
        synchronized (this.b) {
            ExoPlayer exoPlayer = this.f;
            int iL = exoPlayer.l();
            if (iL >= this.y.size()) {
                rbc rbcVar = new rbc(z, rbd.e);
                rbcVar.c();
                rbcVar.a("Couldn't find media item with index=%d, segmentsCount=%d; falling back to the first segment in the layer", Integer.valueOf(iL), Integer.valueOf(this.y.size()));
            }
            uuid = ((qup) this.y.get(exoPlayer.l())).a;
        }
        return uuid;
    }

    @Override // defpackage.rin
    public final void aF() {
        bth bthVar = this.f;
        ((brs) bthVar).h(bthVar.l(), bthVar.r(), false);
    }

    @Override // defpackage.rin
    public final void aG(int i) {
        C(new rir(this, i, 0));
    }

    @Override // defpackage.rin
    public final void aH() {
        C(new rhl(this, 8));
    }

    @Override // defpackage.rin
    public final boolean aI() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    @Override // defpackage.rib
    public final void c(rfs rfsVar) throws Throwable {
        boolean zTryAcquire;
        boolean z2 = false;
        try {
            zTryAcquire = this.c.tryAcquire(I(), TimeUnit.SECONDS);
            if (!zTryAcquire) {
                try {
                    try {
                        rbc rbcVar = new rbc(z, rbd.d);
                        rbcVar.c();
                        rbcVar.a("Timed out waiting for surface semaphore for the flush frame. Ignoring unsafely.", new Object[0]);
                    } catch (InterruptedException e) {
                        e = e;
                        rbc rbcVar2 = new rbc(z, rbd.a);
                        rbcVar2.a = e;
                        rbcVar2.c();
                        rbcVar2.a("Interrupted waiting for surface semaphore for a flush frame.", new Object[0]);
                        Thread.currentThread().interrupt();
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = zTryAcquire;
                    if (z2) {
                        this.c.release();
                    }
                    throw th;
                }
            }
            rfz rfzVar = this.r;
            rfzVar.a.m.post(new plj(rfzVar, rfsVar, 16, null));
        } catch (InterruptedException e2) {
            e = e2;
            zTryAcquire = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                this.c.release();
            }
            throw th;
        }
        if (zTryAcquire) {
            this.c.release();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        D(new rhl(this, 9));
        this.F.m();
        this.E.m();
        if (this.e.g) {
            this.B.i(new rhl(this, 10));
        }
    }

    @Override // defpackage.rhw
    public final void d(Semaphore semaphore) {
        this.u = semaphore;
        this.j.n = semaphore;
    }

    @Override // defpackage.rib
    public final void e(rft rftVar) {
        this.t = rftVar;
        rfz rfzVar = this.r;
        if (rfzVar != null) {
            rfzVar.a(rftVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    @Override // defpackage.rib
    public final boolean g() {
        if (!this.C) {
            return false;
        }
        Semaphore semaphore = this.c;
        if (semaphore.availablePermits() == 1) {
            if (semaphore.availablePermits() > 1) {
                rbc rbcVar = new rbc(z, rbd.c);
                rbcVar.c();
                rbcVar.a("ExoPlayer reached ended with more than one permit available", new Object[0]);
            }
        } else {
            if (!this.e.i) {
                return false;
            }
            if (semaphore.availablePermits() <= 0) {
                Instant instant = this.D;
                if (instant == null) {
                    return false;
                }
                Duration durationBetween = Duration.between(instant, Instant.now());
                durationBetween.getClass();
                if (!aext.i(a, durationBetween)) {
                    return false;
                }
                rbc rbcVar2 = new rbc(z, rbd.c);
                rbcVar2.c();
                rbcVar2.a("ExoPlayer reached ended state, but the final frame was lost, forcing EOS", new Object[0]);
            } else if (semaphore.availablePermits() > 1) {
                rbc rbcVar3 = new rbc(z, rbd.c);
                rbcVar3.c();
                rbcVar3.a("ExoPlayer reached ended with more than one permit available", new Object[0]);
            }
        }
        return true;
    }

    @Override // defpackage.btf
    public final void gl(int i) {
        Runnable runnable;
        rfz rfzVar;
        this.C = i == 4;
        this.D = Instant.now();
        if (!this.C || (runnable = this.v) == null || (rfzVar = this.r) == null) {
            return;
        }
        rfzVar.a.m.post(runnable);
    }

    @Override // defpackage.rib
    public final void iF(long j) {
        this.l.e(j);
    }

    @Override // defpackage.btf
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gg(boolean z2) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gh(boolean z2) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gi(bsx bsxVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gk(btb btbVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void iE(brq brqVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void j(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void k(bta btaVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void l(bta btaVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void p(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void q(boolean z2) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void s(btu btuVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void t(btz btzVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void u(float f) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void z(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gf(bth bthVar, bte bteVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gj(boolean z2, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void m(boolean z2, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void r(int i, int i2) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void n(btg btgVar, btg btgVar2, int i) {
    }
}
