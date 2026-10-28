package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class aggt extends AbstractCollection {
    final Object a;
    Collection b;
    final aggt c;
    final Collection d;
    final /* synthetic */ aggz e;

    public aggt(aggz aggzVar, Object obj, Collection collection, aggt aggtVar) {
        this.e = aggzVar;
        this.a = obj;
        this.b = collection;
        this.c = aggtVar;
        this.d = aggtVar == null ? null : aggtVar.b;
    }

    final void a() {
        aggt aggtVar = this.c;
        if (aggtVar != null) {
            aggtVar.a();
            return;
        }
        aggz aggzVar = this.e;
        aggzVar.a.put(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        boolean zAdd = this.b.add(obj);
        if (!zAdd) {
            return zAdd;
        }
        this.e.b++;
        if (!zIsEmpty) {
            return zAdd;
        }
        a();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.b.addAll(collection);
        if (zAddAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    final void b() {
        aggt aggtVar = this.c;
        if (aggtVar != null) {
            aggtVar.b();
            if (aggtVar.b != this.d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.b.isEmpty()) {
            aggz aggzVar = this.e;
            Collection collection = (Collection) aggzVar.a.get(this.a);
            if (collection != null) {
                this.b = collection;
            }
        }
    }

    final void c() {
        aggt aggtVar = this.c;
        if (aggtVar != null) {
            aggtVar.c();
        } else if (this.b.isEmpty()) {
            aggz aggzVar = this.e;
            aggzVar.a.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size != 0) {
            this.b.clear();
            this.e.b -= size;
            c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new aggs(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.b.remove(obj);
        if (zRemove) {
            this.e.b--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }
}
