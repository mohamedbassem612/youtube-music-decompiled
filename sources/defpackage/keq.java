package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class keq extends ket {
    final /* synthetic */ ker a;

    public keq(ker kerVar) {
        this.a = kerVar;
    }

    @Override // defpackage.ket
    public final void b() {
        ker kerVar = this.a;
        long jA = kerVar.a();
        if (jA != kerVar.b) {
            kerVar.b = jA;
            kerVar.b();
            if (kerVar.b != 0) {
                kerVar.f();
            }
        }
    }

    @Override // defpackage.ket
    public final void c(int[] iArr) {
        ker kerVar = this.a;
        List listD = khe.d(iArr);
        if (kerVar.c.equals(listD)) {
            return;
        }
        ker.g(kerVar);
        kerVar.e.evictAll();
        kerVar.f.clear();
        kerVar.c = listD;
        kerVar.e();
        ker.g(kerVar);
        ker.g(kerVar);
    }

    @Override // defpackage.ket
    public final void d(int[] iArr, int i) {
        int size;
        ker kerVar = this.a;
        if (i == 0) {
            size = kerVar.c.size();
        } else {
            size = kerVar.d.get(i, -1);
            if (size == -1) {
                this.a.f();
                return;
            }
        }
        ker kerVar2 = this.a;
        ker.g(kerVar2);
        kerVar2.c.addAll(size, khe.d(iArr));
        kerVar2.e();
        Set set = kerVar2.l;
        synchronized (set) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        ker.g(this.a);
    }

    @Override // defpackage.ket
    public final void e(kav[] kavVarArr) {
        HashSet hashSet = new HashSet();
        ker kerVar = this.a;
        List list = kerVar.f;
        list.clear();
        for (kav kavVar : kavVarArr) {
            int i = kavVar.b;
            kerVar.e.put(Integer.valueOf(i), kavVar);
            int i2 = kerVar.d.get(i, -1);
            if (i2 == -1) {
                kerVar.f();
                return;
            }
            hashSet.add(Integer.valueOf(i2));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i3 = kerVar.d.get(((Integer) it.next()).intValue(), -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        list.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        ker.g(kerVar);
        khe.h(arrayList);
        ker.g(kerVar);
        ker.g(kerVar);
    }

    @Override // defpackage.ket
    public final void f(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            ker kerVar = this.a;
            kerVar.e.remove(Integer.valueOf(i));
            SparseIntArray sparseIntArray = kerVar.d;
            int i2 = sparseIntArray.get(i, -1);
            if (i2 == -1) {
                kerVar.f();
                return;
            } else {
                sparseIntArray.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        ker kerVar2 = this.a;
        ker.g(kerVar2);
        kerVar2.c.removeAll(khe.d(iArr));
        kerVar2.e();
        khe.h(arrayList);
        Set set = kerVar2.l;
        synchronized (set) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        ker.g(this.a);
    }

    @Override // defpackage.ket
    public final void g(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            this.a.c.size();
        } else {
            boolean zIsEmpty = list2.isEmpty();
            ker kerVar = this.a;
            if (zIsEmpty) {
                kerVar.a.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
            } else {
                SparseIntArray sparseIntArray = kerVar.d;
                if (sparseIntArray.get(i, -1) == -1) {
                    sparseIntArray.get(((Integer) list2.get(0)).intValue(), -1);
                }
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            ker kerVar2 = this.a;
            int i2 = kerVar2.d.get(iIntValue, -1);
            if (i2 == -1) {
                kerVar2.f();
                return;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        ker kerVar3 = this.a;
        ker.g(kerVar3);
        kerVar3.c = list;
        kerVar3.e();
        Set set = kerVar3.l;
        synchronized (set) {
            Iterator it2 = set.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        ker.g(this.a);
    }

    @Override // defpackage.ket
    public final void h(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            ker kerVar = this.a;
            kerVar.e.remove(Integer.valueOf(i));
            int i2 = kerVar.d.get(i, -1);
            if (i2 == -1) {
                kerVar.f();
                return;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        Collections.sort(arrayList);
        ker kerVar2 = this.a;
        ker.g(kerVar2);
        khe.h(arrayList);
        ker.g(kerVar2);
        ker.g(kerVar2);
    }

    @Override // defpackage.ket
    public final void i() {
        this.a.f();
    }
}
