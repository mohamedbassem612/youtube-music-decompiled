package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaqv implements aaqu {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    private final synchronized int h(aamh aamhVar, Collection collection) {
        int iD;
        iD = aamhVar.d;
        if (collection != null) {
            iD -= collection.size();
        }
        aaqw aaqwVarA = a(aamhVar.a);
        if (aaqwVarA != null) {
            iD -= aaqwVarA.d();
        }
        return iD;
    }

    @Override // defpackage.aaqu
    public final synchronized aaqw a(String str) {
        typ.f(str);
        return (aaqw) this.a.get(str);
    }

    @Override // defpackage.aaqu
    public final synchronized aaqw b(aamh aamhVar, Collection collection) {
        aaqw aaqwVar;
        HashSet hashSet;
        aamhVar.getClass();
        aaqwVar = new aaqw(this, aamhVar);
        Object obj = aaqwVar.d;
        int iH = h(aamhVar, collection);
        synchronized (obj) {
            try {
                aaqwVar.i = iH;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (aaqwVar.d) {
            aaqwVar.l = false;
            aaqwVar.k = 0;
        }
        synchronized (aaqwVar.d) {
            aaqwVar.f = 0;
            aaqwVar.g = 0;
            aaqwVar.h = 0;
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                aaqwVar.b((String) it.next());
            }
        }
        String str = aamhVar.a;
        aaqw aaqwVarA = a(str);
        if (aaqwVarA != null) {
            synchronized (aaqwVarA.d) {
                try {
                    hashSet = aaqwVarA.c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                aaqwVar.b((String) it2.next());
            }
        }
        this.a.put(str, aaqwVar);
        return aaqwVar;
    }

    @Override // defpackage.aaqu
    public final synchronized List c(String str) {
        ArrayList arrayList;
        typ.f(str);
        arrayList = new ArrayList();
        Set set = (Set) this.b.get(str);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                aaqw aaqwVarA = a((String) it.next());
                if (aaqwVarA != null) {
                    arrayList.add(aaqwVarA);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.aaqu
    public final Map d() {
        return this.a;
    }

    @Override // defpackage.aaqu
    public final synchronized void e(String str, String str2) {
        Map map = this.b;
        Set hashSet = (Set) map.get(str);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(str, hashSet);
        }
        hashSet.add(str2);
    }

    @Override // defpackage.aaqu
    public final synchronized void f(String str) {
        typ.f(str);
        this.a.remove(str);
    }

    @Override // defpackage.aaqu
    public final synchronized void g(String str, String str2) {
        Map map = this.b;
        Set set = (Set) map.get(str);
        if (set != null) {
            set.remove(str2);
            if (set.isEmpty()) {
                map.remove(str);
            }
        }
    }
}
