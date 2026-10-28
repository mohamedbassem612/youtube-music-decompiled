package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class r {
    public final DateTimeFormatter a;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList d;

    public r(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = dateTimeFormatter;
        arrayList.add(new w());
    }

    public static boolean b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    public final boolean a(char c, char c2) {
        if (this.b) {
            return c == c2;
        }
        return b(c, c2);
    }

    public final w c() {
        ArrayList arrayList = this.d;
        return (w) arrayList.get(arrayList.size() - 1);
    }

    public final Long d(j$.time.temporal.a aVar) {
        return (Long) c().a.get(aVar);
    }

    public final void e(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        c().b = zoneId;
    }

    public final int f(j$.time.temporal.n nVar, long j, int i, int i2) {
        Objects.a(nVar, "field");
        Long l = (Long) c().a.put(nVar, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    public final boolean g(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.b) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
        } else {
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String toString() {
        return c().toString();
    }
}
