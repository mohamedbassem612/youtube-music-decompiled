package defpackage;

import io.grpc.Status;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdn implements Runnable {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ avdt f;

    public avdn(avdt avdtVar, auzi auziVar, boolean z) {
        long jB;
        this.f = avdtVar;
        this.a = z;
        if (auziVar == null) {
            this.b = false;
            jB = 0;
        } else {
            this.b = true;
            jB = auziVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = jB;
    }

    final Status a() {
        long j = this.c;
        long jAbs = Math.abs(j);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j2 = jAbs / 1000000000;
        long jAbs2 = Math.abs(j);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long j3 = jAbs2 % 1000000000;
        StringBuilder sb = new StringBuilder(true != this.a ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(j2);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(j3)));
        sb.append("s. ");
        avdt avdtVar = this.f;
        Long l = (Long) avdtVar.h.d(auyw.a);
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(l == null ? 0.0d : l.longValue() / avdt.b)));
        if (avdtVar.i != null) {
            avfu avfuVar = new avfu();
            avdtVar.i.g(avfuVar);
            sb.append(' ');
            sb.append(avfuVar);
        }
        return Status.e.withDescription(sb.toString());
    }

    final void b() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.i.h(a());
    }
}
