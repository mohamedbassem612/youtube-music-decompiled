package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aghi extends AbstractCollection implements agow {
    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.agow
    public final boolean add(Object obj) {
        f(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof agow)) {
            if (collection.isEmpty()) {
                return false;
            }
            return aguu.F(this, collection.iterator());
        }
        agow agowVar = (agow) collection;
        if (agowVar instanceof aghd) {
            aghd aghdVar = (aghd) agowVar;
            if (aghdVar.isEmpty()) {
                return false;
            }
            for (int iA = aghdVar.a.a(); iA >= 0; iA = aghdVar.a.e(iA)) {
                f(aghdVar.a.g(iA), aghdVar.a.c(iA));
            }
        } else {
            if (agowVar.isEmpty()) {
                return false;
            }
            for (agox agoxVar : agowVar.j()) {
                f(agoxVar.a, agoxVar.a());
            }
        }
        return true;
    }

    public abstract int b();

    public int c(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.agow
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    public abstract Iterator d();

    public abstract Iterator e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return agvp.j(this, obj);
    }

    public void f(Object obj, int i) {
        throw null;
    }

    public boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return new agoz(this).hashCode();
    }

    @Override // defpackage.agow
    public final Set i() {
        return new agoy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return new agoz(this).isEmpty();
    }

    @Override // defpackage.agow
    public final Set j() {
        return new agoz(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.agow
    public final boolean remove(Object obj) {
        return c(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof agow) {
            collection = ((agow) collection).i();
        }
        return i().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof agow) {
            collection = ((agow) collection).i();
        }
        return i().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return new agoz(this).toString();
    }
}
