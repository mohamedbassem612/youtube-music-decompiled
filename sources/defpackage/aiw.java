package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aiw implements List, awrq {
    private final aiz a;

    public aiw(aiz aizVar) {
        this.a = aizVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        aiz aizVar = this.a;
        int i2 = aizVar.b + 1;
        if (aizVar.a.length < i2) {
            aizVar.e(i2);
        }
        Object[] objArr = aizVar.a;
        int i3 = aizVar.b;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        aizVar.b++;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        aiz aizVar = this.a;
        return aizVar.f(aizVar.b, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        aiz aizVar = this.a;
        Object[] objArr = aizVar.a;
        int i = aizVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        aizVar.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.g(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.g(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aja.a(this, i);
        return this.a.a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.b == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new aiy(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        aiz aizVar = this.a;
        Object[] objArr = aizVar.a;
        for (int i = aizVar.b - 1; i >= 0; i--) {
            if (awrc.c(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new aiy(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        aja.a(this, i);
        return this.a.b(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (!collection.isEmpty()) {
            aiz aizVar = this.a;
            int i = aizVar.b;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                aizVar.h(it.next());
            }
            if (i != aizVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        aiz aizVar = this.a;
        int i = aizVar.b;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(aizVar.a[i2])) {
                aizVar.b(i2);
            }
        }
        return i != aizVar.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        aja.a(this, i);
        return this.a.c(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        aja.b(this, i, i2);
        return new aix(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return awqw.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return awqw.b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new aiy(this, i);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.f(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.i(obj);
        return true;
    }
}
