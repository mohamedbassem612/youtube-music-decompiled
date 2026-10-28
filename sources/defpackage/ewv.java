package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewv {
    private final ewr a = new ewr();
    private final ewu b = new ewu();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final int e;
    private int f;

    public ewv(int i) {
        this.e = i;
    }

    private final ewl f(Class cls) {
        Map map = this.d;
        ewl ewpVar = (ewl) map.get(cls);
        if (ewpVar == null) {
            if (cls.equals(int[].class)) {
                ewpVar = new ews();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
                }
                ewpVar = new ewp();
            }
            map.put(cls, ewpVar);
        }
        return ewpVar;
    }

    private final Object g(ewt ewtVar, Class cls) {
        ewr ewrVar = this.a;
        ewl ewlVarF = f(cls);
        Object objA = ewrVar.a(ewtVar);
        if (objA == null) {
            return ewlVarF.c(ewtVar.a);
        }
        this.f -= ewlVarF.a(objA) * ewlVarF.b();
        i(ewlVarF.a(objA), cls);
        return objA;
    }

    private final NavigableMap h(Class cls) {
        Map map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer numValueOf = Integer.valueOf(i);
        Integer num = (Integer) navigableMapH.get(numValueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(numValueOf);
                return;
            } else {
                navigableMapH.put(numValueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            Object objB = this.a.b();
            if (objB == null) {
                throw new NullPointerException("Argument must not be null");
            }
            ewl ewlVarF = f(objB.getClass());
            this.f -= ewlVarF.a(objB) * ewlVarF.b();
            i(ewlVarF.a(objB), objB.getClass());
        }
    }

    public final synchronized Object a(int i, Class cls) {
        Integer num;
        int i2;
        num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        return g((num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > (i << 3))) ? this.b.d(i, cls) : this.b.d(num.intValue(), cls), cls);
    }

    public final synchronized void b() {
        j(0);
    }

    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        ewl ewlVarF = f(cls);
        int iA = ewlVarF.a(obj);
        int iB = ewlVarF.b() * iA;
        int i = this.e;
        if (iB <= (i >> 1)) {
            ewt ewtVarD = this.b.d(iA, cls);
            this.a.c(ewtVarD, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(ewtVarD.a));
            navigableMapH.put(Integer.valueOf(ewtVarD.a), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            this.f += iB;
            j(i);
        }
    }

    public final synchronized void d(int i) {
        try {
            if (i >= 40) {
                b();
                return;
            }
            if (i >= 20 || i == 15) {
                j(this.e >> 1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }
}
