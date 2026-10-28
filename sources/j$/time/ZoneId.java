package j$.time;

import j$.time.format.TextStyle;
import j$.time.format.x;
import j$.time.zone.ZoneRules;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ZoneId implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        a = DesugarCollections.unmodifiableMap(map);
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != v.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId A(String str, ZoneOffset zoneOffset) {
        Objects.a(str, "prefix");
        Objects.a(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            g.a("prefix should be GMT, UTC or UT, is: ".concat(str));
            return null;
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.c);
        }
        return new v(str, new ZoneRules(zoneOffset));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4, types: [j$.time.ZoneId] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static ZoneId B(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return A(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return v.I(str, z);
        }
        try {
            ZoneOffset zoneOffsetJ = ZoneOffset.J(str.substring(i));
            str = zoneOffsetJ == ZoneOffset.UTC ? A(strSubstring, zoneOffsetJ) : A(strSubstring, zoneOffsetJ);
            return str;
        } catch (b e) {
            throw new b("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId r(j$.time.temporal.k kVar) {
        ZoneId zoneId = (ZoneId) kVar.w(j$.time.temporal.o.e);
        if (zoneId != null) {
            return zoneId;
        }
        g.g(j$.desugar.sun.nio.fs.i.b("Unable to obtain ZoneId from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()));
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId s(String str, boolean z) {
        Objects.a(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.J(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return B(str, 3, z);
        }
        return str.startsWith("UT") ? B(str, 2, z) : v.I(str, z);
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Objects.a(id, "zoneId");
        Map map = a;
        Objects.a(map, "aliasMap");
        return s((String) Objects.requireNonNullElse((String) map.get(id), id), true);
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    public abstract void H(ObjectOutput objectOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        j$.time.format.q qVar = new j$.time.format.q();
        qVar.b(new j$.time.format.p(textStyle));
        return qVar.l(locale, x.SMART, null).a(new j$.desugar.sun.nio.fs.h((byte) 3, this));
    }

    public abstract String getId();

    public abstract ZoneRules getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return getId();
    }
}
