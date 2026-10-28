package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class i0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    public i0(LocalDate localDate) {
        Objects.a(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 8, this);
    }

    @Override // j$.time.chrono.d
    public final b A(long j) {
        return K(this.a.P(j));
    }

    @Override // j$.time.chrono.d
    public final b B(long j) {
        return K(this.a.Q(j));
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        int I;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = h0.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 4) {
            LocalDate localDate = this.a;
            if (i == 5) {
                return ((((long) I()) * 12) + ((long) localDate.b)) - 1;
            }
            if (i != 6) {
                if (i != 7) {
                    return localDate.C(nVar);
                }
                return I() < 1 ? 0 : 1;
            }
            I = I();
        } else {
            I = I();
            if (I < 1) {
                I = 1 - I;
            }
        }
        return I;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e D(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b F(TemporalAmount temporalAmount) {
        return (i0) super.F(temporalAmount);
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        return K(this.a.S(j));
    }

    public final int I() {
        return this.a.a + 543;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final i0 a(long j, j$.time.temporal.n nVar) {
        int iA;
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (i0) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (C(aVar) == j) {
            return this;
        }
        int[] iArr = h0.a;
        int i2 = iArr[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i2 == 4) {
            iA = g0.c.C(aVar).a(j, aVar);
            i = iArr[aVar.ordinal()];
            if (i != 4) {
                if (I() < 1) {
                    iA = 1 - iA;
                }
                return K(localDate.W(iA - 543));
            }
            if (i != 6) {
                return K(localDate.W(iA - 543));
            }
            if (i == 7) {
                return K(localDate.W((-542) - I()));
            }
        } else {
            if (i2 == 5) {
                g0.c.C(aVar).b(j, aVar);
                return K(localDate.Q(j - (((((long) I()) * 12) + ((long) localDate.b)) - 1)));
            }
            if (i2 == 6 || i2 == 7) {
                iA = g0.c.C(aVar).a(j, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    if (I() < 1) {
                        iA = 1 - iA;
                    }
                    return K(localDate.W(iA - 543));
                }
                if (i != 6) {
                    return K(localDate.W(iA - 543));
                }
                if (i == 7) {
                    return K(localDate.W((-542) - I()));
                }
            }
        }
        return K(localDate.a(j, nVar));
    }

    public final i0 K(LocalDate localDate) {
        return !localDate.equals(this.a) ? new i0(localDate) : this;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j, TemporalUnit temporalUnit) {
        return (i0) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return this.a.equals(((i0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return g0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final m getEra() {
        return I() >= 1 ? j0.BE : j0.BEFORE_BE;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        g0.c.getClass();
        return 146118545 ^ this.a.hashCode();
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        return (i0) super.x(localDate);
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
        int i = h0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(nVar);
        }
        if (i != 4) {
            return g0.c.C(aVar);
        }
        j$.time.temporal.q qVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.q.f(1L, I() <= 0 ? (-(qVar.a + 543)) + 1 : qVar.d + 543);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* JADX INFO: renamed from: t */
    public final b y(long j, TemporalUnit temporalUnit) {
        return (i0) super.y(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b x(j$.time.temporal.l lVar) {
        return (i0) super.x(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        return (i0) super.y(j, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (i0) super.b(j, temporalUnit);
    }
}
