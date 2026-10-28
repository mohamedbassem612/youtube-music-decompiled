package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements e, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient b a;
    public final transient LocalTime b;

    public g(b bVar, LocalTime localTime) {
        Objects.a(localTime, "time");
        this.a = bVar;
        this.b = localTime;
    }

    public static g r(a aVar, Temporal temporal) {
        g gVar = (g) temporal;
        if (aVar.equals(gVar.a.getChronology())) {
            return gVar;
        }
        throw new ClassCastException(j$.desugar.sun.nio.fs.i.b("Chronology mismatch, required: ", aVar.getId(), ", actual: ", gVar.a.getChronology().getId()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 2, this);
    }

    public final g A(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeH = this.b;
        if (j5 == 0) {
            return I(bVar, localTimeH);
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
        return I(bVar.b(jA, (TemporalUnit) ChronoUnit.DAYS), localTimeH);
    }

    public final /* synthetic */ long B(ZoneOffset zoneOffset) {
        return j$.desugar.sun.nio.fs.g.s(this, zoneOffset);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).w() ? this.b.C(nVar) : this.a.C(nVar);
        }
        return nVar.l(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int compareTo(e eVar) {
        return j$.desugar.sun.nio.fs.g.e(this, eVar);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final g a(long j, j$.time.temporal.n nVar) {
        boolean z = nVar instanceof j$.time.temporal.a;
        b bVar = this.a;
        if (!z) {
            return r(bVar.getChronology(), nVar.r(this, j));
        }
        boolean zW = ((j$.time.temporal.a) nVar).w();
        LocalTime localTime = this.b;
        return zW ? I(bVar, localTime.a(j, nVar)) : I(bVar.a(j, nVar), localTime);
    }

    public final g I(Temporal temporal, LocalTime localTime) {
        b bVar = this.a;
        return (bVar == temporal && this.b == localTime) ? this : new g(d.r(bVar.getChronology(), temporal), localTime);
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

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        b bVar = this.a;
        e eVarY = bVar.getChronology().y(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, eVarY);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        int iCompareTo = chronoUnit.compareTo(chronoUnit2);
        LocalTime localTime = this.b;
        if (iCompareTo >= 0) {
            b localDate = eVarY.toLocalDate();
            if (eVarY.toLocalTime().compareTo(localTime) < 0) {
                localDate = localDate.y(1L, chronoUnit2);
            }
            return bVar.e(localDate, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jC = eVarY.C(aVar) - bVar.C(aVar);
        switch (f.a[chronoUnit.ordinal()]) {
            case 1:
                jC = j$.desugar.sun.nio.fs.g.K(jC, 86400000000000L);
                break;
            case 2:
                jC = j$.desugar.sun.nio.fs.g.K(jC, 86400000000L);
                break;
            case 3:
                jC = j$.desugar.sun.nio.fs.g.K(jC, 86400000L);
                break;
            case 4:
                jC = j$.desugar.sun.nio.fs.g.K(jC, 86400L);
                break;
            case 5:
                jC = j$.desugar.sun.nio.fs.g.K(jC, 1440L);
                break;
            case 6:
                jC = j$.desugar.sun.nio.fs.g.K(jC, 24L);
                break;
            case 7:
                jC = j$.desugar.sun.nio.fs.g.K(jC, 2L);
                break;
        }
        return j$.desugar.sun.nio.fs.g.J(jC, localTime.e(eVarY.toLocalTime(), temporalUnit));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && j$.desugar.sun.nio.fs.g.e(this, (e) obj) == 0;
        }
        return true;
    }

    @Override // j$.time.chrono.e
    public final a getChronology() {
        return this.a.getChronology();
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).w() ? this.b.h(nVar) : this.a.h(nVar);
        }
        return l(nVar).a(C(nVar), nVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        if (j$.desugar.sun.nio.fs.i.c(localDate)) {
            return I(localDate, this.b);
        }
        a chronology = this.a.getChronology();
        localDate.getClass();
        return r(chronology, (g) j$.desugar.sun.nio.fs.g.a(localDate, this));
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

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final g b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        b bVar = this.a;
        if (!z) {
            return r(bVar.getChronology(), temporalUnit.h(this, j));
        }
        int i = f.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        switch (i) {
            case 1:
                return A(bVar, 0L, 0L, 0L, j);
            case 2:
                g gVarI = I(bVar.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return gVarI.A(gVarI.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                g gVarI2 = I(bVar.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return gVarI2.A(gVarI2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return A(bVar, 0L, 0L, j, 0L);
            case 5:
                return A(bVar, 0L, j, 0L, 0L);
            case 6:
                return A(bVar, j, 0L, 0L, 0L);
            case 7:
                g gVarI3 = I(bVar.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return gVarI3.A(gVarI3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return I(bVar.b(j, temporalUnit), localTime);
        }
    }

    @Override // j$.time.chrono.e
    public final b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object w(j$.desugar.sun.nio.fs.o oVar) {
        return j$.desugar.sun.nio.fs.g.p(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        return r(this.a.getChronology(), j$.time.temporal.o.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.e
    public final j z(ZoneId zoneId) {
        return l.r(zoneId, null, this);
    }
}
