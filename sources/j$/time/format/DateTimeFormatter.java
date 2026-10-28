package j$.time.format;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;
    public static final DateTimeFormatter e;
    public final d a;
    public final Locale b;
    public final x c;
    public final j$.time.chrono.s d;

    static {
        q qVar = new q();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        y yVar = y.EXCEEDS_PAD;
        qVar.h(aVar, 4, 10, yVar);
        qVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        qVar.g(aVar2, 2);
        qVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        qVar.g(aVar3, 2);
        x xVar = x.STRICT;
        j$.time.chrono.s sVar = j$.time.chrono.s.c;
        DateTimeFormatter dateTimeFormatterK = qVar.k(xVar, sVar);
        ISO_LOCAL_DATE = dateTimeFormatterK;
        q qVar2 = new q();
        l lVar = l.INSENSITIVE;
        qVar2.b(lVar);
        qVar2.a(dateTimeFormatterK);
        i iVar = i.e;
        qVar2.b(iVar);
        qVar2.k(xVar, sVar);
        q qVar3 = new q();
        qVar3.b(lVar);
        qVar3.a(dateTimeFormatterK);
        qVar3.j();
        qVar3.b(iVar);
        qVar3.k(xVar, sVar);
        q qVar4 = new q();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        qVar4.g(aVar4, 2);
        qVar4.c(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        qVar4.g(aVar5, 2);
        qVar4.j();
        qVar4.c(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        qVar4.g(aVar6, 2);
        qVar4.j();
        qVar4.b(new f(j$.time.temporal.a.NANO_OF_SECOND));
        DateTimeFormatter dateTimeFormatterK2 = qVar4.k(xVar, null);
        q qVar5 = new q();
        qVar5.b(lVar);
        qVar5.a(dateTimeFormatterK2);
        qVar5.b(iVar);
        qVar5.k(xVar, null);
        q qVar6 = new q();
        qVar6.b(lVar);
        qVar6.a(dateTimeFormatterK2);
        qVar6.j();
        qVar6.b(iVar);
        qVar6.k(xVar, null);
        q qVar7 = new q();
        qVar7.b(lVar);
        qVar7.a(dateTimeFormatterK);
        qVar7.c('T');
        qVar7.a(dateTimeFormatterK2);
        DateTimeFormatter dateTimeFormatterK3 = qVar7.k(xVar, sVar);
        q qVar8 = new q();
        qVar8.b(lVar);
        qVar8.a(dateTimeFormatterK3);
        l lVar2 = l.LENIENT;
        qVar8.b(lVar2);
        qVar8.b(iVar);
        l lVar3 = l.STRICT;
        qVar8.b(lVar3);
        DateTimeFormatter dateTimeFormatterK4 = qVar8.k(xVar, sVar);
        q qVar9 = new q();
        qVar9.a(dateTimeFormatterK4);
        qVar9.j();
        qVar9.c('[');
        l lVar4 = l.SENSITIVE;
        qVar9.b(lVar4);
        j$.desugar.sun.nio.fs.o oVar = q.f;
        qVar9.b(new o(oVar, "ZoneRegionId()"));
        qVar9.c(']');
        qVar9.k(xVar, sVar);
        q qVar10 = new q();
        qVar10.a(dateTimeFormatterK3);
        qVar10.j();
        qVar10.b(iVar);
        qVar10.j();
        qVar10.c('[');
        qVar10.b(lVar4);
        qVar10.b(new o(oVar, "ZoneRegionId()"));
        qVar10.c(']');
        qVar10.k(xVar, sVar);
        q qVar11 = new q();
        qVar11.b(lVar);
        qVar11.h(aVar, 4, 10, yVar);
        qVar11.c('-');
        qVar11.g(j$.time.temporal.a.DAY_OF_YEAR, 3);
        qVar11.j();
        qVar11.b(iVar);
        qVar11.k(xVar, sVar);
        q qVar12 = new q();
        qVar12.b(lVar);
        qVar12.h(j$.time.temporal.h.c, 4, 10, yVar);
        qVar12.d("-W");
        qVar12.g(j$.time.temporal.h.b, 2);
        qVar12.c('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        qVar12.g(aVar7, 1);
        qVar12.j();
        qVar12.b(iVar);
        qVar12.k(xVar, sVar);
        q qVar13 = new q();
        qVar13.b(lVar);
        qVar13.b(new g());
        e = qVar13.k(xVar, null);
        q qVar14 = new q();
        qVar14.b(lVar);
        qVar14.g(aVar, 4);
        qVar14.g(aVar2, 2);
        qVar14.g(aVar3, 2);
        qVar14.j();
        qVar14.b(lVar2);
        qVar14.b(new i("+HHMMss", "Z"));
        qVar14.b(lVar3);
        qVar14.k(xVar, sVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        q qVar15 = new q();
        qVar15.b(lVar);
        qVar15.b(lVar2);
        qVar15.j();
        qVar15.e(aVar7, map);
        qVar15.d(", ");
        qVar15.i();
        qVar15.h(aVar3, 1, 2, y.NOT_NEGATIVE);
        qVar15.c(' ');
        qVar15.e(aVar2, map2);
        qVar15.c(' ');
        qVar15.g(aVar, 4);
        qVar15.c(' ');
        qVar15.g(aVar4, 2);
        qVar15.c(':');
        qVar15.g(aVar5, 2);
        qVar15.j();
        qVar15.c(':');
        qVar15.g(aVar6, 2);
        qVar15.i();
        qVar15.c(' ');
        qVar15.b(new i("+HHMM", "GMT"));
        RFC_1123_DATE_TIME = qVar15.k(x.SMART, sVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, x xVar, j$.time.chrono.s sVar) {
        int i = v.a;
        this.a = dVar;
        Objects.a(locale, "locale");
        this.b = locale;
        Objects.a(xVar, "resolverStyle");
        this.c = xVar;
        this.d = sVar;
    }

    public final String a(j$.time.temporal.k kVar) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.a.h(new t(kVar, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new j$.time.b(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x0215  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final w b(CharSequence charSequence) {
        j$.time.p pVar;
        j$.time.p pVar2;
        j$.time.temporal.n nVar;
        j$.time.temporal.a aVar;
        j$.time.temporal.n nVar2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        r rVar = new r(this);
        int iK = this.a.k(rVar, charSequence, parsePosition.getIndex());
        if (iK < 0) {
            parsePosition.setErrorIndex(~iK);
            rVar = null;
        } else {
            parsePosition.setIndex(iK);
        }
        if (rVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            String string = charSequence.length() > 64 ? charSequence.subSequence(0, 64).toString() + "..." : charSequence.toString();
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        w wVarC = rVar.c();
        j$.time.chrono.a aVar2 = rVar.c().c;
        if (aVar2 == null && (aVar2 = rVar.a.d) == null) {
            aVar2 = j$.time.chrono.s.c;
        }
        wVarC.c = aVar2;
        HashMap map = wVarC.a;
        ZoneId zoneId = wVarC.b;
        if (zoneId == null) {
            zoneId = null;
        }
        wVarC.b = zoneId;
        wVarC.e = this.c;
        wVarC.f();
        wVarC.o(wVarC.c.J(map, wVarC.e));
        wVarC.m();
        if (map.size() > 0) {
            loop0: while (i < 50) {
                Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    nVar2 = (j$.time.temporal.n) ((Map.Entry) it.next()).getKey();
                    j$.time.temporal.k kVarP = nVar2.p(map, wVarC, wVarC.e);
                    if (kVarP != null) {
                        if (kVarP instanceof j$.time.chrono.j) {
                            j$.time.chrono.j jVar = (j$.time.chrono.j) kVarP;
                            ZoneId zoneId2 = wVarC.b;
                            if (zoneId2 == null) {
                                wVarC.b = jVar.getZone();
                            } else if (!zoneId2.equals(jVar.getZone())) {
                                j$.time.g.g("ChronoZonedDateTime must use the effective parsed zone: ".concat(String.valueOf(wVarC.b)));
                                return null;
                            }
                            kVarP = jVar.toLocalDateTime();
                        }
                        if (kVarP instanceof j$.time.chrono.e) {
                            j$.time.chrono.e eVar = (j$.time.chrono.e) kVarP;
                            wVarC.n(eVar.toLocalTime(), j$.time.p.d);
                            wVarC.o(eVar.toLocalDate());
                            break;
                        }
                        if (kVarP instanceof j$.time.chrono.b) {
                            wVarC.o((j$.time.chrono.b) kVarP);
                            break;
                        }
                        if (kVarP instanceof LocalTime) {
                            wVarC.n((LocalTime) kVarP, j$.time.p.d);
                            break;
                        }
                        j$.time.g.g("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        return null;
                    }
                } while (map.containsKey(nVar2));
                i++;
            }
            if (i == 50) {
                j$.time.g.g("One of the parsed fields has an incorrectly implemented resolve method");
                return null;
            }
            if (i > 0) {
                wVarC.f();
                wVarC.o(wVarC.c.J(map, wVarC.e));
                wVarC.m();
            }
        }
        long j = 1000000;
        if (wVarC.g == null) {
            j$.time.temporal.n nVar3 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(nVar3)) {
                long jLongValue = ((Long) map.remove(nVar3)).longValue();
                j$.time.temporal.a aVar3 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(aVar3)) {
                    long jLongValue2 = (((Long) map.get(aVar3)).longValue() % 1000) + (jLongValue * 1000);
                    wVarC.p(nVar3, aVar3, Long.valueOf(jLongValue2));
                    map.remove(aVar3);
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(obj)) {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) map.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l = (Long) map.get(obj2);
            if (l != null) {
                Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l2 = (Long) map.get(obj3);
                Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l3 = (Long) map.get(obj4);
                Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l4 = (Long) map.get(obj5);
                if (l2 != null ? l3 != null || l4 == null : l3 == null && l4 == null) {
                    wVarC.j(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                    map.remove(obj2);
                    map.remove(obj3);
                    map.remove(obj4);
                    map.remove(obj5);
                } else {
                    j = 1000000;
                }
            }
            if (wVarC.e != x.LENIENT && map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    nVar = (j$.time.temporal.n) entry.getKey();
                    if (nVar instanceof j$.time.temporal.a) {
                        aVar = (j$.time.temporal.a) nVar;
                        if (aVar.w()) {
                            aVar.s(((Long) entry.getValue()).longValue());
                        }
                    }
                }
            }
        } else if (wVarC.e != x.LENIENT) {
            while (r0.hasNext()) {
                nVar = (j$.time.temporal.n) entry.getKey();
                if (nVar instanceof j$.time.temporal.a) {
                    aVar = (j$.time.temporal.a) nVar;
                    if (aVar.w()) {
                        aVar.s(((Long) entry.getValue()).longValue());
                    }
                }
            }
        }
        j$.time.temporal.k kVar = wVarC.f;
        if (kVar != null) {
            wVarC.c(kVar);
        }
        j$.time.temporal.k kVar2 = wVarC.g;
        if (kVar2 != null) {
            wVarC.c(kVar2);
            if (wVarC.f != null && map.size() > 0) {
                wVarC.c(wVarC.f.D(wVarC.g));
            }
        }
        j$.time.chrono.b bVar = wVarC.f;
        if (bVar != null && wVarC.g != null && (pVar = wVarC.h) != (pVar2 = j$.time.p.d)) {
            wVarC.f = bVar.F(pVar);
            wVarC.h = pVar2;
        }
        if (wVarC.g == null && (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || map.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || map.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
            j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
            if (map.containsKey(aVar4)) {
                long jLongValue3 = ((Long) map.get(aVar4)).longValue();
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j));
            } else {
                map.put(aVar4, 0L);
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
            }
        }
        if (wVarC.f != null && wVarC.g != null) {
            Long l5 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l5 != null) {
                map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(wVarC.f.D(wVarC.g).z(ZoneOffset.L(l5.intValue())).toEpochSecond()));
            } else if (wVarC.b != null) {
                map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(wVarC.f.D(wVarC.g).z(wVarC.b).toEpochSecond()));
            }
        }
        return wVarC;
    }

    public final String toString() {
        String string = this.a.toString();
        return !string.startsWith("[") ? string.substring(1, string.length() - 1) : string;
    }
}
