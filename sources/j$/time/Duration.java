package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    public static final BigInteger c = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.e(temporal2, ChronoUnit.NANOS));
        } catch (b | ArithmeticException unused) {
            long jE = temporal.e(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long jC = temporal2.C(aVar) - temporal.C(aVar);
                if (jE > 0 && jC < 0) {
                    jE++;
                } else if (jE < 0 && jC > 0) {
                    jE--;
                }
                j = jC;
            } catch (b unused2) {
            }
            return ofSeconds(jE, j);
        }
    }

    public static Duration l(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        Duration duration = ZERO;
        duration.getClass();
        Objects.a(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.r(j$.desugar.sun.nio.fs.g.K(j, 86400L), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            g.e("Unit must not have an estimated duration");
            return null;
        }
        if (j == 0) {
            return duration;
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            Duration durationMultipliedBy = temporalUnit.getDuration().multipliedBy(j);
            return duration.r(durationMultipliedBy.getSeconds(), 0L).plusNanos(durationMultipliedBy.getNano());
        }
        int i = d.a[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return duration.plusNanos(j);
        }
        if (i == 2) {
            return duration.r((j / 1000000000) * 1000, 0L).plusNanos((j % 1000000000) * 1000);
        }
        if (i != 3) {
            return i != 4 ? duration.r(j$.desugar.sun.nio.fs.g.K(temporalUnit.getDuration().a, j), 0L) : duration.r(j, 0L);
        }
        return duration.plusMillis(j);
    }

    public static Duration ofDays(long j) {
        return l(j$.desugar.sun.nio.fs.g.K(j, 86400L), 0);
    }

    public static Duration ofHours(long j) {
        return l(j$.desugar.sun.nio.fs.g.K(j, 3600L), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return l(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return l(j$.desugar.sun.nio.fs.g.K(j, 60L), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return l(j2, i);
    }

    public static Duration ofSeconds(long j, long j2) {
        return l(j$.desugar.sun.nio.fs.g.J(j, j$.desugar.sun.nio.fs.g.A(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.I(j2, 1000000000L));
    }

    public static Duration p(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: ".concat(String.valueOf(bigIntegerExact)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 1, this);
    }

    public Duration abs() {
        return isNegative() ? negated() : this;
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.a, duration.a);
        return iCompare == 0 ? this.b - duration.b : iCompare;
    }

    public Duration dividedBy(long j) {
        if (j != 0) {
            return j != 1 ? p(BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9)).divide(BigDecimal.valueOf(j), RoundingMode.DOWN)) : this;
        }
        throw new ArithmeticException("Cannot divide by zero");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal h(Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.b(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.b(i, ChronoUnit.NANOS) : temporal;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    public boolean isNegative() {
        return (this.a > 0L ? 1 : (this.a == 0L ? 0 : -1)) >>> 31;
    }

    public boolean isZero() {
        return (this.a | ((long) this.b)) == 0;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal k(Instant instant) {
        long j = this.a;
        Instant instantY = instant;
        if (j != 0) {
            instantY = instant.y(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i == 0) {
            return instantY;
        }
        return instantY.y(i, ChronoUnit.NANOS);
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? r(Long.MAX_VALUE, -nano).r(1L, 0L) : r(-seconds, -nano);
    }

    public Duration minusMillis(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusMillis(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusMillis(j2);
    }

    public Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        return j != 1 ? p(BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9)).multiply(BigDecimal.valueOf(j))) : this;
    }

    public Duration negated() {
        return multipliedBy(-1L);
    }

    public Duration plus(Duration duration) {
        return r(duration.getSeconds(), duration.getNano());
    }

    public Duration plusMillis(long j) {
        return r(j / 1000, (j % 1000) * 1000000);
    }

    public Duration plusMinutes(long j) {
        return r(j$.desugar.sun.nio.fs.g.K(j, 60L), 0L);
    }

    public Duration plusNanos(long j) {
        return r(0L, j);
    }

    public final Duration r(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.J(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    public long toDays() {
        return this.a / 86400;
    }

    public long toHours() {
        return this.a / 3600;
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j2, 1000L), j / 1000000);
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public long toNanos() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j2, 1000000000L), j);
    }

    public long toSeconds() {
        return this.a;
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - ((long) i));
            } else {
                sb.append(((long) i) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public Duration truncatedTo(TemporalUnit temporalUnit) {
        Objects.a(temporalUnit, "unit");
        ChronoUnit chronoUnit = ChronoUnit.SECONDS;
        int i = this.b;
        long j = this.a;
        if (temporalUnit == chronoUnit && (j >= 0 || i == 0)) {
            return new Duration(j, 0);
        }
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() <= 86400) {
            long nanos = duration.toNanos();
            if (86400000000000L % nanos == 0) {
                long j2 = ((j % 86400) * 1000000000) + ((long) i);
                return plusNanos(((j2 / nanos) * nanos) - j2);
            }
            g.e("Unit must divide into a standard day without remainder");
        } else {
            g.e("Unit is too large to be used for truncation");
        }
        return null;
    }

    public static Duration ofSeconds(long j) {
        return l(j, 0);
    }
}
