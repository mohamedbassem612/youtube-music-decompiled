package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements j$.time.temporal.k, j$.time.temporal.l {
    public static final c FRIDAY;
    public static final c MONDAY;
    public static final c SATURDAY;
    public static final c SUNDAY;
    public static final c THURSDAY;
    public static final c TUESDAY;
    public static final c WEDNESDAY;
    public static final c[] a;
    public static final /* synthetic */ c[] b;

    static {
        c cVar = new c("MONDAY", 0);
        MONDAY = cVar;
        c cVar2 = new c("TUESDAY", 1);
        TUESDAY = cVar2;
        c cVar3 = new c("WEDNESDAY", 2);
        WEDNESDAY = cVar3;
        c cVar4 = new c("THURSDAY", 3);
        THURSDAY = cVar4;
        c cVar5 = new c("FRIDAY", 4);
        FRIDAY = cVar5;
        c cVar6 = new c("SATURDAY", 5);
        SATURDAY = cVar6;
        c cVar7 = new c("SUNDAY", 6);
        SUNDAY = cVar7;
        b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        a = values();
    }

    public static c r(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        g.b("Invalid value for DayOfWeek: ", i);
        return null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) b.clone();
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (nVar != j$.time.temporal.a.DAY_OF_WEEK) {
                return false;
            }
        } else if (nVar == null || !nVar.h(this)) {
            return false;
        }
        return true;
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.DAY_OF_WEEK ? nVar.range() : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        return oVar == j$.time.temporal.o.c ? ChronoUnit.DAYS : j$.time.temporal.o.c(this, oVar);
    }
}
