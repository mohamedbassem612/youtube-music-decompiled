package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ril extends ctb {
    final AtomicReference H;
    private final boolean K;
    private final Semaphore L;
    private final rfl M;
    private final rih N;
    private final qys O;
    private final qua P;
    private final rij Q;
    private final riq R;
    private final rik S;
    private final AtomicBoolean T;
    private long U;
    private int V;
    private Size W;
    private bru X;
    private Optional Y;
    private final zhk aa;
    public Semaphore n;
    public boolean o;
    public boolean p;
    public int q;
    private static final rbm Z = new rbm("ril");
    private static final Duration I = Duration.ofSeconds(2);
    private static final Duration J = Duration.ofMillis(3);

    public ril(Context context, Handler handler, cty ctyVar, zhk zhkVar, Semaphore semaphore, rfl rflVar, rih rihVar, rbv rbvVar, qua quaVar, qys qysVar, rij rijVar, AtomicBoolean atomicBoolean) {
        cta ctaVar = new cta(context);
        ctaVar.d = new rbu(new clf(rbvVar.b), rbvVar.a);
        ctaVar.c = clu.a;
        ctaVar.e = 0L;
        ctaVar.f = true;
        ctaVar.g = handler;
        ctaVar.h = ctyVar;
        ctaVar.i = 1;
        ctaVar.j = 30.0f;
        super(ctaVar);
        this.U = -1L;
        this.o = false;
        this.V = 0;
        this.p = false;
        this.q = -1;
        this.W = new Size(1, 1);
        this.X = bru.a;
        this.Y = Optional.empty();
        this.H = new AtomicReference();
        this.aa = zhkVar;
        this.L = semaphore;
        this.M = rflVar;
        this.N = rihVar;
        this.P = quaVar;
        this.O = qysVar;
        this.Q = rijVar;
        this.R = new riq(this, qysVar);
        this.K = qysVar.d && !bwp.ac(context);
        this.S = new rik();
        this.T = atomicBoolean;
    }

    @Override // defpackage.ctb, defpackage.cls, defpackage.cav
    protected final void E(boolean z, boolean z2) {
        super.E(z, true);
    }

    @Override // defpackage.ctb, defpackage.cls, defpackage.cav
    protected final void G(long j, boolean z, boolean z2) {
        super.G(j, z, z2);
        riq riqVar = this.R;
        riqVar.a = true;
        riqVar.b = j;
        riqVar.c = -9223372036854775807L;
        this.Y = Optional.empty();
    }

    @Override // defpackage.ctb, defpackage.cls, defpackage.cav
    protected final void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) {
        if (aA() == -9223372036854775807L && !this.p) {
            this.V++;
        }
        super.M(bseVarArr, j, j2, cnmVar);
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final void aF(long j) {
        super.aF(j);
        this.R.b = j;
    }

    @Override // defpackage.ctb
    protected final void aV(clk clkVar, int i, long j, long j2) {
        quz quzVar;
        int i2 = this.V;
        Duration durationOfNanos = Duration.ofNanos(j2);
        Size sizeB = this.W;
        bru bruVar = this.X;
        Optional optionalOf = Optional.of(durationOfNanos);
        rij rijVar = this.Q;
        riv rivVar = (riv) rijVar;
        rfx rfxVarB = rivVar.B(i2, j, optionalOf, bruVar);
        if (rivVar.e.b && rivVar.x != -1) {
            rfw rfwVar = new rfw(rfxVarB);
            rfwVar.c(rivVar.x);
            rfxVarB = rfwVar.a();
            rivVar.x = -1L;
        }
        synchronized (rivVar.b) {
            quzVar = (quz) ((qup) ((riv) rijVar).y.get(i2)).b;
        }
        rfw rfwVar2 = new rfw(rfxVarB);
        if (quzVar.q(rivVar.e.j)) {
            rfwVar2.g = Optional.of(quzVar.i);
            rfwVar2.a = Optional.of(sizeB);
            sizeB = rgi.b(sizeB, quzVar.i);
        }
        rfz rfzVar = rivVar.r;
        rfwVar2.b(rivVar.H(quzVar.j, sizeB, rivVar.k));
        rfzVar.a.m.post(new plj(rfzVar, rfwVar2.a(), 17, null));
        rivVar.n.c();
        super.aV(clkVar, i, j, j2);
    }

    @Override // defpackage.ctb
    protected final void aX(clk clkVar, int i, long j) {
        super.aX(clkVar, i, j);
        this.L.release();
        Semaphore semaphore = this.n;
        if (semaphore != null) {
            semaphore.release();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j$.time.temporal.Temporal, java.lang.Object] */
    @Override // defpackage.ctb, defpackage.cls, defpackage.cdp
    public final void af(long j, long j2) throws cbo {
        if (this.Y.isPresent()) {
            Duration durationBetween = Duration.between(this.Y.get(), Instant.now());
            durationBetween.getClass();
            Duration duration = I;
            if (aext.k(duration, durationBetween)) {
                this.Y = Optional.empty();
                rbc rbcVar = new rbc(Z, rbd.e);
                rbcVar.c();
                rbcVar.d("Codec did not produce a frame in %s, inputEnded=%s", duration, Boolean.valueOf(X()));
                rbcVar.a("Codec did not produce a frame in a while, inputEnded=%s", Boolean.valueOf(X()));
                this.T.set(true);
            }
        }
        rik rikVar = this.S;
        rikVar.a();
        super.af(j, j2);
        rikVar.a();
    }

    @Override // defpackage.ctb, defpackage.cls, defpackage.cdp
    public final boolean ag() {
        if (this.O.c) {
            return super.ag() && this.R.c == 922337203685477580L;
        }
        return super.ag();
    }

    @Override // defpackage.ctb, defpackage.cls, defpackage.cdp
    public final boolean ah() {
        if (this.O.c) {
            return true;
        }
        return super.ah();
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final List al(clu cluVar, bse bseVar, boolean z) {
        return nqz.g(super.al(cluVar, bseVar, z), this.o, this.P);
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final void aq(bse bseVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        super.aq(bseVar, mediaFormat);
        if (mediaFormat == null) {
            rbc rbcVar = new rbc(Z, rbd.e);
            rbcVar.c();
            rbcVar.a("Media format is null", new Object[0]);
            return;
        }
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        int iRound = Math.round(integer / bseVar.D);
        int i = bseVar.B;
        boolean z = i == 90 || i == 270;
        int i2 = true != z ? iRound : integer2;
        if (true == z) {
            integer2 = iRound;
        }
        this.W = new Size(i2, integer2);
        bru bruVar = bseVar.G;
        if (bruVar != null) {
            this.X = bruVar;
            return;
        }
        rbc rbcVar2 = new rbc(Z, rbd.e);
        rbcVar2.c();
        rbcVar2.a("Color info is null", new Object[0]);
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final void as() {
        super.as();
        if (this.p) {
            return;
        }
        this.V++;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    @Override // defpackage.ctb, defpackage.cls
    protected final boolean au(long j, long j2, clk clkVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, bse bseVar) {
        float f;
        long j4;
        this.Y = Optional.of(Instant.now());
        if (!this.aa.g()) {
            return false;
        }
        Semaphore semaphore = this.L;
        if (semaphore.availablePermits() > 1) {
            int iDrainPermits = semaphore.drainPermits();
            rbc rbcVar = new rbc(Z, rbd.c);
            rbcVar.c();
            rbcVar.a("Surface semaphore has more than max permits, Reducing to permits to prevent race conditions.", new Object[0]);
            semaphore.release(iDrainPermits);
        }
        if (semaphore.tryAcquire()) {
            this.U = j2;
        } else {
            long j5 = this.U;
            if (j5 == -1) {
                this.U = j2;
                return false;
            }
            if (j2 - j5 <= 3000000) {
                return false;
            }
            this.U = j2;
            rbc rbcVar2 = new rbc(Z, rbd.c);
            rbcVar2.c();
            rbcVar2.d("Surface semaphore timed out, it has been more than %d Us since we last acquired the semaphore. Releasing a permit to prevent freeze.", 3000000L);
            rbcVar2.a("Surface semaphore timed out. Releasing a permit to prevent freeze.", new Object[0]);
            Semaphore semaphore2 = this.n;
            if (semaphore2 != null) {
                semaphore2.release();
            }
            rik rikVar = this.S;
            synchronized (rikVar.a) {
                rikVar.b++;
            }
            this.T.set(true);
        }
        if (this.p) {
            this.V = this.q;
            this.p = false;
        }
        Semaphore semaphore3 = this.n;
        if (semaphore3 != null && !semaphore3.tryAcquire()) {
            this.L.release();
            return false;
        }
        rij rijVar = this.Q;
        riv rivVar = (riv) rijVar;
        Runnable runnable = rivVar.i;
        long jMax = Math.max(0L, j3 - aA());
        int i4 = this.V;
        synchronized (rivVar.b) {
            f = ((quz) ((qup) ((riv) rijVar).y.get(i4)).b).n;
        }
        if (z2) {
            j4 = jMax;
            aV(clkVar, i, j4, p().c());
        } else if (z) {
            aX(clkVar, i, jMax);
        } else {
            int i5 = (f > 2.0f ? 1 : (f == 2.0f ? 0 : -1)) ^ (-1);
            rih rihVar = this.N;
            if (!rihVar.h() || (i5 >= 0 && !this.O.h)) {
                j4 = jMax;
            } else {
                rij rijVar2 = this.Q;
                rfx rfxVarB = rijVar2.B(this.V, jMax, Optional.empty(), this.X);
                j4 = jMax;
                Duration durationA = rihVar.a();
                if (i5 >= 0 && this.O.h) {
                    durationA = durationA.minus(J);
                }
                if (rfxVarB.d < ahbt.a(durationA)) {
                    rihVar.d(rijVar2.B(this.V, j4, Optional.empty(), this.X).d);
                    aX(clkVar, i, j4);
                }
            }
            aV(clkVar, i, j4, p().c());
        }
        return true;
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final void ax(String str, gmj gmjVar, long j, long j2) {
        super.ax(str, gmjVar, j, j2);
        synchronized (this.S.a) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    @Override // defpackage.ctb
    protected final MediaFormat bm(bse bseVar, String str, aamu aamuVar, float f, boolean z) {
        boolean z2;
        MediaFormat mediaFormatBm = super.bm(bseVar, str, aamuVar, f, z);
        boolean z3 = this.P.ab;
        rfl rflVar = this.M;
        if (z3) {
            z2 = rflVar.b >= 3;
        } else {
            z2 = rflVar.a;
        }
        rbm rbmVar = riw.a;
        if (Build.VERSION.SDK_INT >= 31) {
            int integer = mediaFormatBm.getInteger("color-transfer", 0);
            if (!Build.MANUFACTURER.equals("Google") || !Build.ID.startsWith("TP1A")) {
                if (integer == 7) {
                    String str2 = bwp.c;
                    if (!str2.startsWith("SM-F936") && !str2.startsWith("SM-F916") && !str2.startsWith("SM-F721") && !str2.equals("SM-X900")) {
                        integer = 7;
                        if ((Build.VERSION.SDK_INT < 34 || integer != 6 || !bwp.c.startsWith("SM-F936")) && nqw.e(mediaFormatBm) && !z2) {
                            rbc rbcVar = new rbc(riw.a, rbd.c);
                            rbcVar.c();
                            rbcVar.a("Cannot use shader-based tone mapping, falling back to MediaCodec-based tone mapping.", new Object[0]);
                            if (Build.VERSION.SDK_INT >= 31 && ((!Build.MANUFACTURER.equals("Google") || !Build.ID.startsWith("TP1A")) && nqw.e(mediaFormatBm))) {
                                mediaFormatBm.setInteger("color-transfer-request", 3);
                            }
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 34) {
                    rbc rbcVar2 = new rbc(riw.a, rbd.c);
                    rbcVar2.c();
                    rbcVar2.a("Cannot use shader-based tone mapping, falling back to MediaCodec-based tone mapping.", new Object[0]);
                    if (Build.VERSION.SDK_INT >= 31) {
                        mediaFormatBm.setInteger("color-transfer-request", 3);
                    }
                } else {
                    rbc rbcVar3 = new rbc(riw.a, rbd.c);
                    rbcVar3.c();
                    rbcVar3.a("Cannot use shader-based tone mapping, falling back to MediaCodec-based tone mapping.", new Object[0]);
                    if (Build.VERSION.SDK_INT >= 31) {
                        mediaFormatBm.setInteger("color-transfer-request", 3);
                    }
                }
            }
        }
        if (this.O.a) {
            int i = bwp.a;
            mediaFormatBm.setInteger("priority", 1);
        }
        if (this.K) {
            mediaFormatBm.setInteger("allow-frame-drop", 0);
        }
        this.H.set(mediaFormatBm);
        return mediaFormatBm;
    }

    @Override // defpackage.ctb, defpackage.cls
    protected final float e(float f, bse bseVar, bse[] bseVarArr) {
        float fFloatValue;
        if (!this.O.e) {
            return super.e(f, bseVar, bseVarArr);
        }
        rij rijVar = this.Q;
        synchronized (((riv) rijVar).b) {
            int i = 0;
            fFloatValue = ((Float) Collection.EL.stream(((riv) rijVar).y).map(new ris(i)).max(new rit(i)).orElse(Float.valueOf(1.0f))).floatValue();
        }
        return super.e(fFloatValue, bseVar, bseVarArr);
    }

    @Override // defpackage.cav, defpackage.cdp
    public final ccz s() {
        return this.R;
    }
}
