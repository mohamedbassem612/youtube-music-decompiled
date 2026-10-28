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
public final class o implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new o(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new o(localTime2, zoneOffset2);
    }

    public o(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.a(localTime, "time");
        this.a = localTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 9, this);
    }

    public final o A(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new o(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return nVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.getTotalSeconds() : this.a.C(nVar);
        }
        return nVar.l(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (o) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        if (nVar != aVar) {
            return A(localTime.a(j, nVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) nVar;
        return A(localTime, ZoneOffset.L(aVar2.b.a(j, aVar2)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        ZoneOffset zoneOffset = oVar.b;
        LocalTime localTime = oVar.a;
        boolean zEquals = this.b.equals(zoneOffset);
        LocalTime localTime2 = this.a;
        if (zEquals) {
            return localTime2.compareTo(localTime);
        }
        int iCompare = Long.compare(s(), oVar.s());
        return iCompare == 0 ? localTime2.compareTo(localTime) : iCompare;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) nVar).w() || nVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return true;
            }
        } else if (nVar != null && nVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        o oVar;
        if (temporal instanceof o) {
            oVar = (o) temporal;
        } else {
            try {
                oVar = new o(LocalTime.A(temporal), ZoneOffset.I(temporal));
            } catch (b e) {
                throw new b(j$.desugar.sun.nio.fs.i.b("Unable to obtain OffsetTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, oVar);
        }
        long jS = oVar.s() - s();
        switch (n.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jS;
            case 2:
                return jS / 1000;
            case 3:
                return jS / 1000000;
            case 4:
                return jS / 1000000000;
            case 5:
                return jS / 60000000000L;
            case 6:
                return jS / 3600000000000L;
            case 7:
                return jS / 43200000000000L;
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.a) && this.b.equals(oVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        localDate.getClass();
        return (o) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.k(this);
        }
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) nVar).b;
        }
        LocalTime localTime = this.a;
        localTime.getClass();
        return j$.time.temporal.o.d(localTime, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(this.a.O(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final o b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? A(this.a.b(j, temporalUnit), this.b) : (o) temporalUnit.h(this, j);
    }

    public final long s() {
        return this.a.O() - (((long) this.b.getTotalSeconds()) * 1000000000);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        if (oVar == j$.time.temporal.o.d || oVar == j$.time.temporal.o.e) {
            return this.b;
        }
        if (((oVar == j$.time.temporal.o.a) || (oVar == j$.time.temporal.o.b)) || oVar == j$.time.temporal.o.f) {
            return null;
        }
        if (oVar == j$.time.temporal.o.g) {
            return this.a;
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
