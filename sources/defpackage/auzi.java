package defpackage;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzi implements Comparable {
    public static final atxy c = new atxy();
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public volatile boolean b;
    private final atxy g;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        d = 3153600000000000000L;
        e = -3153600000000000000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f = 1000000000L;
    }

    public auzi(atxy atxyVar, long j, long j2) {
        this.g = atxyVar;
        long jMin = Math.min(d, Math.max(e, j2));
        this.a = j + jMin;
        this.b = jMin <= 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(auzi auziVar) {
        atxy atxyVar = this.g;
        atxy atxyVar2 = auziVar.g;
        if (atxyVar == atxyVar2) {
            return Long.compare(this.a, auziVar.a);
        }
        throw new AssertionError("Tickers (" + atxyVar.toString() + " and " + atxyVar2.toString() + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final long b(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.b && this.a - jNanoTime <= 0) {
            this.b = true;
        }
        return timeUnit.convert(this.a - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auzi) {
            auzi auziVar = (auzi) obj;
            if (this.g == auziVar.g && this.a == auziVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.g, Long.valueOf(this.a));
    }

    public final String toString() {
        long jB = b(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jB);
        long j = f;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jB) % j;
        StringBuilder sb = new StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        atxy atxyVar = this.g;
        if (atxyVar != c) {
            sb.append(a.cn((byte) 41, atxyVar, " (ticker="));
        }
        return sb.toString();
    }
}
