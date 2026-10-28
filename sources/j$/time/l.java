package j$.time;

import j$.time.format.x;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class l implements j$.time.temporal.k, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        j$.time.format.q qVar = new j$.time.format.q();
        qVar.d("--");
        qVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        qVar.c('-');
        qVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        qVar.l(Locale.getDefault(), x.SMART, null);
    }

    public l(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 13, this);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i2 = k.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0L;
            }
            i = this.a;
        }
        return i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        int i = this.a - lVar.a;
        return i == 0 ? this.b - lVar.b : i;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (nVar == j$.time.temporal.a.MONTH_OF_YEAR || nVar == j$.time.temporal.a.DAY_OF_MONTH) {
                return true;
            }
        } else if (nVar != null && nVar.h(this)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a == lVar.a && this.b == lVar.b) {
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
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        int i;
        if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return nVar.range();
        }
        if (nVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.o.d(this, nVar);
        }
        int i2 = this.a;
        int iOrdinal = j.B(i2).ordinal();
        if (iOrdinal != 1) {
            i = (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        } else {
            i = 28;
        }
        return j$.time.temporal.q.g(i, j.B(i2).A());
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        if (!j$.desugar.sun.nio.fs.g.x(temporal).equals(j$.time.chrono.s.c)) {
            g.g("Adjustment only supported on ISO date-time");
            return null;
        }
        Temporal temporalA = temporal.a(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalA.a(Math.min(temporalA.l(aVar).d, this.b), aVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        return oVar == j$.time.temporal.o.b ? j$.time.chrono.s.c : j$.time.temporal.o.c(this, oVar);
    }
}
