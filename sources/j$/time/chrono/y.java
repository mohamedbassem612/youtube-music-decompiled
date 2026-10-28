package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class y implements m, Serializable {
    public static final y d;
    public static final y[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        y yVar = new y(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = yVar;
        e = new y[]{yVar, new y(0, LocalDate.of(1912, 7, 30), "Taisho"), new y(1, LocalDate.of(1926, 12, 25), "Showa"), new y(2, LocalDate.of(1989, 1, 8), "Heisei"), new y(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public y(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static y c(LocalDate localDate) {
        if (localDate.K(x.d)) {
            j$.time.g.g("JapaneseDate before Meiji 6 are not supported");
            return null;
        }
        y[] yVarArr = e;
        for (int length = yVarArr.length - 1; length >= 0; length--) {
            y yVar = yVarArr[length];
            if (localDate.compareTo(yVar.b) >= 0) {
                return yVar;
            }
        }
        return null;
    }

    public static y i(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            y[] yVarArr = e;
            if (i2 < yVarArr.length) {
                return yVarArr[i2];
            }
        }
        j$.time.g.b("Invalid era: ", i);
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 5, this);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ long C(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.l(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.n(this, nVar);
    }

    public final y f() {
        y[] yVarArr = e;
        if (this == yVarArr[yVarArr.length - 1]) {
            return null;
        }
        return i(this.a + 1);
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.k(this, (j$.time.temporal.a) nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return nVar == aVar ? v.c.C(aVar) : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }

    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object w(j$.desugar.sun.nio.fs.o oVar) {
        return j$.desugar.sun.nio.fs.g.r(this, oVar);
    }
}
