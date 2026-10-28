package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class Instant implements Temporal, j$.time.temporal.l, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long j) {
        return r(j$.desugar.sun.nio.fs.g.A(j, 1000L), ((int) j$.desugar.sun.nio.fs.g.I(j, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return r(j$.desugar.sun.nio.fs.g.J(j, j$.desugar.sun.nio.fs.g.A(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.I(j2, 1000000000L));
    }

    public static Instant r(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        g.g("Instant exceeds minimum or maximum instant");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Instant s(j$.time.temporal.k kVar) {
        if (kVar instanceof Instant) {
            return (Instant) kVar;
        }
        Objects.a(kVar, "temporal");
        try {
            return ofEpochSecond(kVar.C(j$.time.temporal.a.INSTANT_SECONDS), kVar.h(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e) {
            throw new b(j$.desugar.sun.nio.fs.i.b("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()), e);
        }
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    public final Instant A(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.J(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    public final long B(Instant instant) {
        long jL = j$.desugar.sun.nio.fs.g.L(instant.a, this.a);
        long j = instant.b - this.b;
        if (jL <= 0 || j >= 0) {
            return (jL >= 0 || j <= 0) ? jL : jL + 1;
        }
        return jL - 1;
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = e.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.b;
        if (i != 1) {
            if (i == 2) {
                i2 /= 1000;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return this.a;
                    }
                    g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                    return 0L;
                }
                i2 /= 1000000;
            }
        }
        return i2;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (Instant) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.s(j);
        int i = e.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i == 1) {
            return j != ((long) i2) ? r(j2, (int) j) : this;
        }
        if (i == 2) {
            int i3 = ((int) j) * 1000;
            return i3 != i2 ? r(j2, i3) : this;
        }
        if (i == 3) {
            int i4 = ((int) j) * 1000000;
            return i4 != i2 ? r(j2, i4) : this;
        }
        if (i == 4) {
            return j != j2 ? r(j, i2) : this;
        }
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.r(this, zoneOffset);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare == 0 ? this.b - instant.b : iCompare;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.NANO_OF_SECOND || nVar == j$.time.temporal.a.MICRO_OF_SECOND || nVar == j$.time.temporal.a.MILLI_OF_SECOND) {
                return true;
            }
        } else if (nVar != null && nVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantS = s(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantS);
        }
        int i = e.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j$.desugar.sun.nio.fs.g.L(instantS.a, j), 1000000000L), instantS.b - i2);
            case 2:
                return j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j$.desugar.sun.nio.fs.g.L(instantS.a, j), 1000000000L), instantS.b - i2) / 1000;
            case 3:
                return j$.desugar.sun.nio.fs.g.L(instantS.toEpochMilli(), toEpochMilli());
            case 4:
                return B(instantS);
            case 5:
                return B(instantS) / 60;
            case 6:
                return B(instantS) / 3600;
            case 7:
                return B(instantS) / 43200;
            case 8:
                return B(instantS) / 86400;
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.d(this, nVar).a(nVar.l(this), nVar);
        }
        int i = e.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public boolean isBefore(Instant instant) {
        return compareTo(instant) >>> 31;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.k(this);
    }

    public Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.h(this, j);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return A(0L, j);
            case 2:
                return A(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(j$.desugar.sun.nio.fs.g.K(j, 60L));
            case 6:
                return plusSeconds(j$.desugar.sun.nio.fs.g.K(j, 3600L));
            case 7:
                return plusSeconds(j$.desugar.sun.nio.fs.g.K(j, 43200L));
            case 8:
                return plusSeconds(j$.desugar.sun.nio.fs.g.K(j, 86400L));
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public Instant plusMillis(long j) {
        return A(j / 1000, (j % 1000) * 1000000);
    }

    public Instant plusSeconds(long j) {
        return A(j, 0L);
    }

    public long toEpochMilli() {
        long j = this.a;
        int i = this.b;
        return (j >= 0 || i <= 0) ? j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j, 1000L), i / 1000000) : j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j + 1, 1000L), (i / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() <= 86400) {
            long nanos = duration.toNanos();
            if (86400000000000L % nanos == 0) {
                long j = ((this.a % 86400) * 1000000000) + ((long) this.b);
                return A(0L, (j$.desugar.sun.nio.fs.g.A(j, nanos) * nanos) - j);
            }
            g.e("Unit must divide into a standard day without remainder");
        } else {
            g.e("Unit is too large to be used for truncation");
        }
        return null;
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        if (oVar == j$.time.temporal.o.c) {
            return ChronoUnit.NANOS;
        }
        if (oVar == j$.time.temporal.o.b || oVar == j$.time.temporal.o.a || oVar == j$.time.temporal.o.e || oVar == j$.time.temporal.o.d || oVar == j$.time.temporal.o.f || oVar == j$.time.temporal.o.g) {
            return null;
        }
        return oVar.c(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }

    public static Instant ofEpochSecond(long j) {
        return r(j, 0);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.h(this);
    }
}
