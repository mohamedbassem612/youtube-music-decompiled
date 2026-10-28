package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aft implements Collection {
    final /* synthetic */ afv a;

    public aft(afv afvVar) {
        this.a = afvVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.b(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new afu(this.a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        afv afvVar = this.a;
        int iB = afvVar.b(obj);
        if (iB < 0) {
            return false;
        }
        afvVar.e(iB);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        afv afvVar = this.a;
        int i = afvVar.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(afvVar.g(i2))) {
                afvVar.e(i2);
                i--;
                i2--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        afv afvVar = this.a;
        int i = afvVar.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(afvVar.g(i2))) {
                afvVar.e(i2);
                i--;
                i2--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.d;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = this.a.g(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        afv afvVar = this.a;
        int i = afvVar.d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = afvVar.g(i2);
        }
        return objArr;
    }
}
