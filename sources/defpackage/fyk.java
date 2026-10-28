package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyk {
    private static final agkz d = agkz.r("_syn", "_err", "_el");
    public String a;
    public final long b;
    public final Map c;

    public fyk(String str, long j, Map map) {
        this.a = str;
        this.b = j;
        HashMap map2 = new HashMap();
        this.c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fyk clone() {
        return new fyk(this.a, this.b, new HashMap(this.c));
    }

    public final Object b(String str) {
        Map map = this.c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fyk) {
            fyk fykVar = (fyk) obj;
            if (this.b == fykVar.b && this.a.equals(fykVar.a)) {
                return this.c.equals(fykVar.c);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.a + "', timestamp=" + this.b + ", params=" + this.c.toString() + '}';
    }
}
