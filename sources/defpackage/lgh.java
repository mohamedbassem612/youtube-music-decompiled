package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgh {
    public static final lgh a = new lgh(100);
    public static final agkz b;
    public final EnumMap c;
    public final int d;

    static {
        agkx agkxVar = new agkx();
        for (lgg lggVar : lgg.values()) {
            agkxVar.c(lggVar.e);
        }
        b = agkxVar.g();
    }

    public lgh(int i) {
        EnumMap enumMap = new EnumMap(lgg.class);
        this.c = enumMap;
        lgg lggVar = lgg.AD_STORAGE;
        lge lgeVar = lge.UNINITIALIZED;
        enumMap.put(lggVar, lgeVar);
        enumMap.put(lgg.ANALYTICS_STORAGE, lgeVar);
        this.d = i;
    }

    public static char a(lge lgeVar) {
        if (lgeVar != null) {
            int iOrdinal = lgeVar.ordinal();
            if (iOrdinal == 1) {
                return '+';
            }
            if (iOrdinal == 2) {
                return '0';
            }
            if (iOrdinal == 3) {
                return '1';
            }
        }
        return '-';
    }

    static lge b(String str) {
        if (str == null) {
            return lge.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return lge.GRANTED;
        }
        return str.equals("denied") ? lge.DENIED : lge.UNINITIALIZED;
    }

    public static lge e(char c) {
        if (c == '+') {
            return lge.POLICY;
        }
        if (c != '0') {
            return c != '1' ? lge.UNINITIALIZED : lge.GRANTED;
        }
        return lge.DENIED;
    }

    public static lgh f(Bundle bundle, int i) {
        if (bundle == null) {
            return new lgh(i);
        }
        EnumMap enumMap = new EnumMap(lgg.class);
        for (lgg lggVar : lgf.STORAGE.c) {
            enumMap.put(lggVar, b(bundle.getString(lggVar.e)));
        }
        return new lgh(enumMap, i);
    }

    public static lgh g(String str, int i) {
        EnumMap enumMap = new EnumMap(lgg.class);
        lgg[] lggVarArr = lgf.STORAGE.c;
        for (int i2 = 0; i2 < lggVarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            lgg lggVar = lggVarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(lggVar, e(str2.charAt(i3)));
            } else {
                enumMap.put(lggVar, lge.UNINITIALIZED);
            }
        }
        return new lgh(enumMap, i);
    }

    static String i(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static String j(lge lgeVar) {
        int iOrdinal = lgeVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public static boolean p(int i, int i2) {
        int i3 = -30;
        if (i != -20) {
            if (i == -30) {
                i3 = i;
            } else if (i2 != -20) {
            }
            if (i3 == i2 && i >= i2) {
                return false;
            }
        } else if (i2 != -30) {
            i = -20;
            if (i == -30) {
                i3 = i;
            } else if (i2 != -20) {
            }
            if (i3 == i2) {
            }
        }
        return true;
    }

    public final lge c() {
        lge lgeVar = (lge) this.c.get(lgg.AD_STORAGE);
        return lgeVar == null ? lge.UNINITIALIZED : lgeVar;
    }

    public final lge d() {
        lge lgeVar = (lge) this.c.get(lgg.ANALYTICS_STORAGE);
        return lgeVar == null ? lge.UNINITIALIZED : lgeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lgh)) {
            return false;
        }
        lgh lghVar = (lgh) obj;
        for (lgg lggVar : lgf.STORAGE.c) {
            if (this.c.get(lggVar) != lghVar.c.get(lggVar)) {
                return false;
            }
        }
        return this.d == lghVar.d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public final lgh h(lgh lghVar) {
        EnumMap enumMap = new EnumMap(lgg.class);
        for (lgg lggVar : lgf.STORAGE.c) {
            lge lgeVar = (lge) this.c.get(lggVar);
            lge lgeVar2 = (lge) lghVar.c.get(lggVar);
            if (lgeVar == null) {
                lgeVar = lgeVar2;
            } else if (lgeVar2 != null) {
                lge lgeVar3 = lge.UNINITIALIZED;
                if (lgeVar == lgeVar3) {
                    lgeVar = lgeVar2;
                } else if (lgeVar2 != lgeVar3) {
                    lge lgeVar4 = lge.POLICY;
                    if (lgeVar == lgeVar4) {
                        lgeVar = lgeVar2;
                    } else if (lgeVar2 != lgeVar4) {
                        lge lgeVar5 = lge.DENIED;
                        lgeVar = (lgeVar == lgeVar5 || lgeVar2 == lgeVar5) ? lgeVar5 : lge.GRANTED;
                    }
                }
            }
            if (lgeVar != null) {
                enumMap.put(lggVar, lgeVar);
            }
        }
        return new lgh(enumMap, 100);
    }

    public final int hashCode() {
        Iterator it = this.c.values().iterator();
        int iHashCode = this.d * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((lge) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String k() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (lgg lggVar : lgf.STORAGE.c) {
            lge lgeVar = (lge) this.c.get(lggVar);
            char c = '-';
            if (lgeVar != null && (iOrdinal = lgeVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c = '1';
                } else if (iOrdinal == 2) {
                    c = '0';
                } else if (iOrdinal == 3) {
                    c = '1';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final String l() {
        StringBuilder sb = new StringBuilder("G1");
        for (lgg lggVar : lgf.STORAGE.c) {
            sb.append(a((lge) this.c.get(lggVar)));
        }
        return sb.toString();
    }

    public final boolean m() {
        return n(lgg.AD_STORAGE);
    }

    public final boolean n(lgg lggVar) {
        return ((lge) this.c.get(lggVar)) != lge.DENIED;
    }

    public final boolean o() {
        return n(lgg.ANALYTICS_STORAGE);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(i(this.d));
        for (lgg lggVar : lgf.STORAGE.c) {
            sb.append(',');
            sb.append(lggVar.e);
            sb.append('=');
            lge lgeVar = (lge) this.c.get(lggVar);
            if (lgeVar == null) {
                lgeVar = lge.UNINITIALIZED;
            }
            sb.append(lgeVar);
        }
        return sb.toString();
    }

    public lgh(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(lgg.class);
        this.c = enumMap2;
        enumMap2.putAll(enumMap);
        this.d = i;
    }
}
