package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class x extends d {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient y b;
    public final transient int c;

    public x(LocalDate localDate) {
        if (localDate.K(d)) {
            j$.time.g.g("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        y yVarC = y.c(localDate);
        this.b = yVarC;
        this.c = (localDate.a - yVarC.b.a) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 4, this);
    }

    @Override // j$.time.chrono.d
    public final b A(long j) {
        return L(this.a.P(j));
    }

    @Override // j$.time.chrono.d
    public final b B(long j) {
        return L(this.a.Q(j));
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        int I;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = w.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        y yVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                I = i2 != 1 ? localDate.I() : (localDate.I() - yVar.b.I()) + 1;
                break;
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0L;
            case 8:
                I = yVar.a;
                break;
            default:
                return localDate.C(nVar);
        }
        return I;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e D(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b F(TemporalAmount temporalAmount) {
        return (x) super.F(temporalAmount);
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        return L(this.a.S(j));
    }

    public final x I(long j, ChronoUnit chronoUnit) {
        return (x) super.b(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final x a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (x) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (C(aVar) == j) {
            return this;
        }
        int[] iArr = w.a;
        int i = iArr[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 3 || i == 8 || i == 9) {
            v vVar = v.c;
            int iA = vVar.C(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return L(localDate.W(vVar.B(this.b, iA)));
            }
            if (i2 == 8) {
                return L(localDate.W(vVar.B(y.i(iA), this.c)));
            }
            if (i2 == 9) {
                return L(localDate.W(iA));
            }
        }
        return L(localDate.a(j, nVar));
    }

    public final x K(j$.desugar.sun.nio.fs.o oVar) {
        return (x) super.x(oVar);
    }

    public final x L(LocalDate localDate) {
        return !localDate.equals(this.a) ? new x(localDate) : this;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).isDateBased();
        }
        return nVar != null && nVar.h(this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return v.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final m getEra() {
        return this.b;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        v.c.getClass();
        return (-688086063) ^ this.a.hashCode();
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        return (x) super.x(localDate);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    @Override // j$.time.chrono.d, j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        int I;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.k(this);
        }
        if (!d(nVar)) {
            j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = w.a[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 1) {
            return j$.time.temporal.q.f(1L, localDate.lengthOfMonth());
        }
        y yVar = this.b;
        if (i != 2) {
            if (i != 3) {
                return v.c.C(aVar);
            }
            int i2 = yVar.b.a;
            y yVarF = yVar.f();
            return yVarF != null ? j$.time.temporal.q.f(1L, (yVarF.b.a - i2) + 1) : j$.time.temporal.q.f(1L, 999999999 - i2);
        }
        y yVarF2 = yVar.f();
        if (yVarF2 != null) {
            LocalDate localDate2 = yVarF2.b;
            if (localDate2.a == localDate.a) {
                I = localDate2.I() - 1;
            } else if (localDate.isLeapYear()) {
                I = 366;
            } else {
                I = 365;
            }
        } else if (localDate.isLeapYear()) {
            I = 366;
        } else {
            I = 365;
        }
        if (this.c == 1) {
            I -= yVar.b.I() - 1;
        }
        return j$.time.temporal.q.f(1L, I);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* JADX INFO: renamed from: t */
    public final b y(long j, TemporalUnit temporalUnit) {
        return (x) super.y(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b x(j$.time.temporal.l lVar) {
        return (x) super.x(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        return (x) super.y(j, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }

    public x(y yVar, int i, LocalDate localDate) {
        if (!localDate.K(d)) {
            this.b = yVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        j$.time.g.g("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
