package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkz {
    public Map a;
    public Map b;
    public Map c;
    public Map d;
    public Map e;
    public HashSet f;
    public final ayq g;

    public fkz(fkz fkzVar) {
        if (fkzVar == null) {
            this.g = new ayq((char[]) null);
            return;
        }
        synchronized (this) {
            this.g = fkzVar.g;
            Map mapD = fkzVar.d();
            Map mapB = fkzVar.b();
            Map mapA = fkzVar.a();
            if ((mapD != null && !mapD.isEmpty()) || (mapA != null && !mapA.isEmpty())) {
                r();
                synchronized (this) {
                    if (mapD != null) {
                        try {
                            for (String str : mapD.keySet()) {
                                this.a.put(str, p((List) mapD.get(str)));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (mapB != null && !mapB.isEmpty()) {
                        q();
                        for (Map.Entry entry : mapB.entrySet()) {
                            this.b.put((String) entry.getKey(), p((List) entry.getValue()));
                        }
                    }
                    if (mapA != null) {
                        for (Map.Entry entry2 : mapA.entrySet()) {
                            this.d.put((String) entry2.getKey(), p((List) entry2.getValue()));
                        }
                    }
                }
            }
            h(fkzVar.e());
            i(fkzVar.c());
        }
    }

    private static List p(List list) {
        ArrayList arrayList = new ArrayList(list == null ? 4 : list.size());
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    private final synchronized void q() {
        if (this.b == null) {
            this.b = new HashMap(4);
        }
    }

    private final synchronized void r() {
        if (this.a == null) {
            this.a = new HashMap(4);
        }
        if (this.d == null) {
            this.d = new HashMap(4);
        }
    }

    private static void s(String str, aero aeroVar, Map map) {
        List listP = (List) map.get(str);
        if (listP == null) {
            listP = p(null);
            map.put(str, listP);
        }
        listP.add(aeroVar);
    }

    public final synchronized Map a() {
        return this.d;
    }

    final synchronized Map b() {
        return this.b;
    }

    public final synchronized Map c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.a;
    }

    public final synchronized Map e() {
        l();
        return this.e;
    }

    final synchronized Set f() {
        HashSet hashSet;
        hashSet = new HashSet();
        Map map = this.d;
        if (map != null) {
            hashSet.addAll(map.keySet());
        }
        Map map2 = this.a;
        if (map2 != null) {
            hashSet.addAll(map2.keySet());
        }
        return hashSet;
    }

    public final synchronized void g(String str, fky fkyVar) {
        l();
        j();
        this.f.add(str);
        this.e.put(str, fkyVar);
    }

    public final void h(Map map) {
        if (map != null) {
            synchronized (this) {
                l();
                this.e.clear();
                this.e.putAll(map);
            }
        }
    }

    public final void i(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        synchronized (this) {
            k();
            this.c.putAll(map);
        }
    }

    public final synchronized void j() {
        if (this.f == null) {
            this.f = new HashSet();
        }
    }

    public final synchronized void k() {
        if (this.c == null) {
            this.c = new HashMap();
        }
    }

    public final synchronized void l() {
        if (this.e == null) {
            this.e = new HashMap(4);
        }
    }

    public final synchronized boolean m() {
        Map map = this.a;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final void n(String str) {
        l();
        j();
        this.f.add(str);
    }

    public final synchronized void o(String str, aero aeroVar, boolean z) {
        r();
        s(str, aeroVar, this.a);
        if (z) {
            q();
            s(str, aeroVar, this.b);
        }
    }
}
