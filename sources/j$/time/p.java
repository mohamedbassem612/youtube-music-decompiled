package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class p implements TemporalAmount, Serializable {
    public static final p d = new p(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.g.C(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public p(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static p a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? d : new p(i, i2, i3);
    }

    public static void b(j$.time.temporal.k kVar) {
        j$.time.chrono.a aVar = (j$.time.chrono.a) kVar.w(j$.time.temporal.o.b);
        if (aVar == null || j$.time.chrono.s.c.equals(aVar)) {
            return;
        }
        throw new b("Chronology mismatch, expected: ISO, actual: " + aVar.getId());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a == pVar.a && this.b == pVar.b && this.c == pVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal h(Temporal temporal) {
        b(temporal);
        int i = this.b;
        int i2 = this.a;
        if (i != 0) {
            long j = (((long) i2) * 12) + ((long) i);
            if (j != 0) {
                temporal = temporal.b(j, ChronoUnit.MONTHS);
            }
        } else if (i2 != 0) {
            temporal = temporal.b(i2, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal k(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.a;
        Instant instantY = instant;
        if (i != 0) {
            long j = (((long) i2) * 12) + ((long) i);
            if (j != 0) {
                instantY = instant;
                instantY = instant.y(j, ChronoUnit.MONTHS);
            }
        } else if (i2 != 0) {
            instantY = instant.y(i2, ChronoUnit.YEARS);
        }
        instantY = instant;
        int i3 = this.c;
        if (i3 == 0) {
            return instantY;
        }
        return instantY.y(i3, ChronoUnit.DAYS);
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
