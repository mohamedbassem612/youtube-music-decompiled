package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.l, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime r(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.H(instant.getEpochSecond(), instant.getNano(), offset), offset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 10, this);
    }

    public final OffsetDateTime A(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = m.a[((j$.time.temporal.a) nVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? localDateTime.C(nVar) : zoneOffset.getTotalSeconds();
        }
        return localDateTime.toEpochSecond(zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = m.a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? A(localDateTime.a(j, nVar), zoneOffset) : A(localDateTime, ZoneOffset.L(aVar.b.a(j, aVar)));
        }
        return r(Instant.ofEpochSecond(j, localDateTime.b.d), zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompareTo;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        LocalDateTime localDateTime = offsetDateTime2.a;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            iCompareTo = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime2 = this.a;
            int iCompare = Long.compare(localDateTime2.toEpochSecond(zoneOffset2), localDateTime.toEpochSecond(offsetDateTime2.b));
            iCompareTo = iCompare == 0 ? localDateTime2.b.d - localDateTime.b.d : iCompare;
        }
        return iCompareTo == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompareTo;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return (nVar instanceof j$.time.temporal.a) || (nVar != null && nVar.h(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTime;
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetI = ZoneOffset.I(temporal);
                LocalDate localDate = (LocalDate) temporal.w(j$.time.temporal.o.f);
                LocalTime localTime = (LocalTime) temporal.w(j$.time.temporal.o.g);
                temporal = (localDate == null || localTime == null) ? r(Instant.s(temporal), zoneOffsetI) : new OffsetDateTime(LocalDateTime.B(localDate, localTime), zoneOffsetI);
            } catch (b e) {
                throw new b(j$.desugar.sun.nio.fs.i.b("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, temporal);
        }
        ZoneOffset zoneOffset = temporal.b;
        ZoneOffset zoneOffset2 = this.b;
        if (!zoneOffset2.equals(zoneOffset)) {
            offsetDateTime = temporal;
            offsetDateTime = new OffsetDateTime(temporal.a.J(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()), zoneOffset2);
        }
        offsetDateTime = temporal;
        return this.a.e(offsetDateTime.a, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.a(this, nVar);
        }
        int i = m.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.h(nVar) : this.b.getTotalSeconds();
        }
        g.e("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        boolean zC = j$.desugar.sun.nio.fs.i.c(localDate);
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        if (zC) {
            return A(localDateTime.x(localDate), zoneOffset);
        }
        localDate.getClass();
        return (OffsetDateTime) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).b : this.a.l(nVar);
        }
        return nVar.k(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return temporal.a(localDateTime.a.toEpochDay(), aVar).a(localDateTime.b.O(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? A(this.a.b(j, temporalUnit), this.b) : (OffsetDateTime) temporalUnit.h(this, j);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        if (oVar == j$.time.temporal.o.d || oVar == j$.time.temporal.o.e) {
            return this.b;
        }
        if (oVar == j$.time.temporal.o.a) {
            return null;
        }
        j$.desugar.sun.nio.fs.o oVar2 = j$.time.temporal.o.f;
        LocalDateTime localDateTime = this.a;
        if (oVar == oVar2) {
            return localDateTime.a;
        }
        if (oVar == j$.time.temporal.o.g) {
            return localDateTime.b;
        }
        if (oVar == j$.time.temporal.o.b) {
            return j$.time.chrono.s.c;
        }
        return oVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : oVar.c(this);
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
}
