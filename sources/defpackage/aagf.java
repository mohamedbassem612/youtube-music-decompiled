package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aagf implements aagb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aagf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aagb
    public final void a(aamq aamqVar, List list) {
        if (this.$cid == 0) {
            aagm aagmVarT = ((aagg) this.a).t(aamqVar.b);
            aagmVarT.getClass();
            synchronized (aagmVarT.b.k) {
                aagmVarT.a = list;
                aagmVarT.c = null;
            }
        }
    }

    @Override // defpackage.aagb
    public final void b(Collection collection, aoen aoenVar) {
        if (this.$cid != 0) {
            ((aaeu) this.a).b(collection, aoenVar);
        }
    }

    @Override // defpackage.aagb
    public final void c(aamq aamqVar, Collection collection, HashSet hashSet, aohx aohxVar, int i, byte[] bArr, aamg aamgVar, aamn aamnVar) {
        List list;
        if (this.$cid == 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((aamo) it.next()).d());
            }
            String str = aamqVar.b;
            aagg aaggVar = (aagg) this.a;
            aagm aagmVarT = aaggVar.t(str);
            if (aagmVarT == null) {
                list = null;
            } else {
                synchronized (aagmVarT.b.k) {
                    list = aagmVarT.a;
                }
            }
            aagn aagnVarA = aaggVar.a();
            synchronized (aagnVarA.k) {
                typ.f(str);
                aagnVarA.d.remove(str);
                Set set = (Set) aagnVarA.i.remove(str);
                if (set != null) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        tym.X(aagnVarA.h, (String) it2.next(), str);
                    }
                }
            }
            aagg aaggVar2 = (aagg) this.a;
            aaggVar2.j(aamqVar, arrayList, list, aaggVar2.j.c(str));
            Iterator it3 = collection.iterator();
            while (it3.hasNext()) {
                aamo aamoVar = (aamo) it3.next();
                String strD = aamoVar.d();
                if (hashSet.contains(strD)) {
                    aaggVar2.w(aamoVar, aohxVar, i, bArr, aamgVar, aamnVar, aaggVar2.k.J(strD));
                }
                aaggVar2.a().e(str, strD);
            }
        }
    }
}
