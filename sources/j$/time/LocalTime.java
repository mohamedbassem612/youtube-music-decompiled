package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class LocalTime implements Temporal, j$.time.temporal.l, Comparable<LocalTime>, Serializable {
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime g;
    public static final LocalTime[] h = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = h;
            if (i >= 24) {
                LocalTime localTime = localTimeArr[0];
                g = localTime;
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime A(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        LocalTime localTime = (LocalTime) kVar.w(j$.time.temporal.o.g);
        if (localTime != null) {
            return localTime;
        }
        g.g(j$.desugar.sun.nio.fs.i.b("Unable to obtain LocalTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()));
        return null;
    }

    public static LocalTime H(long j) {
        j$.time.temporal.a.NANO_OF_DAY.s(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return s(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime N(ObjectInput objectInput) throws IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = objectInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = objectInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = objectInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return of(i3, i4, i2, i);
    }

    public static LocalTime of(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.s(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.s(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.s(i3);
        j$.time.temporal.a.NANO_OF_SECOND.s(i4);
        return s(i, i2, i3, i4);
    }

    public static LocalTime ofSecondOfDay(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.s(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return s(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalTime s(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new LocalTime(i, i2, i3, i4);
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    public final int B(j$.time.temporal.n nVar) {
        int i = i.a[((j$.time.temporal.a) nVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                g.e("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
                return 0;
            case 3:
                return i2 / 1000;
            case 4:
                g.e("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
                return 0;
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (O() / 1000000);
            case 7:
                return this.c;
            case 8:
                return toSecondOfDay();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                break;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                break;
            case 15:
                return b2 / 12;
            default:
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0;
        }
        return b2;
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (nVar == j$.time.temporal.a.NANO_OF_DAY) {
            return O();
        }
        return nVar == j$.time.temporal.a.MICRO_OF_DAY ? O() / 1000 : B(nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.h(this, j);
        }
        switch (i.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return L(j);
            case 2:
                return L((j % 86400000000L) * 1000);
            case 3:
                return L((j % 86400000) * 1000000);
            case 4:
                return M(j);
            case 5:
                return K(j);
            case 6:
                return J(j);
            case 7:
                return J((j % 2) * 12);
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final LocalTime J(long j) {
        if (j == 0) {
            return this;
        }
        return s(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime K(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i != i2 ? s(i2 / 60, i2 % 60, this.c, this.d) : this;
    }

    public final LocalTime L(long j) {
        if (j == 0) {
            return this;
        }
        long jO = O();
        long j2 = (((j % 86400000000000L) + jO) + 86400000000000L) % 86400000000000L;
        return jO != j2 ? s((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000)) : this;
    }

    public final LocalTime M(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i != i2 ? s(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d) : this;
    }

    public final long O() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalTime) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.s(j);
        int i = i.a[aVar.ordinal()];
        int i2 = this.d;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return Q((int) j);
            case 2:
                return H(j);
            case 3:
                return Q(((int) j) * 1000);
            case 4:
                return H(j * 1000);
            case 5:
                return Q(((int) j) * 1000000);
            case 6:
                return H(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b == i3) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.s(i3);
                return s(b3, b2, i3, i2);
            case 8:
                return M(j - ((long) toSecondOfDay()));
            case 9:
                int i4 = (int) j;
                if (b2 == i4) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.s(i4);
                return s(b3, i4, b, i2);
            case 10:
                return K(j - ((long) ((b3 * 60) + b2)));
            case 11:
                return J(j - ((long) (b3 % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return J(j - ((long) (b3 % 12)));
            case 13:
                int i5 = (int) j;
                if (b3 == i5) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.s(i5);
                return s(i5, b2, b, i2);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 == i6) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.s(i6);
                return s(i6, b2, b, i2);
            case 15:
                return J((j - ((long) (b3 / 12))) * 12);
            default:
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return null;
        }
    }

    public final LocalTime Q(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.s(i);
        return s(this.a, this.b, this.c, i);
    }

    public final void R(DataOutput dataOutput) throws IOException {
        byte b = this.a;
        byte b2 = this.c;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b2);
            dataOutput.writeInt(i);
            return;
        }
        if (b2 != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b2);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b);
        } else {
            dataOutput.writeByte(b);
            dataOutput.writeByte(~b3);
        }
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).w();
        }
        return nVar != null && nVar.h(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeA = A(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localTimeA);
        }
        long jO = localTimeA.O() - O();
        switch (i.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jO;
            case 2:
                return jO / 1000;
            case 3:
                return jO / 1000000;
            case 4:
                return jO / 1000000000;
            case 5:
                return jO / 60000000000L;
            case 6:
                return jO / 3600000000000L;
            case 7:
                return jO / 43200000000000L;
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? B(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    public final int hashCode() {
        long jO = O();
        return (int) (jO ^ (jO >>> 32));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(O(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.b, localTime.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(this.c, localTime.c);
        return iCompare3 == 0 ? Integer.compare(this.d, localTime.d) : iCompare3;
    }

    public int toSecondOfDay() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public LocalTime truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() <= 86400) {
            long nanos = duration.toNanos();
            if (86400000000000L % nanos == 0) {
                return H((O() / nanos) * nanos);
            }
            g.e("Unit must divide into a standard day without remainder");
        } else {
            g.e("Unit is too large to be used for truncation");
        }
        return null;
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        if (oVar != j$.time.temporal.o.b && oVar != j$.time.temporal.o.a && oVar != j$.time.temporal.o.e && oVar != j$.time.temporal.o.d) {
            if (oVar == j$.time.temporal.o.g) {
                return this;
            }
            if (oVar != j$.time.temporal.o.f) {
                return oVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : oVar.c(this);
            }
        }
        return null;
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
