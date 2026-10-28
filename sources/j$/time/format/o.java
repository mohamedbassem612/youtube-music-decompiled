package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class o implements e {
    public static volatile AbstractMap.SimpleImmutableEntry c;
    public static volatile AbstractMap.SimpleImmutableEntry d;
    public final j$.desugar.sun.nio.fs.o a;
    public final String b;

    public o(j$.desugar.sun.nio.fs.o oVar, String str) {
        this.a = oVar;
        this.b = str;
    }

    public static int b(r rVar, CharSequence charSequence, int i, int i2, i iVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            rVar.e(ZoneId.s(upperCase, true));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || rVar.a(charSequence.charAt(i2), 'Z')) {
            rVar.e(ZoneId.s(upperCase, true));
            return i2;
        }
        r rVar2 = new r(rVar.a);
        rVar2.b = rVar.b;
        rVar2.c = rVar.c;
        int iK = iVar.k(rVar2, charSequence, i2);
        try {
            if (iK < 0) {
                if (iVar != i.e) {
                    rVar.e(ZoneId.s(upperCase, true));
                }
                return ~i;
            }
            rVar.e(ZoneId.A(upperCase, ZoneOffset.L((int) rVar2.d(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
            i2 = iK;
            return i2;
        } catch (j$.time.b unused) {
        }
    }

    public k a(r rVar) {
        Set<String> set = j$.time.zone.f.d;
        int size = set.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = rVar.b ? c : d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                simpleImmutableEntry = rVar.b ? c : d;
                if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                    Integer numValueOf = Integer.valueOf(size);
                    k kVar = rVar.b ? new k("", null, null) : new j("", null, null);
                    for (String str : set) {
                        kVar.a(str, str);
                    }
                    simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, kVar);
                    if (rVar.b) {
                        c = simpleImmutableEntry;
                    } else {
                        d = simpleImmutableEntry;
                    }
                }
            }
        }
        return (k) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.e
    public boolean h(t tVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) tVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.e
    public final int k(r rVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i != length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                return b(rVar, charSequence, i, i, i.e);
            }
            int i3 = i + 2;
            if (length >= i3) {
                char cCharAt2 = charSequence.charAt(i + 1);
                if (rVar.a(cCharAt, 'U') && rVar.a(cCharAt2, 'T')) {
                    int i4 = i + 3;
                    return (length < i4 || !rVar.a(charSequence.charAt(i3), 'C')) ? b(rVar, charSequence, i, i3, i.f) : b(rVar, charSequence, i, i4, i.f);
                }
                if (rVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && rVar.a(cCharAt2, 'M') && rVar.a(charSequence.charAt(i3), 'T')) {
                    int i5 = i + 4;
                    if (length < i5 || !rVar.a(charSequence.charAt(i2), '0')) {
                        return b(rVar, charSequence, i, i2, i.f);
                    }
                    rVar.e(ZoneId.s("GMT0", true));
                    return i5;
                }
            }
            k kVarA = a(rVar);
            ParsePosition parsePosition = new ParsePosition(i);
            String strC = kVarA.c(charSequence, parsePosition);
            if (strC != null) {
                rVar.e(ZoneId.s(strC, true));
                return parsePosition.getIndex();
            }
            if (rVar.a(cCharAt, 'Z')) {
                rVar.e(ZoneOffset.UTC);
                return i + 1;
            }
        }
        return ~i;
    }

    public final String toString() {
        return this.b;
    }
}
