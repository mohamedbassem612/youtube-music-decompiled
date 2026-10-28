package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyp {
    public static final dyp a = new dov((byte[]) null).g();
    public final Map b;

    public dyp(dyp dypVar) {
        dypVar.getClass();
        this.b = new HashMap(dypVar.b);
    }

    public final String a(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean b(String str, Class cls) {
        Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public final byte[] c(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof Object[]) {
            try {
                int length = ((Object[]) obj).length;
                tio tioVar = new tio(obj, 1);
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = ((Number) tioVar.invoke(Integer.valueOf(i))).byteValue();
                }
                return bArr;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    public final boolean equals(Object obj) {
        boolean zC;
        if (this == obj) {
            return true;
        }
        if (obj != null && awrc.c(getClass(), obj.getClass())) {
            Map map = this.b;
            Map map2 = ((dyp) obj).b;
            Set<String> setKeySet = map.keySet();
            if (awrc.c(setKeySet, map2.keySet())) {
                for (String str : setKeySet) {
                    Object obj2 = map.get(str);
                    Object obj3 = map2.get(str);
                    if (obj2 == null || obj3 == null) {
                        zC = obj2 == obj3;
                    } else if (obj2 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj2;
                        if (obj3 instanceof Object[]) {
                            zC = atqq.aK(objArr, (Object[]) obj3);
                        } else {
                            zC = awrc.c(obj2, obj3);
                        }
                    } else {
                        zC = awrc.c(obj2, obj3);
                    }
                    if (!zC) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return "Data {" + atqq.aD(this.b.entrySet(), null, null, null, new akl(16), 31) + '}';
    }

    public dyp(Map map) {
        this.b = new HashMap(map);
    }
}
