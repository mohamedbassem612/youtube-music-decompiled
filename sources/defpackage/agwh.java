package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agwh {
    public static final Object a = new Object();
    public final Map b;
    public final List c;
    public int d;
    public int e;

    public agwh(Map map, List list) {
        this.b = map;
        this.c = list;
        ahno.I(true, "Not true that %s is non-negative.", 0);
        this.d = 0;
        ahno.I(true, "Not true that %s is non-negative.", 0);
        this.e = 0;
        ahno.O(map.size() >= 0 && map.size() >= 0);
    }

    public static boolean c(Object obj) {
        return obj == a || (obj instanceof agwg);
    }

    public static boolean d(Object obj) {
        return (obj == a || obj == null) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    public final Object a(Object obj) {
        Object obj2;
        obj.getClass();
        Map map = this.b;
        Object obj3 = map.get(obj);
        if (obj3 == null || obj3 == (obj2 = a)) {
            obj3 = null;
        } else if (obj3 instanceof agwg) {
            map.put(obj, obj2);
            obj3 = ((agwg) obj3).a;
        } else {
            map.remove(obj);
        }
        if (obj3 != null) {
            int i = this.e - 1;
            this.e = i;
            ahno.I((i ^ (-1)) >>> 31, "Not true that %s is non-negative.", i);
            List list = this.c;
            if (list != null) {
                list.remove(new agwe(obj));
            }
        }
        if (obj3 != null) {
            return obj3;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    public final void b(Object obj) {
        obj.getClass();
        Map map = this.b;
        Object obj2 = map.get(obj);
        if (obj2 == a) {
            map.remove(obj);
        } else if (!(obj2 instanceof agwg)) {
            return;
        } else {
            map.put(obj, ((agwg) obj2).a);
        }
        int i = this.d - 1;
        this.d = i;
        ahno.I((i ^ (-1)) >>> 31, "Not true that %s is non-negative.", i);
        List list = this.c;
        if (list != null) {
            list.remove(new agwd(obj));
        }
    }
}
