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
public final class u implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        j$.time.format.q qVar = new j$.time.format.q();
        qVar.h(j$.time.temporal.a.YEAR, 4, 10, y.EXCEEDS_PAD);
        qVar.c('-');
        qVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        qVar.l(Locale.getDefault(), x.SMART, null);
    }

    public u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
    }

    public final u A(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return H(aVar.b.a(j$.desugar.sun.nio.fs.g.A(j2, 12L), aVar), ((int) j$.desugar.sun.nio.fs.g.I(j2, 12L)) + 1);
    }

    public final u B(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return H(aVar.b.a(((long) this.a) + j, aVar), this.b);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i2 = t.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return r();
            }
            i = this.a;
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        return i < 1 ? 0 : 1;
                    }
                    g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                    return 0L;
                }
            } else if (i < 1) {
                i = 1 - i;
            }
        }
        return i;
    }

    public final u H(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new u(i, i2);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final u a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (u) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.s(j);
        int i = t.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.s(i3);
            return H(i2, i3);
        }
        if (i == 2) {
            return A(j - r());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.s(i5);
            return H(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.s(i6);
            return H(i6, i4);
        }
        if (i != 5) {
            g.e("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        if (C(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.s(i7);
        return H(i7, i4);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i = this.a - uVar.a;
        return i == 0 ? this.b - uVar.b : i;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (nVar == j$.time.temporal.a.YEAR || nVar == j$.time.temporal.a.MONTH_OF_YEAR || nVar == j$.time.temporal.a.PROLEPTIC_MONTH || nVar == j$.time.temporal.a.YEAR_OF_ERA || nVar == j$.time.temporal.a.ERA) {
                return true;
            }
        } else if (nVar != null && nVar.h(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        u uVar;
        if (temporal instanceof u) {
            uVar = (u) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.s.c.equals(j$.desugar.sun.nio.fs.g.x(temporal))) {
                    temporal = LocalDate.A(temporal);
                }
                j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
                int iH = temporal.h(aVar);
                j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
                int iH2 = temporal.h(aVar2);
                aVar.s(iH);
                aVar2.s(iH2);
                uVar = new u(iH, iH2);
            } catch (b e) {
                throw new b(j$.desugar.sun.nio.fs.i.b("Unable to obtain YearMonth from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, uVar);
        }
        long jR = uVar.r() - r();
        switch (t.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jR;
            case 2:
                return jR / 12;
            case 3:
                return jR / 120;
            case 4:
                return jR / 1200;
            case 5:
                return jR / 12000;
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
                return uVar.C(aVar3) - C(aVar3);
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.a == uVar.a && this.b == uVar.b) {
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
        return this.a ^ (this.b << 27);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        localDate.getClass();
        return (u) j$.desugar.sun.nio.fs.g.a(localDate, this);
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
            return temporal.a(r(), j$.time.temporal.a.PROLEPTIC_MONTH);
        }
        g.g("Adjustment only supported on ISO date-time");
        return null;
    }

    public final long r() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final u b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (u) temporalUnit.h(this, j);
        }
        switch (t.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return A(j);
            case 2:
                return B(j);
            case 3:
                return B(j$.desugar.sun.nio.fs.g.K(j, 10L));
            case 4:
                return B(j$.desugar.sun.nio.fs.g.K(j, 100L));
            case 5:
                return B(j$.desugar.sun.nio.fs.g.K(j, 1000L));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.J(C(aVar), j), aVar);
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        if (oVar == j$.time.temporal.o.b) {
            return j$.time.chrono.s.c;
        }
        return oVar == j$.time.temporal.o.c ? ChronoUnit.MONTHS : j$.time.temporal.o.c(this, oVar);
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
