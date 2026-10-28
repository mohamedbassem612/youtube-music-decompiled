package defpackage;

import j$.util.Spliterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awne extends awna implements List, j$.util.List, awrp {
    protected awne() {
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(Object obj) {
        a.aF();
    }

    public final void addLast(Object obj) {
        a.aF();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            Collection collection = (Collection) obj;
            collection.getClass();
            if (size() == collection.size()) {
                Iterator it = collection.iterator();
                Iterator<E> it2 = iterator();
                while (it2.hasNext()) {
                    if (!awrc.c(it2.next(), it.next())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (awrc.c(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new awnb(this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (awrc.c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new awnc(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeFirst() {
        return a.bs();
    }

    public final Object removeLast() {
        return a.bs();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.awna, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.List.CC.$default$spliterator(this);
    }

    public List subList(int i, int i2) {
        return new awnd(this, i, i2);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new awnc(this, i);
    }
}
