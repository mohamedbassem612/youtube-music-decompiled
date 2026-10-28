package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class q extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient o a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public q(o oVar, long j) {
        int i = (int) j;
        oVar.P();
        if (i < oVar.e || i >= oVar.f) {
            j$.time.g.g("Hijrah date out of range");
            throw null;
        }
        int iBinarySearch = Arrays.binarySearch(oVar.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        short s = oVar.g;
        int[] iArr = {(iBinarySearch + s) / 12, ((s + iBinarySearch) % 12) + 1, (i - oVar.d[iBinarySearch]) + 1};
        this.a = oVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 6, this);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        int I;
        int i;
        int I2;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i2 = p.a[((j$.time.temporal.a) nVar).ordinal()];
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return i4;
            case 2:
                I = I();
                return I;
            case 3:
                i = (i4 - 1) / 7;
                i4 = i + 1;
                return i4;
            case 4:
                I2 = (int) j$.desugar.sun.nio.fs.g.I(toEpochDay() + 3, 7L);
                I = I2 + 1;
                return I;
            case 5:
                i = (i4 - 1) % 7;
                i4 = i + 1;
                return i4;
            case 6:
                I2 = (I() - 1) % 7;
                I = I2 + 1;
                return I;
            case 7:
                return toEpochDay();
            case 8:
                I2 = (I() - 1) / 7;
                I = I2 + 1;
                return I;
            case 9:
                return i3;
            case 10:
                return ((((long) i5) * 12) + ((long) i3)) - 1;
            case 11:
            case 12:
                return i5;
            case 13:
                return i5 <= 1 ? 0 : 1;
            default:
                j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e D(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b F(TemporalAmount temporalAmount) {
        return (q) super.F(temporalAmount);
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return L(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    public final int I() {
        return this.a.U(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final q A(long j) {
        return new q(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final q B(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        long jA = j$.desugar.sun.nio.fs.g.A(j2, 12L);
        o oVar = this.a;
        short s = oVar.g;
        if (jA >= s / 12 && jA <= (((oVar.d.length - 1) + s) / 12) - 1) {
            return L((int) jA, ((int) j$.desugar.sun.nio.fs.g.I(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jA);
    }

    public final q L(int i, int i2, int i3) {
        o oVar = this.a;
        int iS = oVar.S(i, i2);
        if (i3 > iS) {
            i3 = iS;
        }
        return new q(oVar, i, i2, i3);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final q a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (q) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        o oVar = this.a;
        oVar.C(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = p.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return L(i5, i4, i);
            case 2:
                return A(Math.min(i, oVar.U(i5, 12)) - I());
            case 3:
                return A((j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return A(j - ((long) (((int) j$.desugar.sun.nio.fs.g.I(toEpochDay() + 3, 7L)) + 1)));
            case 5:
                return A(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return A(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(oVar, j);
            case 8:
                return A((j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return L(i5, i, i3);
            case 10:
                return B(j - (((((long) i5) * 12) + ((long) i4)) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return L(i, i4, i3);
            case 12:
                return L(i, i4, i3);
            case 13:
                return L(1 - i5, i4, i3);
            default:
                j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return null;
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.a.equals(qVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final m getEra() {
        return r.AH;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (2100100019 ^ (i & (-2048))) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        return (q) super.x(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.k(this);
        }
        if (!j$.desugar.sun.nio.fs.g.m(this, nVar)) {
            j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = p.a[aVar.ordinal()];
        int i2 = this.b;
        o oVar = this.a;
        if (i == 1) {
            return j$.time.temporal.q.f(1L, oVar.S(i2, this.c));
        }
        if (i != 2) {
            return i != 3 ? oVar.C(aVar) : j$.time.temporal.q.f(1L, 5L);
        }
        return j$.time.temporal.q.f(1L, oVar.U(i2, 12));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* JADX INFO: renamed from: t */
    public final b y(long j, TemporalUnit temporalUnit) {
        return (q) super.y(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.R(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b x(j$.time.temporal.l lVar) {
        return (q) super.x(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        return (q) super.y(j, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    public q(o oVar, int i, int i2, int i3) {
        oVar.R(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
