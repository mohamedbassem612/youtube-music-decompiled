package defpackage;

import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class lbm {
    final String b;
    final int c;
    Boolean d;
    Boolean e;
    Long f;
    Long g;

    public lbm(String str, int i) {
        this.b = str;
        this.c = i;
    }

    private static Boolean d(String str, int i, boolean z, String str2, List list, String str3, lcz lczVar) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (lczVar == null) {
                        return null;
                    }
                    lczVar.f.b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list != null) {
                    return Boolean.valueOf(list.contains(str));
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    static Boolean e(BigDecimal bigDecimal, lhv lhvVar, double d) {
        int i;
        int iBc;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        kro.l(lhvVar);
        int i2 = lhvVar.b;
        if ((i2 & 1) == 0 || (iBc = a.bc((i = lhvVar.c))) == 0) {
            return null;
        }
        if (iBc == 1) {
            return null;
        }
        int iBc2 = a.bc(i);
        if (iBc2 == 0 || iBc2 != 5) {
            if ((i2 & 4) == 0) {
                return null;
            }
        } else if ((i2 & 8) == 0 || (i2 & 16) == 0) {
            return null;
        }
        int iBc3 = a.bc(i);
        if (iBc3 == 0) {
            iBc3 = 1;
        }
        int iBc4 = a.bc(i);
        try {
            if (iBc4 == 0 || iBc4 != 5) {
                if (!lfx.F(lhvVar.e)) {
                    return null;
                }
                bigDecimal2 = new BigDecimal(lhvVar.e);
                bigDecimal3 = null;
                bigDecimal4 = null;
            } else {
                if (!lfx.F(lhvVar.f) || !lfx.F(lhvVar.g)) {
                    return null;
                }
                BigDecimal bigDecimal5 = new BigDecimal(lhvVar.f);
                bigDecimal4 = new BigDecimal(lhvVar.g);
                bigDecimal3 = bigDecimal5;
                bigDecimal2 = null;
            }
            if (iBc3 == 5) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 == null) {
                return null;
            }
            int i3 = iBc3 - 1;
            if (i3 == 1) {
                if (bigDecimal2 != null) {
                    return Boolean.valueOf((boolean) (bigDecimal.compareTo(bigDecimal2) >>> 31));
                }
                return null;
            }
            if (i3 == 2) {
                if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                return null;
            }
            if (i3 != 3) {
                if (i3 != 4 || bigDecimal3 == null) {
                    return null;
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
            }
            if (bigDecimal2 == null) {
                return null;
            }
            if (d != 0.0d) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
            }
            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean f(String str, lhx lhxVar, lcz lczVar) {
        int i;
        int iAX;
        List list;
        kro.l(lhxVar);
        if (str == null) {
            return null;
        }
        int i2 = lhxVar.b;
        if ((i2 & 1) == 0 || (iAX = a.aX((i = lhxVar.c))) == 0 || iAX == 1) {
            return null;
        }
        int iAX2 = a.aX(i);
        if (iAX2 == 0 || iAX2 != 7) {
            if ((i2 & 2) == 0) {
                return null;
            }
        } else if (lhxVar.f.size() == 0) {
            return null;
        }
        int iAX3 = a.aX(lhxVar.c);
        int i3 = iAX3 == 0 ? 1 : iAX3;
        boolean z = lhxVar.e;
        String upperCase = (z || i3 == 2 || i3 == 7) ? lhxVar.d : lhxVar.d.toUpperCase(Locale.ENGLISH);
        if (lhxVar.f.size() == 0) {
            list = null;
        } else {
            List listUnmodifiableList = lhxVar.f;
            if (!z) {
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            }
            list = listUnmodifiableList;
        }
        return d(str, i3, z, upperCase, list, i3 == 2 ? upperCase : null, lczVar);
    }

    static Boolean g(double d, lhv lhvVar) {
        try {
            return e(new BigDecimal(d), lhvVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(long j, lhv lhvVar) {
        try {
            return e(new BigDecimal(j), lhvVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean i(String str, lhv lhvVar) {
        if (!lfx.F(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), lhvVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
