package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tm {
    private afv a = new afv();
    private afx b = new afx(0);
    private afv c = new afv();
    private afv d = new afv();
    private afv e = new afv();
    private afv f = new afv();
    private afv g = new afv();
    private afv h = new afv();
    private boolean i = false;
    private boolean j = false;

    private final void d() {
        if (this.j) {
            afv afvVar = new afv(this.c.d);
            for (Map.Entry entry : this.c.entrySet()) {
                afvVar.put((String) entry.getKey(), new afx((Collection) entry.getValue()));
            }
            this.c = afvVar;
            this.e = new afv(this.e);
            this.d = tn.a(this.d);
            afv afvVar2 = new afv(this.f.d);
            for (Map.Entry entry2 : this.f.entrySet()) {
                afvVar2.put((String) entry2.getKey(), new afx((Collection) entry2.getValue()));
            }
            this.f = afvVar2;
            this.a = new afv(this.a);
            this.b = new afx(this.b);
            afv afvVar3 = new afv(this.g.d);
            for (Map.Entry entry3 : this.g.entrySet()) {
                afvVar3.put((String) entry3.getKey(), new afx((Collection) entry3.getValue()));
            }
            this.g = afvVar3;
            this.h = new afv(this.h);
            this.j = false;
        }
    }

    public final tn a() {
        afx afxVar = new afx(this.b);
        afxVar.addAll(this.c.keySet());
        afxVar.addAll(this.d.keySet());
        afxVar.addAll(this.e.keySet());
        afxVar.addAll(this.f.keySet());
        afxVar.addAll(this.g.keySet());
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            afxVar.remove((String) it.next());
        }
        if (!afxVar.isEmpty()) {
            throw new IllegalArgumentException(a.bV(afxVar, "Schema types ", " referenced, but were not added."));
        }
        this.a.isEmpty();
        afv afvVar = this.a;
        for (Map.Entry entry : this.g.entrySet()) {
            sl slVar = (sl) afvVar.get(entry.getKey());
            for (String str : (Set) entry.getValue()) {
                if (!vm.j(afvVar, slVar, new tb(str), 0)) {
                    throw new IllegalArgumentException(a.bT(str, "The property path of: ", " is not the required property type: builtin:Account"));
                }
            }
        }
        this.j = true;
        return new tn(new afx(this.a.values()), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final void b(boolean z) {
        d();
        this.i = z;
    }

    public final void c(Collection collection) {
        d();
        sn snVarB = sn.b();
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        for (int i = 0; i < arrayList.size(); i++) {
            for (Class cls : snVarB.a((Class) arrayList.get(i)).c()) {
                if (!arrayList.contains(cls)) {
                    arrayList.add(cls);
                }
            }
        }
        ArrayList<sl> arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(snVarB.a((Class) arrayList.get(i2)).a());
        }
        d();
        for (sl slVar : arrayList2) {
            this.a.put(slVar.a, slVar);
        }
    }
}
