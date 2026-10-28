package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class agf implements Set, awrp {
    public final agu a;

    public agf(agu aguVar) {
        this.a = aguVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return a.aC();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        return a.aE();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        a.aw();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return agu.d(this.a, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!agu.d(this.a, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.c();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return awqx.c(new age(this, (awoq) null, 0));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return a.aC();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return a.aE();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return a.aE();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return awqw.b(this, objArr);
    }

    public final String toString() {
        return atqq.aD(this, null, "[", "]", null, 57);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return awqw.a(this);
    }
}
