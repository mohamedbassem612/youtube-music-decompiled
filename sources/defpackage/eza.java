package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eza {
    private static final eyv a = new eyz(0);
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final axr d;

    public eza(axr axrVar) {
        this.d = axrVar;
    }

    private final void h(Class cls, Class cls2, eyw eywVar, boolean z) {
        this.b.add(z ? this.b.size() : 0, new hed(cls, cls2, eywVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eyw, java.lang.Object] */
    private final eyv i(hed hedVar) {
        return hedVar.a.b(this);
    }

    public final synchronized eyv a(Class cls, Class cls2) {
        eyv eyyVar;
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (hed hedVar : this.b) {
                Set set = this.c;
                if (set.contains(hedVar)) {
                    z = true;
                } else if (hedVar.e(cls, cls2)) {
                    set.add(hedVar);
                    arrayList.add(i(hedVar));
                    set.remove(hedVar);
                }
            }
            if (arrayList.size() > 1) {
                eyyVar = new eyy(arrayList, this.d);
            } else if (arrayList.size() == 1) {
                eyyVar = (eyv) arrayList.get(0);
            } else {
                if (!z) {
                    throw new esi(cls, cls2);
                }
                eyyVar = a;
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return eyyVar;
    }

    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (hed hedVar : this.b) {
                Set set = this.c;
                if (!set.contains(hedVar) && hedVar.d(cls)) {
                    set.add(hedVar);
                    arrayList.add(i(hedVar));
                    set.remove(hedVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (hed hedVar : this.b) {
            Object obj = hedVar.b;
            if (!arrayList.contains(obj) && hedVar.d(cls)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    final synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            hed hedVar = (hed) it.next();
            if (hedVar.e(cls, cls2)) {
                it.remove();
                arrayList.add(hedVar.a);
            }
        }
        return arrayList;
    }

    public final synchronized List e(Class cls, Class cls2, eyw eywVar) {
        List listD;
        listD = d(cls, cls2);
        f(cls, cls2, eywVar);
        return listD;
    }

    public final synchronized void f(Class cls, Class cls2, eyw eywVar) {
        h(cls, cls2, eywVar, true);
    }

    public final synchronized void g(Class cls, Class cls2, eyw eywVar) {
        h(cls, cls2, eywVar, false);
    }
}
