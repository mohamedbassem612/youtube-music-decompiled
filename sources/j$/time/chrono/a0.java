package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends a implements Serializable {
    public static final a0 c = new a0();
    private static final long serialVersionUID = 1039765215346859963L;

    private a0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final int B(m mVar, int i) {
        if (mVar instanceof d0) {
            return mVar != d0.ROC ? 1 - i : i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.q C(j$.time.temporal.a aVar) {
        int i = z.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.q qVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.q.f(qVar.a - 22932, qVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.q qVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.q.g(qVar2.d - 1911, (-qVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.q qVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.q.f(qVar3.a - 1911, qVar3.d - 1911);
    }

    @Override // j$.time.chrono.a
    public final b J(Map map, j$.time.format.x xVar) {
        return (c0) super.J(map, xVar);
    }

    @Override // j$.time.chrono.a
    public final j N(Instant instant, ZoneId zoneId) {
        return l.s(this, instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final j O(Temporal temporal) {
        return super.O(temporal);
    }

    @Override // j$.time.chrono.a
    public final List eras() {
        return j$.desugar.sun.nio.fs.g.C(d0.values());
    }

    @Override // j$.time.chrono.a
    public final String getCalendarType() {
        return "roc";
    }

    @Override // j$.time.chrono.a
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.a
    public final b k(int i, int i2, int i3) {
        return new c0(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.a
    public final b l(j$.time.temporal.k kVar) {
        return kVar instanceof c0 ? (c0) kVar : new c0(LocalDate.A(kVar));
    }

    @Override // j$.time.chrono.a
    public final b p(long j) {
        return new c0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.a
    public final b r() {
        int i = Clock.a;
        return new c0(LocalDate.A(LocalDate.M(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.a
    public final b s(int i, int i2) {
        return new c0(LocalDate.N(i + 1911, i2));
    }

    @Override // j$.time.chrono.a
    public final m w(int i) {
        if (i == 0) {
            return d0.BEFORE_ROC;
        }
        if (i == 1) {
            return d0.ROC;
        }
        j$.time.g.b("Invalid era: ", i);
        return null;
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }

    @Override // j$.time.chrono.a
    public final e y(Temporal temporal) {
        return super.y(temporal);
    }
}
