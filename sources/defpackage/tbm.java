package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class tbm extends AbstractList implements tbk {
    public final List e;
    public final vwt f;

    public tbm() {
        this(new ArrayList(), new vwt((char[]) null, (byte[]) null));
    }

    @Override // java.util.AbstractList, java.util.List, defpackage.tbk
    public void add(int i, Object obj) {
        this.e.add(i, obj);
        this.f.I(i);
    }

    @Override // java.util.AbstractList, java.util.List, defpackage.tbk
    public boolean addAll(int i, Collection collection) {
        collection.getClass();
        boolean zAddAll = this.e.addAll(i, collection);
        if (zAddAll) {
            this.f.K(i, collection.size());
        }
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, defpackage.tbk
    public void clear() {
        List list = this.e;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        list.clear();
        this.f.L(0, size);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, defpackage.tbk
    public final boolean contains(Object obj) {
        return this.e.indexOf(obj) >= 0;
    }

    @Override // java.util.AbstractList, java.util.List, defpackage.tbk
    public final Object get(int i) {
        return this.e.get(i);
    }

    @Override // defpackage.tbk
    public final void hK(tbj tbjVar) {
        this.f.M(tbjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, defpackage.tbk
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    public void j(int i, int i2) {
        nsj.o(i, size() - 1);
        nsj.o(i2, size() - 1);
        if (i2 != i) {
            List list = this.e;
            list.add(i2, list.remove(i));
            Iterator it = ((HashSet) this.f.a).iterator();
            while (it.hasNext()) {
                ((tbj) it.next()).k(i, i2);
            }
        }
    }

    public void n(tbj tbjVar) {
        this.f.N(tbjVar);
    }

    @Override // java.util.AbstractList, java.util.List, defpackage.tbk
    public Object remove(int i) {
        vwt vwtVar = this.f;
        Object objRemove = this.e.remove(i);
        vwtVar.L(i, 1);
        return objRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        vwt vwtVar = this.f;
        Object obj2 = this.e.set(i, obj);
        vwtVar.J(i, 1);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, defpackage.tbk
    public final int size() {
        return this.e.size();
    }

    @Override // java.util.AbstractList, java.util.List, defpackage.tbk
    public final List subList(int i, int i2) {
        return this.e.subList(i, i2);
    }

    protected tbm(List list, vwt vwtVar) {
        this.e = list;
        this.f = vwtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
