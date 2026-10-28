package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.l, j$.time.chrono.e, Serializable {
    public static final LocalDateTime c = B(LocalDate.d, LocalTime.e);
    public static final LocalDateTime d = B(LocalDate.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime B(LocalDate localDate, LocalTime localTime) {
        Objects.a(localDate, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime H(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.s(j2);
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        return new LocalDateTime(LocalDate.ofEpochDay(j$.desugar.sun.nio.fs.g.A(totalSeconds, 86400L)), LocalTime.H((((long) ((int) j$.desugar.sun.nio.fs.g.I(totalSeconds, 86400L))) * 1000000000) + j2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalDateTime s(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDateTime) {
            return (LocalDateTime) kVar;
        }
        if (kVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) kVar).toLocalDateTime();
        }
        if (kVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) kVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.A(kVar), LocalTime.A(kVar));
        } catch (b e) {
            throw new b(j$.desugar.sun.nio.fs.i.b("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()), e);
        }
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    public final boolean A(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return r((LocalDateTime) eVar) >>> 31;
        }
        long epochDay = this.a.toEpochDay();
        long epochDay2 = eVar.toLocalDate().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && this.b.O() < eVar.toLocalTime().O());
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).w() ? this.b.C(nVar) : this.a.C(nVar);
        }
        return nVar.l(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        return eVar instanceof LocalDateTime ? r((LocalDateTime) eVar) : j$.desugar.sun.nio.fs.g.e(this, eVar);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.h(this, j);
        }
        int i = h.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 1:
                return K(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeN = N(localDate.P(j / 86400000000L), localTime);
                return localDateTimeN.K(localDateTimeN.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeN2 = N(localDate.P(j / 86400000), localTime);
                return localDateTimeN2.K(localDateTimeN2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return J(j);
            case 5:
                return K(this.a, 0L, j, 0L, 0L);
            case 6:
                return K(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeN3 = N(localDate.P(j / 256), localTime);
                return localDateTimeN3.K(localDateTimeN3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return N(localDate.b(j, temporalUnit), localTime);
        }
    }

    public final LocalDateTime J(long j) {
        return K(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime K(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeH = this.b;
        if (j5 == 0) {
            return N(localDate, localTimeH);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jO = localTimeH.O();
        long j10 = j9 + jO;
        long jA = j$.desugar.sun.nio.fs.g.A(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jI = j$.desugar.sun.nio.fs.g.I(j10, 86400000000000L);
        if (jI != jO) {
            localTimeH = LocalTime.H(jI);
        }
        return N(localDate.P(jA), localTimeH);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) nVar.r(this, j);
        }
        boolean zW = ((j$.time.temporal.a) nVar).w();
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        return zW ? N(localDate, localTime.a(j, nVar)) : N(localDate.a(j, nVar), localTime);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime x(LocalDate localDate) {
        if (j$.desugar.sun.nio.fs.i.c(localDate)) {
            return N(localDate, this.b);
        }
        localDate.getClass();
        return (LocalDateTime) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    public final LocalDateTime N(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
            if (aVar.isDateBased() || aVar.w()) {
                return true;
            }
        } else if (nVar != null && nVar.h(this)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        j$.time.chrono.b bVarP;
        long jK;
        long j;
        LocalDateTime localDateTimeS = s(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeS);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        if (iCompareTo >= 0) {
            LocalDate localDate2 = localDateTimeS.a;
            LocalTime localTime2 = localDateTimeS.b;
            boolean z = false;
            if (localDate == null ? localDate2.toEpochDay() > localDate.toEpochDay() : localDate2.r(localDate) > 0) {
                z = true;
            }
            if (!z || localTime2.compareTo(localTime) >= 0) {
                boolean zK = localDate2.K(localDate);
                bVarP = localDate2;
                if (zK && localTime2.compareTo(localTime) > 0) {
                    bVarP = localDate2;
                    bVarP = localDate2.P(1L);
                }
            } else {
                bVarP = localDate2.P(-1L);
            }
            bVarP = localDate2;
            return localDate.e(bVarP, temporalUnit);
        }
        LocalDate localDate3 = localDateTimeS.a;
        LocalTime localTime3 = localDateTimeS.b;
        localDate.getClass();
        long epochDay = localDate3.toEpochDay() - localDate.toEpochDay();
        if (epochDay == 0) {
            return localTime.e(localTime3, temporalUnit);
        }
        long jO = localTime3.O() - localTime.O();
        if (epochDay > 0) {
            jK = epochDay - 1;
            j = jO + 86400000000000L;
        } else {
            jK = epochDay + 1;
            j = jO - 86400000000000L;
        }
        switch (h.a[chronoUnit.ordinal()]) {
            case 1:
                jK = j$.desugar.sun.nio.fs.g.K(jK, 86400000000000L);
                break;
            case 2:
                jK = j$.desugar.sun.nio.fs.g.K(jK, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jK = j$.desugar.sun.nio.fs.g.K(jK, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jK = j$.desugar.sun.nio.fs.g.K(jK, 86400L);
                j /= 1000000000;
                break;
            case 5:
                jK = j$.desugar.sun.nio.fs.g.K(jK, 1440L);
                j /= 60000000000L;
                break;
            case 6:
                jK = j$.desugar.sun.nio.fs.g.K(jK, 24L);
                j /= 3600000000000L;
                break;
            case 7:
                jK = j$.desugar.sun.nio.fs.g.K(jK, 2L);
                j /= 43200000000000L;
                break;
        }
        return j$.desugar.sun.nio.fs.g.J(jK, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.a getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).w() ? this.b.h(nVar) : this.a.h(nVar);
        }
        return j$.time.temporal.o.a(this, nVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.k(this);
        }
        if (!((j$.time.temporal.a) nVar).w()) {
            return this.a.l(nVar);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.o.d(localTime, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(toLocalDate().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().O(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int r(LocalDateTime localDateTime) {
        int iR = this.a.r(localDateTime.a);
        return iR == 0 ? this.b.compareTo(localDateTime.b) : iR;
    }

    public /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.desugar.sun.nio.fs.g.s(this, zoneOffset);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.i.a(this.a.toString(), "T", this.b.toString());
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        return oVar == j$.time.temporal.o.f ? this.a : j$.desugar.sun.nio.fs.g.p(this, oVar);
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

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j z(ZoneId zoneId) {
        return ZonedDateTime.s(this, zoneId, null);
    }
}
