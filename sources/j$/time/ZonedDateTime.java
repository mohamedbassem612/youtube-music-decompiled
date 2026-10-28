package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class ZonedDateTime implements Temporal, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime p(long j, int i, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.H(j, i, offset), zoneId, offset);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        String string;
        Objects.a(dateTimeFormatter, "formatter");
        j$.desugar.sun.nio.fs.o oVar = new j$.desugar.sun.nio.fs.o((byte) 1);
        Objects.a(charSequence, "text");
        try {
            return (ZonedDateTime) dateTimeFormatter.b(charSequence).w(oVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException(j$.desugar.sun.nio.fs.i.b("Text '", string, "' could not be parsed: ", e2.getMessage()), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static ZonedDateTime r(j$.time.temporal.k kVar) {
        if (kVar instanceof ZonedDateTime) {
            return (ZonedDateTime) kVar;
        }
        try {
            ZoneId zoneIdR = ZoneId.r(kVar);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            kVar = kVar.d(aVar) ? p(kVar.C(aVar), kVar.h(j$.time.temporal.a.NANO_OF_SECOND), zoneIdR) : s(LocalDateTime.B(LocalDate.A(kVar), LocalTime.A(kVar)), zoneIdR, null);
            return kVar;
        } catch (b e) {
            throw new b(j$.desugar.sun.nio.fs.i.b("Unable to obtain ZonedDateTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()), e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZonedDateTime s(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listF = rules.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            j$.time.zone.b bVarE = rules.e(localDateTime);
            localDateTime = localDateTime.J(Duration.ofSeconds(bVarE.d.getTotalSeconds() - bVarE.c.getTotalSeconds()).getSeconds());
            zoneOffset = bVarE.d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listF.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.h(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return s(localDateTime.b(j, temporalUnit), zoneId, zoneOffset);
        }
        LocalDateTime localDateTimeB = localDateTime.b(j, temporalUnit);
        Objects.a(localDateTimeB, "localDateTime");
        Objects.a(zoneOffset, "offset");
        Objects.a(zoneId, "zone");
        return zoneId.getRules().f(localDateTimeB).contains(zoneOffset) ? new ZonedDateTime(localDateTimeB, zoneId, zoneOffset) : p(localDateTimeB.toEpochSecond(zoneOffset), localDateTimeB.b.d, zoneId);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = w.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.C(nVar) : this.b.getTotalSeconds();
        }
        return j$.desugar.sun.nio.fs.g.t(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = w.a[aVar.ordinal()];
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (i == 1) {
            return p(j, localDateTime.b.d, zoneId);
        }
        ZoneOffset zoneOffset = this.b;
        if (i != 2) {
            return s(localDateTime.a(j, nVar), zoneId, zoneOffset);
        }
        ZoneOffset zoneOffsetL = ZoneOffset.L(aVar.b.a(j, aVar));
        return (zoneOffsetL.equals(zoneOffset) || !zoneId.getRules().f(localDateTime).contains(zoneOffsetL)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetL);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.desugar.sun.nio.fs.g.f(this, (j$.time.chrono.j) obj);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return (nVar instanceof j$.time.temporal.a) || (nVar != null && nVar.h(this));
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeR = r(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, zonedDateTimeR);
        }
        LocalDateTime localDateTime = zonedDateTimeR.a;
        ZoneId zoneId = this.c;
        Objects.a(zoneId, "zone");
        if (!zonedDateTimeR.c.equals(zoneId)) {
            zonedDateTimeR = p(localDateTime.toEpochSecond(zonedDateTimeR.b), localDateTime.b.d, zoneId);
        }
        LocalDateTime localDateTime2 = zonedDateTimeR.a;
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalDateTime localDateTime3 = this.a;
        return (iCompareTo < 0 || chronoUnit == ChronoUnit.FOREVER) ? new OffsetDateTime(localDateTime3, this.b).e(new OffsetDateTime(localDateTime2, zonedDateTimeR.b), temporalUnit) : localDateTime3.e(localDateTime2, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j g(ZoneId zoneId) {
        if (this.c.equals(zoneId)) {
            return this;
        }
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return p(localDateTime.toEpochSecond(zoneOffset), localDateTime.b.d, zoneId);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.a getChronology() {
        this.a.a.getClass();
        return j$.time.chrono.s.c;
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.desugar.sun.nio.fs.g.j(this, nVar);
        }
        int i = w.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.h(nVar) : this.b.getTotalSeconds();
        }
        g.e("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        boolean zC = j$.desugar.sun.nio.fs.i.c(localDate);
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (zC) {
            return s(LocalDateTime.B(localDate, localDateTime.b), zoneId, zoneOffset);
        }
        localDate.getClass();
        return (ZonedDateTime) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).b : this.a.l(nVar);
        }
        return nVar.k(this);
    }

    @Override // j$.time.chrono.j
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.t(this);
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(j$.desugar.sun.nio.fs.g.t(this), this.a.b.d);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public final LocalTime toLocalTime() {
        return this.a.b;
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.c;
        ZoneId zoneId = this.c;
        return zoneOffset != zoneId ? j$.desugar.sun.nio.fs.i.b(str, "[", zoneId.toString(), "]") : str;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j v(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return !this.c.equals(zoneId) ? s(this.a, zoneId, this.b) : this;
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        return oVar == j$.time.temporal.o.f ? this.a.a : j$.desugar.sun.nio.fs.g.q(this, oVar);
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

    @Override // j$.time.chrono.j
    public LocalDateTime toLocalDateTime() {
        return this.a;
    }
}
