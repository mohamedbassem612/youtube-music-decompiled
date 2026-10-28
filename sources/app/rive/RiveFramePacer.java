package app.rive;

import defpackage.awqx;
import defpackage.awrc;
import defpackage.awro;
import defpackage.awtl;
import defpackage.awtn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFramePacer {
    public static final int $stable = 8;
    private final long earlyWake;
    private long nextRenderTimeNs;
    private final awtl period;

    private RiveFramePacer(RiveFrameRate riveFrameRate, long j) {
        riveFrameRate.getClass();
        this.earlyWake = j;
        RiveFrameRate.Capped capped = riveFrameRate instanceof RiveFrameRate.Capped ? (RiveFrameRate.Capped) riveFrameRate : null;
        this.period = capped != null ? new awtl(capped.m298xdaaf0173()) : null;
    }

    /* JADX INFO: renamed from: delayBeforeNextFrame-5sfh64U, reason: not valid java name */
    public final long m297delayBeforeNextFrame5sfh64U(long j) {
        awtl awtlVar = this.period;
        if (awtlVar == null) {
            int i = awtl.b;
            return 0L;
        }
        long j2 = this.nextRenderTimeNs;
        if (j2 == 0) {
            return 0L;
        }
        long j3 = awtlVar.a;
        Comparable comparableK = awro.k(new awtl(awtl.e(awrc.j(j2 - j, awtn.NANOSECONDS), ((awtl) awro.k(new awtl(this.earlyWake), new awtl(0L))).a)), new awtl(0L));
        awtl awtlVar2 = new awtl(j3);
        if (comparableK.compareTo(awtlVar2) > 0) {
            comparableK = awtlVar2;
        }
        return ((awtl) comparableK).a;
    }

    public final void reset() {
        this.nextRenderTimeNs = 0L;
    }

    public final boolean tryScheduleFrame(long j) {
        awtl awtlVar = this.period;
        if (awtlVar == null) {
            return true;
        }
        long j2 = this.nextRenderTimeNs;
        if (j2 != 0 && j < j2) {
            return false;
        }
        long jC = awtl.c(awtlVar.a);
        if (j2 == 0) {
            this.nextRenderTimeNs = j + jC;
            return true;
        }
        this.nextRenderTimeNs = j2 + ((((j - j2) / jC) + 1) * jC);
        return true;
    }

    public /* synthetic */ RiveFramePacer(RiveFrameRate riveFrameRate, long j, awqx awqxVar) {
        this(riveFrameRate, j);
    }

    public /* synthetic */ RiveFramePacer(RiveFrameRate riveFrameRate, long j, int i, awqx awqxVar) {
        this(riveFrameRate, (i & 2) != 0 ? RiveFrameRateKt.DEFAULT_EARLY_WAKE : j, null);
    }
}
