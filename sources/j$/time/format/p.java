package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class p extends o {
    public static final ConcurrentHashMap h = new ConcurrentHashMap();
    public final TextStyle e;
    public final HashMap f;
    public final HashMap g;

    public p(TextStyle textStyle) {
        super(j$.time.temporal.o.e, j$.desugar.sun.nio.fs.i.a("ZoneText(", String.valueOf(textStyle), ")"));
        this.f = new HashMap();
        this.g = new HashMap();
        Objects.a(textStyle, "textStyle");
        this.e = textStyle;
    }

    @Override // j$.time.format.o
    public final k a(r rVar) {
        k kVar;
        if (this.e == TextStyle.NARROW) {
            return super.a(rVar);
        }
        Locale locale = rVar.a.b;
        boolean z = rVar.b;
        Set set = j$.time.zone.f.d;
        int size = set.size();
        HashMap map = z ? this.f : this.g;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (kVar = (k) ((SoftReference) entry.getValue()).get()) != null) {
            return kVar;
        }
        k kVar2 = rVar.b ? new k("", null, null) : new j("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                kVar2.a(str, str);
                HashMap map2 = z.g;
                HashMap map3 = z.d;
                String str2 = (String) map3.get(str);
                if (str2 == null && map2.containsKey(str)) {
                    str = (String) map2.get(str);
                    str2 = (String) map3.get(str);
                }
                if (str2 != null) {
                    Map map4 = (Map) z.f.get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) z.e.get(str2) : (String) map4.get(locale.getCountry());
                }
                if (map2.containsKey(str)) {
                    str = (String) map2.get(str);
                }
                for (int i = this.e == TextStyle.FULL ? 1 : 2; i < strArr.length; i += 2) {
                    kVar2.a(strArr[i], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(kVar2)));
        return kVar2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // j$.time.format.o, j$.time.format.e
    public final boolean h(t tVar, StringBuilder sb) {
        boolean zG;
        String[] strArr;
        ZoneId zoneId = (ZoneId) tVar.b(j$.time.temporal.o.a);
        if (zoneId == null) {
            return false;
        }
        String id = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            j$.time.temporal.k kVar = tVar.a;
            String str = null;
            Map concurrentHashMap = null;
            if (kVar.d(j$.time.temporal.a.INSTANT_SECONDS)) {
                zG = zoneId.getRules().g(Instant.s(kVar));
            } else {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                if (kVar.d(aVar)) {
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                    if (kVar.d(aVar2)) {
                        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(kVar.C(aVar));
                        LocalTime localTimeH = LocalTime.H(kVar.C(aVar2));
                        localDateOfEpochDay.getClass();
                        LocalDateTime localDateTimeB = LocalDateTime.B(localDateOfEpochDay, localTimeH);
                        if (zoneId.getRules().e(localDateTimeB) == null) {
                            zG = zoneId.getRules().g(ZonedDateTime.s(localDateTimeB, zoneId, null).toInstant());
                        } else {
                            zG = 2;
                        }
                    } else {
                        zG = 2;
                    }
                } else {
                    zG = 2;
                }
            }
            Locale locale = tVar.b.b;
            TextStyle textStyle = TextStyle.NARROW;
            TextStyle textStyle2 = this.e;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap2 = h;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(id);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(id);
                    String[] strArr2 = {id, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), id, id};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(locale, strArr2);
                    concurrentHashMap2.put(id, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                if (zG != 0) {
                    str = zG != 1 ? strArr[(textStyle2.a ? 1 : 0) + 5] : strArr[(textStyle2.a ? 1 : 0) + 3];
                } else {
                    str = strArr[(textStyle2.a ? 1 : 0) + 1];
                }
            }
            if (str != null) {
                id = str;
            }
        }
        sb.append(id);
        return true;
    }
}
