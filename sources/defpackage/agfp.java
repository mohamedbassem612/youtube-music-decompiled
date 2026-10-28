package defpackage;

import j$.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agfp {
    public boolean a;
    private final agfx b;
    private long c;
    private long d;

    public agfp(agfx agfxVar) {
        agfxVar.getClass();
        this.b = agfxVar;
    }

    public static agfp b(agfx agfxVar) {
        agfp agfpVar = new agfp(agfxVar);
        agfpVar.e();
        return agfpVar;
    }

    private final long g() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(g(), TimeUnit.NANOSECONDS);
    }

    public final Duration c() {
        return Duration.ofNanos(g());
    }

    public final void d() {
        this.c = 0L;
        this.a = false;
    }

    public final void e() {
        ahno.P(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void f() {
        long jA = this.b.a();
        ahno.P(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += jA - this.d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jG = g();
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
        if (jG / 86400000000000L > 0) {
            timeUnit = TimeUnit.DAYS;
        } else {
            TimeUnit timeUnit4 = TimeUnit.HOURS;
            TimeUnit timeUnit5 = TimeUnit.NANOSECONDS;
            if (jG / 3600000000000L > 0) {
                timeUnit = TimeUnit.HOURS;
            } else {
                TimeUnit timeUnit6 = TimeUnit.MINUTES;
                TimeUnit timeUnit7 = TimeUnit.NANOSECONDS;
                if (jG / 60000000000L > 0) {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    TimeUnit timeUnit8 = TimeUnit.SECONDS;
                    TimeUnit timeUnit9 = TimeUnit.NANOSECONDS;
                    if (jG / 1000000000 > 0) {
                        timeUnit = TimeUnit.SECONDS;
                    } else {
                        TimeUnit timeUnit10 = TimeUnit.MILLISECONDS;
                        TimeUnit timeUnit11 = TimeUnit.NANOSECONDS;
                        if (jG / 1000000 > 0) {
                            timeUnit = TimeUnit.MILLISECONDS;
                        } else {
                            TimeUnit timeUnit12 = TimeUnit.MICROSECONDS;
                            TimeUnit timeUnit13 = TimeUnit.NANOSECONDS;
                            timeUnit = jG / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jG / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (agfo.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return a.cl(str, (byte) 32, str2);
    }

    public agfp() {
        this.b = agfx.b;
    }
}
