package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fly {
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());

    public static fly a(fly flyVar) {
        fly flyVar2 = new fly();
        if (flyVar != null) {
            Map map = flyVar.a;
            synchronized (map) {
                flyVar2.a.putAll(map);
            }
        }
        return flyVar2;
    }

    public static fly b(fly flyVar) {
        if (flyVar == null) {
            return null;
        }
        return a(flyVar);
    }

    public final Object c(Class cls) {
        return this.a.get(cls);
    }

    public final void d(Class cls, Object obj) {
        this.a.put(cls, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((fly) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
