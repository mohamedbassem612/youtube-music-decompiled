package j$.time;

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
public final class LocalDate implements Temporal, j$.time.temporal.l, j$.time.chrono.b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate A(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        LocalDate localDate = (LocalDate) kVar.w(j$.time.temporal.o.f);
        if (localDate != null) {
            return localDate;
        }
        g.g(j$.desugar.sun.nio.fs.i.b("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()));
        return null;
    }

    public static LocalDate M(a aVar) {
        Instant instant = aVar.instant();
        ZoneId zoneId = aVar.b;
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return ofEpochDay(j$.desugar.sun.nio.fs.g.A(instant.getEpochSecond() + ((long) zoneId.getRules().getOffset(instant).getTotalSeconds()), 86400L));
    }

    public static LocalDate N(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.s(j);
        j$.time.temporal.a.DAY_OF_YEAR.s(i2);
        j$.time.chrono.s.c.getClass();
        boolean zIsLeapYear = j$.time.chrono.s.isLeapYear(j);
        if (i2 == 366 && !zIsLeapYear) {
            g.c("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        j jVarB = j.B(((i2 - 1) / 31) + 1);
        if (i2 > (jVarB.s(zIsLeapYear) + jVarB.r(zIsLeapYear)) - 1) {
            jVarB = j.a[(jVarB.ordinal() + 13) % 12];
        }
        return new LocalDate(i, jVarB.getValue(), (i2 - jVarB.r(zIsLeapYear)) + 1);
    }

    public static LocalDate T(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.s.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.s.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.s(i);
        j$.time.temporal.a.MONTH_OF_YEAR.s(i2);
        j$.time.temporal.a.DAY_OF_MONTH.s(i3);
        return s(i, i2, i3);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.s(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalDate s(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.s.c.getClass();
                if (j$.time.chrono.s.isLeapYear(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    g.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new b("Invalid date '" + j.B(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int B(j$.time.temporal.n nVar) {
        int i;
        int I;
        int i2 = f.a[((j$.time.temporal.a) nVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return I();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                if (i3 < 1) {
                    return 1 - i3;
                }
                return i3;
            case 5:
                return H().getValue();
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                I = (I() - 1) % 7;
                return I + 1;
            case 8:
                g.e("Invalid field 'EpochDay' for get() method, use getLong() instead");
                return 0;
            case 9:
                I = (I() - 1) / 7;
                return I + 1;
            case 10:
                return this.b;
            case 11:
                g.e("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
                return 0;
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0;
        }
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (nVar == j$.time.temporal.a.EPOCH_DAY) {
            return toEpochDay();
        }
        return nVar == j$.time.temporal.a.PROLEPTIC_MONTH ? J() : B(nVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e D(LocalTime localTime) {
        return LocalDateTime.B(this, localTime);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b F(TemporalAmount temporalAmount) {
        p pVar = (p) temporalAmount;
        return Q((((long) pVar.a) * 12) + ((long) pVar.b)).P(pVar.c);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? r((LocalDate) bVar) : j$.desugar.sun.nio.fs.g.d(this, bVar);
    }

    public final c H() {
        return c.r(((int) j$.desugar.sun.nio.fs.g.I(toEpochDay() + 3, 7L)) + 1);
    }

    public final int I() {
        return (j.B(this.b).r(isLeapYear()) + this.c) - 1;
    }

    public final long J() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    public final boolean K(j$.time.chrono.b bVar) {
        return (bVar instanceof LocalDate ? r((LocalDate) bVar) : (toEpochDay() > bVar.toEpochDay() ? 1 : (toEpochDay() == bVar.toEpochDay() ? 0 : -1))) >>> 31;
    }

    public final long L(LocalDate localDate) {
        return (((localDate.J() << 5) + ((long) localDate.c)) - ((J() << 5) + ((long) this.c))) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.h(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return P(j);
            case 2:
                return R(j);
            case 3:
                return Q(j);
            case 4:
                return S(j);
            case 5:
                return S(j$.desugar.sun.nio.fs.g.K(j, 10L));
            case 6:
                return S(j$.desugar.sun.nio.fs.g.K(j, 100L));
            case 7:
                return S(j$.desugar.sun.nio.fs.g.K(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.J(C(aVar), j), aVar);
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final LocalDate P(long j) {
        LocalDate localDate;
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j2 <= jLengthOfMonth) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    localDate = new LocalDate(i, s + 1, (int) (j2 - jLengthOfMonth));
                } else {
                    int i2 = i + 1;
                    j$.time.temporal.a.YEAR.s(i2);
                    localDate = new LocalDate(i2, 1, (int) (j2 - jLengthOfMonth));
                }
                return localDate;
            }
        }
        return ofEpochDay(j$.desugar.sun.nio.fs.g.J(toEpochDay(), j));
    }

    public final LocalDate Q(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return T(aVar.b.a(j$.desugar.sun.nio.fs.g.A(j2, 12L), aVar), ((int) j$.desugar.sun.nio.fs.g.I(j2, 12L)) + 1, this.c);
    }

    public final LocalDate R(long j) {
        return P(j$.desugar.sun.nio.fs.g.K(j, 7L));
    }

    public final LocalDate S(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return T(aVar.b.a(((long) this.a) + j, aVar), this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDate) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.s(j);
        int i = f.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                return s != i3 ? of(i2, s2, i3) : this;
            case 2:
                int i4 = (int) j;
                return I() != i4 ? N(i2, i4) : this;
            case 3:
                return R(j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return W((int) j);
            case 5:
                return P(j - ((long) H().getValue()));
            case 6:
                return P(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return P(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return R(j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i5 = (int) j;
                if (s2 == i5) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.s(i5);
                return T(i2, i5, s);
            case 11:
                return Q(j - J());
            case 12:
                return W((int) j);
            case 13:
                return C(j$.time.temporal.a.ERA) != j ? W(1 - i2) : this;
            default:
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return null;
        }
    }

    @Override // j$.time.chrono.b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate x(j$.time.temporal.l lVar) {
        return lVar instanceof LocalDate ? (LocalDate) lVar : (LocalDate) lVar.p(this);
    }

    public final LocalDate W(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.s(i);
        return T(i, this.b, this.c);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.m(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateA = A(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateA);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateA.toEpochDay() - toEpochDay();
            case 2:
                return (localDateA.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return L(localDateA);
            case 4:
                return L(localDateA) / 12;
            case 5:
                return L(localDateA) / 120;
            case 6:
                return L(localDateA) / 1200;
            case 7:
                return L(localDateA) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return localDateA.C(aVar) - C(aVar);
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LocalDate) && r((LocalDate) obj) == 0;
        }
        return true;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.a getChronology() {
        return j$.time.chrono.s.c;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m getEra() {
        return this.a >= 1 ? j$.time.chrono.t.CE : j$.time.chrono.t.BCE;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? B(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    public final boolean isLeapYear() {
        j$.time.chrono.s sVar = j$.time.chrono.s.c;
        long j = this.a;
        sVar.getClass();
        return j$.time.chrono.s.isLeapYear(j);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.k(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (!aVar.isDateBased()) {
            g.e("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.q.f(1L, isLeapYear() ? 366 : 365);
        }
        if (i == 3) {
            return j$.time.temporal.q.f(1L, (j.B(this.b) != j.FEBRUARY || isLeapYear()) ? 5L : 4L);
        }
        if (i != 4) {
            return aVar.b;
        }
        return j$.time.temporal.q.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
    }

    public final int lengthOfMonth() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return isLeapYear() ? 29 : 28;
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    public final int r(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b t(long j, TemporalUnit temporalUnit) {
        return b(-1L, (ChronoUnit) temporalUnit);
    }

    @Override // j$.time.chrono.b
    public long toEpochDay() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !isLeapYear() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        return oVar != j$.time.temporal.o.f ? j$.desugar.sun.nio.fs.g.o(this, oVar) : this;
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
