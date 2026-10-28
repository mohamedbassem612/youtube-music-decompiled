package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements Comparable {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static a A(String str) {
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            a aVar = (a) concurrentHashMap.get(str);
            if (aVar == null) {
                aVar = (a) b.get(str);
            }
            if (aVar != null) {
                return aVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (a aVar2 : ServiceLoader.load(a.class)) {
                    if (str.equals(aVar2.getId()) || str.equals(aVar2.getCalendarType())) {
                        return aVar2;
                    }
                }
                j$.time.g.g("Unknown chronology: ".concat(str));
                return null;
            }
            o oVar = o.l;
            H(oVar, oVar.getId());
            v vVar = v.c;
            H(vVar, vVar.getId());
            a0 a0Var = a0.c;
            H(a0Var, a0Var.getId());
            g0 g0Var = g0.c;
            H(g0Var, g0Var.getId());
            try {
                for (a aVar3 : Arrays.asList(new a[0])) {
                    if (!aVar3.getId().equals("ISO")) {
                        H(aVar3, aVar3.getId());
                    }
                }
                s sVar = s.c;
                H(sVar, sVar.getId());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static a H(a aVar, String str) {
        String calendarType;
        a aVar2 = (a) a.putIfAbsent(str, aVar);
        if (aVar2 == null && (calendarType = aVar.getCalendarType()) != null) {
            b.putIfAbsent(calendarType, aVar);
        }
        return aVar2;
    }

    public static b I(b bVar, long j, long j2, long j3) {
        long j4;
        b bVarB = bVar.b(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        b bVarB2 = bVarB.b(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                bVarB2 = bVarB2.b(j$.desugar.sun.nio.fs.g.L(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return bVarB2.x(new j$.time.temporal.m(j$.time.c.r((int) j3).getValue(), (byte) 0));
        }
        long j5 = j3 - 1;
        bVarB2 = bVarB2.b(j5 / 7, (TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return bVarB2.x(new j$.time.temporal.m(j$.time.c.r((int) j3).getValue(), (byte) 0));
    }

    public static void h(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new j$.time.b("Conflict found: " + String.valueOf(aVar) + " " + l + " differs from " + String.valueOf(aVar) + " " + j);
    }

    public int B(m mVar, int i) {
        if (mVar instanceof r) {
            return i;
        }
        throw new ClassCastException("Era must be HijrahEra");
    }

    public j$.time.temporal.q C(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01db  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x020b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0213  */
    /* JADX WARN: Code duplicated, block: B:56:0x021d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0233  */
    /* JADX WARN: Code duplicated, block: B:60:0x0260  */
    /* JADX WARN: Code duplicated, block: B:62:0x0298  */
    /* JADX WARN: Code duplicated, block: B:65:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x032f  */
    /* JADX WARN: Code duplicated, block: B:79:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public b J(Map map, j$.time.format.x xVar) {
        j$.time.temporal.a aVar;
        j$.time.temporal.a aVar2;
        j$.time.temporal.a aVar3;
        j$.time.temporal.a aVar4;
        int iA;
        b bVarX;
        int iA2;
        b bVarB;
        int iA3;
        j$.time.temporal.a aVar5 = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar5)) {
            return p(((Long) map.remove(aVar5)).longValue());
        }
        K(map, xVar);
        b bVarM = M(map, xVar);
        if (bVarM != null) {
            return bVarM;
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar6)) {
            j$.time.temporal.a aVar7 = j$.time.temporal.a.MONTH_OF_YEAR;
            byte b2 = 0;
            if (!map.containsKey(aVar7)) {
                aVar = j$.time.temporal.a.DAY_OF_YEAR;
                if (map.containsKey(aVar)) {
                    iA3 = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                    if (xVar != j$.time.format.x.LENIENT) {
                        return s(iA3, C(aVar).a(((Long) map.remove(aVar)).longValue(), aVar));
                    }
                    return s(iA3, 1).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                }
                aVar2 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
                if (map.containsKey(aVar2)) {
                    aVar3 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                    if (map.containsKey(aVar3)) {
                        iA2 = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                        if (xVar == j$.time.format.x.LENIENT) {
                            return s(iA2, 1).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar2)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar3)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                        }
                        bVarB = s(iA2, 1).b((C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3) - 1) + ((C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                        if (xVar == j$.time.format.x.STRICT || bVarB.h(aVar6) == iA2) {
                            return bVarB;
                        }
                        j$.time.g.g("Strict mode rejected resolved date as it is in a different year");
                    } else {
                        aVar4 = j$.time.temporal.a.DAY_OF_WEEK;
                        if (map.containsKey(aVar4)) {
                            iA = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                            if (xVar == j$.time.format.x.LENIENT) {
                                return I(s(iA, 1), 0L, j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar2)).longValue(), 1L), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar4)).longValue(), 1L));
                            }
                            bVarX = s(iA, 1).b((C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).x(new j$.time.temporal.m(j$.time.c.r(C(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4)).getValue(), b2));
                            if (xVar == j$.time.format.x.STRICT || bVarX.h(aVar6) == iA) {
                                return bVarX;
                            }
                            j$.time.g.g("Strict mode rejected resolved date as it is in a different year");
                        }
                    }
                }
            } else {
                if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return L(map, xVar);
                }
                j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar8)) {
                    j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar9)) {
                        int iA4 = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                        if (xVar == j$.time.format.x.LENIENT) {
                            long jL = j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar7)).longValue(), 1L);
                            return k(iA4, 1, 1).b(jL, (TemporalUnit) ChronoUnit.MONTHS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                        }
                        int iA5 = C(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7);
                        b bVarB2 = k(iA4, iA5, 1).b((C(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((C(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                        if (xVar != j$.time.format.x.STRICT || bVarB2.h(aVar7) == iA5) {
                            return bVarB2;
                        }
                        j$.time.g.g("Strict mode rejected resolved date as it is in a different month");
                    } else {
                        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                        if (map.containsKey(aVar10)) {
                            int iA6 = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                            if (xVar == j$.time.format.x.LENIENT) {
                                return I(k(iA6, 1, 1), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar7)).longValue(), 1L), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar8)).longValue(), 1L), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar10)).longValue(), 1L));
                            }
                            int iA7 = C(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7);
                            b bVarX2 = k(iA6, iA7, 1).b((C(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).x(new j$.time.temporal.m(j$.time.c.r(C(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), b2));
                            if (xVar != j$.time.format.x.STRICT || bVarX2.h(aVar7) == iA7) {
                                return bVarX2;
                            }
                            j$.time.g.g("Strict mode rejected resolved date as it is in a different month");
                        } else {
                            aVar = j$.time.temporal.a.DAY_OF_YEAR;
                            if (map.containsKey(aVar)) {
                                iA3 = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                                if (xVar != j$.time.format.x.LENIENT) {
                                    return s(iA3, C(aVar).a(((Long) map.remove(aVar)).longValue(), aVar));
                                }
                                return s(iA3, 1).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                            }
                            aVar2 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
                            if (map.containsKey(aVar2)) {
                                aVar3 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                                if (map.containsKey(aVar3)) {
                                    iA2 = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                                    if (xVar == j$.time.format.x.LENIENT) {
                                        return s(iA2, 1).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar2)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar3)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                                    }
                                    bVarB = s(iA2, 1).b((C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3) - 1) + ((C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                                    if (xVar == j$.time.format.x.STRICT) {
                                        return bVarB;
                                    }
                                    return bVarB;
                                }
                                aVar4 = j$.time.temporal.a.DAY_OF_WEEK;
                                if (map.containsKey(aVar4)) {
                                    iA = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                                    if (xVar == j$.time.format.x.LENIENT) {
                                        return I(s(iA, 1), 0L, j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar2)).longValue(), 1L), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar4)).longValue(), 1L));
                                    }
                                    bVarX = s(iA, 1).b((C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).x(new j$.time.temporal.m(j$.time.c.r(C(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4)).getValue(), b2));
                                    if (xVar == j$.time.format.x.STRICT) {
                                        return bVarX;
                                    }
                                    return bVarX;
                                }
                            }
                        }
                    }
                } else {
                    aVar = j$.time.temporal.a.DAY_OF_YEAR;
                    if (map.containsKey(aVar)) {
                        iA3 = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                        if (xVar != j$.time.format.x.LENIENT) {
                            return s(iA3, C(aVar).a(((Long) map.remove(aVar)).longValue(), aVar));
                        }
                        return s(iA3, 1).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    aVar2 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
                    if (map.containsKey(aVar2)) {
                        aVar3 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                        if (map.containsKey(aVar3)) {
                            iA2 = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                            if (xVar == j$.time.format.x.LENIENT) {
                                return s(iA2, 1).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar2)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar3)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                            }
                            bVarB = s(iA2, 1).b((C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3) - 1) + ((C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                            if (xVar == j$.time.format.x.STRICT) {
                                return bVarB;
                            }
                            return bVarB;
                        }
                        aVar4 = j$.time.temporal.a.DAY_OF_WEEK;
                        if (map.containsKey(aVar4)) {
                            iA = C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6);
                            if (xVar == j$.time.format.x.LENIENT) {
                                return I(s(iA, 1), 0L, j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar2)).longValue(), 1L), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar4)).longValue(), 1L));
                            }
                            bVarX = s(iA, 1).b((C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).x(new j$.time.temporal.m(j$.time.c.r(C(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4)).getValue(), b2));
                            if (xVar == j$.time.format.x.STRICT) {
                                return bVarX;
                            }
                            return bVarX;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void K(Map map, j$.time.format.x xVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (xVar != j$.time.format.x.LENIENT) {
                aVar.s(l.longValue());
            }
            b bVarA = r().a(1L, (j$.time.temporal.n) j$.time.temporal.a.DAY_OF_MONTH).a(l.longValue(), (j$.time.temporal.n) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            h(map, aVar2, bVarA.h(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            h(map, aVar3, bVarA.h(aVar3));
        }
    }

    public b L(Map map, j$.time.format.x xVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = C(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (xVar == j$.time.format.x.LENIENT) {
            long jL = j$.desugar.sun.nio.fs.g.L(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return k(iA, 1, 1).b(jL, (TemporalUnit) ChronoUnit.MONTHS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (xVar != j$.time.format.x.SMART) {
            return k(iA, iA2, iA3);
        }
        try {
            return k(iA, iA2, iA3);
        } catch (j$.time.b unused) {
            return k(iA, iA2, 1).x(new j$.desugar.sun.nio.fs.o((byte) 3));
        }
    }

    public b M(Map map, j$.time.format.x xVar) {
        int iA;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            C(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        Long l2 = (Long) map.remove(aVar3);
        if (xVar != j$.time.format.x.LENIENT) {
            iA = C(aVar).a(l.longValue(), aVar);
        } else {
            long jLongValue = l.longValue();
            int i = (int) jLongValue;
            if (jLongValue != i) {
                throw new ArithmeticException();
            }
            iA = i;
        }
        if (l2 != null) {
            h(map, j$.time.temporal.a.YEAR, B(w(C(aVar3).a(l2.longValue(), aVar3)), iA));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar4)) {
            h(map, aVar4, B(s(C(aVar4).a(((Long) map.get(aVar4)).longValue(), aVar4), 1).getEra(), iA));
            return null;
        }
        if (xVar == j$.time.format.x.STRICT) {
            map.put(aVar, l);
            return null;
        }
        List listEras = eras();
        if (listEras.isEmpty()) {
            h(map, aVar4, iA);
            return null;
        }
        h(map, aVar4, B((m) listEras.get(listEras.size() - 1), iA));
        return null;
    }

    public j N(Instant instant, ZoneId zoneId) {
        return l.s(this, instant, zoneId);
    }

    public j O(Temporal temporal) {
        try {
            ZoneId zoneIdR = ZoneId.r(temporal);
            try {
                return N(Instant.s(temporal), zoneIdR);
            } catch (j$.time.b unused) {
                return l.r(zoneIdR, null, g.r(this, y(temporal)));
            }
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((a) obj).getId());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && getId().compareTo(((a) obj).getId()) == 0;
        }
        return true;
    }

    public List eras() {
        return j$.desugar.sun.nio.fs.g.C(r.values());
    }

    public String getCalendarType() {
        return "islamic-umalqura";
    }

    public String getId() {
        return "Hijrah-umalqura";
    }

    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public b k(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    public b l(j$.time.temporal.k kVar) {
        return LocalDate.A(kVar);
    }

    public b p(long j) {
        return LocalDate.ofEpochDay(j);
    }

    public b r() {
        int i = Clock.a;
        return LocalDate.A(LocalDate.M(new j$.time.a(ZoneId.systemDefault())));
    }

    public b s(int i, int i2) {
        return LocalDate.N(i, i2);
    }

    public final String toString() {
        return getId();
    }

    public m w(int i) {
        if (i == 1) {
            return r.AH;
        }
        j$.time.g.g("invalid Hijrah era");
        return null;
    }

    public e y(Temporal temporal) {
        try {
            return l(temporal).D(LocalTime.A(temporal));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }
}
