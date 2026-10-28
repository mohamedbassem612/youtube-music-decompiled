package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.chrono.s;
import j$.time.format.w;
import j$.time.format.x;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f implements n {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ f[] b;

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.n
            public final boolean h(k kVar) {
                if (kVar.d(a.DAY_OF_YEAR) && kVar.d(a.MONTH_OF_YEAR) && kVar.d(a.YEAR)) {
                    f fVar2 = h.a;
                    if (j$.desugar.sun.nio.fs.g.x(kVar).equals(s.c)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.n
            public final q k(k kVar) {
                if (!h(kVar)) {
                    j$.time.g.e("Unsupported field: DayOfQuarter");
                    return null;
                }
                long jC = kVar.C(f.QUARTER_OF_YEAR);
                if (jC == 1) {
                    long jC2 = kVar.C(a.YEAR);
                    s.c.getClass();
                    return s.isLeapYear(jC2) ? q.f(1L, 91L) : q.f(1L, 90L);
                }
                if (jC == 2) {
                    return q.f(1L, 91L);
                }
                return (jC == 3 || jC == 4) ? q.f(1L, 92L) : range();
            }

            @Override // j$.time.temporal.n
            public final long l(k kVar) {
                if (!h(kVar)) {
                    j$.time.g.e("Unsupported field: DayOfQuarter");
                    return 0L;
                }
                int iH = kVar.h(a.DAY_OF_YEAR);
                int iH2 = kVar.h(a.MONTH_OF_YEAR);
                long jC = kVar.C(a.YEAR);
                int i = (iH2 - 1) / 3;
                s.c.getClass();
                return iH - f.a[i + (s.isLeapYear(jC) ? 4 : 0)];
            }

            @Override // j$.time.temporal.f, j$.time.temporal.n
            public final k p(HashMap map, w wVar, x xVar) {
                LocalDate localDateOf;
                long jL;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                n nVar = f.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(nVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = aVar.b.a(l.longValue(), aVar);
                long jLongValue = ((Long) map.get(f.DAY_OF_QUARTER)).longValue();
                f fVar2 = h.a;
                if (!j$.desugar.sun.nio.fs.g.x(wVar).equals(s.c)) {
                    j$.time.g.g("Resolve requires IsoChronology");
                    return null;
                }
                if (xVar == x.LENIENT) {
                    localDateOf = LocalDate.of(iA, 1, 1).Q(j$.desugar.sun.nio.fs.g.K(j$.desugar.sun.nio.fs.g.L(l2.longValue(), 1L), 3L));
                    jL = j$.desugar.sun.nio.fs.g.L(jLongValue, 1L);
                } else {
                    localDateOf = LocalDate.of(iA, ((nVar.range().a(l2.longValue(), nVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (xVar == x.STRICT) {
                            k(localDateOf).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    jL = jLongValue - 1;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(nVar);
                return localDateOf.P(jL);
            }

            @Override // j$.time.temporal.n
            public final Temporal r(Temporal temporal, long j) {
                long jL = l(temporal);
                range().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.a((j - jL) + temporal.C(aVar), aVar);
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.g(90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.n
            public final boolean h(k kVar) {
                if (kVar.d(a.MONTH_OF_YEAR)) {
                    f fVar3 = h.a;
                    if (j$.desugar.sun.nio.fs.g.x(kVar).equals(s.c)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.n
            public final q k(k kVar) {
                if (h(kVar)) {
                    return range();
                }
                j$.time.g.e("Unsupported field: QuarterOfYear");
                return null;
            }

            @Override // j$.time.temporal.n
            public final long l(k kVar) {
                if (h(kVar)) {
                    return (kVar.C(a.MONTH_OF_YEAR) + 2) / 3;
                }
                j$.time.g.e("Unsupported field: QuarterOfYear");
                return 0L;
            }

            @Override // j$.time.temporal.n
            public final Temporal r(Temporal temporal, long j) {
                long jL = l(temporal);
                range().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.a(((j - jL) * 3) + temporal.C(aVar), aVar);
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.n
            public final boolean h(k kVar) {
                if (kVar.d(a.EPOCH_DAY)) {
                    f fVar4 = h.a;
                    if (j$.desugar.sun.nio.fs.g.x(kVar).equals(s.c)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.n
            public final q k(k kVar) {
                if (h(kVar)) {
                    return q.f(1L, f.y(f.w(LocalDate.A(kVar))));
                }
                j$.time.g.e("Unsupported field: WeekOfWeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.n
            public final long l(k kVar) {
                if (h(kVar)) {
                    return f.s(LocalDate.A(kVar));
                }
                j$.time.g.e("Unsupported field: WeekOfWeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.f, j$.time.temporal.n
            public final k p(HashMap map, w wVar, x xVar) {
                LocalDate localDateA;
                long j;
                n nVar = f.WEEK_BASED_YEAR;
                Long l = (Long) map.get(nVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = nVar.range().a(l.longValue(), nVar);
                long jLongValue = ((Long) map.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                f fVar4 = h.a;
                if (!j$.desugar.sun.nio.fs.g.x(wVar).equals(s.c)) {
                    j$.time.g.g("Resolve requires IsoChronology");
                    return null;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                if (xVar == x.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j2 = jLongValue2 - 1;
                        localDateOf = localDateOf.R(j2 / 7);
                        j = j2 % 7;
                    } else {
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.R(j$.desugar.sun.nio.fs.g.L(jLongValue2, 7L) / 7);
                            j = (jLongValue2 + 6) % 7;
                        }
                        localDateA = localDateOf.R(j$.desugar.sun.nio.fs.g.L(jLongValue, 1L)).a(jLongValue2, aVar);
                    }
                    jLongValue2 = j + 1;
                    localDateA = localDateOf.R(j$.desugar.sun.nio.fs.g.L(jLongValue, 1L)).a(jLongValue2, aVar);
                } else {
                    int iA2 = aVar.b.a(l2.longValue(), aVar);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (xVar == x.STRICT) {
                            q.f(1L, f.y(f.w(localDateOf))).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    localDateA = localDateOf.R(jLongValue - 1).a(iA2, aVar);
                }
                LocalDate localDate = localDateA;
                map.remove(this);
                map.remove(nVar);
                map.remove(aVar);
                return localDate;
            }

            @Override // j$.time.temporal.n
            public final Temporal r(Temporal temporal, long j) {
                range().b(j, this);
                return temporal.b(j$.desugar.sun.nio.fs.g.L(j, l(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.g(52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.n
            public final boolean h(k kVar) {
                if (kVar.d(a.EPOCH_DAY)) {
                    f fVar5 = h.a;
                    if (j$.desugar.sun.nio.fs.g.x(kVar).equals(s.c)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.n
            public final q k(k kVar) {
                if (h(kVar)) {
                    return a.YEAR.b;
                }
                j$.time.g.e("Unsupported field: WeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.n
            public final long l(k kVar) {
                if (h(kVar)) {
                    return f.w(LocalDate.A(kVar));
                }
                j$.time.g.e("Unsupported field: WeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.n
            public final Temporal r(Temporal temporal, long j) {
                if (!h(temporal)) {
                    j$.time.g.e("Unsupported field: WeekBasedYear");
                    return null;
                }
                int iA = a.YEAR.b.a(j, f.WEEK_BASED_YEAR);
                LocalDate localDateA = LocalDate.A(temporal);
                a aVar = a.DAY_OF_WEEK;
                int iH = localDateA.h(aVar);
                int iS = f.s(localDateA);
                if (iS == 53 && f.y(iA) == 52) {
                    iS = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return temporal.x(localDateOf.P(((iS - 1) * 7) + (iH - localDateOf.h(aVar))));
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return a.YEAR.b;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int s(LocalDate localDate) {
        int iOrdinal = localDate.H().ordinal();
        int I = localDate.I() - 1;
        int i = (3 - iOrdinal) + I;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (I < i3) {
            if (localDate.I() != 180) {
                localDate = LocalDate.N(localDate.a, 180);
            }
            return (int) q.f(1L, y(w(localDate.S(-1L)))).d;
        }
        int i4 = ((I - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.isLeapYear())) {
            return i4;
        }
        return 1;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    public static int w(LocalDate localDate) {
        int i = localDate.a;
        int I = localDate.I();
        if (I <= 3) {
            return I - localDate.H().ordinal() < -2 ? i - 1 : i;
        }
        if (I >= 363) {
            return ((I - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.H().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    public static int y(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        return (localDateOf.H() == j$.time.c.THURSDAY || (localDateOf.H() == j$.time.c.WEDNESDAY && localDateOf.isLeapYear())) ? 53 : 52;
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    public k p(HashMap map, w wVar, x xVar) {
        return null;
    }
}
