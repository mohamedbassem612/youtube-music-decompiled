package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final a a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.desugar.sun.nio.fs.g.C(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public h(a aVar, int i, int i2, int i3) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final long a() {
        j$.time.temporal.q qVarC = this.a.C(j$.time.temporal.a.MONTH_OF_YEAR);
        long j = qVarC.a;
        long j2 = qVarC.d;
        if (j == qVarC.b && qVarC.c == j2 && qVarC.d()) {
            return (j2 - qVarC.a) + 1;
        }
        return -1L;
    }

    public final void b(j$.time.temporal.k kVar) {
        a aVar = (a) kVar.w(j$.time.temporal.o.b);
        if (aVar != null) {
            a aVar2 = this.a;
            if (aVar2.equals(aVar)) {
                return;
            }
            j$.time.g.g(j$.desugar.sun.nio.fs.i.b("Chronology mismatch, expected: ", aVar2.getId(), ", actual: ", aVar.getId()));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.b == hVar.b && this.c == hVar.c && this.d == hVar.d && this.a.equals(hVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal h(Temporal temporal) {
        b(temporal);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                temporal = temporal.b((((long) i) * jA) + ((long) i2), ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal = temporal.b(i, ChronoUnit.YEARS);
                }
                temporal = temporal.b(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporal = temporal.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b)) ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal k(Instant instant) {
        Instant instantY;
        b(instant);
        int i = this.b;
        int i2 = this.c;
        Temporal temporalY = instant;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                instantY = instant;
                temporalY = instant.y((((long) i) * jA) + ((long) i2), ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instantY = instant.y(i, ChronoUnit.YEARS);
                }
                temporalY = instantY.y(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporalY = instant.y(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporalY.y(i3, ChronoUnit.DAYS) : temporalY;
    }

    public final String toString() {
        a aVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return aVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new e0((byte) 9, this);
    }
}
