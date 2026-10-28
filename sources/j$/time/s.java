package j$.time;

import j$.time.format.x;
import j$.time.format.y;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class s implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        j$.time.format.q qVar = new j$.time.format.q();
        qVar.h(j$.time.temporal.a.YEAR, 4, 10, y.EXCEEDS_PAD);
        qVar.l(Locale.getDefault(), x.SMART, null);
    }

    public s(int i) {
        this.a = i;
    }

    public static s r(int i) {
        j$.time.temporal.a.YEAR.s(i);
        return new s(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 11, this);
    }

    public final s A(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return r(aVar.b.a(((long) this.a) + j, aVar));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final s a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (s) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.s(j);
        int i = r.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return r((int) j);
        }
        if (i == 2) {
            return r((int) j);
        }
        if (i == 3) {
            return C(j$.time.temporal.a.ERA) != j ? r(1 - i2) : this;
        }
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = r.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return i2 < 1 ? 0 : 1;
                }
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0L;
            }
        } else if (i2 < 1) {
            i2 = 1 - i2;
        }
        return i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((s) obj).a;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (nVar == j$.time.temporal.a.YEAR || nVar == j$.time.temporal.a.YEAR_OF_ERA || nVar == j$.time.temporal.a.ERA) {
                return true;
            }
        } else if (nVar != null && nVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        s sVarR;
        if (temporal instanceof s) {
            sVarR = (s) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.s.c.equals(j$.desugar.sun.nio.fs.g.x(temporal))) {
                    temporal = LocalDate.A(temporal);
                }
                sVarR = r(temporal.h(j$.time.temporal.a.YEAR));
            } catch (b e) {
                throw new b(j$.desugar.sun.nio.fs.i.b("Unable to obtain Year from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, sVarR);
        }
        long j = ((long) sVarR.a) - ((long) this.a);
        int i = r.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return sVarR.C(aVar) - C(aVar);
        }
        g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            if (this.a == ((s) obj).a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        return l(nVar).a(C(nVar), nVar);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        localDate.getClass();
        return (s) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.q.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        if (j$.desugar.sun.nio.fs.g.x(temporal).equals(j$.time.chrono.s.c)) {
            return temporal.a(this.a, j$.time.temporal.a.YEAR);
        }
        g.g("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final s b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (s) temporalUnit.h(this, j);
        }
        int i = r.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return A(j);
        }
        if (i == 2) {
            return A(j$.desugar.sun.nio.fs.g.K(j, 10L));
        }
        if (i == 3) {
            return A(j$.desugar.sun.nio.fs.g.K(j, 100L));
        }
        if (i == 4) {
            return A(j$.desugar.sun.nio.fs.g.K(j, 1000L));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return a(j$.desugar.sun.nio.fs.g.J(C(aVar), j), aVar);
        }
        g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        return null;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        if (oVar == j$.time.temporal.o.b) {
            return j$.time.chrono.s.c;
        }
        return oVar == j$.time.temporal.o.c ? ChronoUnit.YEARS : j$.time.temporal.o.c(this, oVar);
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
