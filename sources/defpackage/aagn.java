package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aagn {
    private static final Object n = new Object();
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final HashMap f;
    public final HashMap g;
    public final HashMap h;
    public final HashMap i;
    public final mbc j;
    public final Object k = new Object();
    public final boolean l;
    public final tbo m;

    public aagn(mbc mbcVar, aauk aaukVar) {
        this.j = mbcVar;
        this.l = aaukVar.A();
        aaukVar.M();
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.m = new tbo(new asx(7));
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
    }

    public final Collection a() {
        Collection collectionValues;
        synchronized (this.k) {
            collectionValues = this.b.values();
        }
        return collectionValues;
    }

    public final Set b(String str) {
        Set setV;
        synchronized (this.k) {
            setV = tym.V(this.f, str);
        }
        return setV;
    }

    public final void c(String str) {
        synchronized (this.k) {
            typ.f(str);
            this.e.put(str, n);
            aagl aaglVar = (aagl) this.b.get(str);
            if (aaglVar != null) {
                aaglVar.g();
                this.m.a(Long.valueOf(aaglVar.c), aaglVar);
            }
        }
    }

    public final void d(String str, String str2) {
        synchronized (this.k) {
            tym.W(this.g, str, str2);
            tym.W(this.f, str2, str);
            h(str2);
        }
    }

    public final void e(String str, String str2) {
        synchronized (this.k) {
            tym.W(this.i, str, str2);
            tym.W(this.h, str2, str);
        }
    }

    public final void f(aamh aamhVar, List list, aohx aohxVar, int i, long j, long j2, aogf aogfVar) {
        synchronized (this.k) {
            aamhVar.getClass();
            this.c.put(aamhVar.a, new aagj(this, aamhVar, list, aohxVar, i, j, j2, aogfVar));
        }
    }

    public final void g(aamq aamqVar, List list, List list2, aogf aogfVar) {
        synchronized (this.k) {
            aamqVar.getClass();
            this.d.put(aamqVar.b, new aagm(this, aamqVar, list, list2, aogfVar));
        }
    }

    public final void h(String str) {
        synchronized (this.k) {
            try {
                Iterator it = b(str).iterator();
                while (it.hasNext()) {
                    aagj aagjVarL = l((String) it.next());
                    if (aagjVarL != null) {
                        synchronized (aagjVarL.c.k) {
                            try {
                                aagjVarL.c();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(String str) {
        synchronized (this.k) {
            typ.f(str);
            this.e.remove(str);
            aagl aaglVar = (aagl) this.b.get(str);
            if (aaglVar != null) {
                aaglVar.g();
                this.m.b(aaglVar);
            }
        }
    }

    public final void j(aaml aamlVar) {
        Object obj = this.k;
        String strG = aamlVar.g();
        synchronized (obj) {
            aagk aagkVar = (aagk) this.a.get(strG);
            if (aagkVar != null) {
                aagkVar.g(aamlVar);
            }
        }
    }

    public final boolean k(String str) {
        boolean zContainsKey;
        synchronized (this.k) {
            typ.f(str);
            zContainsKey = this.e.containsKey(str);
        }
        return zContainsKey;
    }

    public final aagj l(String str) {
        aagj aagjVar;
        synchronized (this.k) {
            typ.f(str);
            aagjVar = (aagj) this.c.get(str);
        }
        return aagjVar;
    }

    public final aagk m(String str) {
        aagk aagkVar;
        synchronized (this.k) {
            typ.f(str);
            aagkVar = (aagk) this.a.get(str);
        }
        return aagkVar;
    }

    public final aagl n(String str) {
        aagl aaglVar;
        if (this.l) {
            typ.f(str);
            return (aagl) this.b.get(str);
        }
        synchronized (this.k) {
            typ.f(str);
            aaglVar = (aagl) this.b.get(str);
        }
        return aaglVar;
    }

    public final aagl o(aamo aamoVar, aohx aohxVar, int i, byte[] bArr, aamg aamgVar, aamn aamnVar, long j) {
        aamoVar.getClass();
        aagl aaglVar = new aagl(this, aamoVar, aohxVar, i, bArr, aamgVar, aamnVar, j);
        synchronized (this.k) {
            this.b.put(aamoVar.d(), aaglVar);
        }
        return aaglVar;
    }
}
