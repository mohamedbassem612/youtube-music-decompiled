package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class agm {
    public int a;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final ci i = new ci();
    public final dl b = new dl();

    public agm(int i) {
        this.a = i;
    }

    protected Object a(Object obj) {
        return null;
    }

    public final Object b(Object obj) {
        Object objD;
        obj.getClass();
        synchronized (this.b) {
            Object obj2 = ((LinkedHashMap) this.i.a).get(obj);
            if (obj2 != null) {
                this.g++;
                return obj2;
            }
            this.h++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.b) {
                this.e++;
                ci ciVar = this.i;
                objD = ciVar.d(obj, objA);
                if (objD != null) {
                    ciVar.d(obj, objD);
                } else {
                    this.c++;
                }
            }
            if (objD != null) {
                f(false, obj, objA, objD);
                return objD;
            }
            g(this.a);
            return objA;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object objD;
        obj.getClass();
        obj2.getClass();
        synchronized (this.b) {
            this.d++;
            this.c++;
            objD = this.i.d(obj, obj2);
            if (objD != null) {
                this.c--;
            }
        }
        if (objD != null) {
            f(false, obj, objD, obj2);
        }
        g(this.a);
        return objD;
    }

    public final Object d(Object obj) {
        Object objE;
        obj.getClass();
        synchronized (this.b) {
            objE = this.i.e(obj);
            if (objE != null) {
                this.c--;
            }
        }
        if (objE != null) {
            f(false, obj, objE, null);
        }
        return objE;
    }

    public final Map e() {
        LinkedHashMap linkedHashMap;
        synchronized (this.b) {
            ci ciVar = this.i;
            linkedHashMap = new LinkedHashMap(ciVar.f().size());
            for (Map.Entry entry : ciVar.f()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    protected void f(boolean z, Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final void g(int i) {
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.b) {
                if (this.c < 0 || (this.i.g() && this.c != 0)) {
                    dl.l("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.c <= i) {
                    break;
                }
                ci ciVar = this.i;
                if (ciVar.g() || (entry = (Map.Entry) atqq.Y(ciVar.f())) == null) {
                    break;
                }
                key = entry.getKey();
                value = entry.getValue();
                ciVar.e(key);
                int i2 = this.c;
                key.getClass();
                value.getClass();
                this.c = i2 - 1;
                this.f++;
            }
            f(true, key, value, null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            int i = this.g;
            int i2 = this.h;
            int i3 = i + i2;
            int i4 = i3 != 0 ? (i * 100) / i3 : 0;
            str = "LruCache[maxSize=" + this.a + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i4 + "%]";
        }
        return str;
    }
}
