package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class crw {
    public final csf a;
    public agke b;
    public boolean c;
    public final cii d;
    public final Set e = new HashSet();
    public cio f;
    public Map g;
    public Map h;
    public agke i;
    public final qcb j;

    public crw(byd bydVar, qcb qcbVar, bzg bzgVar, cio cioVar) {
        this.a = new csf(bydVar);
        this.j = qcbVar;
        this.d = new cii(bzgVar);
        this.f = cioVar;
        this.g = c(cioVar);
        this.h = b(cioVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public static Map b(cio cioVar) {
        HashMap map = new HashMap();
        for (int i = 0; i < cioVar.a(); i++) {
            Iterator it = cioVar.d(i).f.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((cij) it.next()).c.iterator();
                while (it2.hasNext()) {
                    agke agkeVar = ((ciy) it2.next()).d;
                    int size = agkeVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        cim cimVar = (cim) agkeVar.get(i2);
                        String str = cimVar.b;
                        Set hashSet = (Set) map.get(str);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(str, hashSet);
                        }
                        hashSet.add(cimVar);
                    }
                }
            }
        }
        return map;
    }

    public static Map c(cio cioVar) {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            agke agkeVar = cioVar.l;
            if (i >= agkeVar.size()) {
                return map;
            }
            cis cisVar = (cis) agkeVar.get(i);
            String str = cisVar.b;
            Set hashSet = (Set) map.get(str);
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(str, hashSet);
            }
            hashSet.add(cisVar);
            i++;
        }
    }

    public final void a() {
        csf csfVar = this.a;
        crp crpVar = csfVar.e;
        if (crpVar != null) {
            crpVar.e(null);
            csfVar.e = null;
        }
        bvq bvqVar = csfVar.d;
        if (bvqVar != null) {
            bvqVar.f();
            csfVar.d = null;
        }
        csfVar.h = null;
        csfVar.c = null;
        csfVar.g = null;
        csfVar.f = false;
        this.c = false;
        this.b = null;
        this.f = null;
        this.j.H(null);
        this.i = null;
        this.g.clear();
        this.h.clear();
        this.e.clear();
        cii ciiVar = this.d;
        ciiVar.b = true;
        ciiVar.a.clear();
    }

    public final void d(chp chpVar) {
        this.e.add(chpVar);
    }

    public final void e(chp chpVar) {
        this.e.remove(chpVar);
    }

    public final boolean f(String str) {
        return this.g.containsKey(str) || this.h.containsKey(str);
    }
}
