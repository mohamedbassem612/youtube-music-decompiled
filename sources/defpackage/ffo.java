package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ffo {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    public ffo(long j) {
        this.b = j;
        this.c = j;
    }

    private final void b() {
        j(this.c);
    }

    protected int a(Object obj) {
        return 1;
    }

    public final synchronized void e(float f) {
        try {
            if (f < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            this.c = Math.round(this.b * f);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long f() {
        return this.c;
    }

    public final synchronized Object g(Object obj) {
        aero aeroVar = (aero) this.a.get(obj);
        if (aeroVar == null) {
            return null;
        }
        return aeroVar.b;
    }

    public final synchronized Object h(Object obj, Object obj2) {
        Object obj3;
        int iA = a(obj2);
        long j = iA;
        obj3 = null;
        if (j >= this.c) {
            c(obj, obj2);
        } else {
            if (obj2 != null) {
                this.d += j;
            }
            aero aeroVar = (aero) this.a.put(obj, obj2 == null ? null : new aero(obj2, iA));
            if (aeroVar != null) {
                this.d -= (long) aeroVar.a;
                Object obj4 = aeroVar.b;
                if (!obj4.equals(obj2)) {
                    c(obj, obj4);
                }
            }
            b();
            obj3 = aeroVar != null ? aeroVar.b : null;
        }
        return obj3;
    }

    public final synchronized Object i(Object obj) {
        aero aeroVar = (aero) this.a.remove(obj);
        if (aeroVar == null) {
            return null;
        }
        this.d -= (long) aeroVar.a;
        return aeroVar.b;
    }

    public final synchronized void j(long j) {
        while (this.d > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            aero aeroVar = (aero) entry.getValue();
            this.d -= (long) aeroVar.a;
            Object key = entry.getKey();
            it.remove();
            c(key, aeroVar.b);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}
