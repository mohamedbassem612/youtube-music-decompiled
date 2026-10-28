package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements b, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static b r(a aVar, Temporal temporal) {
        b bVar = (b) temporal;
        if (aVar.equals(bVar.getChronology())) {
            return bVar;
        }
        throw new ClassCastException(j$.desugar.sun.nio.fs.i.b("Chronology mismatch, expected: ", aVar.getId(), ", actual: ", bVar.getChronology().getId()));
    }

    public abstract b A(long j);

    public abstract b B(long j);

    @Override // j$.time.chrono.b
    public e D(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.b
    public b F(TemporalAmount temporalAmount) {
        return r(getChronology(), temporalAmount.h(this));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.desugar.sun.nio.fs.g.d(this, bVar);
    }

    public abstract b H(long j);

    @Override // j$.time.temporal.Temporal
    public b a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return r(getChronology(), nVar.r(this, j));
        }
        j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }

    @Override // j$.time.temporal.Temporal
    public b b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return r(getChronology(), temporalUnit.h(this, j));
            }
            j$.time.g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            return null;
        }
        switch (c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return A(j);
            case 2:
                return A(j$.desugar.sun.nio.fs.g.K(j, 7L));
            case 3:
                return B(j);
            case 4:
                return H(j);
            case 5:
                return H(j$.desugar.sun.nio.fs.g.K(j, 10L));
            case 6:
                return H(j$.desugar.sun.nio.fs.g.K(j, 100L));
            case 7:
                return H(j$.desugar.sun.nio.fs.g.K(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.J(C(aVar), j), (j$.time.temporal.n) aVar);
            default:
                j$.time.g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    @Override // j$.time.chrono.b, j$.time.temporal.k
    public /* synthetic */ boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.m(this, nVar);
    }

    @Override // j$.time.chrono.b, j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        b bVarL = getChronology().l(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, bVarL);
        }
        switch (c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return bVarL.toEpochDay() - toEpochDay();
            case 2:
                return (bVarL.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return s(bVarL);
            case 4:
                return s(bVarL) / 12;
            case 5:
                return s(bVarL) / 120;
            case 6:
                return s(bVarL) / 1200;
            case 7:
                return s(bVarL) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return bVarL.C(aVar) - C(aVar);
            default:
                j$.time.g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.b
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && j$.desugar.sun.nio.fs.g.d(this, (b) obj) == 0;
        }
        return true;
    }

    @Override // j$.time.chrono.b
    public m getEra() {
        return getChronology().w(j$.time.temporal.o.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long epochDay = toEpochDay();
        return getChronology().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.temporal.k
    public /* synthetic */ j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Temporal p(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    public final long s(b bVar) {
        if (getChronology().C(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jC = C(aVar) << 5;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((bVar.C(aVar) << 5) + ((long) bVar.h(aVar2))) - (jC + ((long) j$.time.temporal.o.a(this, aVar2)))) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public b y(long j, TemporalUnit temporalUnit) {
        return r(getChronology(), j$.time.temporal.o.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.b
    public long toEpochDay() {
        return C(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long jC = C(j$.time.temporal.a.YEAR_OF_ERA);
        long jC2 = C(j$.time.temporal.a.MONTH_OF_YEAR);
        long jC3 = C(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(jC);
        sb.append(jC2 < 10 ? "-0" : "-");
        sb.append(jC2);
        sb.append(jC3 < 10 ? "-0" : "-");
        sb.append(jC3);
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object w(j$.desugar.sun.nio.fs.o oVar) {
        return j$.desugar.sun.nio.fs.g.o(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public b x(j$.time.temporal.l lVar) {
        return r(getChronology(), lVar.p(this));
    }
}
